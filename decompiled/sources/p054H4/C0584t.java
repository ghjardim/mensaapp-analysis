package p054H4;

import java.util.HashMap;
import java.util.Map;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.C0665q;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.t */
/* loaded from: classes.dex */
public class C0584t {

    /* renamed from: a */
    public final boolean f2007a;

    /* renamed from: b */
    public byte[] f2008b;

    /* renamed from: c */
    public C0659k f2009c;

    /* renamed from: d */
    public C0659k.d f2010d;

    /* renamed from: e */
    public boolean f2011e;

    /* renamed from: f */
    public boolean f2012f;

    /* renamed from: g */
    public final C0659k.c f2013g;

    /* renamed from: H4.t$b */
    public class b implements C0659k.c {
        public b() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            String str = c0658j.f2254a;
            Object obj = c0658j.f2255b;
            str.hashCode();
            if (!str.equals("get")) {
                if (!str.equals("put")) {
                    dVar.mo2316c();
                    return;
                }
                C0584t.this.f2008b = (byte[]) obj;
                dVar.mo2314a(null);
                return;
            }
            C0584t.this.f2012f = true;
            if (!C0584t.this.f2011e) {
                C0584t c0584t = C0584t.this;
                if (c0584t.f2007a) {
                    c0584t.f2010d = dVar;
                    return;
                }
            }
            C0584t c0584t2 = C0584t.this;
            dVar.mo2314a(c0584t2.m2312i(c0584t2.f2008b));
        }
    }

    public C0584t(C7146a c7146a, boolean z6) {
        this(new C0659k(c7146a, "flutter/restoration", C0665q.f2269b), z6);
    }

    /* renamed from: g */
    public void m2310g() {
        this.f2008b = null;
    }

    /* renamed from: h */
    public byte[] m2311h() {
        return this.f2008b;
    }

    /* renamed from: i */
    public final Map m2312i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    /* renamed from: j */
    public void m2313j(byte[] bArr) {
        this.f2011e = true;
        C0659k.d dVar = this.f2010d;
        if (dVar != null) {
            dVar.mo2314a(m2312i(bArr));
            this.f2010d = null;
            this.f2008b = bArr;
        } else if (this.f2012f) {
            this.f2009c.m2653d("push", m2312i(bArr), new a(bArr));
        } else {
            this.f2008b = bArr;
        }
    }

    public C0584t(C0659k c0659k, boolean z6) {
        this.f2011e = false;
        this.f2012f = false;
        b bVar = new b();
        this.f2013g = bVar;
        this.f2009c = c0659k;
        this.f2007a = z6;
        c0659k.m2654e(bVar);
    }

    /* renamed from: H4.t$a */
    public class a implements C0659k.d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f2014a;

        public a(byte[] bArr) {
            this.f2014a = bArr;
        }

        @Override // p061I4.C0659k.d
        /* renamed from: a */
        public void mo2314a(Object obj) {
            C0584t.this.f2008b = this.f2014a;
        }

        @Override // p061I4.C0659k.d
        /* renamed from: b */
        public void mo2315b(String str, String str2, Object obj) {
            AbstractC6917b.m28354b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // p061I4.C0659k.d
        /* renamed from: c */
        public void mo2316c() {
        }
    }
}
