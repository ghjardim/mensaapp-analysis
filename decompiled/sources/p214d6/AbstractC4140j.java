package p214d6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import kotlin.jvm.internal.C5477t;
import kotlin.jvm.internal.C5479v;
import kotlin.jvm.internal.C5480w;
import p048G5.AbstractC0467b;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p125R5.AbstractC2275a;
import p125R5.AbstractC2291q;
import p125R5.AbstractC2294t;
import p206c6.AbstractC3596H;
import p206c6.AbstractC3620h;
import p206c6.AbstractC3622j;
import p206c6.C3601M;
import p206c6.C3611X;
import p206c6.C3621i;
import p206c6.InterfaceC3618f;
import p371w5.AbstractC6930m;
import p371w5.C6934q;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7032w;
import p385y5.AbstractC7085a;

/* renamed from: d6.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4140j {

    /* renamed from: d6.j$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC7085a.m29183a(((C4139i) obj).m17369a(), ((C4139i) obj2).m17369a());
        }
    }

    /* renamed from: d6.j$b */
    public static final class b extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public final /* synthetic */ C5477t f13867a;

        /* renamed from: b */
        public final /* synthetic */ long f13868b;

        /* renamed from: c */
        public final /* synthetic */ C5479v f13869c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC3618f f13870d;

        /* renamed from: e */
        public final /* synthetic */ C5479v f13871e;

        /* renamed from: f */
        public final /* synthetic */ C5479v f13872f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5477t c5477t, long j7, C5479v c5479v, InterfaceC3618f interfaceC3618f, C5479v c5479v2, C5479v c5479v3) {
            super(2);
            this.f13867a = c5477t;
            this.f13868b = j7;
            this.f13869c = c5479v;
            this.f13870d = interfaceC3618f;
            this.f13871e = c5479v2;
            this.f13872f = c5479v3;
        }

        /* renamed from: a */
        public final void m17388a(int i7, long j7) {
            if (i7 == 1) {
                C5477t c5477t = this.f13867a;
                if (c5477t.f19707a) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                c5477t.f19707a = true;
                if (j7 < this.f13868b) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                C5479v c5479v = this.f13869c;
                long j8 = c5479v.f19709a;
                if (j8 == 4294967295L) {
                    j8 = this.f13870d.mo14517i0();
                }
                c5479v.f19709a = j8;
                C5479v c5479v2 = this.f13871e;
                c5479v2.f19709a = c5479v2.f19709a == 4294967295L ? this.f13870d.mo14517i0() : 0L;
                C5479v c5479v3 = this.f13872f;
                c5479v3.f19709a = c5479v3.f19709a == 4294967295L ? this.f13870d.mo14517i0() : 0L;
            }
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17388a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C6934q.f24811a;
        }
    }

    /* renamed from: d6.j$c */
    public static final class c extends AbstractC5470m implements InterfaceC0804p {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3618f f13873a;

        /* renamed from: b */
        public final /* synthetic */ C5480w f13874b;

        /* renamed from: c */
        public final /* synthetic */ C5480w f13875c;

        /* renamed from: d */
        public final /* synthetic */ C5480w f13876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3618f interfaceC3618f, C5480w c5480w, C5480w c5480w2, C5480w c5480w3) {
            super(2);
            this.f13873a = interfaceC3618f;
            this.f13874b = c5480w;
            this.f13875c = c5480w2;
            this.f13876d = c5480w3;
        }

        /* renamed from: a */
        public final void m17389a(int i7, long j7) {
            if (i7 == 21589) {
                if (j7 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte readByte = this.f13873a.readByte();
                boolean z6 = (readByte & 1) == 1;
                boolean z7 = (readByte & 2) == 2;
                boolean z8 = (readByte & 4) == 4;
                InterfaceC3618f interfaceC3618f = this.f13873a;
                long j8 = z6 ? 5L : 1L;
                if (z7) {
                    j8 += 4;
                }
                if (z8) {
                    j8 += 4;
                }
                if (j7 < j8) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z6) {
                    this.f13874b.f19710a = Long.valueOf(interfaceC3618f.mo14513Y() * 1000);
                }
                if (z7) {
                    this.f13875c.f19710a = Long.valueOf(this.f13873a.mo14513Y() * 1000);
                }
                if (z8) {
                    this.f13876d.f19710a = Long.valueOf(this.f13873a.mo14513Y() * 1000);
                }
            }
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m17389a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C6934q.f24811a;
        }
    }

    /* renamed from: a */
    public static final Map m17377a(List list) {
        C3601M m14500e = C3601M.a.m14500e(C3601M.f12052b, "/", false, 1, null);
        Map m28738g = AbstractC7005E.m28738g(AbstractC6930m.m28383a(m14500e, new C4139i(m14500e, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (C4139i c4139i : AbstractC7032w.m28884J(list, new a())) {
            if (((C4139i) m28738g.put(c4139i.m17369a(), c4139i)) == null) {
                while (true) {
                    C3601M m14492m = c4139i.m17369a().m14492m();
                    if (m14492m != null) {
                        C4139i c4139i2 = (C4139i) m28738g.get(m14492m);
                        if (c4139i2 != null) {
                            c4139i2.m17370b().add(c4139i.m17369a());
                            break;
                        }
                        C4139i c4139i3 = new C4139i(m14492m, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        m28738g.put(m14492m, c4139i3);
                        c4139i3.m17370b().add(c4139i.m17369a());
                        c4139i = c4139i3;
                    }
                }
            }
        }
        return m28738g;
    }

    /* renamed from: b */
    public static final Long m17378b(int i7, int i8) {
        if (i8 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i7 >> 9) & 127) + 1980, ((i7 >> 5) & 15) - 1, i7 & 31, (i8 >> 11) & 31, (i8 >> 5) & 63, (i8 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* renamed from: c */
    public static final String m17379c(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i7, AbstractC2275a.m7711a(16));
        AbstractC5469l.m23027d(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: d */
    public static final C3611X m17380d(C3601M zipPath, AbstractC3622j fileSystem, InterfaceC0800l predicate) {
        InterfaceC3618f m14470b;
        AbstractC5469l.m23028e(zipPath, "zipPath");
        AbstractC5469l.m23028e(fileSystem, "fileSystem");
        AbstractC5469l.m23028e(predicate, "predicate");
        AbstractC3620h mo14557i = fileSystem.mo14557i(zipPath);
        try {
            long m14663F = mo14557i.m14663F() - 22;
            if (m14663F < 0) {
                throw new IOException("not a zip: size=" + mo14557i.m14663F());
            }
            long max = Math.max(m14663F - 65536, 0L);
            do {
                InterfaceC3618f m14470b2 = AbstractC3596H.m14470b(mo14557i.m14664G(m14663F));
                try {
                    if (m14470b2.mo14513Y() == 101010256) {
                        C4136f m17382f = m17382f(m14470b2);
                        String mo14518l = m14470b2.mo14518l(m17382f.m17353b());
                        m14470b2.close();
                        long j7 = m14663F - 20;
                        if (j7 > 0) {
                            InterfaceC3618f m14470b3 = AbstractC3596H.m14470b(mo14557i.m14664G(j7));
                            try {
                                if (m14470b3.mo14513Y() == 117853008) {
                                    int mo14513Y = m14470b3.mo14513Y();
                                    long mo14517i0 = m14470b3.mo14517i0();
                                    if (m14470b3.mo14513Y() != 1 || mo14513Y != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    m14470b = AbstractC3596H.m14470b(mo14557i.m14664G(mo14517i0));
                                    try {
                                        int mo14513Y2 = m14470b.mo14513Y();
                                        if (mo14513Y2 != 101075792) {
                                            throw new IOException("bad zip: expected " + m17379c(101075792) + " but was " + m17379c(mo14513Y2));
                                        }
                                        m17382f = m17386j(m14470b, m17382f);
                                        C6934q c6934q = C6934q.f24811a;
                                        AbstractC0467b.m1715a(m14470b, null);
                                    } finally {
                                    }
                                }
                                C6934q c6934q2 = C6934q.f24811a;
                                AbstractC0467b.m1715a(m14470b3, null);
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        m14470b = AbstractC3596H.m14470b(mo14557i.m14664G(m17382f.m17352a()));
                        try {
                            long m17354c = m17382f.m17354c();
                            for (long j8 = 0; j8 < m17354c; j8++) {
                                C4139i m17381e = m17381e(m14470b);
                                if (m17381e.m17374f() >= m17382f.m17352a()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(m17381e)).booleanValue()) {
                                    arrayList.add(m17381e);
                                }
                            }
                            C6934q c6934q3 = C6934q.f24811a;
                            AbstractC0467b.m1715a(m14470b, null);
                            C3611X c3611x = new C3611X(zipPath, fileSystem, m17377a(arrayList), mo14518l);
                            AbstractC0467b.m1715a(mo14557i, null);
                            return c3611x;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                                AbstractC0467b.m1715a(m14470b, th);
                            }
                        }
                    }
                    m14470b2.close();
                    m14663F--;
                } finally {
                    m14470b2.close();
                }
            } while (m14663F >= max);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    /* renamed from: e */
    public static final C4139i m17381e(InterfaceC3618f interfaceC3618f) {
        AbstractC5469l.m23028e(interfaceC3618f, "<this>");
        int mo14513Y = interfaceC3618f.mo14513Y();
        if (mo14513Y != 33639248) {
            throw new IOException("bad zip: expected " + m17379c(33639248) + " but was " + m17379c(mo14513Y));
        }
        interfaceC3618f.skip(4L);
        short mo14516e0 = interfaceC3618f.mo14516e0();
        int i7 = mo14516e0 & 65535;
        if ((mo14516e0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m17379c(i7));
        }
        int mo14516e02 = interfaceC3618f.mo14516e0() & 65535;
        Long m17378b = m17378b(interfaceC3618f.mo14516e0() & 65535, interfaceC3618f.mo14516e0() & 65535);
        long mo14513Y2 = interfaceC3618f.mo14513Y() & 4294967295L;
        C5479v c5479v = new C5479v();
        c5479v.f19709a = interfaceC3618f.mo14513Y() & 4294967295L;
        C5479v c5479v2 = new C5479v();
        c5479v2.f19709a = interfaceC3618f.mo14513Y() & 4294967295L;
        int mo14516e03 = interfaceC3618f.mo14516e0() & 65535;
        int mo14516e04 = interfaceC3618f.mo14516e0() & 65535;
        int mo14516e05 = interfaceC3618f.mo14516e0() & 65535;
        interfaceC3618f.skip(8L);
        C5479v c5479v3 = new C5479v();
        c5479v3.f19709a = interfaceC3618f.mo14513Y() & 4294967295L;
        String mo14518l = interfaceC3618f.mo14518l(mo14516e03);
        if (AbstractC2294t.m7793z(mo14518l, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j7 = c5479v2.f19709a == 4294967295L ? 8 : 0L;
        long j8 = c5479v.f19709a == 4294967295L ? j7 + 8 : j7;
        if (c5479v3.f19709a == 4294967295L) {
            j8 += 8;
        }
        long j9 = j8;
        C5477t c5477t = new C5477t();
        m17383g(interfaceC3618f, mo14516e04, new b(c5477t, j9, c5479v2, interfaceC3618f, c5479v, c5479v3));
        if (j9 <= 0 || c5477t.f19707a) {
            return new C4139i(C3601M.a.m14500e(C3601M.f12052b, "/", false, 1, null).m14495p(mo14518l), AbstractC2291q.m7739o(mo14518l, "/", false, 2, null), interfaceC3618f.mo14518l(mo14516e05), mo14513Y2, c5479v.f19709a, c5479v2.f19709a, mo14516e02, m17378b, c5479v3.f19709a);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* renamed from: f */
    public static final C4136f m17382f(InterfaceC3618f interfaceC3618f) {
        int mo14516e0 = interfaceC3618f.mo14516e0() & 65535;
        int mo14516e02 = interfaceC3618f.mo14516e0() & 65535;
        long mo14516e03 = interfaceC3618f.mo14516e0() & 65535;
        if (mo14516e03 != (interfaceC3618f.mo14516e0() & 65535) || mo14516e0 != 0 || mo14516e02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC3618f.skip(4L);
        return new C4136f(mo14516e03, 4294967295L & interfaceC3618f.mo14513Y(), interfaceC3618f.mo14516e0() & 65535);
    }

    /* renamed from: g */
    public static final void m17383g(InterfaceC3618f interfaceC3618f, int i7, InterfaceC0804p interfaceC0804p) {
        long j7 = i7;
        while (j7 != 0) {
            if (j7 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int mo14516e0 = interfaceC3618f.mo14516e0() & 65535;
            long mo14516e02 = interfaceC3618f.mo14516e0() & 65535;
            long j8 = j7 - 4;
            if (j8 < mo14516e02) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC3618f.mo14520s0(mo14516e02);
            long m14618c0 = interfaceC3618f.mo14522x().m14618c0();
            interfaceC0804p.invoke(Integer.valueOf(mo14516e0), Long.valueOf(mo14516e02));
            long m14618c02 = (interfaceC3618f.mo14522x().m14618c0() + mo14516e02) - m14618c0;
            if (m14618c02 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + mo14516e0);
            }
            if (m14618c02 > 0) {
                interfaceC3618f.mo14522x().skip(m14618c02);
            }
            j7 = j8 - mo14516e02;
        }
    }

    /* renamed from: h */
    public static final C3621i m17384h(InterfaceC3618f interfaceC3618f, C3621i basicMetadata) {
        AbstractC5469l.m23028e(interfaceC3618f, "<this>");
        AbstractC5469l.m23028e(basicMetadata, "basicMetadata");
        C3621i m17385i = m17385i(interfaceC3618f, basicMetadata);
        AbstractC5469l.m23025b(m17385i);
        return m17385i;
    }

    /* renamed from: i */
    public static final C3621i m17385i(InterfaceC3618f interfaceC3618f, C3621i c3621i) {
        C5480w c5480w = new C5480w();
        c5480w.f19710a = c3621i != null ? c3621i.m14673a() : null;
        C5480w c5480w2 = new C5480w();
        C5480w c5480w3 = new C5480w();
        int mo14513Y = interfaceC3618f.mo14513Y();
        if (mo14513Y != 67324752) {
            throw new IOException("bad zip: expected " + m17379c(67324752) + " but was " + m17379c(mo14513Y));
        }
        interfaceC3618f.skip(2L);
        short mo14516e0 = interfaceC3618f.mo14516e0();
        int i7 = mo14516e0 & 65535;
        if ((mo14516e0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m17379c(i7));
        }
        interfaceC3618f.skip(18L);
        int mo14516e02 = interfaceC3618f.mo14516e0() & 65535;
        interfaceC3618f.skip(interfaceC3618f.mo14516e0() & 65535);
        if (c3621i == null) {
            interfaceC3618f.skip(mo14516e02);
            return null;
        }
        m17383g(interfaceC3618f, mo14516e02, new c(interfaceC3618f, c5480w, c5480w2, c5480w3));
        return new C3621i(c3621i.m14676d(), c3621i.m14675c(), null, c3621i.m14674b(), (Long) c5480w3.f19710a, (Long) c5480w.f19710a, (Long) c5480w2.f19710a, null, 128, null);
    }

    /* renamed from: j */
    public static final C4136f m17386j(InterfaceC3618f interfaceC3618f, C4136f c4136f) {
        interfaceC3618f.skip(12L);
        int mo14513Y = interfaceC3618f.mo14513Y();
        int mo14513Y2 = interfaceC3618f.mo14513Y();
        long mo14517i0 = interfaceC3618f.mo14517i0();
        if (mo14517i0 != interfaceC3618f.mo14517i0() || mo14513Y != 0 || mo14513Y2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC3618f.skip(8L);
        return new C4136f(mo14517i0, interfaceC3618f.mo14517i0(), c4136f.m17353b());
    }

    /* renamed from: k */
    public static final void m17387k(InterfaceC3618f interfaceC3618f) {
        AbstractC5469l.m23028e(interfaceC3618f, "<this>");
        m17385i(interfaceC3618f, null);
    }
}
