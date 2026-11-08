package p067J3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p067J3.C0756m;
import p088M3.C1172n;
import p088M3.InterfaceC1167i;
import p376x3.C6950e;

/* renamed from: J3.z0 */
/* loaded from: classes.dex */
public class C0783z0 {

    /* renamed from: a */
    public final C0737c0 f2788a;

    /* renamed from: b */
    public final C1172n f2789b;

    /* renamed from: c */
    public final C1172n f2790c;

    /* renamed from: d */
    public final List f2791d;

    /* renamed from: e */
    public final boolean f2792e;

    /* renamed from: f */
    public final C6950e f2793f;

    /* renamed from: g */
    public final boolean f2794g;

    /* renamed from: h */
    public boolean f2795h;

    /* renamed from: i */
    public boolean f2796i;

    /* renamed from: J3.z0$a */
    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public C0783z0(C0737c0 c0737c0, C1172n c1172n, C1172n c1172n2, List list, boolean z6, C6950e c6950e, boolean z7, boolean z8, boolean z9) {
        this.f2788a = c0737c0;
        this.f2789b = c1172n;
        this.f2790c = c1172n2;
        this.f2791d = list;
        this.f2792e = z6;
        this.f2793f = c6950e;
        this.f2794g = z7;
        this.f2795h = z8;
        this.f2796i = z9;
    }

    /* renamed from: c */
    public static C0783z0 m3330c(C0737c0 c0737c0, C1172n c1172n, C6950e c6950e, boolean z6, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c1172n.iterator();
        while (it.hasNext()) {
            arrayList.add(C0756m.m3250a(C0756m.a.ADDED, (InterfaceC1167i) it.next()));
        }
        return new C0783z0(c0737c0, c1172n, C1172n.m4508e(c0737c0.m3097c()), arrayList, z6, c6950e, true, z7, z8);
    }

    /* renamed from: a */
    public boolean m3331a() {
        return this.f2794g;
    }

    /* renamed from: b */
    public boolean m3332b() {
        return this.f2795h;
    }

    /* renamed from: d */
    public List m3333d() {
        return this.f2791d;
    }

    /* renamed from: e */
    public C1172n m3334e() {
        return this.f2789b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0783z0)) {
            return false;
        }
        C0783z0 c0783z0 = (C0783z0) obj;
        if (this.f2792e == c0783z0.f2792e && this.f2794g == c0783z0.f2794g && this.f2795h == c0783z0.f2795h && this.f2788a.equals(c0783z0.f2788a) && this.f2793f.equals(c0783z0.f2793f) && this.f2789b.equals(c0783z0.f2789b) && this.f2790c.equals(c0783z0.f2790c) && this.f2796i == c0783z0.f2796i) {
            return this.f2791d.equals(c0783z0.f2791d);
        }
        return false;
    }

    /* renamed from: f */
    public C6950e m3335f() {
        return this.f2793f;
    }

    /* renamed from: g */
    public C1172n m3336g() {
        return this.f2790c;
    }

    /* renamed from: h */
    public C0737c0 m3337h() {
        return this.f2788a;
    }

    public int hashCode() {
        return (((((((((((((((this.f2788a.hashCode() * 31) + this.f2789b.hashCode()) * 31) + this.f2790c.hashCode()) * 31) + this.f2791d.hashCode()) * 31) + this.f2793f.hashCode()) * 31) + (this.f2792e ? 1 : 0)) * 31) + (this.f2794g ? 1 : 0)) * 31) + (this.f2795h ? 1 : 0)) * 31) + (this.f2796i ? 1 : 0);
    }

    /* renamed from: i */
    public boolean m3338i() {
        return this.f2796i;
    }

    /* renamed from: j */
    public boolean m3339j() {
        return !this.f2793f.isEmpty();
    }

    /* renamed from: k */
    public boolean m3340k() {
        return this.f2792e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f2788a + ", " + this.f2789b + ", " + this.f2790c + ", " + this.f2791d + ", isFromCache=" + this.f2792e + ", mutatedKeys=" + this.f2793f.size() + ", didSyncStateChange=" + this.f2794g + ", excludesMetadataChanges=" + this.f2795h + ", hasCachedResults=" + this.f2796i + ")";
    }
}
