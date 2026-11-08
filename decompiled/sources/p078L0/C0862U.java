package p078L0;

import p078L0.InterfaceC0861T;
import p259j0.AbstractC5332a;

/* renamed from: L0.U */
/* loaded from: classes.dex */
public final class C0862U {

    /* renamed from: a */
    public final byte[] f2956a = new byte[10];

    /* renamed from: b */
    public boolean f2957b;

    /* renamed from: c */
    public int f2958c;

    /* renamed from: d */
    public long f2959d;

    /* renamed from: e */
    public int f2960e;

    /* renamed from: f */
    public int f2961f;

    /* renamed from: g */
    public int f2962g;

    /* renamed from: a */
    public void m3557a(InterfaceC0861T interfaceC0861T, InterfaceC0861T.a aVar) {
        if (this.f2958c > 0) {
            interfaceC0861T.mo562c(this.f2959d, this.f2960e, this.f2961f, this.f2962g, aVar);
            this.f2958c = 0;
        }
    }

    /* renamed from: b */
    public void m3558b() {
        this.f2957b = false;
        this.f2958c = 0;
    }

    /* renamed from: c */
    public void m3559c(InterfaceC0861T interfaceC0861T, long j7, int i7, int i8, int i9, InterfaceC0861T.a aVar) {
        AbstractC5332a.m21803h(this.f2962g <= i8 + i9, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f2957b) {
            int i10 = this.f2958c;
            int i11 = i10 + 1;
            this.f2958c = i11;
            if (i10 == 0) {
                this.f2959d = j7;
                this.f2960e = i7;
                this.f2961f = 0;
            }
            this.f2961f += i8;
            this.f2962g = i9;
            if (i11 >= 16) {
                m3557a(interfaceC0861T, aVar);
            }
        }
    }

    /* renamed from: d */
    public void m3560d(InterfaceC0884s interfaceC0884s) {
        if (this.f2957b) {
            return;
        }
        interfaceC0884s.mo3521t(this.f2956a, 0, 10);
        interfaceC0884s.mo3518p();
        if (AbstractC0867b.m3598j(this.f2956a) == 0) {
            return;
        }
        this.f2957b = true;
    }
}
