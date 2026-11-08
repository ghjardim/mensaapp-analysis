package p256j$.time.format;

import p256j$.time.chrono.C4855u;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.EnumC4900a;

/* renamed from: j$.time.format.m */
/* loaded from: classes3.dex */
final class C4876m implements InterfaceC4869f {

    /* renamed from: a */
    private final EnumC4900a f17997a;

    /* renamed from: b */
    private final EnumC4885v f17998b;

    /* renamed from: c */
    private final C4865b f17999c;

    /* renamed from: d */
    private volatile C4872i f18000d;

    C4876m(EnumC4900a enumC4900a, EnumC4885v enumC4885v, C4865b c4865b) {
        this.f17997a = enumC4900a;
        this.f17998b = enumC4885v;
        this.f17999c = c4865b;
    }

    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        String m21107a;
        Long m21104e = c4879p.m21104e(this.f17997a);
        if (m21104e == null) {
            return false;
        }
        InterfaceC4848n interfaceC4848n = (InterfaceC4848n) c4879p.m21103d().mo20915w(AbstractC4911l.m21190e());
        if (interfaceC4848n == null || interfaceC4848n == C4855u.f17955d) {
            C4865b c4865b = this.f17999c;
            long longValue = m21104e.longValue();
            EnumC4885v enumC4885v = this.f17998b;
            c4879p.m21102c();
            m21107a = c4865b.f17977a.m21107a(longValue, enumC4885v);
        } else {
            C4865b c4865b2 = this.f17999c;
            long longValue2 = m21104e.longValue();
            EnumC4885v enumC4885v2 = this.f17998b;
            c4879p.m21102c();
            m21107a = c4865b2.f17977a.m21107a(longValue2, enumC4885v2);
        }
        if (m21107a != null) {
            sb.append(m21107a);
            return true;
        }
        if (this.f18000d == null) {
            this.f18000d = new C4872i(this.f17997a, 1, 19, EnumC4884u.NORMAL);
        }
        return this.f18000d.mo21072l(c4879p, sb);
    }

    public final String toString() {
        EnumC4885v enumC4885v = EnumC4885v.FULL;
        EnumC4900a enumC4900a = this.f17997a;
        EnumC4885v enumC4885v2 = this.f17998b;
        if (enumC4885v2 == enumC4885v) {
            return "Text(" + enumC4900a + ")";
        }
        return "Text(" + enumC4900a + "," + enumC4885v2 + ")";
    }
}
