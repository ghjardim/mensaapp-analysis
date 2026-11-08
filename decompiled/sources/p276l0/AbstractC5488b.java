package p276l0;

import java.util.ArrayList;
import java.util.Map;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public abstract class AbstractC5488b implements InterfaceC5493g {

    /* renamed from: a */
    public final boolean f19760a;

    /* renamed from: b */
    public final ArrayList f19761b = new ArrayList(1);

    /* renamed from: c */
    public int f19762c;

    /* renamed from: d */
    public C5497k f19763d;

    public AbstractC5488b(boolean z6) {
        this.f19760a = z6;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: c */
    public final void mo711c(InterfaceC5511y interfaceC5511y) {
        AbstractC5332a.m21800e(interfaceC5511y);
        if (this.f19761b.contains(interfaceC5511y)) {
            return;
        }
        this.f19761b.add(interfaceC5511y);
        this.f19762c++;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: n */
    public /* synthetic */ Map mo713n() {
        return AbstractC5492f.m23074a(this);
    }

    /* renamed from: v */
    public final void m23069v(int i7) {
        C5497k c5497k = (C5497k) AbstractC5330M.m21747i(this.f19763d);
        for (int i8 = 0; i8 < this.f19762c; i8++) {
            ((InterfaceC5511y) this.f19761b.get(i8)).mo2078g(this, c5497k, this.f19760a, i7);
        }
    }

    /* renamed from: w */
    public final void m23070w() {
        C5497k c5497k = (C5497k) AbstractC5330M.m21747i(this.f19763d);
        for (int i7 = 0; i7 < this.f19762c; i7++) {
            ((InterfaceC5511y) this.f19761b.get(i7)).mo2077e(this, c5497k, this.f19760a);
        }
        this.f19763d = null;
    }

    /* renamed from: x */
    public final void m23071x(C5497k c5497k) {
        for (int i7 = 0; i7 < this.f19762c; i7++) {
            ((InterfaceC5511y) this.f19761b.get(i7)).mo2079i(this, c5497k, this.f19760a);
        }
    }

    /* renamed from: y */
    public final void m23072y(C5497k c5497k) {
        this.f19763d = c5497k;
        for (int i7 = 0; i7 < this.f19762c; i7++) {
            ((InterfaceC5511y) this.f19761b.get(i7)).mo2076c(this, c5497k, this.f19760a);
        }
    }
}
