package p067J3;

import com.google.firebase.firestore.C3952f;
import java.util.ArrayList;
import p046G3.EnumC0406T;
import p046G3.InterfaceC0447r;
import p067J3.C0756m;
import p067J3.C0760o;
import p116Q3.AbstractC2133b;

/* renamed from: J3.d0 */
/* loaded from: classes.dex */
public class C0739d0 {

    /* renamed from: a */
    public final C0737c0 f2598a;

    /* renamed from: b */
    public final C0760o.b f2599b;

    /* renamed from: c */
    public final InterfaceC0447r f2600c;

    /* renamed from: d */
    public boolean f2601d = false;

    /* renamed from: e */
    public EnumC0733a0 f2602e = EnumC0733a0.UNKNOWN;

    /* renamed from: f */
    public C0783z0 f2603f;

    public C0739d0(C0737c0 c0737c0, C0760o.b bVar, InterfaceC0447r interfaceC0447r) {
        this.f2598a = c0737c0;
        this.f2600c = interfaceC0447r;
        this.f2599b = bVar;
    }

    /* renamed from: a */
    public C0737c0 m3134a() {
        return this.f2598a;
    }

    /* renamed from: b */
    public boolean m3135b() {
        if (this.f2599b != null) {
            return !r0.f2700d.equals(EnumC0406T.CACHE);
        }
        return true;
    }

    /* renamed from: c */
    public void m3136c(C3952f c3952f) {
        this.f2600c.mo1589a(null, c3952f);
    }

    /* renamed from: d */
    public boolean m3137d(EnumC0733a0 enumC0733a0) {
        this.f2602e = enumC0733a0;
        C0783z0 c0783z0 = this.f2603f;
        if (c0783z0 == null || this.f2601d || !m3141h(c0783z0, enumC0733a0)) {
            return false;
        }
        m3139f(this.f2603f);
        return true;
    }

    /* renamed from: e */
    public boolean m3138e(C0783z0 c0783z0) {
        boolean z6 = true;
        AbstractC2133b.m7217d(!c0783z0.m3333d().isEmpty() || c0783z0.m3331a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f2599b.f2697a) {
            ArrayList arrayList = new ArrayList();
            for (C0756m c0756m : c0783z0.m3333d()) {
                if (c0756m.m3252c() != C0756m.a.METADATA) {
                    arrayList.add(c0756m);
                }
            }
            c0783z0 = new C0783z0(c0783z0.m3337h(), c0783z0.m3334e(), c0783z0.m3336g(), arrayList, c0783z0.m3340k(), c0783z0.m3335f(), c0783z0.m3331a(), true, c0783z0.m3338i());
        }
        if (this.f2601d) {
            if (m3140g(c0783z0)) {
                this.f2600c.mo1589a(c0783z0, null);
            }
            z6 = false;
        } else {
            if (m3141h(c0783z0, this.f2602e)) {
                m3139f(c0783z0);
            }
            z6 = false;
        }
        this.f2603f = c0783z0;
        return z6;
    }

    /* renamed from: f */
    public final void m3139f(C0783z0 c0783z0) {
        AbstractC2133b.m7217d(!this.f2601d, "Trying to raise initial event for second time", new Object[0]);
        C0783z0 m3330c = C0783z0.m3330c(c0783z0.m3337h(), c0783z0.m3334e(), c0783z0.m3335f(), c0783z0.m3340k(), c0783z0.m3332b(), c0783z0.m3338i());
        this.f2601d = true;
        this.f2600c.mo1589a(m3330c, null);
    }

    /* renamed from: g */
    public final boolean m3140g(C0783z0 c0783z0) {
        if (!c0783z0.m3333d().isEmpty()) {
            return true;
        }
        C0783z0 c0783z02 = this.f2603f;
        boolean z6 = (c0783z02 == null || c0783z02.m3339j() == c0783z0.m3339j()) ? false : true;
        if (c0783z0.m3331a() || z6) {
            return this.f2599b.f2698b;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m3141h(C0783z0 c0783z0, EnumC0733a0 enumC0733a0) {
        AbstractC2133b.m7217d(!this.f2601d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!c0783z0.m3340k() || !m3135b()) {
            return true;
        }
        EnumC0733a0 enumC0733a02 = EnumC0733a0.OFFLINE;
        boolean equals = enumC0733a0.equals(enumC0733a02);
        if (!this.f2599b.f2699c || equals) {
            return !c0783z0.m3334e().isEmpty() || c0783z0.m3338i() || enumC0733a0.equals(enumC0733a02);
        }
        AbstractC2133b.m7217d(c0783z0.m3340k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }
}
