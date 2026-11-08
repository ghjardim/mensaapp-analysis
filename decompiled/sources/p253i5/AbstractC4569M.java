package p253i5;

import java.util.concurrent.TimeUnit;
import p171Y2.AbstractC2926i;
import p237g5.AbstractC4420V;
import p237g5.AbstractC4437g;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.EnumC4455p;

/* renamed from: i5.M */
/* loaded from: classes2.dex */
public abstract class AbstractC4569M extends AbstractC4420V {

    /* renamed from: a */
    public final AbstractC4420V f16547a;

    public AbstractC4569M(AbstractC4420V abstractC4420V) {
        this.f16547a = abstractC4420V;
    }

    @Override // p237g5.AbstractC4431d
    /* renamed from: a */
    public String mo18909a() {
        return this.f16547a.mo18909a();
    }

    @Override // p237g5.AbstractC4431d
    /* renamed from: h */
    public AbstractC4437g mo18910h(C4426a0 c4426a0, C4429c c4429c) {
        return this.f16547a.mo18910h(c4426a0, c4429c);
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: j */
    public boolean mo18749j(long j7, TimeUnit timeUnit) {
        return this.f16547a.mo18749j(j7, timeUnit);
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: k */
    public void mo18750k() {
        this.f16547a.mo18750k();
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: l */
    public EnumC4455p mo18751l(boolean z6) {
        return this.f16547a.mo18751l(z6);
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: m */
    public void mo18752m(EnumC4455p enumC4455p, Runnable runnable) {
        this.f16547a.mo18752m(enumC4455p, runnable);
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: n */
    public AbstractC4420V mo18753n() {
        return this.f16547a.mo18753n();
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: o */
    public AbstractC4420V mo18754o() {
        return this.f16547a.mo18754o();
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("delegate", this.f16547a).toString();
    }
}
