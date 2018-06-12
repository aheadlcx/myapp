package bili3.com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: BL */
public class j {
    protected static Logger a = Logger.getLogger(j.class.getName());
    protected static Map<Integer, Map<Integer, Class<? extends BaseDescriptor>>> b = new HashMap();

    static {
        Set<Class> hashSet = new HashSet();
        hashSet.add(e.class);
        hashSet.add(l.class);
        hashSet.add(BaseDescriptor.class);
        hashSet.add(g.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(a.class);
        hashSet.add(h.class);
        hashSet.add(ESDescriptor.class);
        hashSet.add(d.class);
        for (Class cls : hashSet) {
            f fVar = (f) cls.getAnnotation(f.class);
            int[] a = fVar.a();
            int b = fVar.b();
            Map map = (Map) b.get(Integer.valueOf(b));
            if (map == null) {
                map = new HashMap();
            }
            for (int valueOf : a) {
                map.put(Integer.valueOf(valueOf), cls);
            }
            b.put(Integer.valueOf(b), map);
        }
    }

    public static BaseDescriptor a(int i, ByteBuffer byteBuffer) throws IOException {
        BaseDescriptor mVar;
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        Map map = (Map) b.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) b.get(Integer.valueOf(-1));
        }
        Class cls = (Class) map.get(Integer.valueOf(readUInt8));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            a.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(readUInt8) + " found: " + cls);
            mVar = new m();
        } else {
            try {
                mVar = (BaseDescriptor) cls.newInstance();
            } catch (Throwable e) {
                a.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + readUInt8, e);
                throw new RuntimeException(e);
            }
        }
        mVar.a(readUInt8, byteBuffer);
        return mVar;
    }
}
