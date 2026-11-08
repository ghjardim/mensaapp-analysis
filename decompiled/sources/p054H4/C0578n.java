package p054H4;

import java.util.HashMap;
import p061I4.C0655g;
import p061I4.C0658j;
import p061I4.C0659k;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.n */
/* loaded from: classes.dex */
public class C0578n {

    /* renamed from: a */
    public final C0659k f1884a;

    /* renamed from: b */
    public final C0659k.c f1885b;

    /* renamed from: H4.n$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            dVar.mo2314a(null);
        }
    }

    public C0578n(C7146a c7146a) {
        a aVar = new a();
        this.f1885b = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/navigation", C0655g.f2253a);
        this.f1884a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: a */
    public void m2212a() {
        AbstractC6917b.m28358f("NavigationChannel", "Sending message to pop route.");
        this.f1884a.m2652c("popRoute", null);
    }

    /* renamed from: b */
    public void m2213b(String str) {
        AbstractC6917b.m28358f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f1884a.m2652c("pushRouteInformation", hashMap);
    }

    /* renamed from: c */
    public void m2214c(String str) {
        AbstractC6917b.m28358f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f1884a.m2652c("setInitialRoute", str);
    }
}
