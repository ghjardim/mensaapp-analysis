package com.google.firebase.firestore;

import com.google.firebase.firestore.C3950d;
import com.google.protobuf.C4078t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p046G3.C0404Q;
import p046G3.C0421e;
import p046G3.C0464z0;
import p088M3.AbstractC1180v;
import p088M3.AbstractC1184z;
import p088M3.C1164f;
import p088M3.C1170l;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p219e3.C4188r;
import p272k4.C5413D;
import p272k4.C5419b;

/* renamed from: com.google.firebase.firestore.m */
/* loaded from: classes.dex */
public class C3959m {

    /* renamed from: a */
    public final FirebaseFirestore f12974a;

    /* renamed from: b */
    public final C3950d.a f12975b;

    /* renamed from: com.google.firebase.firestore.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12976a;

        static {
            int[] iArr = new int[C3950d.a.values().length];
            f12976a = iArr;
            try {
                iArr[C3950d.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12976a[C3950d.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C3959m(FirebaseFirestore firebaseFirestore, C3950d.a aVar) {
        this.f12974a = firebaseFirestore;
        this.f12975b = aVar;
    }

    /* renamed from: a */
    public final List m15675a(C5419b c5419b) {
        ArrayList arrayList = new ArrayList(c5419b.m22557i0());
        Iterator it = c5419b.mo22555g().iterator();
        while (it.hasNext()) {
            arrayList.add(m15680f((C5413D) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public Map m15676b(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), m15680f((C5413D) entry.getValue()));
        }
        return hashMap;
    }

    /* renamed from: c */
    public final Object m15677c(C5413D c5413d) {
        C1164f m4475g = C1164f.m4475g(c5413d.m22460t0());
        C1170l m4497i = C1170l.m4497i(c5413d.m22460t0());
        C1164f m15477B = this.f12974a.m15477B();
        if (!m4475g.equals(m15477B)) {
            AbstractC2155x.m7313e("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", m4497i.m4505o(), m4475g.m4478i(), m4475g.m4477h(), m15477B.m4478i(), m15477B.m4477h());
        }
        return new C3949c(m4497i, this.f12974a);
    }

    /* renamed from: d */
    public final Object m15678d(C5413D c5413d) {
        int i7 = a.f12976a[this.f12975b.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return null;
            }
            return m15679e(AbstractC1180v.m4567a(c5413d));
        }
        C5413D m4568b = AbstractC1180v.m4568b(c5413d);
        if (m4568b == null) {
            return null;
        }
        return m15680f(m4568b);
    }

    /* renamed from: e */
    public final Object m15679e(C4078t0 c4078t0) {
        return new C4188r(c4078t0.m16932e0(), c4078t0.m16931d0());
    }

    /* renamed from: f */
    public Object m15680f(C5413D c5413d) {
        switch (AbstractC1184z.m4589I(c5413d)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(c5413d.m22454m0());
            case 2:
                return c5413d.m22463w0().equals(C5413D.c.INTEGER_VALUE) ? Long.valueOf(c5413d.m22458r0()) : Double.valueOf(c5413d.m22456p0());
            case 3:
                return m15679e(c5413d.m22462v0());
            case 4:
                return m15678d(c5413d);
            case 5:
                return c5413d.m22461u0();
            case 6:
                return C0421e.m1634f(c5413d.m22455n0());
            case 7:
                return m15677c(c5413d);
            case 8:
                return new C0404Q(c5413d.m22457q0().m24962d0(), c5413d.m22457q0().m24963e0());
            case 9:
                return m15675a(c5413d.m22453l0());
            case 10:
                return m15681g(c5413d.m22459s0().m22737d0());
            case 11:
                return m15676b(c5413d.m22459s0().m22737d0());
            default:
                throw AbstractC2133b.m7214a("Unknown value type: " + c5413d.m22463w0(), new Object[0]);
        }
    }

    /* renamed from: g */
    public C0464z0 m15681g(Map map) {
        List mo22555g = ((C5413D) map.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m22453l0().mo22555g();
        double[] dArr = new double[mo22555g.size()];
        for (int i7 = 0; i7 < mo22555g.size(); i7++) {
            dArr[i7] = ((C5413D) mo22555g.get(i7)).m22456p0();
        }
        return new C0464z0(dArr);
    }
}
