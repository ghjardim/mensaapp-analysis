package p128S1;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p061I4.C0658j;
import p061I4.C0659k;
import p069J5.InterfaceC0800l;
import p115Q2.AbstractC2065b;
import p115Q2.InterfaceC2068c;
import p371w5.C6934q;

/* renamed from: S1.e */
/* loaded from: classes.dex */
public final class C2310e implements C0659k.c {

    /* renamed from: c */
    public Activity f7006c;

    public C2310e(Activity activity) {
        AbstractC5469l.m23028e(activity, "activity");
        this.f7006c = activity;
    }

    /* renamed from: e */
    public static final C6934q m7822e(C0659k.d dVar, Integer num) {
        dVar.mo2314a(Boolean.valueOf(num != null && num.intValue() == 0));
        return C6934q.f24811a;
    }

    /* renamed from: f */
    public static final void m7823f(InterfaceC0800l interfaceC0800l, Object obj) {
        interfaceC0800l.invoke(obj);
    }

    /* renamed from: g */
    public static final void m7824g(C0659k.d dVar, Exception e7) {
        AbstractC5469l.m23028e(e7, "e");
        dVar.mo2315b("Error", e7.getMessage(), null);
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j call, final C0659k.d result) {
        AbstractC5469l.m23028e(call, "call");
        AbstractC5469l.m23028e(result, "result");
        String str = call.f2254a;
        if (AbstractC5469l.m23024a(str, "saveLoyaltyPass")) {
            String str2 = (String) call.m2647a("loyalty_pass");
            if (str2 == null) {
                result.mo2315b("BadArgument", "Loyalty pass null", null);
                return;
            }
            InterfaceC2068c m7162a = AbstractC2065b.m7162a(this.f7006c);
            AbstractC5469l.m23027d(m7162a, "getClient(...)");
            m7162a.savePasses(str2, this.f7006c, PipesIterator.DEFAULT_QUEUE_SIZE);
            return;
        }
        if (!AbstractC5469l.m23024a(str, "isGoogleWalletApiAvailable")) {
            result.mo2316c();
            return;
        }
        InterfaceC2068c m7162a2 = AbstractC2065b.m7162a(this.f7006c);
        AbstractC5469l.m23027d(m7162a2, "getClient(...)");
        Task payApiAvailabilityStatus = m7162a2.getPayApiAvailabilityStatus(2);
        final InterfaceC0800l interfaceC0800l = new InterfaceC0800l() { // from class: S1.b
            @Override // p069J5.InterfaceC0800l
            public final Object invoke(Object obj) {
                C6934q m7822e;
                m7822e = C2310e.m7822e(C0659k.d.this, (Integer) obj);
                return m7822e;
            }
        };
        AbstractC5469l.m23025b(payApiAvailabilityStatus.addOnSuccessListener(new OnSuccessListener() { // from class: S1.c
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C2310e.m7823f(InterfaceC0800l.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: S1.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C2310e.m7824g(C0659k.d.this, exc);
            }
        }));
    }
}
