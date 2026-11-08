package p253i5;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: i5.h */
/* loaded from: classes2.dex */
public final class C4608h implements InterfaceC4605f0 {

    /* renamed from: a */
    public final AtomicLong f16832a = new AtomicLong();

    @Override // p253i5.InterfaceC4605f0
    /* renamed from: a */
    public void mo19364a(long j7) {
        this.f16832a.getAndAdd(j7);
    }
}
