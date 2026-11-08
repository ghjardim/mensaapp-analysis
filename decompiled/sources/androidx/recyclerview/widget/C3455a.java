package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C3461g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p042G.C0342d;
import p042G.InterfaceC0341c;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public class C3455a implements C3461g.a {

    /* renamed from: a */
    public InterfaceC0341c f11518a;

    /* renamed from: b */
    public final ArrayList f11519b;

    /* renamed from: c */
    public final ArrayList f11520c;

    /* renamed from: d */
    public final a f11521d;

    /* renamed from: e */
    public Runnable f11522e;

    /* renamed from: f */
    public final boolean f11523f;

    /* renamed from: g */
    public final C3461g f11524g;

    /* renamed from: h */
    public int f11525h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
        /* renamed from: a */
        void mo13655a(int i7, int i8);

        /* renamed from: b */
        void mo13656b(b bVar);

        /* renamed from: c */
        void mo13657c(int i7, int i8, Object obj);

        /* renamed from: d */
        void mo13658d(b bVar);

        /* renamed from: e */
        RecyclerView.AbstractC3422A mo13659e(int i7);

        /* renamed from: f */
        void mo13660f(int i7, int i8);

        /* renamed from: g */
        void mo13661g(int i7, int i8);

        /* renamed from: h */
        void mo13662h(int i7, int i8);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static class b {

        /* renamed from: a */
        public int f11526a;

        /* renamed from: b */
        public int f11527b;

        /* renamed from: c */
        public Object f11528c;

        /* renamed from: d */
        public int f11529d;

        public b(int i7, int i8, int i9, Object obj) {
            this.f11526a = i7;
            this.f11527b = i8;
            this.f11529d = i9;
            this.f11528c = obj;
        }

        /* renamed from: a */
        public String m13853a() {
            int i7 = this.f11526a;
            return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i7 = this.f11526a;
            if (i7 != bVar.f11526a) {
                return false;
            }
            if (i7 == 8 && Math.abs(this.f11529d - this.f11527b) == 1 && this.f11529d == bVar.f11527b && this.f11527b == bVar.f11529d) {
                return true;
            }
            if (this.f11529d != bVar.f11529d || this.f11527b != bVar.f11527b) {
                return false;
            }
            Object obj2 = this.f11528c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f11528c)) {
                    return false;
                }
            } else if (bVar.f11528c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f11526a * 31) + this.f11527b) * 31) + this.f11529d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m13853a() + ",s:" + this.f11527b + "c:" + this.f11529d + ",p:" + this.f11528c + "]";
        }
    }

    public C3455a(a aVar) {
        this(aVar, false);
    }

    @Override // androidx.recyclerview.widget.C3461g.a
    /* renamed from: a */
    public void mo13833a(b bVar) {
        if (this.f11523f) {
            return;
        }
        bVar.f11528c = null;
        this.f11518a.mo1348a(bVar);
    }

    @Override // androidx.recyclerview.widget.C3461g.a
    /* renamed from: b */
    public b mo13834b(int i7, int i8, int i9, Object obj) {
        b bVar = (b) this.f11518a.mo1349b();
        if (bVar == null) {
            return new b(i7, i8, i9, obj);
        }
        bVar.f11526a = i7;
        bVar.f11527b = i8;
        bVar.f11529d = i9;
        bVar.f11528c = obj;
        return bVar;
    }

    /* renamed from: c */
    public final void m13835c(b bVar) {
        m13848p(bVar);
    }

    /* renamed from: d */
    public final void m13836d(b bVar) {
        m13848p(bVar);
    }

    /* renamed from: e */
    public final void m13837e(b bVar) {
        boolean z6;
        char c7;
        int i7 = bVar.f11527b;
        int i8 = bVar.f11529d + i7;
        char c8 = 65535;
        int i9 = i7;
        int i10 = 0;
        while (i9 < i8) {
            this.f11521d.mo13659e(i9);
            if (m13839g(i9)) {
                if (c8 == 0) {
                    m13842j(mo13834b(2, i7, i10, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c7 = 1;
            } else {
                if (c8 == 1) {
                    m13848p(mo13834b(2, i7, i10, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                c7 = 0;
            }
            if (z6) {
                i9 -= i10;
                i8 -= i10;
                i10 = 1;
            } else {
                i10++;
            }
            i9++;
            c8 = c7;
        }
        if (i10 != bVar.f11529d) {
            mo13833a(bVar);
            bVar = mo13834b(2, i7, i10, null);
        }
        if (c8 == 0) {
            m13842j(bVar);
        } else {
            m13848p(bVar);
        }
    }

    /* renamed from: f */
    public final void m13838f(b bVar) {
        int i7 = bVar.f11527b;
        int i8 = bVar.f11529d + i7;
        int i9 = 0;
        boolean z6 = -1;
        int i10 = i7;
        while (i7 < i8) {
            this.f11521d.mo13659e(i7);
            if (m13839g(i7)) {
                if (!z6) {
                    m13842j(mo13834b(4, i10, i9, bVar.f11528c));
                    i10 = i7;
                    i9 = 0;
                }
                z6 = true;
            } else {
                if (z6) {
                    m13848p(mo13834b(4, i10, i9, bVar.f11528c));
                    i10 = i7;
                    i9 = 0;
                }
                z6 = false;
            }
            i9++;
            i7++;
        }
        if (i9 != bVar.f11529d) {
            Object obj = bVar.f11528c;
            mo13833a(bVar);
            bVar = mo13834b(4, i10, i9, obj);
        }
        if (z6) {
            m13848p(bVar);
        } else {
            m13842j(bVar);
        }
    }

    /* renamed from: g */
    public final boolean m13839g(int i7) {
        int size = this.f11520c.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) this.f11520c.get(i8);
            int i9 = bVar.f11526a;
            if (i9 == 8) {
                if (m13845m(bVar.f11529d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = bVar.f11527b;
                int i11 = bVar.f11529d + i10;
                while (i10 < i11) {
                    if (m13845m(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void m13840h() {
        int size = this.f11520c.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f11521d.mo13658d((b) this.f11520c.get(i7));
        }
        m13850r(this.f11520c);
        this.f11525h = 0;
    }

    /* renamed from: i */
    public void m13841i() {
        m13840h();
        int size = this.f11519b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f11519b.get(i7);
            int i8 = bVar.f11526a;
            if (i8 == 1) {
                this.f11521d.mo13658d(bVar);
                this.f11521d.mo13661g(bVar.f11527b, bVar.f11529d);
            } else if (i8 == 2) {
                this.f11521d.mo13658d(bVar);
                this.f11521d.mo13662h(bVar.f11527b, bVar.f11529d);
            } else if (i8 == 4) {
                this.f11521d.mo13658d(bVar);
                this.f11521d.mo13657c(bVar.f11527b, bVar.f11529d, bVar.f11528c);
            } else if (i8 == 8) {
                this.f11521d.mo13658d(bVar);
                this.f11521d.mo13655a(bVar.f11527b, bVar.f11529d);
            }
            Runnable runnable = this.f11522e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m13850r(this.f11519b);
        this.f11525h = 0;
    }

    /* renamed from: j */
    public final void m13842j(b bVar) {
        int i7;
        int i8 = bVar.f11526a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m13852t = m13852t(bVar.f11527b, i8);
        int i9 = bVar.f11527b;
        int i10 = bVar.f11526a;
        if (i10 == 2) {
            i7 = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i7 = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bVar.f11529d; i12++) {
            int m13852t2 = m13852t(bVar.f11527b + (i7 * i12), bVar.f11526a);
            int i13 = bVar.f11526a;
            if (i13 == 2 ? m13852t2 != m13852t : !(i13 == 4 && m13852t2 == m13852t + 1)) {
                b mo13834b = mo13834b(i13, m13852t, i11, bVar.f11528c);
                m13843k(mo13834b, i9);
                mo13833a(mo13834b);
                if (bVar.f11526a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                m13852t = m13852t2;
            } else {
                i11++;
            }
        }
        Object obj = bVar.f11528c;
        mo13833a(bVar);
        if (i11 > 0) {
            b mo13834b2 = mo13834b(bVar.f11526a, m13852t, i11, obj);
            m13843k(mo13834b2, i9);
            mo13833a(mo13834b2);
        }
    }

    /* renamed from: k */
    public void m13843k(b bVar, int i7) {
        this.f11521d.mo13656b(bVar);
        int i8 = bVar.f11526a;
        if (i8 == 2) {
            this.f11521d.mo13662h(i7, bVar.f11529d);
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f11521d.mo13657c(i7, bVar.f11529d, bVar.f11528c);
        }
    }

    /* renamed from: l */
    public int m13844l(int i7) {
        return m13845m(i7, 0);
    }

    /* renamed from: m */
    public int m13845m(int i7, int i8) {
        int size = this.f11520c.size();
        while (i8 < size) {
            b bVar = (b) this.f11520c.get(i8);
            int i9 = bVar.f11526a;
            if (i9 == 8) {
                int i10 = bVar.f11527b;
                if (i10 == i7) {
                    i7 = bVar.f11529d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (bVar.f11529d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = bVar.f11527b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = bVar.f11529d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += bVar.f11529d;
                }
            }
            i8++;
        }
        return i7;
    }

    /* renamed from: n */
    public boolean m13846n(int i7) {
        return (i7 & this.f11525h) != 0;
    }

    /* renamed from: o */
    public boolean m13847o() {
        return this.f11519b.size() > 0;
    }

    /* renamed from: p */
    public final void m13848p(b bVar) {
        this.f11520c.add(bVar);
        int i7 = bVar.f11526a;
        if (i7 == 1) {
            this.f11521d.mo13661g(bVar.f11527b, bVar.f11529d);
            return;
        }
        if (i7 == 2) {
            this.f11521d.mo13660f(bVar.f11527b, bVar.f11529d);
            return;
        }
        if (i7 == 4) {
            this.f11521d.mo13657c(bVar.f11527b, bVar.f11529d, bVar.f11528c);
        } else {
            if (i7 == 8) {
                this.f11521d.mo13655a(bVar.f11527b, bVar.f11529d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: q */
    public void m13849q() {
        this.f11524g.m13912b(this.f11519b);
        int size = this.f11519b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) this.f11519b.get(i7);
            int i8 = bVar.f11526a;
            if (i8 == 1) {
                m13835c(bVar);
            } else if (i8 == 2) {
                m13837e(bVar);
            } else if (i8 == 4) {
                m13838f(bVar);
            } else if (i8 == 8) {
                m13836d(bVar);
            }
            Runnable runnable = this.f11522e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f11519b.clear();
    }

    /* renamed from: r */
    public void m13850r(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            mo13833a((b) list.get(i7));
        }
        list.clear();
    }

    /* renamed from: s */
    public void m13851s() {
        m13850r(this.f11519b);
        m13850r(this.f11520c);
        this.f11525h = 0;
    }

    /* renamed from: t */
    public final int m13852t(int i7, int i8) {
        int i9;
        int i10;
        for (int size = this.f11520c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f11520c.get(size);
            int i11 = bVar.f11526a;
            if (i11 == 8) {
                int i12 = bVar.f11527b;
                int i13 = bVar.f11529d;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i7 < i10 || i7 > i9) {
                    if (i7 < i12) {
                        if (i8 == 1) {
                            bVar.f11527b = i12 + 1;
                            bVar.f11529d = i13 + 1;
                        } else if (i8 == 2) {
                            bVar.f11527b = i12 - 1;
                            bVar.f11529d = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i8 == 1) {
                        bVar.f11529d = i13 + 1;
                    } else if (i8 == 2) {
                        bVar.f11529d = i13 - 1;
                    }
                    i7++;
                } else {
                    if (i8 == 1) {
                        bVar.f11527b = i12 + 1;
                    } else if (i8 == 2) {
                        bVar.f11527b = i12 - 1;
                    }
                    i7--;
                }
            } else {
                int i14 = bVar.f11527b;
                if (i14 <= i7) {
                    if (i11 == 1) {
                        i7 -= bVar.f11529d;
                    } else if (i11 == 2) {
                        i7 += bVar.f11529d;
                    }
                } else if (i8 == 1) {
                    bVar.f11527b = i14 + 1;
                } else if (i8 == 2) {
                    bVar.f11527b = i14 - 1;
                }
            }
        }
        for (int size2 = this.f11520c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f11520c.get(size2);
            if (bVar2.f11526a == 8) {
                int i15 = bVar2.f11529d;
                if (i15 == bVar2.f11527b || i15 < 0) {
                    this.f11520c.remove(size2);
                    mo13833a(bVar2);
                }
            } else if (bVar2.f11529d <= 0) {
                this.f11520c.remove(size2);
                mo13833a(bVar2);
            }
        }
        return i7;
    }

    public C3455a(a aVar, boolean z6) {
        this.f11518a = new C0342d(30);
        this.f11519b = new ArrayList();
        this.f11520c = new ArrayList();
        this.f11525h = 0;
        this.f11521d = aVar;
        this.f11523f = z6;
        this.f11524g = new C3461g(this);
    }
}
