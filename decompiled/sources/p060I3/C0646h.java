package p060I3;

import java.util.List;
import p088M3.C1170l;
import p088M3.C1181w;

/* renamed from: I3.h */
/* loaded from: classes.dex */
public class C0646h implements InterfaceC0641c {

    /* renamed from: a */
    public final C1170l f2221a;

    /* renamed from: b */
    public final C1181w f2222b;

    /* renamed from: c */
    public final boolean f2223c;

    /* renamed from: d */
    public final List f2224d;

    public C0646h(C1170l c1170l, C1181w c1181w, boolean z6, List list) {
        this.f2221a = c1170l;
        this.f2222b = c1181w;
        this.f2223c = z6;
        this.f2224d = list;
    }

    /* renamed from: a */
    public boolean m2601a() {
        return this.f2223c;
    }

    /* renamed from: b */
    public C1170l m2602b() {
        return this.f2221a;
    }

    /* renamed from: c */
    public List m2603c() {
        return this.f2224d;
    }

    /* renamed from: d */
    public C1181w m2604d() {
        return this.f2222b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0646h c0646h = (C0646h) obj;
        if (this.f2223c == c0646h.f2223c && this.f2221a.equals(c0646h.f2221a) && this.f2222b.equals(c0646h.f2222b)) {
            return this.f2224d.equals(c0646h.f2224d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2221a.hashCode() * 31) + this.f2222b.hashCode()) * 31) + (this.f2223c ? 1 : 0)) * 31) + this.f2224d.hashCode();
    }
}
