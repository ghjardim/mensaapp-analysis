package p017C2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p017C2.AbstractC0076a;
import p031E2.AbstractC0266b;
import p031E2.AbstractC0267c;
import p031E2.AbstractC0275k;
import p031E2.AbstractC0276l;
import p382y2.AbstractC7066b;
import p382y2.AbstractC7067c;

/* renamed from: C2.c */
/* loaded from: classes.dex */
public class C0078c extends AbstractC0077b {
    public static final Parcelable.Creator<C0078c> CREATOR = new C0086k();

    /* renamed from: a */
    public final int f291a;

    /* renamed from: b */
    public final Parcel f292b;

    /* renamed from: c */
    public final int f293c = 2;

    /* renamed from: d */
    public final C0083h f294d;

    /* renamed from: e */
    public final String f295e;

    /* renamed from: f */
    public int f296f;

    /* renamed from: n */
    public int f297n;

    public C0078c(int i7, Parcel parcel, C0083h c0083h) {
        this.f291a = i7;
        this.f292b = (Parcel) AbstractC3802r.m15129k(parcel);
        this.f294d = c0083h;
        this.f295e = c0083h == null ? null : c0083h.m232x0();
        this.f296f = 2;
    }

    /* renamed from: h */
    public static final void m227h(StringBuilder sb, int i7, Object obj) {
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(AbstractC0275k.m1128a(AbstractC3802r.m15129k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(AbstractC0267c.m1107c((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(AbstractC0267c.m1108d((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                AbstractC0276l.m1129a(sb, (HashMap) AbstractC3802r.m15129k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i7);
        }
    }

    /* renamed from: i */
    public static final void m228i(StringBuilder sb, AbstractC0076a.a aVar, Object obj) {
        if (!aVar.f282c) {
            m227h(sb, aVar.f281b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            m227h(sb, aVar.f281b, arrayList.get(i7));
        }
        sb.append("]");
    }

    @Override // p017C2.AbstractC0076a
    public final void addConcreteTypeArrayInternal(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((C0078c) ((AbstractC0076a) arrayList.get(i7))).m229d());
        }
        AbstractC7067c.m29105B(this.f292b, aVar.m219D0(), arrayList2, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void addConcreteTypeInternal(AbstractC0076a.a aVar, String str, AbstractC0076a abstractC0076a) {
        m230e(aVar);
        AbstractC7067c.m29104A(this.f292b, aVar.m219D0(), ((C0078c) abstractC0076a).m229d(), true);
    }

    /* renamed from: d */
    public final Parcel m229d() {
        int i7 = this.f296f;
        if (i7 == 0) {
            int m29117a = AbstractC7067c.m29117a(this.f292b);
            this.f297n = m29117a;
            AbstractC7067c.m29118b(this.f292b, m29117a);
            this.f296f = 2;
        } else if (i7 == 1) {
            AbstractC7067c.m29118b(this.f292b, this.f297n);
            this.f296f = 2;
        }
        return this.f292b;
    }

    /* renamed from: e */
    public final void m230e(AbstractC0076a.a aVar) {
        if (aVar.f286n == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f292b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i7 = this.f296f;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f297n = AbstractC7067c.m29117a(parcel);
            this.f296f = 1;
        }
    }

    /* renamed from: f */
    public final void m231f(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((AbstractC0076a.a) entry.getValue()).m219D0(), entry);
        }
        sb.append('{');
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(AbstractC7066b.m29100w(m29066D));
            if (entry2 != null) {
                if (z6) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                AbstractC0076a.a aVar = (AbstractC0076a.a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (aVar.m226L0()) {
                    int i7 = aVar.f283d;
                    switch (i7) {
                        case 0:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, Integer.valueOf(AbstractC7066b.m29068F(parcel, m29066D))));
                            break;
                        case 1:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, AbstractC7066b.m29080c(parcel, m29066D)));
                            break;
                        case 2:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, Long.valueOf(AbstractC7066b.m29070H(parcel, m29066D))));
                            break;
                        case 3:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, Float.valueOf(AbstractC7066b.m29064B(parcel, m29066D))));
                            break;
                        case 4:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, Double.valueOf(AbstractC7066b.m29103z(parcel, m29066D))));
                            break;
                        case 5:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, AbstractC7066b.m29078a(parcel, m29066D)));
                            break;
                        case 6:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, Boolean.valueOf(AbstractC7066b.m29101x(parcel, m29066D))));
                            break;
                        case 7:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, AbstractC7066b.m29094q(parcel, m29066D)));
                            break;
                        case 8:
                        case 9:
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, AbstractC7066b.m29084g(parcel, m29066D)));
                            break;
                        case 10:
                            Bundle m29083f = AbstractC7066b.m29083f(parcel, m29066D);
                            HashMap hashMap = new HashMap();
                            for (String str2 : m29083f.keySet()) {
                                hashMap.put(str2, (String) AbstractC3802r.m15129k(m29083f.getString(str2)));
                            }
                            m228i(sb, aVar, AbstractC0076a.zaD(aVar, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i7);
                    }
                } else if (aVar.f284e) {
                    sb.append("[");
                    switch (aVar.f283d) {
                        case 0:
                            AbstractC0266b.m1100e(sb, AbstractC7066b.m29088k(parcel, m29066D));
                            break;
                        case 1:
                            AbstractC0266b.m1102g(sb, AbstractC7066b.m29081d(parcel, m29066D));
                            break;
                        case 2:
                            AbstractC0266b.m1101f(sb, AbstractC7066b.m29090m(parcel, m29066D));
                            break;
                        case 3:
                            AbstractC0266b.m1099d(sb, AbstractC7066b.m29087j(parcel, m29066D));
                            break;
                        case 4:
                            AbstractC0266b.m1098c(sb, AbstractC7066b.m29086i(parcel, m29066D));
                            break;
                        case 5:
                            AbstractC0266b.m1102g(sb, AbstractC7066b.m29079b(parcel, m29066D));
                            break;
                        case 6:
                            AbstractC0266b.m1103h(sb, AbstractC7066b.m29082e(parcel, m29066D));
                            break;
                        case 7:
                            AbstractC0266b.m1104i(sb, AbstractC7066b.m29095r(parcel, m29066D));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] m29092o = AbstractC7066b.m29092o(parcel, m29066D);
                            int length = m29092o.length;
                            for (int i8 = 0; i8 < length; i8++) {
                                if (i8 > 0) {
                                    sb.append(",");
                                }
                                m29092o[i8].setDataPosition(0);
                                m231f(sb, aVar.m224J0(), m29092o[i8]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (aVar.f283d) {
                        case 0:
                            sb.append(AbstractC7066b.m29068F(parcel, m29066D));
                            break;
                        case 1:
                            sb.append(AbstractC7066b.m29080c(parcel, m29066D));
                            break;
                        case 2:
                            sb.append(AbstractC7066b.m29070H(parcel, m29066D));
                            break;
                        case 3:
                            sb.append(AbstractC7066b.m29064B(parcel, m29066D));
                            break;
                        case 4:
                            sb.append(AbstractC7066b.m29103z(parcel, m29066D));
                            break;
                        case 5:
                            sb.append(AbstractC7066b.m29078a(parcel, m29066D));
                            break;
                        case 6:
                            sb.append(AbstractC7066b.m29101x(parcel, m29066D));
                            break;
                        case 7:
                            String m29094q = AbstractC7066b.m29094q(parcel, m29066D);
                            sb.append("\"");
                            sb.append(AbstractC0275k.m1128a(m29094q));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] m29084g = AbstractC7066b.m29084g(parcel, m29066D);
                            sb.append("\"");
                            sb.append(AbstractC0267c.m1107c(m29084g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] m29084g2 = AbstractC7066b.m29084g(parcel, m29066D);
                            sb.append("\"");
                            sb.append(AbstractC0267c.m1108d(m29084g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle m29083f2 = AbstractC7066b.m29083f(parcel, m29066D);
                            Set<String> keySet = m29083f2.keySet();
                            sb.append("{");
                            boolean z7 = true;
                            for (String str3 : keySet) {
                                if (!z7) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(AbstractC0275k.m1128a(m29083f2.getString(str3)));
                                sb.append("\"");
                                z7 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m29091n = AbstractC7066b.m29091n(parcel, m29066D);
                            m29091n.setDataPosition(0);
                            m231f(sb, aVar.m224J0(), m29091n);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z6 = true;
            }
        }
        if (parcel.dataPosition() == m29075M) {
            sb.append('}');
            return;
        }
        throw new AbstractC7066b.a("Overread allowed size end=" + m29075M, parcel);
    }

    @Override // p017C2.AbstractC0076a
    public final Map getFieldMappings() {
        C0083h c0083h = this.f294d;
        if (c0083h == null) {
            return null;
        }
        return c0083h.m233y0((String) AbstractC3802r.m15129k(this.f295e));
    }

    @Override // p017C2.AbstractC0077b, p017C2.AbstractC0076a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // p017C2.AbstractC0077b, p017C2.AbstractC0076a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // p017C2.AbstractC0076a
    public final void setBooleanInternal(AbstractC0076a.a aVar, String str, boolean z6) {
        m230e(aVar);
        AbstractC7067c.m29123g(this.f292b, aVar.m219D0(), z6);
    }

    @Override // p017C2.AbstractC0076a
    public final void setDecodedBytesInternal(AbstractC0076a.a aVar, String str, byte[] bArr) {
        m230e(aVar);
        AbstractC7067c.m29127k(this.f292b, aVar.m219D0(), bArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void setIntegerInternal(AbstractC0076a.a aVar, String str, int i7) {
        m230e(aVar);
        AbstractC7067c.m29136t(this.f292b, aVar.m219D0(), i7);
    }

    @Override // p017C2.AbstractC0076a
    public final void setLongInternal(AbstractC0076a.a aVar, String str, long j7) {
        m230e(aVar);
        AbstractC7067c.m29140x(this.f292b, aVar.m219D0(), j7);
    }

    @Override // p017C2.AbstractC0076a
    public final void setStringInternal(AbstractC0076a.a aVar, String str, String str2) {
        m230e(aVar);
        AbstractC7067c.m29108E(this.f292b, aVar.m219D0(), str2, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void setStringMapInternal(AbstractC0076a.a aVar, String str, Map map) {
        m230e(aVar);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) AbstractC3802r.m15129k(map)).keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        AbstractC7067c.m29126j(this.f292b, aVar.m219D0(), bundle, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void setStringsInternal(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = (String) arrayList.get(i7);
        }
        AbstractC7067c.m29109F(this.f292b, aVar.m219D0(), strArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final String toString() {
        AbstractC3802r.m15130l(this.f294d, "Cannot convert to JSON on client side.");
        Parcel m229d = m229d();
        m229d.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m231f(sb, (Map) AbstractC3802r.m15129k(this.f294d.m233y0((String) AbstractC3802r.m15129k(this.f295e))), m229d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f291a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29104A(parcel, 2, m229d(), false);
        int i9 = this.f293c;
        AbstractC7067c.m29106C(parcel, 3, i9 != 0 ? i9 != 1 ? this.f294d : this.f294d : null, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // p017C2.AbstractC0076a
    public final void zab(AbstractC0076a.a aVar, String str, BigDecimal bigDecimal) {
        m230e(aVar);
        AbstractC7067c.m29119c(this.f292b, aVar.m219D0(), bigDecimal, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zad(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigDecimalArr[i7] = (BigDecimal) arrayList.get(i7);
        }
        AbstractC7067c.m29120d(this.f292b, aVar.m219D0(), bigDecimalArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zaf(AbstractC0076a.a aVar, String str, BigInteger bigInteger) {
        m230e(aVar);
        AbstractC7067c.m29121e(this.f292b, aVar.m219D0(), bigInteger, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zah(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigIntegerArr[i7] = (BigInteger) arrayList.get(i7);
        }
        AbstractC7067c.m29122f(this.f292b, aVar.m219D0(), bigIntegerArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zak(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i7 = 0; i7 < size; i7++) {
            zArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue();
        }
        AbstractC7067c.m29124h(this.f292b, aVar.m219D0(), zArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zan(AbstractC0076a.a aVar, String str, double d7) {
        m230e(aVar);
        AbstractC7067c.m29129m(this.f292b, aVar.m219D0(), d7);
    }

    @Override // p017C2.AbstractC0076a
    public final void zap(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        AbstractC7067c.m29130n(this.f292b, aVar.m219D0(), dArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zar(AbstractC0076a.a aVar, String str, float f7) {
        m230e(aVar);
        AbstractC7067c.m29132p(this.f292b, aVar.m219D0(), f7);
    }

    @Override // p017C2.AbstractC0076a
    public final void zat(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = ((Float) arrayList.get(i7)).floatValue();
        }
        AbstractC7067c.m29133q(this.f292b, aVar.m219D0(), fArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zaw(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        AbstractC7067c.m29137u(this.f292b, aVar.m219D0(), iArr, true);
    }

    @Override // p017C2.AbstractC0076a
    public final void zaz(AbstractC0076a.a aVar, String str, ArrayList arrayList) {
        m230e(aVar);
        int size = ((ArrayList) AbstractC3802r.m15129k(arrayList)).size();
        long[] jArr = new long[size];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
        }
        AbstractC7067c.m29141y(this.f292b, aVar.m219D0(), jArr, true);
    }
}
