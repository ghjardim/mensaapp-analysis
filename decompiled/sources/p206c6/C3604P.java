package p206c6;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7019j;

/* renamed from: c6.P */
/* loaded from: classes2.dex */
public final class C3604P {

    /* renamed from: h */
    public static final a f12063h = new a(null);

    /* renamed from: a */
    public final byte[] f12064a;

    /* renamed from: b */
    public int f12065b;

    /* renamed from: c */
    public int f12066c;

    /* renamed from: d */
    public boolean f12067d;

    /* renamed from: e */
    public boolean f12068e;

    /* renamed from: f */
    public C3604P f12069f;

    /* renamed from: g */
    public C3604P f12070g;

    /* renamed from: c6.P$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C3604P() {
        this.f12064a = new byte[8192];
        this.f12068e = true;
        this.f12067d = false;
    }

    /* renamed from: a */
    public final void m14524a() {
        int i7;
        C3604P c3604p = this.f12070g;
        if (c3604p == this) {
            throw new IllegalStateException("cannot compact");
        }
        AbstractC5469l.m23025b(c3604p);
        if (c3604p.f12068e) {
            int i8 = this.f12066c - this.f12065b;
            C3604P c3604p2 = this.f12070g;
            AbstractC5469l.m23025b(c3604p2);
            int i9 = 8192 - c3604p2.f12066c;
            C3604P c3604p3 = this.f12070g;
            AbstractC5469l.m23025b(c3604p3);
            if (c3604p3.f12067d) {
                i7 = 0;
            } else {
                C3604P c3604p4 = this.f12070g;
                AbstractC5469l.m23025b(c3604p4);
                i7 = c3604p4.f12065b;
            }
            if (i8 > i9 + i7) {
                return;
            }
            C3604P c3604p5 = this.f12070g;
            AbstractC5469l.m23025b(c3604p5);
            m14529f(c3604p5, i8);
            m14525b();
            C3605Q.m14530b(this);
        }
    }

    /* renamed from: b */
    public final C3604P m14525b() {
        C3604P c3604p = this.f12069f;
        if (c3604p == this) {
            c3604p = null;
        }
        C3604P c3604p2 = this.f12070g;
        AbstractC5469l.m23025b(c3604p2);
        c3604p2.f12069f = this.f12069f;
        C3604P c3604p3 = this.f12069f;
        AbstractC5469l.m23025b(c3604p3);
        c3604p3.f12070g = this.f12070g;
        this.f12069f = null;
        this.f12070g = null;
        return c3604p;
    }

    /* renamed from: c */
    public final C3604P m14526c(C3604P segment) {
        AbstractC5469l.m23028e(segment, "segment");
        segment.f12070g = this;
        segment.f12069f = this.f12069f;
        C3604P c3604p = this.f12069f;
        AbstractC5469l.m23025b(c3604p);
        c3604p.f12070g = segment;
        this.f12069f = segment;
        return segment;
    }

    /* renamed from: d */
    public final C3604P m14527d() {
        this.f12067d = true;
        return new C3604P(this.f12064a, this.f12065b, this.f12066c, true, false);
    }

    /* renamed from: e */
    public final C3604P m14528e(int i7) {
        C3604P m14531c;
        if (i7 <= 0 || i7 > this.f12066c - this.f12065b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i7 >= 1024) {
            m14531c = m14527d();
        } else {
            m14531c = C3605Q.m14531c();
            byte[] bArr = this.f12064a;
            byte[] bArr2 = m14531c.f12064a;
            int i8 = this.f12065b;
            AbstractC7019j.m28798h(bArr, bArr2, 0, i8, i8 + i7, 2, null);
        }
        m14531c.f12066c = m14531c.f12065b + i7;
        this.f12065b += i7;
        C3604P c3604p = this.f12070g;
        AbstractC5469l.m23025b(c3604p);
        c3604p.m14526c(m14531c);
        return m14531c;
    }

    /* renamed from: f */
    public final void m14529f(C3604P sink, int i7) {
        AbstractC5469l.m23028e(sink, "sink");
        if (!sink.f12068e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = sink.f12066c;
        if (i8 + i7 > 8192) {
            if (sink.f12067d) {
                throw new IllegalArgumentException();
            }
            int i9 = sink.f12065b;
            if ((i8 + i7) - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f12064a;
            AbstractC7019j.m28798h(bArr, bArr, 0, i9, i8, 2, null);
            sink.f12066c -= sink.f12065b;
            sink.f12065b = 0;
        }
        byte[] bArr2 = this.f12064a;
        byte[] bArr3 = sink.f12064a;
        int i10 = sink.f12066c;
        int i11 = this.f12065b;
        AbstractC7019j.m28794d(bArr2, bArr3, i10, i11, i11 + i7);
        sink.f12066c += i7;
        this.f12065b += i7;
    }

    public C3604P(byte[] data, int i7, int i8, boolean z6, boolean z7) {
        AbstractC5469l.m23028e(data, "data");
        this.f12064a = data;
        this.f12065b = i7;
        this.f12066c = i8;
        this.f12067d = z6;
        this.f12068e = z7;
    }
}
