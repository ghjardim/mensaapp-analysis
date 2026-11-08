package p104O5;

import kotlin.jvm.internal.AbstractC5464g;

/* renamed from: O5.f */
/* loaded from: classes2.dex */
public final class C1419f extends C1417d {

    /* renamed from: e */
    public static final a f4473e = new a(null);

    /* renamed from: f */
    public static final C1419f f4474f = new C1419f(1, 0);

    /* renamed from: O5.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C1419f m5527a() {
            return C1419f.f4474f;
        }

        public a() {
        }
    }

    public C1419f(int i7, int i8) {
        super(i7, i8, 1);
    }

    @Override // p104O5.C1417d
    public boolean equals(Object obj) {
        if (obj instanceof C1419f) {
            if (!isEmpty() || !((C1419f) obj).isEmpty()) {
                C1419f c1419f = (C1419f) obj;
                if (m5518a() != c1419f.m5518a() || m5519b() != c1419f.m5519b()) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public Integer m5525h() {
        return Integer.valueOf(m5519b());
    }

    @Override // p104O5.C1417d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m5518a() * 31) + m5519b();
    }

    /* renamed from: i */
    public Integer m5526i() {
        return Integer.valueOf(m5518a());
    }

    @Override // p104O5.C1417d
    public boolean isEmpty() {
        return m5518a() > m5519b();
    }

    @Override // p104O5.C1417d
    public String toString() {
        return m5518a() + ".." + m5519b();
    }
}
