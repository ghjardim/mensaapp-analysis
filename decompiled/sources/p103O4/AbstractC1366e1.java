package p103O4;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p103O4.AbstractC1359c0;
import p103O4.AbstractC1366e1;

/* renamed from: O4.e1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1366e1 {

    /* renamed from: O4.e1$a */
    public class a implements AbstractC1359c0.G {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4376a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4377b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f4376a = arrayList;
            this.f4377b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: a */
        public void mo5065a() {
            this.f4376a.add(0, null);
            this.f4377b.mo2187a(this.f4376a);
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: b */
        public void mo5066b(Throwable th) {
            this.f4377b.mo2187a(AbstractC1359c0.m5208a(th));
        }
    }

    /* renamed from: O4.e1$b */
    public class b implements AbstractC1359c0.G {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4378a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4379b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f4378a = arrayList;
            this.f4379b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: a */
        public void mo5065a() {
            this.f4378a.add(0, null);
            this.f4379b.mo2187a(this.f4378a);
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: b */
        public void mo5066b(Throwable th) {
            this.f4379b.mo2187a(AbstractC1359c0.m5208a(th));
        }
    }

    /* renamed from: O4.e1$c */
    public class c implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4380a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4381b;

        public c(ArrayList arrayList, C0649a.e eVar) {
            this.f4380a = arrayList;
            this.f4381b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4381b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(AbstractC1359c0.w wVar) {
            this.f4380a.add(0, wVar);
            this.f4381b.mo2187a(this.f4380a);
        }
    }

    /* renamed from: O4.e1$d */
    public class d implements AbstractC1359c0.G {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4382a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4383b;

        public d(ArrayList arrayList, C0649a.e eVar) {
            this.f4382a = arrayList;
            this.f4383b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: a */
        public void mo5065a() {
            this.f4382a.add(0, null);
            this.f4383b.mo2187a(this.f4382a);
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: b */
        public void mo5066b(Throwable th) {
            this.f4383b.mo2187a(AbstractC1359c0.m5208a(th));
        }
    }

    /* renamed from: O4.e1$e */
    public class e implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4384a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4385b;

        public e(ArrayList arrayList, C0649a.e eVar) {
            this.f4384a = arrayList;
            this.f4385b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4385b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(List list) {
            this.f4384a.add(0, list);
            this.f4385b.mo2187a(this.f4384a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m5436a() {
        return AbstractC1359c0.n.f4289d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m5437b(AbstractC1359c0.m mVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.mo5186b((AbstractC1359c0.C7248b) arrayList.get(0), (AbstractC1359c0.x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    /* renamed from: c */
    public static /* synthetic */ void m5438c(AbstractC1359c0.m mVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.mo5189e((AbstractC1359c0.C7248b) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new b(new ArrayList(), eVar));
    }

    /* renamed from: e */
    public static /* synthetic */ void m5440e(AbstractC1359c0.m mVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        mVar.mo5187c((AbstractC1359c0.C7248b) arrayList.get(0), (String) arrayList.get(1), new d(new ArrayList(), eVar));
    }

    /* renamed from: g */
    public static void m5442g(InterfaceC0651c interfaceC0651c, AbstractC1359c0.m mVar) {
        m5443h(interfaceC0651c, StringUtils.EMPTY, mVar);
    }

    /* renamed from: h */
    public static void m5443h(InterfaceC0651c interfaceC0651c, String str, final AbstractC1359c0.m mVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone" + str2, m5436a());
        if (mVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: O4.Z0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1366e1.m5437b(AbstractC1359c0.m.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp" + str2, m5436a());
        if (mVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: O4.a1
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1366e1.m5438c(AbstractC1359c0.m.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession" + str2, m5436a());
        if (mVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: O4.b1
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1359c0.m.this.mo5188d((AbstractC1359c0.C7248b) ((ArrayList) obj).get(0), new AbstractC1366e1.c(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
        C0649a c0649a4 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll" + str2, m5436a());
        if (mVar != null) {
            c0649a4.m2614e(new C0649a.d() { // from class: O4.c1
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1366e1.m5440e(AbstractC1359c0.m.this, obj, eVar);
                }
            });
        } else {
            c0649a4.m2614e(null);
        }
        C0649a c0649a5 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors" + str2, m5436a());
        if (mVar != null) {
            c0649a5.m2614e(new C0649a.d() { // from class: O4.d1
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1359c0.m.this.mo5185a((AbstractC1359c0.C7248b) ((ArrayList) obj).get(0), new AbstractC1366e1.e(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a5.m2614e(null);
        }
    }
}
