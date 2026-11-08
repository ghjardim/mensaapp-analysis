package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.t1 */
/* loaded from: classes3.dex */
final class C5273t1 extends C5155Y2 implements InterfaceC5084K0, InterfaceC5049D0 {
    @Override // p256j$.util.stream.InterfaceC5049D0, p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5084K0 mo21444a() {
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5094M0 mo21444a() {
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21458j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21417v(this, j7, j8);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        AbstractC5034A0.m21404i(this, l7);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: o */
    public final /* synthetic */ Object[] mo21485o(IntFunction intFunction) {
        return AbstractC5034A0.m21408m(this, intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: q */
    public final /* synthetic */ int mo21486q() {
        return 0;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC5094M0 mo21478b(int i7) {
        mo21478b(i7);
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5089L0, p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final InterfaceC5089L0 mo21478b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final /* synthetic */ void mo21484i(Object[] objArr, int i7) {
        AbstractC5034A0.m21411p(this, (Long[]) objArr, i7);
    }

    @Override // p256j$.util.stream.AbstractC5166a3, p256j$.util.stream.InterfaceC5089L0
    /* renamed from: e */
    public final void mo21481e(Object obj) {
        super.mo21481e((LongConsumer) obj);
    }

    @Override // p256j$.util.stream.AbstractC5166a3, p256j$.util.stream.InterfaceC5089L0
    /* renamed from: r */
    public final void mo21482r(int i7, Object obj) {
        super.mo21482r(i7, (long[]) obj);
    }

    @Override // p256j$.util.stream.C5155Y2, p256j$.util.stream.AbstractC5166a3, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // p256j$.util.stream.C5155Y2, p256j$.util.stream.AbstractC5166a3, java.lang.Iterable
    public final InterfaceC4999f0 spliterator() {
        return super.spliterator();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        clear();
        m21510v(j7);
    }

    @Override // p256j$.util.stream.AbstractC5166a3, p256j$.util.stream.InterfaceC5089L0
    /* renamed from: d */
    public final Object mo21480d() {
        return (long[]) super.mo21480d();
    }
}
