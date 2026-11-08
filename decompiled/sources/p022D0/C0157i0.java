package p022D0;

import android.util.SparseArray;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5338g;

/* renamed from: D0.i0 */
/* loaded from: classes.dex */
public final class C0157i0 {

    /* renamed from: c */
    public final InterfaceC5338g f672c;

    /* renamed from: b */
    public final SparseArray f671b = new SparseArray();

    /* renamed from: a */
    public int f670a = -1;

    public C0157i0(InterfaceC5338g interfaceC5338g) {
        this.f672c = interfaceC5338g;
    }

    /* renamed from: a */
    public void m635a(int i7, Object obj) {
        if (this.f670a == -1) {
            AbstractC5332a.m21802g(this.f671b.size() == 0);
            this.f670a = 0;
        }
        if (this.f671b.size() > 0) {
            SparseArray sparseArray = this.f671b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC5332a.m21796a(i7 >= keyAt);
            if (keyAt == i7) {
                InterfaceC5338g interfaceC5338g = this.f672c;
                SparseArray sparseArray2 = this.f671b;
                interfaceC5338g.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f671b.append(i7, obj);
    }

    /* renamed from: b */
    public void m636b() {
        for (int i7 = 0; i7 < this.f671b.size(); i7++) {
            this.f672c.accept(this.f671b.valueAt(i7));
        }
        this.f670a = -1;
        this.f671b.clear();
    }

    /* renamed from: c */
    public void m637c(int i7) {
        for (int size = this.f671b.size() - 1; size >= 0 && i7 < this.f671b.keyAt(size); size--) {
            this.f672c.accept(this.f671b.valueAt(size));
            this.f671b.removeAt(size);
        }
        this.f670a = this.f671b.size() > 0 ? Math.min(this.f670a, this.f671b.size() - 1) : -1;
    }

    /* renamed from: d */
    public void m638d(int i7) {
        int i8 = 0;
        while (i8 < this.f671b.size() - 1) {
            int i9 = i8 + 1;
            if (i7 < this.f671b.keyAt(i9)) {
                return;
            }
            this.f672c.accept(this.f671b.valueAt(i8));
            this.f671b.removeAt(i8);
            int i10 = this.f670a;
            if (i10 > 0) {
                this.f670a = i10 - 1;
            }
            i8 = i9;
        }
    }

    /* renamed from: e */
    public Object m639e(int i7) {
        if (this.f670a == -1) {
            this.f670a = 0;
        }
        while (true) {
            int i8 = this.f670a;
            if (i8 <= 0 || i7 >= this.f671b.keyAt(i8)) {
                break;
            }
            this.f670a--;
        }
        while (this.f670a < this.f671b.size() - 1 && i7 >= this.f671b.keyAt(this.f670a + 1)) {
            this.f670a++;
        }
        return this.f671b.valueAt(this.f670a);
    }

    /* renamed from: f */
    public Object m640f() {
        return this.f671b.valueAt(r0.size() - 1);
    }

    /* renamed from: g */
    public boolean m641g() {
        return this.f671b.size() == 0;
    }
}
