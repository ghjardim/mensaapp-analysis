package p180Z4;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p180Z4.AbstractC3056c;

/* renamed from: Z4.m */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3066m {
    /* renamed from: a */
    public static InterfaceC0657i m11225a() {
        return AbstractC3056c.a.f9495d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m11226b(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, bVar.remove((String) ((ArrayList) obj).get(0)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: c */
    public static /* synthetic */ void m11227c(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11219g((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: d */
    public static /* synthetic */ void m11228d(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11216d((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m11229e(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11215c((String) arrayList2.get(0), (Long) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: f */
    public static /* synthetic */ void m11230f(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11220h((String) arrayList2.get(0), (Double) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: g */
    public static /* synthetic */ void m11231g(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11217e((String) arrayList2.get(0), (String) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: h */
    public static /* synthetic */ void m11232h(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11218f((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: i */
    public static /* synthetic */ void m11233i(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11214b((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: j */
    public static /* synthetic */ void m11234j(AbstractC3056c.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        try {
            arrayList.add(0, bVar.mo11213a((String) arrayList2.get(0), (List) arrayList2.get(1)));
        } catch (Throwable th) {
            arrayList = AbstractC3056c.m11224a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: k */
    public static void m11235k(InterfaceC0651c interfaceC0651c, AbstractC3056c.b bVar) {
        m11236l(interfaceC0651c, StringUtils.EMPTY, bVar);
    }

    /* renamed from: l */
    public static void m11236l(InterfaceC0651c interfaceC0651c, String str, final AbstractC3056c.b bVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        InterfaceC0651c.c mo2619b = interfaceC0651c.mo2619b();
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: Z4.d
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11226b(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: Z4.e
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11227c(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: Z4.f
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11228d(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: Z4.g
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11229e(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
        C0649a c0649a5 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a5.m2614e(new C0649a.d() { // from class: Z4.h
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11230f(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a5.m2614e(null);
        }
        C0649a c0649a6 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a6.m2614e(new C0649a.d() { // from class: Z4.i
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11231g(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a6.m2614e(null);
        }
        C0649a c0649a7 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a7.m2614e(new C0649a.d() { // from class: Z4.j
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11232h(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a7.m2614e(null);
        }
        C0649a c0649a8 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a8.m2614e(new C0649a.d() { // from class: Z4.k
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11233i(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a8.m2614e(null);
        }
        C0649a c0649a9 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll" + str2, m11225a(), mo2619b);
        if (bVar != null) {
            c0649a9.m2614e(new C0649a.d() { // from class: Z4.l
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC3066m.m11234j(AbstractC3056c.b.this, obj, eVar);
                }
            });
        } else {
            c0649a9.m2614e(null);
        }
    }
}
