package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3301k0;

/* renamed from: androidx.datastore.preferences.protobuf.C */
/* loaded from: classes.dex */
public class C3257C {

    /* renamed from: a */
    public final a f10369a;

    /* renamed from: b */
    public final Object f10370b;

    /* renamed from: c */
    public final Object f10371c;

    /* renamed from: androidx.datastore.preferences.protobuf.C$a */
    public static class a {

        /* renamed from: a */
        public final AbstractC3301k0.b f10372a;

        /* renamed from: b */
        public final Object f10373b;

        /* renamed from: c */
        public final AbstractC3301k0.b f10374c;

        /* renamed from: d */
        public final Object f10375d;

        public a(AbstractC3301k0.b bVar, Object obj, AbstractC3301k0.b bVar2, Object obj2) {
            this.f10372a = bVar;
            this.f10373b = obj;
            this.f10374c = bVar2;
            this.f10375d = obj2;
        }
    }

    public C3257C(AbstractC3301k0.b bVar, Object obj, AbstractC3301k0.b bVar2, Object obj2) {
        this.f10369a = new a(bVar, obj, bVar2, obj2);
        this.f10370b = obj;
        this.f10371c = obj2;
    }

    /* renamed from: b */
    public static int m12062b(a aVar, Object obj, Object obj2) {
        return C3308q.m12768b(aVar.f10372a, 1, obj) + C3308q.m12768b(aVar.f10374c, 2, obj2);
    }

    /* renamed from: d */
    public static C3257C m12063d(AbstractC3301k0.b bVar, Object obj, AbstractC3301k0.b bVar2, Object obj2) {
        return new C3257C(bVar, obj, bVar2, obj2);
    }

    /* renamed from: e */
    public static void m12064e(AbstractC3296i abstractC3296i, a aVar, Object obj, Object obj2) {
        C3308q.m12775u(abstractC3296i, aVar.f10372a, 1, obj);
        C3308q.m12775u(abstractC3296i, aVar.f10374c, 2, obj2);
    }

    /* renamed from: a */
    public int m12065a(int i7, Object obj, Object obj2) {
        return AbstractC3296i.m12505O(i7) + AbstractC3296i.m12536y(m12062b(this.f10369a, obj, obj2));
    }

    /* renamed from: c */
    public a m12066c() {
        return this.f10369a;
    }
}
