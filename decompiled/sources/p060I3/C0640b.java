package p060I3;

import p088M3.C1170l;
import p088M3.C1177s;

/* renamed from: I3.b */
/* loaded from: classes.dex */
public class C0640b implements InterfaceC0641c {

    /* renamed from: a */
    public C1177s f2199a;

    public C0640b(C1177s c1177s) {
        this.f2199a = c1177s;
    }

    /* renamed from: a */
    public C1177s m2547a() {
        return this.f2199a;
    }

    /* renamed from: b */
    public C1170l m2548b() {
        return this.f2199a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2199a.equals(((C0640b) obj).f2199a);
    }

    public int hashCode() {
        return this.f2199a.hashCode();
    }
}
