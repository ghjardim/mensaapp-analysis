package p108P2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzqr;
import p256j$.util.Objects;

/* renamed from: P2.J7 */
/* loaded from: classes.dex */
public final class C1527J7 extends BroadcastReceiver {

    /* renamed from: a */
    public final C1460C3 f4783a;

    public C1527J7(C1460C3 c1460c3) {
        this.f4783a = c1460c3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c7;
        if (intent == null) {
            this.f4783a.mo5624b().m5941w().m5902a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f4783a.mo5624b().m5941w().m5902a("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                c7 = 1;
            }
            c7 = 65535;
        } else {
            if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                c7 = 0;
            }
            c7 = 65535;
        }
        if (c7 == 0) {
            final C1460C3 c1460c3 = this.f4783a;
            zzqr.zzb();
            if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5363X0)) {
                c1460c3.mo5624b().m5940v().m5902a("App receiver notified triggers are available");
                c1460c3.mo5628f().m6446A(new Runnable() { // from class: P2.H7
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1460C3 c1460c32 = C1460C3.this;
                        if (!c1460c32.m5619Q().m5715f0()) {
                            c1460c32.mo5624b().m5941w().m5902a("registerTrigger called but app not eligible");
                            return;
                        }
                        c1460c32.m5613K().m6225w();
                        final C1799p5 m5613K = c1460c32.m5613K();
                        Objects.requireNonNull(m5613K);
                        new Thread(new Runnable() { // from class: P2.G7
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1799p5.this.m6228z();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        if (c7 != 1) {
            this.f4783a.mo5624b().m5941w().m5902a("App receiver called with unknown action");
            return;
        }
        C1460C3 c1460c32 = this.f4783a;
        if (c1460c32.m5605B().m6138P(null, AbstractC1805q2.f5353S0)) {
            c1460c32.mo5624b().m5940v().m5902a("[sgtm] App Receiver notified batches are available");
            c1460c32.mo5628f().m6446A(new Runnable() { // from class: P2.I7
                @Override // java.lang.Runnable
                public final void run() {
                    C1527J7.this.f4783a.m5615M().m6555q(((Long) AbstractC1805q2.f5322D.m6159a(null)).longValue());
                }
            });
        }
    }
}
