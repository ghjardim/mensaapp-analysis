package p173Y4;

import java.util.ArrayList;
import p061I4.C0649a;
import p061I4.C0664p;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p173Y4.AbstractC2954i;

/* renamed from: Y4.h */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2953h {
    /* renamed from: a */
    public static InterfaceC0657i m10629a() {
        return new C0664p();
    }

    /* renamed from: b */
    public static /* synthetic */ void m10630b(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo10641c());
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: c */
    public static /* synthetic */ void m10631c(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo10644f());
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: d */
    public static /* synthetic */ void m10632d(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo10643e());
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m10633e(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo10642d());
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: f */
    public static /* synthetic */ void m10634f(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo10640b());
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: g */
    public static /* synthetic */ void m10635g(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, aVar.mo10639a());
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: h */
    public static /* synthetic */ void m10636h(AbstractC2954i.a aVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, aVar.mo10645g(arrayList2.get(0) == null ? null : AbstractC2954i.b.values()[((Integer) arrayList2.get(0)).intValue()]));
        } catch (Throwable th) {
            arrayList = AbstractC2954i.m10638a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: i */
    public static void m10637i(InterfaceC0651c interfaceC0651c, final AbstractC2954i.a aVar) {
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: Y4.a
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10630b(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: Y4.b
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10631c(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: Y4.c
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10632d(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: Y4.d
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10633e(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
        C0649a c0649a5 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a5.m2614e(new C0649a.d() { // from class: Y4.e
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10634f(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a5.m2614e(null);
        }
        C0649a c0649a6 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a6.m2614e(new C0649a.d() { // from class: Y4.f
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10635g(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a6.m2614e(null);
        }
        C0649a c0649a7 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", m10629a(), interfaceC0651c.mo2619b());
        if (aVar != null) {
            c0649a7.m2614e(new C0649a.d() { // from class: Y4.g
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2953h.m10636h(AbstractC2954i.a.this, obj, eVar);
                }
            });
        } else {
            c0649a7.m2614e(null);
        }
    }
}
