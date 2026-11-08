package p103O4;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p103O4.AbstractC1359c0;
import p219e3.C4173c;
import p219e3.C4184n;
import p219e3.C4186p;
import p346t3.AbstractC6478K;
import p346t3.AbstractC6480L;
import p346t3.AbstractC6508h;
import p346t3.C6526q;
import p346t3.C6534u;
import p346t3.C6540x;
import p346t3.C6542y;

/* renamed from: O4.w */
/* loaded from: classes2.dex */
public abstract class AbstractC1406w {
    /* renamed from: a */
    public static AbstractC1359c0.C7253g m5509a() {
        return new AbstractC1359c0.C7253g("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    /* renamed from: b */
    public static AbstractC1359c0.C7253g m5510b() {
        return new AbstractC1359c0.C7253g("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    /* renamed from: c */
    public static AbstractC1359c0.C7253g m5511c() {
        return new AbstractC1359c0.C7253g("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    /* renamed from: d */
    public static AbstractC1359c0.C7253g m5512d() {
        return new AbstractC1359c0.C7253g("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    /* renamed from: e */
    public static AbstractC1359c0.C7253g m5513e(Exception exc) {
        if (exc == null) {
            return new AbstractC1359c0.C7253g("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof C6534u) {
            C6534u c6534u = (C6534u) exc;
            HashMap hashMap2 = new HashMap();
            AbstractC6478K m27126b = c6534u.m27126b();
            List mo27014y0 = m27126b.mo27014y0();
            AbstractC6480L mo27015z0 = m27126b.mo27015z0();
            String uuid = UUID.randomUUID().toString();
            C1348Y.f4208b.put(uuid, mo27015z0);
            String uuid2 = UUID.randomUUID().toString();
            C1348Y.f4209c.put(uuid2, m27126b);
            List m5456d = AbstractC1381j1.m5456d(mo27014y0);
            hashMap2.put("appName", c6534u.m27126b().mo27013x0().m15359l().m17533q());
            hashMap2.put("multiFactorHints", m5456d);
            hashMap2.put("multiFactorSessionId", uuid);
            hashMap2.put("multiFactorResolverId", uuid2);
            return new AbstractC1359c0.C7253g(c6534u.m27125a(), c6534u.getLocalizedMessage(), hashMap2);
        }
        if ((exc instanceof C4184n) || (exc.getCause() != null && (exc.getCause() instanceof C4184n))) {
            return new AbstractC1359c0.C7253g("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof C4173c) || (exc.getCause() != null && (exc.getCause() instanceof C4173c))) {
            return new AbstractC1359c0.C7253g("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof C4186p) || (exc.getCause() != null && (exc.getCause() instanceof C4186p))) {
            return new AbstractC1359c0.C7253g("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new AbstractC1359c0.C7253g("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return m5509a();
        }
        String m27125a = exc instanceof C6526q ? ((C6526q) exc).m27125a() : "UNKNOWN";
        if (exc instanceof C6542y) {
            message = ((C6542y) exc).m27134b();
        }
        if (exc instanceof C6540x) {
            C6540x c6540x = (C6540x) exc;
            String m27130b = c6540x.m27130b();
            if (m27130b != null) {
                hashMap.put("email", m27130b);
            }
            AbstractC6508h m27131c = c6540x.m27131c();
            if (m27131c != null) {
                hashMap.put("authCredential", AbstractC1381j1.m5460h(m27131c));
            }
        }
        return new AbstractC1359c0.C7253g(m27125a, message, hashMap);
    }
}
