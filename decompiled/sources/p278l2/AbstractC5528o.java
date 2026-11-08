package p278l2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.common.internal.AbstractC3782h;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p003A2.C0019a;
import p368w2.AbstractC6874o;
import p368w2.C6869j;
import p368w2.C6871l;
import p368w2.C6872m;
import p368w2.ServiceConnectionC6860a;

/* renamed from: l2.o */
/* loaded from: classes.dex */
public abstract class AbstractC5528o {

    /* renamed from: a */
    public static final String[] f19925a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    public static final String f19926b = "androidPackageName";

    /* renamed from: c */
    public static final ComponentName f19927c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: d */
    public static final C0019a f19928d = AbstractC5523j.m23153a("GoogleAuthUtil");

    /* renamed from: a */
    public static void m23155a(Context context, String str) {
        m23161g(context, str, 0L);
    }

    /* renamed from: b */
    public static String m23156b(Context context, Account account, String str) {
        return m23157c(context, account, str, new Bundle());
    }

    /* renamed from: c */
    public static String m23157c(Context context, Account account, String str, Bundle bundle) {
        m23170p(account);
        return m23158d(context, account, str, bundle, 0L, null).zza();
    }

    /* renamed from: d */
    public static TokenData m23158d(final Context context, final Account account, final String str, Bundle bundle, long j7, Executor executor) {
        AbstractC3802r.m15128j("Calling this from your main thread can lead to deadlock");
        AbstractC3802r.m15124f(str, "Scope cannot be empty or null.");
        m23170p(account);
        m23166l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m23168n(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && m23171q(context)) {
            try {
                Bundle bundle3 = (Bundle) m23164j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                m23165k(bundle3);
                return m23162h(context, "getTokenWithDetails", bundle3);
            } catch (C3644b e7) {
                m23167m(e7, "token retrieval");
            }
        }
        return (TokenData) m23163i(context, f19927c, new InterfaceC5527n() { // from class: l2.l
            @Override // p278l2.InterfaceC5527n
            /* renamed from: a */
            public final Object mo23154a(IBinder iBinder) {
                return AbstractC5528o.m23159e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    /* renamed from: e */
    public static /* synthetic */ TokenData m23159e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) {
        Bundle zze = zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return m23162h(context, "getTokenWithDetails", zze);
        }
        throw new IOException("Service call returned null");
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ Object m23160f(Object obj) {
        m23165k(obj);
        return obj;
    }

    /* renamed from: g */
    public static void m23161g(Context context, String str, long j7) {
        AbstractC3802r.m15128j("Calling this from your main thread can lead to deadlock");
        m23166l(context, 8400000);
        Bundle bundle = new Bundle();
        m23168n(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && m23171q(context)) {
            zzg zza = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                m23164j(zza.zza(zzbwVar), "clear token");
                return;
            } catch (C3644b e7) {
                m23167m(e7, "clear token");
            }
        }
        m23163i(context, f19927c, new C5526m(str, bundle), 0L, null);
    }

    /* renamed from: h */
    public static TokenData m23162h(Context context, String str, Bundle bundle) {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        m23169o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new C5517d("Invalid state. Shouldn't happen");
    }

    /* renamed from: i */
    public static Object m23163i(Context context, ComponentName componentName, InterfaceC5527n interfaceC5527n, long j7, Executor executor) {
        ServiceConnectionC6860a serviceConnectionC6860a = new ServiceConnectionC6860a();
        AbstractC3782h m15078b = AbstractC3782h.m15078b(context);
        try {
            try {
                if (!m15078b.m15080a(componentName, serviceConnectionC6860a, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return interfaceC5527n.mo23154a(serviceConnectionC6860a.m28237a());
                } catch (RemoteException | InterruptedException | TimeoutException e7) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e7);
                    throw new IOException("Error on service connection.", e7);
                }
            } finally {
                m15078b.m15081d(componentName, serviceConnectionC6860a, "GoogleAuthUtil");
            }
        } catch (SecurityException e8) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e8.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e8);
        }
    }

    /* renamed from: j */
    public static Object m23164j(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e7) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f19928d.m65g(format, new Object[0]);
            throw new IOException(format, e7);
        } catch (CancellationException e8) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f19928d.m65g(format2, new Object[0]);
            throw new IOException(format2, e8);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof C3644b) {
                throw ((C3644b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f19928d.m65g(format3, new Object[0]);
            throw new IOException(format3, e9);
        }
    }

    /* renamed from: k */
    public static Object m23165k(Object obj) {
        if (obj != null) {
            return obj;
        }
        f19928d.m65g("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    /* renamed from: l */
    public static void m23166l(Context context, int i7) {
        try {
            AbstractC6874o.m28279a(context.getApplicationContext(), i7);
        } catch (GooglePlayServicesIncorrectManifestValueException e7) {
            e = e7;
            throw new C5517d(e.getMessage(), e);
        } catch (C6871l e8) {
            e = e8;
            throw new C5517d(e.getMessage(), e);
        } catch (C6872m e9) {
            throw new C5519f(e9.m28277b(), e9.getMessage(), e9.m28298a());
        }
    }

    /* renamed from: m */
    public static void m23167m(C3644b c3644b, String str) {
        f19928d.m65g("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(c3644b));
    }

    /* renamed from: n */
    public static void m23168n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f19926b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    /* renamed from: o */
    public static void m23169o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) {
        zzby zza = zzby.zza(str2);
        C0019a c0019a = f19928d;
        c0019a.m65g(String.format("[GoogleAuthUtil] error status:%s with method:%s", zza, str), new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zza) && !zzby.CAPTCHA.equals(zza) && !zzby.NEED_PERMISSION.equals(zza) && !zzby.NEED_REMOTE_CONSENT.equals(zza) && !zzby.NEEDS_BROWSER.equals(zza) && !zzby.USER_CANCEL.equals(zza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_INTERNAL_ERROR.equals(zza) && !zzby.DM_SYNC_DISABLED.equals(zza) && !zzby.DM_ADMIN_BLOCKED.equals(zza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zza) && !zzby.DM_DEACTIVATED.equals(zza) && !zzby.DM_REQUIRED.equals(zza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zza)) {
            if (!zzby.NETWORK_ERROR.equals(zza) && !zzby.SERVICE_UNAVAILABLE.equals(zza) && !zzby.INTNERNAL_ERROR.equals(zza) && !zzby.AUTH_SECURITY_ERROR.equals(zza) && !zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
                throw new C5517d(str2);
            }
            throw new IOException(str2);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.m14702b(str2, intent, pendingIntent);
        }
        if (C6869j.m28253n().m28273a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Integer valueOf = Integer.valueOf(C3643a.e.API_PRIORITY_OTHER);
            c0019a.m61c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", valueOf, str, valueOf), new Object[0]);
        }
        if (intent == null) {
            c0019a.m61c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    /* renamed from: p */
    public static void m23170p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f19925a;
        for (int i7 = 0; i7 < 3; i7++) {
            if (strArr[i7].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    /* renamed from: q */
    public static boolean m23171q(Context context) {
        if (C6869j.m28253n().mo28258h(context, 17895000) != 0) {
            return false;
        }
        List zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = zzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
