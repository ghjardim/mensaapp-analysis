package p225f1;

import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: f1.v */
/* loaded from: classes.dex */
public final class C4247v {

    /* renamed from: a */
    public final C4244s f14629a;

    /* renamed from: b */
    public final int f14630b;

    /* renamed from: c */
    public final long[] f14631c;

    /* renamed from: d */
    public final int[] f14632d;

    /* renamed from: e */
    public final int f14633e;

    /* renamed from: f */
    public final long[] f14634f;

    /* renamed from: g */
    public final int[] f14635g;

    /* renamed from: h */
    public final long f14636h;

    public C4247v(C4244s c4244s, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
        AbstractC5332a.m21796a(iArr.length == jArr2.length);
        AbstractC5332a.m21796a(jArr.length == jArr2.length);
        AbstractC5332a.m21796a(iArr2.length == jArr2.length);
        this.f14629a = c4244s;
        this.f14631c = jArr;
        this.f14632d = iArr;
        this.f14633e = i7;
        this.f14634f = jArr2;
        this.f14635g = iArr2;
        this.f14636h = j7;
        this.f14630b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m17834a(long j7) {
        for (int m21744h = AbstractC5330M.m21744h(this.f14634f, j7, true, false); m21744h >= 0; m21744h--) {
            if ((this.f14635g[m21744h] & 1) != 0) {
                return m21744h;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m17835b(long j7) {
        for (int m21732d = AbstractC5330M.m21732d(this.f14634f, j7, true, false); m21732d < this.f14634f.length; m21732d++) {
            if ((this.f14635g[m21732d] & 1) != 0) {
                return m21732d;
            }
        }
        return -1;
    }
}
