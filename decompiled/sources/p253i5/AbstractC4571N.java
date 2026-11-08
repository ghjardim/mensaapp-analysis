package p253i5;

import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4430c0;

/* renamed from: i5.N */
/* loaded from: classes2.dex */
public abstract class AbstractC4571N extends AbstractC4430c0 {

    /* renamed from: a */
    public final AbstractC4430c0 f16559a;

    public AbstractC4571N(AbstractC4430c0 abstractC4430c0) {
        AbstractC2932o.m10573p(abstractC4430c0, "delegate can not be null");
        this.f16559a = abstractC4430c0;
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: a */
    public String mo18871a() {
        return this.f16559a.mo18871a();
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: b */
    public void mo18872b() {
        this.f16559a.mo18872b();
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: c */
    public void mo18873c() {
        this.f16559a.mo18873c();
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: d */
    public void mo18874d(AbstractC4430c0.d dVar) {
        this.f16559a.mo18874d(dVar);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("delegate", this.f16559a).toString();
    }
}
