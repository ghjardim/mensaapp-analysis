package p067J3;

import org.apache.tika.utils.StringUtils;
import p088M3.AbstractC1184z;
import p088M3.C1176r;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.b0 */
/* loaded from: classes.dex */
public class C0735b0 {

    /* renamed from: a */
    public final a f2570a;

    /* renamed from: b */
    public final C1176r f2571b;

    /* renamed from: J3.b0$a */
    public enum a {
        ASCENDING(1),
        DESCENDING(-1);


        /* renamed from: a */
        public final int f2575a;

        a(int i7) {
            this.f2575a = i7;
        }

        /* renamed from: f */
        public int m3089f() {
            return this.f2575a;
        }
    }

    public C0735b0(a aVar, C1176r c1176r) {
        this.f2570a = aVar;
        this.f2571b = c1176r;
    }

    /* renamed from: d */
    public static C0735b0 m3084d(a aVar, C1176r c1176r) {
        return new C0735b0(aVar, c1176r);
    }

    /* renamed from: a */
    public int m3085a(InterfaceC1167i interfaceC1167i, InterfaceC1167i interfaceC1167i2) {
        int m3089f;
        int m4599i;
        if (this.f2571b.equals(C1176r.f3773b)) {
            m3089f = this.f2570a.m3089f();
            m4599i = interfaceC1167i.getKey().compareTo(interfaceC1167i2.getKey());
        } else {
            C5413D mo4485f = interfaceC1167i.mo4485f(this.f2571b);
            C5413D mo4485f2 = interfaceC1167i2.mo4485f(this.f2571b);
            AbstractC2133b.m7217d((mo4485f == null || mo4485f2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            m3089f = this.f2570a.m3089f();
            m4599i = AbstractC1184z.m4599i(mo4485f, mo4485f2);
        }
        return m3089f * m4599i;
    }

    /* renamed from: b */
    public a m3086b() {
        return this.f2570a;
    }

    /* renamed from: c */
    public C1176r m3087c() {
        return this.f2571b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0735b0)) {
            return false;
        }
        C0735b0 c0735b0 = (C0735b0) obj;
        return this.f2570a == c0735b0.f2570a && this.f2571b.equals(c0735b0.f2571b);
    }

    public int hashCode() {
        return ((899 + this.f2570a.hashCode()) * 31) + this.f2571b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2570a == a.ASCENDING ? StringUtils.EMPTY : "-");
        sb.append(this.f2571b.mo4464g());
        return sb.toString();
    }
}
