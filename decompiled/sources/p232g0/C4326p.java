package p232g0;

import android.util.SparseBooleanArray;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.p */
/* loaded from: classes.dex */
public final class C4326p {

    /* renamed from: a */
    public final SparseBooleanArray f15076a;

    /* renamed from: g0.p$b */
    public static final class b {

        /* renamed from: a */
        public final SparseBooleanArray f15077a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f15078b;

        /* renamed from: a */
        public b m18185a(int i7) {
            AbstractC5332a.m21802g(!this.f15078b);
            this.f15077a.append(i7, true);
            return this;
        }

        /* renamed from: b */
        public b m18186b(C4326p c4326p) {
            for (int i7 = 0; i7 < c4326p.m18184c(); i7++) {
                m18185a(c4326p.m18183b(i7));
            }
            return this;
        }

        /* renamed from: c */
        public b m18187c(int... iArr) {
            for (int i7 : iArr) {
                m18185a(i7);
            }
            return this;
        }

        /* renamed from: d */
        public b m18188d(int i7, boolean z6) {
            return z6 ? m18185a(i7) : this;
        }

        /* renamed from: e */
        public C4326p m18189e() {
            AbstractC5332a.m21802g(!this.f15078b);
            this.f15078b = true;
            return new C4326p(this.f15077a);
        }
    }

    /* renamed from: a */
    public boolean m18182a(int i7) {
        return this.f15076a.get(i7);
    }

    /* renamed from: b */
    public int m18183b(int i7) {
        AbstractC5332a.m21798c(i7, 0, m18184c());
        return this.f15076a.keyAt(i7);
    }

    /* renamed from: c */
    public int m18184c() {
        return this.f15076a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4326p)) {
            return false;
        }
        C4326p c4326p = (C4326p) obj;
        if (AbstractC5330M.f18800a >= 24) {
            return this.f15076a.equals(c4326p.f15076a);
        }
        if (m18184c() != c4326p.m18184c()) {
            return false;
        }
        for (int i7 = 0; i7 < m18184c(); i7++) {
            if (m18183b(i7) != c4326p.m18183b(i7)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (AbstractC5330M.f18800a >= 24) {
            return this.f15076a.hashCode();
        }
        int m18184c = m18184c();
        for (int i7 = 0; i7 < m18184c(); i7++) {
            m18184c = (m18184c * 31) + m18183b(i7);
        }
        return m18184c;
    }

    public C4326p(SparseBooleanArray sparseBooleanArray) {
        this.f15076a = sparseBooleanArray;
    }
}
