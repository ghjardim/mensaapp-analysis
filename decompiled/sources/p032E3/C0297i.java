package p032E3;

import p011B3.C0044c;
import p011B3.C0045d;
import p011B3.InterfaceC0049h;

/* renamed from: E3.i */
/* loaded from: classes.dex */
public class C0297i implements InterfaceC0049h {

    /* renamed from: a */
    public boolean f1140a = false;

    /* renamed from: b */
    public boolean f1141b = false;

    /* renamed from: c */
    public C0045d f1142c;

    /* renamed from: d */
    public final C0294f f1143d;

    public C0297i(C0294f c0294f) {
        this.f1143d = c0294f;
    }

    /* renamed from: a */
    public final void m1188a() {
        if (this.f1140a) {
            throw new C0044c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f1140a = true;
    }

    /* renamed from: b */
    public void m1189b(C0045d c0045d, boolean z6) {
        this.f1140a = false;
        this.f1142c = c0045d;
        this.f1141b = z6;
    }

    @Override // p011B3.InterfaceC0049h
    /* renamed from: d */
    public InterfaceC0049h mo115d(String str) {
        m1188a();
        this.f1143d.m1168g(this.f1142c, str, this.f1141b);
        return this;
    }

    @Override // p011B3.InterfaceC0049h
    /* renamed from: e */
    public InterfaceC0049h mo116e(boolean z6) {
        m1188a();
        this.f1143d.m1173l(this.f1142c, z6, this.f1141b);
        return this;
    }
}
