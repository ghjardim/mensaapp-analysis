package p103O4;

import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.C0664p;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p103O4.AbstractC1359c0;

/* renamed from: O4.Y0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1349Y0 {

    /* renamed from: O4.Y0$a */
    public class a implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4211a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4212b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f4211a = arrayList;
            this.f4212b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4212b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(String str) {
            this.f4211a.add(0, str);
            this.f4212b.mo2187a(this.f4211a);
        }
    }

    /* renamed from: O4.Y0$b */
    public class b implements AbstractC1359c0.G {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4213a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4214b;

        public b(ArrayList arrayList, C0649a.e eVar) {
            this.f4213a = arrayList;
            this.f4214b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: a */
        public void mo5065a() {
            this.f4213a.add(0, null);
            this.f4214b.mo2187a(this.f4213a);
        }

        @Override // p103O4.AbstractC1359c0.G
        /* renamed from: b */
        public void mo5066b(Throwable th) {
            this.f4214b.mo2187a(AbstractC1359c0.m5208a(th));
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m5192a() {
        return new C0664p();
    }

    /* renamed from: b */
    public static /* synthetic */ void m5193b(AbstractC1359c0.l lVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        lVar.mo5206a((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    /* renamed from: c */
    public static /* synthetic */ void m5194c(AbstractC1359c0.l lVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        lVar.mo5207b((String) arrayList.get(0), (String) arrayList.get(1), new b(new ArrayList(), eVar));
    }

    /* renamed from: d */
    public static void m5195d(InterfaceC0651c interfaceC0651c, AbstractC1359c0.l lVar) {
        m5196e(interfaceC0651c, StringUtils.EMPTY, lVar);
    }

    /* renamed from: e */
    public static void m5196e(InterfaceC0651c interfaceC0651c, String str, final AbstractC1359c0.l lVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl" + str2, m5192a());
        if (lVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: O4.W0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1349Y0.m5193b(AbstractC1359c0.l.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
        C0649a c0649a2 = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp" + str2, m5192a());
        if (lVar != null) {
            c0649a2.m2614e(new C0649a.d() { // from class: O4.X0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1349Y0.m5194c(AbstractC1359c0.l.this, obj, eVar);
                }
            });
        } else {
            c0649a2.m2614e(null);
        }
    }
}
