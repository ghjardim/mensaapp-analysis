package p121R1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p061I4.C0658j;
import p061I4.C0659k;
import p061I4.InterfaceC0661m;
import p069J5.InterfaceC0789a;
import p326r.C6233c;
import p371w5.C6934q;

/* renamed from: R1.b */
/* loaded from: classes.dex */
public final class C2228b implements InterfaceC0191a, C0659k.c, InterfaceC0298a, InterfaceC0661m {

    /* renamed from: f */
    public static final a f6827f = new a(null);

    /* renamed from: g */
    public static C0659k.d f6828g;

    /* renamed from: h */
    public static InterfaceC0789a f6829h;

    /* renamed from: c */
    public final int f6830c = 1001;

    /* renamed from: d */
    public C0659k f6831d;

    /* renamed from: e */
    public InterfaceC0300c f6832e;

    /* renamed from: R1.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: d */
    public static final C6934q m7649d(Activity activity) {
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(67108864);
        }
        activity.startActivity(launchIntentForPackage);
        return C6934q.f24811a;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b flutterPluginBinding) {
        AbstractC5469l.m23028e(flutterPluginBinding, "flutterPluginBinding");
        C0659k c0659k = new C0659k(flutterPluginBinding.m786b(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f6831d = c0659k;
        c0659k.m2654e(this);
    }

    @Override // p061I4.InterfaceC0661m
    /* renamed from: a */
    public boolean mo2655a(int i7, int i8, Intent intent) {
        C0659k.d dVar;
        if (i7 != this.f6830c || (dVar = f6828g) == null) {
            return false;
        }
        dVar.mo2315b("authorization-error/canceled", "The user closed the Custom Tab", null);
        f6828g = null;
        f6829h = null;
        return false;
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j call, C0659k.d result) {
        AbstractC5469l.m23028e(call, "call");
        AbstractC5469l.m23028e(result, "result");
        String str = call.f2254a;
        if (AbstractC5469l.m23024a(str, "isAvailable")) {
            result.mo2314a(Boolean.TRUE);
            return;
        }
        if (!AbstractC5469l.m23024a(str, "performAuthorizationRequest")) {
            result.mo2316c();
            return;
        }
        InterfaceC0300c interfaceC0300c = this.f6832e;
        final Activity mo1204g = interfaceC0300c != null ? interfaceC0300c.mo1204g() : null;
        if (mo1204g == null) {
            result.mo2315b("MISSING_ACTIVITY", "Plugin is not attached to an activity", call.f2255b);
            return;
        }
        String str2 = (String) call.m2647a("url");
        if (str2 == null) {
            result.mo2315b("MISSING_ARG", "Missing 'url' argument", call.f2255b);
            return;
        }
        C0659k.d dVar = f6828g;
        if (dVar != null) {
            dVar.mo2315b("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
        }
        InterfaceC0789a interfaceC0789a = f6829h;
        if (interfaceC0789a != null) {
            AbstractC5469l.m23025b(interfaceC0789a);
            interfaceC0789a.invoke();
        }
        f6828g = result;
        f6829h = new InterfaceC0789a() { // from class: R1.a
            @Override // p069J5.InterfaceC0789a
            public final Object invoke() {
                C6934q m7649d;
                m7649d = C2228b.m7649d(mo1204g);
                return m7649d;
            }
        };
        C6233c m26000a = new C6233c.d().m26000a();
        AbstractC5469l.m23027d(m26000a, "build(...)");
        m26000a.f22266a.setData(Uri.parse(str2));
        mo1204g.startActivityForResult(m26000a.f22266a, this.f6830c, m26000a.f22267b);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c binding) {
        AbstractC5469l.m23028e(binding, "binding");
        mo1192n(binding);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        mo1193o();
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c binding) {
        AbstractC5469l.m23028e(binding, "binding");
        this.f6832e = binding;
        binding.mo1209l(this);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        InterfaceC0300c interfaceC0300c = this.f6832e;
        if (interfaceC0300c != null) {
            interfaceC0300c.mo1208k(this);
        }
        this.f6832e = null;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        C0659k c0659k = this.f6831d;
        if (c0659k != null) {
            c0659k.m2654e(null);
        }
        this.f6831d = null;
    }
}
