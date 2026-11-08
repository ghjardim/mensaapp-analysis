package p256j$.time.chrono;

import p256j$.time.C4891l;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.Temporal;
import p256j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b */
/* loaded from: classes3.dex */
public interface InterfaceC4836b extends Temporal, InterfaceC4913n, Comparable {
    /* renamed from: E */
    InterfaceC4836b mo20989E(long j7, TemporalUnit temporalUnit);

    /* renamed from: F */
    int compareTo(InterfaceC4836b interfaceC4836b);

    /* renamed from: a */
    InterfaceC4848n mo20996a();

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    InterfaceC4836b mo20902d(long j7, InterfaceC4915p interfaceC4915p);

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: e */
    InterfaceC4836b mo20903e(long j7, TemporalUnit temporalUnit);

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    long mo20904f(Temporal temporal, TemporalUnit temporalUnit);

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    boolean mo20905g(InterfaceC4915p interfaceC4915p);

    int hashCode();

    /* renamed from: t */
    long mo20997t();

    String toString();

    /* renamed from: u */
    InterfaceC4839e mo20998u(C4891l c4891l);
}
