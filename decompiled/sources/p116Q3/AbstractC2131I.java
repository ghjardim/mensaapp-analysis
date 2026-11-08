package p116Q3;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.C3952f;
import com.google.protobuf.AbstractC4055i;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import org.apache.tika.fork.ForkServer;
import p046G3.C0451t;
import p164X2.AbstractC2815a;
import p237g5.C4448l0;
import p237g5.C4450m0;
import p237g5.C4452n0;

/* renamed from: Q3.I */
/* loaded from: classes.dex */
public abstract class AbstractC2131I {

    /* renamed from: a */
    public static final Random f6446a = new SecureRandom();

    /* renamed from: b */
    public static final Continuation f6447b = new Continuation() { // from class: Q3.D
        @Override // com.google.android.gms.tasks.Continuation
        public final Object then(Task task) {
            Void m7181A;
            m7181A = AbstractC2131I.m7181A(task);
            return m7181A;
        }
    };

    /* renamed from: A */
    public static /* synthetic */ Void m7181A(Task task) {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception m7201p = m7201p(task.getException());
        if (m7201p instanceof C3952f) {
            throw m7201p;
        }
        throw new C3952f(m7201p.getMessage(), C3952f.a.UNKNOWN, m7201p);
    }

    /* renamed from: B */
    public static StringBuilder m7182B(CharSequence charSequence, int i7, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i7 != 0) {
            sb.append(charSequence);
            for (int i8 = 1; i8 < i7; i8++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    /* renamed from: C */
    public static String m7183C(AbstractC4055i abstractC4055i) {
        int size = abstractC4055i.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i7 = 0; i7 < size; i7++) {
            byte mo16437f = abstractC4055i.mo16437f(i7);
            sb.append(Character.forDigit((mo16437f & ForkServer.ERROR) >>> 4, 16));
            sb.append(Character.forDigit(mo16437f & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: D */
    public static String m7184D(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    /* renamed from: E */
    public static Continuation m7185E() {
        return f6447b;
    }

    /* renamed from: e */
    public static Object m7190e(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: f */
    public static List m7191f(int i7, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i8 = 0; i8 < arrayList.size(); i8 += 2) {
            Object obj3 = arrayList.get(i8);
            if (!(obj3 instanceof String) && !(obj3 instanceof C0451t)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i8 + i7 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static Comparator m7192g() {
        return new Comparator() { // from class: Q3.F
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    /* renamed from: h */
    public static int m7193h(boolean z6, boolean z7) {
        if (z6 == z7) {
            return 0;
        }
        return z6 ? 1 : -1;
    }

    /* renamed from: i */
    public static int m7194i(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            int i8 = bArr[i7] & ForkServer.ERROR;
            int i9 = bArr2[i7] & ForkServer.ERROR;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
        }
        return m7197l(bArr.length, bArr2.length);
    }

    /* renamed from: j */
    public static int m7195j(AbstractC4055i abstractC4055i, AbstractC4055i abstractC4055i2) {
        int min = Math.min(abstractC4055i.size(), abstractC4055i2.size());
        for (int i7 = 0; i7 < min; i7++) {
            int mo16437f = abstractC4055i.mo16437f(i7) & ForkServer.ERROR;
            int mo16437f2 = abstractC4055i2.mo16437f(i7) & ForkServer.ERROR;
            if (mo16437f < mo16437f2) {
                return -1;
            }
            if (mo16437f > mo16437f2) {
                return 1;
            }
        }
        return m7197l(abstractC4055i.size(), abstractC4055i2.size());
    }

    /* renamed from: k */
    public static int m7196k(double d7, double d8) {
        return AbstractC2815a.m10071c(d7, d8);
    }

    /* renamed from: l */
    public static int m7197l(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 > i8 ? 1 : 0;
    }

    /* renamed from: m */
    public static int m7198m(long j7, long j8) {
        return AbstractC2815a.m10069a(j7, j8);
    }

    /* renamed from: n */
    public static int m7199n(double d7, long j7) {
        return AbstractC2815a.m10070b(d7, j7);
    }

    /* renamed from: o */
    public static int m7200o(String str, String str2) {
        int i7 = 0;
        while (i7 < str.length() && i7 < str2.length()) {
            int codePointAt = str.codePointAt(i7);
            int codePointAt2 = str2.codePointAt(i7);
            if (codePointAt != codePointAt2) {
                if (codePointAt < 128 && codePointAt2 < 128) {
                    return Integer.compare(codePointAt, codePointAt2);
                }
                int m7195j = m7195j(AbstractC4055i.m16502n(m7208w(str, i7)), AbstractC4055i.m16502n(m7208w(str2, i7)));
                return m7195j != 0 ? m7195j : Integer.compare(codePointAt, codePointAt2);
            }
            i7 += Character.charCount(codePointAt);
        }
        return Integer.compare(str.length(), str2.length());
    }

    /* renamed from: p */
    public static Exception m7201p(Exception exc) {
        return exc instanceof C4450m0 ? m7206u(((C4450m0) exc).m18976a()) : exc instanceof C4452n0 ? m7206u(((C4452n0) exc).m18977a()) : exc;
    }

    /* renamed from: q */
    public static void m7202q(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Q3.E
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2131I.m7209x(runtimeException);
            }
        });
    }

    /* renamed from: r */
    public static void m7203r(Collection collection, Collection collection2, Comparator comparator, InterfaceC2145n interfaceC2145n, InterfaceC2145n interfaceC2145n2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        m7204s(arrayList.iterator(), arrayList2.iterator(), comparator, interfaceC2145n, interfaceC2145n2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
    
        if (r0 != null) goto L19;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7204s(java.util.Iterator r6, java.util.Iterator r7, java.util.Comparator r8, p116Q3.InterfaceC2145n r9, p116Q3.InterfaceC2145n r10) {
        /*
            java.lang.Object r0 = m7190e(r6)
            java.lang.Object r1 = m7190e(r7)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r4 = r8.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L26
        L1b:
            if (r4 <= 0) goto L1e
            goto L23
        L1e:
            r3 = r2
            goto L26
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r5 = r3
            r3 = r2
            r2 = r5
        L26:
            if (r2 == 0) goto L30
            r9.accept(r1)
            java.lang.Object r1 = m7190e(r7)
            goto L8
        L30:
            if (r3 == 0) goto L3a
            r10.accept(r0)
            java.lang.Object r0 = m7190e(r6)
            goto L8
        L3a:
            java.lang.Object r0 = m7190e(r6)
            java.lang.Object r1 = m7190e(r7)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p116Q3.AbstractC2131I.m7204s(java.util.Iterator, java.util.Iterator, java.util.Comparator, Q3.n, Q3.n):void");
    }

    /* renamed from: t */
    public static void m7205t(SortedSet sortedSet, SortedSet sortedSet2, InterfaceC2145n interfaceC2145n, InterfaceC2145n interfaceC2145n2) {
        m7204s(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: Q3.G
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((Comparable) obj).compareTo((Comparable) obj2);
                return compareTo;
            }
        }, interfaceC2145n, interfaceC2145n2);
    }

    /* renamed from: u */
    public static C3952f m7206u(C4448l0 c4448l0) {
        C4450m0 m18955c = c4448l0.m18955c();
        return new C3952f(m18955c.getMessage(), C3952f.a.m15585g(c4448l0.m18959m().m18966g()), m18955c);
    }

    /* renamed from: v */
    public static Map m7207v(Map map, int i7, final Comparator comparator) {
        if (map.size() <= i7) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: Q3.H
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m7211z;
                m7211z = AbstractC2131I.m7211z(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                return m7211z;
            }
        });
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < i7; i8++) {
            hashMap.put(((Map.Entry) arrayList.get(i8)).getKey(), ((Map.Entry) arrayList.get(i8)).getValue());
        }
        return hashMap;
    }

    /* renamed from: w */
    public static String m7208w(String str, int i7) {
        return str.substring(i7, Character.charCount(str.codePointAt(i7)) + i7);
    }

    /* renamed from: z */
    public static /* synthetic */ int m7211z(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* renamed from: x */
    public static /* synthetic */ void m7209x(RuntimeException runtimeException) {
        throw runtimeException;
    }
}
