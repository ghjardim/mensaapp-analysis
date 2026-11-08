package p088M3;

import p272k4.C5413D;

/* renamed from: M3.s */
/* loaded from: classes.dex */
public final class C1177s implements InterfaceC1167i {

    /* renamed from: b */
    public final C1170l f3775b;

    /* renamed from: c */
    public b f3776c;

    /* renamed from: d */
    public C1181w f3777d;

    /* renamed from: e */
    public C1181w f3778e;

    /* renamed from: f */
    public C1178t f3779f;

    /* renamed from: g */
    public a f3780g;

    /* renamed from: M3.s$a */
    public enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* renamed from: M3.s$b */
    public enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    public C1177s(C1170l c1170l) {
        this.f3775b = c1170l;
        this.f3778e = C1181w.f3793b;
    }

    /* renamed from: p */
    public static C1177s m4538p(C1170l c1170l, C1181w c1181w, C1178t c1178t) {
        return new C1177s(c1170l).m4542l(c1181w, c1178t);
    }

    /* renamed from: q */
    public static C1177s m4539q(C1170l c1170l) {
        b bVar = b.INVALID;
        C1181w c1181w = C1181w.f3793b;
        return new C1177s(c1170l, bVar, c1181w, c1181w, new C1178t(), a.SYNCED);
    }

    /* renamed from: r */
    public static C1177s m4540r(C1170l c1170l, C1181w c1181w) {
        return new C1177s(c1170l).m4543m(c1181w);
    }

    /* renamed from: s */
    public static C1177s m4541s(C1170l c1170l, C1181w c1181w) {
        return new C1177s(c1170l).m4544n(c1181w);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: a */
    public C1178t mo4480a() {
        return this.f3779f;
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: b */
    public C1177s mo4481b() {
        return new C1177s(this.f3775b, this.f3776c, this.f3777d, this.f3778e, this.f3779f.clone(), this.f3780g);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: c */
    public boolean mo4482c() {
        return this.f3776c.equals(b.FOUND_DOCUMENT);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: d */
    public boolean mo4483d() {
        return this.f3780g.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: e */
    public boolean mo4484e() {
        return this.f3780g.equals(a.HAS_LOCAL_MUTATIONS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1177s.class != obj.getClass()) {
            return false;
        }
        C1177s c1177s = (C1177s) obj;
        if (this.f3775b.equals(c1177s.f3775b) && this.f3777d.equals(c1177s.f3777d) && this.f3776c.equals(c1177s.f3776c) && this.f3780g.equals(c1177s.f3780g)) {
            return this.f3779f.equals(c1177s.f3779f);
        }
        return false;
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: f */
    public C5413D mo4485f(C1176r c1176r) {
        return mo4480a().m4558i(c1176r);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: g */
    public boolean mo4486g() {
        return mo4484e() || mo4483d();
    }

    @Override // p088M3.InterfaceC1167i
    public C1170l getKey() {
        return this.f3775b;
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: h */
    public C1181w mo4487h() {
        return this.f3778e;
    }

    public int hashCode() {
        return this.f3775b.hashCode();
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: i */
    public boolean mo4488i() {
        return this.f3776c.equals(b.NO_DOCUMENT);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: j */
    public boolean mo4489j() {
        return this.f3776c.equals(b.UNKNOWN_DOCUMENT);
    }

    @Override // p088M3.InterfaceC1167i
    /* renamed from: k */
    public C1181w mo4490k() {
        return this.f3777d;
    }

    /* renamed from: l */
    public C1177s m4542l(C1181w c1181w, C1178t c1178t) {
        this.f3777d = c1181w;
        this.f3776c = b.FOUND_DOCUMENT;
        this.f3779f = c1178t;
        this.f3780g = a.SYNCED;
        return this;
    }

    /* renamed from: m */
    public C1177s m4543m(C1181w c1181w) {
        this.f3777d = c1181w;
        this.f3776c = b.NO_DOCUMENT;
        this.f3779f = new C1178t();
        this.f3780g = a.SYNCED;
        return this;
    }

    /* renamed from: n */
    public C1177s m4544n(C1181w c1181w) {
        this.f3777d = c1181w;
        this.f3776c = b.UNKNOWN_DOCUMENT;
        this.f3779f = new C1178t();
        this.f3780g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    /* renamed from: o */
    public boolean m4545o() {
        return !this.f3776c.equals(b.INVALID);
    }

    /* renamed from: t */
    public C1177s m4546t() {
        this.f3780g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f3775b + ", version=" + this.f3777d + ", readTime=" + this.f3778e + ", type=" + this.f3776c + ", documentState=" + this.f3780g + ", value=" + this.f3779f + '}';
    }

    /* renamed from: u */
    public C1177s m4547u() {
        this.f3780g = a.HAS_LOCAL_MUTATIONS;
        this.f3777d = C1181w.f3793b;
        return this;
    }

    /* renamed from: v */
    public C1177s m4548v(C1181w c1181w) {
        this.f3778e = c1181w;
        return this;
    }

    public C1177s(C1170l c1170l, b bVar, C1181w c1181w, C1181w c1181w2, C1178t c1178t, a aVar) {
        this.f3775b = c1170l;
        this.f3777d = c1181w;
        this.f3778e = c1181w2;
        this.f3776c = bVar;
        this.f3780g = aVar;
        this.f3779f = c1178t;
    }
}
