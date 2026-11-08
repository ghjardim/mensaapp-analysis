package p368w2;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC3669Q;
import com.google.android.gms.common.api.internal.C3670S;
import com.google.android.gms.common.api.internal.InterfaceC3696j;
import com.google.android.gms.common.internal.AbstractC3745C;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC3748F;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import org.apache.tika.utils.StringUtils;
import p031E2.AbstractC0272h;
import p031E2.AbstractC0277m;
import p045G2.AbstractC0382c;
import p161X.AbstractActivityC2791u;
import p353u2.AbstractC6602a;
import p353u2.AbstractC6603b;
import p365w.AbstractC6793i;

/* renamed from: w2.j */
/* loaded from: classes.dex */
public class C6869j extends C6870k {

    /* renamed from: c */
    public String f24688c;

    /* renamed from: e */
    public static final Object f24686e = new Object();

    /* renamed from: f */
    public static final C6869j f24687f = new C6869j();

    /* renamed from: d */
    public static final int f24685d = C6870k.f24689a;

    /* renamed from: n */
    public static C6869j m28253n() {
        return f24687f;
    }

    @Override // p368w2.C6870k
    /* renamed from: b */
    public Intent mo28254b(Context context, int i7, String str) {
        return super.mo28254b(context, i7, str);
    }

    @Override // p368w2.C6870k
    /* renamed from: c */
    public PendingIntent mo28255c(Context context, int i7, int i8) {
        return super.mo28255c(context, i7, i8);
    }

    @Override // p368w2.C6870k
    /* renamed from: e */
    public final String mo28256e(int i7) {
        return super.mo28256e(i7);
    }

    @Override // p368w2.C6870k
    /* renamed from: g */
    public int mo28257g(Context context) {
        return super.mo28257g(context);
    }

    @Override // p368w2.C6870k
    /* renamed from: h */
    public int mo28258h(Context context, int i7) {
        return super.mo28258h(context, i7);
    }

    @Override // p368w2.C6870k
    /* renamed from: j */
    public final boolean mo28259j(int i7) {
        return super.mo28259j(i7);
    }

    /* renamed from: l */
    public Dialog m28260l(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return m28264q(activity, i7, AbstractDialogInterfaceOnClickListenerC3748F.m15027b(activity, mo28254b(activity, i7, "d"), i8), onCancelListener, null);
    }

    /* renamed from: m */
    public PendingIntent m28261m(Context context, C6861b c6861b) {
        return c6861b.m28240A0() ? c6861b.m28244z0() : mo28255c(context, c6861b.m28242x0(), 0);
    }

    /* renamed from: o */
    public boolean m28262o(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m28260l = m28260l(activity, i7, i8, onCancelListener);
        if (m28260l == null) {
            return false;
        }
        m28267t(activity, m28260l, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: p */
    public void m28263p(Context context, int i7) {
        m28268u(context, i7, null, m28274d(context, i7, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final Dialog m28264q(Context context, int i7, AbstractDialogInterfaceOnClickListenerC3748F abstractDialogInterfaceOnClickListenerC3748F, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC3745C.m15020c(context, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m15019b = AbstractC3745C.m15019b(context, i7);
        if (m15019b != null) {
            if (abstractDialogInterfaceOnClickListenerC3748F == null) {
                abstractDialogInterfaceOnClickListenerC3748F = onClickListener;
            }
            builder.setPositiveButton(m15019b, abstractDialogInterfaceOnClickListenerC3748F);
        }
        String m15023f = AbstractC3745C.m15023f(context, i7);
        if (m15023f != null) {
            builder.setTitle(m15023f);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: r */
    public final Dialog m28265r(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC3745C.m15020c(activity, 18));
        builder.setPositiveButton(StringUtils.EMPTY, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m28267t(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: s */
    public final C3670S m28266s(Context context, AbstractC3669Q abstractC3669Q) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C3670S c3670s = new C3670S(abstractC3669Q);
        zao.zaa(context, c3670s, intentFilter);
        c3670s.m14896a(context);
        if (m28275i(context, "com.google.android.gms")) {
            return c3670s;
        }
        abstractC3669Q.mo14895a();
        c3670s.m14897b();
        return null;
    }

    /* renamed from: t */
    public final void m28267t(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2791u) {
                C6877r.m28297P1(dialog, onCancelListener).mo9794O1(((AbstractActivityC2791u) activity).m9927Y(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC6862c.m28245a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: u */
    public final void m28268u(Context context, int i7, String str, PendingIntent pendingIntent) {
        int i8;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            m28269v(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m15022e = AbstractC3745C.m15022e(context, i7);
        String m15021d = AbstractC3745C.m15021d(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC3802r.m15129k(context.getSystemService("notification"));
        AbstractC6793i.e m27889v = new AbstractC6793i.e(context).m27883p(true).m27872e(true).m27877j(m15022e).m27889v(new AbstractC6793i.c().m27866h(m15021d));
        if (AbstractC0272h.m1119c(context)) {
            AbstractC3802r.m15132n(AbstractC0277m.m1131b());
            m27889v.m27887t(context.getApplicationInfo().icon).m27885r(2);
            if (AbstractC0272h.m1120d(context)) {
                m27889v.m27869a(AbstractC6602a.f23901a, resources.getString(AbstractC6603b.f23916o), pendingIntent);
            } else {
                m27889v.m27875h(pendingIntent);
            }
        } else {
            m27889v.m27887t(R.drawable.stat_sys_warning).m27890w(resources.getString(AbstractC6603b.f23909h)).m27893z(System.currentTimeMillis()).m27875h(pendingIntent).m27876i(m15021d);
        }
        if (AbstractC0277m.m1134e()) {
            AbstractC3802r.m15132n(AbstractC0277m.m1134e());
            synchronized (f24686e) {
                str2 = this.f24688c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(AbstractC6603b.f23908g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC6868i.m28252a("com.google.android.gms.availability", string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            m27889v.m27873f(str2);
        }
        Notification m27870b = m27889v.m27870b();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            AbstractC6874o.f24695b.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, m27870b);
    }

    /* renamed from: v */
    public final void m28269v(Context context) {
        new HandlerC6879t(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: w */
    public final boolean m28270w(Activity activity, InterfaceC3696j interfaceC3696j, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m28264q = m28264q(activity, i7, AbstractDialogInterfaceOnClickListenerC3748F.m15028c(interfaceC3696j, mo28254b(activity, i7, "d"), 2), onCancelListener, null);
        if (m28264q == null) {
            return false;
        }
        m28267t(activity, m28264q, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: x */
    public final boolean m28271x(Context context, C6861b c6861b, int i7) {
        PendingIntent m28261m;
        if (AbstractC0382c.m1569a(context) || (m28261m = m28261m(context, c6861b)) == null) {
            return false;
        }
        m28268u(context, c6861b.m28242x0(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m14793a(context, m28261m, i7, true), zap.zaa | 134217728));
        return true;
    }
}
