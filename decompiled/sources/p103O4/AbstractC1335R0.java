package p103O4;

import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p061I4.C0649a;
import p061I4.InterfaceC0651c;
import p061I4.InterfaceC0657i;
import p103O4.AbstractC1359c0;

/* renamed from: O4.R0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1335R0 {

    /* renamed from: O4.R0$a */
    public class a implements AbstractC1359c0.F {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f4188a;

        /* renamed from: b */
        public final /* synthetic */ C0649a.e f4189b;

        public a(ArrayList arrayList, C0649a.e eVar) {
            this.f4188a = arrayList;
            this.f4189b = eVar;
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: b */
        public void mo5060b(Throwable th) {
            this.f4189b.mo2187a(AbstractC1359c0.m5208a(th));
        }

        @Override // p103O4.AbstractC1359c0.F
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo5059a(AbstractC1359c0.A a7) {
            this.f4188a.add(0, a7);
            this.f4189b.mo2187a(this.f4188a);
        }
    }

    /* renamed from: a */
    public static InterfaceC0657i m5105a() {
        return AbstractC1359c0.i.f4287d;
    }

    /* renamed from: b */
    public static /* synthetic */ void m5106b(AbstractC1359c0.h hVar, Object obj, C0649a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        hVar.mo5190f((String) arrayList.get(0), (AbstractC1359c0.x) arrayList.get(1), (String) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    /* renamed from: c */
    public static void m5107c(InterfaceC0651c interfaceC0651c, AbstractC1359c0.h hVar) {
        m5108d(interfaceC0651c, StringUtils.EMPTY, hVar);
    }

    /* renamed from: d */
    public static void m5108d(InterfaceC0651c interfaceC0651c, String str, final AbstractC1359c0.h hVar) {
        String str2;
        if (str.isEmpty()) {
            str2 = StringUtils.EMPTY;
        } else {
            str2 = "." + str;
        }
        C0649a c0649a = new C0649a(interfaceC0651c, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn" + str2, m5105a());
        if (hVar != null) {
            c0649a.m2614e(new C0649a.d() { // from class: O4.Q0
                @Override // p061I4.C0649a.d
                /* renamed from: a */
                public final void mo2170a(Object obj, C0649a.e eVar) {
                    AbstractC1335R0.m5106b(AbstractC1359c0.h.this, obj, eVar);
                }
            });
        } else {
            c0649a.m2614e(null);
        }
    }
}
