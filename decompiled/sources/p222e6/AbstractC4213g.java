package p222e6;

import com.google.android.gms.common.api.C3643a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p246h6.InterfaceC4494d;
import p246h6.InterfaceC4495e;
import p256j$.util.Objects;
import p265j6.C5394d;
import p265j6.C5395e;

/* renamed from: e6.g */
/* loaded from: classes2.dex */
public abstract class AbstractC4213g {

    /* renamed from: a */
    public static final char f14060a = File.separatorChar;

    /* renamed from: b */
    public static final byte[] f14061b = new byte[0];

    /* renamed from: c */
    public static final String f14062c = System.lineSeparator();

    /* renamed from: d */
    public static final String f14063d = EnumC4214h.LF.m17655f();

    /* renamed from: e */
    public static final String f14064e = EnumC4214h.CRLF.m17655f();

    /* renamed from: f */
    public static final ThreadLocal f14065f;

    /* renamed from: g */
    public static final byte[] f14066g;

    /* renamed from: h */
    public static final ThreadLocal f14067h;

    /* renamed from: i */
    public static final char[] f14068i;

    static {
        final Supplier supplier = new Supplier() { // from class: e6.d
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC4213g.m17636d();
            }
        };
        f14065f = new ThreadLocal() { // from class: e6.f
            @Override // java.lang.ThreadLocal
            public /* synthetic */ Object initialValue() {
                return Supplier.this.get();
            }
        };
        f14066g = m17636d();
        final Supplier supplier2 = new Supplier() { // from class: e6.e
            @Override // java.util.function.Supplier
            public final Object get() {
                char[] m17638f;
                m17638f = AbstractC4213g.m17638f();
                return m17638f;
            }
        };
        f14067h = new ThreadLocal() { // from class: e6.f
            @Override // java.lang.ThreadLocal
            public /* synthetic */ Object initialValue() {
                return Supplier.this.get();
            }
        };
        f14068i = m17638f();
    }

    /* renamed from: d */
    public static byte[] m17636d() {
        return m17637e(8192);
    }

    /* renamed from: e */
    public static byte[] m17637e(int i7) {
        return new byte[i7];
    }

    /* renamed from: f */
    public static char[] m17638f() {
        return m17639g(8192);
    }

    /* renamed from: g */
    public static char[] m17639g(int i7) {
        return new char[i7];
    }

    /* renamed from: h */
    public static void m17640h(Closeable closeable) {
        m17642j(closeable, null);
    }

    /* renamed from: i */
    public static void m17641i(Closeable closeable) {
        m17642j(closeable, null);
    }

    /* renamed from: j */
    public static void m17642j(Closeable closeable, Consumer consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e7) {
                if (consumer != null) {
                    consumer.accept(e7);
                }
            }
        }
    }

    /* renamed from: k */
    public static void m17643k(InputStream inputStream) {
        m17640h(inputStream);
    }

    /* renamed from: l */
    public static void m17644l(OutputStream outputStream) {
        m17640h(outputStream);
    }

    /* renamed from: m */
    public static void m17645m(Reader reader) {
        m17640h(reader);
    }

    /* renamed from: n */
    public static int m17646n(InputStream inputStream, OutputStream outputStream) {
        long m17648p = m17648p(inputStream, outputStream);
        if (m17648p > 2147483647L) {
            return -1;
        }
        return (int) m17648p;
    }

    /* renamed from: o */
    public static long m17647o(InputStream inputStream, OutputStream outputStream, int i7) {
        return m17649q(inputStream, outputStream, m17637e(i7));
    }

    /* renamed from: p */
    public static long m17648p(InputStream inputStream, OutputStream outputStream) {
        return m17647o(inputStream, outputStream, 8192);
    }

    /* renamed from: q */
    public static long m17649q(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j7 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j7;
            }
            outputStream.write(bArr, 0, read);
            j7 += read;
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m17650r(C5394d c5394d) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.valueOf(C3643a.e.API_PRIORITY_OTHER)));
    }

    /* renamed from: t */
    public static int m17652t(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: u */
    public static byte[] m17653u(InputStream inputStream) {
        final C5395e m22309l = C5395e.m22307o().m22309l();
        try {
            C5394d c5394d = new C5394d(C3643a.e.API_PRIORITY_OTHER, new InterfaceC4494d() { // from class: e6.b
                @Override // p246h6.InterfaceC4494d
                public final void accept(Object obj) {
                    AbstractC4213g.m17650r((C5394d) obj);
                }
            }, new InterfaceC4495e() { // from class: e6.c
                @Override // p246h6.InterfaceC4495e
                public final Object apply(Object obj) {
                    OutputStream m17651s;
                    m17651s = AbstractC4213g.m17651s(C5395e.this, (C5394d) obj);
                    return m17651s;
                }
            });
            try {
                m17646n(inputStream, c5394d);
                byte[] mo22295c = m22309l.mo22295c();
                c5394d.close();
                m22309l.close();
                return mo22295c;
            } finally {
            }
        } catch (Throwable th) {
            if (m22309l != null) {
                try {
                    m22309l.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static /* synthetic */ OutputStream m17651s(C5395e c5395e, C5394d c5394d) {
        return c5395e;
    }
}
