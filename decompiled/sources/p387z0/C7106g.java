package p387z0;

import java.util.Comparator;
import java.util.TreeSet;
import p387z0.C7106g;

/* renamed from: z0.g */
/* loaded from: classes.dex */
public final class C7106g {

    /* renamed from: a */
    public final TreeSet f25267a = new TreeSet(new Comparator() { // from class: z0.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m29322d;
            m29322d = C7106g.m29322d((C7106g.a) obj, (C7106g.a) obj2);
            return m29322d;
        }
    });

    /* renamed from: b */
    public int f25268b;

    /* renamed from: c */
    public int f25269c;

    /* renamed from: d */
    public boolean f25270d;

    /* renamed from: z0.g$a */
    public static final class a {

        /* renamed from: a */
        public final C7104e f25271a;

        /* renamed from: b */
        public final long f25272b;

        public a(C7104e c7104e, long j7) {
            this.f25271a = c7104e;
            this.f25272b = j7;
        }
    }

    public C7106g() {
        m29326g();
    }

    /* renamed from: c */
    public static int m29321c(int i7, int i8) {
        int min;
        int i9 = i7 - i8;
        return (Math.abs(i9) <= 1000 || (min = (Math.min(i7, i8) - Math.max(i7, i8)) + 65535) >= 1000) ? i9 : i7 < i8 ? min : -min;
    }

    /* renamed from: d */
    public static /* synthetic */ int m29322d(a aVar, a aVar2) {
        return m29321c(aVar.f25271a.f25254g, aVar2.f25271a.f25254g);
    }

    /* renamed from: b */
    public final synchronized void m29323b(a aVar) {
        this.f25268b = aVar.f25271a.f25254g;
        this.f25267a.add(aVar);
    }

    /* renamed from: e */
    public synchronized boolean m29324e(C7104e c7104e, long j7) {
        if (this.f25267a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i7 = c7104e.f25254g;
        if (!this.f25270d) {
            m29326g();
            this.f25269c = C7104e.m29301c(i7);
            this.f25270d = true;
            m29323b(new a(c7104e, j7));
            return true;
        }
        if (Math.abs(m29321c(i7, C7104e.m29300b(this.f25268b))) < 1000) {
            if (m29321c(i7, this.f25269c) <= 0) {
                return false;
            }
            m29323b(new a(c7104e, j7));
            return true;
        }
        this.f25269c = C7104e.m29301c(i7);
        this.f25267a.clear();
        m29323b(new a(c7104e, j7));
        return true;
    }

    /* renamed from: f */
    public synchronized C7104e m29325f(long j7) {
        if (this.f25267a.isEmpty()) {
            return null;
        }
        a aVar = (a) this.f25267a.first();
        int i7 = aVar.f25271a.f25254g;
        if (i7 != C7104e.m29300b(this.f25269c) && j7 < aVar.f25272b) {
            return null;
        }
        this.f25267a.pollFirst();
        this.f25269c = i7;
        return aVar.f25271a;
    }

    /* renamed from: g */
    public synchronized void m29326g() {
        this.f25267a.clear();
        this.f25270d = false;
        this.f25269c = -1;
        this.f25268b = -1;
    }
}
