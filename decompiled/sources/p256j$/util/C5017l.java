package p256j$.util;

import java.util.Set;

/* renamed from: j$.util.l */
/* loaded from: classes3.dex */
final class C5017l extends C5009h implements Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18282b) {
            equals = this.f18281a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.f18282b) {
            hashCode = this.f18281a.hashCode();
        }
        return hashCode;
    }
}
