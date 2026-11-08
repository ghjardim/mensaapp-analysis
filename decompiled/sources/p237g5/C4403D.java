package p237g5;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;

/* renamed from: g5.D */
/* loaded from: classes2.dex */
public final class C4403D extends AbstractC4438g0 {

    /* renamed from: a */
    public final SocketAddress f15592a;

    /* renamed from: b */
    public final InetSocketAddress f15593b;

    /* renamed from: c */
    public final String f15594c;

    /* renamed from: d */
    public final String f15595d;

    /* renamed from: g5.D$b */
    public static final class b {

        /* renamed from: a */
        public SocketAddress f15596a;

        /* renamed from: b */
        public InetSocketAddress f15597b;

        /* renamed from: c */
        public String f15598c;

        /* renamed from: d */
        public String f15599d;

        /* renamed from: a */
        public C4403D m18634a() {
            return new C4403D(this.f15596a, this.f15597b, this.f15598c, this.f15599d);
        }

        /* renamed from: b */
        public b m18635b(String str) {
            this.f15599d = str;
            return this;
        }

        /* renamed from: c */
        public b m18636c(SocketAddress socketAddress) {
            this.f15596a = (SocketAddress) AbstractC2932o.m10573p(socketAddress, "proxyAddress");
            return this;
        }

        /* renamed from: d */
        public b m18637d(InetSocketAddress inetSocketAddress) {
            this.f15597b = (InetSocketAddress) AbstractC2932o.m10573p(inetSocketAddress, "targetAddress");
            return this;
        }

        /* renamed from: e */
        public b m18638e(String str) {
            this.f15598c = str;
            return this;
        }

        public b() {
        }
    }

    /* renamed from: e */
    public static b m18629e() {
        return new b();
    }

    /* renamed from: a */
    public String m18630a() {
        return this.f15595d;
    }

    /* renamed from: b */
    public SocketAddress m18631b() {
        return this.f15592a;
    }

    /* renamed from: c */
    public InetSocketAddress m18632c() {
        return this.f15593b;
    }

    /* renamed from: d */
    public String m18633d() {
        return this.f15594c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4403D)) {
            return false;
        }
        C4403D c4403d = (C4403D) obj;
        return AbstractC2928k.m10550a(this.f15592a, c4403d.f15592a) && AbstractC2928k.m10550a(this.f15593b, c4403d.f15593b) && AbstractC2928k.m10550a(this.f15594c, c4403d.f15594c) && AbstractC2928k.m10550a(this.f15595d, c4403d.f15595d);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f15592a, this.f15593b, this.f15594c, this.f15595d);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("proxyAddr", this.f15592a).m10540d("targetAddr", this.f15593b).m10540d("username", this.f15594c).m10541e("hasPassword", this.f15595d != null).toString();
    }

    public C4403D(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        AbstractC2932o.m10573p(socketAddress, "proxyAddress");
        AbstractC2932o.m10573p(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            AbstractC2932o.m10581x(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f15592a = socketAddress;
        this.f15593b = inetSocketAddress;
        this.f15594c = str;
        this.f15595d = str2;
    }
}
