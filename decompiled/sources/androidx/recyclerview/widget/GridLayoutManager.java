package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: F */
    public boolean f11279F;

    /* renamed from: G */
    public int f11280G;

    /* renamed from: H */
    public final SparseIntArray f11281H;

    /* renamed from: I */
    public final SparseIntArray f11282I;

    /* renamed from: J */
    public AbstractC3417c f11283J;

    /* renamed from: K */
    public final Rect f11284K;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C3415a extends AbstractC3417c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC3417c
        /* renamed from: b */
        public int mo13535b(int i7) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC3417c {

        /* renamed from: a */
        public final SparseIntArray f11287a = new SparseIntArray();

        /* renamed from: b */
        public boolean f11288b = false;

        /* renamed from: a */
        public int m13536a(int i7, int i8) {
            int mo13535b = mo13535b(i7);
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int mo13535b2 = mo13535b(i11);
                i9 += mo13535b2;
                if (i9 == i8) {
                    i10++;
                    i9 = 0;
                } else if (i9 > i8) {
                    i10++;
                    i9 = mo13535b2;
                }
            }
            return i9 + mo13535b > i8 ? i10 + 1 : i10;
        }

        /* renamed from: b */
        public abstract int mo13535b(int i7);

        /* renamed from: c */
        public void m13537c() {
            this.f11287a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f11279F = false;
        this.f11280G = -1;
        this.f11281H = new SparseIntArray();
        this.f11282I = new SparseIntArray();
        this.f11283J = new C3415a();
        this.f11284K = new Rect();
        m13524V0(RecyclerView.AbstractC3436n.m13679J(context, attributeSet, i7, i8).f11427b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: E0 */
    public boolean mo13520E0() {
        return this.f11290B == null && !this.f11279F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: L */
    public int mo13521L(RecyclerView.C3442t c3442t, RecyclerView.C3446x c3446x) {
        if (this.f11294q == 0) {
            return this.f11280G;
        }
        if (c3446x.m13777a() < 1) {
            return 0;
        }
        return m13523U0(c3442t, c3446x, c3446x.m13777a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: T0 */
    public void mo13522T0(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo13522T0(false);
    }

    /* renamed from: U0 */
    public final int m13523U0(RecyclerView.C3442t c3442t, RecyclerView.C3446x c3446x, int i7) {
        if (!c3446x.m13778b()) {
            return this.f11283J.m13536a(i7, this.f11280G);
        }
        int m13752d = c3442t.m13752d(i7);
        if (m13752d != -1) {
            return this.f11283J.m13536a(m13752d, this.f11280G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    /* renamed from: V0 */
    public void m13524V0(int i7) {
        if (i7 == this.f11280G) {
            return;
        }
        this.f11279F = true;
        if (i7 >= 1) {
            this.f11280G = i7;
            this.f11283J.m13537c();
            m13682A0();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: d */
    public boolean mo13525d(RecyclerView.C3437o c3437o) {
        return c3437o instanceof C3416b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: f0 */
    public void mo13526f0(RecyclerView recyclerView, int i7, int i8) {
        this.f11283J.m13537c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: g0 */
    public void mo13527g0(RecyclerView recyclerView) {
        this.f11283J.m13537c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: h0 */
    public void mo13528h0(RecyclerView recyclerView, int i7, int i8, int i9) {
        this.f11283J.m13537c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: i0 */
    public void mo13529i0(RecyclerView recyclerView, int i7, int i8) {
        this.f11283J.m13537c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: k0 */
    public void mo13530k0(RecyclerView recyclerView, int i7, int i8, Object obj) {
        this.f11283J.m13537c();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: n */
    public RecyclerView.C3437o mo13531n() {
        return this.f11294q == 0 ? new C3416b(-2, -1) : new C3416b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: o */
    public RecyclerView.C3437o mo13532o(Context context, AttributeSet attributeSet) {
        return new C3416b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: p */
    public RecyclerView.C3437o mo13533p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3416b((ViewGroup.MarginLayoutParams) layoutParams) : new C3416b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: v */
    public int mo13534v(RecyclerView.C3442t c3442t, RecyclerView.C3446x c3446x) {
        if (this.f11294q == 1) {
            return this.f11280G;
        }
        if (c3446x.m13777a() < 1) {
            return 0;
        }
        return m13523U0(c3442t, c3446x, c3446x.m13777a() - 1) + 1;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C3416b extends RecyclerView.C3437o {

        /* renamed from: d */
        public int f11285d;

        /* renamed from: e */
        public int f11286e;

        public C3416b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11285d = -1;
            this.f11286e = 0;
        }

        public C3416b(int i7, int i8) {
            super(i7, i8);
            this.f11285d = -1;
            this.f11286e = 0;
        }

        public C3416b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11285d = -1;
            this.f11286e = 0;
        }

        public C3416b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11285d = -1;
            this.f11286e = 0;
        }
    }
}
