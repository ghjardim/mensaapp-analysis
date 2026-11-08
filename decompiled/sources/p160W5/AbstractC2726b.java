package p160W5;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: W5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2726b {

    /* renamed from: a */
    public AbstractC2728d[] f8047a;

    /* renamed from: b */
    public int f8048b;

    /* renamed from: c */
    public int f8049c;

    /* renamed from: d */
    public final AbstractC2728d m9342d() {
        AbstractC2728d abstractC2728d;
        synchronized (this) {
            try {
                AbstractC2728d[] abstractC2728dArr = this.f8047a;
                if (abstractC2728dArr == null) {
                    abstractC2728dArr = mo9090g(2);
                    this.f8047a = abstractC2728dArr;
                } else if (this.f8048b >= abstractC2728dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC2728dArr, abstractC2728dArr.length * 2);
                    AbstractC5469l.m23027d(copyOf, "copyOf(...)");
                    this.f8047a = (AbstractC2728d[]) copyOf;
                    abstractC2728dArr = (AbstractC2728d[]) copyOf;
                }
                int i7 = this.f8049c;
                do {
                    abstractC2728d = abstractC2728dArr[i7];
                    if (abstractC2728d == null) {
                        abstractC2728d = mo9089f();
                        abstractC2728dArr[i7] = abstractC2728d;
                    }
                    i7++;
                    if (i7 >= abstractC2728dArr.length) {
                        i7 = 0;
                    }
                    AbstractC5469l.m23026c(abstractC2728d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC2728d.mo9099a(this));
                this.f8049c = i7;
                this.f8048b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC2728d;
    }

    /* renamed from: f */
    public abstract AbstractC2728d mo9089f();

    /* renamed from: g */
    public abstract AbstractC2728d[] mo9090g(int i7);

    /* renamed from: h */
    public final void m9343h(AbstractC2728d abstractC2728d) {
        int i7;
        InterfaceC7157e[] mo9100b;
        synchronized (this) {
            try {
                int i8 = this.f8048b - 1;
                this.f8048b = i8;
                if (i8 == 0) {
                    this.f8049c = 0;
                }
                AbstractC5469l.m23026c(abstractC2728d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                mo9100b = abstractC2728d.mo9100b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC7157e interfaceC7157e : mo9100b) {
            if (interfaceC7157e != null) {
                C6927j.a aVar = C6927j.f24803b;
                interfaceC7157e.resumeWith(C6927j.m28373b(C6934q.f24811a));
            }
        }
    }

    /* renamed from: i */
    public final AbstractC2728d[] m9344i() {
        return this.f8047a;
    }
}
