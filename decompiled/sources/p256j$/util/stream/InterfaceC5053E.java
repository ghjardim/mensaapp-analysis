package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import p256j$.util.C4938C;
import p256j$.util.C5314y;
import p256j$.util.InterfaceC4944I;
import p256j$.util.InterfaceC4957W;

/* renamed from: j$.util.stream.E */
/* loaded from: classes3.dex */
public interface InterfaceC5053E extends InterfaceC5204h {
    /* renamed from: a */
    InterfaceC5053E mo21434a();

    C4938C average();

    /* renamed from: b */
    InterfaceC5053E mo21435b();

    Stream boxed();

    /* renamed from: c */
    InterfaceC5053E mo21436c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    /* renamed from: d */
    InterfaceC5053E mo21437d(C5162a c5162a);

    InterfaceC5053E distinct();

    /* renamed from: e */
    InterfaceC5053E mo21438e();

    C4938C findAny();

    C4938C findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    /* renamed from: i */
    boolean mo21439i();

    InterfaceC4944I iterator();

    /* renamed from: j */
    InterfaceC5252p0 mo21440j();

    InterfaceC5053E limit(long j7);

    Stream mapToObj(DoubleFunction doubleFunction);

    C4938C max();

    C4938C min();

    /* renamed from: p */
    boolean mo21441p();

    InterfaceC5053E parallel();

    InterfaceC5053E peek(DoubleConsumer doubleConsumer);

    double reduce(double d7, DoubleBinaryOperator doubleBinaryOperator);

    C4938C reduce(DoubleBinaryOperator doubleBinaryOperator);

    InterfaceC5053E sequential();

    InterfaceC5053E skip(long j7);

    InterfaceC5053E sorted();

    @Override // p256j$.util.stream.InterfaceC5204h
    InterfaceC4957W spliterator();

    double sum();

    C5314y summaryStatistics();

    double[] toArray();

    /* renamed from: u */
    InterfaceC5187e0 mo21442u();

    /* renamed from: y */
    boolean mo21443y();
}
