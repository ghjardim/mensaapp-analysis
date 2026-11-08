package p117Q4;

import android.util.Log;
import com.google.firebase.firestore.C3949c;
import com.google.firebase.firestore.C3950d;
import com.google.firebase.firestore.C3953g;
import com.google.firebase.firestore.C3955i;
import com.google.firebase.firestore.C3957k;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p046G3.AbstractC0453u;
import p046G3.C0404Q;
import p046G3.C0410X;
import p046G3.C0412Z;
import p046G3.C0421e;
import p046G3.C0425g;
import p046G3.C0430i0;
import p046G3.C0451t;
import p046G3.C0452t0;
import p046G3.C0464z0;
import p061I4.C0664p;
import p219e3.C4176f;
import p219e3.C4188r;
import p256j$.util.Objects;

/* renamed from: Q4.c */
/* loaded from: classes2.dex */
public class C2184c extends C0664p {

    /* renamed from: d */
    public static final C2184c f6601d = new C2184c();

    /* renamed from: Q4.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6602a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6603b;

        static {
            int[] iArr = new int[C0410X.a.values().length];
            f6603b = iArr;
            try {
                iArr[C0410X.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6603b[C0410X.a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6603b[C0410X.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C0425g.b.values().length];
            f6602a = iArr2;
            try {
                iArr2[C0425g.b.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6602a[C0425g.b.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6602a[C0425g.b.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // p061I4.C0664p
    /* renamed from: g */
    public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
        switch (b7) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                C0664p.m2658c(byteBuffer, 8);
                return new C0404Q(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) m2669f(byteBuffer)).m15506y((String) m2669f(byteBuffer));
            case -73:
                return C0421e.m1635g(C0664p.m2659d(byteBuffer));
            case -72:
                return AbstractC0453u.m1679b(m7390u(m2669f(byteBuffer)));
            case -71:
                return AbstractC0453u.m1678a(m7390u(m2669f(byteBuffer)));
            case -70:
                return AbstractC0453u.m1680c();
            case -69:
                return AbstractC0453u.m1683g();
            case -68:
                return new C4188r(byteBuffer.getLong(), byteBuffer.getInt());
            case -67:
                return AbstractC0453u.m1681e(((Number) m2669f(byteBuffer)).doubleValue());
            case -66:
                return AbstractC0453u.m1682f(((Number) m2669f(byteBuffer)).intValue());
            case -65:
                return C0451t.m1672a();
            case -64:
                int m2660e = C0664p.m2660e(byteBuffer);
                ArrayList arrayList = new ArrayList(m2660e);
                for (int i7 = 0; i7 < m2660e; i7++) {
                    arrayList.add(m2669f(byteBuffer));
                }
                return C0451t.m1674d((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                return m7387r(byteBuffer);
            case -59:
                return m7388s(byteBuffer);
            case -58:
                return m7389t(byteBuffer);
            case -57:
                ArrayList arrayList2 = (ArrayList) m2669f(byteBuffer);
                double[] dArr = new double[arrayList2.size()];
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    Double d7 = (Double) arrayList2.get(i8);
                    Objects.requireNonNull(d7, "Null value at index " + i8);
                    dArr[i8] = d7.doubleValue();
                }
                return AbstractC0453u.m1684h(dArr);
            default:
                return super.mo2670g(b7, byteBuffer);
        }
    }

    @Override // p061I4.C0664p
    /* renamed from: p */
    public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        String m7384a;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            C0664p.m2667n(byteArrayOutputStream, ((Date) obj).getTime());
            return;
        }
        if (obj instanceof C4188r) {
            byteArrayOutputStream.write(-68);
            C4188r c4188r = (C4188r) obj;
            C0664p.m2667n(byteArrayOutputStream, c4188r.m17567h());
            C0664p.m2666m(byteArrayOutputStream, c4188r.m17566f());
            return;
        }
        if (obj instanceof C0404Q) {
            byteArrayOutputStream.write(-75);
            C0664p.m2661h(byteArrayOutputStream, 8);
            C0404Q c0404q = (C0404Q) obj;
            C0664p.m2664k(byteArrayOutputStream, c0404q.m1600f());
            C0664p.m2664k(byteArrayOutputStream, c0404q.m1601g());
            return;
        }
        if (obj instanceof C0464z0) {
            byteArrayOutputStream.write(-57);
            mo2671p(byteArrayOutputStream, ((C0464z0) obj).m1709a());
            return;
        }
        if (obj instanceof C3949c) {
            byteArrayOutputStream.write(-74);
            C3949c c3949c = (C3949c) obj;
            FirebaseFirestore m15550p = c3949c.m15550p();
            mo2671p(byteArrayOutputStream, m15550p.m15476A().m17533q());
            mo2671p(byteArrayOutputStream, c3949c.m15552r());
            synchronized (C2205x.f6661j) {
                m7384a = C2205x.m7420a0(m15550p).m7384a();
            }
            mo2671p(byteArrayOutputStream, m7384a);
            return;
        }
        if (obj instanceof C3950d) {
            m7392w(byteArrayOutputStream, (C3950d) obj);
            return;
        }
        if (obj instanceof C3957k) {
            m7394y(byteArrayOutputStream, (C3957k) obj);
            return;
        }
        if (obj instanceof C0425g) {
            m7391v(byteArrayOutputStream, (C0425g) obj);
            return;
        }
        if (obj instanceof C0410X) {
            m7393x(byteArrayOutputStream, (C0410X) obj);
            return;
        }
        if (obj instanceof C0452t0) {
            m7395z(byteArrayOutputStream, (C0452t0) obj);
            return;
        }
        if (obj instanceof C0421e) {
            byteArrayOutputStream.write(-73);
            C0664p.m2662i(byteArrayOutputStream, ((C0421e) obj).m1638i());
            return;
        }
        if (!(obj instanceof Double)) {
            super.mo2671p(byteArrayOutputStream, obj);
            return;
        }
        Double d7 = (Double) obj;
        if (Double.isNaN(d7.doubleValue())) {
            byteArrayOutputStream.write(-63);
            return;
        }
        if (d7.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
            byteArrayOutputStream.write(-61);
        } else if (d7.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
            byteArrayOutputStream.write(-62);
        } else {
            super.mo2671p(byteArrayOutputStream, obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        if (r2.equals("not-in") == false) goto L6;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.firestore.AbstractC3951e m7386q(java.util.Map r7) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117Q4.C2184c.m7386q(java.util.Map):com.google.firebase.firestore.e");
    }

    /* renamed from: r */
    public final FirebaseFirestore m7387r(ByteBuffer byteBuffer) {
        String str = (String) m2669f(byteBuffer);
        String str2 = (String) m2669f(byteBuffer);
        C3953g c3953g = (C3953g) m2669f(byteBuffer);
        synchronized (C2205x.f6661j) {
            try {
                FirebaseFirestore m7422c0 = C2205x.m7422c0(str, str2);
                if (m7422c0 != null) {
                    return m7422c0;
                }
                FirebaseFirestore m15451C = FirebaseFirestore.m15451C(C4176f.m17518p(str), str2);
                m15451C.m15491Z(c3953g);
                C2205x.m7398C0(m15451C, str2);
                return m15451C;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public final C3955i m7388s(ByteBuffer byteBuffer) {
        try {
            Map map = (Map) m2669f(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get("parameters");
            C3955i m15504w = booleanValue ? firebaseFirestore.m15504w(str) : firebaseFirestore.m15503v(str);
            if (map2 == null) {
                return m15504w;
            }
            if (map2.containsKey("filters")) {
                Object obj3 = map2.get("filters");
                Objects.requireNonNull(obj3);
                m15504w = m15504w.m15629M(m7386q((Map) obj3));
            }
            Object obj4 = map2.get("where");
            Objects.requireNonNull(obj4);
            for (List list : (List) obj4) {
                C0451t c0451t = (C0451t) list.get(0);
                String str2 = (String) list.get(1);
                Object obj5 = list.get(2);
                if ("==".equals(str2)) {
                    m15504w = m15504w.m15632P(c0451t, obj5);
                } else if ("!=".equals(str2)) {
                    m15504w = m15504w.m15638V(c0451t, obj5);
                } else if ("<".equals(str2)) {
                    m15504w = m15504w.m15636T(c0451t, obj5);
                } else if ("<=".equals(str2)) {
                    m15504w = m15504w.m15637U(c0451t, obj5);
                } else if (">".equals(str2)) {
                    m15504w = m15504w.m15633Q(c0451t, obj5);
                } else if (">=".equals(str2)) {
                    m15504w = m15504w.m15634R(c0451t, obj5);
                } else if ("array-contains".equals(str2)) {
                    m15504w = m15504w.m15630N(c0451t, obj5);
                } else if ("array-contains-any".equals(str2)) {
                    m15504w = m15504w.m15631O(c0451t, (List) obj5);
                } else if ("in".equals(str2)) {
                    m15504w = m15504w.m15635S(c0451t, (List) obj5);
                } else if ("not-in".equals(str2)) {
                    m15504w = m15504w.m15639W(c0451t, (List) obj5);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                m15504w = m15504w.m15655y(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                m15504w = m15504w.m15656z(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return m15504w;
            }
            for (List list3 : list2) {
                m15504w = m15504w.m15617A((C0451t) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? C3955i.c.DESCENDING : C3955i.c.ASCENDING);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                m15504w = m15504w.m15624H(array);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                m15504w = m15504w.m15623G(array2);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                m15504w = m15504w.m15645l(array3);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 == null) {
                return m15504w;
            }
            Object[] array4 = list7.toArray();
            Objects.requireNonNull(array4);
            return m15504w.m15646m(array4);
        } catch (Exception e7) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
            return null;
        }
    }

    /* renamed from: t */
    public final C3953g m7389t(ByteBuffer byteBuffer) {
        Map map = (Map) m2669f(byteBuffer);
        C3953g.b bVar = new C3953g.b();
        if (map.get("persistenceEnabled") != null) {
            if (Boolean.TRUE.equals((Boolean) map.get("persistenceEnabled"))) {
                C0430i0.b m1653b = C0430i0.m1653b();
                if (map.get("cacheSizeBytes") != null) {
                    Long l7 = 104857600L;
                    Object obj = map.get("cacheSizeBytes");
                    if (obj instanceof Long) {
                        l7 = (Long) obj;
                    } else if (obj instanceof Integer) {
                        l7 = Long.valueOf(((Integer) obj).intValue());
                    }
                    if (l7.longValue() == -1) {
                        m1653b.m1656b(-1L);
                    } else {
                        m1653b.m1656b(l7.longValue());
                    }
                }
                bVar.m15604h(m1653b.m1655a());
            } else {
                bVar.m15604h(C0412Z.m1620b().m1622a());
            }
        }
        if (map.get("host") != null) {
            Object obj2 = map.get("host");
            Objects.requireNonNull(obj2);
            bVar.m15603g((String) obj2);
            if (map.get("sslEnabled") != null) {
                Object obj3 = map.get("sslEnabled");
                Objects.requireNonNull(obj3);
                bVar.m15605i(((Boolean) obj3).booleanValue());
            }
        }
        return bVar.m15602f();
    }

    /* renamed from: u */
    public final Object[] m7390u(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", obj.getClass().getCanonicalName()));
    }

    /* renamed from: v */
    public final void m7391v(ByteArrayOutputStream byteArrayOutputStream, C0425g c0425g) {
        HashMap hashMap = new HashMap();
        int i7 = a.f6602a[c0425g.m1644e().ordinal()];
        hashMap.put("type", i7 != 1 ? i7 != 2 ? i7 != 3 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        hashMap.put("data", c0425g.m1641b().mo15560d());
        hashMap.put("path", c0425g.m1641b().m15563g().m15552r());
        hashMap.put("oldIndex", Integer.valueOf(c0425g.m1643d()));
        hashMap.put("newIndex", Integer.valueOf(c0425g.m1642c()));
        hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, c0425g.m1641b().m15562f());
        mo2671p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: w */
    public final void m7392w(ByteArrayOutputStream byteArrayOutputStream, C3950d c3950d) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", c3950d.m15563g().m15552r());
        if (c3950d.m15559a()) {
            C3950d.a aVar = (C3950d.a) C2205x.f6662k.get(Integer.valueOf(c3950d.hashCode()));
            if (aVar != null) {
                hashMap.put("data", c3950d.mo15561e(aVar));
            } else {
                hashMap.put("data", c3950d.mo15560d());
            }
        } else {
            hashMap.put("data", null);
        }
        hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, c3950d.m15562f());
        C2205x.f6662k.remove(Integer.valueOf(c3950d.hashCode()));
        mo2671p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: x */
    public final void m7393x(ByteArrayOutputStream byteArrayOutputStream, C0410X c0410x) {
        HashMap hashMap = new HashMap();
        hashMap.put("bytesLoaded", Long.valueOf(c0410x.m1614c()));
        hashMap.put("documentsLoaded", Integer.valueOf(c0410x.m1615d()));
        hashMap.put("totalBytes", Long.valueOf(c0410x.m1617f()));
        hashMap.put("totalDocuments", Integer.valueOf(c0410x.m1618g()));
        int i7 = a.f6603b[c0410x.m1616e().ordinal()];
        String str = "running";
        if (i7 != 1) {
            if (i7 == 2) {
                str = "success";
            } else if (i7 == 3) {
                str = "error";
            }
        }
        hashMap.put("taskState", str);
        mo2671p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: y */
    public final void m7394y(ByteArrayOutputStream byteArrayOutputStream, C3957k c3957k) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C3950d.a aVar = (C3950d.a) C2205x.f6662k.get(Integer.valueOf(c3957k.hashCode()));
        for (C3950d c3950d : c3957k.m15663g()) {
            arrayList.add(c3950d.m15563g().m15552r());
            if (aVar != null) {
                arrayList2.add(c3950d.mo15561e(aVar));
            } else {
                arrayList2.add(c3950d.mo15560d());
            }
            arrayList3.add(c3950d.m15562f());
        }
        hashMap.put("paths", arrayList);
        hashMap.put("documents", arrayList2);
        hashMap.put("metadatas", arrayList3);
        hashMap.put("documentChanges", c3957k.m15661e());
        hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, c3957k.m15664h());
        C2205x.f6662k.remove(Integer.valueOf(c3957k.hashCode()));
        mo2671p(byteArrayOutputStream, hashMap);
    }

    /* renamed from: z */
    public final void m7395z(ByteArrayOutputStream byteArrayOutputStream, C0452t0 c0452t0) {
        HashMap hashMap = new HashMap();
        hashMap.put("hasPendingWrites", Boolean.valueOf(c0452t0.m1676a()));
        hashMap.put("isFromCache", Boolean.valueOf(c0452t0.m1677b()));
        mo2671p(byteArrayOutputStream, hashMap);
    }
}
