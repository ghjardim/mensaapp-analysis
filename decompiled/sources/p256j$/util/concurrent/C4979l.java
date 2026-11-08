package p256j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.l */
/* loaded from: classes3.dex */
class C4979l implements Map.Entry {

    /* renamed from: a */
    final int f18223a;

    /* renamed from: b */
    final Object f18224b;

    /* renamed from: c */
    volatile Object f18225c;

    /* renamed from: d */
    volatile C4979l f18226d;

    C4979l(int i7, Object obj, Object obj2) {
        this.f18223a = i7;
        this.f18224b = obj;
        this.f18225c = obj2;
    }

    C4979l(int i7, Object obj, Object obj2, C4979l c4979l) {
        this(i7, obj, obj2);
        this.f18226d = c4979l;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18224b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18225c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18224b.hashCode() ^ this.f18225c.hashCode();
    }

    public final String toString() {
        return AbstractC4988u.m21340b(this.f18224b, this.f18225c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f18224b) || key.equals(obj2)) && (value == (obj3 = this.f18225c) || value.equals(obj3));
    }

    /* renamed from: a */
    C4979l mo21328a(int i7, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C4979l c4979l = this;
        do {
            if (c4979l.f18223a == i7 && ((obj2 = c4979l.f18224b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return c4979l;
            }
            c4979l = c4979l.f18226d;
        } while (c4979l != null);
        return null;
    }
}
