package p328r1;

import p078L0.C0854L;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5330M;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: r1.H */
/* loaded from: classes.dex */
public final class C6256H {

    /* renamed from: a */
    public final int f22419a;

    /* renamed from: d */
    public boolean f22422d;

    /* renamed from: e */
    public boolean f22423e;

    /* renamed from: f */
    public boolean f22424f;

    /* renamed from: b */
    public final C5322E f22420b = new C5322E(0);

    /* renamed from: g */
    public long f22425g = -9223372036854775807L;

    /* renamed from: h */
    public long f22426h = -9223372036854775807L;

    /* renamed from: i */
    public long f22427i = -9223372036854775807L;

    /* renamed from: c */
    public final C5357z f22421c = new C5357z();

    public C6256H(int i7) {
        this.f22419a = i7;
    }

    /* renamed from: a */
    public final int m26139a(InterfaceC0884s interfaceC0884s) {
        this.f22421c.m21936Q(AbstractC5330M.f18805f);
        this.f22422d = true;
        interfaceC0884s.mo3518p();
        return 0;
    }

    /* renamed from: b */
    public long m26140b() {
        return this.f22427i;
    }

    /* renamed from: c */
    public C5322E m26141c() {
        return this.f22420b;
    }

    /* renamed from: d */
    public boolean m26142d() {
        return this.f22422d;
    }

    /* renamed from: e */
    public int m26143e(InterfaceC0884s interfaceC0884s, C0854L c0854l, int i7) {
        if (i7 <= 0) {
            return m26139a(interfaceC0884s);
        }
        if (!this.f22424f) {
            return m26146h(interfaceC0884s, c0854l, i7);
        }
        if (this.f22426h == -9223372036854775807L) {
            return m26139a(interfaceC0884s);
        }
        if (!this.f22423e) {
            return m26144f(interfaceC0884s, c0854l, i7);
        }
        long j7 = this.f22425g;
        if (j7 == -9223372036854775807L) {
            return m26139a(interfaceC0884s);
        }
        this.f22427i = this.f22420b.m21652c(this.f22426h) - this.f22420b.m21651b(j7);
        return m26139a(interfaceC0884s);
    }

    /* renamed from: f */
    public final int m26144f(InterfaceC0884s interfaceC0884s, C0854L c0854l, int i7) {
        int min = (int) Math.min(this.f22419a, interfaceC0884s.mo3511a());
        long j7 = 0;
        if (interfaceC0884s.mo3522u() != j7) {
            c0854l.f2935a = j7;
            return 1;
        }
        this.f22421c.m21935P(min);
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3521t(this.f22421c.m21946e(), 0, min);
        this.f22425g = m26145g(this.f22421c, i7);
        this.f22423e = true;
        return 0;
    }

    /* renamed from: g */
    public final long m26145g(C5357z c5357z, int i7) {
        int m21948g = c5357z.m21948g();
        for (int m21947f = c5357z.m21947f(); m21947f < m21948g; m21947f++) {
            if (c5357z.m21946e()[m21947f] == 71) {
                long m26180c = AbstractC6260L.m26180c(c5357z, m21947f, i7);
                if (m26180c != -9223372036854775807L) {
                    return m26180c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final int m26146h(InterfaceC0884s interfaceC0884s, C0854L c0854l, int i7) {
        long mo3511a = interfaceC0884s.mo3511a();
        int min = (int) Math.min(this.f22419a, mo3511a);
        long j7 = mo3511a - min;
        if (interfaceC0884s.mo3522u() != j7) {
            c0854l.f2935a = j7;
            return 1;
        }
        this.f22421c.m21935P(min);
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3521t(this.f22421c.m21946e(), 0, min);
        this.f22426h = m26147i(this.f22421c, i7);
        this.f22424f = true;
        return 0;
    }

    /* renamed from: i */
    public final long m26147i(C5357z c5357z, int i7) {
        int m21947f = c5357z.m21947f();
        int m21948g = c5357z.m21948g();
        for (int i8 = m21948g - 188; i8 >= m21947f; i8--) {
            if (AbstractC6260L.m26179b(c5357z.m21946e(), m21947f, m21948g, i8)) {
                long m26180c = AbstractC6260L.m26180c(c5357z, i8, i7);
                if (m26180c != -9223372036854775807L) {
                    return m26180c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
