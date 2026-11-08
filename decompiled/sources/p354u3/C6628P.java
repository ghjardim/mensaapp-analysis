package p354u3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import com.google.android.gms.internal.p395firebaseauthapi.zzaj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p031E2.C0271g;
import p346t3.AbstractC6458A;
import p382y2.AbstractC7069e;

/* renamed from: u3.P */
/* loaded from: classes.dex */
public final class C6628P {

    /* renamed from: d */
    public static long f23966d = 3600000;

    /* renamed from: e */
    public static final zzaj f23967e = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: f */
    public static final C6628P f23968f = new C6628P();

    /* renamed from: a */
    public Task f23969a;

    /* renamed from: b */
    public Task f23970b;

    /* renamed from: c */
    public long f23971c = 0;

    /* renamed from: b */
    public static void m27506b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.m14803z0());
        edit.putString("statusMessage", status.m14796A0());
        edit.putLong("timestamp", C0271g.m1116d().mo1110a());
        edit.commit();
    }

    /* renamed from: c */
    public static void m27507c(Context context, zzaic zzaicVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", AbstractC7069e.m29148f(zzaicVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", C0271g.m1116d().mo1110a());
        edit.commit();
    }

    /* renamed from: d */
    public static void m27508d(Context context, FirebaseAuth firebaseAuth) {
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15129k(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.m15359l().m17533q());
        edit.commit();
    }

    /* renamed from: e */
    public static void m27509e(Context context, FirebaseAuth firebaseAuth, AbstractC6458A abstractC6458A) {
        AbstractC3802r.m15129k(context);
        AbstractC3802r.m15129k(firebaseAuth);
        AbstractC3802r.m15129k(abstractC6458A);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.m15359l().m17533q());
        edit.putString("firebaseUserUid", abstractC6458A.mo26979a());
        edit.commit();
    }

    /* renamed from: f */
    public static void m27510f(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong("timestamp", C0271g.m1116d().mo1110a());
        edit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m27511g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaj zzajVar = f23967e;
        int size = zzajVar.size();
        int i7 = 0;
        while (i7 < size) {
            E e7 = zzajVar.get(i7);
            i7++;
            edit.remove((String) e7);
        }
        edit.commit();
    }

    /* renamed from: j */
    public static C6628P m27512j() {
        return f23968f;
    }

    /* renamed from: a */
    public final void m27513a(Context context) {
        AbstractC3802r.m15129k(context);
        m27511g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f23969a = null;
        this.f23971c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L12;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m27514h(com.google.firebase.auth.FirebaseAuth r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p354u3.C6628P.m27514h(com.google.firebase.auth.FirebaseAuth):void");
    }

    /* renamed from: i */
    public final Task m27515i() {
        if (C0271g.m1116d().mo1110a() - this.f23971c < f23966d) {
            return this.f23970b;
        }
        return null;
    }
}
