package p232g0;

import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g0.C */
/* loaded from: classes.dex */
public final class C4297C {

    /* renamed from: d */
    public static final C4297C f14765d = new C4297C(1.0f);

    /* renamed from: e */
    public static final String f14766e = AbstractC5330M.m21783x0(0);

    /* renamed from: f */
    public static final String f14767f = AbstractC5330M.m21783x0(1);

    /* renamed from: a */
    public final float f14768a;

    /* renamed from: b */
    public final float f14769b;

    /* renamed from: c */
    public final int f14770c;

    public C4297C(float f7) {
        this(f7, 1.0f);
    }

    /* renamed from: a */
    public long m17948a(long j7) {
        return j7 * this.f14770c;
    }

    /* renamed from: b */
    public C4297C m17949b(float f7) {
        return new C4297C(f7, this.f14769b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4297C.class != obj.getClass()) {
            return false;
        }
        C4297C c4297c = (C4297C) obj;
        return this.f14768a == c4297c.f14768a && this.f14769b == c4297c.f14769b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f14768a)) * 31) + Float.floatToRawIntBits(this.f14769b);
    }

    public String toString() {
        return AbstractC5330M.m21685H("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f14768a), Float.valueOf(this.f14769b));
    }

    public C4297C(float f7, float f8) {
        AbstractC5332a.m21796a(f7 > 0.0f);
        AbstractC5332a.m21796a(f8 > 0.0f);
        this.f14768a = f7;
        this.f14769b = f8;
        this.f14770c = Math.round(f7 * 1000.0f);
    }
}
