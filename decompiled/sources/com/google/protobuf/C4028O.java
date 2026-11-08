package com.google.protobuf;

import com.google.protobuf.AbstractC4015C;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.O */
/* loaded from: classes.dex */
public final class C4028O extends LinkedHashMap {

    /* renamed from: b */
    public static final C4028O f13326b;

    /* renamed from: a */
    public boolean f13327a;

    static {
        C4028O c4028o = new C4028O();
        f13326b = c4028o;
        c4028o.m16296j();
    }

    public C4028O() {
        this.f13327a = true;
    }

    /* renamed from: a */
    public static int m16288a(Map map) {
        int i7 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i7 += m16289b(entry.getValue()) ^ m16289b(entry.getKey());
        }
        return i7;
    }

    /* renamed from: b */
    public static int m16289b(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC4015C.m16186d((byte[]) obj);
        }
        if (obj instanceof AbstractC4015C.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: c */
    public static void m16290c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC4015C.m16183a(obj);
            AbstractC4015C.m16183a(map.get(obj));
        }
    }

    /* renamed from: d */
    public static C4028O m16291d() {
        return f13326b;
    }

    /* renamed from: f */
    public static boolean m16292f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: g */
    public static boolean m16293g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m16292f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m16294e();
        super.clear();
    }

    /* renamed from: e */
    public final void m16294e() {
        if (!m16295i()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m16293g(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m16288a(this);
    }

    /* renamed from: i */
    public boolean m16295i() {
        return this.f13327a;
    }

    /* renamed from: j */
    public void m16296j() {
        this.f13327a = false;
    }

    /* renamed from: k */
    public void m16297k(C4028O c4028o) {
        m16294e();
        if (c4028o.isEmpty()) {
            return;
        }
        putAll(c4028o);
    }

    /* renamed from: l */
    public C4028O m16298l() {
        return isEmpty() ? new C4028O() : new C4028O(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m16294e();
        AbstractC4015C.m16183a(obj);
        AbstractC4015C.m16183a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m16294e();
        m16290c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m16294e();
        return super.remove(obj);
    }

    public C4028O(Map map) {
        super(map);
        this.f13327a = true;
    }
}
