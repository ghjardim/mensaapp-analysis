package p167X5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p350u.AbstractC6581b;

/* renamed from: X5.s */
/* loaded from: classes2.dex */
public class C2874s {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8855a = AtomicReferenceFieldUpdater.newUpdater(C2874s.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C2874s(boolean z6) {
        this._cur$volatile = new C2875t(8, z6);
    }

    /* renamed from: a */
    public final boolean m10367a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8855a;
        while (true) {
            C2875t c2875t = (C2875t) atomicReferenceFieldUpdater.get(this);
            int m10373a = c2875t.m10373a(obj);
            if (m10373a == 0) {
                return true;
            }
            if (m10373a == 1) {
                AbstractC6581b.m27343a(f8855a, this, c2875t, c2875t.m10382l());
            } else if (m10373a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m10368b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8855a;
        while (true) {
            C2875t c2875t = (C2875t) atomicReferenceFieldUpdater.get(this);
            if (c2875t.m10376d()) {
                return;
            } else {
                AbstractC6581b.m27343a(f8855a, this, c2875t, c2875t.m10382l());
            }
        }
    }

    /* renamed from: c */
    public final int m10369c() {
        return ((C2875t) f8855a.get(this)).m10379g();
    }

    /* renamed from: e */
    public final Object m10370e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8855a;
        while (true) {
            C2875t c2875t = (C2875t) atomicReferenceFieldUpdater.get(this);
            Object m10383m = c2875t.m10383m();
            if (m10383m != C2875t.f8859h) {
                return m10383m;
            }
            AbstractC6581b.m27343a(f8855a, this, c2875t, c2875t.m10382l());
        }
    }
}
