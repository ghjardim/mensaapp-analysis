package p054H4;

import java.util.ArrayList;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.w */
/* loaded from: classes.dex */
public class C0587w {

    /* renamed from: a */
    public final C0659k f2038a;

    /* renamed from: b */
    public b f2039b;

    /* renamed from: c */
    public final C0659k.c f2040c;

    /* renamed from: H4.w$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0587w.this.f2039b == null) {
                AbstractC6917b.m28358f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = c0658j.f2254a;
            Object obj = c0658j.f2255b;
            AbstractC6917b.m28358f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.mo2316c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                C0587w.this.f2039b.mo2346a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e7) {
                dVar.mo2315b("error", e7.getMessage(), null);
            }
        }
    }

    /* renamed from: H4.w$b */
    public interface b {
        /* renamed from: a */
        void mo2346a(String str, String str2, C0659k.d dVar);
    }

    public C0587w(C7146a c7146a) {
        a aVar = new a();
        this.f2040c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/spellcheck", C0665q.f2269b);
        this.f2038a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: b */
    public void m2345b(b bVar) {
        this.f2039b = bVar;
    }
}
