package bili.bl;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.TextUtils;
import com.bilibili.bilibililive.im.business.message.ImageMessage;
import com.bilibili.bilibililive.im.business.message.ImageMessage.Content;
import com.bilibili.bilibililive.im.business.model.BaseTypedMessage;
import com.bilibili.bilibililive.im.business.model.MessageType;
import com.bilibili.bilibililive.im.dao.exception.IMDBException;
import com.bilibili.bilibililive.im.entity.ChatGroup;
import com.bilibili.bilibililive.im.entity.ChatMessage;
import com.bilibili.bilibililive.im.entity.Conversation;
import com.bilibili.bilibililive.im.entity.GroupMember;
import com.bilibili.bilibililive.im.entity.GroupMemberInfo;
import com.bilibili.bilibililive.im.entity.User;
import com.bilibili.bilibililive.im.protobuf.conveyor.BasePBConveyor;
import com.bilibili.upper.videoup.model.TaskStep;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.greenrobot.eventbus.EventBus;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class ceb extends cea implements cdw, cdz {
    private static final Object a = new Object();
    private HandlerThread b;
    private Handler c;
    private List<ChatMessage> d = new LinkedList();
    private Callback e = new Callback(this) {
        final /* synthetic */ ceb a;

        {
            this.a = r1;
        }

        public boolean handleMessage(Message message) {
            synchronized (ceb.a) {
                try {
                    this.a.a(this.a.d);
                } catch (Exception e) {
                    cgz.a(hae.a(new byte[]{(byte) 64, (byte) 125, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107})).c(hae.a(new byte[]{(byte) 109, (byte) 100, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 70, (byte) 106, (byte) 107, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 72, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 96, (byte) 125, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63}) + e.getMessage());
                }
                this.a.d.clear();
            }
            return true;
        }
    };
    private b f;

    /* compiled from: BL */
    public interface a {
        BaseTypedMessage a();
    }

    /* compiled from: BL */
    public interface b {
        void a(int i);
    }

    public ceb(cdn bl_cdn) {
        super(bl_cdn);
    }

    public static ceb c() {
        return cdn.b().c();
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public void d() {
        h();
        this.b = new HandlerThread(hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 100, (byte) 113, (byte) 104, (byte) 100, (byte) 107, (byte) 100, (byte) 98, (byte) 96, (byte) 119, (byte) 37, (byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 119, (byte) 96, (byte) 102, (byte) 96, (byte) 108, (byte) 115, (byte) 96, (byte) 119}));
        this.b.start();
        this.c = new Handler(this.b.getLooper(), this.e);
    }

    public void e() {
        if (this.f != null) {
            this.f.a(cdk.a().c());
        }
    }

    public void a(final ChatMessage chatMessage) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceb b;

            public void run() {
                if (this.b.b().j()) {
                    cej.a(chatMessage);
                    if (chatMessage.getErrCode() == 21001) {
                        cgk.a(chatMessage, true);
                    }
                    Conversation a = cee.c().a(chatMessage.getConversationType(), chatMessage.getReceiveId());
                    if (!(a == null || a.getLastMsg() == null || a.getLastMsg().getDbMessage().getId() == null || !a.getLastMsg().getDbMessage().getId().equals(chatMessage.getId()))) {
                        a.getLastMsg().getDbMessage().setMsgKey(chatMessage.getMsgKey());
                    }
                    EventBus.getDefault().post(new cfa(chatMessage));
                }
            }
        });
    }

    public void a(final ArrayList<ChatMessage> arrayList) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceb b;

            public void run() {
                cej.a(this.b.a(), arrayList);
            }
        });
        synchronized (a) {
            if (this.d.size() != 0 || arrayList.size() >= 5) {
                this.d.addAll(arrayList);
                if (!(this.c == null || this.c.hasMessages(1))) {
                    this.c.sendEmptyMessageDelayed(1, 1000);
                }
            } else {
                b().a(new Runnable(this) {
                    final /* synthetic */ ceb b;

                    public void run() {
                        this.b.a(arrayList);
                    }
                });
            }
        }
    }

    private void a(List<ChatMessage> list) {
        if (b().j()) {
            ArrayList arrayList = new ArrayList(list.size());
            HashMap hashMap = new HashMap();
            for (ChatMessage chatMessage : list) {
                arrayList.add(cdq.a(chatMessage));
                List atUidList = chatMessage.getAtUidList();
                String b = cdq.b(chatMessage);
                if (!(atUidList == null || atUidList.size() == 0 || !atUidList.contains(Long.valueOf(cdn.b().h())) || hashMap.containsKey(b))) {
                    hashMap.put(b, chatMessage.getId());
                }
            }
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BaseTypedMessage baseTypedMessage = (BaseTypedMessage) it.next();
                String b2 = cdq.b(baseTypedMessage.getDbMessage());
                if (baseTypedMessage.getDbMessage().isConversationMessage()) {
                    if (!hashMap3.containsKey(b2)) {
                        hashMap3.put(b2, new ArrayList());
                    }
                    ((ArrayList) hashMap3.get(b2)).add(baseTypedMessage);
                }
                if (!hashMap2.containsKey(b2)) {
                    hashMap2.put(b2, new ArrayList());
                }
                ((ArrayList) hashMap2.get(b2)).add(baseTypedMessage);
            }
            List linkedList = new LinkedList();
            for (Entry entry : hashMap3.entrySet()) {
                a((ArrayList) entry.getValue(), (String) entry.getKey(), (Long) hashMap.get(entry.getKey()), linkedList);
            }
            cek.c().b(linkedList);
            for (Entry entry2 : hashMap2.entrySet()) {
                a((ArrayList) entry2.getValue(), (String) entry2.getKey());
            }
            cee.d();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ ceb a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.f != null) {
                        this.a.f.a(cdk.a().c());
                    }
                }
            });
        }
    }

    public void b(final ChatMessage chatMessage) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceb b;

            public void run() {
                if (chatMessage.getStatus() == 2) {
                    cgk.a(Long.valueOf(Long.parseLong(chatMessage.getContent())));
                    BaseTypedMessage a = cdq.a(chatMessage);
                    if (a instanceof cfe) {
                        this.b.a((cfe) a);
                    }
                }
                EventBus.getDefault().post(new cer(chatMessage));
            }
        });
    }

    public void b(final ArrayList<ChatMessage> arrayList) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceb b;

            public void run() {
                ArrayList a = cej.a(this.b.a(), arrayList);
                if (a.size() != 0) {
                    HashMap hashMap = new HashMap();
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        ChatMessage chatMessage = (ChatMessage) it.next();
                        String b = cdq.b(chatMessage);
                        BaseTypedMessage a2 = cdq.a(chatMessage);
                        if (a2 instanceof cfe) {
                            if (!hashMap.containsKey(b)) {
                                hashMap.put(b, new ArrayList());
                            }
                            ((ArrayList) hashMap.get(b)).add((cfe) a2);
                        }
                    }
                    boolean z = false;
                    for (Entry entry : hashMap.entrySet()) {
                        cey bl_cey = new cey();
                        bl_cey.a = (ArrayList) entry.getValue();
                        bl_cey.b = (String) entry.getKey();
                        cgz.a((Object) this).b("\u64a4\u56de\uff1a" + bl_cey.b);
                        EventBus.getDefault().post(bl_cey);
                        z = this.b.a((cfe) bl_cey.a.get(bl_cey.a.size() - 1));
                    }
                    if (z) {
                        cee.d();
                    }
                }
            }
        });
    }

    private boolean a(cfe bl_cfe) {
        ChatMessage dbMessage = bl_cfe.getDbMessage();
        Conversation a = cee.c().a(dbMessage.getConversationType(), dbMessage.getReceiveId());
        if (a == null || a.getLastMsg() == null || a.getLastMsg().getDbMessage().getMsgKey() != bl_cfe.a()) {
            return false;
        }
        ChatMessage dbMessage2 = a.getLastMsg().getDbMessage();
        dbMessage2.setType(5);
        a.setLastMsg(cdq.a(dbMessage2));
        return true;
    }

    private void a(ArrayList<BaseTypedMessage> arrayList, String str, Long l, List<Long> list) {
        if (arrayList.size() != 0) {
            BaseTypedMessage baseTypedMessage = (BaseTypedMessage) arrayList.get(arrayList.size() - 1);
            Conversation b = cee.c().b(str);
            if (b != null) {
                b.setLastMsg(baseTypedMessage);
                if (!b.isShow()) {
                    b.setIsShow(true);
                }
                list.add(Long.valueOf(baseTypedMessage.getSenderUid()));
            }
            if (baseTypedMessage.getMessageType() != MessageType.UNKNOWN && baseTypedMessage.getDbMessage() != null) {
                cdk.a().a(str, baseTypedMessage.getDbMessage(), arrayList.size(), l);
            }
        }
    }

    private void a(ArrayList<BaseTypedMessage> arrayList, String str) {
        cez bl_cez = new cez();
        bl_cez.a = arrayList;
        bl_cez.b = str;
        EventBus.getDefault().post(bl_cez);
    }

    public void a(long j, int i, long j2) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setContent(j + BuildConfig.VERSION_NAME);
        chatMessage.setReceiveId(j2);
        chatMessage.setSenderUid(b().l());
        chatMessage.setConversationType(i);
        chatMessage.setReceiveId(j2);
        chatMessage.setTimestamp(new Date());
        chatMessage.setClientSeqId(BasePBConveyor.generatorReqId());
        chatMessage.setType(5);
        b().a(chatMessage);
    }

    public void a(ImageMessage imageMessage, int i, long j, Subscriber<BaseTypedMessage> subscriber) {
        List linkedList = new LinkedList();
        linkedList.add(imageMessage);
        a(linkedList, i, j, (Subscriber) subscriber);
    }

    public void a(List<ImageMessage> list, int i, long j, Subscriber<BaseTypedMessage> subscriber) {
        final List<ImageMessage> list2 = list;
        final int i2 = i;
        final long j2 = j;
        Observable.create(new OnSubscribe<BaseTypedMessage>(this) {
            final /* synthetic */ ceb d;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super BaseTypedMessage> subscriber) {
                for (BaseTypedMessage baseTypedMessage : list2) {
                    Content content = (Content) baseTypedMessage.getContent();
                    this.d.a(baseTypedMessage, i2, j2);
                    subscriber.onNext(baseTypedMessage);
                }
                for (ImageMessage imageMessage : list2) {
                    content = (Content) imageMessage.getContent();
                    ChatMessage dbMessage = imageMessage.getDbMessage();
                    try {
                        if (content.c()) {
                            File file = new File(content.uri);
                            if (content.a().toLowerCase().equals("gif") || content.original == 1) {
                                content.a(file.length());
                            } else {
                                cmr a = cms.a(this.d.a(), file);
                                file = a.a();
                                content.a(a.b());
                                content.height = a.d();
                                content.width = a.c();
                            }
                            String str = content.uri;
                            content.uri = cde.a(this.d.a(), file);
                            if (TextUtils.isEmpty(content.uri)) {
                                throw new IllegalArgumentException(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 43}));
                            }
                            imageMessage.refreshDbContent();
                            cgk.b(imageMessage.getDbMessage());
                            content.uri = str;
                        }
                        this.d.b().a(dbMessage);
                        BLog.v(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 107, (byte) 97, (byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 59}) + dbMessage.getContent());
                    } catch (Throwable e) {
                        ibn.a(e);
                        cgk.a(imageMessage.getDbMessage(), false);
                        EventBus.getDefault().post(new cfa(imageMessage.getDbMessage()));
                    }
                }
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(List<cff> list, boolean z, Subscriber<BaseTypedMessage> subscriber) {
        List a = cgp.a(1);
        if (a.size() == 0) {
            subscriber.onError(new IMDBException(hae.a(new byte[]{(byte) 76, (byte) 105, (byte) 105, (byte) 96, (byte) 98, (byte) 100, (byte) 105, (byte) 37, (byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 63, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 65, (byte) 103, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 43, (byte) 98, (byte) 96, (byte) 113, (byte) 72, (byte) 124, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 71, (byte) 124, (byte) 87, (byte) 106, (byte) 105, (byte) 96, (byte) 45, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 72, (byte) 96, (byte) 104, (byte) 103, (byte) 96, (byte) 119, (byte) 43, (byte) 87, (byte) 74, (byte) 73, (byte) 64, (byte) 90, (byte) 74, (byte) 82, (byte) 75, (byte) 64, (byte) 87, (byte) 44, (byte) 37, (byte) 86, (byte) 76, (byte) 95, (byte) 64, (byte) 37, (byte) 56, (byte) 37, (byte) 53})));
            subscriber.onCompleted();
            return;
        }
        a(list, z, false, a, subscriber);
    }

    public void a(List<cff> list, boolean z, boolean z2, List<ChatGroup> list2, Subscriber<BaseTypedMessage> subscriber) {
        final List<ChatGroup> list3 = list2;
        final List<cff> list4 = list;
        final boolean z3 = z;
        final boolean z4 = z2;
        Observable.create(new OnSubscribe<BaseTypedMessage>(this) {
            final /* synthetic */ ceb e;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super BaseTypedMessage> subscriber) {
                Map hashMap = new HashMap();
                for (ChatGroup chatGroup : list3) {
                    for (cff bl_cff : list4) {
                        BaseTypedMessage a = cdq.a(bl_cff.c, bl_cff.e, bl_cff.f, bl_cff.g, z3, z4);
                        this.e.a(a, 2, chatGroup.getId());
                        List list = (List) hashMap.get(bl_cff);
                        if (list == null) {
                            list = new LinkedList();
                        }
                        list.add(a);
                        hashMap.put(bl_cff, list);
                        subscriber.onNext(a);
                    }
                }
                subscriber.onCompleted();
                for (cff bl_cff2 : list4) {
                    String str = BuildConfig.VERSION_NAME;
                    cmr bl_cmr = null;
                    try {
                        File file = new File(bl_cff2.c);
                        if (!(bl_cff2.g == null || bl_cff2.g.toLowerCase().equals("gif") || z4)) {
                            bl_cmr = cms.a(this.e.a(), file);
                            file = bl_cmr.a();
                        }
                        Object a2 = cde.a(this.e.a(), file);
                        if (TextUtils.isEmpty(a2)) {
                            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 43}));
                        }
                        for (ImageMessage imageMessage : (List) hashMap.get(bl_cff2)) {
                            try {
                                ((Content) imageMessage.getContent()).uri = a2;
                                if (bl_cmr != null) {
                                    ((Content) imageMessage.getContent()).height = bl_cmr.d();
                                    ((Content) imageMessage.getContent()).width = bl_cmr.c();
                                    ((Content) imageMessage.getContent()).a(bl_cmr.b());
                                }
                                imageMessage.refreshDbContent();
                                cgk.b(imageMessage.getDbMessage());
                                this.e.b().a(imageMessage.getDbMessage());
                            } catch (Throwable e) {
                                ibn.a(e);
                                cgk.a(imageMessage.getDbMessage(), false);
                            }
                        }
                    } catch (Throwable e2) {
                        ibn.a(e2);
                        for (ImageMessage imageMessage2 : (List) hashMap.get(bl_cff2)) {
                            cgk.a(imageMessage2.getDbMessage(), false);
                        }
                        return;
                    }
                }
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(BaseTypedMessage baseTypedMessage, int i, long j, Subscriber<BaseTypedMessage> subscriber) {
        cgz.a((Object) this).b(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 107, (byte) 97, (byte) 72, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96, (byte) 63}) + baseTypedMessage.getMessageType() + "  " + hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 102, (byte) 96, (byte) 108, (byte) 115, (byte) 96, (byte) 119, (byte) 76, (byte) 97, (byte) 63}) + baseTypedMessage.getDbMessage().getReceiveId() + hae.a(new byte[]{(byte) 37, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 63}) + baseTypedMessage.getContentString());
        final BaseTypedMessage baseTypedMessage2 = baseTypedMessage;
        final int i2 = i;
        final long j2 = j;
        Observable.create(new OnSubscribe<BaseTypedMessage>(this) {
            final /* synthetic */ ceb d;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super BaseTypedMessage> subscriber) {
                this.d.b().a(this.d.a(baseTypedMessage2, i2, j2));
                subscriber.onNext(baseTypedMessage2);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(a aVar, Subscriber<BaseTypedMessage> subscriber) {
        List a = cgp.a(1);
        if (a.size() == 0) {
            subscriber.onError(new IMDBException(hae.a(new byte[]{(byte) 76, (byte) 105, (byte) 105, (byte) 96, (byte) 98, (byte) 100, (byte) 105, (byte) 37, (byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 63, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 65, (byte) 103, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 43, (byte) 98, (byte) 96, (byte) 113, (byte) 72, (byte) 124, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 71, (byte) 124, (byte) 87, (byte) 106, (byte) 105, (byte) 96, (byte) 45, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 72, (byte) 96, (byte) 104, (byte) 103, (byte) 96, (byte) 119, (byte) 43, (byte) 87, (byte) 74, (byte) 73, (byte) 64, (byte) 90, (byte) 74, (byte) 82, (byte) 75, (byte) 64, (byte) 87, (byte) 44, (byte) 37, (byte) 86, (byte) 76, (byte) 95, (byte) 64, (byte) 37, (byte) 56, (byte) 37, (byte) 53})));
            subscriber.onCompleted();
            return;
        }
        a(aVar, a, (Subscriber) subscriber);
    }

    public void a(final a aVar, final List<ChatGroup> list, Subscriber<BaseTypedMessage> subscriber) {
        if (list == null || list.size() == 0) {
            subscriber.onError(new IMDBException(hae.a(new byte[]{(byte) 76, (byte) 105, (byte) 105, (byte) 96, (byte) 98, (byte) 100, (byte) 105, (byte) 37, (byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 63, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 65, (byte) 103, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 43, (byte) 98, (byte) 96, (byte) 113, (byte) 72, (byte) 124, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 71, (byte) 124, (byte) 87, (byte) 106, (byte) 105, (byte) 96, (byte) 45, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 72, (byte) 96, (byte) 104, (byte) 103, (byte) 96, (byte) 119, (byte) 43, (byte) 87, (byte) 74, (byte) 73, (byte) 64, (byte) 90, (byte) 74, (byte) 82, (byte) 75, (byte) 64, (byte) 87, (byte) 44, (byte) 37, (byte) 86, (byte) 76, (byte) 95, (byte) 64, (byte) 37, (byte) 56, (byte) 37, (byte) 53})));
            subscriber.onCompleted();
            return;
        }
        Observable.create(new OnSubscribe<BaseTypedMessage>(this) {
            final /* synthetic */ ceb c;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super BaseTypedMessage> subscriber) {
                for (ChatGroup chatGroup : list) {
                    BaseTypedMessage a = aVar.a();
                    this.c.b().a(this.c.a(a, 2, chatGroup.getId()));
                    subscriber.onNext(a);
                }
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(final String str, final List<ChatGroup> list, Subscriber<BaseTypedMessage> subscriber) {
        if (list != null && list.size() != 0) {
            Observable.create(new OnSubscribe<BaseTypedMessage>(this) {
                final /* synthetic */ ceb c;

                public /* synthetic */ void call(Object obj) {
                    a((Subscriber) obj);
                }

                public void a(Subscriber<? super BaseTypedMessage> subscriber) {
                    for (ChatGroup chatGroup : list) {
                        BaseTypedMessage a = cdq.a(str);
                        this.c.b().a(this.c.a(a, 2, chatGroup.getId()));
                        subscriber.onNext(a);
                    }
                    subscriber.onCompleted();
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
        }
    }

    private ChatMessage a(BaseTypedMessage baseTypedMessage, int i, long j) {
        ChatMessage dbMessage = baseTypedMessage.getDbMessage();
        dbMessage.setSenderUid(b().l());
        dbMessage.setConversationType(i);
        dbMessage.setReceiveId(j);
        dbMessage.setStatus(1);
        dbMessage.setTimestamp(new Date());
        dbMessage.setContent(baseTypedMessage.getContentString());
        dbMessage.setClientSeqId(BasePBConveyor.generatorReqId());
        cgk.a(dbMessage);
        Conversation a = cee.c().a(i, j);
        cee.c().a(baseTypedMessage, a);
        switch (a.getType()) {
            case TaskStep.TASK_STEP_TWO /*2*/:
                a(baseTypedMessage.getDbMessage(), a.getGroup());
                break;
        }
        return dbMessage;
    }

    public void b(BaseTypedMessage baseTypedMessage, int i, long j, Subscriber<BaseTypedMessage> subscriber) {
        cgk.b(baseTypedMessage.getId());
        baseTypedMessage.getDbMessage().setId(null);
        if (baseTypedMessage instanceof ImageMessage) {
            a((ImageMessage) baseTypedMessage, i, j, (Subscriber) subscriber);
        } else {
            a(baseTypedMessage, i, j, (Subscriber) subscriber);
        }
    }

    public void f() {
        cgk.a();
    }

    public void a(Conversation conversation, int i, long j, Subscriber<List<BaseTypedMessage>> subscriber) {
        final long j2 = j;
        final Conversation conversation2 = conversation;
        final int i2 = i;
        Observable.create(new OnSubscribe<List<BaseTypedMessage>>(this) {
            final /* synthetic */ ceb d;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<BaseTypedMessage>> subscriber) {
                List a;
                if (j2 == 0) {
                    a = cgk.a(conversation2.getType(), conversation2.getReceiveId(), i2);
                } else {
                    a = cgk.a(conversation2.getType(), conversation2.getReceiveId(), i2, j2);
                }
                subscriber.onNext(this.d.a(a, conversation2));
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.from(b().a())).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    @NonNull
    private List<BaseTypedMessage> a(List<ChatMessage> list, Conversation conversation) {
        List<BaseTypedMessage> arrayList = new ArrayList(list.size());
        cgz.a(hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 72, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96, (byte) 118})).b(list.toString());
        for (ChatMessage a : list) {
            try {
                arrayList.add(cdq.a(a));
            } catch (Throwable e) {
                ibn.a(e);
            }
        }
        if (conversation.getType() == 2) {
            try {
                a((List) list, conversation.getGroup());
            } catch (Throwable e2) {
                cme.a(e2);
                ibn.a(e2);
            }
        }
        return arrayList;
    }

    public void a(Conversation conversation, long j, long j2, Subscriber<List<BaseTypedMessage>> subscriber) {
        final long j3 = j2;
        final long j4 = j;
        final Conversation conversation2 = conversation;
        Observable.create(new OnSubscribe<List<BaseTypedMessage>>(this) {
            final /* synthetic */ ceb d;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<BaseTypedMessage>> subscriber) {
                if (j3 < 0) {
                    subscriber.onError(new Exception(hae.a(new byte[]{(byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113, (byte) 72, (byte) 118, (byte) 98, (byte) 76, (byte) 97, (byte) 37, (byte) 57, (byte) 37, (byte) 53})));
                    subscriber.onCompleted();
                } else if (j4 == 0) {
                    subscriber.onError(new Exception(hae.a(new byte[]{(byte) 113, (byte) 106, (byte) 117, (byte) 72, (byte) 118, (byte) 98, (byte) 76, (byte) 97, (byte) 37, (byte) 56, (byte) 56, (byte) 37, (byte) 53})));
                    subscriber.onCompleted();
                } else {
                    subscriber.onNext(this.d.a(cgk.a(conversation2.getType(), conversation2.getReceiveId(), 2000, j4, j3), conversation2));
                    subscriber.onCompleted();
                }
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(final Conversation conversation, Subscriber<List<ImageMessage>> subscriber) {
        Observable.create(new OnSubscribe<List<ImageMessage>>(this) {
            final /* synthetic */ ceb b;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<ImageMessage>> subscriber) {
                List linkedList = new LinkedList();
                List<ChatMessage> a = cgk.a(conversation.getType(), conversation.getReceiveId());
                if (a != null) {
                    for (ChatMessage a2 : a) {
                        BaseTypedMessage a3 = cdq.a(a2);
                        if (a3 instanceof ImageMessage) {
                            linkedList.add((ImageMessage) a3);
                        }
                    }
                    subscriber.onNext(linkedList);
                }
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(final Conversation conversation, final int i, final int i2, Subscriber<List<BaseTypedMessage>> subscriber) {
        Observable.create(new OnSubscribe<List<BaseTypedMessage>>(this) {
            final /* synthetic */ ceb d;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<BaseTypedMessage>> subscriber) {
                List<ChatMessage> a = cgk.a(conversation.getType(), conversation.getReceiveId(), i, i2);
                List arrayList = new ArrayList(a.size());
                cgz.a(hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 66, (byte) 119, (byte) 106, (byte) 112, (byte) 117, (byte) 72, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96, (byte) 118})).b(a.toString());
                for (ChatMessage a2 : a) {
                    try {
                        arrayList.add(cdq.a(a2));
                    } catch (Throwable e) {
                        ibn.a(e);
                    }
                }
                if (conversation.getType() == 2) {
                    try {
                        this.d.a((List) a, conversation.getGroup());
                    } catch (Throwable e2) {
                        ibn.a(e2);
                    }
                }
                subscriber.onNext(arrayList);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void b(final Conversation conversation, Subscriber<Long> subscriber) {
        Observable.create(new OnSubscribe<Long>(this) {
            final /* synthetic */ ceb b;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super Long> subscriber) {
                subscriber.onNext(Long.valueOf(cgk.b(conversation.getType(), conversation.getReceiveId())));
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void a(ChatMessage chatMessage, ChatGroup chatGroup) {
        if (chatMessage != null) {
            List linkedList = new LinkedList();
            linkedList.add(chatMessage);
            a(linkedList, chatGroup);
        }
    }

    public void g() {
        b().a(new Runnable(this) {
            final /* synthetic */ ceb a;

            {
                this.a = r1;
            }

            public void run() {
                cgk.b();
                cdk.a().d();
                cdk.a().e();
            }
        });
    }

    public void a(long j, Action1<Boolean> action1) {
        cgk.a(j);
        action1.call(Boolean.valueOf(true));
    }

    public void b(final long j, Action1<Boolean> action1) {
        cgk.c(j);
        action1.call(Boolean.valueOf(true));
        Observable.just(Long.valueOf(j)).map(new Func1<Long, Boolean>(this) {
            final /* synthetic */ ceb b;

            public /* synthetic */ Object call(Object obj) {
                return a((Long) obj);
            }

            public Boolean a(Long l) {
                cgk.c(j);
                return Boolean.valueOf(true);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(action1);
    }

    public void a(List<ChatMessage> list, ChatGroup chatGroup) {
        if (chatGroup != null) {
            List linkedList = new LinkedList();
            List linkedList2 = new LinkedList();
            Map hashMap = new HashMap();
            Map hashMap2 = new HashMap();
            Map hashMap3 = new HashMap();
            for (ChatMessage chatMessage : list) {
                if (chatMessage.isUserMessage()) {
                    long senderUid = chatMessage.getSenderUid();
                    User user = (User) hashMap.get(Long.valueOf(senderUid));
                    if (user == null) {
                        user = cgt.b(senderUid);
                    }
                    if (user == null) {
                        user = new User();
                        user.setId(senderUid);
                    }
                    linkedList.add(user);
                    hashMap.put(Long.valueOf(senderUid), user);
                    chatMessage.setSender(user);
                    GroupMember groupMember = (GroupMember) hashMap2.get(Long.valueOf(senderUid));
                    if (groupMember == null) {
                        groupMember = cgp.a(chatGroup.getId(), senderUid);
                    }
                    if (groupMember == null) {
                        groupMember = new GroupMember();
                        groupMember.setUserId(senderUid);
                        groupMember.setGroupId(chatGroup.getId());
                        groupMember.setRole(3);
                    }
                    hashMap2.put(Long.valueOf(senderUid), groupMember);
                    chatMessage.setSenderRole(groupMember);
                    GroupMemberInfo groupMemberInfo = (GroupMemberInfo) hashMap3.get(Long.valueOf(senderUid));
                    if (groupMemberInfo == null) {
                        groupMemberInfo = cgp.b(chatGroup.getId(), senderUid);
                    }
                    if (groupMemberInfo == null) {
                        groupMemberInfo = new GroupMemberInfo();
                        groupMemberInfo.setUserId(senderUid);
                        groupMemberInfo.setGroupId(chatGroup.getId());
                    }
                    chatMessage.setSenderInGroup(groupMemberInfo);
                    hashMap3.put(Long.valueOf(senderUid), groupMemberInfo);
                    if (!linkedList2.contains(groupMemberInfo)) {
                        linkedList2.add(groupMemberInfo);
                    }
                }
            }
            cek.c().a(linkedList2, chatGroup);
            cek.c().a(linkedList);
        }
    }

    public void a(final List<BaseTypedMessage> list, final ChatGroup chatGroup, Subscriber<List<BaseTypedMessage>> subscriber) {
        Observable.create(new OnSubscribe<List<BaseTypedMessage>>(this) {
            final /* synthetic */ ceb c;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<BaseTypedMessage>> subscriber) {
                List linkedList = new LinkedList();
                for (BaseTypedMessage baseTypedMessage : list) {
                    if (!(baseTypedMessage.getDbMessage() == null || !baseTypedMessage.getDbMessage().isUserMessage() || baseTypedMessage.getDbMessage().getType() == 5)) {
                        linkedList.add(baseTypedMessage.getDbMessage());
                    }
                }
                this.c.a(linkedList, chatGroup);
                subscriber.onNext(list);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public void h() {
        if (this.b != null && this.b.isAlive()) {
            this.c.removeMessages(1);
            this.b.quit();
            this.b = null;
            this.c = null;
            synchronized (a) {
                if (this.d != null) {
                    this.d.clear();
                }
            }
        }
    }

    public void c(final long j, Action1<Void> action1) {
        Observable.create(new OnSubscribe<Void>(this) {
            final /* synthetic */ ceb b;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super Void> subscriber) {
                cgk.b(j);
                subscriber.onNext(null);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(action1);
    }

    public void a(Conversation conversation, Action1<Boolean> action1) {
        if (conversation.getType() == 2) {
            a(conversation.getReceiveId(), (Action1) action1);
        } else if (conversation.getType() == 1) {
            b(conversation.getReceiveId(), (Action1) action1);
        }
    }

    public List<Long> a(int i, long j) {
        List<ChatMessage> b = cgk.b(i, j, 10);
        Collections.reverse(b);
        List<Long> linkedList = new LinkedList();
        for (ChatMessage msgKey : b) {
            linkedList.add(Long.valueOf(msgKey.getMsgKey()));
        }
        return linkedList;
    }
}
