package p289m5;

import p273k5.C5448e;

/* renamed from: m5.b */
/* loaded from: classes2.dex */
public final class C5598b {

    /* renamed from: a */
    public final C5597a f20247a;

    /* renamed from: b */
    public final C5448e f20248b;

    /* renamed from: m5.b$b */
    public static class b {

        /* renamed from: a */
        public C5597a f20249a;

        /* renamed from: b */
        public C5448e.b f20250b = new C5448e.b();

        /* renamed from: c */
        public C5598b m23460c() {
            if (this.f20249a != null) {
                return new C5598b(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: d */
        public b m23461d(String str, String str2) {
            this.f20250b.m22967f(str, str2);
            return this;
        }

        /* renamed from: e */
        public b m23462e(C5597a c5597a) {
            if (c5597a == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f20249a = c5597a;
            return this;
        }
    }

    /* renamed from: a */
    public C5448e m23456a() {
        return this.f20248b;
    }

    /* renamed from: b */
    public C5597a m23457b() {
        return this.f20247a;
    }

    public String toString() {
        return "Request{url=" + this.f20247a + '}';
    }

    public C5598b(b bVar) {
        this.f20247a = bVar.f20249a;
        this.f20248b = bVar.f20250b.m22964c();
    }
}
