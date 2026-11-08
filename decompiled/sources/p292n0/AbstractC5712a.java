package p292n0;

import android.util.Pair;
import p022D0.InterfaceC0149e0;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5332a;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5712a extends AbstractC4303I {

    /* renamed from: e */
    public final int f20645e;

    /* renamed from: f */
    public final InterfaceC0149e0 f20646f;

    /* renamed from: g */
    public final boolean f20647g;

    public AbstractC5712a(boolean z6, InterfaceC0149e0 interfaceC0149e0) {
        this.f20647g = z6;
        this.f20646f = interfaceC0149e0;
        this.f20645e = interfaceC0149e0.mo598a();
    }

    /* renamed from: v */
    public static Object m23933v(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: w */
    public static Object m23934w(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: y */
    public static Object m23935y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: A */
    public abstract int mo23887A(int i7);

    /* renamed from: B */
    public final int m23936B(int i7, boolean z6) {
        if (z6) {
            return this.f20646f.mo602e(i7);
        }
        if (i7 < this.f20645e - 1) {
            return i7 + 1;
        }
        return -1;
    }

    /* renamed from: C */
    public final int m23937C(int i7, boolean z6) {
        if (z6) {
            return this.f20646f.mo601d(i7);
        }
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    /* renamed from: D */
    public abstract AbstractC4303I mo23888D(int i7);

    @Override // p232g0.AbstractC4303I
    /* renamed from: a */
    public int mo707a(boolean z6) {
        if (this.f20645e == 0) {
            return -1;
        }
        if (this.f20647g) {
            z6 = false;
        }
        int mo600c = z6 ? this.f20646f.mo600c() : 0;
        while (mo23888D(mo600c).m18032q()) {
            mo600c = m23936B(mo600c, z6);
            if (mo600c == -1) {
                return -1;
            }
        }
        return mo23887A(mo600c) + mo23888D(mo600c).mo707a(z6);
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: b */
    public final int mo302b(Object obj) {
        int mo302b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object m23934w = m23934w(obj);
        Object m23933v = m23933v(obj);
        int mo23891s = mo23891s(m23934w);
        if (mo23891s == -1 || (mo302b = mo23888D(mo23891s).mo302b(m23933v)) == -1) {
            return -1;
        }
        return mo23895z(mo23891s) + mo302b;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: c */
    public int mo708c(boolean z6) {
        int i7 = this.f20645e;
        if (i7 == 0) {
            return -1;
        }
        if (this.f20647g) {
            z6 = false;
        }
        int mo604g = z6 ? this.f20646f.mo604g() : i7 - 1;
        while (mo23888D(mo604g).m18032q()) {
            mo604g = m23937C(mo604g, z6);
            if (mo604g == -1) {
                return -1;
            }
        }
        return mo23887A(mo604g) + mo23888D(mo604g).mo708c(z6);
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: e */
    public int mo709e(int i7, int i8, boolean z6) {
        if (this.f20647g) {
            if (i8 == 1) {
                i8 = 2;
            }
            z6 = false;
        }
        int mo23893u = mo23893u(i7);
        int mo23887A = mo23887A(mo23893u);
        int mo709e = mo23888D(mo23893u).mo709e(i7 - mo23887A, i8 != 2 ? i8 : 0, z6);
        if (mo709e != -1) {
            return mo23887A + mo709e;
        }
        int m23936B = m23936B(mo23893u, z6);
        while (m23936B != -1 && mo23888D(m23936B).m18032q()) {
            m23936B = m23936B(m23936B, z6);
        }
        if (m23936B != -1) {
            return mo23887A(m23936B) + mo23888D(m23936B).mo707a(z6);
        }
        if (i8 == 2) {
            return mo707a(z6);
        }
        return -1;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: g */
    public final AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
        int mo23892t = mo23892t(i7);
        int mo23887A = mo23887A(mo23892t);
        mo23888D(mo23892t).mo303g(i7 - mo23895z(mo23892t), bVar, z6);
        bVar.f14811c += mo23887A;
        if (z6) {
            bVar.f14810b = m23935y(mo23894x(mo23892t), AbstractC5332a.m21800e(bVar.f14810b));
        }
        return bVar;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: h */
    public final AbstractC4303I.b mo18028h(Object obj, AbstractC4303I.b bVar) {
        Object m23934w = m23934w(obj);
        Object m23933v = m23933v(obj);
        int mo23891s = mo23891s(m23934w);
        int mo23887A = mo23887A(mo23891s);
        mo23888D(mo23891s).mo18028h(m23933v, bVar);
        bVar.f14811c += mo23887A;
        bVar.f14810b = obj;
        return bVar;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: l */
    public int mo710l(int i7, int i8, boolean z6) {
        if (this.f20647g) {
            if (i8 == 1) {
                i8 = 2;
            }
            z6 = false;
        }
        int mo23893u = mo23893u(i7);
        int mo23887A = mo23887A(mo23893u);
        int mo710l = mo23888D(mo23893u).mo710l(i7 - mo23887A, i8 != 2 ? i8 : 0, z6);
        if (mo710l != -1) {
            return mo23887A + mo710l;
        }
        int m23937C = m23937C(mo23893u, z6);
        while (m23937C != -1 && mo23888D(m23937C).m18032q()) {
            m23937C = m23937C(m23937C, z6);
        }
        if (m23937C != -1) {
            return mo23887A(m23937C) + mo23888D(m23937C).mo708c(z6);
        }
        if (i8 == 2) {
            return mo708c(z6);
        }
        return -1;
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: m */
    public final Object mo304m(int i7) {
        int mo23892t = mo23892t(i7);
        return m23935y(mo23894x(mo23892t), mo23888D(mo23892t).mo304m(i7 - mo23895z(mo23892t)));
    }

    @Override // p232g0.AbstractC4303I
    /* renamed from: o */
    public final AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
        int mo23893u = mo23893u(i7);
        int mo23887A = mo23887A(mo23893u);
        int mo23895z = mo23895z(mo23893u);
        mo23888D(mo23893u).mo305o(i7 - mo23887A, cVar, j7);
        Object mo23894x = mo23894x(mo23893u);
        if (!AbstractC4303I.c.f14822q.equals(cVar.f14832a)) {
            mo23894x = m23935y(mo23894x, cVar.f14832a);
        }
        cVar.f14832a = mo23894x;
        cVar.f14845n += mo23895z;
        cVar.f14846o += mo23895z;
        return cVar;
    }

    /* renamed from: s */
    public abstract int mo23891s(Object obj);

    /* renamed from: t */
    public abstract int mo23892t(int i7);

    /* renamed from: u */
    public abstract int mo23893u(int i7);

    /* renamed from: x */
    public abstract Object mo23894x(int i7);

    /* renamed from: z */
    public abstract int mo23895z(int i7);
}
