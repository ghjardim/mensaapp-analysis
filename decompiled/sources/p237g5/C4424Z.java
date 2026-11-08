package p237g5;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p171Y2.AbstractC2922e;
import p171Y2.AbstractC2932o;
import p186a3.AbstractC3106a;
import p186a3.AbstractC3107b;
import p207d.AbstractC4094d;
import p256j$.util.DesugarCollections;

/* renamed from: g5.Z */
/* loaded from: classes2.dex */
public final class C4424Z {

    /* renamed from: c */
    public static final Logger f15675c = Logger.getLogger(C4424Z.class.getName());

    /* renamed from: d */
    public static final e f15676d = new a();

    /* renamed from: e */
    public static final d f15677e = new b();

    /* renamed from: f */
    public static final AbstractC3106a f15678f = AbstractC3106a.m11329a().mo11339k();

    /* renamed from: a */
    public Object[] f15679a;

    /* renamed from: b */
    public int f15680b;

    /* renamed from: g5.Z$a */
    public class a implements e {
    }

    /* renamed from: g5.Z$c */
    public static class c extends g {

        /* renamed from: f */
        public final d f15681f;

        public /* synthetic */ c(String str, boolean z6, d dVar, a aVar) {
            this(str, z6, dVar);
        }

        @Override // p237g5.C4424Z.g
        /* renamed from: h */
        public Object mo18799h(byte[] bArr) {
            return this.f15681f.mo18796b(new String(bArr, AbstractC2922e.f9008a));
        }

        @Override // p237g5.C4424Z.g
        /* renamed from: j */
        public byte[] mo18800j(Object obj) {
            return ((String) AbstractC2932o.m10573p(this.f15681f.mo18795a(obj), "null marshaller.toAsciiString()")).getBytes(AbstractC2922e.f9008a);
        }

        public c(String str, boolean z6, d dVar) {
            super(str, z6, dVar, null);
            AbstractC2932o.m10569l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f15681f = (d) AbstractC2932o.m10573p(dVar, "marshaller");
        }
    }

    /* renamed from: g5.Z$d */
    public interface d {
        /* renamed from: a */
        String mo18795a(Object obj);

        /* renamed from: b */
        Object mo18796b(String str);
    }

    /* renamed from: g5.Z$e */
    public interface e {
    }

    /* renamed from: g5.Z$f */
    public interface f {
    }

    /* renamed from: g5.Z$g */
    public static abstract class g {

        /* renamed from: e */
        public static final BitSet f15682e = m18801b();

        /* renamed from: a */
        public final String f15683a;

        /* renamed from: b */
        public final String f15684b;

        /* renamed from: c */
        public final byte[] f15685c;

        /* renamed from: d */
        public final Object f15686d;

        public /* synthetic */ g(String str, boolean z6, Object obj, a aVar) {
            this(str, z6, obj);
        }

        /* renamed from: b */
        public static BitSet m18801b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c7 = '0'; c7 <= '9'; c7 = (char) (c7 + 1)) {
                bitSet.set(c7);
            }
            for (char c8 = 'a'; c8 <= 'z'; c8 = (char) (c8 + 1)) {
                bitSet.set(c8);
            }
            return bitSet;
        }

        /* renamed from: e */
        public static g m18802e(String str, d dVar) {
            return m18803f(str, false, dVar);
        }

        /* renamed from: f */
        public static g m18803f(String str, boolean z6, d dVar) {
            return new c(str, z6, dVar, null);
        }

        /* renamed from: g */
        public static g m18804g(String str, boolean z6, j jVar) {
            return new i(str, z6, jVar, null);
        }

        /* renamed from: k */
        public static String m18805k(String str, boolean z6) {
            AbstractC2932o.m10573p(str, "name");
            AbstractC2932o.m10562e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                C4424Z.f15675c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (!z6 || charAt != ':' || i7 != 0) {
                    AbstractC2932o.m10564g(f15682e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        /* renamed from: a */
        public byte[] m18806a() {
            return this.f15685c;
        }

        /* renamed from: c */
        public final Object m18807c(Class cls) {
            if (cls.isInstance(this.f15686d)) {
                return cls.cast(this.f15686d);
            }
            return null;
        }

        /* renamed from: d */
        public final String m18808d() {
            return this.f15684b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f15684b.equals(((g) obj).f15684b);
        }

        /* renamed from: h */
        public abstract Object mo18799h(byte[] bArr);

        public final int hashCode() {
            return this.f15684b.hashCode();
        }

        /* renamed from: i */
        public boolean m18809i() {
            return false;
        }

        /* renamed from: j */
        public abstract byte[] mo18800j(Object obj);

        public String toString() {
            return "Key{name='" + this.f15684b + "'}";
        }

        public g(String str, boolean z6, Object obj) {
            String str2 = (String) AbstractC2932o.m10573p(str, "name");
            this.f15683a = str2;
            String m18805k = m18805k(str2.toLowerCase(Locale.ROOT), z6);
            this.f15684b = m18805k;
            this.f15685c = m18805k.getBytes(AbstractC2922e.f9008a);
            this.f15686d = obj;
        }
    }

    /* renamed from: g5.Z$h */
    public static final class h {

        /* renamed from: a */
        public final Object f15687a;

        /* renamed from: b */
        public volatile byte[] f15688b;

        public h(f fVar, Object obj) {
            this.f15687a = obj;
        }

        /* renamed from: a */
        public static h m18810a(g gVar, Object obj) {
            m18811b(gVar);
            AbstractC4094d.m17162a(AbstractC2932o.m10572o(null));
            return new h(null, obj);
        }

        /* renamed from: b */
        public static f m18811b(g gVar) {
            AbstractC4094d.m17162a(gVar.m18807c(f.class));
            return null;
        }

        /* renamed from: c */
        public byte[] m18812c() {
            if (this.f15688b == null) {
                synchronized (this) {
                    try {
                        if (this.f15688b == null) {
                            this.f15688b = C4424Z.m18774r(m18814e());
                        }
                    } finally {
                    }
                }
            }
            return this.f15688b;
        }

        /* renamed from: d */
        public Object m18813d(g gVar) {
            if (gVar.m18809i()) {
                m18811b(gVar);
            }
            return gVar.mo18799h(m18812c());
        }

        /* renamed from: e */
        public InputStream m18814e() {
            throw null;
        }
    }

    /* renamed from: g5.Z$i */
    public static final class i extends g {

        /* renamed from: f */
        public final j f15689f;

        public /* synthetic */ i(String str, boolean z6, j jVar, a aVar) {
            this(str, z6, jVar);
        }

        @Override // p237g5.C4424Z.g
        /* renamed from: h */
        public Object mo18799h(byte[] bArr) {
            return this.f15689f.mo18816b(bArr);
        }

        @Override // p237g5.C4424Z.g
        /* renamed from: j */
        public byte[] mo18800j(Object obj) {
            return (byte[]) AbstractC2932o.m10573p(this.f15689f.mo18815a(obj), "null marshaller.toAsciiString()");
        }

        public i(String str, boolean z6, j jVar) {
            super(str, z6, jVar, null);
            AbstractC2932o.m10569l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f15689f = (j) AbstractC2932o.m10573p(jVar, "marshaller");
        }
    }

    /* renamed from: g5.Z$j */
    public interface j {
        /* renamed from: a */
        byte[] mo18815a(Object obj);

        /* renamed from: b */
        Object mo18816b(byte[] bArr);
    }

    public C4424Z(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: r */
    public static byte[] m18774r(InputStream inputStream) {
        try {
            return AbstractC3107b.m11352d(inputStream);
        } catch (IOException e7) {
            throw new RuntimeException("failure reading serialized stream", e7);
        }
    }

    /* renamed from: c */
    public final boolean m18775c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: d */
    public final int m18776d() {
        Object[] objArr = this.f15679a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: e */
    public void m18777e(g gVar) {
        if (m18781i()) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f15680b; i8++) {
            if (!m18775c(gVar.m18806a(), m18787o(i8))) {
                m18786n(i7, m18787o(i8));
                m18791t(i7, m18790s(i8));
                i7++;
            }
        }
        Arrays.fill(this.f15679a, i7 * 2, m18783k(), (Object) null);
        this.f15680b = i7;
    }

    /* renamed from: f */
    public final void m18778f(int i7) {
        Object[] objArr = new Object[i7];
        if (!m18781i()) {
            System.arraycopy(this.f15679a, 0, objArr, 0, m18783k());
        }
        this.f15679a = objArr;
    }

    /* renamed from: g */
    public Object m18779g(g gVar) {
        for (int i7 = this.f15680b - 1; i7 >= 0; i7--) {
            if (m18775c(gVar.m18806a(), m18787o(i7))) {
                return m18794w(i7, gVar);
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m18780h() {
        return this.f15680b;
    }

    /* renamed from: i */
    public final boolean m18781i() {
        return this.f15680b == 0;
    }

    /* renamed from: j */
    public Set m18782j() {
        if (m18781i()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f15680b);
        for (int i7 = 0; i7 < this.f15680b; i7++) {
            hashSet.add(new String(m18787o(i7), 0));
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    /* renamed from: k */
    public final int m18783k() {
        return this.f15680b * 2;
    }

    /* renamed from: l */
    public final void m18784l() {
        if (m18783k() == 0 || m18783k() == m18776d()) {
            m18778f(Math.max(m18783k() * 2, 8));
        }
    }

    /* renamed from: m */
    public void m18785m(C4424Z c4424z) {
        if (c4424z.m18781i()) {
            return;
        }
        int m18776d = m18776d() - m18783k();
        if (m18781i() || m18776d < c4424z.m18783k()) {
            m18778f(m18783k() + c4424z.m18783k());
        }
        System.arraycopy(c4424z.f15679a, 0, this.f15679a, m18783k(), c4424z.m18783k());
        this.f15680b += c4424z.f15680b;
    }

    /* renamed from: n */
    public final void m18786n(int i7, byte[] bArr) {
        this.f15679a[i7 * 2] = bArr;
    }

    /* renamed from: o */
    public final byte[] m18787o(int i7) {
        return (byte[]) this.f15679a[i7 * 2];
    }

    /* renamed from: p */
    public void m18788p(g gVar, Object obj) {
        AbstractC2932o.m10573p(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        AbstractC2932o.m10573p(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        m18784l();
        m18786n(this.f15680b, gVar.m18806a());
        if (gVar.m18809i()) {
            m18791t(this.f15680b, h.m18810a(gVar, obj));
        } else {
            m18792u(this.f15680b, gVar.mo18800j(obj));
        }
        this.f15680b++;
    }

    /* renamed from: q */
    public byte[][] m18789q() {
        byte[][] bArr = new byte[m18783k()][];
        Object[] objArr = this.f15679a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m18783k());
        } else {
            for (int i7 = 0; i7 < this.f15680b; i7++) {
                int i8 = i7 * 2;
                bArr[i8] = m18787o(i7);
                bArr[i8 + 1] = m18793v(i7);
            }
        }
        return bArr;
    }

    /* renamed from: s */
    public final Object m18790s(int i7) {
        return this.f15679a[(i7 * 2) + 1];
    }

    /* renamed from: t */
    public final void m18791t(int i7, Object obj) {
        if (this.f15679a instanceof byte[][]) {
            m18778f(m18776d());
        }
        this.f15679a[(i7 * 2) + 1] = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i7 = 0; i7 < this.f15680b; i7++) {
            if (i7 != 0) {
                sb.append(',');
            }
            byte[] m18787o = m18787o(i7);
            Charset charset = AbstractC2922e.f9008a;
            String str = new String(m18787o, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f15678f.m11334e(m18793v(i7)));
            } else {
                sb.append(new String(m18793v(i7), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: u */
    public final void m18792u(int i7, byte[] bArr) {
        this.f15679a[(i7 * 2) + 1] = bArr;
    }

    /* renamed from: v */
    public final byte[] m18793v(int i7) {
        Object m18790s = m18790s(i7);
        return m18790s instanceof byte[] ? (byte[]) m18790s : ((h) m18790s).m18812c();
    }

    /* renamed from: w */
    public final Object m18794w(int i7, g gVar) {
        Object m18790s = m18790s(i7);
        return m18790s instanceof byte[] ? gVar.mo18799h((byte[]) m18790s) : ((h) m18790s).m18813d(gVar);
    }

    public C4424Z(int i7, byte[]... bArr) {
        this(i7, (Object[]) bArr);
    }

    public C4424Z(int i7, Object[] objArr) {
        this.f15680b = i7;
        this.f15679a = objArr;
    }

    public C4424Z() {
    }

    /* renamed from: g5.Z$b */
    public class b implements d {
        @Override // p237g5.C4424Z.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String mo18796b(String str) {
            return str;
        }

        @Override // p237g5.C4424Z.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo18795a(String str) {
            return str;
        }
    }
}
