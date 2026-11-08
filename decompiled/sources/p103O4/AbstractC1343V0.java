package p103O4;

import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p103O4.AbstractC1343V0;
import p103O4.AbstractC1359c0;

/* renamed from: O4.V0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1343V0 {

    /* renamed from: O4.V0$a */
    public class a implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4197a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4198b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f4197a = arrayList;
            this.f4198b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4198b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(AbstractC1359c0.z zVar) {
            this.f4197a.add(0, zVar);
            this.f4198b.mo2187a(this.f4197a);
        }
    }

    /* renamed from: O4.V0$b */
    public class b implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4199a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4200b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f4199a = arrayList;
            this.f4200b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4200b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(String str) {
            this.f4199a.add(0, str);
            this.f4200b.mo2187a(this.f4199a);
        }
    }

    /* renamed from: O4.V0$c */
    public class c implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4201a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4202b;

        public c(ArrayList arrayList, C0649a.e eVar) {
            this.f4201a = arrayList;
            this.f4202b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4202b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(String str) {
            this.f4201a.add(0, str);
            this.f4202b.mo2187a(this.f4201a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m5166a() {
        return AbstractC1359c0.k.f4288d;
    }

    /* renamed from: c */
    public static /* synthetic */ void m5168c(AbstractC1359c0.j jVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        jVar.mo5202b((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    /* renamed from: d */
    public static /* synthetic */ void m5169d(AbstractC1359c0.j jVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        jVar.mo5203c((String) arrayList.get(0), (String) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    /* renamed from: e */
    public static void m5170e(InterfaceC0651c interfaceC0651c, AbstractC1359c0.j jVar) {
        m5171f(interfaceC0651c, StringUtils.EMPTY, jVar);
    }

    /* renamed from: f */
    public static void m5171f(InterfaceC0651c interfaceC0651c, String str, final AbstractC1359c0.j jVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret" + str2, m5166a());
        if (jVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: O4.S0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1359c0.j.this.mo5201a((String) ((ArrayList) obj).get(0), new AbstractC1343V0.a(new ArrayList(), eVar));
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment" + str2, m5166a());
        if (jVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: O4.T0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1343V0.m5168c(AbstractC1359c0.j.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
        C0649a c0649a3 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn" + str2, m5166a());
        if (jVar != null) {
            c0649a3.m2614e(new C0649a.d() { // from class: O4.U0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1343V0.m5169d(AbstractC1359c0.j.this, obj, eVar);
                }
            });
        } else {
            c0649a3.m2614e(null);
        }
    }
}
