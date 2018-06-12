package bili2.bl;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* compiled from: BL */
public abstract class juw<MessageType extends jvi> implements jvk<MessageType> {
    private static final jva a = jva.b();

    public /* synthetic */ Object b(InputStream inputStream) throws InvalidProtocolBufferException {
        return a(inputStream);
    }

    public /* synthetic */ Object c(juy bl_juy, jva bl_jva) throws InvalidProtocolBufferException {
        return b(bl_juy, bl_jva);
    }

    public /* synthetic */ Object e(InputStream inputStream, jva bl_jva) throws InvalidProtocolBufferException {
        return d(inputStream, bl_jva);
    }

    public /* synthetic */ Object f(InputStream inputStream, jva bl_jva) throws InvalidProtocolBufferException {
        return b(inputStream, bl_jva);
    }

    private UninitializedMessageException a(MessageType messageType) {
        if (messageType instanceof juv) {
            return ((juv) messageType).a();
        }
        return new UninitializedMessageException(messageType);
    }

    private MessageType b(MessageType messageType) throws InvalidProtocolBufferException {
        if (messageType == null || messageType.k()) {
            return messageType;
        }
        throw a((jvi) messageType).a().a(messageType);
    }

    public MessageType a(juy bl_juy, jva bl_jva) throws InvalidProtocolBufferException {
        jvi bl_jvi;
        try {
            juz h = bl_juy.h();
            bl_jvi = (jvi) a(h, bl_jva);
            h.a(0);
            return bl_jvi;
        } catch (InvalidProtocolBufferException e) {
            throw e.a(bl_jvi);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public MessageType b(juy bl_juy, jva bl_jva) throws InvalidProtocolBufferException {
        return b(a(bl_juy, bl_jva));
    }

    public MessageType a(InputStream inputStream, jva bl_jva) throws InvalidProtocolBufferException {
        juz a = juz.a(inputStream);
        jvi bl_jvi = (jvi) a(a, bl_jva);
        try {
            a.a(0);
            return bl_jvi;
        } catch (InvalidProtocolBufferException e) {
            throw e.a(bl_jvi);
        }
    }

    public MessageType b(InputStream inputStream, jva bl_jva) throws InvalidProtocolBufferException {
        return b(a(inputStream, bl_jva));
    }

    public MessageType a(InputStream inputStream) throws InvalidProtocolBufferException {
        return b(inputStream, a);
    }

    public MessageType c(InputStream inputStream, jva bl_jva) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return a(new a(inputStream, juz.a(read, inputStream)), bl_jva);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    public MessageType d(InputStream inputStream, jva bl_jva) throws InvalidProtocolBufferException {
        return b(c(inputStream, bl_jva));
    }
}
