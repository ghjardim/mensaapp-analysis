package p060I3;

import p088M3.C1181w;

/* renamed from: I3.j */
/* loaded from: classes.dex */
public class C0648j implements InterfaceC0641c {

    /* renamed from: a */
    public final String f2227a;

    /* renamed from: b */
    public final C0647i f2228b;

    /* renamed from: c */
    public final C1181w f2229c;

    public C0648j(String str, C0647i c0647i, C1181w c1181w) {
        this.f2227a = str;
        this.f2228b = c0647i;
        this.f2229c = c1181w;
    }

    /* renamed from: a */
    public C0647i m2607a() {
        return this.f2228b;
    }

    /* renamed from: b */
    public String m2608b() {
        return this.f2227a;
    }

    /* renamed from: c */
    public C1181w m2609c() {
        return this.f2229c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0648j c0648j = (C0648j) obj;
        if (this.f2227a.equals(c0648j.f2227a) && this.f2228b.equals(c0648j.f2228b)) {
            return this.f2229c.equals(c0648j.f2229c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2227a.hashCode() * 31) + this.f2228b.hashCode()) * 31) + this.f2229c.hashCode();
    }
}
