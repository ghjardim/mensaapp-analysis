package com.google.firebase.firestore;

import p046G3.C0412Z;
import p046G3.C0430i0;
import p046G3.InterfaceC0411Y;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2157z;
import p256j$.util.Objects;

/* renamed from: com.google.firebase.firestore.g */
/* loaded from: classes.dex */
public final class C3953g {

    /* renamed from: a */
    public final String f12939a;

    /* renamed from: b */
    public final boolean f12940b;

    /* renamed from: c */
    public final boolean f12941c;

    /* renamed from: d */
    public final long f12942d;

    /* renamed from: e */
    public InterfaceC0411Y f12943e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3953g.class != obj.getClass()) {
            return false;
        }
        C3953g c3953g = (C3953g) obj;
        if (this.f12940b == c3953g.f12940b && this.f12941c == c3953g.f12941c && this.f12942d == c3953g.f12942d && this.f12939a.equals(c3953g.f12939a)) {
            return Objects.equals(this.f12943e, c3953g.f12943e);
        }
        return false;
    }

    /* renamed from: f */
    public InterfaceC0411Y m15592f() {
        return this.f12943e;
    }

    /* renamed from: g */
    public long m15593g() {
        InterfaceC0411Y interfaceC0411Y = this.f12943e;
        if (interfaceC0411Y == null) {
            return this.f12942d;
        }
        if (interfaceC0411Y instanceof C0430i0) {
            return ((C0430i0) interfaceC0411Y).m1654a();
        }
        ((C0412Z) interfaceC0411Y).m1621a();
        return -1L;
    }

    /* renamed from: h */
    public String m15594h() {
        return this.f12939a;
    }

    public int hashCode() {
        int hashCode = ((((this.f12939a.hashCode() * 31) + (this.f12940b ? 1 : 0)) * 31) + (this.f12941c ? 1 : 0)) * 31;
        long j7 = this.f12942d;
        int i7 = (hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        InterfaceC0411Y interfaceC0411Y = this.f12943e;
        return i7 + (interfaceC0411Y != null ? interfaceC0411Y.hashCode() : 0);
    }

    /* renamed from: i */
    public boolean m15595i() {
        InterfaceC0411Y interfaceC0411Y = this.f12943e;
        return interfaceC0411Y != null ? interfaceC0411Y instanceof C0430i0 : this.f12941c;
    }

    /* renamed from: j */
    public boolean m15596j() {
        return this.f12940b;
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.f12939a + ", sslEnabled=" + this.f12940b + ", persistenceEnabled=" + this.f12941c + ", cacheSizeBytes=" + this.f12942d + ", cacheSettings=" + this.f12943e) == null) {
            return "null";
        }
        return this.f12943e.toString() + "}";
    }

    public C3953g(b bVar) {
        this.f12939a = bVar.f12944a;
        this.f12940b = bVar.f12945b;
        this.f12941c = bVar.f12946c;
        this.f12942d = bVar.f12947d;
        this.f12943e = bVar.f12948e;
    }

    /* renamed from: com.google.firebase.firestore.g$b */
    public static final class b {

        /* renamed from: a */
        public String f12944a;

        /* renamed from: b */
        public boolean f12945b;

        /* renamed from: c */
        public boolean f12946c;

        /* renamed from: d */
        public long f12947d;

        /* renamed from: e */
        public InterfaceC0411Y f12948e;

        /* renamed from: f */
        public boolean f12949f;

        public b() {
            this.f12949f = false;
            this.f12944a = "firestore.googleapis.com";
            this.f12945b = true;
            this.f12946c = true;
            this.f12947d = 104857600L;
        }

        /* renamed from: f */
        public C3953g m15602f() {
            if (this.f12945b || !this.f12944a.equals("firestore.googleapis.com")) {
                return new C3953g(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        /* renamed from: g */
        public b m15603g(String str) {
            this.f12944a = (String) AbstractC2157z.m7330c(str, "Provided host must not be null.");
            return this;
        }

        /* renamed from: h */
        public b m15604h(InterfaceC0411Y interfaceC0411Y) {
            if (this.f12949f) {
                throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
            }
            if (!(interfaceC0411Y instanceof C0412Z) && !(interfaceC0411Y instanceof C0430i0)) {
                throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
            }
            this.f12948e = interfaceC0411Y;
            return this;
        }

        /* renamed from: i */
        public b m15605i(boolean z6) {
            this.f12945b = z6;
            return this;
        }

        public b(C3953g c3953g) {
            this.f12949f = false;
            AbstractC2157z.m7330c(c3953g, "Provided settings must not be null.");
            this.f12944a = c3953g.f12939a;
            this.f12945b = c3953g.f12940b;
            this.f12946c = c3953g.f12941c;
            long j7 = c3953g.f12942d;
            this.f12947d = j7;
            if (!this.f12946c || j7 != 104857600) {
                this.f12949f = true;
            }
            if (!this.f12949f) {
                this.f12948e = c3953g.f12943e;
            } else {
                AbstractC2133b.m7217d(c3953g.f12943e == null, "Given settings object mixes both cache config APIs, which is impossible.", new Object[0]);
            }
        }
    }
}
