package com.google.protobuf;

import com.google.protobuf.AbstractC4049f;
import java.util.Iterator;
import java.util.Map;
import p207d.AbstractC4094d;

/* renamed from: com.google.protobuf.Z */
/* loaded from: classes.dex */
public final class C4038Z implements InterfaceC4066n0 {

    /* renamed from: a */
    public final InterfaceC4034V f13351a;

    /* renamed from: b */
    public final AbstractC4082v0 f13352b;

    /* renamed from: c */
    public final boolean f13353c;

    /* renamed from: d */
    public final AbstractC4073r f13354d;

    public C4038Z(AbstractC4082v0 abstractC4082v0, AbstractC4073r abstractC4073r, InterfaceC4034V interfaceC4034V) {
        this.f13352b = abstractC4082v0;
        this.f13353c = abstractC4073r.mo16913e(interfaceC4034V);
        this.f13354d = abstractC4073r;
        this.f13351a = interfaceC4034V;
    }

    /* renamed from: j */
    private int m16407j(AbstractC4082v0 abstractC4082v0, Object obj) {
        return abstractC4082v0.mo16973i(abstractC4082v0.mo16971g(obj));
    }

    /* renamed from: k */
    private void m16408k(AbstractC4082v0 abstractC4082v0, AbstractC4073r abstractC4073r, Object obj, InterfaceC4062l0 interfaceC4062l0, C4071q c4071q) {
        Object mo16970f = abstractC4082v0.mo16970f(obj);
        C4079u mo16912d = abstractC4073r.mo16912d(obj);
        do {
            try {
                if (interfaceC4062l0.mo16676w() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC4082v0.mo16979o(obj, mo16970f);
            }
        } while (m16410m(interfaceC4062l0, c4071q, abstractC4073r, mo16912d, abstractC4082v0, mo16970f));
    }

    /* renamed from: l */
    public static C4038Z m16409l(AbstractC4082v0 abstractC4082v0, AbstractC4073r abstractC4073r, InterfaceC4034V interfaceC4034V) {
        return new C4038Z(abstractC4082v0, abstractC4073r, interfaceC4034V);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: a */
    public void mo16366a(Object obj, Object obj2) {
        AbstractC4070p0.m16828F(this.f13352b, obj, obj2);
        if (this.f13353c) {
            AbstractC4070p0.m16826D(this.f13354d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: b */
    public void mo16367b(Object obj) {
        this.f13352b.mo16974j(obj);
        this.f13354d.mo16914f(obj);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: c */
    public final boolean mo16369c(Object obj) {
        return this.f13354d.mo16911c(obj).m16952k();
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: d */
    public boolean mo16371d(Object obj, Object obj2) {
        if (!this.f13352b.mo16971g(obj).equals(this.f13352b.mo16971g(obj2))) {
            return false;
        }
        if (this.f13353c) {
            return this.f13354d.mo16911c(obj).equals(this.f13354d.mo16911c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: e */
    public int mo16373e(Object obj) {
        int m16407j = m16407j(this.f13352b, obj);
        return this.f13353c ? m16407j + this.f13354d.mo16911c(obj).m16948f() : m16407j;
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: f */
    public int mo16375f(Object obj) {
        int hashCode = this.f13352b.mo16971g(obj).hashCode();
        return this.f13353c ? (hashCode * 53) + this.f13354d.mo16911c(obj).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: g */
    public void mo16377g(Object obj, InterfaceC4016C0 interfaceC4016C0) {
        Iterator m16953n = this.f13354d.mo16911c(obj).m16953n();
        if (m16953n.hasNext()) {
            AbstractC4094d.m17162a(((Map.Entry) m16953n.next()).getKey());
            throw null;
        }
        m16411n(this.f13352b, obj, interfaceC4016C0);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: h */
    public void mo16379h(Object obj, InterfaceC4062l0 interfaceC4062l0, C4071q c4071q) {
        m16408k(this.f13352b, this.f13354d, obj, interfaceC4062l0, c4071q);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: i */
    public void mo16381i(Object obj, byte[] bArr, int i7, int i8, AbstractC4049f.a aVar) {
        AbstractC4087y abstractC4087y = (AbstractC4087y) obj;
        if (abstractC4087y.unknownFields == C4084w0.m16986c()) {
            abstractC4087y.unknownFields = C4084w0.m16990k();
        }
        AbstractC4094d.m17162a(obj);
        throw null;
    }

    /* renamed from: m */
    public final boolean m16410m(InterfaceC4062l0 interfaceC4062l0, C4071q c4071q, AbstractC4073r abstractC4073r, C4079u c4079u, AbstractC4082v0 abstractC4082v0, Object obj) {
        int mo16670q = interfaceC4062l0.mo16670q();
        int i7 = 0;
        if (mo16670q != AbstractC4014B0.f13238a) {
            if (AbstractC4014B0.m16179b(mo16670q) != 2) {
                return interfaceC4062l0.mo16631C();
            }
            Object mo16910b = abstractC4073r.mo16910b(c4071q, this.f13351a, AbstractC4014B0.m16178a(mo16670q));
            if (mo16910b == null) {
                return abstractC4082v0.m16977m(obj, interfaceC4062l0, 0);
            }
            abstractC4073r.mo16916h(interfaceC4062l0, mo16910b, c4071q, c4079u);
            return true;
        }
        Object obj2 = null;
        AbstractC4055i abstractC4055i = null;
        while (interfaceC4062l0.mo16676w() != Integer.MAX_VALUE) {
            int mo16670q2 = interfaceC4062l0.mo16670q();
            if (mo16670q2 == AbstractC4014B0.f13240c) {
                i7 = interfaceC4062l0.mo16664k();
                obj2 = abstractC4073r.mo16910b(c4071q, this.f13351a, i7);
            } else if (mo16670q2 == AbstractC4014B0.f13241d) {
                if (obj2 != null) {
                    abstractC4073r.mo16916h(interfaceC4062l0, obj2, c4071q, c4079u);
                } else {
                    abstractC4055i = interfaceC4062l0.mo16679z();
                }
            } else if (!interfaceC4062l0.mo16631C()) {
                break;
            }
        }
        if (interfaceC4062l0.mo16670q() != AbstractC4014B0.f13239b) {
            throw C4017D.m16237b();
        }
        if (abstractC4055i != null) {
            if (obj2 != null) {
                abstractC4073r.mo16917i(abstractC4055i, obj2, c4071q, c4079u);
            } else {
                abstractC4082v0.mo16968d(obj, i7, abstractC4055i);
            }
        }
        return true;
    }

    /* renamed from: n */
    public final void m16411n(AbstractC4082v0 abstractC4082v0, Object obj, InterfaceC4016C0 interfaceC4016C0) {
        abstractC4082v0.mo16983s(abstractC4082v0.mo16971g(obj), interfaceC4016C0);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    public Object newInstance() {
        InterfaceC4034V interfaceC4034V = this.f13351a;
        return interfaceC4034V instanceof AbstractC4087y ? ((AbstractC4087y) interfaceC4034V).m17044O() : interfaceC4034V.mo16316c().mo16321h();
    }
}
