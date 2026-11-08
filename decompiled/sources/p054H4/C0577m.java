package p054H4;

import java.util.HashMap;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.m */
/* loaded from: classes.dex */
public class C0577m {

    /* renamed from: a */
    public final C0659k f1880a;

    /* renamed from: b */
    public b f1881b;

    /* renamed from: c */
    public final C0659k.c f1882c;

    /* renamed from: H4.m$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0577m.this.f1881b == null) {
                return;
            }
            String str = c0658j.f2254a;
            AbstractC6917b.m28358f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        C0577m.this.f1881b.mo2211a((String) ((HashMap) c0658j.f2255b).get("kind"));
                        dVar.mo2314a(Boolean.TRUE);
                    } catch (Exception e7) {
                        dVar.mo2315b("error", "Error when setting cursors: " + e7.getMessage(), null);
                    }
                }
            } catch (Exception e8) {
                dVar.mo2315b("error", "Unhandled error: " + e8.getMessage(), null);
            }
        }
    }

    /* renamed from: H4.m$b */
    public interface b {
        /* renamed from: a */
        void mo2211a(String str);
    }

    public C0577m(C7146a c7146a) {
        a aVar = new a();
        this.f1882c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/mousecursor", C0665q.f2269b);
        this.f1880a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: b */
    public void m2210b(b bVar) {
        this.f1881b = bVar;
    }
}
