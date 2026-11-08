package com.google.protobuf;

import com.google.protobuf.AbstractC4014B0;

/* renamed from: com.google.protobuf.N */
/* loaded from: classes.dex */
public class C4027N {

    /* renamed from: a */
    public final a f13319a;

    /* renamed from: b */
    public final Object f13320b;

    /* renamed from: c */
    public final Object f13321c;

    /* renamed from: com.google.protobuf.N$a */
    public static class a {

        /* renamed from: a */
        public final AbstractC4014B0.b f13322a;

        /* renamed from: b */
        public final Object f13323b;

        /* renamed from: c */
        public final AbstractC4014B0.b f13324c;

        /* renamed from: d */
        public final Object f13325d;

        public a(AbstractC4014B0.b bVar, Object obj, AbstractC4014B0.b bVar2, Object obj2) {
            this.f13322a = bVar;
            this.f13323b = obj;
            this.f13324c = bVar2;
            this.f13325d = obj2;
        }
    }

    public C4027N(AbstractC4014B0.b bVar, Object obj, AbstractC4014B0.b bVar2, Object obj2) {
        this.f13319a = new a(bVar, obj, bVar2, obj2);
        this.f13320b = obj;
        this.f13321c = obj2;
    }

    /* renamed from: b */
    public static int m16283b(a aVar, Object obj, Object obj2) {
        return C4079u.m16937b(aVar.f13322a, 1, obj) + C4079u.m16937b(aVar.f13324c, 2, obj2);
    }

    /* renamed from: d */
    public static C4027N m16284d(AbstractC4014B0.b bVar, Object obj, AbstractC4014B0.b bVar2, Object obj2) {
        return new C4027N(bVar, obj, bVar2, obj2);
    }

    /* renamed from: e */
    public static void m16285e(AbstractC4061l abstractC4061l, a aVar, Object obj, Object obj2) {
        C4079u.m16944u(abstractC4061l, aVar.f13322a, 1, obj);
        C4079u.m16944u(abstractC4061l, aVar.f13324c, 2, obj2);
    }

    /* renamed from: a */
    public int m16286a(int i7, Object obj, Object obj2) {
        return AbstractC4061l.m16698Q(i7) + AbstractC4061l.m16682A(m16283b(this.f13319a, obj, obj2));
    }

    /* renamed from: c */
    public a m16287c() {
        return this.f13319a;
    }
}
