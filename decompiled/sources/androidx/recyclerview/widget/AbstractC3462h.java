package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public abstract class AbstractC3462h {

    /* renamed from: a */
    public final RecyclerView.AbstractC3436n f11615a;

    /* renamed from: b */
    public int f11616b;

    /* renamed from: c */
    public final Rect f11617c;

    /* renamed from: androidx.recyclerview.widget.h$a */
    public static class a extends AbstractC3462h {
        public a(RecyclerView.AbstractC3436n abstractC3436n) {
            super(abstractC3436n, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: d */
        public int mo13920d(View view) {
            return this.f11615a.m13734z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3437o) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: e */
        public int mo13921e(View view) {
            return this.f11615a.m13732y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3437o) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: f */
        public int mo13922f() {
            return this.f11615a.m13697O() - this.f11615a.m13691G();
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: g */
        public int mo13923g() {
            return this.f11615a.m13690F();
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: h */
        public int mo13924h() {
            return (this.f11615a.m13697O() - this.f11615a.m13690F()) - this.f11615a.m13691G();
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public static class b extends AbstractC3462h {
        public b(RecyclerView.AbstractC3436n abstractC3436n) {
            super(abstractC3436n, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: d */
        public int mo13920d(View view) {
            return this.f11615a.m13728w(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3437o) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: e */
        public int mo13921e(View view) {
            return this.f11615a.m13681A(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C3437o) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: f */
        public int mo13922f() {
            return this.f11615a.m13683B() - this.f11615a.m13689E();
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: g */
        public int mo13923g() {
            return this.f11615a.m13692H();
        }

        @Override // androidx.recyclerview.widget.AbstractC3462h
        /* renamed from: h */
        public int mo13924h() {
            return (this.f11615a.m13683B() - this.f11615a.m13692H()) - this.f11615a.m13689E();
        }
    }

    public /* synthetic */ AbstractC3462h(RecyclerView.AbstractC3436n abstractC3436n, a aVar) {
        this(abstractC3436n);
    }

    /* renamed from: a */
    public static AbstractC3462h m13917a(RecyclerView.AbstractC3436n abstractC3436n) {
        return new a(abstractC3436n);
    }

    /* renamed from: b */
    public static AbstractC3462h m13918b(RecyclerView.AbstractC3436n abstractC3436n, int i7) {
        if (i7 == 0) {
            return m13917a(abstractC3436n);
        }
        if (i7 == 1) {
            return m13919c(abstractC3436n);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC3462h m13919c(RecyclerView.AbstractC3436n abstractC3436n) {
        return new b(abstractC3436n);
    }

    /* renamed from: d */
    public abstract int mo13920d(View view);

    /* renamed from: e */
    public abstract int mo13921e(View view);

    /* renamed from: f */
    public abstract int mo13922f();

    /* renamed from: g */
    public abstract int mo13923g();

    /* renamed from: h */
    public abstract int mo13924h();

    public AbstractC3462h(RecyclerView.AbstractC3436n abstractC3436n) {
        this.f11616b = Integer.MIN_VALUE;
        this.f11617c = new Rect();
        this.f11615a = abstractC3436n;
    }
}
