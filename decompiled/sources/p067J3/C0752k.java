package p067J3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p088M3.InterfaceC1167i;
import p256j$.util.DesugarCollections;

/* renamed from: J3.k */
/* loaded from: classes.dex */
public class C0752k extends AbstractC0764q {

    /* renamed from: a */
    public final List f2662a;

    /* renamed from: b */
    public final a f2663b;

    /* renamed from: c */
    public List f2664c;

    /* renamed from: J3.k$a */
    public enum a {
        AND("and"),
        OR("or");


        /* renamed from: a */
        public final String f2668a;

        a(String str) {
            this.f2668a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f2668a;
        }
    }

    public C0752k(List list, a aVar) {
        this.f2662a = new ArrayList(list);
        this.f2663b = aVar;
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: a */
    public String mo3220a() {
        StringBuilder sb = new StringBuilder();
        if (m3227i()) {
            Iterator it = this.f2662a.iterator();
            while (it.hasNext()) {
                sb.append(((AbstractC0764q) it.next()).mo3220a());
            }
            return sb.toString();
        }
        sb.append(this.f2663b.toString() + "(");
        sb.append(TextUtils.join(",", this.f2662a));
        sb.append(")");
        return sb.toString();
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: b */
    public List mo3221b() {
        return DesugarCollections.unmodifiableList(this.f2662a);
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: c */
    public List mo3222c() {
        List list = this.f2664c;
        if (list != null) {
            return DesugarCollections.unmodifiableList(list);
        }
        this.f2664c = new ArrayList();
        Iterator it = this.f2662a.iterator();
        while (it.hasNext()) {
            this.f2664c.addAll(((AbstractC0764q) it.next()).mo3222c());
        }
        return DesugarCollections.unmodifiableList(this.f2664c);
    }

    @Override // p067J3.AbstractC0764q
    /* renamed from: d */
    public boolean mo3063d(InterfaceC1167i interfaceC1167i) {
        if (m3224f()) {
            Iterator it = this.f2662a.iterator();
            while (it.hasNext()) {
                if (!((AbstractC0764q) it.next()).mo3063d(interfaceC1167i)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.f2662a.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0764q) it2.next()).mo3063d(interfaceC1167i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public a m3223e() {
        return this.f2663b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0752k)) {
            return false;
        }
        C0752k c0752k = (C0752k) obj;
        return this.f2663b == c0752k.f2663b && this.f2662a.equals(c0752k.f2662a);
    }

    /* renamed from: f */
    public boolean m3224f() {
        return this.f2663b == a.AND;
    }

    /* renamed from: g */
    public boolean m3225g() {
        return this.f2663b == a.OR;
    }

    /* renamed from: h */
    public boolean m3226h() {
        Iterator it = this.f2662a.iterator();
        while (it.hasNext()) {
            if (((AbstractC0764q) it.next()) instanceof C0752k) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1147 + this.f2663b.hashCode()) * 31) + this.f2662a.hashCode();
    }

    /* renamed from: i */
    public boolean m3227i() {
        return m3226h() && m3224f();
    }

    /* renamed from: j */
    public C0752k m3228j(List list) {
        ArrayList arrayList = new ArrayList(this.f2662a);
        arrayList.addAll(list);
        return new C0752k(arrayList, this.f2663b);
    }

    public String toString() {
        return mo3220a();
    }
}
