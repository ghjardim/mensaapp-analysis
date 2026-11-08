package p054H4;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p391z4.C7146a;

/* renamed from: H4.s */
/* loaded from: classes.dex */
public class C0583s {

    /* renamed from: a */
    public final C0659k f2002a;

    /* renamed from: b */
    public final PackageManager f2003b;

    /* renamed from: c */
    public b f2004c;

    /* renamed from: d */
    public final C0659k.c f2005d;

    /* renamed from: H4.s$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            if (C0583s.this.f2004c == null) {
                return;
            }
            String str = c0658j.f2254a;
            Object obj = c0658j.f2255b;
            str.hashCode();
            if (!str.equals("ProcessText.processTextAction")) {
                if (!str.equals("ProcessText.queryTextActions")) {
                    dVar.mo2316c();
                    return;
                }
                try {
                    dVar.mo2314a(C0583s.this.f2004c.mo2303c());
                    return;
                } catch (IllegalStateException e7) {
                    dVar.mo2315b("error", e7.getMessage(), null);
                    return;
                }
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                C0583s.this.f2004c.mo2302b((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
            } catch (IllegalStateException e8) {
                dVar.mo2315b("error", e8.getMessage(), null);
            }
        }
    }

    /* renamed from: H4.s$b */
    public interface b {
        /* renamed from: b */
        void mo2302b(String str, String str2, boolean z6, C0659k.d dVar);

        /* renamed from: c */
        Map mo2303c();
    }

    public C0583s(C7146a c7146a, PackageManager packageManager) {
        a aVar = new a();
        this.f2005d = aVar;
        this.f2003b = packageManager;
        C0659k c0659k = new C0659k(c7146a, "flutter/processtext", C0665q.f2269b);
        this.f2002a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: b */
    public void m2301b(b bVar) {
        this.f2004c = bVar;
    }
}
