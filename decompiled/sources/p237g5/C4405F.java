package p237g5;

import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;

/* renamed from: g5.F */
/* loaded from: classes2.dex */
public final class C4405F {

    /* renamed from: a */
    public final String f15611a;

    /* renamed from: b */
    public final b f15612b;

    /* renamed from: c */
    public final long f15613c;

    /* renamed from: d */
    public final InterfaceC4415P f15614d;

    /* renamed from: e */
    public final InterfaceC4415P f15615e;

    /* renamed from: g5.F$a */
    public static final class a {

        /* renamed from: a */
        public String f15616a;

        /* renamed from: b */
        public b f15617b;

        /* renamed from: c */
        public Long f15618c;

        /* renamed from: d */
        public InterfaceC4415P f15619d;

        /* renamed from: e */
        public InterfaceC4415P f15620e;

        /* renamed from: a */
        public C4405F m18650a() {
            AbstractC2932o.m10573p(this.f15616a, "description");
            AbstractC2932o.m10573p(this.f15617b, "severity");
            AbstractC2932o.m10573p(this.f15618c, "timestampNanos");
            AbstractC2932o.m10579v(this.f15619d == null || this.f15620e == null, "at least one of channelRef and subchannelRef must be null");
            return new C4405F(this.f15616a, this.f15617b, this.f15618c.longValue(), this.f15619d, this.f15620e);
        }

        /* renamed from: b */
        public a m18651b(String str) {
            this.f15616a = str;
            return this;
        }

        /* renamed from: c */
        public a m18652c(b bVar) {
            this.f15617b = bVar;
            return this;
        }

        /* renamed from: d */
        public a m18653d(InterfaceC4415P interfaceC4415P) {
            this.f15620e = interfaceC4415P;
            return this;
        }

        /* renamed from: e */
        public a m18654e(long j7) {
            this.f15618c = Long.valueOf(j7);
            return this;
        }
    }

    /* renamed from: g5.F$b */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4405F)) {
            return false;
        }
        C4405F c4405f = (C4405F) obj;
        return AbstractC2928k.m10550a(this.f15611a, c4405f.f15611a) && AbstractC2928k.m10550a(this.f15612b, c4405f.f15612b) && this.f15613c == c4405f.f15613c && AbstractC2928k.m10550a(this.f15614d, c4405f.f15614d) && AbstractC2928k.m10550a(this.f15615e, c4405f.f15615e);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f15611a, this.f15612b, Long.valueOf(this.f15613c), this.f15614d, this.f15615e);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("description", this.f15611a).m10540d("severity", this.f15612b).m10539c("timestampNanos", this.f15613c).m10540d("channelRef", this.f15614d).m10540d("subchannelRef", this.f15615e).toString();
    }

    public C4405F(String str, b bVar, long j7, InterfaceC4415P interfaceC4415P, InterfaceC4415P interfaceC4415P2) {
        this.f15611a = str;
        this.f15612b = (b) AbstractC2932o.m10573p(bVar, "severity");
        this.f15613c = j7;
        this.f15614d = interfaceC4415P;
        this.f15615e = interfaceC4415P2;
    }
}
