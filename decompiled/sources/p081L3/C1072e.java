package p081L3;

import java.util.Comparator;
import p088M3.C1170l;
import p116Q3.AbstractC2131I;

/* renamed from: L3.e */
/* loaded from: classes.dex */
public class C1072e {

    /* renamed from: c */
    public static final Comparator f3520c = new Comparator() { // from class: L3.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m4254e;
            m4254e = C1072e.m4254e((C1072e) obj, (C1072e) obj2);
            return m4254e;
        }
    };

    /* renamed from: d */
    public static final Comparator f3521d = new Comparator() { // from class: L3.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m4255f;
            m4255f = C1072e.m4255f((C1072e) obj, (C1072e) obj2);
            return m4255f;
        }
    };

    /* renamed from: a */
    public final C1170l f3522a;

    /* renamed from: b */
    public final int f3523b;

    public C1072e(C1170l c1170l, int i7) {
        this.f3522a = c1170l;
        this.f3523b = i7;
    }

    /* renamed from: e */
    public static /* synthetic */ int m4254e(C1072e c1072e, C1072e c1072e2) {
        int compareTo = c1072e.f3522a.compareTo(c1072e2.f3522a);
        return compareTo != 0 ? compareTo : AbstractC2131I.m7197l(c1072e.f3523b, c1072e2.f3523b);
    }

    /* renamed from: f */
    public static /* synthetic */ int m4255f(C1072e c1072e, C1072e c1072e2) {
        int m7197l = AbstractC2131I.m7197l(c1072e.f3523b, c1072e2.f3523b);
        return m7197l != 0 ? m7197l : c1072e.f3522a.compareTo(c1072e2.f3522a);
    }

    /* renamed from: c */
    public int m4256c() {
        return this.f3523b;
    }

    /* renamed from: d */
    public C1170l m4257d() {
        return this.f3522a;
    }
}
