package p054H4;

import android.os.Build;
import p061I4.C0655g;
import p061I4.C0658j;
import p061I4.C0659k;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.u */
/* loaded from: classes.dex */
public class C0585u {

    /* renamed from: a */
    public final C0659k f2017a;

    /* renamed from: b */
    public b f2018b;

    /* renamed from: c */
    public final C0659k.c f2019c;

    /* renamed from: H4.u$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0585u.this.f2018b == null) {
                AbstractC6917b.m28358f("ScribeChannel", "No ScribeMethodHandler registered. Scribe call not handled.");
            }
            String str = c0658j.f2254a;
            AbstractC6917b.m28358f("ScribeChannel", "Received '" + str + "' message.");
            str.hashCode();
            switch (str) {
                case "Scribe.isFeatureAvailable":
                    C0585u.this.m2321e(c0658j, dVar);
                    break;
                case "Scribe.startStylusHandwriting":
                    C0585u.this.m2324h(c0658j, dVar);
                    break;
                case "Scribe.isStylusHandwritingAvailable":
                    C0585u.this.m2322f(c0658j, dVar);
                    break;
                default:
                    dVar.mo2316c();
                    break;
            }
        }
    }

    /* renamed from: H4.u$b */
    public interface b {
        /* renamed from: a */
        void mo2325a();

        /* renamed from: b */
        boolean mo2326b();

        /* renamed from: c */
        boolean mo2327c();
    }

    public C0585u(C7146a c7146a) {
        a aVar = new a();
        this.f2019c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/scribe", C0655g.f2253a);
        this.f2017a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: e */
    public final void m2321e(C0658j c0658j, C0659k.d dVar) {
        try {
            dVar.mo2314a(Boolean.valueOf(this.f2018b.mo2327c()));
        } catch (IllegalStateException e7) {
            dVar.mo2315b("error", e7.getMessage(), null);
        }
    }

    /* renamed from: f */
    public final void m2322f(C0658j c0658j, C0659k.d dVar) {
        if (Build.VERSION.SDK_INT < 34) {
            dVar.mo2315b("error", "Requires API level 34 or higher.", null);
            return;
        }
        try {
            dVar.mo2314a(Boolean.valueOf(this.f2018b.mo2326b()));
        } catch (IllegalStateException e7) {
            dVar.mo2315b("error", e7.getMessage(), null);
        }
    }

    /* renamed from: g */
    public void m2323g(b bVar) {
        this.f2018b = bVar;
    }

    /* renamed from: h */
    public final void m2324h(C0658j c0658j, C0659k.d dVar) {
        if (Build.VERSION.SDK_INT < 33) {
            dVar.mo2315b("error", "Requires API level 33 or higher.", null);
            return;
        }
        try {
            this.f2018b.mo2325a();
            dVar.mo2314a(null);
        } catch (IllegalStateException e7) {
            dVar.mo2315b("error", e7.getMessage(), null);
        }
    }
}
