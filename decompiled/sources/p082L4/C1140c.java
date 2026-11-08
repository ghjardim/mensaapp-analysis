package p082L4;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypes;
import p026D4.InterfaceC0191a;
import p033E4.InterfaceC0298a;
import p033E4.InterfaceC0300c;
import p054H4.C0583s;
import p061I4.C0659k;
import p061I4.InterfaceC0661m;

/* renamed from: L4.c */
/* loaded from: classes.dex */
public class C1140c implements InterfaceC0191a, InterfaceC0298a, InterfaceC0661m, C0583s.b {

    /* renamed from: c */
    public final C0583s f3686c;

    /* renamed from: d */
    public final PackageManager f3687d;

    /* renamed from: e */
    public InterfaceC0300c f3688e;

    /* renamed from: f */
    public Map f3689f;

    /* renamed from: g */
    public Map f3690g = new HashMap();

    public C1140c(C0583s c0583s) {
        this.f3686c = c0583s;
        this.f3687d = c0583s.f2003b;
        c0583s.m2301b(this);
    }

    @Override // p061I4.InterfaceC0661m
    /* renamed from: a */
    public boolean mo2655a(int i7, int i8, Intent intent) {
        if (!this.f3690g.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        ((C0659k.d) this.f3690g.remove(Integer.valueOf(i7))).mo2314a(i8 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // p054H4.C0583s.b
    /* renamed from: b */
    public void mo2302b(String str, String str2, boolean z6, C0659k.d dVar) {
        if (this.f3688e == null) {
            dVar.mo2315b("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.f3689f;
        if (map == null) {
            dVar.mo2315b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.mo2315b("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = dVar.hashCode();
        this.f3690g.put(Integer.valueOf(hashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z6);
        this.f3688e.mo1204g().startActivityForResult(intent, hashCode);
    }

    @Override // p054H4.C0583s.b
    /* renamed from: c */
    public Map mo2303c() {
        if (this.f3689f == null) {
            m4411d();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f3689f.keySet()) {
            hashMap.put(str, ((ResolveInfo) this.f3689f.get(str)).loadLabel(this.f3687d).toString());
        }
        return hashMap;
    }

    /* renamed from: d */
    public final void m4411d() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        this.f3689f = new HashMap();
        int i7 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.PLAIN_TEXT);
        if (i7 >= 33) {
            PackageManager packageManager = this.f3687d;
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(type, of);
        } else {
            queryIntentActivities = this.f3687d.queryIntentActivities(type, 0);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f3687d).toString();
            this.f3689f.put(str, resolveInfo);
        }
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: i */
    public void mo1190i(InterfaceC0300c interfaceC0300c) {
        this.f3688e = interfaceC0300c;
        interfaceC0300c.mo1209l(this);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: j */
    public void mo1191j() {
        this.f3688e.mo1208k(this);
        this.f3688e = null;
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: n */
    public void mo1192n(InterfaceC0300c interfaceC0300c) {
        this.f3688e = interfaceC0300c;
        interfaceC0300c.mo1209l(this);
    }

    @Override // p033E4.InterfaceC0298a
    /* renamed from: o */
    public void mo1193o() {
        this.f3688e.mo1208k(this);
        this.f3688e = null;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
    }
}
