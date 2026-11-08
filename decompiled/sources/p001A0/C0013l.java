package p001A0;

import android.util.Log;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.l */
/* loaded from: classes.dex */
public final class C0013l implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f77a;

    /* renamed from: b */
    public InterfaceC0861T f78b;

    /* renamed from: c */
    public long f79c = -9223372036854775807L;

    /* renamed from: d */
    public long f80d = 0;

    /* renamed from: e */
    public int f81e = -1;

    public C0013l(C7107h c7107h) {
        this.f77a = c7107h;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f79c = j7;
        this.f80d = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 1);
        this.f78b = mo455b;
        mo455b.mo566e(this.f77a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        int m29300b;
        AbstractC5332a.m21800e(this.f78b);
        int i8 = this.f81e;
        if (i8 != -1 && i7 != (m29300b = C7104e.m29300b(i8))) {
            Log.w("RtpPcmReader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
        }
        long m54a = AbstractC0014m.m54a(this.f80d, j7, this.f79c, this.f77a.f25274b);
        int m21942a = c5357z.m21942a();
        this.f78b.mo564d(c5357z, m21942a);
        this.f78b.mo562c(m54a, 1, m21942a, 0, null);
        this.f81e = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        this.f79c = j7;
    }
}
