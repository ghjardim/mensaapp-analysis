package p067J3;

import p088M3.InterfaceC1167i;

/* renamed from: J3.m */
/* loaded from: classes.dex */
public class C0756m {

    /* renamed from: a */
    public final a f2680a;

    /* renamed from: b */
    public final InterfaceC1167i f2681b;

    /* renamed from: J3.m$a */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    public C0756m(a aVar, InterfaceC1167i interfaceC1167i) {
        this.f2680a = aVar;
        this.f2681b = interfaceC1167i;
    }

    /* renamed from: a */
    public static C0756m m3250a(a aVar, InterfaceC1167i interfaceC1167i) {
        return new C0756m(aVar, interfaceC1167i);
    }

    /* renamed from: b */
    public InterfaceC1167i m3251b() {
        return this.f2681b;
    }

    /* renamed from: c */
    public a m3252c() {
        return this.f2680a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0756m)) {
            return false;
        }
        C0756m c0756m = (C0756m) obj;
        return this.f2680a.equals(c0756m.f2680a) && this.f2681b.equals(c0756m.f2681b);
    }

    public int hashCode() {
        return ((((1891 + this.f2680a.hashCode()) * 31) + this.f2681b.getKey().hashCode()) * 31) + this.f2681b.mo4480a().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f2681b + "," + this.f2680a + ")";
    }
}
