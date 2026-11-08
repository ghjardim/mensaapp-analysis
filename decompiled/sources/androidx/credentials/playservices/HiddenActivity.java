package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p066J2.AbstractC0705a;
import p069J5.InterfaceC0800l;
import p080L2.C0982u;
import p084M.AbstractC1142a;
import p313p2.AbstractC6112g;
import p313p2.C6107b;
import p313p2.C6108c;
import p313p2.C6111f;
import p313p2.C6114i;
import p313p2.C6115j;
import p371w5.C6934q;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c */
    public static final C3250a f10352c = new C3250a(null);

    /* renamed from: a */
    public ResultReceiver f10353a;

    /* renamed from: b */
    public boolean f10354b;

    /* renamed from: androidx.credentials.playservices.HiddenActivity$a */
    public static final class C3250a {
        public /* synthetic */ C3250a(AbstractC5464g abstractC5464g) {
            this();
        }

        public C3250a() {
        }
    }

    /* renamed from: androidx.credentials.playservices.HiddenActivity$b */
    public static final class C3251b extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: b */
        public final /* synthetic */ int f10356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3251b(int i7) {
            super(1);
            this.f10356b = i7;
        }

        /* renamed from: a */
        public final void m12047a(C6108c c6108c) {
            try {
                HiddenActivity.this.f10354b = true;
                HiddenActivity.this.startIntentSenderForResult(c6108c.m25488x0().getIntentSender(), this.f10356b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f10353a;
                AbstractC5469l.m23025b(resultReceiver);
                hiddenActivity.m12046y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e7.getMessage());
            }
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12047a((C6108c) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: androidx.credentials.playservices.HiddenActivity$c */
    public static final class C3252c extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: b */
        public final /* synthetic */ int f10358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3252c(int i7) {
            super(1);
            this.f10358b = i7;
        }

        /* renamed from: a */
        public final void m12048a(C6115j c6115j) {
            try {
                HiddenActivity.this.f10354b = true;
                HiddenActivity.this.startIntentSenderForResult(c6115j.m25512x0().getIntentSender(), this.f10358b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f10353a;
                AbstractC5469l.m23025b(resultReceiver);
                hiddenActivity.m12046y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e7.getMessage());
            }
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12048a((C6115j) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: androidx.credentials.playservices.HiddenActivity$d */
    public static final class C3253d extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: b */
        public final /* synthetic */ int f10360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3253d(int i7) {
            super(1);
            this.f10360b = i7;
        }

        /* renamed from: a */
        public final void m12049a(PendingIntent result) {
            AbstractC5469l.m23028e(result, "result");
            try {
                HiddenActivity.this.f10354b = true;
                HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), this.f10360b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f10353a;
                AbstractC5469l.m23025b(resultReceiver);
                hiddenActivity.m12046y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e7.getMessage());
            }
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12049a((PendingIntent) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: androidx.credentials.playservices.HiddenActivity$e */
    public static final class C3254e extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: b */
        public final /* synthetic */ int f10362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3254e(int i7) {
            super(1);
            this.f10362b = i7;
        }

        /* renamed from: a */
        public final void m12050a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.f10354b = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f10362b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e7) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f10353a;
                AbstractC5469l.m23025b(resultReceiver);
                hiddenActivity.m12046y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e7.getMessage());
            }
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12050a((PendingIntent) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: m */
    public static final void m12033m(InterfaceC0800l tmp0, Object obj) {
        AbstractC5469l.m23028e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m12034n(HiddenActivity this$0, Exception e7) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(e7, "e");
        String str = ((e7 instanceof C3644b) && AbstractC1142a.f3691a.m4414a().contains(Integer.valueOf(((C3644b) e7).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = this$0.f10353a;
        AbstractC5469l.m23025b(resultReceiver);
        this$0.m12046y(resultReceiver, str, "During begin sign in, failure response from one tap: " + e7.getMessage());
    }

    /* renamed from: p */
    public static final void m12035p(InterfaceC0800l tmp0, Object obj) {
        AbstractC5469l.m23028e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m12036q(HiddenActivity this$0, Exception e7) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(e7, "e");
        String str = ((e7 instanceof C3644b) && AbstractC1142a.f3691a.m4414a().contains(Integer.valueOf(((C3644b) e7).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = this$0.f10353a;
        AbstractC5469l.m23025b(resultReceiver);
        this$0.m12046y(resultReceiver, str, "During save password, found password failure response from one tap " + e7.getMessage());
    }

    /* renamed from: s */
    public static final void m12037s(InterfaceC0800l tmp0, Object obj) {
        AbstractC5469l.m23028e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m12038t(HiddenActivity this$0, Exception e7) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(e7, "e");
        String str = ((e7 instanceof C3644b) && AbstractC1142a.f3691a.m4414a().contains(Integer.valueOf(((C3644b) e7).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = this$0.f10353a;
        AbstractC5469l.m23025b(resultReceiver);
        this$0.m12046y(resultReceiver, str, "During create public key credential, fido registration failure: " + e7.getMessage());
    }

    /* renamed from: v */
    public static final void m12039v(InterfaceC0800l tmp0, Object obj) {
        AbstractC5469l.m23028e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m12040w(HiddenActivity this$0, Exception e7) {
        AbstractC5469l.m23028e(this$0, "this$0");
        AbstractC5469l.m23028e(e7, "e");
        String str = ((e7 instanceof C3644b) && AbstractC1142a.f3691a.m4414a().contains(Integer.valueOf(((C3644b) e7).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = this$0.f10353a;
        AbstractC5469l.m23025b(resultReceiver);
        this$0.m12046y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
    }

    /* renamed from: l */
    public final void m12041l() {
        Task task;
        C6107b c6107b = (C6107b) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c6107b != null) {
            Task beginSignIn = AbstractC6112g.m25503b(this).beginSignIn(c6107b);
            final C3251b c3251b = new C3251b(intExtra);
            task = beginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: L.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m12033m(InterfaceC0800l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: L.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m12034n(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* renamed from: o */
    public final void m12042o() {
        Task task;
        C6114i c6114i = (C6114i) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c6114i != null) {
            Task savePassword = AbstractC6112g.m25502a(this).savePassword(c6114i);
            final C3252c c3252c = new C3252c(intExtra);
            task = savePassword.addOnSuccessListener(new OnSuccessListener() { // from class: L.c
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m12035p(InterfaceC0800l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: L.d
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m12036q(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i7);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f10353a;
        if (resultReceiver != null) {
            resultReceiver.send(i8, bundle);
        }
        this.f10354b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f10353a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        m12045x(bundle);
        if (this.f10354b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        m12041l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        m12043r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        m12042o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        m12044u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC5469l.m23028e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f10354b);
        super.onSaveInstanceState(outState);
    }

    /* renamed from: r */
    public final void m12043r() {
        Task task;
        C0982u c0982u = (C0982u) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c0982u != null) {
            Task m3443d = AbstractC0705a.m2990a(this).m3443d(c0982u);
            final C3253d c3253d = new C3253d(intExtra);
            task = m3443d.addOnSuccessListener(new OnSuccessListener() { // from class: L.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m12037s(InterfaceC0800l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: L.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m12038t(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* renamed from: u */
    public final void m12044u() {
        Task task;
        C6111f c6111f = (C6111f) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c6111f != null) {
            Task signInIntent = AbstractC6112g.m25503b(this).getSignInIntent(c6111f);
            final C3254e c3254e = new C3254e(intExtra);
            task = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: L.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m12039v(InterfaceC0800l.this, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: L.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.m12040w(HiddenActivity.this, exc);
                }
            });
        } else {
            task = null;
        }
        if (task == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* renamed from: x */
    public final void m12045x(Bundle bundle) {
        if (bundle != null) {
            this.f10354b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* renamed from: y */
    public final void m12046y(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(C3643a.e.API_PRIORITY_OTHER, bundle);
        finish();
    }
}
