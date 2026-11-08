package p167X5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import p350u.AbstractC6581b;

/* renamed from: X5.e */
/* loaded from: classes2.dex */
public abstract class AbstractC2860e {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8829a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2860e.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8830b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2860e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2860e(AbstractC2860e abstractC2860e) {
        this._prev$volatile = abstractC2860e;
    }

    /* renamed from: c */
    public final void m10312c() {
        f8830b.set(this, null);
    }

    /* renamed from: d */
    public final AbstractC2860e m10313d() {
        AbstractC2860e m10317h = m10317h();
        while (m10317h != null && m10317h.mo10254k()) {
            m10317h = (AbstractC2860e) f8830b.get(m10317h);
        }
        return m10317h;
    }

    /* renamed from: e */
    public final AbstractC2860e m10314e() {
        AbstractC2860e m10315f = m10315f();
        AbstractC5469l.m23025b(m10315f);
        while (m10315f.mo10254k()) {
            AbstractC2860e m10315f2 = m10315f.m10315f();
            if (m10315f2 == null) {
                return m10315f;
            }
            m10315f = m10315f2;
        }
        return m10315f;
    }

    /* renamed from: f */
    public final AbstractC2860e m10315f() {
        Object m10316g = m10316g();
        if (m10316g == AbstractC2859d.f8828a) {
            return null;
        }
        return (AbstractC2860e) m10316g;
    }

    /* renamed from: g */
    public final Object m10316g() {
        return f8829a.get(this);
    }

    /* renamed from: h */
    public final AbstractC2860e m10317h() {
        return (AbstractC2860e) f8830b.get(this);
    }

    /* renamed from: k */
    public abstract boolean mo10254k();

    /* renamed from: l */
    public final boolean m10318l() {
        return m10315f() == null;
    }

    /* renamed from: m */
    public final boolean m10319m() {
        return AbstractC6581b.m27343a(f8829a, this, null, AbstractC2859d.f8828a);
    }

    /* renamed from: n */
    public final void m10320n() {
        Object obj;
        if (m10318l()) {
            return;
        }
        while (true) {
            AbstractC2860e m10313d = m10313d();
            AbstractC2860e m10314e = m10314e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8830b;
            do {
                obj = atomicReferenceFieldUpdater.get(m10314e);
            } while (!AbstractC6581b.m27343a(atomicReferenceFieldUpdater, m10314e, obj, ((AbstractC2860e) obj) == null ? null : m10313d));
            if (m10313d != null) {
                f8829a.set(m10313d, m10314e);
            }
            if (!m10314e.mo10254k() || m10314e.m10318l()) {
                if (m10313d == null || !m10313d.mo10254k()) {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean m10321o(AbstractC2860e abstractC2860e) {
        return AbstractC6581b.m27343a(f8829a, this, null, abstractC2860e);
    }
}
