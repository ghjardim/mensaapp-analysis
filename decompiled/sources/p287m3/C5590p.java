package p287m3;

import p295n3.InterfaceC5781a;

/* renamed from: m3.p */
/* loaded from: classes.dex */
public class C5590p {

    /* renamed from: b */
    public long f20194b = 0;

    /* renamed from: c */
    public long f20195c = -1;

    /* renamed from: a */
    public final InterfaceC5781a f20193a = new InterfaceC5781a.a();

    /* renamed from: b */
    public static int m23393b(int i7) {
        return (i7 == 400 || i7 == 404) ? 1 : 0;
    }

    /* renamed from: a */
    public boolean m23394a() {
        return this.f20195c <= this.f20193a.mo24428a();
    }

    /* renamed from: c */
    public void m23395c() {
        this.f20194b = 0L;
        this.f20195c = -1L;
    }

    /* renamed from: d */
    public void m23396d(int i7) {
        this.f20194b++;
        if (m23393b(i7) == 1) {
            this.f20195c = this.f20193a.mo24428a() + 86400000;
            return;
        }
        this.f20195c = this.f20193a.mo24428a() + Math.min((long) (Math.pow(2.0d, this.f20194b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }
}
