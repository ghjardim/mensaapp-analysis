package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC3436n {

    /* renamed from: D */
    public boolean f11468D;

    /* renamed from: E */
    public boolean f11469E;

    /* renamed from: F */
    public C3453e f11470F;

    /* renamed from: r */
    public C3454f[] f11477r;

    /* renamed from: s */
    public AbstractC3462h f11478s;

    /* renamed from: t */
    public AbstractC3462h f11479t;

    /* renamed from: u */
    public int f11480u;

    /* renamed from: v */
    public final C3460f f11481v;

    /* renamed from: y */
    public BitSet f11484y;

    /* renamed from: q */
    public int f11476q = -1;

    /* renamed from: w */
    public boolean f11482w = false;

    /* renamed from: x */
    public boolean f11483x = false;

    /* renamed from: z */
    public int f11485z = -1;

    /* renamed from: A */
    public int f11465A = Integer.MIN_VALUE;

    /* renamed from: B */
    public C3452d f11466B = new C3452d();

    /* renamed from: C */
    public int f11467C = 2;

    /* renamed from: G */
    public final Rect f11471G = new Rect();

    /* renamed from: H */
    public final C3450b f11472H = new C3450b();

    /* renamed from: I */
    public boolean f11473I = false;

    /* renamed from: J */
    public boolean f11474J = true;

    /* renamed from: K */
    public final Runnable f11475K = new RunnableC3449a();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC3449a implements Runnable {
        public RunnableC3449a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m13791F0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C3450b {

        /* renamed from: a */
        public int f11487a;

        /* renamed from: b */
        public int f11488b;

        /* renamed from: c */
        public boolean f11489c;

        /* renamed from: d */
        public boolean f11490d;

        /* renamed from: e */
        public boolean f11491e;

        /* renamed from: f */
        public int[] f11492f;

        public C3450b() {
            m13806a();
        }

        /* renamed from: a */
        public void m13806a() {
            this.f11487a = -1;
            this.f11488b = Integer.MIN_VALUE;
            this.f11489c = false;
            this.f11490d = false;
            this.f11491e = false;
            int[] iArr = this.f11492f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C3451c extends RecyclerView.C3437o {

        /* renamed from: d */
        public C3454f f11494d;

        /* renamed from: e */
        public boolean f11495e;

        public C3451c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C3451c(int i7, int i8) {
            super(i7, i8);
        }

        public C3451c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C3451c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C3452d {

        /* renamed from: a */
        public int[] f11496a;

        /* renamed from: b */
        public List f11497b;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C7212a();

            /* renamed from: a */
            public int f11498a;

            /* renamed from: b */
            public int f11499b;

            /* renamed from: c */
            public int[] f11500c;

            /* renamed from: d */
            public boolean f11501d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C7212a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            public a(Parcel parcel) {
                this.f11498a = parcel.readInt();
                this.f11499b = parcel.readInt();
                this.f11501d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f11500c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int m13819a(int i7) {
                int[] iArr = this.f11500c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i7];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f11498a + ", mGapDir=" + this.f11499b + ", mHasUnwantedGapAfter=" + this.f11501d + ", mGapPerSpan=" + Arrays.toString(this.f11500c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f11498a);
                parcel.writeInt(this.f11499b);
                parcel.writeInt(this.f11501d ? 1 : 0);
                int[] iArr = this.f11500c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f11500c);
                }
            }
        }

        /* renamed from: a */
        public void m13807a() {
            int[] iArr = this.f11496a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11497b = null;
        }

        /* renamed from: b */
        public void m13808b(int i7) {
            int[] iArr = this.f11496a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i7, 10) + 1];
                this.f11496a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[m13818l(i7)];
                this.f11496a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f11496a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public int m13809c(int i7) {
            List list = this.f11497b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f11497b.get(size)).f11498a >= i7) {
                        this.f11497b.remove(size);
                    }
                }
            }
            return m13812f(i7);
        }

        /* renamed from: d */
        public a m13810d(int i7, int i8, int i9, boolean z6) {
            List list = this.f11497b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f11497b.get(i10);
                int i11 = aVar.f11498a;
                if (i11 >= i8) {
                    return null;
                }
                if (i11 >= i7 && (i9 == 0 || aVar.f11499b == i9 || (z6 && aVar.f11501d))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: e */
        public a m13811e(int i7) {
            List list = this.f11497b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11497b.get(size);
                if (aVar.f11498a == i7) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public int m13812f(int i7) {
            int[] iArr = this.f11496a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            int m13813g = m13813g(i7);
            if (m13813g == -1) {
                int[] iArr2 = this.f11496a;
                Arrays.fill(iArr2, i7, iArr2.length, -1);
                return this.f11496a.length;
            }
            int i8 = m13813g + 1;
            Arrays.fill(this.f11496a, i7, i8, -1);
            return i8;
        }

        /* renamed from: g */
        public final int m13813g(int i7) {
            if (this.f11497b == null) {
                return -1;
            }
            a m13811e = m13811e(i7);
            if (m13811e != null) {
                this.f11497b.remove(m13811e);
            }
            int size = this.f11497b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                }
                if (((a) this.f11497b.get(i8)).f11498a >= i7) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return -1;
            }
            a aVar = (a) this.f11497b.get(i8);
            this.f11497b.remove(i8);
            return aVar.f11498a;
        }

        /* renamed from: h */
        public void m13814h(int i7, int i8) {
            int[] iArr = this.f11496a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            m13808b(i9);
            int[] iArr2 = this.f11496a;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill(this.f11496a, i7, i9, -1);
            m13816j(i7, i8);
        }

        /* renamed from: i */
        public void m13815i(int i7, int i8) {
            int[] iArr = this.f11496a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            m13808b(i9);
            int[] iArr2 = this.f11496a;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = this.f11496a;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            m13817k(i7, i8);
        }

        /* renamed from: j */
        public final void m13816j(int i7, int i8) {
            List list = this.f11497b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11497b.get(size);
                int i9 = aVar.f11498a;
                if (i9 >= i7) {
                    aVar.f11498a = i9 + i8;
                }
            }
        }

        /* renamed from: k */
        public final void m13817k(int i7, int i8) {
            List list = this.f11497b;
            if (list == null) {
                return;
            }
            int i9 = i7 + i8;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f11497b.get(size);
                int i10 = aVar.f11498a;
                if (i10 >= i7) {
                    if (i10 < i9) {
                        this.f11497b.remove(size);
                    } else {
                        aVar.f11498a = i10 - i8;
                    }
                }
            }
        }

        /* renamed from: l */
        public int m13818l(int i7) {
            int length = this.f11496a.length;
            while (length <= i7) {
                length *= 2;
            }
            return length;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C3453e implements Parcelable {
        public static final Parcelable.Creator<C3453e> CREATOR = new a();

        /* renamed from: a */
        public int f11502a;

        /* renamed from: b */
        public int f11503b;

        /* renamed from: c */
        public int f11504c;

        /* renamed from: d */
        public int[] f11505d;

        /* renamed from: e */
        public int f11506e;

        /* renamed from: f */
        public int[] f11507f;

        /* renamed from: n */
        public List f11508n;

        /* renamed from: o */
        public boolean f11509o;

        /* renamed from: p */
        public boolean f11510p;

        /* renamed from: q */
        public boolean f11511q;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3453e createFromParcel(Parcel parcel) {
                return new C3453e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3453e[] newArray(int i7) {
                return new C3453e[i7];
            }
        }

        public C3453e() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f11502a);
            parcel.writeInt(this.f11503b);
            parcel.writeInt(this.f11504c);
            if (this.f11504c > 0) {
                parcel.writeIntArray(this.f11505d);
            }
            parcel.writeInt(this.f11506e);
            if (this.f11506e > 0) {
                parcel.writeIntArray(this.f11507f);
            }
            parcel.writeInt(this.f11509o ? 1 : 0);
            parcel.writeInt(this.f11510p ? 1 : 0);
            parcel.writeInt(this.f11511q ? 1 : 0);
            parcel.writeList(this.f11508n);
        }

        public C3453e(Parcel parcel) {
            this.f11502a = parcel.readInt();
            this.f11503b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f11504c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f11505d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f11506e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f11507f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f11509o = parcel.readInt() == 1;
            this.f11510p = parcel.readInt() == 1;
            this.f11511q = parcel.readInt() == 1;
            this.f11508n = parcel.readArrayList(C3452d.a.class.getClassLoader());
        }

        public C3453e(C3453e c3453e) {
            this.f11504c = c3453e.f11504c;
            this.f11502a = c3453e.f11502a;
            this.f11503b = c3453e.f11503b;
            this.f11505d = c3453e.f11505d;
            this.f11506e = c3453e.f11506e;
            this.f11507f = c3453e.f11507f;
            this.f11509o = c3453e.f11509o;
            this.f11510p = c3453e.f11510p;
            this.f11511q = c3453e.f11511q;
            this.f11508n = c3453e.f11508n;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C3454f {

        /* renamed from: a */
        public ArrayList f11512a = new ArrayList();

        /* renamed from: b */
        public int f11513b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f11514c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f11515d = 0;

        /* renamed from: e */
        public final int f11516e;

        public C3454f(int i7) {
            this.f11516e = i7;
        }

        /* renamed from: a */
        public void m13824a() {
            C3452d.a m13811e;
            ArrayList arrayList = this.f11512a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C3451c m13829f = m13829f(view);
            this.f11514c = StaggeredGridLayoutManager.this.f11478s.mo13920d(view);
            if (m13829f.f11495e && (m13811e = StaggeredGridLayoutManager.this.f11466B.m13811e(m13829f.m13741a())) != null && m13811e.f11499b == 1) {
                this.f11514c += m13811e.m13819a(this.f11516e);
            }
        }

        /* renamed from: b */
        public void m13825b() {
            C3452d.a m13811e;
            View view = (View) this.f11512a.get(0);
            C3451c m13829f = m13829f(view);
            this.f11513b = StaggeredGridLayoutManager.this.f11478s.mo13921e(view);
            if (m13829f.f11495e && (m13811e = StaggeredGridLayoutManager.this.f11466B.m13811e(m13829f.m13741a())) != null && m13811e.f11499b == -1) {
                this.f11513b -= m13811e.m13819a(this.f11516e);
            }
        }

        /* renamed from: c */
        public void m13826c() {
            this.f11512a.clear();
            m13832i();
            this.f11515d = 0;
        }

        /* renamed from: d */
        public int m13827d() {
            int i7 = this.f11514c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            m13824a();
            return this.f11514c;
        }

        /* renamed from: e */
        public int m13828e(int i7) {
            int i8 = this.f11514c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f11512a.size() == 0) {
                return i7;
            }
            m13824a();
            return this.f11514c;
        }

        /* renamed from: f */
        public C3451c m13829f(View view) {
            return (C3451c) view.getLayoutParams();
        }

        /* renamed from: g */
        public int m13830g() {
            int i7 = this.f11513b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            m13825b();
            return this.f11513b;
        }

        /* renamed from: h */
        public int m13831h(int i7) {
            int i8 = this.f11513b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f11512a.size() == 0) {
                return i7;
            }
            m13825b();
            return this.f11513b;
        }

        /* renamed from: i */
        public void m13832i() {
            this.f11513b = Integer.MIN_VALUE;
            this.f11514c = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        RecyclerView.AbstractC3436n.c m13679J = RecyclerView.AbstractC3436n.m13679J(context, attributeSet, i7, i8);
        m13803U0(m13679J.f11426a);
        m13805W0(m13679J.f11427b);
        m13804V0(m13679J.f11428c);
        this.f11481v = new C3460f();
        m13793K0();
    }

    /* renamed from: H0 */
    private int m13788H0(RecyclerView.C3446x c3446x) {
        if (m13723t() == 0) {
            return 0;
        }
        return AbstractC3464j.m13926a(c3446x, this.f11478s, m13795M0(!this.f11474J), m13794L0(!this.f11474J), this, this.f11474J);
    }

    /* renamed from: I0 */
    private int m13789I0(RecyclerView.C3446x c3446x) {
        if (m13723t() == 0) {
            return 0;
        }
        return AbstractC3464j.m13927b(c3446x, this.f11478s, m13795M0(!this.f11474J), m13794L0(!this.f11474J), this, this.f11474J, this.f11483x);
    }

    /* renamed from: J0 */
    private int m13790J0(RecyclerView.C3446x c3446x) {
        if (m13723t() == 0) {
            return 0;
        }
        return AbstractC3464j.m13928c(c3446x, this.f11478s, m13795M0(!this.f11474J), m13794L0(!this.f11474J), this, this.f11474J);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: E0 */
    public boolean mo13520E0() {
        return this.f11470F == null;
    }

    /* renamed from: F0 */
    public boolean m13791F0() {
        int m13797O0;
        int m13798P0;
        if (m13723t() == 0 || this.f11467C == 0 || !m13698P()) {
            return false;
        }
        if (this.f11483x) {
            m13797O0 = m13798P0();
            m13798P0 = m13797O0();
        } else {
            m13797O0 = m13797O0();
            m13798P0 = m13798P0();
        }
        if (m13797O0 == 0 && m13800R0() != null) {
            this.f11466B.m13807a();
            m13684B0();
            m13682A0();
            return true;
        }
        if (!this.f11473I) {
            return false;
        }
        int i7 = this.f11483x ? -1 : 1;
        int i8 = m13798P0 + 1;
        C3452d.a m13810d = this.f11466B.m13810d(m13797O0, i8, i7, true);
        if (m13810d == null) {
            this.f11473I = false;
            this.f11466B.m13809c(i8);
            return false;
        }
        C3452d.a m13810d2 = this.f11466B.m13810d(m13797O0, m13810d.f11498a, i7 * (-1), true);
        if (m13810d2 == null) {
            this.f11466B.m13809c(m13810d.f11498a);
        } else {
            this.f11466B.m13809c(m13810d2.f11498a + 1);
        }
        m13684B0();
        m13682A0();
        return true;
    }

    /* renamed from: G0 */
    public final boolean m13792G0(C3454f c3454f) {
        if (this.f11483x) {
            if (c3454f.m13827d() < this.f11478s.mo13922f()) {
                ArrayList arrayList = c3454f.f11512a;
                return !c3454f.m13829f((View) arrayList.get(arrayList.size() - 1)).f11495e;
            }
        } else if (c3454f.m13830g() > this.f11478s.mo13923g()) {
            return !c3454f.m13829f((View) c3454f.f11512a.get(0)).f11495e;
        }
        return false;
    }

    /* renamed from: K0 */
    public final void m13793K0() {
        this.f11478s = AbstractC3462h.m13918b(this, this.f11480u);
        this.f11479t = AbstractC3462h.m13918b(this, 1 - this.f11480u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: L */
    public int mo13521L(RecyclerView.C3442t c3442t, RecyclerView.C3446x c3446x) {
        return this.f11480u == 0 ? this.f11476q : super.mo13521L(c3442t, c3446x);
    }

    /* renamed from: L0 */
    public View m13794L0(boolean z6) {
        int mo13923g = this.f11478s.mo13923g();
        int mo13922f = this.f11478s.mo13922f();
        View view = null;
        for (int m13723t = m13723t() - 1; m13723t >= 0; m13723t--) {
            View m13721s = m13721s(m13723t);
            int mo13921e = this.f11478s.mo13921e(m13721s);
            int mo13920d = this.f11478s.mo13920d(m13721s);
            if (mo13920d > mo13923g && mo13921e < mo13922f) {
                if (mo13920d <= mo13922f || !z6) {
                    return m13721s;
                }
                if (view == null) {
                    view = m13721s;
                }
            }
        }
        return view;
    }

    /* renamed from: M0 */
    public View m13795M0(boolean z6) {
        int mo13923g = this.f11478s.mo13923g();
        int mo13922f = this.f11478s.mo13922f();
        int m13723t = m13723t();
        View view = null;
        for (int i7 = 0; i7 < m13723t; i7++) {
            View m13721s = m13721s(i7);
            int mo13921e = this.f11478s.mo13921e(m13721s);
            if (this.f11478s.mo13920d(m13721s) > mo13923g && mo13921e < mo13922f) {
                if (mo13921e >= mo13923g || !z6) {
                    return m13721s;
                }
                if (view == null) {
                    view = m13721s;
                }
            }
        }
        return view;
    }

    /* renamed from: N0 */
    public int m13796N0() {
        View m13794L0 = this.f11483x ? m13794L0(true) : m13795M0(true);
        if (m13794L0 == null) {
            return -1;
        }
        return m13693I(m13794L0);
    }

    /* renamed from: O0 */
    public int m13797O0() {
        if (m13723t() == 0) {
            return 0;
        }
        return m13693I(m13721s(0));
    }

    /* renamed from: P0 */
    public int m13798P0() {
        int m13723t = m13723t();
        if (m13723t == 0) {
            return 0;
        }
        return m13693I(m13721s(m13723t - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: Q */
    public boolean mo13549Q() {
        return this.f11467C != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13799Q0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f11483x
            if (r0 == 0) goto L9
            int r0 = r6.m13798P0()
            goto Ld
        L9:
            int r0 = r6.m13797O0()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f11466B
            r4.m13812f(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f11466B
            r9.m13815i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f11466B
            r7.m13814h(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f11466B
            r9.m13815i(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f11466B
            r9.m13814h(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f11483x
            if (r7 == 0) goto L4e
            int r7 = r6.m13797O0()
            goto L52
        L4e:
            int r7 = r6.m13798P0()
        L52:
            if (r3 > r7) goto L57
            r6.m13682A0()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m13799Q0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m13800R0() {
        /*
            r12 = this;
            int r0 = r12.m13723t()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f11476q
            r2.<init>(r3)
            int r3 = r12.f11476q
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f11480u
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.m13802T0()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f11483x
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.m13721s(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C3451c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f11494d
            int r9 = r9.f11516e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f11494d
            boolean r9 = r12.m13792G0(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f11494d
            int r9 = r9.f11516e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f11495e
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.m13721s(r9)
            boolean r10 = r12.f11483x
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.h r10 = r12.f11478s
            int r10 = r10.mo13920d(r7)
            androidx.recyclerview.widget.h r11 = r12.f11478s
            int r11 = r11.mo13920d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.h r10 = r12.f11478s
            int r10 = r10.mo13921e(r7)
            androidx.recyclerview.widget.h r11 = r12.f11478s
            int r11 = r11.mo13921e(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C3451c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f11494d
            int r8 = r8.f11516e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f11494d
            int r9 = r9.f11516e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m13800R0():android.view.View");
    }

    /* renamed from: S0 */
    public void m13801S0() {
        this.f11466B.m13807a();
        m13682A0();
    }

    /* renamed from: T0 */
    public boolean m13802T0() {
        return m13685C() == 1;
    }

    /* renamed from: U0 */
    public void m13803U0(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo13555a(null);
        if (i7 == this.f11480u) {
            return;
        }
        this.f11480u = i7;
        AbstractC3462h abstractC3462h = this.f11478s;
        this.f11478s = this.f11479t;
        this.f11479t = abstractC3462h;
        m13682A0();
    }

    /* renamed from: V0 */
    public void m13804V0(boolean z6) {
        mo13555a(null);
        C3453e c3453e = this.f11470F;
        if (c3453e != null && c3453e.f11509o != z6) {
            c3453e.f11509o = z6;
        }
        this.f11482w = z6;
        m13682A0();
    }

    /* renamed from: W0 */
    public void m13805W0(int i7) {
        mo13555a(null);
        if (i7 != this.f11476q) {
            m13801S0();
            this.f11476q = i7;
            this.f11484y = new BitSet(this.f11476q);
            this.f11477r = new C3454f[this.f11476q];
            for (int i8 = 0; i8 < this.f11476q; i8++) {
                this.f11477r[i8] = new C3454f(i8);
            }
            m13682A0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: Y */
    public void mo13553Y(RecyclerView recyclerView, RecyclerView.C3442t c3442t) {
        super.mo13553Y(recyclerView, c3442t);
        m13731x0(this.f11475K);
        for (int i7 = 0; i7 < this.f11476q; i7++) {
            this.f11477r[i7].m13826c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: Z */
    public void mo13554Z(AccessibilityEvent accessibilityEvent) {
        super.mo13554Z(accessibilityEvent);
        if (m13723t() > 0) {
            View m13795M0 = m13795M0(false);
            View m13794L0 = m13794L0(false);
            if (m13795M0 == null || m13794L0 == null) {
                return;
            }
            int m13693I = m13693I(m13795M0);
            int m13693I2 = m13693I(m13794L0);
            if (m13693I < m13693I2) {
                accessibilityEvent.setFromIndex(m13693I);
                accessibilityEvent.setToIndex(m13693I2);
            } else {
                accessibilityEvent.setFromIndex(m13693I2);
                accessibilityEvent.setToIndex(m13693I);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: a */
    public void mo13555a(String str) {
        if (this.f11470F == null) {
            super.mo13555a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: b */
    public boolean mo13556b() {
        return this.f11480u == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: c */
    public boolean mo13557c() {
        return this.f11480u == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: d */
    public boolean mo13525d(RecyclerView.C3437o c3437o) {
        return c3437o instanceof C3451c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: f */
    public int mo13558f(RecyclerView.C3446x c3446x) {
        return m13788H0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: f0 */
    public void mo13526f0(RecyclerView recyclerView, int i7, int i8) {
        m13799Q0(i7, i8, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: g */
    public int mo13559g(RecyclerView.C3446x c3446x) {
        return m13789I0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: g0 */
    public void mo13527g0(RecyclerView recyclerView) {
        this.f11466B.m13807a();
        m13682A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: h */
    public int mo13560h(RecyclerView.C3446x c3446x) {
        return m13790J0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: h0 */
    public void mo13528h0(RecyclerView recyclerView, int i7, int i8, int i9) {
        m13799Q0(i7, i8, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: i */
    public int mo13561i(RecyclerView.C3446x c3446x) {
        return m13788H0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: i0 */
    public void mo13529i0(RecyclerView recyclerView, int i7, int i8) {
        m13799Q0(i7, i8, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: j */
    public int mo13562j(RecyclerView.C3446x c3446x) {
        return m13789I0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: k */
    public int mo13563k(RecyclerView.C3446x c3446x) {
        return m13790J0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: k0 */
    public void mo13530k0(RecyclerView recyclerView, int i7, int i8, Object obj) {
        m13799Q0(i7, i8, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: n */
    public RecyclerView.C3437o mo13531n() {
        return this.f11480u == 0 ? new C3451c(-2, -1) : new C3451c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: o */
    public RecyclerView.C3437o mo13532o(Context context, AttributeSet attributeSet) {
        return new C3451c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: o0 */
    public void mo13564o0(Parcelable parcelable) {
        if (parcelable instanceof C3453e) {
            this.f11470F = (C3453e) parcelable;
            m13682A0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: p */
    public RecyclerView.C3437o mo13533p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3451c((ViewGroup.MarginLayoutParams) layoutParams) : new C3451c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: p0 */
    public Parcelable mo13565p0() {
        int m13831h;
        int mo13923g;
        int[] iArr;
        if (this.f11470F != null) {
            return new C3453e(this.f11470F);
        }
        C3453e c3453e = new C3453e();
        c3453e.f11509o = this.f11482w;
        c3453e.f11510p = this.f11468D;
        c3453e.f11511q = this.f11469E;
        C3452d c3452d = this.f11466B;
        if (c3452d == null || (iArr = c3452d.f11496a) == null) {
            c3453e.f11506e = 0;
        } else {
            c3453e.f11507f = iArr;
            c3453e.f11506e = iArr.length;
            c3453e.f11508n = c3452d.f11497b;
        }
        if (m13723t() > 0) {
            c3453e.f11502a = this.f11468D ? m13798P0() : m13797O0();
            c3453e.f11503b = m13796N0();
            int i7 = this.f11476q;
            c3453e.f11504c = i7;
            c3453e.f11505d = new int[i7];
            for (int i8 = 0; i8 < this.f11476q; i8++) {
                if (this.f11468D) {
                    m13831h = this.f11477r[i8].m13828e(Integer.MIN_VALUE);
                    if (m13831h != Integer.MIN_VALUE) {
                        mo13923g = this.f11478s.mo13922f();
                        m13831h -= mo13923g;
                        c3453e.f11505d[i8] = m13831h;
                    } else {
                        c3453e.f11505d[i8] = m13831h;
                    }
                } else {
                    m13831h = this.f11477r[i8].m13831h(Integer.MIN_VALUE);
                    if (m13831h != Integer.MIN_VALUE) {
                        mo13923g = this.f11478s.mo13923g();
                        m13831h -= mo13923g;
                        c3453e.f11505d[i8] = m13831h;
                    } else {
                        c3453e.f11505d[i8] = m13831h;
                    }
                }
            }
        } else {
            c3453e.f11502a = -1;
            c3453e.f11503b = -1;
            c3453e.f11504c = 0;
        }
        return c3453e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: q0 */
    public void mo13718q0(int i7) {
        if (i7 == 0) {
            m13791F0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: v */
    public int mo13534v(RecyclerView.C3442t c3442t, RecyclerView.C3446x c3446x) {
        return this.f11480u == 1 ? this.f11476q : super.mo13534v(c3442t, c3446x);
    }
}
