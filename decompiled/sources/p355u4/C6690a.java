package p355u4;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.AbstractC5469l;
import p026D4.InterfaceC0191a;
import p061I4.C0659k;
import p061I4.InterfaceC0651c;

/* renamed from: u4.a */
/* loaded from: classes.dex */
public final class C6690a implements InterfaceC0191a {

    /* renamed from: c */
    public C0659k f24106c;

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        InterfaceC0651c m786b = binding.m786b();
        AbstractC5469l.m23027d(m786b, "getBinaryMessenger(...)");
        Context m785a = binding.m785a();
        AbstractC5469l.m23027d(m785a, "getApplicationContext(...)");
        m27602a(m786b, m785a);
    }

    /* renamed from: a */
    public final void m27602a(InterfaceC0651c interfaceC0651c, Context context) {
        this.f24106c = new C0659k(interfaceC0651c, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        AbstractC5469l.m23027d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        AbstractC5469l.m23026c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        AbstractC5469l.m23025b(contentResolver);
        C6692c c6692c = new C6692c(packageManager, (ActivityManager) systemService, contentResolver);
        C0659k c0659k = this.f24106c;
        if (c0659k == null) {
            AbstractC5469l.m23037n("methodChannel");
            c0659k = null;
        }
        c0659k.m2654e(c6692c);
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b binding) {
        AbstractC5469l.m23028e(binding, "binding");
        C0659k c0659k = this.f24106c;
        if (c0659k == null) {
            AbstractC5469l.m23037n("methodChannel");
            c0659k = null;
        }
        c0659k.m2654e(null);
    }
}
