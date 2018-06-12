package bili3.com.intertrust.wasabi.drm.jni;

import com.intertrust.wasabi.Attribute;
import com.intertrust.wasabi.drm.DateTime;
import com.intertrust.wasabi.drm.Service;
import com.intertrust.wasabi.drm.Subscription;
import com.intertrust.wasabi.drm.User;

/* compiled from: BL */
public class Engine {
    public static native int create(com.intertrust.wasabi.drm.Engine engine, long[] jArr);

    public static native void destroy(long j);

    public static native int getLinkIds(long j, String[][] strArr);

    public static native int getNodeIds(long j, String[][] strArr);

    public static native int getObjectDetails(long j, String str, Attribute[] attributeArr);

    public static native int getProperty(long j, String str, Object[] objArr);

    public static native int getPropertyNames(long j, String[][] strArr);

    public static native int getServiceSubscriptions(long j, String str, String str2, Subscription[][] subscriptionArr);

    public static native int getServiceUsers(long j, String str, User[][] userArr);

    public static native int getServices(long j, Service[][] serviceArr);

    public static native int getTrustedTime(long j, DateTime dateTime);

    public static native boolean isPersonalized(long j);

    public static native int personalize(long j, String str);

    public static native int processServiceToken(long j, String str);

    public static native int setProperty(long j, String str, Object obj);

    public static native int transformUriTemplate(long j, String str, String[] strArr);

    public static native int updatePersonality(long j, String str);

    public static native int updateSecurityData(long j, String str, int i);

    public static native int vacuumData(long j, int i);
}
