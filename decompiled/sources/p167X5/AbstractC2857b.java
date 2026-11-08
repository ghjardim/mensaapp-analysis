package p167X5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p350u.AbstractC6581b;

/* renamed from: X5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2857b extends AbstractC2881z {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8826a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2857b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AbstractC2856a.f8825a;

    @Override // p167X5.AbstractC2881z
    /* renamed from: a */
    public final Object mo10302a(Object obj) {
        Object obj2 = f8826a.get(this);
        if (obj2 == AbstractC2856a.f8825a) {
            obj2 = m10304c(mo7955e(obj));
        }
        mo10303b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo10303b(Object obj, Object obj2);

    /* renamed from: c */
    public final Object m10304c(Object obj) {
        Object obj2 = f8826a.get(this);
        Object obj3 = AbstractC2856a.f8825a;
        return obj2 != obj3 ? obj2 : AbstractC6581b.m27343a(f8826a, this, obj3, obj) ? obj : f8826a.get(this);
    }

    /* renamed from: e */
    public abstract Object mo7955e(Object obj);
}
