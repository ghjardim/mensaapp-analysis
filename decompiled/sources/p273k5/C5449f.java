package p273k5;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: k5.f */
/* loaded from: classes2.dex */
public final class C5449f implements HostnameVerifier {

    /* renamed from: a */
    public static final C5449f f19645a = new C5449f();

    /* renamed from: b */
    public static final Pattern f19646b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: a */
    public static List m22968a(X509Certificate x509Certificate, int i7) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i7 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    public static boolean m22969c(String str) {
        return f19646b.matcher(str).matches();
    }

    /* renamed from: b */
    public boolean m22970b(String str, X509Certificate x509Certificate) {
        return m22969c(str) ? m22973f(str, x509Certificate) : m22972e(str, x509Certificate);
    }

    /* renamed from: d */
    public final boolean m22971d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m22972e(String str, X509Certificate x509Certificate) {
        String m22952b;
        String lowerCase = str.toLowerCase(Locale.US);
        List m22968a = m22968a(x509Certificate, 2);
        int size = m22968a.size();
        int i7 = 0;
        boolean z6 = false;
        while (i7 < size) {
            if (m22971d(lowerCase, (String) m22968a.get(i7))) {
                return true;
            }
            i7++;
            z6 = true;
        }
        if (z6 || (m22952b = new C5447d(x509Certificate.getSubjectX500Principal()).m22952b("cn")) == null) {
            return false;
        }
        return m22971d(lowerCase, m22952b);
    }

    /* renamed from: f */
    public final boolean m22973f(String str, X509Certificate x509Certificate) {
        List m22968a = m22968a(x509Certificate, 7);
        int size = m22968a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (str.equalsIgnoreCase((String) m22968a.get(i7))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m22970b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
