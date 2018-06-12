package bili2.bl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: BL */
class fbq {
    private HashMap<String, HashMap<String, fbp<fbt>>> a = new HashMap();
    private ReadWriteLock b = new ReentrantReadWriteLock();

    fbq(int i) {
    }

    @Nullable
    fbp<fbt> a(@NonNull String str, @NonNull String str2) {
        this.b.readLock().lock();
        try {
            HashMap hashMap = (HashMap) this.a.get(str);
            if (hashMap == null) {
                return null;
            }
            fbp<fbt> bl_fbp_bl_fbt = (fbp) hashMap.get(str2);
            this.b.readLock().unlock();
            return bl_fbp_bl_fbt;
        } finally {
            this.b.readLock().unlock();
        }
    }

    void a(@NonNull fbt bl_fbt) {
        this.b.writeLock().lock();
        try {
            HashMap hashMap = (HashMap) this.a.get(bl_fbt.a);
            if (hashMap == null) {
                hashMap = new HashMap();
                this.a.put(bl_fbt.a, hashMap);
            }
            hashMap.put(bl_fbt.b, fbp.a(bl_fbt, (long) (bl_fbt.d * 1000)));
        } finally {
            this.b.writeLock().unlock();
        }
    }

    void a() {
        this.b.writeLock().lock();
        try {
            this.a.clear();
        } finally {
            this.b.writeLock().unlock();
        }
    }
}
