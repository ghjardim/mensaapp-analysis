package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p021D.AbstractC0113u;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC3459e implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f11592e = new ThreadLocal();

    /* renamed from: f */
    public static Comparator f11593f = new a();

    /* renamed from: b */
    public long f11595b;

    /* renamed from: c */
    public long f11596c;

    /* renamed from: a */
    public ArrayList f11594a = new ArrayList();

    /* renamed from: d */
    public ArrayList f11597d = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f11605d;
            if ((recyclerView == null) != (cVar2.f11605d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z6 = cVar.f11602a;
            if (z6 != cVar2.f11602a) {
                return z6 ? -1 : 1;
            }
            int i7 = cVar2.f11603b - cVar.f11603b;
            if (i7 != 0) {
                return i7;
            }
            int i8 = cVar.f11604c - cVar2.f11604c;
            if (i8 != 0) {
                return i8;
            }
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public static class b {

        /* renamed from: a */
        public int f11598a;

        /* renamed from: b */
        public int f11599b;

        /* renamed from: c */
        public int[] f11600c;

        /* renamed from: d */
        public int f11601d;

        /* renamed from: a */
        public void m13907a() {
            int[] iArr = this.f11600c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11601d = 0;
        }

        /* renamed from: b */
        public void m13908b(RecyclerView recyclerView, boolean z6) {
            this.f11601d = 0;
            int[] iArr = this.f11600c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC3436n abstractC3436n = recyclerView.f11380s;
        }

        /* renamed from: c */
        public void m13909c(int i7, int i8) {
            this.f11598a = i7;
            this.f11599b = i8;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    public static class c {

        /* renamed from: a */
        public boolean f11602a;

        /* renamed from: b */
        public int f11603b;

        /* renamed from: c */
        public int f11604c;

        /* renamed from: d */
        public RecyclerView f11605d;

        /* renamed from: e */
        public int f11606e;

        /* renamed from: a */
        public void m13910a() {
            this.f11602a = false;
            this.f11603b = 0;
            this.f11604c = 0;
            this.f11605d = null;
            this.f11606e = 0;
        }
    }

    /* renamed from: e */
    public static boolean m13897e(RecyclerView recyclerView, int i7) {
        if (recyclerView.f11359e.m13860g() <= 0) {
            return false;
        }
        RecyclerView.m13570E(recyclerView.f11359e.m13859f(0));
        throw null;
    }

    /* renamed from: a */
    public void m13898a(RecyclerView recyclerView) {
        this.f11594a.add(recyclerView);
    }

    /* renamed from: b */
    public final void m13899b() {
        c cVar;
        int size = this.f11594a.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView = (RecyclerView) this.f11594a.get(i8);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f11367k0.m13908b(recyclerView, false);
                i7 += recyclerView.f11367k0.f11601d;
            }
        }
        this.f11597d.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f11594a.get(i10);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f11367k0;
                int abs = Math.abs(bVar.f11598a) + Math.abs(bVar.f11599b);
                for (int i11 = 0; i11 < bVar.f11601d * 2; i11 += 2) {
                    if (i9 >= this.f11597d.size()) {
                        cVar = new c();
                        this.f11597d.add(cVar);
                    } else {
                        cVar = (c) this.f11597d.get(i9);
                    }
                    int[] iArr = bVar.f11600c;
                    int i12 = iArr[i11 + 1];
                    cVar.f11602a = i12 <= abs;
                    cVar.f11603b = abs;
                    cVar.f11604c = i12;
                    cVar.f11605d = recyclerView2;
                    cVar.f11606e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(this.f11597d, f11593f);
    }

    /* renamed from: c */
    public final void m13900c(c cVar, long j7) {
        if (cVar.f11602a) {
            j7 = Long.MAX_VALUE;
        }
        m13904h(cVar.f11605d, cVar.f11606e, j7);
    }

    /* renamed from: d */
    public final void m13901d(long j7) {
        for (int i7 = 0; i7 < this.f11597d.size(); i7++) {
            c cVar = (c) this.f11597d.get(i7);
            if (cVar.f11605d == null) {
                return;
            }
            m13900c(cVar, j7);
            cVar.m13910a();
        }
    }

    /* renamed from: f */
    public void m13902f(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.isAttachedToWindow() && this.f11595b == 0) {
            this.f11595b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f11367k0.m13909c(i7, i8);
    }

    /* renamed from: g */
    public void m13903g(long j7) {
        m13899b();
        m13901d(j7);
    }

    /* renamed from: h */
    public final RecyclerView.AbstractC3422A m13904h(RecyclerView recyclerView, int i7, long j7) {
        if (m13897e(recyclerView, i7)) {
            return null;
        }
        RecyclerView.C3442t c3442t = recyclerView.f11353b;
        try {
            recyclerView.m13597Y();
            c3442t.m13770v(i7, false, j7);
            return null;
        } finally {
            recyclerView.m13599a0(false);
        }
    }

    /* renamed from: i */
    public void m13905i(RecyclerView recyclerView) {
        this.f11594a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AbstractC0113u.m282a("RV Prefetch");
            if (!this.f11594a.isEmpty()) {
                int size = this.f11594a.size();
                long j7 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = (RecyclerView) this.f11594a.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j7 = Math.max(recyclerView.getDrawingTime(), j7);
                    }
                }
                if (j7 != 0) {
                    m13903g(TimeUnit.MILLISECONDS.toNanos(j7) + this.f11596c);
                    this.f11595b = 0L;
                    AbstractC0113u.m283b();
                }
            }
        } finally {
            this.f11595b = 0L;
            AbstractC0113u.m283b();
        }
    }
}
