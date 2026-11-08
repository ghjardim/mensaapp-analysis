package p214d6;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5469l;
import p206c6.AbstractC3623k;
import p206c6.C3616d;
import p206c6.InterfaceC3609V;

/* renamed from: d6.g */
/* loaded from: classes2.dex */
public final class C4137g extends AbstractC3623k {

    /* renamed from: b */
    public final long f13849b;

    /* renamed from: c */
    public final boolean f13850c;

    /* renamed from: d */
    public long f13851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4137g(InterfaceC3609V delegate, long j7, boolean z6) {
        super(delegate);
        AbstractC5469l.m23028e(delegate, "delegate");
        this.f13849b = j7;
        this.f13850c = z6;
    }

    @Override // p206c6.AbstractC3623k, p206c6.InterfaceC3609V
    /* renamed from: P */
    public long mo14512P(C3616d sink, long j7) {
        AbstractC5469l.m23028e(sink, "sink");
        long j8 = this.f13851d;
        long j9 = this.f13849b;
        if (j8 > j9) {
            j7 = 0;
        } else if (this.f13850c) {
            long j10 = j9 - j8;
            if (j10 == 0) {
                return -1L;
            }
            j7 = Math.min(j7, j10);
        }
        long mo14512P = super.mo14512P(sink, j7);
        if (mo14512P != -1) {
            this.f13851d += mo14512P;
        }
        long j11 = this.f13851d;
        long j12 = this.f13849b;
        if ((j11 >= j12 || mo14512P != -1) && j11 <= j12) {
            return mo14512P;
        }
        if (mo14512P > 0 && j11 > j12) {
            m17355a(sink, sink.m14618c0() - (this.f13851d - this.f13849b));
        }
        throw new IOException("expected " + this.f13849b + " bytes but got " + this.f13851d);
    }

    /* renamed from: a */
    public final void m17355a(C3616d c3616d, long j7) {
        C3616d c3616d2 = new C3616d();
        c3616d2.m14634y0(c3616d);
        c3616d.mo14482s(c3616d2, j7);
        c3616d2.m14617c();
    }
}
