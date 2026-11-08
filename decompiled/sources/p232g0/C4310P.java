package p232g0;

import p259j0.AbstractC5330M;

/* renamed from: g0.P */
/* loaded from: classes.dex */
public final class C4310P {

    /* renamed from: e */
    public static final C4310P f14967e = new C4310P(0, 0);

    /* renamed from: f */
    public static final String f14968f = AbstractC5330M.m21783x0(0);

    /* renamed from: g */
    public static final String f14969g = AbstractC5330M.m21783x0(1);

    /* renamed from: h */
    public static final String f14970h = AbstractC5330M.m21783x0(2);

    /* renamed from: i */
    public static final String f14971i = AbstractC5330M.m21783x0(3);

    /* renamed from: a */
    public final int f14972a;

    /* renamed from: b */
    public final int f14973b;

    /* renamed from: c */
    public final int f14974c;

    /* renamed from: d */
    public final float f14975d;

    public C4310P(int i7, int i8) {
        this(i7, i8, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4310P)) {
            return false;
        }
        C4310P c4310p = (C4310P) obj;
        return this.f14972a == c4310p.f14972a && this.f14973b == c4310p.f14973b && this.f14974c == c4310p.f14974c && this.f14975d == c4310p.f14975d;
    }

    public int hashCode() {
        return ((((((217 + this.f14972a) * 31) + this.f14973b) * 31) + this.f14974c) * 31) + Float.floatToRawIntBits(this.f14975d);
    }

    public C4310P(int i7, int i8, int i9, float f7) {
        this.f14972a = i7;
        this.f14973b = i8;
        this.f14974c = i9;
        this.f14975d = f7;
    }
}
