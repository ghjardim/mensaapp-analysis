package p188a5;

import java.util.ArrayList;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p188a5.AbstractC3170a;

/* renamed from: a5.g */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3176g {
    /* renamed from: a */
    public static InterfaceC0657i m11579a() {
        return AbstractC3170a.c.f9775d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m11580b(AbstractC3170a.d dVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, dVar.mo11566a((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = AbstractC3170a.m11561a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: c */
    public static /* synthetic */ void m11581c(AbstractC3170a.d dVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, dVar.mo11569d((String) arrayList2.get(0), (Map) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3170a.m11561a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: d */
    public static /* synthetic */ void m11582d(AbstractC3170a.d dVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, dVar.mo11570e((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (AbstractC3170a.e) arrayList2.get(2), (AbstractC3170a.a) arrayList2.get(3)));
        } catch (Throwable th) {
            arrayList = AbstractC3170a.m11561a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m11583e(AbstractC3170a.d dVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, dVar.mo11567b());
        } catch (Throwable th) {
            arrayList = AbstractC3170a.m11561a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: f */
    public static /* synthetic */ void m11584f(AbstractC3170a.d dVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            dVar.mo11568c();
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC3170a.m11561a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: g */
    public static void m11585g(InterfaceC0651c interfaceC0651c, AbstractC3170a.d dVar) {
        m11586h(interfaceC0651c, StringUtils.EMPTY, dVar);
    }

    /* renamed from: h */
    public static void m11586h(InterfaceC0651c interfaceC0651c, String str, final AbstractC3170a.d dVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl" + str2, m11579a());
        if (dVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: a5.b
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3176g.m11580b(AbstractC3170a.d.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl" + str2, m11579a());
        if (dVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: a5.c
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3176g.m11581c(AbstractC3170a.d.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp" + str2, m11579a());
        if (dVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: a5.d
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3176g.m11582d(AbstractC3170a.d.this, obj, eVar);
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs" + str2, m11579a());
        if (dVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: a5.e
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3176g.m11583e(AbstractC3170a.d.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
        C0649a c0649a5 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView" + str2, m11579a());
        if (dVar != null) {
            c0649a5.m2614e(new C0649a.d() { // from class: a5.f
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3176g.m11584f(AbstractC3170a.d.this, obj, eVar);
                }
            });
        } else {
            c0649a5.m2614e(null);
        }
    }
}
