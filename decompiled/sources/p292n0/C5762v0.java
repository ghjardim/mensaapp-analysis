package p292n0;

import p171Y2.AbstractC2928k;
import p259j0.AbstractC5332a;

/* renamed from: n0.v0 */
/* loaded from: classes.dex */
public final class C5762v0 {

    /* renamed from: a */
    public final long f20981a;

    /* renamed from: b */
    public final float f20982b;

    /* renamed from: c */
    public final long f20983c;

    /* renamed from: n0.v0$b */
    public static final class b {

        /* renamed from: a */
        public long f20984a;

        /* renamed from: b */
        public float f20985b;

        /* renamed from: c */
        public long f20986c;

        /* renamed from: d */
        public C5762v0 m24369d() {
            return new C5762v0(this);
        }

        /* renamed from: e */
        public b m24370e(long j7) {
            AbstractC5332a.m21796a(j7 >= 0 || j7 == -9223372036854775807L);
            this.f20986c = j7;
            return this;
        }

        /* renamed from: f */
        public b m24371f(long j7) {
            this.f20984a = j7;
            return this;
        }

        /* renamed from: g */
        public b m24372g(float f7) {
            AbstractC5332a.m21796a(f7 > 0.0f || f7 == -3.4028235E38f);
            this.f20985b = f7;
            return this;
        }

        public b() {
            this.f20984a = -9223372036854775807L;
            this.f20985b = -3.4028235E38f;
            this.f20986c = -9223372036854775807L;
        }

        public b(C5762v0 c5762v0) {
            this.f20984a = c5762v0.f20981a;
            this.f20985b = c5762v0.f20982b;
            this.f20986c = c5762v0.f20983c;
        }
    }

    /* renamed from: a */
    public b m24365a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5762v0)) {
            return false;
        }
        C5762v0 c5762v0 = (C5762v0) obj;
        return this.f20981a == c5762v0.f20981a && this.f20982b == c5762v0.f20982b && this.f20983c == c5762v0.f20983c;
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(Long.valueOf(this.f20981a), Float.valueOf(this.f20982b), Long.valueOf(this.f20983c));
    }

    public C5762v0(b bVar) {
        this.f20981a = bVar.f20984a;
        this.f20982b = bVar.f20985b;
        this.f20983c = bVar.f20986c;
    }
}
