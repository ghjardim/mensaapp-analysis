package p194b2;

import p032E3.InterfaceC0291c;

/* renamed from: b2.c */
/* loaded from: classes.dex */
public final class C3517c {

    /* renamed from: c */
    public static final C3517c f11824c = new a().m14131a();

    /* renamed from: a */
    public final long f11825a;

    /* renamed from: b */
    public final b f11826b;

    /* renamed from: b2.c$a */
    public static final class a {

        /* renamed from: a */
        public long f11827a = 0;

        /* renamed from: b */
        public b f11828b = b.REASON_UNKNOWN;

        /* renamed from: a */
        public C3517c m14131a() {
            return new C3517c(this.f11827a, this.f11828b);
        }

        /* renamed from: b */
        public a m14132b(long j7) {
            this.f11827a = j7;
            return this;
        }

        /* renamed from: c */
        public a m14133c(b bVar) {
            this.f11828b = bVar;
            return this;
        }
    }

    /* renamed from: b2.c$b */
    public enum b implements InterfaceC0291c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a */
        public final int f11837a;

        b(int i7) {
            this.f11837a = i7;
        }

        @Override // p032E3.InterfaceC0291c
        /* renamed from: a */
        public int mo1160a() {
            return this.f11837a;
        }
    }

    public C3517c(long j7, b bVar) {
        this.f11825a = j7;
        this.f11826b = bVar;
    }

    /* renamed from: c */
    public static a m14128c() {
        return new a();
    }

    /* renamed from: a */
    public long m14129a() {
        return this.f11825a;
    }

    /* renamed from: b */
    public b m14130b() {
        return this.f11826b;
    }
}
