package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C3456b {

    /* renamed from: a */
    public final b f11530a;

    /* renamed from: b */
    public final a f11531b = new a();

    /* renamed from: c */
    public final List f11532c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    public static class a {

        /* renamed from: a */
        public long f11533a = 0;

        /* renamed from: b */
        public a f11534b;

        /* renamed from: a */
        public void m13865a(int i7) {
            if (i7 < 64) {
                this.f11533a &= ~(1 << i7);
                return;
            }
            a aVar = this.f11534b;
            if (aVar != null) {
                aVar.m13865a(i7 - 64);
            }
        }

        /* renamed from: b */
        public int m13866b(int i7) {
            a aVar = this.f11534b;
            return aVar == null ? i7 >= 64 ? Long.bitCount(this.f11533a) : Long.bitCount(this.f11533a & ((1 << i7) - 1)) : i7 < 64 ? Long.bitCount(this.f11533a & ((1 << i7) - 1)) : aVar.m13866b(i7 - 64) + Long.bitCount(this.f11533a);
        }

        /* renamed from: c */
        public final void m13867c() {
            if (this.f11534b == null) {
                this.f11534b = new a();
            }
        }

        /* renamed from: d */
        public boolean m13868d(int i7) {
            if (i7 < 64) {
                return (this.f11533a & (1 << i7)) != 0;
            }
            m13867c();
            return this.f11534b.m13868d(i7 - 64);
        }

        /* renamed from: e */
        public boolean m13869e(int i7) {
            if (i7 >= 64) {
                m13867c();
                return this.f11534b.m13869e(i7 - 64);
            }
            long j7 = 1 << i7;
            long j8 = this.f11533a;
            boolean z6 = (j8 & j7) != 0;
            long j9 = j8 & (~j7);
            this.f11533a = j9;
            long j10 = j7 - 1;
            this.f11533a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
            a aVar = this.f11534b;
            if (aVar != null) {
                if (aVar.m13868d(0)) {
                    m13871g(63);
                }
                this.f11534b.m13869e(0);
            }
            return z6;
        }

        /* renamed from: f */
        public void m13870f() {
            this.f11533a = 0L;
            a aVar = this.f11534b;
            if (aVar != null) {
                aVar.m13870f();
            }
        }

        /* renamed from: g */
        public void m13871g(int i7) {
            if (i7 < 64) {
                this.f11533a |= 1 << i7;
            } else {
                m13867c();
                this.f11534b.m13871g(i7 - 64);
            }
        }

        public String toString() {
            if (this.f11534b == null) {
                return Long.toBinaryString(this.f11533a);
            }
            return this.f11534b.toString() + "xx" + Long.toBinaryString(this.f11533a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    public interface b {
        /* renamed from: a */
        View mo13648a(int i7);

        /* renamed from: b */
        int mo13649b();

        /* renamed from: c */
        void mo13650c();

        /* renamed from: d */
        int mo13651d(View view);

        /* renamed from: e */
        RecyclerView.AbstractC3422A mo13652e(View view);

        /* renamed from: f */
        void mo13653f(int i7);

        /* renamed from: g */
        void mo13654g(View view);
    }

    public C3456b(b bVar) {
        this.f11530a = bVar;
    }

    /* renamed from: a */
    public void m13854a(int i7) {
        int m13858e = m13858e(i7);
        this.f11531b.m13869e(m13858e);
        this.f11530a.mo13653f(m13858e);
    }

    /* renamed from: b */
    public View m13855b(int i7) {
        if (this.f11532c.size() <= 0) {
            return null;
        }
        this.f11530a.mo13652e((View) this.f11532c.get(0));
        throw null;
    }

    /* renamed from: c */
    public View m13856c(int i7) {
        return this.f11530a.mo13648a(m13858e(i7));
    }

    /* renamed from: d */
    public int m13857d() {
        return this.f11530a.mo13649b() - this.f11532c.size();
    }

    /* renamed from: e */
    public final int m13858e(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int mo13649b = this.f11530a.mo13649b();
        int i8 = i7;
        while (i8 < mo13649b) {
            int m13866b = i7 - (i8 - this.f11531b.m13866b(i8));
            if (m13866b == 0) {
                while (this.f11531b.m13868d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += m13866b;
        }
        return -1;
    }

    /* renamed from: f */
    public View m13859f(int i7) {
        return this.f11530a.mo13648a(i7);
    }

    /* renamed from: g */
    public int m13860g() {
        return this.f11530a.mo13649b();
    }

    /* renamed from: h */
    public int m13861h(View view) {
        int mo13651d = this.f11530a.mo13651d(view);
        if (mo13651d == -1 || this.f11531b.m13868d(mo13651d)) {
            return -1;
        }
        return mo13651d - this.f11531b.m13866b(mo13651d);
    }

    /* renamed from: i */
    public void m13862i() {
        this.f11531b.m13870f();
        for (int size = this.f11532c.size() - 1; size >= 0; size--) {
            this.f11530a.mo13654g((View) this.f11532c.get(size));
            this.f11532c.remove(size);
        }
        this.f11530a.mo13650c();
    }

    /* renamed from: j */
    public void m13863j(View view) {
        int mo13651d = this.f11530a.mo13651d(view);
        if (mo13651d < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f11531b.m13868d(mo13651d)) {
            this.f11531b.m13865a(mo13651d);
            m13864k(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: k */
    public final boolean m13864k(View view) {
        if (!this.f11532c.remove(view)) {
            return false;
        }
        this.f11530a.mo13654g(view);
        return true;
    }

    public String toString() {
        return this.f11531b.toString() + ", hidden list:" + this.f11532c.size();
    }
}
