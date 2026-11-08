package p060I3;

import p067J3.C0737c0;
import p067J3.C0747h0;

/* renamed from: I3.i */
/* loaded from: classes.dex */
public class C0647i implements InterfaceC0641c {

    /* renamed from: a */
    public final C0747h0 f2225a;

    /* renamed from: b */
    public final C0737c0.a f2226b;

    public C0647i(C0747h0 c0747h0, C0737c0.a aVar) {
        this.f2225a = c0747h0;
        this.f2226b = aVar;
    }

    /* renamed from: a */
    public C0737c0.a m2605a() {
        return this.f2226b;
    }

    /* renamed from: b */
    public C0747h0 m2606b() {
        return this.f2225a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0647i c0647i = (C0647i) obj;
        return this.f2225a.equals(c0647i.f2225a) && this.f2226b == c0647i.f2226b;
    }

    public int hashCode() {
        return (this.f2225a.hashCode() * 31) + this.f2226b.hashCode();
    }
}
