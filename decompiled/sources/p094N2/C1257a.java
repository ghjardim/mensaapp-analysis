package p094N2;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.List;
import java.util.Map;
import p108P2.C1460C3;
import p108P2.C1799p5;

/* renamed from: N2.a */
/* loaded from: classes.dex */
public final class C1257a extends AbstractC1259c {

    /* renamed from: a */
    public final C1460C3 f3982a;

    /* renamed from: b */
    public final C1799p5 f3983b;

    public C1257a(C1460C3 c1460c3) {
        super(null);
        AbstractC3802r.m15129k(c1460c3);
        this.f3982a = c1460c3;
        this.f3983b = c1460c3.m5613K();
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: a */
    public final List mo4809a(String str, String str2) {
        return this.f3983b.m6221t0(str, str2);
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: b */
    public final Map mo4810b(String str, String str2, boolean z6) {
        return this.f3983b.m6222u0(str, str2, z6);
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: c */
    public final void mo4811c(Bundle bundle) {
        this.f3983b.m6197R(bundle);
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: d */
    public final void mo4812d(String str, String str2, Bundle bundle) {
        this.f3983b.m6182C(str, str2, bundle);
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: e */
    public final void mo4813e(String str) {
        C1460C3 c1460c3 = this.f3982a;
        c1460c3.m5604A().m5745l(str, c1460c3.mo5626d().mo1111b());
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: f */
    public final void mo4814f(String str, String str2, Bundle bundle) {
        this.f3982a.m5613K().m6226x(str, str2, bundle);
    }

    @Override // p108P2.InterfaceC1808q5
    /* renamed from: g */
    public final void mo4815g(String str) {
        C1460C3 c1460c3 = this.f3982a;
        c1460c3.m5604A().m5746m(str, c1460c3.mo5626d().mo1111b());
    }

    @Override // p108P2.InterfaceC1808q5
    public final int zza(String str) {
        this.f3983b.m6212j0(str);
        return 25;
    }

    @Override // p108P2.InterfaceC1808q5
    public final long zzb() {
        return this.f3982a.m5619Q().m5684C0();
    }

    @Override // p108P2.InterfaceC1808q5
    public final String zzh() {
        return this.f3983b.m6217p0();
    }

    @Override // p108P2.InterfaceC1808q5
    public final String zzi() {
        return this.f3983b.m6218q0();
    }

    @Override // p108P2.InterfaceC1808q5
    public final String zzj() {
        return this.f3983b.m6219r0();
    }

    @Override // p108P2.InterfaceC1808q5
    public final String zzk() {
        return this.f3983b.m6217p0();
    }
}
