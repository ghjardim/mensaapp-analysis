package p232g0;

import java.util.List;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4303I;

/* renamed from: g0.f */
/* loaded from: classes.dex */
public abstract class AbstractC4316f implements InterfaceC4298D {

    /* renamed from: a */
    public final AbstractC4303I.c f15026a = new AbstractC4303I.c();

    @Override // p232g0.InterfaceC4298D
    /* renamed from: C */
    public final boolean mo17952C() {
        return m18137c() != -1;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: D */
    public final void mo17953D(C4331u c4331u) {
        m18135V(AbstractC3033v.m11051u(c4331u));
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: H */
    public final boolean mo17957H() {
        AbstractC4303I mo17961L = mo17961L();
        return !mo17961L.m18032q() && mo17961L.m18031n(mo17955F(), this.f15026a).f14840i;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: P */
    public final boolean mo17965P() {
        AbstractC4303I mo17961L = mo17961L();
        return !mo17961L.m18032q() && mo17961L.m18031n(mo17955F(), this.f15026a).m18059f();
    }

    /* renamed from: Q */
    public final int m18130Q() {
        AbstractC4303I mo17961L = mo17961L();
        if (mo17961L.m18032q()) {
            return -1;
        }
        return mo17961L.mo710l(mo17955F(), m18131R(), mo17962M());
    }

    /* renamed from: R */
    public final int m18131R() {
        int mo17959J = mo17959J();
        if (mo17959J == 1) {
            return 0;
        }
        return mo17959J;
    }

    /* renamed from: S */
    public abstract void mo18132S(int i7, long j7, int i8, boolean z6);

    /* renamed from: T */
    public final void m18133T(long j7, int i7) {
        mo18132S(mo17955F(), j7, i7, false);
    }

    /* renamed from: U */
    public final void m18134U(int i7, int i8) {
        mo18132S(i7, -9223372036854775807L, i8, false);
    }

    /* renamed from: V */
    public final void m18135V(List list) {
        mo17978p(list, true);
    }

    /* renamed from: b */
    public final long m18136b() {
        AbstractC4303I mo17961L = mo17961L();
        if (mo17961L.m18032q()) {
            return -9223372036854775807L;
        }
        return mo17961L.m18031n(mo17955F(), this.f15026a).m18057d();
    }

    /* renamed from: c */
    public final int m18137c() {
        AbstractC4303I mo17961L = mo17961L();
        if (mo17961L.m18032q()) {
            return -1;
        }
        return mo17961L.mo709e(mo17955F(), m18131R(), mo17962M());
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: e */
    public final void mo17967e() {
        mo17985w(false);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: h */
    public final void mo17970h() {
        mo17985w(true);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: o */
    public final void mo17977o() {
        m18134U(mo17955F(), 4);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: q */
    public final boolean mo17979q() {
        return m18130Q() != -1;
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: t */
    public final void mo17982t(long j7) {
        m18133T(j7, 5);
    }

    @Override // p232g0.InterfaceC4298D
    /* renamed from: z */
    public final boolean mo17988z() {
        AbstractC4303I mo17961L = mo17961L();
        return !mo17961L.m18032q() && mo17961L.m18031n(mo17955F(), this.f15026a).f14839h;
    }
}
