package p292n0;

import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p232g0.C4297C;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5334c;

/* renamed from: n0.s */
/* loaded from: classes.dex */
public final class C5755s implements InterfaceC5766x0 {

    /* renamed from: a */
    public final C5717b1 f20943a;

    /* renamed from: b */
    public final a f20944b;

    /* renamed from: c */
    public InterfaceC5703V0 f20945c;

    /* renamed from: d */
    public InterfaceC5766x0 f20946d;

    /* renamed from: e */
    public boolean f20947e = true;

    /* renamed from: f */
    public boolean f20948f;

    /* renamed from: n0.s$a */
    public interface a {
        /* renamed from: p */
        void mo24281p(C4297C c4297c);
    }

    public C5755s(a aVar, InterfaceC5334c interfaceC5334c) {
        this.f20944b = aVar;
        this.f20943a = new C5717b1(interfaceC5334c);
    }

    /* renamed from: a */
    public void m24341a(InterfaceC5703V0 interfaceC5703V0) {
        if (interfaceC5703V0 == this.f20945c) {
            this.f20946d = null;
            this.f20945c = null;
            this.f20947e = true;
        }
    }

    /* renamed from: b */
    public void m24342b(InterfaceC5703V0 interfaceC5703V0) {
        InterfaceC5766x0 interfaceC5766x0;
        InterfaceC5766x0 mo23904H = interfaceC5703V0.mo23904H();
        if (mo23904H == null || mo23904H == (interfaceC5766x0 = this.f20946d)) {
            return;
        }
        if (interfaceC5766x0 != null) {
            throw C5759u.m24361d(new IllegalStateException("Multiple renderer media clocks enabled."), PipesIterator.DEFAULT_QUEUE_SIZE);
        }
        this.f20946d = mo23904H;
        this.f20945c = interfaceC5703V0;
        mo23904H.mo23945d(this.f20943a.mo23946i());
    }

    /* renamed from: c */
    public void m24343c(long j7) {
        this.f20943a.m23942a(j7);
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: d */
    public void mo23945d(C4297C c4297c) {
        InterfaceC5766x0 interfaceC5766x0 = this.f20946d;
        if (interfaceC5766x0 != null) {
            interfaceC5766x0.mo23945d(c4297c);
            c4297c = this.f20946d.mo23946i();
        }
        this.f20943a.mo23945d(c4297c);
    }

    /* renamed from: e */
    public final boolean m24344e(boolean z6) {
        InterfaceC5703V0 interfaceC5703V0 = this.f20945c;
        return interfaceC5703V0 == null || interfaceC5703V0.mo1253c() || (z6 && this.f20945c.mo23905e() != 2) || (!this.f20945c.mo1251b() && (z6 || this.f20945c.mo23909o()));
    }

    /* renamed from: f */
    public void m24345f() {
        this.f20948f = true;
        this.f20943a.m23943b();
    }

    /* renamed from: g */
    public void m24346g() {
        this.f20948f = false;
        this.f20943a.m23944c();
    }

    /* renamed from: h */
    public long m24347h(boolean z6) {
        m24348j(z6);
        return mo23947u();
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: i */
    public C4297C mo23946i() {
        InterfaceC5766x0 interfaceC5766x0 = this.f20946d;
        return interfaceC5766x0 != null ? interfaceC5766x0.mo23946i() : this.f20943a.mo23946i();
    }

    /* renamed from: j */
    public final void m24348j(boolean z6) {
        if (m24344e(z6)) {
            this.f20947e = true;
            if (this.f20948f) {
                this.f20943a.m23943b();
                return;
            }
            return;
        }
        InterfaceC5766x0 interfaceC5766x0 = (InterfaceC5766x0) AbstractC5332a.m21800e(this.f20946d);
        long mo23947u = interfaceC5766x0.mo23947u();
        if (this.f20947e) {
            if (mo23947u < this.f20943a.mo23947u()) {
                this.f20943a.m23944c();
                return;
            } else {
                this.f20947e = false;
                if (this.f20948f) {
                    this.f20943a.m23943b();
                }
            }
        }
        this.f20943a.m23942a(mo23947u);
        C4297C mo23946i = interfaceC5766x0.mo23946i();
        if (mo23946i.equals(this.f20943a.mo23946i())) {
            return;
        }
        this.f20943a.mo23945d(mo23946i);
        this.f20944b.mo24281p(mo23946i);
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: u */
    public long mo23947u() {
        return this.f20947e ? this.f20943a.mo23947u() : ((InterfaceC5766x0) AbstractC5332a.m21800e(this.f20946d)).mo23947u();
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: y */
    public boolean mo23948y() {
        return this.f20947e ? this.f20943a.mo23948y() : ((InterfaceC5766x0) AbstractC5332a.m21800e(this.f20946d)).mo23948y();
    }
}
