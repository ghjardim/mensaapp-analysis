package p022D0;

import java.util.List;
import p178Z2.AbstractC3033v;
import p259j0.AbstractC5332a;
import p292n0.C5762v0;

/* renamed from: D0.i */
/* loaded from: classes.dex */
public final class C0156i implements InterfaceC0147d0 {

    /* renamed from: a */
    public final AbstractC3033v f666a;

    /* renamed from: b */
    public long f667b;

    /* renamed from: D0.i$a */
    public static final class a implements InterfaceC0147d0 {

        /* renamed from: a */
        public final InterfaceC0147d0 f668a;

        /* renamed from: b */
        public final AbstractC3033v f669b;

        public a(InterfaceC0147d0 interfaceC0147d0, List list) {
            this.f668a = interfaceC0147d0;
            this.f669b = AbstractC3033v.m11048p(list);
        }

        @Override // p022D0.InterfaceC0147d0
        /* renamed from: a */
        public long mo309a() {
            return this.f668a.mo309a();
        }

        /* renamed from: b */
        public AbstractC3033v m634b() {
            return this.f669b;
        }

        @Override // p022D0.InterfaceC0147d0
        /* renamed from: d */
        public boolean mo310d() {
            return this.f668a.mo310d();
        }

        @Override // p022D0.InterfaceC0147d0
        /* renamed from: e */
        public boolean mo311e(C5762v0 c5762v0) {
            return this.f668a.mo311e(c5762v0);
        }

        @Override // p022D0.InterfaceC0147d0
        /* renamed from: f */
        public long mo312f() {
            return this.f668a.mo312f();
        }

        @Override // p022D0.InterfaceC0147d0
        /* renamed from: h */
        public void mo314h(long j7) {
            this.f668a.mo314h(j7);
        }
    }

    public C0156i(List list, List list2) {
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        AbstractC5332a.m21796a(list.size() == list2.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            m11045m.mo11040a(new a((InterfaceC0147d0) list.get(i7), (List) list2.get(i7)));
        }
        this.f666a = m11045m.m11063k();
        this.f667b = -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        long j7 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.f666a.size(); i7++) {
            long mo309a = ((a) this.f666a.get(i7)).mo309a();
            if (mo309a != Long.MIN_VALUE) {
                j7 = Math.min(j7, mo309a);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        for (int i7 = 0; i7 < this.f666a.size(); i7++) {
            if (((a) this.f666a.get(i7)).mo310d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        boolean z6;
        boolean z7 = false;
        do {
            long mo309a = mo309a();
            if (mo309a == Long.MIN_VALUE) {
                break;
            }
            z6 = false;
            for (int i7 = 0; i7 < this.f666a.size(); i7++) {
                long mo309a2 = ((a) this.f666a.get(i7)).mo309a();
                boolean z8 = mo309a2 != Long.MIN_VALUE && mo309a2 <= c5762v0.f20981a;
                if (mo309a2 == mo309a || z8) {
                    z6 |= ((a) this.f666a.get(i7)).mo311e(c5762v0);
                }
            }
            z7 |= z6;
        } while (z6);
        return z7;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        long j7 = Long.MAX_VALUE;
        long j8 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.f666a.size(); i7++) {
            a aVar = (a) this.f666a.get(i7);
            long mo312f = aVar.mo312f();
            if ((aVar.m634b().contains(1) || aVar.m634b().contains(2) || aVar.m634b().contains(4)) && mo312f != Long.MIN_VALUE) {
                j7 = Math.min(j7, mo312f);
            }
            if (mo312f != Long.MIN_VALUE) {
                j8 = Math.min(j8, mo312f);
            }
        }
        if (j7 != Long.MAX_VALUE) {
            this.f667b = j7;
            return j7;
        }
        if (j8 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j9 = this.f667b;
        return j9 != -9223372036854775807L ? j9 : j8;
    }

    @Override // p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
        for (int i7 = 0; i7 < this.f666a.size(); i7++) {
            ((a) this.f666a.get(i7)).mo314h(j7);
        }
    }
}
