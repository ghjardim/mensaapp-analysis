package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.datastore.preferences.protobuf.D */
/* loaded from: classes.dex */
public final class C3258D extends LinkedHashMap {

    /* renamed from: b */
    public static final C3258D f10376b;

    /* renamed from: a */
    public boolean f10377a;

    static {
        C3258D c3258d = new C3258D();
        f10376b = c3258d;
        c3258d.m12075j();
    }

    public C3258D() {
        this.f10377a = true;
    }

    /* renamed from: a */
    public static int m12067a(Map map) {
        int i7 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i7 += m12068b(entry.getValue()) ^ m12068b(entry.getKey());
        }
        return i7;
    }

    /* renamed from: b */
    public static int m12068b(Object obj) {
        return obj instanceof byte[] ? AbstractC3312u.m12837d((byte[]) obj) : obj.hashCode();
    }

    /* renamed from: c */
    public static void m12069c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC3312u.m12834a(obj);
            AbstractC3312u.m12834a(map.get(obj));
        }
    }

    /* renamed from: d */
    public static C3258D m12070d() {
        return f10376b;
    }

    /* renamed from: f */
    public static boolean m12071f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: g */
    public static boolean m12072g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m12071f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m12073e();
        super.clear();
    }

    /* renamed from: e */
    public final void m12073e() {
        if (!m12074i()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m12072g(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m12067a(this);
    }

    /* renamed from: i */
    public boolean m12074i() {
        return this.f10377a;
    }

    /* renamed from: j */
    public void m12075j() {
        this.f10377a = false;
    }

    /* renamed from: k */
    public void m12076k(C3258D c3258d) {
        m12073e();
        if (c3258d.isEmpty()) {
            return;
        }
        putAll(c3258d);
    }

    /* renamed from: l */
    public C3258D m12077l() {
        return isEmpty() ? new C3258D() : new C3258D(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m12073e();
        AbstractC3312u.m12834a(obj);
        AbstractC3312u.m12834a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m12073e();
        m12069c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m12073e();
        return super.remove(obj);
    }

    public C3258D(Map map) {
        super(map);
        this.f10377a = true;
    }
}
