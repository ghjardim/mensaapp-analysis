package p334s;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p342t.AbstractC6404a;
import p378x5.AbstractC7019j;

/* renamed from: s.l */
/* loaded from: classes.dex */
public class C6319l implements Cloneable {

    /* renamed from: a */
    public /* synthetic */ boolean f22881a;

    /* renamed from: b */
    public /* synthetic */ int[] f22882b;

    /* renamed from: c */
    public /* synthetic */ Object[] f22883c;

    /* renamed from: d */
    public /* synthetic */ int f22884d;

    public C6319l() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public void m26460a(int i7, Object obj) {
        int i8 = this.f22884d;
        if (i8 != 0 && i7 <= this.f22882b[i8 - 1]) {
            m26466g(i7, obj);
            return;
        }
        if (this.f22881a && i8 >= this.f22882b.length) {
            AbstractC6320m.m26473e(this);
        }
        int i9 = this.f22884d;
        if (i9 >= this.f22882b.length) {
            int m26750e = AbstractC6404a.m26750e(i9 + 1);
            int[] copyOf = Arrays.copyOf(this.f22882b, m26750e);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
            this.f22882b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22883c, m26750e);
            AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
            this.f22883c = copyOf2;
        }
        this.f22882b[i9] = i7;
        this.f22883c[i9] = obj;
        this.f22884d = i9 + 1;
    }

    /* renamed from: b */
    public void m26461b() {
        int i7 = this.f22884d;
        Object[] objArr = this.f22883c;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f22884d = 0;
        this.f22881a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6319l clone() {
        Object clone = super.clone();
        AbstractC5469l.m23026c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C6319l c6319l = (C6319l) clone;
        c6319l.f22882b = (int[]) this.f22882b.clone();
        c6319l.f22883c = (Object[]) this.f22883c.clone();
        return c6319l;
    }

    /* renamed from: d */
    public Object m26463d(int i7) {
        return AbstractC6320m.m26471c(this, i7);
    }

    /* renamed from: e */
    public Object m26464e(int i7, Object obj) {
        return AbstractC6320m.m26472d(this, i7, obj);
    }

    /* renamed from: f */
    public int m26465f(int i7) {
        if (this.f22881a) {
            AbstractC6320m.m26473e(this);
        }
        return this.f22882b[i7];
    }

    /* renamed from: g */
    public void m26466g(int i7, Object obj) {
        Object obj2;
        int m26746a = AbstractC6404a.m26746a(this.f22882b, this.f22884d, i7);
        if (m26746a >= 0) {
            this.f22883c[m26746a] = obj;
            return;
        }
        int i8 = ~m26746a;
        if (i8 < this.f22884d) {
            Object obj3 = this.f22883c[i8];
            obj2 = AbstractC6320m.f22885a;
            if (obj3 == obj2) {
                this.f22882b[i8] = i7;
                this.f22883c[i8] = obj;
                return;
            }
        }
        if (this.f22881a && this.f22884d >= this.f22882b.length) {
            AbstractC6320m.m26473e(this);
            i8 = ~AbstractC6404a.m26746a(this.f22882b, this.f22884d, i7);
        }
        int i9 = this.f22884d;
        if (i9 >= this.f22882b.length) {
            int m26750e = AbstractC6404a.m26750e(i9 + 1);
            int[] copyOf = Arrays.copyOf(this.f22882b, m26750e);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
            this.f22882b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22883c, m26750e);
            AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
            this.f22883c = copyOf2;
        }
        int i10 = this.f22884d;
        if (i10 - i8 != 0) {
            int[] iArr = this.f22882b;
            int i11 = i8 + 1;
            AbstractC7019j.m28795e(iArr, iArr, i11, i8, i10);
            Object[] objArr = this.f22883c;
            AbstractC7019j.m28797g(objArr, objArr, i11, i8, this.f22884d);
        }
        this.f22882b[i8] = i7;
        this.f22883c[i8] = obj;
        this.f22884d++;
    }

    /* renamed from: i */
    public int m26467i() {
        if (this.f22881a) {
            AbstractC6320m.m26473e(this);
        }
        return this.f22884d;
    }

    /* renamed from: j */
    public Object m26468j(int i7) {
        if (this.f22881a) {
            AbstractC6320m.m26473e(this);
        }
        return this.f22883c[i7];
    }

    public String toString() {
        if (m26467i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22884d * 28);
        sb.append('{');
        int i7 = this.f22884d;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(m26465f(i8));
            sb.append('=');
            Object m26468j = m26468j(i8);
            if (m26468j != this) {
                sb.append(m26468j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC5469l.m23027d(sb2, "buffer.toString()");
        return sb2;
    }

    public C6319l(int i7) {
        if (i7 == 0) {
            this.f22882b = AbstractC6404a.f23126a;
            this.f22883c = AbstractC6404a.f23128c;
        } else {
            int m26750e = AbstractC6404a.m26750e(i7);
            this.f22882b = new int[m26750e];
            this.f22883c = new Object[m26750e];
        }
    }

    public /* synthetic */ C6319l(int i7, int i8, AbstractC5464g abstractC5464g) {
        this((i8 & 1) != 0 ? 10 : i7);
    }
}
