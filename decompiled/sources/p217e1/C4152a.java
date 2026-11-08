package p217e1;

import p078L0.AbstractC0851I;
import p078L0.C0874i;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C4152a extends C0874i implements InterfaceC4158g {

    /* renamed from: h */
    public final int f13917h;

    /* renamed from: i */
    public final long f13918i;

    public C4152a(long j7, long j8, AbstractC0851I.a aVar, boolean z6) {
        this(j7, j8, aVar.f2933f, aVar.f2930c, z6);
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: c */
    public long mo17455c(long j7) {
        return m3654b(j7);
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: e */
    public long mo17456e() {
        return this.f13918i;
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: k */
    public int mo17457k() {
        return this.f13917h;
    }

    public C4152a(long j7, long j8, int i7, int i8, boolean z6) {
        super(j7, j8, i7, i8, z6);
        this.f13917h = i7;
        this.f13918i = j7 == -1 ? -1L : j7;
    }
}
