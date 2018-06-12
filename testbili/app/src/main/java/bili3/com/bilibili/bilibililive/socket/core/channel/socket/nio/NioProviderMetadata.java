package bili3.com.bilibili.bilibililive.socket.core.channel.socket.nio;

import bl.hae;
import com.bilibili.bilibililive.socket.core.logging.InternalLogger;
import com.bilibili.bilibililive.socket.core.logging.InternalLoggerFactory;
import com.bilibili.bilibililive.socket.core.util.internal.SystemPropertyUtil;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: BL */
class NioProviderMetadata {
    static final int CONSTRAINT_LEVEL;
    private static final String CONSTRAINT_LEVEL_PROPERTY = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 118, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 113, (byte) 43, (byte) 102, (byte) 106, (byte) 119, (byte) 96, (byte) 43, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 43, (byte) 118, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 113, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105});
    private static final String OLD_CONSTRAINT_LEVEL_PROPERTY = hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 118, (byte) 43, (byte) 118, (byte) 117, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105});
    static final InternalLogger logger = InternalLoggerFactory.getInstance(NioProviderMetadata.class);

    /* compiled from: BL */
    static final class ConstraintLevelAutodetector {
        ConstraintLevelAutodetector() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int autodetect() {
            /*
            r14 = this;
            r13 = 37;
            r12 = 35;
            r4 = 0;
            r5 = 1;
            r6 = java.util.concurrent.Executors.newCachedThreadPool();
            r0 = 0;
            r2 = 0;
            r3 = java.nio.channels.ServerSocketChannel.open();	 Catch:{ Throwable -> 0x02b9, all -> 0x02a9 }
            r0 = r3.socket();	 Catch:{ Throwable -> 0x0066, all -> 0x02af }
            r1 = new java.net.InetSocketAddress;	 Catch:{ Throwable -> 0x0066, all -> 0x02af }
            r7 = 0;
            r1.<init>(r7);	 Catch:{ Throwable -> 0x0066, all -> 0x02af }
            r0.bind(r1);	 Catch:{ Throwable -> 0x0066, all -> 0x02af }
            r0 = 0;
            r3.configureBlocking(r0);	 Catch:{ Throwable -> 0x0066, all -> 0x02af }
            r1 = new com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata$SelectorLoop;	 Catch:{ Throwable -> 0x00b9, all -> 0x02af }
            r1.<init>();	 Catch:{ Throwable -> 0x00b9, all -> 0x02af }
            r0 = r1.selector;	 Catch:{ Throwable -> 0x010e, all -> 0x01d7 }
            r2 = 0;
            r3.register(r0, r2);	 Catch:{ Throwable -> 0x010e, all -> 0x01d7 }
            r0 = r1.selector;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r2 = r3.keyFor(r0);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r6.execute(r1);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r0 = r4;
        L_0x0036:
            r7 = 10;
            if (r0 >= r7) goto L_0x02de;
        L_0x003a:
            r7 = r1.selecting;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            if (r7 != 0) goto L_0x0163;
        L_0x003e:
            java.lang.Thread.yield();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            goto L_0x003a;
        L_0x0042:
            r0 = move-exception;
            r2 = r3;
        L_0x0044:
            r0 = -1;
            if (r2 == 0) goto L_0x004a;
        L_0x0047:
            r2.close();	 Catch:{ Throwable -> 0x0247 }
        L_0x004a:
            if (r1 == 0) goto L_0x0065;
        L_0x004c:
            r1.done = r5;
            r6.shutdownNow();	 Catch:{ NullPointerException -> 0x029d }
        L_0x0051:
            r2 = r1.selector;	 Catch:{ Throwable -> 0x02b3 }
            r2.wakeup();	 Catch:{ Throwable -> 0x02b3 }
            r2 = 1;
            r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x02b6 }
            r2 = r6.awaitTermination(r2, r4);	 Catch:{ InterruptedException -> 0x02b6 }
            if (r2 == 0) goto L_0x0051;
        L_0x0060:
            r1 = r1.selector;	 Catch:{ Throwable -> 0x0258 }
            r1.close();	 Catch:{ Throwable -> 0x0258 }
        L_0x0065:
            return r0;
        L_0x0066:
            r0 = move-exception;
            r1 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r4 = 39;
            r4 = new byte[r4];	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 106, 107, 99, 108, 98, 112, 119, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r4 = bl.hae.a(r4);	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r1.warn(r4, r0);	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r0 = -1;
            if (r3 == 0) goto L_0x007d;
        L_0x007a:
            r3.close();	 Catch:{ Throwable -> 0x00a9 }
        L_0x007d:
            if (r2 == 0) goto L_0x0065;
        L_0x007f:
            r2.done = r5;
            r6.shutdownNow();	 Catch:{ NullPointerException -> 0x028b }
        L_0x0084:
            r1 = r2.selector;	 Catch:{ Throwable -> 0x02d5 }
            r1.wakeup();	 Catch:{ Throwable -> 0x02d5 }
            r4 = 1;
            r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x02d8 }
            r1 = r6.awaitTermination(r4, r1);	 Catch:{ InterruptedException -> 0x02d8 }
            if (r1 == 0) goto L_0x0084;
        L_0x0093:
            r1 = r2.selector;	 Catch:{ Throwable -> 0x0099 }
            r1.close();	 Catch:{ Throwable -> 0x0099 }
            goto L_0x0065;
        L_0x0099:
            r1 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r3 = new byte[r13];
            r3 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r3 = bl.hae.a(r3);
            r2.warn(r3, r1);
            goto L_0x0065;
        L_0x00a9:
            r1 = move-exception;
            r3 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r4 = new byte[r12];
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};
            r4 = bl.hae.a(r4);
            r3.warn(r4, r1);
            goto L_0x007d;
        L_0x00b9:
            r0 = move-exception;
            r1 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r4 = 36;
            r4 = new byte[r4];	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 106, 117, 96, 107, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r4 = bl.hae.a(r4);	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r1.warn(r4, r0);	 Catch:{ Throwable -> 0x02be, all -> 0x02af }
            r0 = -1;
            if (r3 == 0) goto L_0x00d0;
        L_0x00cd:
            r3.close();	 Catch:{ Throwable -> 0x00fe }
        L_0x00d0:
            if (r2 == 0) goto L_0x0065;
        L_0x00d2:
            r2.done = r5;
            r6.shutdownNow();	 Catch:{ NullPointerException -> 0x028e }
        L_0x00d7:
            r1 = r2.selector;	 Catch:{ Throwable -> 0x02cf }
            r1.wakeup();	 Catch:{ Throwable -> 0x02cf }
            r4 = 1;
            r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x02d2 }
            r1 = r6.awaitTermination(r4, r1);	 Catch:{ InterruptedException -> 0x02d2 }
            if (r1 == 0) goto L_0x00d7;
        L_0x00e6:
            r1 = r2.selector;	 Catch:{ Throwable -> 0x00ed }
            r1.close();	 Catch:{ Throwable -> 0x00ed }
            goto L_0x0065;
        L_0x00ed:
            r1 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r3 = new byte[r13];
            r3 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r3 = bl.hae.a(r3);
            r2.warn(r3, r1);
            goto L_0x0065;
        L_0x00fe:
            r1 = move-exception;
            r3 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r4 = new byte[r12];
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};
            r4 = bl.hae.a(r4);
            r3.warn(r4, r1);
            goto L_0x00d0;
        L_0x010e:
            r0 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r4 = 40;
            r4 = new byte[r4];	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 119, 96, 98, 108, 118, 113, 96, 119, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r4 = bl.hae.a(r4);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r2.warn(r4, r0);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r0 = -1;
            if (r3 == 0) goto L_0x0125;
        L_0x0122:
            r3.close();	 Catch:{ Throwable -> 0x0153 }
        L_0x0125:
            if (r1 == 0) goto L_0x0065;
        L_0x0127:
            r1.done = r5;
            r6.shutdownNow();	 Catch:{ NullPointerException -> 0x0291 }
        L_0x012c:
            r2 = r1.selector;	 Catch:{ Throwable -> 0x02c9 }
            r2.wakeup();	 Catch:{ Throwable -> 0x02c9 }
            r2 = 1;
            r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x02cc }
            r2 = r6.awaitTermination(r2, r4);	 Catch:{ InterruptedException -> 0x02cc }
            if (r2 == 0) goto L_0x012c;
        L_0x013b:
            r1 = r1.selector;	 Catch:{ Throwable -> 0x0142 }
            r1.close();	 Catch:{ Throwable -> 0x0142 }
            goto L_0x0065;
        L_0x0142:
            r1 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r3 = new byte[r13];
            r3 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r3 = bl.hae.a(r3);
            r2.warn(r3, r1);
            goto L_0x0065;
        L_0x0153:
            r2 = move-exception;
            r3 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r4 = new byte[r12];
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};
            r4 = bl.hae.a(r4);
            r3.warn(r4, r2);
            goto L_0x0125;
        L_0x0163:
            r8 = 50;
            java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x0294 }
        L_0x0168:
            r7 = r1.selecting;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            if (r7 == 0) goto L_0x003a;
        L_0x016c:
            r8 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r7 = r2.interestOps();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r7 = r7 | 16;
            r2.interestOps(r7);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r7 = r2.interestOps();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r7 = r7 & -17;
            r2.interestOps(r7);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r10 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r8 = r10 - r8;
            r10 = 500000000; // 0x1dcd6500 float:5.436748E-21 double:2.47032823E-315;
            r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r7 < 0) goto L_0x01c6;
        L_0x018f:
            r0 = r4;
        L_0x0190:
            if (r0 == 0) goto L_0x01ca;
        L_0x0192:
            r0 = r4;
        L_0x0193:
            if (r3 == 0) goto L_0x0198;
        L_0x0195:
            r3.close();	 Catch:{ Throwable -> 0x0236 }
        L_0x0198:
            if (r1 == 0) goto L_0x0065;
        L_0x019a:
            r1.done = r5;
            r6.shutdownNow();	 Catch:{ NullPointerException -> 0x029a }
        L_0x019f:
            r2 = r1.selector;	 Catch:{ Throwable -> 0x02c3 }
            r2.wakeup();	 Catch:{ Throwable -> 0x02c3 }
            r2 = 1;
            r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x02c6 }
            r2 = r6.awaitTermination(r2, r4);	 Catch:{ InterruptedException -> 0x02c6 }
            if (r2 == 0) goto L_0x019f;
        L_0x01ae:
            r1 = r1.selector;	 Catch:{ Throwable -> 0x01b5 }
            r1.close();	 Catch:{ Throwable -> 0x01b5 }
            goto L_0x0065;
        L_0x01b5:
            r1 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r3 = new byte[r13];
            r3 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r3 = bl.hae.a(r3);
            r2.warn(r3, r1);
            goto L_0x0065;
        L_0x01c6:
            r0 = r0 + 1;
            goto L_0x0036;
        L_0x01ca:
            r0 = r4;
        L_0x01cb:
            r7 = 10;
            if (r0 >= r7) goto L_0x02db;
        L_0x01cf:
            r7 = r1.selecting;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            if (r7 != 0) goto L_0x01f9;
        L_0x01d3:
            java.lang.Thread.yield();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            goto L_0x01cf;
        L_0x01d7:
            r0 = move-exception;
        L_0x01d8:
            if (r3 == 0) goto L_0x01dd;
        L_0x01da:
            r3.close();	 Catch:{ Throwable -> 0x0269 }
        L_0x01dd:
            if (r1 == 0) goto L_0x01f8;
        L_0x01df:
            r1.done = r5;
            r6.shutdownNow();	 Catch:{ NullPointerException -> 0x02a0 }
        L_0x01e4:
            r2 = r1.selector;	 Catch:{ Throwable -> 0x02a3 }
            r2.wakeup();	 Catch:{ Throwable -> 0x02a3 }
            r2 = 1;
            r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x02a6 }
            r2 = r6.awaitTermination(r2, r4);	 Catch:{ InterruptedException -> 0x02a6 }
            if (r2 == 0) goto L_0x01e4;
        L_0x01f3:
            r1 = r1.selector;	 Catch:{ Throwable -> 0x027a }
            r1.close();	 Catch:{ Throwable -> 0x027a }
        L_0x01f8:
            throw r0;
        L_0x01f9:
            r8 = 50;
            java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x0297 }
        L_0x01fe:
            r7 = r1.selecting;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            if (r7 == 0) goto L_0x01cf;
        L_0x0202:
            r8 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r7 = r2.interestOps();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            monitor-enter(r1);	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r10 = r1.selector;	 Catch:{ all -> 0x022d }
            r10.wakeup();	 Catch:{ all -> 0x022d }
            r10 = r7 | 16;
            r2.interestOps(r10);	 Catch:{ all -> 0x022d }
            r7 = r7 & -17;
            r2.interestOps(r7);	 Catch:{ all -> 0x022d }
            monitor-exit(r1);	 Catch:{ all -> 0x022d }
            r10 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
            r8 = r10 - r8;
            r10 = 500000000; // 0x1dcd6500 float:5.436748E-21 double:2.47032823E-315;
            r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r7 < 0) goto L_0x0230;
        L_0x0228:
            if (r4 == 0) goto L_0x0233;
        L_0x022a:
            r0 = r5;
            goto L_0x0193;
        L_0x022d:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x022d }
            throw r0;	 Catch:{ Throwable -> 0x0042, all -> 0x01d7 }
        L_0x0230:
            r0 = r0 + 1;
            goto L_0x01cb;
        L_0x0233:
            r0 = 2;
            goto L_0x0193;
        L_0x0236:
            r2 = move-exception;
            r3 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r4 = new byte[r12];
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};
            r4 = bl.hae.a(r4);
            r3.warn(r4, r2);
            goto L_0x0198;
        L_0x0247:
            r2 = move-exception;
            r3 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r4 = new byte[r12];
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};
            r4 = bl.hae.a(r4);
            r3.warn(r4, r2);
            goto L_0x004a;
        L_0x0258:
            r1 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r3 = new byte[r13];
            r3 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r3 = bl.hae.a(r3);
            r2.warn(r3, r1);
            goto L_0x0065;
        L_0x0269:
            r2 = move-exception;
            r3 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r4 = new byte[r12];
            r4 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 106, 102, 110, 96, 113, 43};
            r4 = bl.hae.a(r4);
            r3.warn(r4, r2);
            goto L_0x01dd;
        L_0x027a:
            r1 = move-exception;
            r2 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r3 = new byte[r13];
            r3 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 102, 105, 106, 118, 96, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r3 = bl.hae.a(r3);
            r2.warn(r3, r1);
            goto L_0x01f8;
        L_0x028b:
            r1 = move-exception;
            goto L_0x0084;
        L_0x028e:
            r1 = move-exception;
            goto L_0x00d7;
        L_0x0291:
            r2 = move-exception;
            goto L_0x012c;
        L_0x0294:
            r7 = move-exception;
            goto L_0x0168;
        L_0x0297:
            r7 = move-exception;
            goto L_0x01fe;
        L_0x029a:
            r2 = move-exception;
            goto L_0x019f;
        L_0x029d:
            r2 = move-exception;
            goto L_0x0051;
        L_0x02a0:
            r2 = move-exception;
            goto L_0x01e4;
        L_0x02a3:
            r2 = move-exception;
            goto L_0x01f3;
        L_0x02a6:
            r2 = move-exception;
            goto L_0x01e4;
        L_0x02a9:
            r1 = move-exception;
            r3 = r0;
            r0 = r1;
            r1 = r2;
            goto L_0x01d8;
        L_0x02af:
            r0 = move-exception;
            r1 = r2;
            goto L_0x01d8;
        L_0x02b3:
            r2 = move-exception;
            goto L_0x0060;
        L_0x02b6:
            r2 = move-exception;
            goto L_0x0051;
        L_0x02b9:
            r1 = move-exception;
            r1 = r2;
            r2 = r0;
            goto L_0x0044;
        L_0x02be:
            r0 = move-exception;
            r1 = r2;
            r2 = r3;
            goto L_0x0044;
        L_0x02c3:
            r2 = move-exception;
            goto L_0x01ae;
        L_0x02c6:
            r2 = move-exception;
            goto L_0x019f;
        L_0x02c9:
            r2 = move-exception;
            goto L_0x013b;
        L_0x02cc:
            r2 = move-exception;
            goto L_0x012c;
        L_0x02cf:
            r1 = move-exception;
            goto L_0x00e6;
        L_0x02d2:
            r1 = move-exception;
            goto L_0x00d7;
        L_0x02d5:
            r1 = move-exception;
            goto L_0x0093;
        L_0x02d8:
            r1 = move-exception;
            goto L_0x0084;
        L_0x02db:
            r4 = r5;
            goto L_0x0228;
        L_0x02de:
            r0 = r5;
            goto L_0x0190;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.ConstraintLevelAutodetector.autodetect():int");
        }
    }

    /* compiled from: BL */
    static final class SelectorLoop implements Runnable {
        volatile boolean done;
        volatile boolean selecting;
        final Selector selector = Selector.open();

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
*/
            /*
            r4 = this;
        L_0x0000:
            r0 = r4.done;
            if (r0 != 0) goto L_0x004c;
        L_0x0004:
            monitor-enter(r4);
            monitor-exit(r4);
            r0 = 1;
            r4.selecting = r0;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r0 = r4.selector;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r0.select(r2);	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r0 = 0;
            r4.selecting = r0;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r0 = r4.selector;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r1 = r0.selectedKeys();	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r2 = r1.iterator();	 Catch:{ all -> 0x0043, IOException -> 0x002e }
        L_0x001d:
            r0 = r2.hasNext();	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            if (r0 == 0) goto L_0x0048;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
        L_0x0023:
            r0 = r2.next();	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r0 = (java.nio.channels.SelectionKey) r0;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r3 = 0;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            r0.interestOps(r3);	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            goto L_0x001d;
        L_0x002e:
            r0 = move-exception;
            r1 = com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.logger;
            r2 = 40;
            r2 = new byte[r2];
            r2 = {67, 100, 108, 105, 96, 97, 37, 113, 106, 37, 114, 100, 108, 113, 37, 99, 106, 119, 37, 100, 37, 113, 96, 104, 117, 106, 119, 100, 119, 124, 37, 118, 96, 105, 96, 102, 113, 106, 119, 43};
            r2 = bl.hae.a(r2);
            r1.warn(r2, r0);
            goto L_0x0000;
        L_0x0040:
            r0 = move-exception;
            monitor-exit(r4);
            throw r0;
        L_0x0043:
            r0 = move-exception;
            r1 = 0;
            r4.selecting = r1;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            throw r0;	 Catch:{ all -> 0x0043, IOException -> 0x002e }
        L_0x0048:
            r1.clear();	 Catch:{ all -> 0x0043, IOException -> 0x002e }
            goto L_0x0000;
        L_0x004c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bilibililive.socket.core.channel.socket.nio.NioProviderMetadata.SelectorLoop.run():void");
        }

        SelectorLoop() throws IOException {
        }
    }

    static {
        int i = SystemPropertyUtil.get(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 118, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 113, (byte) 43, (byte) 102, (byte) 106, (byte) 119, (byte) 96, (byte) 43, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 43, (byte) 118, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 113, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105}), -1);
        if (i < 0 || i > 2) {
            i = SystemPropertyUtil.get(hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 118, (byte) 43, (byte) 118, (byte) 117, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105}), -1);
            if (i < 0 || i > 2) {
                i = -1;
            } else {
                logger.warn(hae.a(new byte[]{(byte) 86, (byte) 124, (byte) 118, (byte) 113, (byte) 96, (byte) 104, (byte) 37, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 96, (byte) 119, (byte) 113, (byte) 124, (byte) 37, (byte) 34, (byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 118, (byte) 43, (byte) 118, (byte) 117, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 34, (byte) 37, (byte) 109, (byte) 100, (byte) 118, (byte) 37, (byte) 103, (byte) 96, (byte) 96, (byte) 107, (byte) 37, (byte) 97, (byte) 96, (byte) 117, (byte) 119, (byte) 96, (byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 97, (byte) 43, (byte) 37, (byte) 37, (byte) 80, (byte) 118, (byte) 96, (byte) 37, (byte) 34, (byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 118, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 113, (byte) 43, (byte) 102, (byte) 106, (byte) 119, (byte) 96, (byte) 43, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 43, (byte) 118, (byte) 106, (byte) 102, (byte) 110, (byte) 96, (byte) 113, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 34, (byte) 37, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 96, (byte) 100, (byte) 97, (byte) 43}));
            }
        }
        if (i >= 0) {
            logger.debug(hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 113, (byte) 113, (byte) 108, (byte) 107, (byte) 98, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 75, (byte) 76, (byte) 74, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 37, (byte) 113, (byte) 106, (byte) 63, (byte) 37}) + i);
        }
        if (i < 0) {
            i = detectConstraintLevelFromSystemProperties();
            if (i < 0) {
                logger.debug(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 112, (byte) 105, (byte) 97, (byte) 107, (byte) 34, (byte) 113, (byte) 37, (byte) 97, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 104, (byte) 108, (byte) 107, (byte) 96, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 75, (byte) 76, (byte) 74, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 118, (byte) 124, (byte) 118, (byte) 113, (byte) 96, (byte) 104, (byte) 37, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 96, (byte) 119, (byte) 113, (byte) 108, (byte) 96, (byte) 118, (byte) 62, (byte) 37, (byte) 112, (byte) 118, (byte) 108, (byte) 107, (byte) 98, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 118, (byte) 100, (byte) 99, (byte) 96, (byte) 118, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 37, (byte) 45, (byte) 55, (byte) 44}));
                i = 2;
            } else if (i != 0) {
                logger.info(hae.a(new byte[]{(byte) 80, (byte) 118, (byte) 108, (byte) 107, (byte) 98, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 97, (byte) 96, (byte) 113, (byte) 96, (byte) 102, (byte) 113, (byte) 96, (byte) 97, (byte) 37, (byte) 75, (byte) 76, (byte) 74, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 63, (byte) 37}) + i + hae.a(new byte[]{(byte) 37, (byte) 45, (byte) 80, (byte) 118, (byte) 96, (byte) 37, (byte) 103, (byte) 96, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 37, (byte) 75, (byte) 76, (byte) 74, (byte) 37, (byte) 117, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119, (byte) 37, (byte) 99, (byte) 106, (byte) 119, (byte) 37, (byte) 103, (byte) 96, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 37, (byte) 117, (byte) 96, (byte) 119, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 44}));
            } else {
                logger.debug(hae.a(new byte[]{(byte) 80, (byte) 118, (byte) 108, (byte) 107, (byte) 98, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 97, (byte) 96, (byte) 113, (byte) 96, (byte) 102, (byte) 113, (byte) 96, (byte) 97, (byte) 37, (byte) 75, (byte) 76, (byte) 74, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 63, (byte) 37}) + i);
            }
        }
        CONSTRAINT_LEVEL = i;
        if (CONSTRAINT_LEVEL < 0 || CONSTRAINT_LEVEL > 2) {
            throw new Error(hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 96, (byte) 125, (byte) 117, (byte) 96, (byte) 102, (byte) 113, (byte) 96, (byte) 97, (byte) 37, (byte) 75, (byte) 76, (byte) 74, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 63, (byte) 37}) + CONSTRAINT_LEVEL + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 117, (byte) 105, (byte) 96, (byte) 100, (byte) 118, (byte) 96, (byte) 37, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 37, (byte) 113, (byte) 109, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 43}));
        }
    }

    private static int detectConstraintLevelFromSystemProperties() {
        String name;
        String str = SystemPropertyUtil.get(hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 118, (byte) 117, (byte) 96, (byte) 102, (byte) 108, (byte) 99, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107}));
        CharSequence charSequence = SystemPropertyUtil.get(hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 115, (byte) 104, (byte) 43, (byte) 108, (byte) 107, (byte) 99, (byte) 106}), Constants.STR_EMPTY);
        String str2 = SystemPropertyUtil.get(hae.a(new byte[]{(byte) 106, (byte) 118, (byte) 43, (byte) 107, (byte) 100, (byte) 104, (byte) 96}));
        String str3 = SystemPropertyUtil.get(hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 115, (byte) 104, (byte) 43, (byte) 115, (byte) 96, (byte) 107, (byte) 97, (byte) 106, (byte) 119}));
        try {
            name = SelectorProvider.provider().getClass().getName();
        } catch (Exception e) {
            name = null;
        }
        if (str == null || str2 == null || str3 == null || name == null) {
            return -1;
        }
        str2 = str2.toLowerCase();
        str3 = str3.toLowerCase();
        if (str3.indexOf("sun") >= 0) {
            if (str2.indexOf(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 107, (byte) 112, (byte) 125})) >= 0) {
                if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 64, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119})) || name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                    return 0;
                }
            } else if (str2.indexOf(hae.a(new byte[]{(byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 118})) >= 0) {
                if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 118, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                    return 0;
                }
            } else if ((str2.indexOf("sun") >= 0 || str2.indexOf(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 105, (byte) 100, (byte) 119, (byte) 108, (byte) 118})) >= 0) && name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 65, (byte) 96, (byte) 115, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                return 0;
            }
        } else if (str3.indexOf(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 105, (byte) 96})) >= 0) {
            if (str2.indexOf("mac") >= 0 && str2.indexOf("os") >= 0 && name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 78, (byte) 84, (byte) 112, (byte) 96, (byte) 112, (byte) 96, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                return 0;
            }
        } else if (str3.indexOf("ibm") >= 0) {
            if (str2.indexOf(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 107, (byte) 112, (byte) 125})) >= 0 || str2.indexOf("aix") >= 0) {
                if (str.equals("1.5") || str.matches(hae.a(new byte[]{(byte) 91, (byte) 52, (byte) 89, (byte) 43, (byte) 48, (byte) 89, (byte) 65, (byte) 43, (byte) 47, (byte) 33}))) {
                    if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                        return 1;
                    }
                } else if (str.equals("1.6") || str.matches(hae.a(new byte[]{(byte) 91, (byte) 52, (byte) 89, (byte) 43, (byte) 51, (byte) 89, (byte) 65, (byte) 43, (byte) 47, (byte) 33}))) {
                    Matcher matcher = Pattern.compile(hae.a(new byte[]{(byte) 45, (byte) 58, (byte) 63, (byte) 91, (byte) 121, (byte) 94, (byte) 91, (byte) 53, (byte) 40, (byte) 60, (byte) 88, (byte) 44, (byte) 45, (byte) 94, (byte) 55, (byte) 40, (byte) 60, (byte) 88, (byte) 94, (byte) 53, (byte) 40, (byte) 60, (byte) 88, (byte) 126, (byte) 54, (byte) 120, (byte) 45, (byte) 58, (byte) 63, (byte) 53, (byte) 94, (byte) 52, (byte) 40, (byte) 60, (byte) 88, (byte) 121, (byte) 52, (byte) 94, (byte) 53, (byte) 40, (byte) 55, (byte) 88, (byte) 44, (byte) 45, (byte) 58, (byte) 63, (byte) 53, (byte) 94, (byte) 52, (byte) 40, (byte) 60, (byte) 88, (byte) 121, (byte) 94, (byte) 52, (byte) 55, (byte) 88, (byte) 94, (byte) 53, (byte) 40, (byte) 60, (byte) 88, (byte) 121, (byte) 54, (byte) 94, (byte) 53, (byte) 52, (byte) 88, (byte) 44, (byte) 44, (byte) 45, (byte) 58, (byte) 63, (byte) 33, (byte) 121, (byte) 94, (byte) 91, (byte) 53, (byte) 40, (byte) 60, (byte) 88, (byte) 44})).matcher(charSequence);
                    if (matcher.find()) {
                        if (Long.parseLong(matcher.group(1)) < 20081105) {
                            return 2;
                        }
                        if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 64, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                            return 0;
                        }
                        if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                            return 1;
                        }
                    }
                }
            }
        } else if (str3.indexOf("bea") >= 0 || str3.indexOf(hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 100, (byte) 102, (byte) 105, (byte) 96})) >= 0) {
            if (str2.indexOf(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 107, (byte) 112, (byte) 125})) >= 0) {
                if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 64, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                    return 0;
                }
                if (name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 85, (byte) 106, (byte) 105, (byte) 105, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                    return 0;
                }
            } else if (str2.indexOf(hae.a(new byte[]{(byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 118})) >= 0 && name.equals(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 107, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 102, (byte) 109, (byte) 43, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 118, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119}))) {
                return 0;
            }
        } else if (str3.indexOf(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 100, (byte) 102, (byte) 109, (byte) 96})) >= 0 && name.equals(hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 98, (byte) 43, (byte) 100, (byte) 117, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 43, (byte) 109, (byte) 100, (byte) 119, (byte) 104, (byte) 106, (byte) 107, (byte) 124, (byte) 43, (byte) 107, (byte) 108, (byte) 106, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 107, (byte) 100, (byte) 105, (byte) 43, (byte) 86, (byte) 96, (byte) 105, (byte) 96, (byte) 102, (byte) 113, (byte) 106, (byte) 119, (byte) 85, (byte) 119, (byte) 106, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 119, (byte) 76, (byte) 104, (byte) 117, (byte) 105}))) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] strArr) throws Exception {
        for (Entry entry : System.getProperties().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        System.out.println(hae.a(new byte[]{(byte) 77, (byte) 100, (byte) 119, (byte) 97, (byte) 40, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 97, (byte) 37, (byte) 70, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 63, (byte) 37}) + CONSTRAINT_LEVEL);
        System.out.println(hae.a(new byte[]{(byte) 68, (byte) 112, (byte) 113, (byte) 106, (byte) 40, (byte) 97, (byte) 96, (byte) 113, (byte) 96, (byte) 102, (byte) 113, (byte) 96, (byte) 97, (byte) 37, (byte) 70, (byte) 106, (byte) 107, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 37, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105, (byte) 63, (byte) 37}) + new ConstraintLevelAutodetector().autodetect());
    }

    private NioProviderMetadata() {
    }
}
