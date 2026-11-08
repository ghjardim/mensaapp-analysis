package p301o1;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p249i1.InterfaceC4520k;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;

/* renamed from: o1.h */
/* loaded from: classes.dex */
public final class C5926h implements InterfaceC4520k {

    /* renamed from: a */
    public final C5921c f21390a;

    /* renamed from: b */
    public final long[] f21391b;

    /* renamed from: c */
    public final Map f21392c;

    /* renamed from: d */
    public final Map f21393d;

    /* renamed from: e */
    public final Map f21394e;

    public C5926h(C5921c c5921c, Map map, Map map2, Map map3) {
        this.f21390a = c5921c;
        this.f21393d = map2;
        this.f21394e = map3;
        this.f21392c = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.emptyMap();
        this.f21391b = c5921c.m24890j();
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: b */
    public int mo19221b(long j7) {
        int m21732d = AbstractC5330M.m21732d(this.f21391b, j7, false, false);
        if (m21732d < this.f21391b.length) {
            return m21732d;
        }
        return -1;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: f */
    public long mo19223f(int i7) {
        return this.f21391b[i7];
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: g */
    public List mo19224g(long j7) {
        return this.f21390a.m24888h(j7, this.f21392c, this.f21393d, this.f21394e);
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: h */
    public int mo19225h() {
        return this.f21391b.length;
    }
}
