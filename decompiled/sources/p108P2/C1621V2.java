package p108P2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.V2 */
/* loaded from: classes.dex */
public final class C1621V2 extends BroadcastReceiver {

    /* renamed from: a */
    public final C1828s7 f4957a;

    /* renamed from: b */
    public boolean f4958b;

    /* renamed from: c */
    public boolean f4959c;

    public C1621V2(C1828s7 c1828s7) {
        AbstractC3802r.m15129k(c1828s7);
        this.f4957a = c1828s7;
    }

    /* renamed from: b */
    public final void m5972b() {
        C1828s7 c1828s7 = this.f4957a;
        c1828s7.m6354r();
        c1828s7.mo5628f().mo5762h();
        if (this.f4958b) {
            return;
        }
        c1828s7.mo5625c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f4959c = c1828s7.m6309I0().m5964o();
        c1828s7.mo5624b().m5940v().m5903b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f4959c));
        this.f4958b = true;
    }

    /* renamed from: c */
    public final void m5973c() {
        C1828s7 c1828s7 = this.f4957a;
        c1828s7.m6354r();
        c1828s7.mo5628f().mo5762h();
        c1828s7.mo5628f().mo5762h();
        if (this.f4958b) {
            c1828s7.mo5624b().m5940v().m5902a("Unregistering connectivity change receiver");
            this.f4958b = false;
            this.f4959c = false;
            try {
                c1828s7.mo5625c().unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                this.f4957a.mo5624b().m5936r().m5903b("Failed to unregister the network broadcast receiver", e7);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1828s7 c1828s7 = this.f4957a;
        c1828s7.m6354r();
        String action = intent.getAction();
        c1828s7.mo5624b().m5940v().m5903b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c1828s7.mo5624b().m5941w().m5903b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m5964o = c1828s7.m6309I0().m5964o();
        if (this.f4959c != m5964o) {
            this.f4959c = m5964o;
            c1828s7.mo5628f().m6446A(new RunnableC1613U2(this, m5964o));
        }
    }
}
