package bili2.bl;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: BL */
class jvn<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private List<b> b;
    private Map<K, V> c;
    private boolean d;
    private volatile d e;

    /* compiled from: BL */
    static class a {
        private static final Iterator<Object> a = new Iterator<Object>() {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> b = new Iterable<Object>() {
            public Iterator<Object> iterator() {
                return a.a;
            }
        };

        static <T> Iterable<T> a() {
            return b;
        }
    }

    /* compiled from: BL */
    class b implements Comparable<b>, Entry<K, V> {
        final /* synthetic */ jvn a;
        private final K b;
        private V c;

        public /* synthetic */ int compareTo(Object obj) {
            return a((b) obj);
        }

        public /* synthetic */ Object getKey() {
            return a();
        }

        b(jvn bl_jvn, Entry<K, V> entry) {
            this(bl_jvn, (Comparable) entry.getKey(), entry.getValue());
        }

        b(jvn bl_jvn, K k, V v) {
            this.a = bl_jvn;
            this.b = k;
            this.c = v;
        }

        public K a() {
            return this.b;
        }

        public V getValue() {
            return this.c;
        }

        public int a(b bVar) {
            return a().compareTo(bVar.a());
        }

        public V setValue(V v) {
            this.a.e();
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (a(this.b, entry.getKey()) && a(this.c, entry.getValue())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.b == null ? 0 : this.b.hashCode();
            if (this.c != null) {
                i = this.c.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            String valueOf = String.valueOf(String.valueOf(this.b));
            String valueOf2 = String.valueOf(String.valueOf(this.c));
            return new StringBuilder((valueOf.length() + 1) + valueOf2.length()).append(valueOf).append("=").append(valueOf2).toString();
        }

        private boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            } else {
                return obj.equals(obj2);
            }
        }
    }

    /* compiled from: BL */
    class c implements Iterator<Entry<K, V>> {
        final /* synthetic */ jvn a;
        private int b;
        private boolean c;
        private Iterator<Entry<K, V>> d;

        private c(jvn bl_jvn) {
            this.a = bl_jvn;
            this.b = -1;
        }

        public /* synthetic */ Object next() {
            return a();
        }

        public boolean hasNext() {
            return this.b + 1 < this.a.b.size() || b().hasNext();
        }

        public Entry<K, V> a() {
            this.c = true;
            int i = this.b + 1;
            this.b = i;
            if (i < this.a.b.size()) {
                return (Entry) this.a.b.get(this.b);
            }
            return (Entry) b().next();
        }

        public void remove() {
            if (this.c) {
                this.c = false;
                this.a.e();
                if (this.b < this.a.b.size()) {
                    jvn bl_jvn = this.a;
                    int i = this.b;
                    this.b = i - 1;
                    bl_jvn.c(i);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        private Iterator<Entry<K, V>> b() {
            if (this.d == null) {
                this.d = this.a.c.entrySet().iterator();
            }
            return this.d;
        }
    }

    /* compiled from: BL */
    class d extends AbstractSet<Entry<K, V>> {
        final /* synthetic */ jvn a;

        private d(jvn bl_jvn) {
            this.a = bl_jvn;
        }

        public /* synthetic */ boolean add(Object obj) {
            return a((Entry) obj);
        }

        public Iterator<Entry<K, V>> iterator() {
            return new c();
        }

        public int size() {
            return this.a.size();
        }

        public boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = this.a.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public boolean a(Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            this.a.a((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            this.a.remove(entry.getKey());
            return true;
        }

        public void clear() {
            this.a.clear();
        }
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((Comparable) obj, obj2);
    }

    static <FieldDescriptorType extends bl.jvb.a<FieldDescriptorType>> jvn<FieldDescriptorType, Object> a(int i) {
        return new jvn<FieldDescriptorType, Object>(i) {
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return super.a((bl.jvb.a) obj, obj2);
            }

            public void a() {
                if (!b()) {
                    for (int i = 0; i < c(); i++) {
                        Entry b = b(i);
                        if (((bl.jvb.a) b.getKey()).d()) {
                            b.setValue(Collections.unmodifiableList((List) b.getValue()));
                        }
                    }
                    for (Entry entry : d()) {
                        if (((bl.jvb.a) entry.getKey()).d()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.a();
            }
        };
    }

    private jvn(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
    }

    public void a() {
        if (!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.d = true;
        }
    }

    public boolean b() {
        return this.d;
    }

    public int c() {
        return this.b.size();
    }

    public Entry<K, V> b(int i) {
        return (Entry) this.b.get(i);
    }

    public Iterable<Entry<K, V>> d() {
        return this.c.isEmpty() ? a.a() : this.c.entrySet();
    }

    public int size() {
        return this.b.size() + this.c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((b) this.b.get(a)).getValue();
        }
        return this.c.get(comparable);
    }

    public V a(K k, V v) {
        e();
        int a = a((Comparable) k);
        if (a >= 0) {
            return ((b) this.b.get(a)).setValue(v);
        }
        g();
        int i = -(a + 1);
        if (i >= this.a) {
            return f().put(k, v);
        }
        if (this.b.size() == this.a) {
            b bVar = (b) this.b.remove(this.a - 1);
            f().put(bVar.a(), bVar.getValue());
        }
        this.b.add(i, new b(this, k, v));
        return null;
    }

    public void clear() {
        e();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return c(a);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    private V c(int i) {
        e();
        V value = ((b) this.b.remove(i)).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.b.add(new b(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int compareTo;
        int i = 0;
        int size = this.b.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo(((b) this.b.get(size)).a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            compareTo = k.compareTo(((b) this.b.get(i2)).a());
            if (compareTo < 0) {
                compareTo = i2 - 1;
                size = i;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                int i3 = size;
                size = i2 + 1;
                compareTo = i3;
            }
            i = size;
            size = compareTo;
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    private void e() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> f() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
        }
        return (SortedMap) this.c;
    }

    private void g() {
        e();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
    }
}
