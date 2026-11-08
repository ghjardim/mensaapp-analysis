package p346t3;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import p219e3.C4176f;
import p382y2.AbstractC7065a;

/* renamed from: t3.A */
/* loaded from: classes.dex */
public abstract class AbstractC6458A extends AbstractC7065a implements InterfaceC6499c0 {
    /* renamed from: A0 */
    public abstract AbstractC6472H mo26952A0();

    /* renamed from: B0 */
    public abstract List mo26953B0();

    /* renamed from: C0 */
    public abstract String mo26954C0();

    /* renamed from: D0 */
    public abstract boolean mo26955D0();

    /* renamed from: E0 */
    public Task m26956E0(AbstractC6508h abstractC6508h) {
        AbstractC3802r.m15129k(abstractC6508h);
        return FirebaseAuth.getInstance(mo26971S0()).m15336T(this, abstractC6508h);
    }

    /* renamed from: F0 */
    public Task m26957F0(AbstractC6508h abstractC6508h) {
        AbstractC3802r.m15129k(abstractC6508h);
        return FirebaseAuth.getInstance(mo26971S0()).m15381x0(this, abstractC6508h);
    }

    /* renamed from: G0 */
    public Task m26958G0() {
        return FirebaseAuth.getInstance(mo26971S0()).m15366o0(this);
    }

    /* renamed from: H0 */
    public Task m26959H0() {
        return FirebaseAuth.getInstance(mo26971S0()).m15341Y(this, false).continueWithTask(new C6511i0(this));
    }

    /* renamed from: I0 */
    public Task m26960I0(C6502e c6502e) {
        return FirebaseAuth.getInstance(mo26971S0()).m15341Y(this, false).continueWithTask(new C6515k0(this, c6502e));
    }

    /* renamed from: J0 */
    public Task m26961J0(Activity activity, AbstractC6520n abstractC6520n) {
        AbstractC3802r.m15129k(activity);
        AbstractC3802r.m15129k(abstractC6520n);
        return FirebaseAuth.getInstance(mo26971S0()).m15327L(activity, abstractC6520n, this);
    }

    /* renamed from: K0 */
    public Task m26962K0(Activity activity, AbstractC6520n abstractC6520n) {
        AbstractC3802r.m15129k(activity);
        AbstractC3802r.m15129k(abstractC6520n);
        return FirebaseAuth.getInstance(mo26971S0()).m15364n0(activity, abstractC6520n, this);
    }

    /* renamed from: L0 */
    public Task m26963L0(String str) {
        AbstractC3802r.m15123e(str);
        return FirebaseAuth.getInstance(mo26971S0()).m15368p0(this, str);
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: M */
    public abstract String mo26964M();

    /* renamed from: M0 */
    public Task m26965M0(String str) {
        AbstractC3802r.m15123e(str);
        return FirebaseAuth.getInstance(mo26971S0()).m15379w0(this, str);
    }

    /* renamed from: N0 */
    public Task m26966N0(String str) {
        AbstractC3802r.m15123e(str);
        return FirebaseAuth.getInstance(mo26971S0()).m15385z0(this, str);
    }

    /* renamed from: O0 */
    public Task m26967O0(C6483O c6483o) {
        return FirebaseAuth.getInstance(mo26971S0()).m15338V(this, c6483o);
    }

    /* renamed from: P0 */
    public Task m26968P0(C6501d0 c6501d0) {
        AbstractC3802r.m15129k(c6501d0);
        return FirebaseAuth.getInstance(mo26971S0()).m15339W(this, c6501d0);
    }

    /* renamed from: Q0 */
    public Task m26969Q0(String str) {
        return m26970R0(str, null);
    }

    /* renamed from: R0 */
    public Task m26970R0(String str, C6502e c6502e) {
        return FirebaseAuth.getInstance(mo26971S0()).m15341Y(this, false).continueWithTask(new C6513j0(this, str, c6502e));
    }

    /* renamed from: S0 */
    public abstract C4176f mo26971S0();

    /* renamed from: T0 */
    public abstract AbstractC6458A mo26972T0(List list);

    /* renamed from: U0 */
    public abstract void mo26973U0(zzagw zzagwVar);

    /* renamed from: V0 */
    public abstract AbstractC6458A mo26974V0();

    /* renamed from: W0 */
    public abstract void mo26975W0(List list);

    /* renamed from: X0 */
    public abstract zzagw mo26976X0();

    /* renamed from: Y0 */
    public abstract void mo26977Y0(List list);

    /* renamed from: Z0 */
    public abstract List mo26978Z0();

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: a */
    public abstract String mo26979a();

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: f0 */
    public abstract String mo26980f0();

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: m */
    public abstract Uri mo26981m();

    /* renamed from: x0 */
    public Task m26982x0() {
        return FirebaseAuth.getInstance(mo26971S0()).m15334R(this);
    }

    @Override // p346t3.InterfaceC6499c0
    /* renamed from: y */
    public abstract String mo26983y();

    /* renamed from: y0 */
    public Task m26984y0(boolean z6) {
        return FirebaseAuth.getInstance(mo26971S0()).m15341Y(this, z6);
    }

    /* renamed from: z0 */
    public abstract InterfaceC6460B mo26985z0();

    public abstract String zzd();

    public abstract String zze();

    public abstract List zzg();
}
