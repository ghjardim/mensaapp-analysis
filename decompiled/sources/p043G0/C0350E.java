package p043G0;

import p232g0.C4306L;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p292n0.C5709Y0;

/* renamed from: G0.E */
/* loaded from: classes.dex */
public final class C0350E {

    /* renamed from: a */
    public final int f1301a;

    /* renamed from: b */
    public final C5709Y0[] f1302b;

    /* renamed from: c */
    public final InterfaceC0375y[] f1303c;

    /* renamed from: d */
    public final C4306L f1304d;

    /* renamed from: e */
    public final Object f1305e;

    public C0350E(C5709Y0[] c5709y0Arr, InterfaceC0375y[] interfaceC0375yArr, C4306L c4306l, Object obj) {
        AbstractC5332a.m21796a(c5709y0Arr.length == interfaceC0375yArr.length);
        this.f1302b = c5709y0Arr;
        this.f1303c = (InterfaceC0375y[]) interfaceC0375yArr.clone();
        this.f1304d = c4306l;
        this.f1305e = obj;
        this.f1301a = c5709y0Arr.length;
    }

    /* renamed from: a */
    public boolean m1384a(C0350E c0350e) {
        if (c0350e == null || c0350e.f1303c.length != this.f1303c.length) {
            return false;
        }
        for (int i7 = 0; i7 < this.f1303c.length; i7++) {
            if (!m1385b(c0350e, i7)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m1385b(C0350E c0350e, int i7) {
        return c0350e != null && AbstractC5330M.m21729c(this.f1302b[i7], c0350e.f1302b[i7]) && AbstractC5330M.m21729c(this.f1303c[i7], c0350e.f1303c[i7]);
    }

    /* renamed from: c */
    public boolean m1386c(int i7) {
        return this.f1302b[i7] != null;
    }
}
