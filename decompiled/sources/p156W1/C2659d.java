package p156W1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p011B3.C0044c;
import p011B3.InterfaceC0042a;
import p149V1.C2610c;
import p156W1.C2659d;
import p163X1.AbstractC2799a;
import p163X1.AbstractC2808j;
import p163X1.AbstractC2809k;
import p163X1.AbstractC2810l;
import p163X1.AbstractC2811m;
import p163X1.AbstractC2812n;
import p163X1.AbstractC2813o;
import p163X1.EnumC2814p;
import p170Y1.AbstractC2902i;
import p170Y1.C2901h;
import p177Z1.AbstractC2979f;
import p177Z1.AbstractC2980g;
import p177Z1.InterfaceC2986m;
import p202c2.AbstractC3570a;
import p210d2.AbstractC4109b;
import p210d2.InterfaceC4108a;
import p210d2.InterfaceC4110c;
import p250i2.InterfaceC4534a;

/* renamed from: W1.d */
/* loaded from: classes.dex */
public final class C2659d implements InterfaceC2986m {

    /* renamed from: a */
    public final InterfaceC0042a f7890a;

    /* renamed from: b */
    public final ConnectivityManager f7891b;

    /* renamed from: c */
    public final Context f7892c;

    /* renamed from: d */
    public final URL f7893d;

    /* renamed from: e */
    public final InterfaceC4534a f7894e;

    /* renamed from: f */
    public final InterfaceC4534a f7895f;

    /* renamed from: g */
    public final int f7896g;

    /* renamed from: W1.d$a */
    public static final class a {

        /* renamed from: a */
        public final URL f7897a;

        /* renamed from: b */
        public final AbstractC2808j f7898b;

        /* renamed from: c */
        public final String f7899c;

        public a(URL url, AbstractC2808j abstractC2808j, String str) {
            this.f7897a = url;
            this.f7898b = abstractC2808j;
            this.f7899c = str;
        }

        /* renamed from: a */
        public a m9132a(URL url) {
            return new a(url, this.f7898b, this.f7899c);
        }
    }

    /* renamed from: W1.d$b */
    public static final class b {

        /* renamed from: a */
        public final int f7900a;

        /* renamed from: b */
        public final URL f7901b;

        /* renamed from: c */
        public final long f7902c;

        public b(int i7, URL url, long j7) {
            this.f7900a = i7;
            this.f7901b = url;
            this.f7902c = j7;
        }
    }

    public C2659d(Context context, InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2, int i7) {
        this.f7890a = AbstractC2808j.m10054b();
        this.f7892c = context;
        this.f7891b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7893d = m9127n(C2656a.f7881c);
        this.f7894e = interfaceC4534a2;
        this.f7895f = interfaceC4534a;
        this.f7896g = i7;
    }

    /* renamed from: f */
    public static int m9120f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC2813o.b.UNKNOWN_MOBILE_SUBTYPE.m10066f();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC2813o.b.COMBINED.m10066f();
        }
        if (AbstractC2813o.b.m10065b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    public static int m9121g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC2813o.c.NONE.m10068f() : networkInfo.getType();
    }

    /* renamed from: h */
    public static int m9122h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            AbstractC3570a.m14402d("CctTransportBackend", "Unable to find version code for package", e7);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m9123j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    public static long m9124k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / PipesIterator.DEFAULT_QUEUE_SIZE;
    }

    /* renamed from: l */
    public static /* synthetic */ a m9125l(a aVar, b bVar) {
        URL url = bVar.f7901b;
        if (url == null) {
            return null;
        }
        AbstractC3570a.m14400b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m9132a(bVar.f7901b);
    }

    /* renamed from: m */
    public static InputStream m9126m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    public static URL m9127n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e7) {
            throw new IllegalArgumentException("Invalid url: " + str, e7);
        }
    }

    @Override // p177Z1.InterfaceC2986m
    /* renamed from: a */
    public AbstractC2902i mo9128a(AbstractC2902i abstractC2902i) {
        NetworkInfo activeNetworkInfo = this.f7891b.getActiveNetworkInfo();
        return abstractC2902i.m10475l().m10476a("sdk-version", Build.VERSION.SDK_INT).m10478c("model", Build.MODEL).m10478c("hardware", Build.HARDWARE).m10478c("device", Build.DEVICE).m10478c("product", Build.PRODUCT).m10478c("os-uild", Build.ID).m10478c("manufacturer", Build.MANUFACTURER).m10478c("fingerprint", Build.FINGERPRINT).m10477b("tz-offset", m9124k()).m10476a("net-type", m9121g(activeNetworkInfo)).m10476a("mobile-subtype", m9120f(activeNetworkInfo)).m10478c("country", Locale.getDefault().getCountry()).m10478c("locale", Locale.getDefault().getLanguage()).m10478c("mcc_mnc", m9123j(this.f7892c).getSimOperator()).m10478c("application_build", Integer.toString(m9122h(this.f7892c))).mo10436d();
    }

    @Override // p177Z1.InterfaceC2986m
    /* renamed from: b */
    public AbstractC2980g mo9129b(AbstractC2979f abstractC2979f) {
        AbstractC2808j m9131i = m9131i(abstractC2979f);
        URL url = this.f7893d;
        if (abstractC2979f.mo10720c() != null) {
            try {
                C2656a m9111d = C2656a.m9111d(abstractC2979f.mo10720c());
                r3 = m9111d.m9115e() != null ? m9111d.m9115e() : null;
                if (m9111d.m9116f() != null) {
                    url = m9127n(m9111d.m9116f());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2980g.m10732a();
            }
        }
        try {
            b bVar = (b) AbstractC4109b.m17288a(5, new a(url, m9131i, r3), new InterfaceC4108a() { // from class: W1.b
                @Override // p210d2.InterfaceC4108a
                public final Object apply(Object obj) {
                    C2659d.b m9130e;
                    m9130e = C2659d.this.m9130e((C2659d.a) obj);
                    return m9130e;
                }
            }, new InterfaceC4110c() { // from class: W1.c
                @Override // p210d2.InterfaceC4110c
                /* renamed from: a */
                public final Object mo9117a(Object obj, Object obj2) {
                    C2659d.a m9125l;
                    m9125l = C2659d.m9125l((C2659d.a) obj, (C2659d.b) obj2);
                    return m9125l;
                }
            });
            int i7 = bVar.f7900a;
            if (i7 == 200) {
                return AbstractC2980g.m10734e(bVar.f7902c);
            }
            if (i7 < 500 && i7 != 404) {
                return i7 == 400 ? AbstractC2980g.m10733d() : AbstractC2980g.m10732a();
            }
            return AbstractC2980g.m10735f();
        } catch (IOException e7) {
            AbstractC3570a.m14402d("CctTransportBackend", "Could not make request to the backend", e7);
            return AbstractC2980g.m10735f();
        }
    }

    /* renamed from: e */
    public final b m9130e(a aVar) {
        AbstractC3570a.m14404f("CctTransportBackend", "Making request to: %s", aVar.f7897a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f7897a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f7896g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f7899c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f7890a.mo104a(aVar.f7898b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC3570a.m14404f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC3570a.m14400b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                    AbstractC3570a.m14400b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m9126m = m9126m(inputStream, httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                        try {
                            b bVar = new b(responseCode, null, AbstractC2812n.m10063b(new BufferedReader(new InputStreamReader(m9126m))).mo10047c());
                            if (m9126m != null) {
                                m9126m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (C0044c e7) {
            e = e7;
            AbstractC3570a.m14402d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e8) {
            e = e8;
            AbstractC3570a.m14402d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            AbstractC3570a.m14402d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e10) {
            e = e10;
            AbstractC3570a.m14402d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: i */
    public final AbstractC2808j m9131i(AbstractC2979f abstractC2979f) {
        AbstractC2810l.a m10058j;
        HashMap hashMap = new HashMap();
        for (AbstractC2902i abstractC2902i : abstractC2979f.mo10719b()) {
            String mo10434j = abstractC2902i.mo10434j();
            if (hashMap.containsKey(mo10434j)) {
                ((List) hashMap.get(mo10434j)).add(abstractC2902i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC2902i);
                hashMap.put(mo10434j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC2902i abstractC2902i2 = (AbstractC2902i) ((List) entry.getValue()).get(0);
            AbstractC2811m.a mo10040b = AbstractC2811m.m10059a().mo10044f(EnumC2814p.DEFAULT).mo10045g(this.f7895f.mo19269a()).mo10046h(this.f7894e.mo19269a()).mo10040b(AbstractC2809k.m10055a().mo10016c(AbstractC2809k.b.ANDROID_FIREBASE).mo10015b(AbstractC2799a.m9979a().mo10004m(Integer.valueOf(abstractC2902i2.m10472g("sdk-version"))).mo10001j(abstractC2902i2.m10471b("model")).mo9997f(abstractC2902i2.m10471b("hardware")).mo9995d(abstractC2902i2.m10471b("device")).mo10003l(abstractC2902i2.m10471b("product")).mo10002k(abstractC2902i2.m10471b("os-uild")).mo9999h(abstractC2902i2.m10471b("manufacturer")).mo9996e(abstractC2902i2.m10471b("fingerprint")).mo9994c(abstractC2902i2.m10471b("country")).mo9998g(abstractC2902i2.m10471b("locale")).mo10000i(abstractC2902i2.m10471b("mcc_mnc")).mo9993b(abstractC2902i2.m10471b("application_build")).mo9992a()).mo10014a());
            try {
                mo10040b.m10060i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo10040b.m10061j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC2902i abstractC2902i3 : (List) entry.getValue()) {
                C2901h mo10432e = abstractC2902i3.mo10432e();
                C2610c m10469b = mo10432e.m10469b();
                if (m10469b.equals(C2610c.m8990b("proto"))) {
                    m10058j = AbstractC2810l.m10058j(mo10432e.m10468a());
                } else if (m10469b.equals(C2610c.m8990b("json"))) {
                    m10058j = AbstractC2810l.m10057i(new String(mo10432e.m10468a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC3570a.m14405g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m10469b);
                }
                m10058j.mo10026c(abstractC2902i3.mo10433f()).mo10027d(abstractC2902i3.mo10435k()).mo10031h(abstractC2902i3.m10473h("tz-offset")).mo10028e(AbstractC2813o.m10064a().mo10052c(AbstractC2813o.c.m10067b(abstractC2902i3.m10472g("net-type"))).mo10051b(AbstractC2813o.b.m10065b(abstractC2902i3.m10472g("mobile-subtype"))).mo10050a());
                if (abstractC2902i3.mo10431d() != null) {
                    m10058j.mo10025b(abstractC2902i3.mo10431d());
                }
                arrayList3.add(m10058j.mo10024a());
            }
            mo10040b.mo10041c(arrayList3);
            arrayList2.add(mo10040b.mo10039a());
        }
        return AbstractC2808j.m10053a(arrayList2);
    }

    public C2659d(Context context, InterfaceC4534a interfaceC4534a, InterfaceC4534a interfaceC4534a2) {
        this(context, interfaceC4534a, interfaceC4534a2, 130000);
    }
}
