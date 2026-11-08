package p377x4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC3345j;
import androidx.lifecycle.C3350o;
import androidx.lifecycle.InterfaceC3349n;
import io.flutter.embedding.engine.C4659a;
import io.flutter.plugin.platform.C4767i;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p047G4.AbstractC0465a;
import p370w4.AbstractC6917b;
import p377x4.AbstractC6985k;
import p377x4.C6984j;
import p384y4.C7084j;

/* renamed from: x4.i */
/* loaded from: classes.dex */
public abstract class AbstractActivityC6983i extends Activity implements C6984j.c, InterfaceC3349n {

    /* renamed from: e */
    public static final int f25000e = View.generateViewId();

    /* renamed from: a */
    public boolean f25001a = false;

    /* renamed from: b */
    public C6984j f25002b;

    /* renamed from: c */
    public C3350o f25003c;

    /* renamed from: d */
    public final OnBackInvokedCallback f25004d;

    /* renamed from: x4.i$a */
    public class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            AbstractActivityC6983i.this.m28606G();
        }

        public void onBackInvoked() {
            AbstractActivityC6983i.this.m28607H();
        }

        public void onBackProgressed(BackEvent backEvent) {
            AbstractActivityC6983i.this.m28622W(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            AbstractActivityC6983i.this.m28618S(backEvent);
        }
    }

    public AbstractActivityC6983i() {
        this.f25004d = Build.VERSION.SDK_INT < 33 ? null : m28611L();
        this.f25003c = new C3350o(this);
    }

    @Override // p377x4.C6984j.c
    /* renamed from: B */
    public String mo28601B() {
        try {
            Bundle m28614O = m28614O();
            if (m28614O != null) {
                return m28614O.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // p377x4.C6984j.c
    /* renamed from: C */
    public String mo28602C() {
        String dataString;
        if (m28615P() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: D */
    public C7084j mo28603D() {
        return C7084j.m29181a(getIntent());
    }

    @Override // p377x4.C6984j.c
    /* renamed from: E */
    public EnumC6972P mo28604E() {
        return m28612M() == AbstractC6985k.a.opaque ? EnumC6972P.surface : EnumC6972P.texture;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: F */
    public EnumC6973Q mo28605F() {
        return m28612M() == AbstractC6985k.a.opaque ? EnumC6973Q.opaque : EnumC6973Q.transparent;
    }

    /* renamed from: G */
    public void m28606G() {
        if (m28619T("cancelBackGesture")) {
            this.f25002b.m28663h();
        }
    }

    /* renamed from: H */
    public void m28607H() {
        if (m28619T("commitBackGesture")) {
            this.f25002b.m28664i();
        }
    }

    /* renamed from: I */
    public final void m28608I() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    /* renamed from: J */
    public final void m28609J() {
        if (m28612M() == AbstractC6985k.a.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: K */
    public final View m28610K() {
        return this.f25002b.m28676u(null, null, null, f25000e, mo28604E() == EnumC6972P.surface);
    }

    /* renamed from: L */
    public final OnBackInvokedCallback m28611L() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new OnBackInvokedCallback() { // from class: x4.h
            public final void onBackInvoked() {
                AbstractActivityC6983i.this.onBackPressed();
            }
        };
    }

    /* renamed from: M */
    public AbstractC6985k.a m28612M() {
        return getIntent().hasExtra("background_mode") ? AbstractC6985k.a.valueOf(getIntent().getStringExtra("background_mode")) : AbstractC6985k.a.opaque;
    }

    /* renamed from: N */
    public C4659a m28613N() {
        return this.f25002b.m28669n();
    }

    /* renamed from: O */
    public Bundle m28614O() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    /* renamed from: P */
    public final boolean m28615P() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: Q */
    public void m28616Q() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f25004d);
            this.f25001a = true;
        }
    }

    /* renamed from: R */
    public void m28617R() {
        m28621V();
        C6984j c6984j = this.f25002b;
        if (c6984j != null) {
            c6984j.m28657J();
            this.f25002b = null;
        }
    }

    /* renamed from: S */
    public void m28618S(BackEvent backEvent) {
        if (m28619T("startBackGesture")) {
            this.f25002b.m28659L(backEvent);
        }
    }

    /* renamed from: T */
    public final boolean m28619T(String str) {
        C6984j c6984j = this.f25002b;
        if (c6984j == null) {
            AbstractC6917b.m28359g("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after release.");
            return false;
        }
        if (c6984j.m28670o()) {
            return true;
        }
        AbstractC6917b.m28359g("FlutterActivity", "FlutterActivity " + hashCode() + StringUtils.SPACE + str + " called after detach.");
        return false;
    }

    /* renamed from: U */
    public final void m28620U() {
        try {
            Bundle m28614O = m28614O();
            if (m28614O != null) {
                int i7 = m28614O.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i7 != -1) {
                    setTheme(i7);
                }
            } else {
                AbstractC6917b.m28358f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC6917b.m28354b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: V */
    public void m28621V() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f25004d);
            this.f25001a = false;
        }
    }

    /* renamed from: W */
    public void m28622W(BackEvent backEvent) {
        if (m28619T("updateBackGestureProgress")) {
            this.f25002b.m28660M(backEvent);
        }
    }

    @Override // p377x4.C6984j.c, androidx.lifecycle.InterfaceC3349n
    /* renamed from: a */
    public AbstractC3345j mo9642a() {
        return this.f25003c;
    }

    @Override // io.flutter.plugin.platform.C4767i.d
    /* renamed from: b */
    public boolean mo20544b() {
        return false;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: d */
    public void mo28624d() {
        AbstractC6917b.m28359g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + m28613N() + " evicted by another attaching activity");
        C6984j c6984j = this.f25002b;
        if (c6984j != null) {
            c6984j.m28677v();
            this.f25002b.m28678w();
        }
    }

    @Override // p377x4.C6984j.c
    /* renamed from: e */
    public void mo28625e() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.C4767i.d
    /* renamed from: f */
    public void mo20545f(boolean z6) {
        if (z6 && !this.f25001a) {
            m28616Q();
        } else {
            if (z6 || !this.f25001a) {
                return;
            }
            m28621V();
        }
    }

    @Override // p377x4.C6984j.c
    /* renamed from: i */
    public List mo28627i() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // p377x4.C6984j.c
    /* renamed from: j */
    public String mo28628j() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // p377x4.C6984j.c
    /* renamed from: k */
    public boolean mo28629k() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : mo28628j() == null;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: l */
    public String mo28630l() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle m28614O = m28614O();
            String string = m28614O != null ? m28614O.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // p377x4.C6984j.c
    /* renamed from: m */
    public C4767i mo28631m(Activity activity, C4659a c4659a) {
        return new C4767i(mo28626g(), c4659a.m20212q(), this);
    }

    @Override // p377x4.C6984j.c
    /* renamed from: n */
    public boolean mo28632n() {
        try {
            return AbstractC6985k.m28682a(m28614O());
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (m28619T("onActivityResult")) {
            this.f25002b.m28673r(i7, i8, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (m28619T("onBackPressed")) {
            this.f25002b.m28675t();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        m28620U();
        super.onCreate(bundle);
        if (bundle != null) {
            mo20545f(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C6984j c6984j = new C6984j(this);
        this.f25002b = c6984j;
        c6984j.m28674s(this);
        this.f25002b.m28649B(bundle);
        this.f25003c.m12941h(AbstractC3345j.a.ON_CREATE);
        m28609J();
        setContentView(m28610K());
        m28608I();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (m28619T("onDestroy")) {
            this.f25002b.m28677v();
            this.f25002b.m28678w();
        }
        m28617R();
        this.f25003c.m12941h(AbstractC3345j.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m28619T("onNewIntent")) {
            this.f25002b.m28679x(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (m28619T("onPause")) {
            this.f25002b.m28680y();
        }
        this.f25003c.m12941h(AbstractC3345j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (m28619T("onPostResume")) {
            this.f25002b.m28681z();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (m28619T("onRequestPermissionsResult")) {
            this.f25002b.m28648A(i7, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f25003c.m12941h(AbstractC3345j.a.ON_RESUME);
        if (m28619T("onResume")) {
            this.f25002b.m28650C();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m28619T("onSaveInstanceState")) {
            this.f25002b.m28651D(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f25003c.m12941h(AbstractC3345j.a.ON_START);
        if (m28619T("onStart")) {
            this.f25002b.m28652E();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (m28619T("onStop")) {
            this.f25002b.m28653F();
        }
        this.f25003c.m12941h(AbstractC3345j.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (m28619T("onTrimMemory")) {
            this.f25002b.m28654G(i7);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (m28619T("onUserLeaveHint")) {
            this.f25002b.m28655H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (m28619T("onWindowFocusChanged")) {
            this.f25002b.m28656I(z6);
        }
    }

    @Override // p377x4.C6984j.c
    /* renamed from: p */
    public boolean mo28634p() {
        return true;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: r */
    public C4659a mo28636r(Context context) {
        return null;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: s */
    public boolean mo28637s() {
        return this.f25001a;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: t */
    public void mo28638t(C4659a c4659a) {
        if (this.f25002b.m28671p()) {
            return;
        }
        AbstractC0465a.m1711a(c4659a);
    }

    @Override // p377x4.C6984j.c
    /* renamed from: u */
    public String mo28639u() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // p377x4.C6984j.c
    /* renamed from: v */
    public String mo28640v() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle m28614O = m28614O();
            if (m28614O != null) {
                return m28614O.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // p377x4.C6984j.c
    /* renamed from: x */
    public boolean mo28641x() {
        return true;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: y */
    public boolean mo28642y() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (mo28628j() != null || this.f25002b.m28671p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // p377x4.C6984j.c
    /* renamed from: z */
    public boolean mo28643z() {
        return true;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: c */
    public void mo28623c() {
    }

    @Override // p377x4.C6984j.c
    /* renamed from: g */
    public Activity mo28626g() {
        return this;
    }

    @Override // p377x4.C6984j.c
    public Context getContext() {
        return this;
    }

    @Override // p377x4.C6984j.c
    /* renamed from: A */
    public void mo28600A(C4659a c4659a) {
    }

    @Override // p377x4.C6984j.c
    /* renamed from: o */
    public void mo28633o(C6993s c6993s) {
    }

    @Override // p377x4.C6984j.c
    /* renamed from: q */
    public void mo28635q(C6994t c6994t) {
    }
}
