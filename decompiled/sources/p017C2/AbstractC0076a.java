package p017C2;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p010B2.C0037b;
import p031E2.AbstractC0267c;
import p031E2.AbstractC0275k;
import p031E2.AbstractC0276l;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: C2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0076a {

    /* renamed from: C2.a$b */
    public interface b {
        /* renamed from: F */
        Object mo99F(Object obj);

        /* renamed from: w */
        Object mo100w(Object obj);
    }

    /* renamed from: b */
    public static final void m209b(StringBuilder sb, a aVar, Object obj) {
        int i7 = aVar.f281b;
        if (i7 == 11) {
            Class cls = aVar.f287o;
            AbstractC3802r.m15129k(cls);
            sb.append(((AbstractC0076a) cls.cast(obj)).toString());
        } else {
            if (i7 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(AbstractC0275k.m1128a((String) obj));
            sb.append("\"");
        }
    }

    /* renamed from: c */
    public static final void m210c(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public static final Object zaD(a aVar, Object obj) {
        return aVar.f290r != null ? aVar.m222H0(obj) : obj;
    }

    /* renamed from: a */
    public final void m211a(a aVar, Object obj) {
        int i7 = aVar.f283d;
        Object m221G0 = aVar.m221G0(obj);
        String str = aVar.f285f;
        switch (i7) {
            case 0:
                if (m221G0 != null) {
                    setIntegerInternal(aVar, str, ((Integer) m221G0).intValue());
                    return;
                } else {
                    m210c(str);
                    return;
                }
            case 1:
                zaf(aVar, str, (BigInteger) m221G0);
                return;
            case 2:
                if (m221G0 != null) {
                    setLongInternal(aVar, str, ((Long) m221G0).longValue());
                    return;
                } else {
                    m210c(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i7);
            case 4:
                if (m221G0 != null) {
                    zan(aVar, str, ((Double) m221G0).doubleValue());
                    return;
                } else {
                    m210c(str);
                    return;
                }
            case 5:
                zab(aVar, str, (BigDecimal) m221G0);
                return;
            case 6:
                if (m221G0 != null) {
                    setBooleanInternal(aVar, str, ((Boolean) m221G0).booleanValue());
                    return;
                } else {
                    m210c(str);
                    return;
                }
            case 7:
                setStringInternal(aVar, str, (String) m221G0);
                return;
            case 8:
            case 9:
                if (m221G0 != null) {
                    setDecodedBytesInternal(aVar, str, (byte[]) m221G0);
                    return;
                } else {
                    m210c(str);
                    return;
                }
        }
    }

    public <T extends AbstractC0076a> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC0076a> void addConcreteTypeInternal(a aVar, String str, T t7) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a> getFieldMappings();

    public Object getFieldValue(a aVar) {
        String str = aVar.f285f;
        if (aVar.f287o == null) {
            return getValueObject(str);
        }
        AbstractC3802r.m15134p(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", aVar.f285f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.f283d != 11) {
            return isPrimitiveFieldSet(aVar.f285f);
        }
        if (aVar.f284e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a aVar, String str, boolean z6) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a aVar, String str, int i7) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a aVar, String str, long j7) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(str);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD != null) {
                    switch (aVar.f283d) {
                        case 8:
                            sb.append("\"");
                            sb.append(AbstractC0267c.m1107c((byte[]) zaD));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(AbstractC0267c.m1108d((byte[]) zaD));
                            sb.append("\"");
                            break;
                        case 10:
                            AbstractC0276l.m1129a(sb, (HashMap) zaD);
                            break;
                        default:
                            if (aVar.f282c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    if (i7 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i7);
                                    if (obj != null) {
                                        m209b(sb, aVar, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                m209b(sb, aVar, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.f290r != null) {
            m211a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f285f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f290r != null) {
            m211a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f285f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f285f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f290r != null) {
            m211a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f285f, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f285f, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f290r != null) {
            m211a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f285f, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f285f, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z6) {
        if (aVar.f290r != null) {
            m211a(aVar, Boolean.valueOf(z6));
        } else {
            setBooleanInternal(aVar, aVar.f285f, z6);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f285f, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f290r != null) {
            m211a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f285f, bArr);
        }
    }

    public final void zam(a aVar, double d7) {
        if (aVar.f290r != null) {
            m211a(aVar, Double.valueOf(d7));
        } else {
            zan(aVar, aVar.f285f, d7);
        }
    }

    public void zan(a aVar, String str, double d7) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f285f, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f7) {
        if (aVar.f290r != null) {
            m211a(aVar, Float.valueOf(f7));
        } else {
            zar(aVar, aVar.f285f, f7);
        }
    }

    public void zar(a aVar, String str, float f7) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f285f, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i7) {
        if (aVar.f290r != null) {
            m211a(aVar, Integer.valueOf(i7));
        } else {
            setIntegerInternal(aVar, aVar.f285f, i7);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f285f, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j7) {
        if (aVar.f290r != null) {
            m211a(aVar, Long.valueOf(j7));
        } else {
            setLongInternal(aVar, aVar.f285f, j7);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f290r != null) {
            m211a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f285f, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* renamed from: C2.a$a */
    public static class a extends AbstractC7065a {
        public static final C0079d CREATOR = new C0079d();

        /* renamed from: a */
        public final int f280a;

        /* renamed from: b */
        public final int f281b;

        /* renamed from: c */
        public final boolean f282c;

        /* renamed from: d */
        public final int f283d;

        /* renamed from: e */
        public final boolean f284e;

        /* renamed from: f */
        public final String f285f;

        /* renamed from: n */
        public final int f286n;

        /* renamed from: o */
        public final Class f287o;

        /* renamed from: p */
        public final String f288p;

        /* renamed from: q */
        public C0083h f289q;

        /* renamed from: r */
        public final b f290r;

        public a(int i7, int i8, boolean z6, int i9, boolean z7, String str, int i10, String str2, C0037b c0037b) {
            this.f280a = i7;
            this.f281b = i8;
            this.f282c = z6;
            this.f283d = i9;
            this.f284e = z7;
            this.f285f = str;
            this.f286n = i10;
            if (str2 == null) {
                this.f287o = null;
                this.f288p = null;
            } else {
                this.f287o = C0078c.class;
                this.f288p = str2;
            }
            if (c0037b == null) {
                this.f290r = null;
            } else {
                this.f290r = c0037b.m103y0();
            }
        }

        /* renamed from: A0 */
        public static a m212A0(String str, int i7) {
            return new a(0, false, 0, false, str, i7, null, null);
        }

        /* renamed from: B0 */
        public static a m213B0(String str, int i7) {
            return new a(7, false, 7, false, str, i7, null, null);
        }

        /* renamed from: C0 */
        public static a m214C0(String str, int i7) {
            return new a(7, true, 7, true, str, i7, null, null);
        }

        /* renamed from: x0 */
        public static a m216x0(String str, int i7) {
            return new a(8, false, 8, false, str, i7, null, null);
        }

        /* renamed from: y0 */
        public static a m217y0(String str, int i7, Class cls) {
            return new a(11, false, 11, false, str, i7, cls, null);
        }

        /* renamed from: z0 */
        public static a m218z0(String str, int i7, Class cls) {
            return new a(11, true, 11, true, str, i7, cls, null);
        }

        /* renamed from: D0 */
        public int m219D0() {
            return this.f286n;
        }

        /* renamed from: E0 */
        public final C0037b m220E0() {
            b bVar = this.f290r;
            if (bVar == null) {
                return null;
            }
            return C0037b.m102x0(bVar);
        }

        /* renamed from: G0 */
        public final Object m221G0(Object obj) {
            AbstractC3802r.m15129k(this.f290r);
            return AbstractC3802r.m15129k(this.f290r.mo99F(obj));
        }

        /* renamed from: H0 */
        public final Object m222H0(Object obj) {
            AbstractC3802r.m15129k(this.f290r);
            return this.f290r.mo100w(obj);
        }

        /* renamed from: I0 */
        public final String m223I0() {
            String str = this.f288p;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: J0 */
        public final Map m224J0() {
            AbstractC3802r.m15129k(this.f288p);
            AbstractC3802r.m15129k(this.f289q);
            return (Map) AbstractC3802r.m15129k(this.f289q.m233y0(this.f288p));
        }

        /* renamed from: K0 */
        public final void m225K0(C0083h c0083h) {
            this.f289q = c0083h;
        }

        /* renamed from: L0 */
        public final boolean m226L0() {
            return this.f290r != null;
        }

        public final String toString() {
            AbstractC3798p.a m15102a = AbstractC3798p.m15101d(this).m15102a("versionCode", Integer.valueOf(this.f280a)).m15102a("typeIn", Integer.valueOf(this.f281b)).m15102a("typeInArray", Boolean.valueOf(this.f282c)).m15102a("typeOut", Integer.valueOf(this.f283d)).m15102a("typeOutArray", Boolean.valueOf(this.f284e)).m15102a("outputFieldName", this.f285f).m15102a("safeParcelFieldId", Integer.valueOf(this.f286n)).m15102a("concreteTypeName", m223I0());
            Class cls = this.f287o;
            if (cls != null) {
                m15102a.m15102a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f290r;
            if (bVar != null) {
                m15102a.m15102a("converterName", bVar.getClass().getCanonicalName());
            }
            return m15102a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            int i8 = this.f280a;
            int m29117a = AbstractC7067c.m29117a(parcel);
            AbstractC7067c.m29136t(parcel, 1, i8);
            AbstractC7067c.m29136t(parcel, 2, this.f281b);
            AbstractC7067c.m29123g(parcel, 3, this.f282c);
            AbstractC7067c.m29136t(parcel, 4, this.f283d);
            AbstractC7067c.m29123g(parcel, 5, this.f284e);
            AbstractC7067c.m29108E(parcel, 6, this.f285f, false);
            AbstractC7067c.m29136t(parcel, 7, m219D0());
            AbstractC7067c.m29108E(parcel, 8, m223I0(), false);
            AbstractC7067c.m29106C(parcel, 9, m220E0(), i7, false);
            AbstractC7067c.m29118b(parcel, m29117a);
        }

        public a(int i7, boolean z6, int i8, boolean z7, String str, int i9, Class cls, b bVar) {
            this.f280a = 1;
            this.f281b = i7;
            this.f282c = z6;
            this.f283d = i8;
            this.f284e = z7;
            this.f285f = str;
            this.f286n = i9;
            this.f287o = cls;
            if (cls == null) {
                this.f288p = null;
            } else {
                this.f288p = cls.getCanonicalName();
            }
            this.f290r = bVar;
        }
    }
}
