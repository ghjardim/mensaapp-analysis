package p032E3;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p011B3.C0044c;
import p011B3.C0045d;
import p011B3.InterfaceC0046e;
import p011B3.InterfaceC0047f;
import p011B3.InterfaceC0048g;
import p032E3.InterfaceC0292d;

/* renamed from: E3.f */
/* loaded from: classes.dex */
public final class C0294f implements InterfaceC0047f {

    /* renamed from: f */
    public static final Charset f1123f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C0045d f1124g = C0045d.m106a(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR).m111b(C0289a.m1156b().m1158c(1).m1157a()).m110a();

    /* renamed from: h */
    public static final C0045d f1125h = C0045d.m106a(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).m111b(C0289a.m1156b().m1158c(2).m1157a()).m110a();

    /* renamed from: i */
    public static final InterfaceC0046e f1126i = new InterfaceC0046e() { // from class: E3.e
        @Override // p011B3.InterfaceC0043b
        /* renamed from: a */
        public final void mo105a(Object obj, Object obj2) {
            C0294f.m1165t((Map.Entry) obj, (InterfaceC0047f) obj2);
        }
    };

    /* renamed from: a */
    public OutputStream f1127a;

    /* renamed from: b */
    public final Map f1128b;

    /* renamed from: c */
    public final Map f1129c;

    /* renamed from: d */
    public final InterfaceC0046e f1130d;

    /* renamed from: e */
    public final C0297i f1131e = new C0297i(this);

    /* renamed from: E3.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1132a;

        static {
            int[] iArr = new int[InterfaceC0292d.a.values().length];
            f1132a = iArr;
            try {
                iArr[InterfaceC0292d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1132a[InterfaceC0292d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1132a[InterfaceC0292d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0294f(OutputStream outputStream, Map map, Map map2, InterfaceC0046e interfaceC0046e) {
        this.f1127a = outputStream;
        this.f1128b = map;
        this.f1129c = map2;
        this.f1130d = interfaceC0046e;
    }

    /* renamed from: m */
    public static ByteBuffer m1162m(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    public static InterfaceC0292d m1163r(C0045d c0045d) {
        InterfaceC0292d interfaceC0292d = (InterfaceC0292d) c0045d.m109c(InterfaceC0292d.class);
        if (interfaceC0292d != null) {
            return interfaceC0292d;
        }
        throw new C0044c("Field has no @Protobuf config");
    }

    /* renamed from: s */
    public static int m1164s(C0045d c0045d) {
        InterfaceC0292d interfaceC0292d = (InterfaceC0292d) c0045d.m109c(InterfaceC0292d.class);
        if (interfaceC0292d != null) {
            return interfaceC0292d.tag();
        }
        throw new C0044c("Field has no @Protobuf config");
    }

    /* renamed from: t */
    public static /* synthetic */ void m1165t(Map.Entry entry, InterfaceC0047f interfaceC0047f) {
        interfaceC0047f.mo114c(f1124g, entry.getKey());
        interfaceC0047f.mo114c(f1125h, entry.getValue());
    }

    @Override // p011B3.InterfaceC0047f
    /* renamed from: c */
    public InterfaceC0047f mo114c(C0045d c0045d, Object obj) {
        return m1168g(c0045d, obj, true);
    }

    /* renamed from: e */
    public InterfaceC0047f m1166e(C0045d c0045d, double d7, boolean z6) {
        if (z6 && d7 == 0.0d) {
            return this;
        }
        m1178u((m1164s(c0045d) << 3) | 1);
        this.f1127a.write(m1162m(8).putDouble(d7).array());
        return this;
    }

    /* renamed from: f */
    public InterfaceC0047f m1167f(C0045d c0045d, float f7, boolean z6) {
        if (z6 && f7 == 0.0f) {
            return this;
        }
        m1178u((m1164s(c0045d) << 3) | 5);
        this.f1127a.write(m1162m(4).putFloat(f7).array());
        return this;
    }

    /* renamed from: g */
    public InterfaceC0047f m1168g(C0045d c0045d, Object obj, boolean z6) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return this;
            }
            m1178u((m1164s(c0045d) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f1123f);
            m1178u(bytes.length);
            this.f1127a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m1168g(c0045d, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m1175o(f1126i, c0045d, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m1166e(c0045d, ((Double) obj).doubleValue(), z6);
        }
        if (obj instanceof Float) {
            return m1167f(c0045d, ((Float) obj).floatValue(), z6);
        }
        if (obj instanceof Number) {
            return m1172k(c0045d, ((Number) obj).longValue(), z6);
        }
        if (obj instanceof Boolean) {
            return m1173l(c0045d, ((Boolean) obj).booleanValue(), z6);
        }
        if (!(obj instanceof byte[])) {
            InterfaceC0046e interfaceC0046e = (InterfaceC0046e) this.f1128b.get(obj.getClass());
            if (interfaceC0046e != null) {
                return m1175o(interfaceC0046e, c0045d, obj, z6);
            }
            InterfaceC0048g interfaceC0048g = (InterfaceC0048g) this.f1129c.get(obj.getClass());
            return interfaceC0048g != null ? m1176p(interfaceC0048g, c0045d, obj, z6) : obj instanceof InterfaceC0291c ? mo113b(c0045d, ((InterfaceC0291c) obj).mo1160a()) : obj instanceof Enum ? mo113b(c0045d, ((Enum) obj).ordinal()) : m1175o(this.f1130d, c0045d, obj, z6);
        }
        byte[] bArr = (byte[]) obj;
        if (z6 && bArr.length == 0) {
            return this;
        }
        m1178u((m1164s(c0045d) << 3) | 2);
        m1178u(bArr.length);
        this.f1127a.write(bArr);
        return this;
    }

    @Override // p011B3.InterfaceC0047f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0294f mo113b(C0045d c0045d, int i7) {
        return m1170i(c0045d, i7, true);
    }

    /* renamed from: i */
    public C0294f m1170i(C0045d c0045d, int i7, boolean z6) {
        if (z6 && i7 == 0) {
            return this;
        }
        InterfaceC0292d m1163r = m1163r(c0045d);
        int i8 = a.f1132a[m1163r.intEncoding().ordinal()];
        if (i8 == 1) {
            m1178u(m1163r.tag() << 3);
            m1178u(i7);
        } else if (i8 == 2) {
            m1178u(m1163r.tag() << 3);
            m1178u((i7 << 1) ^ (i7 >> 31));
        } else if (i8 == 3) {
            m1178u((m1163r.tag() << 3) | 5);
            this.f1127a.write(m1162m(4).putInt(i7).array());
        }
        return this;
    }

    @Override // p011B3.InterfaceC0047f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0294f mo112a(C0045d c0045d, long j7) {
        return m1172k(c0045d, j7, true);
    }

    /* renamed from: k */
    public C0294f m1172k(C0045d c0045d, long j7, boolean z6) {
        if (z6 && j7 == 0) {
            return this;
        }
        InterfaceC0292d m1163r = m1163r(c0045d);
        int i7 = a.f1132a[m1163r.intEncoding().ordinal()];
        if (i7 == 1) {
            m1178u(m1163r.tag() << 3);
            m1179v(j7);
        } else if (i7 == 2) {
            m1178u(m1163r.tag() << 3);
            m1179v((j7 >> 63) ^ (j7 << 1));
        } else if (i7 == 3) {
            m1178u((m1163r.tag() << 3) | 1);
            this.f1127a.write(m1162m(8).putLong(j7).array());
        }
        return this;
    }

    /* renamed from: l */
    public C0294f m1173l(C0045d c0045d, boolean z6, boolean z7) {
        return m1170i(c0045d, z6 ? 1 : 0, z7);
    }

    /* renamed from: n */
    public final long m1174n(InterfaceC0046e interfaceC0046e, Object obj) {
        C0290b c0290b = new C0290b();
        try {
            OutputStream outputStream = this.f1127a;
            this.f1127a = c0290b;
            try {
                interfaceC0046e.mo105a(obj, this);
                this.f1127a = outputStream;
                long m1159a = c0290b.m1159a();
                c0290b.close();
                return m1159a;
            } catch (Throwable th) {
                this.f1127a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0290b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: o */
    public final C0294f m1175o(InterfaceC0046e interfaceC0046e, C0045d c0045d, Object obj, boolean z6) {
        long m1174n = m1174n(interfaceC0046e, obj);
        if (z6 && m1174n == 0) {
            return this;
        }
        m1178u((m1164s(c0045d) << 3) | 2);
        m1179v(m1174n);
        interfaceC0046e.mo105a(obj, this);
        return this;
    }

    /* renamed from: p */
    public final C0294f m1176p(InterfaceC0048g interfaceC0048g, C0045d c0045d, Object obj, boolean z6) {
        this.f1131e.m1189b(c0045d, z6);
        interfaceC0048g.mo105a(obj, this.f1131e);
        return this;
    }

    /* renamed from: q */
    public C0294f m1177q(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC0046e interfaceC0046e = (InterfaceC0046e) this.f1128b.get(obj.getClass());
        if (interfaceC0046e != null) {
            interfaceC0046e.mo105a(obj, this);
            return this;
        }
        throw new C0044c("No encoder for " + obj.getClass());
    }

    /* renamed from: u */
    public final void m1178u(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f1127a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f1127a.write(i7 & 127);
    }

    /* renamed from: v */
    public final void m1179v(long j7) {
        while (((-128) & j7) != 0) {
            this.f1127a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f1127a.write(((int) j7) & 127);
    }
}
