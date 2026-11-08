package com.google.protobuf;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4049f;
import com.google.protobuf.C4027N;
import com.google.protobuf.InterfaceC4016C0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p207d.AbstractC4094d;
import p272k4.C5410A;
import p272k4.C5413D;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.Y */
/* loaded from: classes.dex */
public final class C4037Y implements InterfaceC4066n0 {

    /* renamed from: r */
    public static final int[] f13331r = new int[0];

    /* renamed from: s */
    public static final Unsafe f13332s = AbstractC4090z0.m17088H();

    /* renamed from: a */
    public final int[] f13333a;

    /* renamed from: b */
    public final Object[] f13334b;

    /* renamed from: c */
    public final int f13335c;

    /* renamed from: d */
    public final int f13336d;

    /* renamed from: e */
    public final InterfaceC4034V f13337e;

    /* renamed from: f */
    public final boolean f13338f;

    /* renamed from: g */
    public final boolean f13339g;

    /* renamed from: h */
    public final EnumC4054h0 f13340h;

    /* renamed from: i */
    public final boolean f13341i;

    /* renamed from: j */
    public final int[] f13342j;

    /* renamed from: k */
    public final int f13343k;

    /* renamed from: l */
    public final int f13344l;

    /* renamed from: m */
    public final InterfaceC4040a0 f13345m;

    /* renamed from: n */
    public final AbstractC4024K f13346n;

    /* renamed from: o */
    public final AbstractC4082v0 f13347o;

    /* renamed from: p */
    public final AbstractC4073r f13348p;

    /* renamed from: q */
    public final InterfaceC4029P f13349q;

    /* renamed from: com.google.protobuf.Y$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13350a;

        static {
            int[] iArr = new int[AbstractC4014B0.b.values().length];
            f13350a = iArr;
            try {
                iArr[AbstractC4014B0.b.f13251q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13255u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13244c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13250p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13258x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13249o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13259y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13245d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13257w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13248n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13256v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13246e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13247f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13254t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13260z.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13242A.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13350a[AbstractC4014B0.b.f13252r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C4037Y(int[] iArr, Object[] objArr, int i7, int i8, InterfaceC4034V interfaceC4034V, EnumC4054h0 enumC4054h0, boolean z6, int[] iArr2, int i9, int i10, InterfaceC4040a0 interfaceC4040a0, AbstractC4024K abstractC4024K, AbstractC4082v0 abstractC4082v0, AbstractC4073r abstractC4073r, InterfaceC4029P interfaceC4029P) {
        this.f13333a = iArr;
        this.f13334b = objArr;
        this.f13335c = i7;
        this.f13336d = i8;
        this.f13339g = interfaceC4034V instanceof AbstractC4087y;
        this.f13340h = enumC4054h0;
        this.f13338f = abstractC4073r != null && abstractC4073r.mo16913e(interfaceC4034V);
        this.f13341i = z6;
        this.f13342j = iArr2;
        this.f13343k = i9;
        this.f13344l = i10;
        this.f13345m = interfaceC4040a0;
        this.f13346n = abstractC4024K;
        this.f13347o = abstractC4082v0;
        this.f13348p = abstractC4073r;
        this.f13337e = interfaceC4034V;
        this.f13349q = interfaceC4029P;
    }

    /* renamed from: B */
    public static boolean m16330B(Object obj, int i7, InterfaceC4066n0 interfaceC4066n0) {
        return interfaceC4066n0.mo16369c(AbstractC4090z0.m17087G(obj, m16338V(i7)));
    }

    /* renamed from: C */
    public static boolean m16331C(int i7) {
        return (i7 & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: F */
    public static boolean m16332F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC4087y) {
            return ((AbstractC4087y) obj).m17040I();
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m16333I(int i7) {
        return (i7 & 268435456) != 0;
    }

    /* renamed from: J */
    public static long m16334J(Object obj, long j7) {
        return AbstractC4090z0.m17085E(obj, j7);
    }

    /* renamed from: R */
    public static C4037Y m16335R(Class cls, InterfaceC4032T interfaceC4032T, InterfaceC4040a0 interfaceC4040a0, AbstractC4024K abstractC4024K, AbstractC4082v0 abstractC4082v0, AbstractC4073r abstractC4073r, InterfaceC4029P interfaceC4029P) {
        if (interfaceC4032T instanceof C4060k0) {
            return m16337T((C4060k0) interfaceC4032T, interfaceC4040a0, abstractC4024K, abstractC4082v0, abstractC4073r, interfaceC4029P);
        }
        AbstractC4094d.m17162a(interfaceC4032T);
        return m16336S(null, interfaceC4040a0, abstractC4024K, abstractC4082v0, abstractC4073r, interfaceC4029P);
    }

    /* renamed from: S */
    public static C4037Y m16336S(AbstractC4074r0 abstractC4074r0, InterfaceC4040a0 interfaceC4040a0, AbstractC4024K abstractC4024K, AbstractC4082v0 abstractC4082v0, AbstractC4073r abstractC4073r, InterfaceC4029P interfaceC4029P) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.C4037Y m16337T(com.google.protobuf.C4060k0 r31, com.google.protobuf.InterfaceC4040a0 r32, com.google.protobuf.AbstractC4024K r33, com.google.protobuf.AbstractC4082v0 r34, com.google.protobuf.AbstractC4073r r35, com.google.protobuf.InterfaceC4029P r36) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4037Y.m16337T(com.google.protobuf.k0, com.google.protobuf.a0, com.google.protobuf.K, com.google.protobuf.v0, com.google.protobuf.r, com.google.protobuf.P):com.google.protobuf.Y");
    }

    /* renamed from: V */
    public static long m16338V(int i7) {
        return i7 & 1048575;
    }

    /* renamed from: W */
    public static boolean m16339W(Object obj, long j7) {
        return ((Boolean) AbstractC4090z0.m17087G(obj, j7)).booleanValue();
    }

    /* renamed from: X */
    public static double m16340X(Object obj, long j7) {
        return ((Double) AbstractC4090z0.m17087G(obj, j7)).doubleValue();
    }

    /* renamed from: Y */
    public static float m16341Y(Object obj, long j7) {
        return ((Float) AbstractC4090z0.m17087G(obj, j7)).floatValue();
    }

    /* renamed from: Z */
    public static int m16342Z(Object obj, long j7) {
        return ((Integer) AbstractC4090z0.m17087G(obj, j7)).intValue();
    }

    /* renamed from: a0 */
    public static long m16343a0(Object obj, long j7) {
        return ((Long) AbstractC4090z0.m17087G(obj, j7)).longValue();
    }

    /* renamed from: k */
    public static boolean m16344k(Object obj, long j7) {
        return AbstractC4090z0.m17124t(obj, j7);
    }

    /* renamed from: l */
    public static void m16345l(Object obj) {
        if (m16332F(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* renamed from: m0 */
    public static Field m16346m0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: o */
    public static double m16347o(Object obj, long j7) {
        return AbstractC4090z0.m17081A(obj, j7);
    }

    /* renamed from: r */
    public static float m16348r(Object obj, long j7) {
        return AbstractC4090z0.m17082B(obj, j7);
    }

    /* renamed from: s0 */
    public static int m16349s0(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    /* renamed from: v */
    public static C4084w0 m16350v(Object obj) {
        AbstractC4087y abstractC4087y = (AbstractC4087y) obj;
        C4084w0 c4084w0 = abstractC4087y.unknownFields;
        if (c4084w0 != C4084w0.m16986c()) {
            return c4084w0;
        }
        C4084w0 m16990k = C4084w0.m16990k();
        abstractC4087y.unknownFields = m16990k;
        return m16990k;
    }

    /* renamed from: x */
    public static int m16351x(Object obj, long j7) {
        return AbstractC4090z0.m17083C(obj, j7);
    }

    /* renamed from: y */
    public static boolean m16352y(int i7) {
        return (i7 & 536870912) != 0;
    }

    /* renamed from: A */
    public final boolean m16353A(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? m16406z(obj, i7) : (i9 & i10) != 0;
    }

    /* renamed from: D */
    public final boolean m16354D(Object obj, int i7, int i8) {
        List list = (List) AbstractC4090z0.m17087G(obj, m16338V(i7));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC4066n0 m16399u = m16399u(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!m16399u.mo16369c(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m16355E(Object obj, int i7, int i8) {
        Map mo16306h = this.f13349q.mo16306h(AbstractC4090z0.m17087G(obj, m16338V(i7)));
        if (mo16306h.isEmpty()) {
            return true;
        }
        if (this.f13349q.mo16301c(m16397t(i8)).f13324c.m16181b() != AbstractC4014B0.c.MESSAGE) {
            return true;
        }
        InterfaceC4066n0 interfaceC4066n0 = null;
        for (Object obj2 : mo16306h.values()) {
            if (interfaceC4066n0 == null) {
                interfaceC4066n0 = C4056i0.m16519a().m16521c(obj2.getClass());
            }
            if (!interfaceC4066n0.mo16369c(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean m16356G(Object obj, Object obj2, int i7) {
        long m16380h0 = m16380h0(i7) & 1048575;
        return AbstractC4090z0.m17083C(obj, m16380h0) == AbstractC4090z0.m17083C(obj2, m16380h0);
    }

    /* renamed from: H */
    public final boolean m16357H(Object obj, int i7, int i8) {
        return AbstractC4090z0.m17083C(obj, (long) (m16380h0(i8) & 1048575)) == i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x009c, code lost:
    
        r0 = r19.f13343k;
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00a2, code lost:
    
        if (r0 >= r19.f13344l) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00a4, code lost:
    
        r5 = m16393q(r22, r19.f13342j[r0], r5, r20, r22);
        r0 = r0 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00ba, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00bb, code lost:
    
        if (r5 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00bd, code lost:
    
        r7.mo16979o(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0604 A[Catch: all -> 0x0291, TRY_LEAVE, TryCatch #2 {all -> 0x0291, blocks: (B:42:0x05fe, B:44:0x0604, B:57:0x062d, B:117:0x028c, B:120:0x0294, B:121:0x02a5, B:122:0x02b6, B:123:0x02c7, B:124:0x02d8, B:125:0x02f9, B:126:0x030a, B:127:0x031b, B:128:0x032c, B:129:0x033d, B:130:0x034e, B:131:0x035f, B:132:0x0370, B:133:0x0381, B:134:0x0392, B:135:0x03a3, B:136:0x03b4, B:137:0x03c5, B:138:0x03d6, B:139:0x03f7, B:140:0x0408, B:141:0x0419, B:142:0x042d, B:143:0x0434, B:144:0x0445, B:145:0x0456, B:146:0x0467, B:147:0x0478, B:148:0x0489, B:149:0x049a, B:150:0x04ab, B:151:0x04bc, B:152:0x04d0, B:153:0x04e2, B:154:0x04f4, B:155:0x0506, B:156:0x0518, B:157:0x052d, B:158:0x053f, B:159:0x0551, B:160:0x0565, B:161:0x056f, B:162:0x0581, B:163:0x0593, B:164:0x05a5, B:165:0x05b7, B:166:0x05c9, B:167:0x05db, B:168:0x05ed), top: B:41:0x05fe }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x066d A[LOOP:4: B:76:0x0669->B:78:0x066d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0682  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16358K(com.google.protobuf.AbstractC4082v0 r20, com.google.protobuf.AbstractC4073r r21, java.lang.Object r22, com.google.protobuf.InterfaceC4062l0 r23, com.google.protobuf.C4071q r24) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4037Y.m16358K(com.google.protobuf.v0, com.google.protobuf.r, java.lang.Object, com.google.protobuf.l0, com.google.protobuf.q):void");
    }

    /* renamed from: L */
    public final void m16359L(Object obj, int i7, Object obj2, C4071q c4071q, InterfaceC4062l0 interfaceC4062l0) {
        long m16338V = m16338V(m16398t0(i7));
        Object m17087G = AbstractC4090z0.m17087G(obj, m16338V);
        if (m17087G == null) {
            m17087G = this.f13349q.mo16303e(obj2);
            AbstractC4090z0.m17102V(obj, m16338V, m17087G);
        } else if (this.f13349q.mo16305g(m17087G)) {
            Object mo16303e = this.f13349q.mo16303e(obj2);
            this.f13349q.mo16299a(mo16303e, m17087G);
            AbstractC4090z0.m17102V(obj, m16338V, mo16303e);
            m17087G = mo16303e;
        }
        interfaceC4062l0.mo16642N(this.f13349q.mo16302d(m17087G), this.f13349q.mo16301c(obj2), c4071q);
    }

    /* renamed from: M */
    public final void m16360M(Object obj, Object obj2, int i7) {
        if (m16406z(obj2, i7)) {
            long m16338V = m16338V(m16398t0(i7));
            Unsafe unsafe = f13332s;
            Object object = unsafe.getObject(obj2, m16338V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m16365U(i7) + " is present but null: " + obj2);
            }
            InterfaceC4066n0 m16399u = m16399u(i7);
            if (!m16406z(obj, i7)) {
                if (m16332F(object)) {
                    Object newInstance = m16399u.newInstance();
                    m16399u.mo16366a(newInstance, object);
                    unsafe.putObject(obj, m16338V, newInstance);
                } else {
                    unsafe.putObject(obj, m16338V, object);
                }
                m16389n0(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, m16338V);
            if (!m16332F(object2)) {
                Object newInstance2 = m16399u.newInstance();
                m16399u.mo16366a(newInstance2, object2);
                unsafe.putObject(obj, m16338V, newInstance2);
                object2 = newInstance2;
            }
            m16399u.mo16366a(object2, object);
        }
    }

    /* renamed from: N */
    public final void m16361N(Object obj, Object obj2, int i7) {
        int m16365U = m16365U(i7);
        if (m16357H(obj2, m16365U, i7)) {
            long m16338V = m16338V(m16398t0(i7));
            Unsafe unsafe = f13332s;
            Object object = unsafe.getObject(obj2, m16338V);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m16365U(i7) + " is present but null: " + obj2);
            }
            InterfaceC4066n0 m16399u = m16399u(i7);
            if (!m16357H(obj, m16365U, i7)) {
                if (m16332F(object)) {
                    Object newInstance = m16399u.newInstance();
                    m16399u.mo16366a(newInstance, object);
                    unsafe.putObject(obj, m16338V, newInstance);
                } else {
                    unsafe.putObject(obj, m16338V, object);
                }
                m16390o0(obj, m16365U, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, m16338V);
            if (!m16332F(object2)) {
                Object newInstance2 = m16399u.newInstance();
                m16399u.mo16366a(newInstance2, object2);
                unsafe.putObject(obj, m16338V, newInstance2);
                object2 = newInstance2;
            }
            m16399u.mo16366a(object2, object);
        }
    }

    /* renamed from: O */
    public final void m16362O(Object obj, Object obj2, int i7) {
        int m16398t0 = m16398t0(i7);
        long m16338V = m16338V(m16398t0);
        int m16365U = m16365U(i7);
        switch (m16349s0(m16398t0)) {
            case 0:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17098R(obj, m16338V, AbstractC4090z0.m17081A(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 1:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17099S(obj, m16338V, AbstractC4090z0.m17082B(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 2:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17101U(obj, m16338V, AbstractC4090z0.m17085E(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 3:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17101U(obj, m16338V, AbstractC4090z0.m17085E(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 4:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17100T(obj, m16338V, AbstractC4090z0.m17083C(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 5:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17101U(obj, m16338V, AbstractC4090z0.m17085E(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 6:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17100T(obj, m16338V, AbstractC4090z0.m17083C(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 7:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17092L(obj, m16338V, AbstractC4090z0.m17124t(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 8:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17102V(obj, m16338V, AbstractC4090z0.m17087G(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 9:
                m16360M(obj, obj2, i7);
                break;
            case 10:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17102V(obj, m16338V, AbstractC4090z0.m17087G(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 11:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17100T(obj, m16338V, AbstractC4090z0.m17083C(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17100T(obj, m16338V, AbstractC4090z0.m17083C(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 13:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17100T(obj, m16338V, AbstractC4090z0.m17083C(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 14:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17101U(obj, m16338V, AbstractC4090z0.m17085E(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 15:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17100T(obj, m16338V, AbstractC4090z0.m17083C(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 16:
                if (m16406z(obj2, i7)) {
                    AbstractC4090z0.m17101U(obj, m16338V, AbstractC4090z0.m17085E(obj2, m16338V));
                    m16389n0(obj, i7);
                    break;
                }
                break;
            case 17:
                m16360M(obj, obj2, i7);
                break;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f13346n.mo16269d(obj, obj2, m16338V);
                break;
            case 50:
                AbstractC4070p0.m16827E(this.f13349q, obj, obj2, m16338V);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m16357H(obj2, m16365U, i7)) {
                    AbstractC4090z0.m17102V(obj, m16338V, AbstractC4090z0.m17087G(obj2, m16338V));
                    m16390o0(obj, m16365U, i7);
                    break;
                }
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                m16361N(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m16357H(obj2, m16365U, i7)) {
                    AbstractC4090z0.m17102V(obj, m16338V, AbstractC4090z0.m17087G(obj2, m16338V));
                    m16390o0(obj, m16365U, i7);
                    break;
                }
                break;
            case 68:
                m16361N(obj, obj2, i7);
                break;
        }
    }

    /* renamed from: P */
    public final Object m16363P(Object obj, int i7) {
        InterfaceC4066n0 m16399u = m16399u(i7);
        long m16338V = m16338V(m16398t0(i7));
        if (!m16406z(obj, i7)) {
            return m16399u.newInstance();
        }
        Object object = f13332s.getObject(obj, m16338V);
        if (m16332F(object)) {
            return object;
        }
        Object newInstance = m16399u.newInstance();
        if (object != null) {
            m16399u.mo16366a(newInstance, object);
        }
        return newInstance;
    }

    /* renamed from: Q */
    public final Object m16364Q(Object obj, int i7, int i8) {
        InterfaceC4066n0 m16399u = m16399u(i8);
        if (!m16357H(obj, i7, i8)) {
            return m16399u.newInstance();
        }
        Object object = f13332s.getObject(obj, m16338V(m16398t0(i8)));
        if (m16332F(object)) {
            return object;
        }
        Object newInstance = m16399u.newInstance();
        if (object != null) {
            m16399u.mo16366a(newInstance, object);
        }
        return newInstance;
    }

    /* renamed from: U */
    public final int m16365U(int i7) {
        return this.f13333a[i7];
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: a */
    public void mo16366a(Object obj, Object obj2) {
        m16345l(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f13333a.length; i7 += 3) {
            m16362O(obj, obj2, i7);
        }
        AbstractC4070p0.m16828F(this.f13347o, obj, obj2);
        if (this.f13338f) {
            AbstractC4070p0.m16826D(this.f13348p, obj, obj2);
        }
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: b */
    public void mo16367b(Object obj) {
        if (m16332F(obj)) {
            if (obj instanceof AbstractC4087y) {
                AbstractC4087y abstractC4087y = (AbstractC4087y) obj;
                abstractC4087y.m17050r();
                abstractC4087y.m17049q();
                abstractC4087y.m17042K();
            }
            int length = this.f13333a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int m16398t0 = m16398t0(i7);
                long m16338V = m16338V(m16398t0);
                int m16349s0 = m16349s0(m16398t0);
                if (m16349s0 != 9) {
                    if (m16349s0 != 60 && m16349s0 != 68) {
                        switch (m16349s0) {
                            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            case 19:
                            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f13346n.mo16268c(obj, m16338V);
                                break;
                            case 50:
                                Unsafe unsafe = f13332s;
                                Object object = unsafe.getObject(obj, m16338V);
                                if (object != null) {
                                    unsafe.putObject(obj, m16338V, this.f13349q.mo16300b(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (m16357H(obj, m16365U(i7), i7)) {
                        m16399u(i7).mo16367b(f13332s.getObject(obj, m16338V));
                    }
                }
                if (m16406z(obj, i7)) {
                    m16399u(i7).mo16367b(f13332s.getObject(obj, m16338V));
                }
            }
            this.f13347o.mo16974j(obj);
            if (this.f13338f) {
                this.f13348p.mo16914f(obj);
            }
        }
    }

    /* renamed from: b0 */
    public final int m16368b0(Object obj, byte[] bArr, int i7, int i8, int i9, long j7, AbstractC4049f.a aVar) {
        Unsafe unsafe = f13332s;
        Object m16397t = m16397t(i9);
        Object object = unsafe.getObject(obj, j7);
        if (this.f13349q.mo16305g(object)) {
            Object mo16303e = this.f13349q.mo16303e(m16397t);
            this.f13349q.mo16299a(mo16303e, object);
            unsafe.putObject(obj, j7, mo16303e);
            object = mo16303e;
        }
        return m16387m(bArr, i7, i8, this.f13349q.mo16301c(m16397t), this.f13349q.mo16302d(object), aVar);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: c */
    public final boolean mo16369c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f13343k) {
            int i12 = this.f13342j[i11];
            int m16365U = m16365U(i12);
            int m16398t0 = m16398t0(i12);
            int i13 = this.f13333a[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i9) {
                if (i14 != 1048575) {
                    i10 = f13332s.getInt(obj, i14);
                }
                i8 = i10;
                i7 = i14;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if (m16333I(m16398t0) && !m16353A(obj, i12, i7, i8, i15)) {
                return false;
            }
            int m16349s0 = m16349s0(m16398t0);
            if (m16349s0 != 9 && m16349s0 != 17) {
                if (m16349s0 != 27) {
                    if (m16349s0 == 60 || m16349s0 == 68) {
                        if (m16357H(obj, m16365U, i12) && !m16330B(obj, m16398t0, m16399u(i12))) {
                            return false;
                        }
                    } else if (m16349s0 != 49) {
                        if (m16349s0 == 50 && !m16355E(obj, m16398t0, i12)) {
                            return false;
                        }
                    }
                }
                if (!m16354D(obj, m16398t0, i12)) {
                    return false;
                }
            } else if (m16353A(obj, i12, i7, i8, i15) && !m16330B(obj, m16398t0, m16399u(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.f13338f || this.f13348p.mo16911c(obj).m16952k();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x009a. Please report as an issue. */
    /* renamed from: c0 */
    public int m16370c0(Object obj, byte[] bArr, int i7, int i8, int i9, AbstractC4049f.a aVar) {
        Unsafe unsafe;
        int i10;
        C4037Y c4037y;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c7;
        byte[] bArr2;
        byte[] bArr3;
        int m16456L;
        int i23;
        C4037Y c4037y2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i24 = i8;
        int i25 = i9;
        AbstractC4049f.a aVar2 = aVar;
        m16345l(obj);
        Unsafe unsafe2 = f13332s;
        int i26 = i7;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b7 = bArr4[i26];
                if (b7 < 0) {
                    int m16452H = AbstractC4049f.m16452H(b7, bArr4, i32, aVar2);
                    i15 = aVar2.f13370a;
                    i32 = m16452H;
                } else {
                    i15 = b7;
                }
                int i33 = i15 >>> 3;
                int i34 = i15 & 7;
                int m16378g0 = i33 > i30 ? c4037y2.m16378g0(i33, i27 / 3) : c4037y2.m16376f0(i33);
                if (m16378g0 == -1) {
                    i16 = i33;
                    i17 = i32;
                    i12 = i15;
                    i18 = i29;
                    i19 = i31;
                    unsafe = unsafe2;
                    i10 = i25;
                    i20 = 0;
                } else {
                    int i35 = c4037y2.f13333a[m16378g0 + 1];
                    int m16349s0 = m16349s0(i35);
                    long m16338V = m16338V(i35);
                    int i36 = i15;
                    if (m16349s0 <= 17) {
                        int i37 = c4037y2.f13333a[m16378g0 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = 1048575;
                        int i40 = i37 & 1048575;
                        if (i40 != i31) {
                            if (i31 != 1048575) {
                                unsafe2.putInt(obj3, i31, i29);
                                i39 = 1048575;
                            }
                            i19 = i40;
                            i21 = i40 == i39 ? 0 : unsafe2.getInt(obj3, i40);
                        } else {
                            i21 = i29;
                            i19 = i31;
                        }
                        switch (m16349s0) {
                            case 0:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 1) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    AbstractC4090z0.m17098R(obj3, m16338V, AbstractC4049f.m16465e(bArr2, i32));
                                    i26 = i32 + 8;
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 1:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 5) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    AbstractC4090z0.m17099S(obj3, m16338V, AbstractC4049f.m16472l(bArr2, i32));
                                    i26 = i32 + 4;
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 0) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    m16456L = AbstractC4049f.m16456L(bArr3, i32, aVar2);
                                    unsafe2.putLong(obj, m16338V, aVar2.f13371b);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr3;
                                    i26 = m16456L;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 0) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    i26 = AbstractC4049f.m16453I(bArr2, i32, aVar2);
                                    unsafe2.putInt(obj3, m16338V, aVar2.f13370a);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 1) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, m16338V, AbstractC4049f.m16470j(bArr2, i32));
                                    i26 = i32 + 8;
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 5) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, m16338V, AbstractC4049f.m16468h(bArr2, i32));
                                    i26 = i32 + 4;
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 7:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 0) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    i26 = AbstractC4049f.m16456L(bArr2, i32, aVar2);
                                    AbstractC4090z0.m17092L(obj3, m16338V, aVar2.f13371b != 0);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 8:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 2) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    i26 = m16352y(i35) ? AbstractC4049f.m16450F(bArr2, i32, aVar2) : AbstractC4049f.m16447C(bArr2, i32, aVar2);
                                    unsafe2.putObject(obj3, m16338V, aVar2.f13372c);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 9:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 2) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    Object m16363P = c4037y2.m16363P(obj3, i22);
                                    i26 = AbstractC4049f.m16459O(m16363P, c4037y2.m16399u(i22), bArr, i32, i8, aVar);
                                    c4037y2.m16394q0(obj3, i22, m16363P);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 10:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 2) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    i26 = AbstractC4049f.m16463c(bArr2, i32, aVar2);
                                    unsafe2.putObject(obj3, m16338V, aVar2.f13372c);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 0) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    i26 = AbstractC4049f.m16453I(bArr2, i32, aVar2);
                                    int i41 = aVar2.f13370a;
                                    c4037y2.m16396s(i22);
                                    m16331C(i35);
                                    unsafe2.putInt(obj3, m16338V, i41);
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 15:
                                bArr2 = bArr;
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                if (i34 != 0) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    i26 = AbstractC4049f.m16453I(bArr2, i32, aVar2);
                                    unsafe2.putInt(obj3, m16338V, AbstractC4057j.m16523c(aVar2.f13370a));
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr2;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 16:
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                bArr3 = bArr;
                                if (i34 != 0) {
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    m16456L = AbstractC4049f.m16456L(bArr3, i32, aVar2);
                                    unsafe2.putLong(obj, m16338V, AbstractC4057j.m16524d(aVar2.f13371b));
                                    i29 = i21 | i38;
                                    i25 = i9;
                                    i27 = i22;
                                    bArr4 = bArr3;
                                    i26 = m16456L;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            case 17:
                                if (i34 != 3) {
                                    i16 = i33;
                                    c7 = 65535;
                                    i22 = m16378g0;
                                    i10 = i9;
                                    i17 = i32;
                                    unsafe = unsafe2;
                                    i18 = i21;
                                    i12 = i36;
                                    i20 = i22;
                                    break;
                                } else {
                                    Object m16363P2 = c4037y2.m16363P(obj3, m16378g0);
                                    i16 = i33;
                                    i26 = AbstractC4049f.m16458N(m16363P2, c4037y2.m16399u(m16378g0), bArr, i32, i8, (i33 << 3) | 4, aVar);
                                    c4037y2.m16394q0(obj3, m16378g0, m16363P2);
                                    i29 = i21 | i38;
                                    bArr4 = bArr;
                                    i25 = i9;
                                    i27 = m16378g0;
                                    i28 = i36;
                                    i31 = i19;
                                    i30 = i16;
                                }
                            default:
                                i16 = i33;
                                i22 = m16378g0;
                                c7 = 65535;
                                i10 = i9;
                                i17 = i32;
                                unsafe = unsafe2;
                                i18 = i21;
                                i12 = i36;
                                i20 = i22;
                                break;
                        }
                    } else {
                        i16 = i33;
                        int i42 = i31;
                        i18 = i29;
                        if (m16349s0 != 27) {
                            i19 = i42;
                            if (m16349s0 <= 49) {
                                int i43 = i32;
                                unsafe = unsafe2;
                                i20 = m16378g0;
                                i26 = m16374e0(obj, bArr, i32, i8, i36, i16, i34, m16378g0, i35, m16349s0, m16338V, aVar);
                                if (i26 != i43) {
                                    c4037y2 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i24 = i8;
                                    i25 = i9;
                                    aVar2 = aVar;
                                    i27 = i20;
                                    i28 = i36;
                                    i29 = i18;
                                    i31 = i19;
                                    i30 = i16;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = i9;
                                    i17 = i26;
                                }
                            } else {
                                i23 = i32;
                                unsafe = unsafe2;
                                i20 = m16378g0;
                                if (m16349s0 != 50) {
                                    i26 = m16372d0(obj, bArr, i23, i8, i36, i16, i34, i35, m16349s0, m16338V, i20, aVar);
                                    if (i26 != i23) {
                                        c4037y2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i24 = i8;
                                        i25 = i9;
                                        aVar2 = aVar;
                                        i27 = i20;
                                        i28 = i36;
                                        i29 = i18;
                                        i31 = i19;
                                        i30 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i17 = i26;
                                    }
                                } else if (i34 == 2) {
                                    i26 = m16368b0(obj, bArr, i23, i8, i20, m16338V, aVar);
                                    if (i26 != i23) {
                                        c4037y2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i24 = i8;
                                        i25 = i9;
                                        aVar2 = aVar;
                                        i27 = i20;
                                        i28 = i36;
                                        i29 = i18;
                                        i31 = i19;
                                        i30 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i17 = i26;
                                    }
                                } else {
                                    i10 = i9;
                                    i17 = i23;
                                }
                            }
                        } else if (i34 == 2) {
                            AbstractC4015C.e eVar = (AbstractC4015C.e) unsafe2.getObject(obj3, m16338V);
                            if (!eVar.mo16195j()) {
                                int size = eVar.size();
                                eVar = eVar.mo16168d(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, m16338V, eVar);
                            }
                            i26 = AbstractC4049f.m16477q(c4037y2.m16399u(m16378g0), i36, bArr, i32, i8, eVar, aVar);
                            i25 = i9;
                            i27 = m16378g0;
                            i28 = i36;
                            i29 = i18;
                            i31 = i42;
                            i30 = i16;
                            bArr4 = bArr;
                        } else {
                            i19 = i42;
                            i23 = i32;
                            unsafe = unsafe2;
                            i20 = m16378g0;
                            i10 = i9;
                            i17 = i23;
                        }
                        i12 = i36;
                    }
                }
                if (i12 != i10 || i10 == 0) {
                    i26 = (!this.f13338f || aVar.f13373d == C4071q.m16878b()) ? AbstractC4049f.m16451G(i12, bArr, i17, i8, m16350v(obj), aVar) : AbstractC4049f.m16467g(i12, bArr, i17, i8, obj, this.f13337e, this.f13347o, aVar);
                    obj3 = obj;
                    bArr4 = bArr;
                    i24 = i8;
                    i28 = i12;
                    c4037y2 = this;
                    aVar2 = aVar;
                    i27 = i20;
                    i29 = i18;
                    i31 = i19;
                    i30 = i16;
                    unsafe2 = unsafe;
                    i25 = i10;
                } else {
                    i14 = 1048575;
                    c4037y = this;
                    i11 = i17;
                    i29 = i18;
                    i13 = i19;
                }
            } else {
                int i44 = i31;
                unsafe = unsafe2;
                i10 = i25;
                c4037y = c4037y2;
                i11 = i26;
                i12 = i28;
                i13 = i44;
                i14 = 1048575;
            }
        }
        if (i13 != i14) {
            obj2 = obj;
            unsafe.putInt(obj2, i13, i29);
        } else {
            obj2 = obj;
        }
        C4084w0 c4084w0 = null;
        for (int i45 = c4037y.f13343k; i45 < c4037y.f13344l; i45++) {
            c4084w0 = (C4084w0) m16393q(obj, c4037y.f13342j[i45], c4084w0, c4037y.f13347o, obj);
        }
        if (c4084w0 != null) {
            c4037y.f13347o.mo16979o(obj2, c4084w0);
        }
        if (i10 == 0) {
            if (i11 != i8) {
                throw C4017D.m16243h();
            }
        } else if (i11 > i8 || i12 != i10) {
            throw C4017D.m16243h();
        }
        return i11;
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: d */
    public boolean mo16371d(Object obj, Object obj2) {
        int length = this.f13333a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!m16391p(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f13347o.mo16971g(obj).equals(this.f13347o.mo16971g(obj2))) {
            return false;
        }
        if (this.f13338f) {
            return this.f13348p.mo16911c(obj).equals(this.f13348p.mo16911c(obj2));
        }
        return true;
    }

    /* renamed from: d0 */
    public final int m16372d0(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, AbstractC4049f.a aVar) {
        Unsafe unsafe = f13332s;
        long j8 = this.f13333a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j7, Double.valueOf(AbstractC4049f.m16465e(bArr, i7)));
                    int i15 = i7 + 8;
                    unsafe.putInt(obj, j8, i10);
                    return i15;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j7, Float.valueOf(AbstractC4049f.m16472l(bArr, i7)));
                    int i16 = i7 + 4;
                    unsafe.putInt(obj, j8, i10);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int m16456L = AbstractC4049f.m16456L(bArr, i7, aVar);
                    unsafe.putObject(obj, j7, Long.valueOf(aVar.f13371b));
                    unsafe.putInt(obj, j8, i10);
                    return m16456L;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int m16453I = AbstractC4049f.m16453I(bArr, i7, aVar);
                    unsafe.putObject(obj, j7, Integer.valueOf(aVar.f13370a));
                    unsafe.putInt(obj, j8, i10);
                    return m16453I;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j7, Long.valueOf(AbstractC4049f.m16470j(bArr, i7)));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j8, i10);
                    return i17;
                }
                break;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(obj, j7, Integer.valueOf(AbstractC4049f.m16468h(bArr, i7)));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j8, i10);
                    return i18;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int m16456L2 = AbstractC4049f.m16456L(bArr, i7, aVar);
                    unsafe.putObject(obj, j7, Boolean.valueOf(aVar.f13371b != 0));
                    unsafe.putInt(obj, j8, i10);
                    return m16456L2;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int m16453I2 = AbstractC4049f.m16453I(bArr, i7, aVar);
                    int i19 = aVar.f13370a;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j7, StringUtils.EMPTY);
                    } else {
                        if ((i12 & 536870912) != 0 && !AbstractC4012A0.m16122t(bArr, m16453I2, m16453I2 + i19)) {
                            throw C4017D.m16239d();
                        }
                        unsafe.putObject(obj, j7, new String(bArr, m16453I2, i19, AbstractC4015C.f13275b));
                        m16453I2 += i19;
                    }
                    unsafe.putInt(obj, j8, i10);
                    return m16453I2;
                }
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                if (i11 == 2) {
                    Object m16364Q = m16364Q(obj, i10, i14);
                    int m16459O = AbstractC4049f.m16459O(m16364Q, m16399u(i14), bArr, i7, i8, aVar);
                    m16395r0(obj, i10, i14, m16364Q);
                    return m16459O;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int m16463c = AbstractC4049f.m16463c(bArr, i7, aVar);
                    unsafe.putObject(obj, j7, aVar.f13372c);
                    unsafe.putInt(obj, j8, i10);
                    return m16463c;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int m16453I3 = AbstractC4049f.m16453I(bArr, i7, aVar);
                    int i20 = aVar.f13370a;
                    m16396s(i14);
                    unsafe.putObject(obj, j7, Integer.valueOf(i20));
                    unsafe.putInt(obj, j8, i10);
                    return m16453I3;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int m16453I4 = AbstractC4049f.m16453I(bArr, i7, aVar);
                    unsafe.putObject(obj, j7, Integer.valueOf(AbstractC4057j.m16523c(aVar.f13370a)));
                    unsafe.putInt(obj, j8, i10);
                    return m16453I4;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int m16456L3 = AbstractC4049f.m16456L(bArr, i7, aVar);
                    unsafe.putObject(obj, j7, Long.valueOf(AbstractC4057j.m16524d(aVar.f13371b)));
                    unsafe.putInt(obj, j8, i10);
                    return m16456L3;
                }
                break;
            case 68:
                if (i11 == 3) {
                    Object m16364Q2 = m16364Q(obj, i10, i14);
                    int m16458N = AbstractC4049f.m16458N(m16364Q2, m16399u(i14), bArr, i7, i8, (i9 & (-8)) | 4, aVar);
                    m16395r0(obj, i10, i14, m16364Q2);
                    return m16458N;
                }
                break;
        }
        return i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: e */
    public int mo16373e(Object obj) {
        int i7;
        int i8;
        int i9;
        int m16714j;
        int m16709e;
        int m16688G;
        boolean z6;
        int m16857f;
        int m16860i;
        int m16698Q;
        int m16700S;
        Unsafe unsafe = f13332s;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f13333a.length) {
            int m16398t0 = m16398t0(i13);
            int m16349s0 = m16349s0(m16398t0);
            int m16365U = m16365U(i13);
            int i15 = this.f13333a[i13 + 2];
            int i16 = i15 & i10;
            if (m16349s0 <= 17) {
                if (i16 != i11) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i7 = i11;
                i8 = i12;
                i9 = 1 << (i15 >>> 20);
            } else {
                i7 = i11;
                i8 = i12;
                i9 = 0;
            }
            long m16338V = m16338V(m16398t0);
            if (m16349s0 < EnumC4081v.f13542V.m16964b() || m16349s0 > EnumC4081v.f13556i0.m16964b()) {
                i16 = 0;
            }
            switch (m16349s0) {
                case 0:
                    if (!m16353A(obj, i13, i7, i8, i9)) {
                        break;
                    } else {
                        m16714j = AbstractC4061l.m16714j(m16365U, 0.0d);
                        i14 += m16714j;
                        break;
                    }
                case 1:
                    if (!m16353A(obj, i13, i7, i8, i9)) {
                        break;
                    } else {
                        m16714j = AbstractC4061l.m16722r(m16365U, 0.0f);
                        i14 += m16714j;
                        break;
                    }
                case 2:
                    if (!m16353A(obj, i13, i7, i8, i9)) {
                        break;
                    } else {
                        m16714j = AbstractC4061l.m16729y(m16365U, unsafe.getLong(obj, m16338V));
                        i14 += m16714j;
                        break;
                    }
                case 3:
                    if (!m16353A(obj, i13, i7, i8, i9)) {
                        break;
                    } else {
                        m16714j = AbstractC4061l.m16701T(m16365U, unsafe.getLong(obj, m16338V));
                        i14 += m16714j;
                        break;
                    }
                case 4:
                    if (!m16353A(obj, i13, i7, i8, i9)) {
                        break;
                    } else {
                        m16714j = AbstractC4061l.m16727w(m16365U, unsafe.getInt(obj, m16338V));
                        i14 += m16714j;
                        break;
                    }
                case 5:
                    if (!m16353A(obj, i13, i7, i8, i9)) {
                        break;
                    } else {
                        m16714j = AbstractC4061l.m16720p(m16365U, 0L);
                        i14 += m16714j;
                        break;
                    }
                case 6:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16714j = AbstractC4061l.m16718n(m16365U, 0);
                        i14 += m16714j;
                        break;
                    }
                    break;
                case 7:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16709e(m16365U, true);
                        i14 += m16709e;
                    }
                    break;
                case 8:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        Object object = unsafe.getObject(obj, m16338V);
                        m16709e = object instanceof AbstractC4055i ? AbstractC4061l.m16712h(m16365U, (AbstractC4055i) object) : AbstractC4061l.m16696O(m16365U, (String) object);
                        i14 += m16709e;
                    }
                    break;
                case 9:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4070p0.m16866o(m16365U, unsafe.getObject(obj, m16338V), m16399u(i13));
                        i14 += m16709e;
                    }
                    break;
                case 10:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16712h(m16365U, (AbstractC4055i) unsafe.getObject(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 11:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16699R(m16365U, unsafe.getInt(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16716l(m16365U, unsafe.getInt(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 13:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16688G = AbstractC4061l.m16688G(m16365U, 0);
                        i14 += m16688G;
                    }
                    break;
                case 14:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16690I(m16365U, 0L);
                        i14 += m16709e;
                    }
                    break;
                case 15:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16692K(m16365U, unsafe.getInt(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 16:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16694M(m16365U, unsafe.getLong(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 17:
                    if (m16353A(obj, i13, i7, i8, i9)) {
                        m16709e = AbstractC4061l.m16724t(m16365U, (InterfaceC4034V) unsafe.getObject(obj, m16338V), m16399u(i13));
                        i14 += m16709e;
                    }
                    break;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    m16709e = AbstractC4070p0.m16859h(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16709e;
                    break;
                case 19:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16857f(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16864m(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 21:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16875x(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 22:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16862k(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 23:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16859h(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 24:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16857f(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 25:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16849a(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 26:
                    m16709e = AbstractC4070p0.m16872u(m16365U, (List) unsafe.getObject(obj, m16338V));
                    i14 += m16709e;
                    break;
                case 27:
                    m16709e = AbstractC4070p0.m16867p(m16365U, (List) unsafe.getObject(obj, m16338V), m16399u(i13));
                    i14 += m16709e;
                    break;
                case 28:
                    m16709e = AbstractC4070p0.m16853c(m16365U, (List) unsafe.getObject(obj, m16338V));
                    i14 += m16709e;
                    break;
                case 29:
                    m16709e = AbstractC4070p0.m16873v(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16709e;
                    break;
                case 30:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16855d(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 31:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16857f(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 32:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16859h(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 33:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16868q(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 34:
                    z6 = false;
                    m16857f = AbstractC4070p0.m16870s(m16365U, (List) unsafe.getObject(obj, m16338V), false);
                    i14 += m16857f;
                    break;
                case 35:
                    m16860i = AbstractC4070p0.m16860i((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 36:
                    m16860i = AbstractC4070p0.m16858g((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 37:
                    m16860i = AbstractC4070p0.m16865n((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 38:
                    m16860i = AbstractC4070p0.m16876y((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 39:
                    m16860i = AbstractC4070p0.m16863l((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 40:
                    m16860i = AbstractC4070p0.m16860i((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 41:
                    m16860i = AbstractC4070p0.m16858g((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 42:
                    m16860i = AbstractC4070p0.m16851b((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 43:
                    m16860i = AbstractC4070p0.m16874w((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 44:
                    m16860i = AbstractC4070p0.m16856e((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 45:
                    m16860i = AbstractC4070p0.m16858g((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 46:
                    m16860i = AbstractC4070p0.m16860i((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 47:
                    m16860i = AbstractC4070p0.m16869r((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 48:
                    m16860i = AbstractC4070p0.m16871t((List) unsafe.getObject(obj, m16338V));
                    if (m16860i > 0) {
                        if (this.f13341i) {
                            unsafe.putInt(obj, i16, m16860i);
                        }
                        m16698Q = AbstractC4061l.m16698Q(m16365U);
                        m16700S = AbstractC4061l.m16700S(m16860i);
                        m16688G = m16698Q + m16700S + m16860i;
                        i14 += m16688G;
                    }
                    break;
                case 49:
                    m16709e = AbstractC4070p0.m16861j(m16365U, (List) unsafe.getObject(obj, m16338V), m16399u(i13));
                    i14 += m16709e;
                    break;
                case 50:
                    m16709e = this.f13349q.mo16304f(m16365U, unsafe.getObject(obj, m16338V), m16397t(i13));
                    i14 += m16709e;
                    break;
                case 51:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16714j(m16365U, 0.0d);
                        i14 += m16709e;
                    }
                    break;
                case 52:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16722r(m16365U, 0.0f);
                        i14 += m16709e;
                    }
                    break;
                case 53:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16729y(m16365U, m16343a0(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 54:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16701T(m16365U, m16343a0(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 55:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16727w(m16365U, m16342Z(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 56:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16720p(m16365U, 0L);
                        i14 += m16709e;
                    }
                    break;
                case 57:
                    if (m16357H(obj, m16365U, i13)) {
                        m16688G = AbstractC4061l.m16718n(m16365U, 0);
                        i14 += m16688G;
                    }
                    break;
                case 58:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16709e(m16365U, true);
                        i14 += m16709e;
                    }
                    break;
                case 59:
                    if (m16357H(obj, m16365U, i13)) {
                        Object object2 = unsafe.getObject(obj, m16338V);
                        m16709e = object2 instanceof AbstractC4055i ? AbstractC4061l.m16712h(m16365U, (AbstractC4055i) object2) : AbstractC4061l.m16696O(m16365U, (String) object2);
                        i14 += m16709e;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4070p0.m16866o(m16365U, unsafe.getObject(obj, m16338V), m16399u(i13));
                        i14 += m16709e;
                    }
                    break;
                case 61:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16712h(m16365U, (AbstractC4055i) unsafe.getObject(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 62:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16699R(m16365U, m16342Z(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 63:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16716l(m16365U, m16342Z(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 64:
                    if (m16357H(obj, m16365U, i13)) {
                        m16688G = AbstractC4061l.m16688G(m16365U, 0);
                        i14 += m16688G;
                    }
                    break;
                case 65:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16690I(m16365U, 0L);
                        i14 += m16709e;
                    }
                    break;
                case 66:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16692K(m16365U, m16342Z(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 67:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16694M(m16365U, m16343a0(obj, m16338V));
                        i14 += m16709e;
                    }
                    break;
                case 68:
                    if (m16357H(obj, m16365U, i13)) {
                        m16709e = AbstractC4061l.m16724t(m16365U, (InterfaceC4034V) unsafe.getObject(obj, m16338V), m16399u(i13));
                        i14 += m16709e;
                    }
                    break;
            }
            i13 += 3;
            i11 = i7;
            i12 = i8;
            i10 = 1048575;
        }
        int m16402w = i14 + m16402w(this.f13347o, obj);
        return this.f13338f ? m16402w + this.f13348p.mo16911c(obj).m16950h() : m16402w;
    }

    /* renamed from: e0 */
    public final int m16374e0(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j7, int i13, long j8, AbstractC4049f.a aVar) {
        int m16454J;
        Unsafe unsafe = f13332s;
        AbstractC4015C.e eVar = (AbstractC4015C.e) unsafe.getObject(obj, j8);
        if (!eVar.mo16195j()) {
            int size = eVar.size();
            eVar = eVar.mo16168d(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j8, eVar);
        }
        switch (i13) {
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i11 == 2) {
                    return AbstractC4049f.m16479s(bArr, i7, eVar, aVar);
                }
                if (i11 == 1) {
                    return AbstractC4049f.m16466f(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i11 == 2) {
                    return AbstractC4049f.m16482v(bArr, i7, eVar, aVar);
                }
                if (i11 == 5) {
                    return AbstractC4049f.m16473m(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return AbstractC4049f.m16486z(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC4049f.m16457M(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return AbstractC4049f.m16485y(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC4049f.m16454J(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return AbstractC4049f.m16481u(bArr, i7, eVar, aVar);
                }
                if (i11 == 1) {
                    return AbstractC4049f.m16471k(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return AbstractC4049f.m16480t(bArr, i7, eVar, aVar);
                }
                if (i11 == 5) {
                    return AbstractC4049f.m16469i(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i11 == 2) {
                    return AbstractC4049f.m16478r(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC4049f.m16462b(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 26:
                if (i11 == 2) {
                    return (j7 & 536870912) == 0 ? AbstractC4049f.m16448D(i9, bArr, i7, i8, eVar, aVar) : AbstractC4049f.m16449E(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 27:
                if (i11 == 2) {
                    return AbstractC4049f.m16477q(m16399u(i12), i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 28:
                if (i11 == 2) {
                    return AbstractC4049f.m16464d(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i11 == 2) {
                    m16454J = AbstractC4049f.m16485y(bArr, i7, eVar, aVar);
                } else if (i11 == 0) {
                    m16454J = AbstractC4049f.m16454J(i9, bArr, i7, i8, eVar, aVar);
                }
                m16396s(i12);
                AbstractC4070p0.m16877z(obj, i10, eVar, null, null, this.f13347o);
                return m16454J;
            case 33:
            case 47:
                if (i11 == 2) {
                    return AbstractC4049f.m16483w(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC4049f.m16445A(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i11 == 2) {
                    return AbstractC4049f.m16484x(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC4049f.m16446B(i9, bArr, i7, i8, eVar, aVar);
                }
                break;
            case 49:
                if (i11 == 3) {
                    return AbstractC4049f.m16475o(m16399u(i12), i9, bArr, i7, i8, eVar, aVar);
                }
                break;
        }
        return i7;
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: f */
    public int mo16375f(Object obj) {
        int i7;
        int m16188f;
        int length = this.f13333a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int m16398t0 = m16398t0(i9);
            int m16365U = m16365U(i9);
            long m16338V = m16338V(m16398t0);
            int i10 = 37;
            switch (m16349s0(m16398t0)) {
                case 0:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16188f(Double.doubleToLongBits(AbstractC4090z0.m17081A(obj, m16338V)));
                    i8 = i7 + m16188f;
                    break;
                case 1:
                    i7 = i8 * 53;
                    m16188f = Float.floatToIntBits(AbstractC4090z0.m17082B(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 2:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16188f(AbstractC4090z0.m17085E(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 3:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16188f(AbstractC4090z0.m17085E(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 4:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17083C(obj, m16338V);
                    i8 = i7 + m16188f;
                    break;
                case 5:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16188f(AbstractC4090z0.m17085E(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 6:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17083C(obj, m16338V);
                    i8 = i7 + m16188f;
                    break;
                case 7:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16185c(AbstractC4090z0.m17124t(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 8:
                    i7 = i8 * 53;
                    m16188f = ((String) AbstractC4090z0.m17087G(obj, m16338V)).hashCode();
                    i8 = i7 + m16188f;
                    break;
                case 9:
                    Object m17087G = AbstractC4090z0.m17087G(obj, m16338V);
                    if (m17087G != null) {
                        i10 = m17087G.hashCode();
                    }
                    i8 = (i8 * 53) + i10;
                    break;
                case 10:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17087G(obj, m16338V).hashCode();
                    i8 = i7 + m16188f;
                    break;
                case 11:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17083C(obj, m16338V);
                    i8 = i7 + m16188f;
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17083C(obj, m16338V);
                    i8 = i7 + m16188f;
                    break;
                case 13:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17083C(obj, m16338V);
                    i8 = i7 + m16188f;
                    break;
                case 14:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16188f(AbstractC4090z0.m17085E(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 15:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17083C(obj, m16338V);
                    i8 = i7 + m16188f;
                    break;
                case 16:
                    i7 = i8 * 53;
                    m16188f = AbstractC4015C.m16188f(AbstractC4090z0.m17085E(obj, m16338V));
                    i8 = i7 + m16188f;
                    break;
                case 17:
                    Object m17087G2 = AbstractC4090z0.m17087G(obj, m16338V);
                    if (m17087G2 != null) {
                        i10 = m17087G2.hashCode();
                    }
                    i8 = (i8 * 53) + i10;
                    break;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17087G(obj, m16338V).hashCode();
                    i8 = i7 + m16188f;
                    break;
                case 50:
                    i7 = i8 * 53;
                    m16188f = AbstractC4090z0.m17087G(obj, m16338V).hashCode();
                    i8 = i7 + m16188f;
                    break;
                case 51:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16188f(Double.doubleToLongBits(m16340X(obj, m16338V)));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = Float.floatToIntBits(m16341Y(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16188f(m16343a0(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16188f(m16343a0(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = m16342Z(obj, m16338V);
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16188f(m16343a0(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = m16342Z(obj, m16338V);
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16185c(m16339W(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = ((String) AbstractC4090z0.m17087G(obj, m16338V)).hashCode();
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4090z0.m17087G(obj, m16338V).hashCode();
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4090z0.m17087G(obj, m16338V).hashCode();
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = m16342Z(obj, m16338V);
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = m16342Z(obj, m16338V);
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = m16342Z(obj, m16338V);
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16188f(m16343a0(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = m16342Z(obj, m16338V);
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4015C.m16188f(m16343a0(obj, m16338V));
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m16357H(obj, m16365U, i9)) {
                        i7 = i8 * 53;
                        m16188f = AbstractC4090z0.m17087G(obj, m16338V).hashCode();
                        i8 = i7 + m16188f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i8 * 53) + this.f13347o.mo16971g(obj).hashCode();
        return this.f13338f ? (hashCode * 53) + this.f13348p.mo16911c(obj).hashCode() : hashCode;
    }

    /* renamed from: f0 */
    public final int m16376f0(int i7) {
        if (i7 < this.f13335c || i7 > this.f13336d) {
            return -1;
        }
        return m16392p0(i7, 0);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: g */
    public void mo16377g(Object obj, InterfaceC4016C0 interfaceC4016C0) {
        if (interfaceC4016C0.mo16219i() == InterfaceC4016C0.a.DESCENDING) {
            m16401v0(obj, interfaceC4016C0);
        } else {
            m16400u0(obj, interfaceC4016C0);
        }
    }

    /* renamed from: g0 */
    public final int m16378g0(int i7, int i8) {
        if (i7 < this.f13335c || i7 > this.f13336d) {
            return -1;
        }
        return m16392p0(i7, i8);
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: h */
    public void mo16379h(Object obj, InterfaceC4062l0 interfaceC4062l0, C4071q c4071q) {
        c4071q.getClass();
        m16345l(obj);
        m16358K(this.f13347o, this.f13348p, obj, interfaceC4062l0, c4071q);
    }

    /* renamed from: h0 */
    public final int m16380h0(int i7) {
        return this.f13333a[i7 + 2];
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    /* renamed from: i */
    public void mo16381i(Object obj, byte[] bArr, int i7, int i8, AbstractC4049f.a aVar) {
        m16370c0(obj, bArr, i7, i8, 0, aVar);
    }

    /* renamed from: i0 */
    public final void m16382i0(Object obj, long j7, InterfaceC4062l0 interfaceC4062l0, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        interfaceC4062l0.mo16638J(this.f13346n.mo16270e(obj, j7), interfaceC4066n0, c4071q);
    }

    /* renamed from: j */
    public final boolean m16383j(Object obj, Object obj2, int i7) {
        return m16406z(obj, i7) == m16406z(obj2, i7);
    }

    /* renamed from: j0 */
    public final void m16384j0(Object obj, int i7, InterfaceC4062l0 interfaceC4062l0, InterfaceC4066n0 interfaceC4066n0, C4071q c4071q) {
        interfaceC4062l0.mo16640L(this.f13346n.mo16270e(obj, m16338V(i7)), interfaceC4066n0, c4071q);
    }

    /* renamed from: k0 */
    public final void m16385k0(Object obj, int i7, InterfaceC4062l0 interfaceC4062l0) {
        if (m16352y(i7)) {
            AbstractC4090z0.m17102V(obj, m16338V(i7), interfaceC4062l0.mo16636H());
        } else if (this.f13339g) {
            AbstractC4090z0.m17102V(obj, m16338V(i7), interfaceC4062l0.mo16675v());
        } else {
            AbstractC4090z0.m17102V(obj, m16338V(i7), interfaceC4062l0.mo16679z());
        }
    }

    /* renamed from: l0 */
    public final void m16386l0(Object obj, int i7, InterfaceC4062l0 interfaceC4062l0) {
        if (m16352y(i7)) {
            interfaceC4062l0.mo16678y(this.f13346n.mo16270e(obj, m16338V(i7)));
        } else {
            interfaceC4062l0.mo16677x(this.f13346n.mo16270e(obj, m16338V(i7)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* renamed from: m */
    public final int m16387m(byte[] bArr, int i7, int i8, C4027N.a aVar, Map map, AbstractC4049f.a aVar2) {
        int i9;
        int m16453I = AbstractC4049f.m16453I(bArr, i7, aVar2);
        int i10 = aVar2.f13370a;
        if (i10 < 0 || i10 > i8 - m16453I) {
            throw C4017D.m16246m();
        }
        int i11 = m16453I + i10;
        Object obj = aVar.f13323b;
        Object obj2 = aVar.f13325d;
        while (m16453I < i11) {
            int i12 = m16453I + 1;
            byte b7 = bArr[m16453I];
            if (b7 < 0) {
                i9 = AbstractC4049f.m16452H(b7, bArr, i12, aVar2);
                b7 = aVar2.f13370a;
            } else {
                i9 = i12;
            }
            int i13 = b7 >>> 3;
            int i14 = b7 & 7;
            if (i13 != 1) {
                if (i13 == 2 && i14 == aVar.f13324c.m16182f()) {
                    m16453I = m16388n(bArr, i9, i8, aVar.f13324c, aVar.f13325d.getClass(), aVar2);
                    obj2 = aVar2.f13372c;
                }
                m16453I = AbstractC4049f.m16460P(b7, bArr, i9, i8, aVar2);
            } else if (i14 == aVar.f13322a.m16182f()) {
                m16453I = m16388n(bArr, i9, i8, aVar.f13322a, null, aVar2);
                obj = aVar2.f13372c;
            } else {
                m16453I = AbstractC4049f.m16460P(b7, bArr, i9, i8, aVar2);
            }
        }
        if (m16453I != i11) {
            throw C4017D.m16243h();
        }
        map.put(obj, obj2);
        return i11;
    }

    /* renamed from: n */
    public final int m16388n(byte[] bArr, int i7, int i8, AbstractC4014B0.b bVar, Class cls, AbstractC4049f.a aVar) {
        switch (a.f13350a[bVar.ordinal()]) {
            case 1:
                int m16456L = AbstractC4049f.m16456L(bArr, i7, aVar);
                aVar.f13372c = Boolean.valueOf(aVar.f13371b != 0);
                return m16456L;
            case 2:
                return AbstractC4049f.m16463c(bArr, i7, aVar);
            case 3:
                aVar.f13372c = Double.valueOf(AbstractC4049f.m16465e(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                aVar.f13372c = Integer.valueOf(AbstractC4049f.m16468h(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                aVar.f13372c = Long.valueOf(AbstractC4049f.m16470j(bArr, i7));
                return i7 + 8;
            case 8:
                aVar.f13372c = Float.valueOf(AbstractC4049f.m16472l(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case 11:
                int m16453I = AbstractC4049f.m16453I(bArr, i7, aVar);
                aVar.f13372c = Integer.valueOf(aVar.f13370a);
                return m16453I;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                int m16456L2 = AbstractC4049f.m16456L(bArr, i7, aVar);
                aVar.f13372c = Long.valueOf(aVar.f13371b);
                return m16456L2;
            case 14:
                return AbstractC4049f.m16476p(C4056i0.m16519a().m16521c(cls), bArr, i7, i8, aVar);
            case 15:
                int m16453I2 = AbstractC4049f.m16453I(bArr, i7, aVar);
                aVar.f13372c = Integer.valueOf(AbstractC4057j.m16523c(aVar.f13370a));
                return m16453I2;
            case 16:
                int m16456L3 = AbstractC4049f.m16456L(bArr, i7, aVar);
                aVar.f13372c = Long.valueOf(AbstractC4057j.m16524d(aVar.f13371b));
                return m16456L3;
            case 17:
                return AbstractC4049f.m16450F(bArr, i7, aVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: n0 */
    public final void m16389n0(Object obj, int i7) {
        int m16380h0 = m16380h0(i7);
        long j7 = 1048575 & m16380h0;
        if (j7 == 1048575) {
            return;
        }
        AbstractC4090z0.m17100T(obj, j7, (1 << (m16380h0 >>> 20)) | AbstractC4090z0.m17083C(obj, j7));
    }

    @Override // com.google.protobuf.InterfaceC4066n0
    public Object newInstance() {
        return this.f13345m.mo16419a(this.f13337e);
    }

    /* renamed from: o0 */
    public final void m16390o0(Object obj, int i7, int i8) {
        AbstractC4090z0.m17100T(obj, m16380h0(i8) & 1048575, i7);
    }

    /* renamed from: p */
    public final boolean m16391p(Object obj, Object obj2, int i7) {
        int m16398t0 = m16398t0(i7);
        long m16338V = m16338V(m16398t0);
        switch (m16349s0(m16398t0)) {
            case 0:
                if (m16383j(obj, obj2, i7) && Double.doubleToLongBits(AbstractC4090z0.m17081A(obj, m16338V)) == Double.doubleToLongBits(AbstractC4090z0.m17081A(obj2, m16338V))) {
                    break;
                }
                break;
            case 1:
                if (m16383j(obj, obj2, i7) && Float.floatToIntBits(AbstractC4090z0.m17082B(obj, m16338V)) == Float.floatToIntBits(AbstractC4090z0.m17082B(obj2, m16338V))) {
                    break;
                }
                break;
            case 2:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17085E(obj, m16338V) == AbstractC4090z0.m17085E(obj2, m16338V)) {
                    break;
                }
                break;
            case 3:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17085E(obj, m16338V) == AbstractC4090z0.m17085E(obj2, m16338V)) {
                    break;
                }
                break;
            case 4:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17083C(obj, m16338V) == AbstractC4090z0.m17083C(obj2, m16338V)) {
                    break;
                }
                break;
            case 5:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17085E(obj, m16338V) == AbstractC4090z0.m17085E(obj2, m16338V)) {
                    break;
                }
                break;
            case 6:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17083C(obj, m16338V) == AbstractC4090z0.m17083C(obj2, m16338V)) {
                    break;
                }
                break;
            case 7:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17124t(obj, m16338V) == AbstractC4090z0.m17124t(obj2, m16338V)) {
                    break;
                }
                break;
            case 8:
                if (m16383j(obj, obj2, i7) && AbstractC4070p0.m16830H(AbstractC4090z0.m17087G(obj, m16338V), AbstractC4090z0.m17087G(obj2, m16338V))) {
                    break;
                }
                break;
            case 9:
                if (m16383j(obj, obj2, i7) && AbstractC4070p0.m16830H(AbstractC4090z0.m17087G(obj, m16338V), AbstractC4090z0.m17087G(obj2, m16338V))) {
                    break;
                }
                break;
            case 10:
                if (m16383j(obj, obj2, i7) && AbstractC4070p0.m16830H(AbstractC4090z0.m17087G(obj, m16338V), AbstractC4090z0.m17087G(obj2, m16338V))) {
                    break;
                }
                break;
            case 11:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17083C(obj, m16338V) == AbstractC4090z0.m17083C(obj2, m16338V)) {
                    break;
                }
                break;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17083C(obj, m16338V) == AbstractC4090z0.m17083C(obj2, m16338V)) {
                    break;
                }
                break;
            case 13:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17083C(obj, m16338V) == AbstractC4090z0.m17083C(obj2, m16338V)) {
                    break;
                }
                break;
            case 14:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17085E(obj, m16338V) == AbstractC4090z0.m17085E(obj2, m16338V)) {
                    break;
                }
                break;
            case 15:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17083C(obj, m16338V) == AbstractC4090z0.m17083C(obj2, m16338V)) {
                    break;
                }
                break;
            case 16:
                if (m16383j(obj, obj2, i7) && AbstractC4090z0.m17085E(obj, m16338V) == AbstractC4090z0.m17085E(obj2, m16338V)) {
                    break;
                }
                break;
            case 17:
                if (m16383j(obj, obj2, i7) && AbstractC4070p0.m16830H(AbstractC4090z0.m17087G(obj, m16338V), AbstractC4090z0.m17087G(obj2, m16338V))) {
                    break;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (m16356G(obj, obj2, i7) && AbstractC4070p0.m16830H(AbstractC4090z0.m17087G(obj, m16338V), AbstractC4090z0.m17087G(obj2, m16338V))) {
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: p0 */
    public final int m16392p0(int i7, int i8) {
        int length = (this.f13333a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int m16365U = m16365U(i10);
            if (i7 == m16365U) {
                return i10;
            }
            if (i7 < m16365U) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final Object m16393q(Object obj, int i7, Object obj2, AbstractC4082v0 abstractC4082v0, Object obj3) {
        m16365U(i7);
        if (AbstractC4090z0.m17087G(obj, m16338V(m16398t0(i7))) == null) {
            return obj2;
        }
        m16396s(i7);
        return obj2;
    }

    /* renamed from: q0 */
    public final void m16394q0(Object obj, int i7, Object obj2) {
        f13332s.putObject(obj, m16338V(m16398t0(i7)), obj2);
        m16389n0(obj, i7);
    }

    /* renamed from: r0 */
    public final void m16395r0(Object obj, int i7, int i8, Object obj2) {
        f13332s.putObject(obj, m16338V(m16398t0(i8)), obj2);
        m16390o0(obj, i7, i8);
    }

    /* renamed from: s */
    public final AbstractC4015C.c m16396s(int i7) {
        AbstractC4094d.m17162a(this.f13334b[((i7 / 3) * 2) + 1]);
        return null;
    }

    /* renamed from: t */
    public final Object m16397t(int i7) {
        return this.f13334b[(i7 / 3) * 2];
    }

    /* renamed from: t0 */
    public final int m16398t0(int i7) {
        return this.f13333a[i7 + 1];
    }

    /* renamed from: u */
    public final InterfaceC4066n0 m16399u(int i7) {
        int i8 = (i7 / 3) * 2;
        InterfaceC4066n0 interfaceC4066n0 = (InterfaceC4066n0) this.f13334b[i8];
        if (interfaceC4066n0 != null) {
            return interfaceC4066n0;
        }
        InterfaceC4066n0 m16521c = C4056i0.m16519a().m16521c((Class) this.f13334b[i8 + 1]);
        this.f13334b[i8] = m16521c;
        return m16521c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16400u0(java.lang.Object r22, com.google.protobuf.InterfaceC4016C0 r23) {
        /*
            Method dump skipped, instructions count: 1746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4037Y.m16400u0(java.lang.Object, com.google.protobuf.C0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16401v0(java.lang.Object r11, com.google.protobuf.InterfaceC4016C0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4037Y.m16401v0(java.lang.Object, com.google.protobuf.C0):void");
    }

    /* renamed from: w */
    public final int m16402w(AbstractC4082v0 abstractC4082v0, Object obj) {
        return abstractC4082v0.mo16972h(abstractC4082v0.mo16971g(obj));
    }

    /* renamed from: w0 */
    public final void m16403w0(InterfaceC4016C0 interfaceC4016C0, int i7, Object obj, int i8) {
        if (obj != null) {
            interfaceC4016C0.mo16210O(i7, this.f13349q.mo16301c(m16397t(i8)), this.f13349q.mo16306h(obj));
        }
    }

    /* renamed from: x0 */
    public final void m16404x0(int i7, Object obj, InterfaceC4016C0 interfaceC4016C0) {
        if (obj instanceof String) {
            interfaceC4016C0.mo16221k(i7, (String) obj);
        } else {
            interfaceC4016C0.mo16209N(i7, (AbstractC4055i) obj);
        }
    }

    /* renamed from: y0 */
    public final void m16405y0(AbstractC4082v0 abstractC4082v0, Object obj, InterfaceC4016C0 interfaceC4016C0) {
        abstractC4082v0.mo16984t(abstractC4082v0.mo16971g(obj), interfaceC4016C0);
    }

    /* renamed from: z */
    public final boolean m16406z(Object obj, int i7) {
        int m16380h0 = m16380h0(i7);
        long j7 = 1048575 & m16380h0;
        if (j7 != 1048575) {
            return (AbstractC4090z0.m17083C(obj, j7) & (1 << (m16380h0 >>> 20))) != 0;
        }
        int m16398t0 = m16398t0(i7);
        long m16338V = m16338V(m16398t0);
        switch (m16349s0(m16398t0)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC4090z0.m17081A(obj, m16338V)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC4090z0.m17082B(obj, m16338V)) != 0;
            case 2:
                return AbstractC4090z0.m17085E(obj, m16338V) != 0;
            case 3:
                return AbstractC4090z0.m17085E(obj, m16338V) != 0;
            case 4:
                return AbstractC4090z0.m17083C(obj, m16338V) != 0;
            case 5:
                return AbstractC4090z0.m17085E(obj, m16338V) != 0;
            case 6:
                return AbstractC4090z0.m17083C(obj, m16338V) != 0;
            case 7:
                return AbstractC4090z0.m17124t(obj, m16338V);
            case 8:
                Object m17087G = AbstractC4090z0.m17087G(obj, m16338V);
                if (m17087G instanceof String) {
                    return !((String) m17087G).isEmpty();
                }
                if (m17087G instanceof AbstractC4055i) {
                    return !AbstractC4055i.f13379b.equals(m17087G);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC4090z0.m17087G(obj, m16338V) != null;
            case 10:
                return !AbstractC4055i.f13379b.equals(AbstractC4090z0.m17087G(obj, m16338V));
            case 11:
                return AbstractC4090z0.m17083C(obj, m16338V) != 0;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return AbstractC4090z0.m17083C(obj, m16338V) != 0;
            case 13:
                return AbstractC4090z0.m17083C(obj, m16338V) != 0;
            case 14:
                return AbstractC4090z0.m17085E(obj, m16338V) != 0;
            case 15:
                return AbstractC4090z0.m17083C(obj, m16338V) != 0;
            case 16:
                return AbstractC4090z0.m17085E(obj, m16338V) != 0;
            case 17:
                return AbstractC4090z0.m17087G(obj, m16338V) != null;
            default:
                throw new IllegalArgumentException();
        }
    }
}
