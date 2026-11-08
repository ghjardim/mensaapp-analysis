package p054H4;

import java.util.HashMap;
import java.util.Map;
import p005A4.InterfaceC0021a;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.C6916a;
import p391z4.C7146a;

/* renamed from: H4.g */
/* loaded from: classes.dex */
public class C0571g {

    /* renamed from: a */
    public final C0659k f1852a;

    /* renamed from: b */
    public Map f1853b;

    /* renamed from: c */
    public final C0659k.c f1854c;

    /* renamed from: H4.g$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            C0571g.m2186a(C0571g.this);
        }
    }

    public C0571g(C7146a c7146a) {
        a aVar = new a();
        this.f1854c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/deferredcomponent", C0665q.f2269b);
        this.f1852a = c0659k;
        c0659k.m2654e(aVar);
        C6916a.m28346e().m28347a();
        this.f1853b = new HashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC0021a m2186a(C0571g c0571g) {
        c0571g.getClass();
        return null;
    }
}
