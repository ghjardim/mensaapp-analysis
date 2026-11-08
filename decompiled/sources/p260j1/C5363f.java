package p260j1;

import java.util.Collections;
import java.util.List;
import p249i1.InterfaceC4520k;
import p259j0.AbstractC5332a;

/* renamed from: j1.f */
/* loaded from: classes.dex */
public final class C5363f implements InterfaceC4520k {

    /* renamed from: a */
    public final List f18987a;

    public C5363f(List list) {
        this.f18987a = list;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: b */
    public int mo19221b(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: f */
    public long mo19223f(int i7) {
        AbstractC5332a.m21796a(i7 == 0);
        return 0L;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: g */
    public List mo19224g(long j7) {
        return j7 >= 0 ? this.f18987a : Collections.emptyList();
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: h */
    public int mo19225h() {
        return 1;
    }
}
