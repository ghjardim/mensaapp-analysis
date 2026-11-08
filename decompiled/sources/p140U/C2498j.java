package p140U;

import androidx.datastore.preferences.protobuf.AbstractC3290f;
import androidx.datastore.preferences.protobuf.AbstractC3311t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import p112Q.C1982c;
import p126S.InterfaceC2299c;
import p133T.AbstractC2423d;
import p133T.C2425f;
import p133T.C2426g;
import p133T.C2427h;
import p140U.AbstractC2494f;
import p206c6.InterfaceC3617e;
import p206c6.InterfaceC3618f;
import p371w5.C6925h;
import p371w5.C6934q;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* renamed from: U.j */
/* loaded from: classes.dex */
public final class C2498j implements InterfaceC2299c {

    /* renamed from: a */
    public static final C2498j f7335a = new C2498j();

    /* renamed from: U.j$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7336a;

        static {
            int[] iArr = new int[C2427h.b.values().length];
            try {
                iArr[C2427h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2427h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2427h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2427h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2427h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C2427h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C2427h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C2427h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C2427h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f7336a = iArr;
        }
    }

    @Override // p126S.InterfaceC2299c
    /* renamed from: b */
    public Object mo7804b(InterfaceC3618f interfaceC3618f, InterfaceC7157e interfaceC7157e) {
        C2425f m8212a = AbstractC2423d.f7169a.m8212a(interfaceC3618f.mo14521w0());
        C2491c m8441b = AbstractC2495g.m8441b(new AbstractC2494f.b[0]);
        Map m8218R = m8212a.m8218R();
        AbstractC5469l.m23027d(m8218R, "preferencesProto.preferencesMap");
        for (Map.Entry entry : m8218R.entrySet()) {
            String name = (String) entry.getKey();
            C2427h value = (C2427h) entry.getValue();
            C2498j c2498j = f7335a;
            AbstractC5469l.m23027d(name, "name");
            AbstractC5469l.m23027d(value, "value");
            c2498j.m8452d(name, value, m8441b);
        }
        return m8441b.m8438d();
    }

    /* renamed from: d */
    public final void m8452d(String str, C2427h c2427h, C2491c c2491c) {
        C2427h.b m8250g0 = c2427h.m8250g0();
        switch (m8250g0 == null ? -1 : a.f7336a[m8250g0.ordinal()]) {
            case -1:
                throw new C1982c("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C6925h();
            case 1:
                c2491c.m8430j(AbstractC2496h.m8442a(str), Boolean.valueOf(c2427h.m8242X()));
                return;
            case 2:
                c2491c.m8430j(AbstractC2496h.m8445d(str), Float.valueOf(c2427h.m8245b0()));
                return;
            case 3:
                c2491c.m8430j(AbstractC2496h.m8444c(str), Double.valueOf(c2427h.m8244a0()));
                return;
            case 4:
                c2491c.m8430j(AbstractC2496h.m8446e(str), Integer.valueOf(c2427h.m8246c0()));
                return;
            case 5:
                c2491c.m8430j(AbstractC2496h.m8447f(str), Long.valueOf(c2427h.m8247d0()));
                return;
            case 6:
                AbstractC2494f.a m8448g = AbstractC2496h.m8448g(str);
                String m8248e0 = c2427h.m8248e0();
                AbstractC5469l.m23027d(m8248e0, "value.string");
                c2491c.m8430j(m8448g, m8248e0);
                return;
            case 7:
                AbstractC2494f.a m8449h = AbstractC2496h.m8449h(str);
                List m8229T = c2427h.m8249f0().m8229T();
                AbstractC5469l.m23027d(m8229T, "value.stringSet.stringsList");
                c2491c.m8430j(m8449h, AbstractC7032w.m28893S(m8229T));
                return;
            case 8:
                AbstractC2494f.a m8443b = AbstractC2496h.m8443b(str);
                byte[] m12350q = c2427h.m8243Y().m12350q();
                AbstractC5469l.m23027d(m12350q, "value.bytes.toByteArray()");
                c2491c.m8430j(m8443b, m12350q);
                return;
            case 9:
                throw new C1982c("Value not set.", null, 2, null);
        }
    }

    @Override // p126S.InterfaceC2299c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2494f mo7803a() {
        return AbstractC2495g.m8440a();
    }

    /* renamed from: f */
    public final C2427h m8454f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC3311t m12828i = C2427h.m8241h0().m8259q(((Boolean) obj).booleanValue()).m12828i();
            AbstractC5469l.m23027d(m12828i, "newBuilder().setBoolean(value).build()");
            return (C2427h) m12828i;
        }
        if (obj instanceof Float) {
            AbstractC3311t m12828i2 = C2427h.m8241h0().m8262t(((Number) obj).floatValue()).m12828i();
            AbstractC5469l.m23027d(m12828i2, "newBuilder().setFloat(value).build()");
            return (C2427h) m12828i2;
        }
        if (obj instanceof Double) {
            AbstractC3311t m12828i3 = C2427h.m8241h0().m8261s(((Number) obj).doubleValue()).m12828i();
            AbstractC5469l.m23027d(m12828i3, "newBuilder().setDouble(value).build()");
            return (C2427h) m12828i3;
        }
        if (obj instanceof Integer) {
            AbstractC3311t m12828i4 = C2427h.m8241h0().m8263u(((Number) obj).intValue()).m12828i();
            AbstractC5469l.m23027d(m12828i4, "newBuilder().setInteger(value).build()");
            return (C2427h) m12828i4;
        }
        if (obj instanceof Long) {
            AbstractC3311t m12828i5 = C2427h.m8241h0().m8264v(((Number) obj).longValue()).m12828i();
            AbstractC5469l.m23027d(m12828i5, "newBuilder().setLong(value).build()");
            return (C2427h) m12828i5;
        }
        if (obj instanceof String) {
            AbstractC3311t m12828i6 = C2427h.m8241h0().m8265w((String) obj).m12828i();
            AbstractC5469l.m23027d(m12828i6, "newBuilder().setString(value).build()");
            return (C2427h) m12828i6;
        }
        if (obj instanceof Set) {
            C2427h.a m8241h0 = C2427h.m8241h0();
            C2426g.a m8226U = C2426g.m8226U();
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC3311t m12828i7 = m8241h0.m8266x(m8226U.m8230q((Set) obj)).m12828i();
            AbstractC5469l.m23027d(m12828i7, "newBuilder().setStringSe…                ).build()");
            return (C2427h) m12828i7;
        }
        if (obj instanceof byte[]) {
            AbstractC3311t m12828i8 = C2427h.m8241h0().m8260r(AbstractC3290f.m12337g((byte[]) obj)).m12828i();
            AbstractC5469l.m23027d(m12828i8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (C2427h) m12828i8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // p126S.InterfaceC2299c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object mo7805c(AbstractC2494f abstractC2494f, InterfaceC3617e interfaceC3617e, InterfaceC7157e interfaceC7157e) {
        Map mo8423a = abstractC2494f.mo8423a();
        C2425f.a m8215U = C2425f.m8215U();
        for (Map.Entry entry : mo8423a.entrySet()) {
            m8215U.m8222q(((AbstractC2494f.a) entry.getKey()).m8439a(), m8454f(entry.getValue()));
        }
        ((C2425f) m8215U.m12828i()).m12236i(interfaceC3617e.mo14511u0());
        return C6934q.f24811a;
    }
}
