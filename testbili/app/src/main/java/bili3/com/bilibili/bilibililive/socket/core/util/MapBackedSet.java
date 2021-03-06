package bili3.com.bilibili.bilibililive.socket.core.util;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BL */
final class MapBackedSet<E> extends AbstractSet<E> implements Serializable {
    private static final long serialVersionUID = -6761513279741915432L;
    private final Map<E, Boolean> map;

    MapBackedSet(Map<E, Boolean> map) {
        this.map = map;
    }

    public int size() {
        return this.map.size();
    }

    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean add(E e) {
        return this.map.put(e, Boolean.TRUE) == null;
    }

    public boolean remove(Object obj) {
        return this.map.remove(obj) != null;
    }

    public void clear() {
        this.map.clear();
    }

    public Iterator<E> iterator() {
        return this.map.keySet().iterator();
    }
}
