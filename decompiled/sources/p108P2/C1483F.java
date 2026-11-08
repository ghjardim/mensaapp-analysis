package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.F */
/* loaded from: classes.dex */
public final class C1483F {

    /* renamed from: a */
    public final String f4659a;

    /* renamed from: b */
    public final String f4660b;

    /* renamed from: c */
    public final long f4661c;

    /* renamed from: d */
    public final long f4662d;

    /* renamed from: e */
    public final long f4663e;

    /* renamed from: f */
    public final long f4664f;

    /* renamed from: g */
    public final long f4665g;

    /* renamed from: h */
    public final Long f4666h;

    /* renamed from: i */
    public final Long f4667i;

    /* renamed from: j */
    public final Long f4668j;

    /* renamed from: k */
    public final Boolean f4669k;

    public C1483F(String str, String str2, long j7, long j8, long j9, long j10, long j11, Long l7, Long l8, Long l9, Boolean bool) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15119a(j7 >= 0);
        AbstractC3802r.m15119a(j8 >= 0);
        AbstractC3802r.m15119a(j9 >= 0);
        AbstractC3802r.m15119a(j11 >= 0);
        this.f4659a = str;
        this.f4660b = str2;
        this.f4661c = j7;
        this.f4662d = j8;
        this.f4663e = j9;
        this.f4664f = j10;
        this.f4665g = j11;
        this.f4666h = l7;
        this.f4667i = l8;
        this.f4668j = l9;
        this.f4669k = bool;
    }

    /* renamed from: a */
    public final C1483F m5751a(Long l7, Long l8, Boolean bool) {
        return new C1483F(this.f4659a, this.f4660b, this.f4661c, this.f4662d, this.f4663e, this.f4664f, this.f4665g, this.f4666h, l7, l8, bool);
    }

    /* renamed from: b */
    public final C1483F m5752b(long j7, long j8) {
        return new C1483F(this.f4659a, this.f4660b, this.f4661c, this.f4662d, this.f4663e, this.f4664f, j7, Long.valueOf(j8), this.f4667i, this.f4668j, this.f4669k);
    }

    /* renamed from: c */
    public final C1483F m5753c(long j7) {
        return new C1483F(this.f4659a, this.f4660b, this.f4661c, this.f4662d, this.f4663e, j7, this.f4665g, this.f4666h, this.f4667i, this.f4668j, this.f4669k);
    }
}
