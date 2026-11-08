package p253i5;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4435f;
import p237g5.C4403D;
import p237g5.C4425a;

/* renamed from: i5.u */
/* loaded from: classes2.dex */
public interface InterfaceC4634u extends Closeable {

    /* renamed from: i5.u$a */
    public static final class a {

        /* renamed from: a */
        public String f17248a = "unknown-authority";

        /* renamed from: b */
        public C4425a f17249b = C4425a.f15691c;

        /* renamed from: c */
        public String f17250c;

        /* renamed from: d */
        public C4403D f17251d;

        /* renamed from: a */
        public String m20141a() {
            return this.f17248a;
        }

        /* renamed from: b */
        public C4425a m20142b() {
            return this.f17249b;
        }

        /* renamed from: c */
        public C4403D m20143c() {
            return this.f17251d;
        }

        /* renamed from: d */
        public String m20144d() {
            return this.f17250c;
        }

        /* renamed from: e */
        public a m20145e(String str) {
            this.f17248a = (String) AbstractC2932o.m10573p(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17248a.equals(aVar.f17248a) && this.f17249b.equals(aVar.f17249b) && AbstractC2928k.m10550a(this.f17250c, aVar.f17250c) && AbstractC2928k.m10550a(this.f17251d, aVar.f17251d);
        }

        /* renamed from: f */
        public a m20146f(C4425a c4425a) {
            AbstractC2932o.m10573p(c4425a, "eagAttributes");
            this.f17249b = c4425a;
            return this;
        }

        /* renamed from: g */
        public a m20147g(C4403D c4403d) {
            this.f17251d = c4403d;
            return this;
        }

        /* renamed from: h */
        public a m20148h(String str) {
            this.f17250c = str;
            return this;
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f17248a, this.f17249b, this.f17250c, this.f17251d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: j0 */
    ScheduledExecutorService mo20012j0();

    /* renamed from: n0 */
    InterfaceC4638w mo20013n0(SocketAddress socketAddress, a aVar, AbstractC4435f abstractC4435f);

    /* renamed from: v0 */
    Collection mo20014v0();
}
