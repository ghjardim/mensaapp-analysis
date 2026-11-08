package p103O4;

import android.app.Activity;
import com.google.firebase.auth.AbstractC3933b;
import com.google.firebase.auth.C3932a;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.utils.StringUtils;
import p061I4.C0652d;
import p103O4.AbstractC1359c0;
import p219e3.C4183m;
import p346t3.AbstractC6480L;
import p346t3.C6483O;
import p346t3.C6486S;

/* renamed from: O4.i1 */
/* loaded from: classes2.dex */
public class C1378i1 implements C0652d.d {

    /* renamed from: k */
    public static final HashMap f4399k = new HashMap();

    /* renamed from: a */
    public final AtomicReference f4400a;

    /* renamed from: b */
    public final FirebaseAuth f4401b;

    /* renamed from: c */
    public final String f4402c;

    /* renamed from: d */
    public final C6486S f4403d;

    /* renamed from: e */
    public final int f4404e;

    /* renamed from: f */
    public final b f4405f;

    /* renamed from: g */
    public final AbstractC6480L f4406g;

    /* renamed from: h */
    public String f4407h;

    /* renamed from: i */
    public Integer f4408i;

    /* renamed from: j */
    public C0652d.b f4409j;

    /* renamed from: O4.i1$a */
    public class a extends AbstractC3933b.b {
        public a() {
        }

        @Override // com.google.firebase.auth.AbstractC3933b.b
        public void onCodeAutoRetrievalTimeOut(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("name", "Auth#phoneCodeAutoRetrievalTimeout");
            if (C1378i1.this.f4409j != null) {
                C1378i1.this.f4409j.mo2629a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.AbstractC3933b.b
        public void onCodeSent(String str, AbstractC3933b.a aVar) {
            int hashCode = aVar.hashCode();
            C1378i1.f4399k.put(Integer.valueOf(hashCode), aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
            hashMap.put("name", "Auth#phoneCodeSent");
            if (C1378i1.this.f4409j != null) {
                C1378i1.this.f4409j.mo2629a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.AbstractC3933b.b
        public void onVerificationCompleted(C6483O c6483o) {
            int hashCode = c6483o.hashCode();
            C1378i1.this.f4405f.mo5452a(c6483o);
            HashMap hashMap = new HashMap();
            hashMap.put("token", Integer.valueOf(hashCode));
            if (c6483o.m27034A0() != null) {
                hashMap.put("smsCode", c6483o.m27034A0());
            }
            hashMap.put("name", "Auth#phoneVerificationCompleted");
            if (C1378i1.this.f4409j != null) {
                C1378i1.this.f4409j.mo2629a(hashMap);
            }
        }

        @Override // com.google.firebase.auth.AbstractC3933b.b
        public void onVerificationFailed(C4183m c4183m) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            AbstractC1359c0.C7253g m5513e = AbstractC1406w.m5513e(c4183m);
            hashMap2.put("code", m5513e.f4285a.replaceAll("ERROR_", StringUtils.EMPTY).toLowerCase(Locale.ROOT).replaceAll("_", "-"));
            hashMap2.put("message", m5513e.getMessage());
            hashMap2.put("details", m5513e.f4286b);
            hashMap.put("error", hashMap2);
            hashMap.put("name", "Auth#phoneVerificationFailed");
            if (C1378i1.this.f4409j != null) {
                C1378i1.this.f4409j.mo2629a(hashMap);
            }
        }
    }

    /* renamed from: O4.i1$b */
    public interface b {
        /* renamed from: a */
        void mo5452a(C6483O c6483o);
    }

    public C1378i1(Activity activity, AbstractC1359c0.C7248b c7248b, AbstractC1359c0.E e7, AbstractC6480L abstractC6480L, C6486S c6486s, b bVar) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.f4400a = atomicReference;
        atomicReference.set(activity);
        this.f4406g = abstractC6480L;
        this.f4403d = c6486s;
        this.f4401b = C1404v.m5487X(c7248b);
        this.f4402c = e7.m5267f();
        this.f4404e = AbstractC1375h1.m5449a(e7.m5268g().longValue());
        if (e7.m5263b() != null) {
            this.f4407h = e7.m5263b();
        }
        if (e7.m5264c() != null) {
            this.f4408i = Integer.valueOf(AbstractC1375h1.m5449a(e7.m5264c().longValue()));
        }
        this.f4405f = bVar;
    }

    @Override // p061I4.C0652d.d
    /* renamed from: a */
    public void mo2635a(Object obj) {
        this.f4409j = null;
        this.f4400a.set(null);
    }

    @Override // p061I4.C0652d.d
    /* renamed from: c */
    public void mo2636c(Object obj, C0652d.b bVar) {
        AbstractC3933b.a aVar;
        this.f4409j = bVar;
        a aVar2 = new a();
        if (this.f4407h != null) {
            this.f4401b.m15365o().mo27129c(this.f4402c, this.f4407h);
        }
        C3932a.a aVar3 = new C3932a.a(this.f4401b);
        aVar3.m15403b((Activity) this.f4400a.get());
        aVar3.m15404c(aVar2);
        String str = this.f4402c;
        if (str != null) {
            aVar3.m15408g(str);
        }
        AbstractC6480L abstractC6480L = this.f4406g;
        if (abstractC6480L != null) {
            aVar3.m15407f(abstractC6480L);
        }
        C6486S c6486s = this.f4403d;
        if (c6486s != null) {
            aVar3.m15406e(c6486s);
        }
        aVar3.m15409h(Long.valueOf(this.f4404e), TimeUnit.MILLISECONDS);
        Integer num = this.f4408i;
        if (num != null && (aVar = (AbstractC3933b.a) f4399k.get(num)) != null) {
            aVar3.m15405d(aVar);
        }
        AbstractC3933b.m15411b(aVar3.m15402a());
    }
}
