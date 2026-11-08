package p088M3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p376x3.AbstractC6948c;
import p376x3.C6950e;

/* renamed from: M3.n */
/* loaded from: classes.dex */
public final class C1172n implements Iterable {

    /* renamed from: a */
    public final AbstractC6948c f3763a;

    /* renamed from: b */
    public final C6950e f3764b;

    public C1172n(AbstractC6948c abstractC6948c, C6950e c6950e) {
        this.f3763a = abstractC6948c;
        this.f3764b = c6950e;
    }

    /* renamed from: e */
    public static C1172n m4508e(final Comparator comparator) {
        return new C1172n(AbstractC1168j.m4491a(), new C6950e(Collections.emptyList(), new Comparator() { // from class: M3.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m4509k;
                m4509k = C1172n.m4509k(comparator, (InterfaceC1167i) obj, (InterfaceC1167i) obj2);
                return m4509k;
            }
        }));
    }

    /* renamed from: k */
    public static /* synthetic */ int m4509k(Comparator comparator, InterfaceC1167i interfaceC1167i, InterfaceC1167i interfaceC1167i2) {
        int compare = comparator.compare(interfaceC1167i, interfaceC1167i2);
        return compare == 0 ? InterfaceC1167i.f3757a.compare(interfaceC1167i, interfaceC1167i2) : compare;
    }

    /* renamed from: b */
    public C1172n m4510b(InterfaceC1167i interfaceC1167i) {
        C1172n m4515l = m4515l(interfaceC1167i.getKey());
        return new C1172n(m4515l.f3763a.mo28455h(interfaceC1167i.getKey(), interfaceC1167i), m4515l.f3764b.m28471e(interfaceC1167i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1172n.class != obj.getClass()) {
            return false;
        }
        C1172n c1172n = (C1172n) obj;
        if (size() != c1172n.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1172n.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1167i) it.next()).equals((InterfaceC1167i) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public InterfaceC1167i m4511f(C1170l c1170l) {
        return (InterfaceC1167i) this.f3763a.mo28451b(c1170l);
    }

    /* renamed from: g */
    public InterfaceC1167i m4512g() {
        return (InterfaceC1167i) this.f3764b.m28470b();
    }

    /* renamed from: h */
    public InterfaceC1167i m4513h() {
        return (InterfaceC1167i) this.f3764b.m28469a();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            InterfaceC1167i interfaceC1167i = (InterfaceC1167i) it.next();
            i7 = (((i7 * 31) + interfaceC1167i.getKey().hashCode()) * 31) + interfaceC1167i.mo4480a().hashCode();
        }
        return i7;
    }

    /* renamed from: i */
    public int m4514i(C1170l c1170l) {
        InterfaceC1167i interfaceC1167i = (InterfaceC1167i) this.f3763a.mo28451b(c1170l);
        if (interfaceC1167i == null) {
            return -1;
        }
        return this.f3764b.indexOf(interfaceC1167i);
    }

    public boolean isEmpty() {
        return this.f3763a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f3764b.iterator();
    }

    /* renamed from: l */
    public C1172n m4515l(C1170l c1170l) {
        InterfaceC1167i interfaceC1167i = (InterfaceC1167i) this.f3763a.mo28451b(c1170l);
        return interfaceC1167i == null ? this : new C1172n(this.f3763a.mo28457k(c1170l), this.f3764b.m28473g(interfaceC1167i));
    }

    public int size() {
        return this.f3763a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            InterfaceC1167i interfaceC1167i = (InterfaceC1167i) it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(interfaceC1167i);
        }
        sb.append("]");
        return sb.toString();
    }
}
