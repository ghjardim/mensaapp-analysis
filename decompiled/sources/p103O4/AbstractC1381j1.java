package p103O4;

import android.net.Uri;
import com.google.firebase.auth.AbstractC3933b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p103O4.AbstractC1359c0;
import p256j$.util.Objects;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6466E;
import p346t3.AbstractC6470G;
import p346t3.AbstractC6476J;
import p346t3.AbstractC6481M;
import p346t3.AbstractC6488U;
import p346t3.AbstractC6494a;
import p346t3.AbstractC6496b;
import p346t3.AbstractC6497b0;
import p346t3.AbstractC6508h;
import p346t3.AbstractC6514k;
import p346t3.AbstractC6518m;
import p346t3.C6462C;
import p346t3.C6482N;
import p346t3.C6486S;
import p346t3.C6502e;
import p346t3.InterfaceC6499c0;
import p346t3.InterfaceC6500d;
import p346t3.InterfaceC6506g;
import p346t3.InterfaceC6510i;

/* renamed from: O4.j1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1381j1 {
    /* renamed from: a */
    public static C6502e m5453a(AbstractC1359c0.q qVar) {
        C6502e.a m27075E0 = C6502e.m27075E0();
        m27075E0.m27101g(qVar.m5330i());
        if (qVar.m5326e() != null) {
            m27075E0.m27097c(qVar.m5326e());
        }
        if (qVar.m5329h() != null) {
            m27075E0.m27100f(qVar.m5329h());
        }
        m27075E0.m27098d(qVar.m5327f().booleanValue());
        if (qVar.m5325d() != null) {
            m27075E0.m27096b(qVar.m5325d(), qVar.m5323b().booleanValue(), qVar.m5324c());
        }
        if (qVar.m5328g() != null) {
            m27075E0.m27099e(qVar.m5328g());
        }
        return m27075E0.m27095a();
    }

    /* renamed from: b */
    public static AbstractC6508h m5454b(Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        if (map.get("token") != null) {
            Integer num = (Integer) map.get("token");
            num.intValue();
            AbstractC6508h abstractC6508h = (AbstractC6508h) C1404v.f4435k.get(num);
            if (abstractC6508h != null) {
                return abstractC6508h;
            }
            throw AbstractC1406w.m5510b();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str5 = (String) obj;
        str = (String) map.get("secret");
        str2 = (String) map.get("idToken");
        str3 = (String) map.get("accessToken");
        str4 = (String) map.get("rawNonce");
        switch (str5) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return AbstractC6497b0.m27064a(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return AbstractC6488U.m27043a((String) obj2);
            case "google.com":
                return AbstractC6470G.m27002a(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return AbstractC6518m.m27121a(str3);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                C6482N.b m27021f = C6482N.m27021f((String) obj3);
                if (str3 != null) {
                    m27021f.m27029b(str3);
                }
                if (str4 == null) {
                    Objects.requireNonNull(str2);
                    m27021f.m27030c(str2);
                } else {
                    Objects.requireNonNull(str2);
                    m27021f.m27031d(str2, str4);
                }
                return m27021f.m27028a();
            case "phone":
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return AbstractC3933b.m15410a((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str);
                return AbstractC6514k.m27118a((String) obj6, str);
            case "github.com":
                Objects.requireNonNull(str3);
                return AbstractC6466E.m27000a(str3);
            case "emailLink":
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return AbstractC6514k.m27119b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static List m5455c(AbstractC1359c0.B b7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b7.m5220c().m5240n());
        arrayList.add(b7.m5219b());
        return arrayList;
    }

    /* renamed from: d */
    public static List m5456d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m5457e(list).iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1359c0.v) it.next()).m5397g());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static List m5457e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6476J abstractC6476J = (AbstractC6476J) it.next();
            if (abstractC6476J instanceof C6486S) {
                arrayList.add(new AbstractC1359c0.v.a().m5402e(((C6486S) abstractC6476J).m27041y()).m5399b(abstractC6476J.mo27007M()).m5400c(Double.valueOf(abstractC6476J.mo27009x0())).m5403f(abstractC6476J.mo27008a()).m5401d(abstractC6476J.mo27010y0()).m5398a());
            } else {
                arrayList.add(new AbstractC1359c0.v.a().m5399b(abstractC6476J.mo27007M()).m5400c(Double.valueOf(abstractC6476J.mo27009x0())).m5403f(abstractC6476J.mo27008a()).m5401d(abstractC6476J.mo27010y0()).m5398a());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static AbstractC1359c0.o m5458f(InterfaceC6500d interfaceC6500d) {
        AbstractC1359c0.o.a aVar = new AbstractC1359c0.o.a();
        AbstractC1359c0.p.a aVar2 = new AbstractC1359c0.p.a();
        int mo27067a = interfaceC6500d.mo27067a();
        if (mo27067a == 0) {
            aVar.m5314c(AbstractC1359c0.EnumC7247a.PASSWORD_RESET);
        } else if (mo27067a == 1) {
            aVar.m5314c(AbstractC1359c0.EnumC7247a.VERIFY_EMAIL);
        } else if (mo27067a == 2) {
            aVar.m5314c(AbstractC1359c0.EnumC7247a.RECOVER_EMAIL);
        } else if (mo27067a == 4) {
            aVar.m5314c(AbstractC1359c0.EnumC7247a.EMAIL_SIGN_IN);
        } else if (mo27067a == 5) {
            aVar.m5314c(AbstractC1359c0.EnumC7247a.VERIFY_AND_CHANGE_EMAIL);
        } else if (mo27067a == 6) {
            aVar.m5314c(AbstractC1359c0.EnumC7247a.REVERT_SECOND_FACTOR_ADDITION);
        }
        AbstractC6496b mo27068b = interfaceC6500d.mo27068b();
        if ((mo27068b != null && mo27067a == 1) || mo27067a == 0) {
            aVar2.m5320b(mo27068b.mo27061a());
        } else if (mo27067a == 2 || mo27067a == 5) {
            Objects.requireNonNull(mo27068b);
            AbstractC6494a abstractC6494a = (AbstractC6494a) mo27068b;
            aVar2.m5320b(abstractC6494a.mo27061a());
            aVar2.m5321c(abstractC6494a.mo27062b());
        }
        aVar.m5313b(aVar2.m5319a());
        return aVar.m5312a();
    }

    /* renamed from: g */
    public static AbstractC1359c0.r m5459g(InterfaceC6506g interfaceC6506g) {
        if (interfaceC6506g == null) {
            return null;
        }
        AbstractC1359c0.r.a aVar = new AbstractC1359c0.r.a();
        aVar.m5348b(Boolean.valueOf(interfaceC6506g.mo27110k0()));
        aVar.m5349c(interfaceC6506g.mo27108T());
        aVar.m5350d(interfaceC6506g.mo27109g());
        aVar.m5351e(interfaceC6506g.mo27107G());
        return aVar.m5347a();
    }

    /* renamed from: h */
    public static AbstractC1359c0.s m5460h(AbstractC6508h abstractC6508h) {
        if (abstractC6508h == null) {
            return null;
        }
        int hashCode = abstractC6508h.hashCode();
        C1404v.f4435k.put(Integer.valueOf(hashCode), abstractC6508h);
        AbstractC1359c0.s.a aVar = new AbstractC1359c0.s.a();
        aVar.m5361d(abstractC6508h.mo26997x0());
        aVar.m5362e(abstractC6508h.mo26998y0());
        aVar.m5360c(Long.valueOf(hashCode));
        if (abstractC6508h instanceof AbstractC6481M) {
            aVar.m5359b(((AbstractC6481M) abstractC6508h).mo27016A0());
        }
        return aVar.m5358a();
    }

    /* renamed from: i */
    public static AbstractC1359c0.A m5461i(InterfaceC6510i interfaceC6510i) {
        AbstractC1359c0.A.a aVar = new AbstractC1359c0.A.a();
        aVar.m5215b(m5459g(interfaceC6510i.mo27111R()));
        aVar.m5216c(m5460h(interfaceC6510i.mo27112S()));
        aVar.m5217d(m5462j(interfaceC6510i.mo27113d0()));
        return aVar.m5214a();
    }

    /* renamed from: j */
    public static AbstractC1359c0.B m5462j(AbstractC6458A abstractC6458A) {
        if (abstractC6458A == null) {
            return null;
        }
        AbstractC1359c0.B.a aVar = new AbstractC1359c0.B.a();
        AbstractC1359c0.C.a aVar2 = new AbstractC1359c0.C.a();
        aVar2.m5243c(abstractC6458A.mo26964M());
        aVar2.m5244d(abstractC6458A.mo26980f0());
        aVar2.m5246f(Boolean.valueOf(abstractC6458A.mo27066r()));
        aVar2.m5245e(Boolean.valueOf(abstractC6458A.mo26955D0()));
        if (abstractC6458A.mo26985z0() != null) {
            aVar2.m5242b(Long.valueOf(abstractC6458A.mo26985z0().mo26986D()));
            aVar2.m5247g(Long.valueOf(abstractC6458A.mo26985z0().mo26987N()));
        }
        aVar2.m5248h(abstractC6458A.mo26983y());
        aVar2.m5249i(m5463k(abstractC6458A.mo26981m()));
        aVar2.m5251k(abstractC6458A.mo26979a());
        aVar2.m5250j(abstractC6458A.mo26954C0());
        aVar.m5226c(aVar2.m5241a());
        aVar.m5225b(m5465m(abstractC6458A.mo26953B0()));
        return aVar.m5224a();
    }

    /* renamed from: k */
    public static String m5463k(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if (StringUtils.EMPTY.equals(uri2)) {
            return null;
        }
        return uri2;
    }

    /* renamed from: l */
    public static AbstractC1359c0.u m5464l(C6462C c6462c) {
        AbstractC1359c0.u.a aVar = new AbstractC1359c0.u.a();
        aVar.m5390h(c6462c.m26994g());
        aVar.m5388f(c6462c.m26992e());
        aVar.m5384b(Long.valueOf(c6462c.m26988a() * 1000));
        aVar.m5386d(Long.valueOf(c6462c.m26990c() * 1000));
        aVar.m5387e(Long.valueOf(c6462c.m26991d() * 1000));
        aVar.m5385c(c6462c.m26989b());
        aVar.m5389g(c6462c.m26993f());
        return aVar.m5383a();
    }

    /* renamed from: m */
    public static List m5465m(List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            InterfaceC6499c0 interfaceC6499c0 = (InterfaceC6499c0) it.next();
            if (interfaceC6499c0 != null && !"firebase".equals(interfaceC6499c0.mo27065g())) {
                arrayList.add(m5466n(interfaceC6499c0));
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static Map m5466n(InterfaceC6499c0 interfaceC6499c0) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", interfaceC6499c0.mo26964M());
        hashMap.put("email", interfaceC6499c0.mo26980f0());
        hashMap.put("isEmailVerified", Boolean.valueOf(interfaceC6499c0.mo27066r()));
        hashMap.put("phoneNumber", interfaceC6499c0.mo26983y());
        hashMap.put("photoUrl", m5463k(interfaceC6499c0.mo26981m()));
        hashMap.put("uid", interfaceC6499c0.mo26979a() == null ? StringUtils.EMPTY : interfaceC6499c0.mo26979a());
        hashMap.put("providerId", interfaceC6499c0.mo27065g());
        hashMap.put("isAnonymous", Boolean.FALSE);
        return hashMap;
    }
}
