package p104O5;

import kotlin.jvm.internal.AbstractC5464g;
import p027D5.AbstractC0195c;
import p076K5.InterfaceC0834a;
import p378x5.AbstractC7002B;

/* renamed from: O5.d */
/* loaded from: classes2.dex */
public class C1417d implements Iterable, InterfaceC0834a {

    /* renamed from: d */
    public static final a f4465d = new a(null);

    /* renamed from: a */
    public final int f4466a;

    /* renamed from: b */
    public final int f4467b;

    /* renamed from: c */
    public final int f4468c;

    /* renamed from: O5.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C1417d m5522a(int i7, int i8, int i9) {
            return new C1417d(i7, i8, i9);
        }

        public a() {
        }
    }

    public C1417d(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4466a = i7;
        this.f4467b = AbstractC0195c.m794b(i7, i8, i9);
        this.f4468c = i9;
    }

    /* renamed from: a */
    public final int m5518a() {
        return this.f4466a;
    }

    /* renamed from: b */
    public final int m5519b() {
        return this.f4467b;
    }

    /* renamed from: e */
    public final int m5520e() {
        return this.f4468c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1417d) {
            if (!isEmpty() || !((C1417d) obj).isEmpty()) {
                C1417d c1417d = (C1417d) obj;
                if (this.f4466a != c1417d.f4466a || this.f4467b != c1417d.f4467b || this.f4468c != c1417d.f4468c) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC7002B iterator() {
        return new C1418e(this.f4466a, this.f4467b, this.f4468c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4466a * 31) + this.f4467b) * 31) + this.f4468c;
    }

    public boolean isEmpty() {
        if (this.f4468c > 0) {
            if (this.f4466a <= this.f4467b) {
                return false;
            }
        } else if (this.f4466a >= this.f4467b) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f4468c > 0) {
            sb = new StringBuilder();
            sb.append(this.f4466a);
            sb.append("..");
            sb.append(this.f4467b);
            sb.append(" step ");
            i7 = this.f4468c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f4466a);
            sb.append(" downTo ");
            sb.append(this.f4467b);
            sb.append(" step ");
            i7 = -this.f4468c;
        }
        sb.append(i7);
        return sb.toString();
    }
}
