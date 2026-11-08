package p335s0;

import android.net.Uri;
import java.util.Map;
import p050H0.InterfaceC0544m;
import p178Z2.AbstractC3010Y;
import p203c3.AbstractC3577g;
import p232g0.C4331u;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5499m;
import p276l0.InterfaceC5493g;
import p335s0.C6348h;

/* renamed from: s0.l */
/* loaded from: classes.dex */
public final class C6352l implements InterfaceC6321A {

    /* renamed from: a */
    public final Object f22992a = new Object();

    /* renamed from: b */
    public C4331u.f f22993b;

    /* renamed from: c */
    public InterfaceC6364x f22994c;

    /* renamed from: d */
    public InterfaceC5493g.a f22995d;

    /* renamed from: e */
    public String f22996e;

    /* renamed from: f */
    public InterfaceC0544m f22997f;

    @Override // p335s0.InterfaceC6321A
    /* renamed from: a */
    public InterfaceC6364x mo26474a(C4331u c4331u) {
        InterfaceC6364x interfaceC6364x;
        AbstractC5332a.m21800e(c4331u.f15212b);
        C4331u.f fVar = c4331u.f15212b.f15306c;
        if (fVar == null) {
            return InterfaceC6364x.f23018a;
        }
        synchronized (this.f22992a) {
            try {
                if (!AbstractC5330M.m21729c(fVar, this.f22993b)) {
                    this.f22993b = fVar;
                    this.f22994c = m26629b(fVar);
                }
                interfaceC6364x = (InterfaceC6364x) AbstractC5332a.m21800e(this.f22994c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC6364x;
    }

    /* renamed from: b */
    public final InterfaceC6364x m26629b(C4331u.f fVar) {
        InterfaceC5493g.a aVar = this.f22995d;
        if (aVar == null) {
            aVar = new C5499m.b().m23118e(this.f22996e);
        }
        Uri uri = fVar.f15263c;
        C6335O c6335o = new C6335O(uri == null ? null : uri.toString(), fVar.f15268h, aVar);
        AbstractC3010Y it = fVar.f15265e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c6335o.m26538e((String) entry.getKey(), (String) entry.getValue());
        }
        C6348h.b m26619e = new C6348h.b().m26620f(fVar.f15261a, C6334N.f22898d).m26617c(fVar.f15266f).m26618d(fVar.f15267g).m26619e(AbstractC3577g.m14431n(fVar.f15270j));
        InterfaceC0544m interfaceC0544m = this.f22997f;
        if (interfaceC0544m != null) {
            m26619e.m26616b(interfaceC0544m);
        }
        C6348h m26615a = m26619e.m26615a(c6335o);
        m26615a.m26602F(0, fVar.m18294c());
        return m26615a;
    }
}
