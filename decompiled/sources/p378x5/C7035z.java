package p378x5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import p076K5.InterfaceC0834a;

/* renamed from: x5.z */
/* loaded from: classes2.dex */
public final class C7035z implements Map, Serializable, InterfaceC0834a {

    /* renamed from: a */
    public static final C7035z f25086a = new C7035z();

    /* renamed from: a */
    public boolean m28909a(Void value) {
        AbstractC5469l.m23028e(value, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set m28911c() {
        return C7001A.f25049a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m28909a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set m28912d() {
        return C7001A.f25049a;
    }

    /* renamed from: e */
    public int m28913e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m28911c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection m28914f() {
        return C7034y.f25085a;
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m28912d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m28913e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m28914f();
    }
}
