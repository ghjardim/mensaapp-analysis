package p327r0;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p178Z2.AbstractC3033v;
import p232g0.C4327q;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5332a;
import p319q0.InterfaceC6168g;
import p327r0.AbstractC6244k;

/* renamed from: r0.j */
/* loaded from: classes.dex */
public abstract class AbstractC6243j {

    /* renamed from: a */
    public final long f22337a;

    /* renamed from: b */
    public final C4327q f22338b;

    /* renamed from: c */
    public final AbstractC3033v f22339c;

    /* renamed from: d */
    public final long f22340d;

    /* renamed from: e */
    public final List f22341e;

    /* renamed from: f */
    public final List f22342f;

    /* renamed from: g */
    public final List f22343g;

    /* renamed from: h */
    public final C6242i f22344h;

    /* renamed from: r0.j$c */
    public static class c extends AbstractC6243j {

        /* renamed from: i */
        public final Uri f22346i;

        /* renamed from: j */
        public final long f22347j;

        /* renamed from: k */
        public final String f22348k;

        /* renamed from: l */
        public final C6242i f22349l;

        /* renamed from: m */
        public final C6246m f22350m;

        public c(long j7, C4327q c4327q, List list, AbstractC6244k.e eVar, List list2, List list3, List list4, String str, long j8) {
            super(j7, c4327q, list, eVar, list2, list3, list4);
            this.f22346i = Uri.parse(((C6235b) list.get(0)).f22284a);
            C6242i m26107c = eVar.m26107c();
            this.f22349l = m26107c;
            this.f22348k = str;
            this.f22347j = j8;
            this.f22350m = m26107c != null ? null : new C6246m(new C6242i(null, 0L, j8));
        }

        @Override // p327r0.AbstractC6243j
        /* renamed from: k */
        public String mo26091k() {
            return this.f22348k;
        }

        @Override // p327r0.AbstractC6243j
        /* renamed from: l */
        public InterfaceC6168g mo26092l() {
            return this.f22350m;
        }

        @Override // p327r0.AbstractC6243j
        /* renamed from: m */
        public C6242i mo26093m() {
            return this.f22349l;
        }
    }

    /* renamed from: o */
    public static AbstractC6243j m26090o(long j7, C4327q c4327q, List list, AbstractC6244k abstractC6244k, List list2, List list3, List list4, String str) {
        if (abstractC6244k instanceof AbstractC6244k.e) {
            return new c(j7, c4327q, list, (AbstractC6244k.e) abstractC6244k, list2, list3, list4, str, -1L);
        }
        if (abstractC6244k instanceof AbstractC6244k.a) {
            return new b(j7, c4327q, list, (AbstractC6244k.a) abstractC6244k, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: k */
    public abstract String mo26091k();

    /* renamed from: l */
    public abstract InterfaceC6168g mo26092l();

    /* renamed from: m */
    public abstract C6242i mo26093m();

    /* renamed from: n */
    public C6242i m26094n() {
        return this.f22344h;
    }

    public AbstractC6243j(long j7, C4327q c4327q, List list, AbstractC6244k abstractC6244k, List list2, List list3, List list4) {
        AbstractC5332a.m21796a(!list.isEmpty());
        this.f22337a = j7;
        this.f22338b = c4327q;
        this.f22339c = AbstractC3033v.m11048p(list);
        this.f22341e = list2 == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list2);
        this.f22342f = list3;
        this.f22343g = list4;
        this.f22344h = abstractC6244k.mo26095a(this);
        this.f22340d = abstractC6244k.m26096b();
    }

    /* renamed from: r0.j$b */
    public static class b extends AbstractC6243j implements InterfaceC6168g {

        /* renamed from: i */
        public final AbstractC6244k.a f22345i;

        public b(long j7, C4327q c4327q, List list, AbstractC6244k.a aVar, List list2, List list3, List list4) {
            super(j7, c4327q, list, aVar, list2, list3, list4);
            this.f22345i = aVar;
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: a */
        public long mo25734a(long j7, long j8) {
            return this.f22345i.m26102h(j7, j8);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: b */
        public long mo25735b(long j7, long j8) {
            return this.f22345i.m26098d(j7, j8);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: c */
        public long mo25736c(long j7) {
            return this.f22345i.m26104j(j7);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: d */
        public long mo25737d(long j7, long j8) {
            return this.f22345i.m26100f(j7, j8);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: e */
        public C6242i mo25738e(long j7) {
            return this.f22345i.mo26105k(this, j7);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: f */
        public long mo25739f(long j7, long j8) {
            return this.f22345i.m26103i(j7, j8);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: g */
        public boolean mo25740g() {
            return this.f22345i.mo26106l();
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: h */
        public long mo25741h() {
            return this.f22345i.m26099e();
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: i */
        public long mo25742i(long j7) {
            return this.f22345i.mo26101g(j7);
        }

        @Override // p319q0.InterfaceC6168g
        /* renamed from: j */
        public long mo25743j(long j7, long j8) {
            return this.f22345i.m26097c(j7, j8);
        }

        @Override // p327r0.AbstractC6243j
        /* renamed from: k */
        public String mo26091k() {
            return null;
        }

        @Override // p327r0.AbstractC6243j
        /* renamed from: m */
        public C6242i mo26093m() {
            return null;
        }

        @Override // p327r0.AbstractC6243j
        /* renamed from: l */
        public InterfaceC6168g mo26092l() {
            return this;
        }
    }
}
