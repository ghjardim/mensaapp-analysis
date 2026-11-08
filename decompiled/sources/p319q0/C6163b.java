package p319q0;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p178Z2.AbstractC2987A;
import p259j0.AbstractC5330M;
import p327r0.C6235b;

/* renamed from: q0.b */
/* loaded from: classes.dex */
public final class C6163b {

    /* renamed from: a */
    public final Map f22059a;

    /* renamed from: b */
    public final Map f22060b;

    /* renamed from: c */
    public final Map f22061c;

    /* renamed from: d */
    public final Random f22062d;

    public C6163b() {
        this(new Random());
    }

    /* renamed from: b */
    public static void m25724b(Object obj, long j7, Map map) {
        if (map.containsKey(obj)) {
            j7 = Math.max(j7, ((Long) AbstractC5330M.m21747i((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j7));
    }

    /* renamed from: d */
    public static int m25725d(C6235b c6235b, C6235b c6235b2) {
        int compare = Integer.compare(c6235b.f22286c, c6235b2.f22286c);
        return compare != 0 ? compare : c6235b.f22285b.compareTo(c6235b2.f22285b);
    }

    /* renamed from: f */
    public static int m25726f(List list) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < list.size(); i7++) {
            hashSet.add(Integer.valueOf(((C6235b) list.get(i7)).f22286c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    public static void m25727h(long j7, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j7) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            map.remove(arrayList.get(i7));
        }
    }

    /* renamed from: c */
    public final List m25728c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m25727h(elapsedRealtime, this.f22059a);
        m25727h(elapsedRealtime, this.f22060b);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6235b c6235b = (C6235b) list.get(i7);
            if (!this.f22059a.containsKey(c6235b.f22285b) && !this.f22060b.containsKey(Integer.valueOf(c6235b.f22286c))) {
                arrayList.add(c6235b);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void m25729e(C6235b c6235b, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j7;
        m25724b(c6235b.f22285b, elapsedRealtime, this.f22059a);
        int i7 = c6235b.f22286c;
        if (i7 != Integer.MIN_VALUE) {
            m25724b(Integer.valueOf(i7), elapsedRealtime, this.f22060b);
        }
    }

    /* renamed from: g */
    public int m25730g(List list) {
        HashSet hashSet = new HashSet();
        List m25728c = m25728c(list);
        for (int i7 = 0; i7 < m25728c.size(); i7++) {
            hashSet.add(Integer.valueOf(((C6235b) m25728c.get(i7)).f22286c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void m25731i() {
        this.f22059a.clear();
        this.f22060b.clear();
        this.f22061c.clear();
    }

    /* renamed from: j */
    public C6235b m25732j(List list) {
        List m25728c = m25728c(list);
        if (m25728c.size() < 2) {
            return (C6235b) AbstractC2987A.m10750c(m25728c, null);
        }
        Collections.sort(m25728c, new Comparator() { // from class: q0.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m25725d;
                m25725d = C6163b.m25725d((C6235b) obj, (C6235b) obj2);
                return m25725d;
            }
        });
        ArrayList arrayList = new ArrayList();
        int i7 = ((C6235b) m25728c.get(0)).f22286c;
        int i8 = 0;
        while (true) {
            if (i8 >= m25728c.size()) {
                break;
            }
            C6235b c6235b = (C6235b) m25728c.get(i8);
            if (i7 == c6235b.f22286c) {
                arrayList.add(new Pair(c6235b.f22285b, Integer.valueOf(c6235b.f22287d)));
                i8++;
            } else if (arrayList.size() == 1) {
                return (C6235b) m25728c.get(0);
            }
        }
        C6235b c6235b2 = (C6235b) this.f22061c.get(arrayList);
        if (c6235b2 != null) {
            return c6235b2;
        }
        C6235b m25733k = m25733k(m25728c.subList(0, arrayList.size()));
        this.f22061c.put(arrayList, m25733k);
        return m25733k;
    }

    /* renamed from: k */
    public final C6235b m25733k(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += ((C6235b) list.get(i8)).f22287d;
        }
        int nextInt = this.f22062d.nextInt(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C6235b c6235b = (C6235b) list.get(i10);
            i9 += c6235b.f22287d;
            if (nextInt < i9) {
                return c6235b;
            }
        }
        return (C6235b) AbstractC2987A.m10751d(list);
    }

    public C6163b(Random random) {
        this.f22061c = new HashMap();
        this.f22062d = random;
        this.f22059a = new HashMap();
        this.f22060b = new HashMap();
    }
}
