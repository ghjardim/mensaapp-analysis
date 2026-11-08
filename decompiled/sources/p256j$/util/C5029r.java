package p256j$.util;

import java.util.Map;

/* renamed from: j$.util.r */
/* loaded from: classes3.dex */
final class C5029r implements Map.Entry {

    /* renamed from: a */
    private Map.Entry f18315a;

    C5029r(Map.Entry entry) {
        this.f18315a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18315a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18315a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18315a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = this.f18315a;
        Object key = entry2.getKey();
        Object key2 = entry.getKey();
        if (key == null) {
            equals = key2 == null;
        } else {
            equals = key.equals(key2);
        }
        if (equals) {
            Object value = entry2.getValue();
            Object value2 = entry.getValue();
            if (value == null) {
                equals2 = value2 == null;
            } else {
                equals2 = value.equals(value2);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f18315a.toString();
    }
}
