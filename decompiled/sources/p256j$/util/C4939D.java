package p256j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.D */
/* loaded from: classes3.dex */
public final class C4939D {

    /* renamed from: c */
    private static final C4939D f18137c = new C4939D();

    /* renamed from: a */
    private final boolean f18138a;

    /* renamed from: b */
    private final int f18139b;

    private C4939D() {
        this.f18138a = false;
        this.f18139b = 0;
    }

    /* renamed from: a */
    public static C4939D m21263a() {
        return f18137c;
    }

    private C4939D(int i7) {
        this.f18138a = true;
        this.f18139b = i7;
    }

    /* renamed from: d */
    public static C4939D m21264d(int i7) {
        return new C4939D(i7);
    }

    /* renamed from: b */
    public final int m21265b() {
        if (!this.f18138a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f18139b;
    }

    /* renamed from: c */
    public final boolean m21266c() {
        return this.f18138a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4939D)) {
            return false;
        }
        C4939D c4939d = (C4939D) obj;
        boolean z6 = this.f18138a;
        if (z6 && c4939d.f18138a) {
            if (this.f18139b == c4939d.f18139b) {
                return true;
            }
        } else if (z6 == c4939d.f18138a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18138a) {
            return this.f18139b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f18138a) {
            return "OptionalInt[" + this.f18139b + "]";
        }
        return "OptionalInt.empty";
    }
}
