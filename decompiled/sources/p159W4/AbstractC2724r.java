package p159W4;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p159W4.AbstractC2714h;
import p159W4.AbstractC2724r;

/* renamed from: W4.r */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2724r {

    /* renamed from: W4.r$a */
    public class a implements AbstractC2714h.e {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8034a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8035b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f8034a = arrayList;
            this.f8035b = eVar;
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: b */
        public void mo9307b(Throwable th) {
            this.f8035b.mo2187a(AbstractC2714h.m9289a(th));
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo9306a(AbstractC2714h.g gVar) {
            this.f8034a.add(0, gVar);
            this.f8035b.mo2187a(this.f8034a);
        }
    }

    /* renamed from: W4.r$b */
    public class b implements AbstractC2714h.e {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8036a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8037b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f8036a = arrayList;
            this.f8037b = eVar;
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: b */
        public void mo9307b(Throwable th) {
            this.f8037b.mo2187a(AbstractC2714h.m9289a(th));
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo9306a(AbstractC2714h.g gVar) {
            this.f8036a.add(0, gVar);
            this.f8037b.mo2187a(this.f8036a);
        }
    }

    /* renamed from: W4.r$c */
    public class c implements AbstractC2714h.e {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8038a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8039b;

        public c(ArrayList arrayList, C0649a.e eVar) {
            this.f8038a = arrayList;
            this.f8039b = eVar;
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: b */
        public void mo9307b(Throwable th) {
            this.f8039b.mo2187a(AbstractC2714h.m9289a(th));
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo9306a(String str) {
            this.f8038a.add(0, str);
            this.f8039b.mo2187a(this.f8038a);
        }
    }

    /* renamed from: W4.r$d */
    public class d implements AbstractC2714h.h {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8040a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8041b;

        public d(ArrayList arrayList, C0649a.e eVar) {
            this.f8040a = arrayList;
            this.f8041b = eVar;
        }

        @Override // p159W4.AbstractC2714h.h
        /* renamed from: a */
        public void mo9324a() {
            this.f8040a.add(0, null);
            this.f8041b.mo2187a(this.f8040a);
        }

        @Override // p159W4.AbstractC2714h.h
        /* renamed from: b */
        public void mo9325b(Throwable th) {
            this.f8041b.mo2187a(AbstractC2714h.m9289a(th));
        }
    }

    /* renamed from: W4.r$e */
    public class e implements AbstractC2714h.h {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8042a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8043b;

        public e(ArrayList arrayList, C0649a.e eVar) {
            this.f8042a = arrayList;
            this.f8043b = eVar;
        }

        @Override // p159W4.AbstractC2714h.h
        /* renamed from: a */
        public void mo9324a() {
            this.f8042a.add(0, null);
            this.f8043b.mo2187a(this.f8042a);
        }

        @Override // p159W4.AbstractC2714h.h
        /* renamed from: b */
        public void mo9325b(Throwable th) {
            this.f8043b.mo2187a(AbstractC2714h.m9289a(th));
        }
    }

    /* renamed from: W4.r$f */
    public class f implements AbstractC2714h.e {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f8044a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f8045b;

        public f(ArrayList arrayList, C0649a.e eVar) {
            this.f8044a = arrayList;
            this.f8045b = eVar;
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: b */
        public void mo9307b(Throwable th) {
            this.f8045b.mo2187a(AbstractC2714h.m9289a(th));
        }

        @Override // p159W4.AbstractC2714h.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo9306a(Boolean bool) {
            this.f8044a.add(0, bool);
            this.f8045b.mo2187a(this.f8044a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m9326a() {
        return AbstractC2714h.d.f8008d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m9327b(AbstractC2714h.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            bVar.mo9268f((AbstractC2714h.c) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC2714h.m9289a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m9330e(AbstractC2714h.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        bVar.mo9265c((String) arrayList.get(0), (Boolean) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    /* renamed from: h */
    public static /* synthetic */ void m9333h(AbstractC2714h.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, bVar.mo9270h());
        } catch (Throwable th) {
            arrayList = AbstractC2714h.m9289a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: i */
    public static /* synthetic */ void m9334i(AbstractC2714h.b bVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            bVar.mo9272j((String) ((ArrayList) obj).get(0));
            arrayList.add(0, null);
        } catch (Throwable th) {
            arrayList = AbstractC2714h.m9289a(th);
        }
        eVar.mo2187a(arrayList);
    }

    /* renamed from: k */
    public static void m9336k(InterfaceC0651c interfaceC0651c, AbstractC2714h.b bVar) {
        m9337l(interfaceC0651c, StringUtils.EMPTY, bVar);
    }

    /* renamed from: l */
    public static void m9337l(InterfaceC0651c interfaceC0651c, String str, final AbstractC2714h.b bVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        InterfaceC0651c.c mo2619b = interfaceC0651c.mo2619b();
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init" + str2, m9326a());
        if (bVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: W4.i
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2724r.m9327b(AbstractC2714h.b.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently" + str2, m9326a());
        if (bVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: W4.j
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2714h.b.this.mo9266d(new AbstractC2724r.a(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn" + str2, m9326a());
        if (bVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: W4.k
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2714h.b.this.mo9269g(new AbstractC2724r.b(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken" + str2, m9326a(), mo2619b);
        if (bVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: W4.l
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2724r.m9330e(AbstractC2714h.b.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
        C0649a c0649a5 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut" + str2, m9326a());
        if (bVar != null) {
            c0649a5.m2614e(new C0649a.d() { // from class: W4.m
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2714h.b.this.mo9264b(new AbstractC2724r.d(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a5.m2614e(null);
        }
        C0649a c0649a6 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect" + str2, m9326a());
        if (bVar != null) {
            c0649a6.m2614e(new C0649a.d() { // from class: W4.n
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2714h.b.this.mo9267e(new AbstractC2724r.e(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a6.m2614e(null);
        }
        C0649a c0649a7 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn" + str2, m9326a());
        if (bVar != null) {
            c0649a7.m2614e(new C0649a.d() { // from class: W4.o
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2724r.m9333h(AbstractC2714h.b.this, obj, eVar);
                }
            });
        } else {
            c0649a7.m2614e(null);
        }
        C0649a c0649a8 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache" + str2, m9326a(), mo2619b);
        if (bVar != null) {
            c0649a8.m2614e(new C0649a.d() { // from class: W4.p
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2724r.m9334i(AbstractC2714h.b.this, obj, eVar);
                }
            });
        } else {
            c0649a8.m2614e(null);
        }
        C0649a c0649a9 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes" + str2, m9326a());
        if (bVar != null) {
            c0649a9.m2614e(new C0649a.d() { // from class: W4.q
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC2714h.b.this.mo9271i((List) ((ArrayList) obj).get(0), new AbstractC2724r.f(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a9.m2614e(null);
        }
    }
}
