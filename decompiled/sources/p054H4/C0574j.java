package p054H4;

import java.util.HashMap;
import java.util.Map;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p061I4.InterfaceC0651c;

/* renamed from: H4.j */
/* loaded from: classes.dex */
public class C0574j {

    /* renamed from: a */
    public final C0659k f1860a;

    /* renamed from: b */
    public b f1861b;

    /* renamed from: c */
    public final C0659k.c f1862c;

    /* renamed from: H4.j$a */
    public class a implements C0659k.c {

        /* renamed from: c */
        public Map f1863c = new HashMap();

        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0574j.this.f1861b == null) {
                dVar.mo2314a(this.f1863c);
                return;
            }
            String str = c0658j.f2254a;
            str.hashCode();
            if (!str.equals("getKeyboardState")) {
                dVar.mo2316c();
                return;
            }
            try {
                this.f1863c = C0574j.this.f1861b.mo2196b();
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", e7.getMessage(), null);
            }
            dVar.mo2314a(this.f1863c);
        }
    }

    /* renamed from: H4.j$b */
    public interface b {
        /* renamed from: b */
        Map mo2196b();
    }

    public C0574j(InterfaceC0651c interfaceC0651c) {
        a aVar = new a();
        this.f1862c = aVar;
        C0659k c0659k = new C0659k(interfaceC0651c, "flutter/keyboard", C0665q.f2269b);
        this.f1860a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: b */
    public void m2195b(b bVar) {
        this.f1861b = bVar;
    }
}
