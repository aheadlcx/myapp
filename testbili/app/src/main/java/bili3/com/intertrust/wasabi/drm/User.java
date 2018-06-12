package bili3.com.intertrust.wasabi.drm;

import com.intertrust.wasabi.Attribute;
import com.intertrust.wasabi.ErrorCodeException;
import com.intertrust.wasabi.drm.jni.Engine;

/* compiled from: BL */
public final class User {
    private Attribute details;
    private boolean isDeviceRegistered;
    private String name;
    private Service service;
    private String uid;

    public String getName() {
        return this.name;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isDeviceRegistered() {
        return this.isDeviceRegistered;
    }

    public Attribute getDetails() {
        return this.details;
    }

    public Service getService() {
        return this.service;
    }

    public Subscription[] getSubscriptions() throws ErrorCodeException {
        Subscription[][] subscriptionArr = new Subscription[1][];
        synchronized (Engine.class) {
            ErrorCodeException.checkResult(Engine.getServiceSubscriptions(this.service.getEngine().getJniPeer(), this.service.getUid(), this.uid, subscriptionArr));
        }
        for (Subscription user : subscriptionArr[0]) {
            user.setUser(this);
        }
        return subscriptionArr[0];
    }

    public String toString() {
        String str = "{name: " + this.name + ", uid: " + this.uid + ", isDeviceRegistered " + this.isDeviceRegistered;
        if (this.details != null) {
            str = str + ", details: " + this.details.toString();
        }
        return str + "}";
    }

    User(String str, String str2, boolean z, Attribute attribute) {
        this.name = str;
        this.uid = str2;
        this.isDeviceRegistered = z;
        this.details = attribute;
    }

    void setService(Service service) {
        this.service = service;
    }
}
