package p256j$.time.chrono;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p256j$.time.C4822c;
import p256j$.time.C4888i;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.A */
/* loaded from: classes3.dex */
public final class C4823A implements InterfaceC4849o, Serializable {

    /* renamed from: d */
    public static final C4823A f17900d;

    /* renamed from: e */
    private static final C4823A[] f17901e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a */
    private final transient int f17902a;

    /* renamed from: b */
    private final transient C4888i f17903b;

    /* renamed from: c */
    private final transient String f17904c;

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final /* synthetic */ boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21025i(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final /* synthetic */ int mo20910m(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21022f(this, (EnumC4900a) interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final /* synthetic */ long mo20914s(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21023g(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final /* synthetic */ Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return AbstractC4843i.m21029m(this, interfaceC4917r);
    }

    static {
        C4823A c4823a = new C4823A(-1, C4888i.m21113V(1868, 1, 1), "Meiji");
        f17900d = c4823a;
        f17901e = new C4823A[]{c4823a, new C4823A(0, C4888i.m21113V(1912, 7, 30), "Taisho"), new C4823A(1, C4888i.m21113V(1926, 12, 25), "Showa"), new C4823A(2, C4888i.m21113V(1989, 1, 8), "Heisei"), new C4823A(3, C4888i.m21113V(2019, 5, 1), "Reiwa")};
    }

    /* renamed from: r */
    static C4823A m20976r() {
        return f17901e[r0.length - 1];
    }

    /* renamed from: D */
    static long m20974D() {
        int m21121Q = 1000000000 - m20976r().f17903b.m21121Q();
        C4823A[] c4823aArr = f17901e;
        int m21121Q2 = c4823aArr[0].f17903b.m21121Q();
        for (int i7 = 1; i7 < c4823aArr.length; i7++) {
            C4823A c4823a = c4823aArr[i7];
            m21121Q = Math.min(m21121Q, (c4823a.f17903b.m21121Q() - m21121Q2) + 1);
            m21121Q2 = c4823a.f17903b.m21121Q();
        }
        return m21121Q;
    }

    /* renamed from: C */
    static long m20973C() {
        long m21204f = EnumC4900a.DAY_OF_YEAR.mo21172l().m21204f();
        for (C4823A c4823a : f17901e) {
            m21204f = Math.min(m21204f, ((c4823a.f17903b.m21123S() ? 366 : 365) - c4823a.f17903b.m21119N()) + 1);
            if (c4823a.m20980x() != null) {
                m21204f = Math.min(m21204f, c4823a.m20980x().f17903b.m21119N() - 1);
            }
        }
        return m21204f;
    }

    private C4823A(int i7, C4888i c4888i, String str) {
        this.f17902a = i7;
        this.f17903b = c4888i;
        this.f17904c = str;
    }

    /* renamed from: v */
    final C4888i m20979v() {
        return this.f17903b;
    }

    /* renamed from: y */
    public static C4823A m20977y(int i7) {
        int i8 = i7 + 1;
        if (i8 >= 0) {
            C4823A[] c4823aArr = f17901e;
            if (i8 < c4823aArr.length) {
                return c4823aArr[i8];
            }
        }
        throw new C4822c("Invalid era: " + i7);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(getValue(), EnumC4900a.ERA);
    }

    /* renamed from: k */
    static C4823A m20975k(C4888i c4888i) {
        if (c4888i.m21122R(C4860z.f17961d)) {
            throw new C4822c("JapaneseDate before Meiji 6 are not supported");
        }
        C4823A[] c4823aArr = f17901e;
        for (int length = c4823aArr.length - 1; length >= 0; length--) {
            C4823A c4823a = c4823aArr[length];
            if (c4888i.compareTo(c4823a.f17903b) >= 0) {
                return c4823a;
            }
        }
        return null;
    }

    @Override // p256j$.time.chrono.InterfaceC4849o
    public final int getValue() {
        return this.f17902a;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        EnumC4900a enumC4900a = EnumC4900a.ERA;
        if (interfaceC4915p != enumC4900a) {
            return AbstractC4911l.m21189d(this, interfaceC4915p);
        }
        return C4858x.f17959d.mo20981C(enumC4900a);
    }

    /* renamed from: x */
    final C4823A m20980x() {
        if (this == m20976r()) {
            return null;
        }
        return m20977y(this.f17902a + 1);
    }

    public final String toString() {
        return this.f17904c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4829G((byte) 5, this);
    }

    /* renamed from: G */
    final void m20978G(DataOutput dataOutput) {
        dataOutput.writeByte(this.f17902a);
    }
}
