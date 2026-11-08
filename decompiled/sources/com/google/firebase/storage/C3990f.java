package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.io.UnsupportedEncodingException;
import p004A3.C0020a;
import p137T3.InterfaceC2447b;
import p219e3.C4176f;
import p220e4.AbstractC4197i;
import p262j3.AbstractC5368d;
import p303o3.InterfaceC5938a;
import p303o3.InterfaceC5939b;
import p354u3.InterfaceC6640b;

/* renamed from: com.google.firebase.storage.f */
/* loaded from: classes.dex */
public class C3990f {

    /* renamed from: a */
    public final C4176f f13159a;

    /* renamed from: b */
    public final InterfaceC2447b f13160b;

    /* renamed from: c */
    public final InterfaceC2447b f13161c;

    /* renamed from: d */
    public final String f13162d;

    /* renamed from: e */
    public long f13163e = 600000;

    /* renamed from: f */
    public long f13164f = 60000;

    /* renamed from: g */
    public long f13165g = 600000;

    /* renamed from: h */
    public long f13166h = 120000;

    /* renamed from: i */
    public C0020a f13167i;

    public C3990f(String str, C4176f c4176f, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2) {
        this.f13162d = str;
        this.f13159a = c4176f;
        this.f13160b = interfaceC2447b;
        this.f13161c = interfaceC2447b2;
        if (interfaceC2447b2 == null || interfaceC2447b2.get() == null) {
            return;
        }
        ((InterfaceC5939b) interfaceC2447b2.get()).mo23364c(new a());
    }

    /* renamed from: f */
    public static C3990f m15997f(C4176f c4176f, String str) {
        AbstractC3802r.m15120b(c4176f != null, "Null is not a valid value for the FirebaseApp.");
        AbstractC3802r.m15120b(str != null, "Null is not a valid value for the Firebase Storage URL.");
        if (!str.toLowerCase().startsWith("gs://")) {
            throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
        }
        try {
            return m15998g(c4176f, AbstractC4197i.m17607d(c4176f, str));
        } catch (UnsupportedEncodingException e7) {
            Log.e("FirebaseStorage", "Unable to parse url:" + str, e7);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    /* renamed from: g */
    public static C3990f m15998g(C4176f c4176f, Uri uri) {
        String host = uri != null ? uri.getHost() : null;
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
        }
        AbstractC3802r.m15130l(c4176f, "Provided FirebaseApp must not be null.");
        C3991g c3991g = (C3991g) c4176f.m17531k(C3991g.class);
        AbstractC3802r.m15130l(c3991g, "Firebase Storage component is not present.");
        return c3991g.m16015a(host);
    }

    /* renamed from: a */
    public C4176f m15999a() {
        return this.f13159a;
    }

    /* renamed from: b */
    public InterfaceC5939b m16000b() {
        InterfaceC2447b interfaceC2447b = this.f13161c;
        if (interfaceC2447b != null) {
            return (InterfaceC5939b) interfaceC2447b.get();
        }
        return null;
    }

    /* renamed from: c */
    public InterfaceC6640b m16001c() {
        InterfaceC2447b interfaceC2447b = this.f13160b;
        if (interfaceC2447b != null) {
            return (InterfaceC6640b) interfaceC2447b.get();
        }
        return null;
    }

    /* renamed from: d */
    public final String m16002d() {
        return this.f13162d;
    }

    /* renamed from: e */
    public C0020a m16003e() {
        return this.f13167i;
    }

    /* renamed from: h */
    public long m16004h() {
        return this.f13164f;
    }

    /* renamed from: i */
    public long m16005i() {
        return this.f13165g;
    }

    /* renamed from: j */
    public long m16006j() {
        return this.f13166h;
    }

    /* renamed from: k */
    public long m16007k() {
        return this.f13163e;
    }

    /* renamed from: l */
    public C4000p m16008l() {
        if (TextUtils.isEmpty(m16002d())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return m16009m(new Uri.Builder().scheme("gs").authority(m16002d()).path("/").build());
    }

    /* renamed from: m */
    public final C4000p m16009m(Uri uri) {
        AbstractC3802r.m15130l(uri, "uri must not be null");
        String m16002d = m16002d();
        AbstractC3802r.m15120b(TextUtils.isEmpty(m16002d) || uri.getAuthority().equalsIgnoreCase(m16002d), "The supplied bucketname does not match the storage bucket of the current instance.");
        return new C4000p(uri, this);
    }

    /* renamed from: n */
    public C4000p m16010n(String str) {
        AbstractC3802r.m15120b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return m16008l().m16079f(str);
    }

    /* renamed from: o */
    public void m16011o(long j7) {
        this.f13165g = j7;
    }

    /* renamed from: p */
    public void m16012p(long j7) {
        this.f13166h = j7;
    }

    /* renamed from: q */
    public void m16013q(long j7) {
        this.f13163e = j7;
    }

    /* renamed from: r */
    public void m16014r(String str, int i7) {
        this.f13167i = new C0020a(str, i7);
    }

    /* renamed from: com.google.firebase.storage.f$a */
    public class a implements InterfaceC5938a {
        public a() {
        }

        @Override // p303o3.InterfaceC5938a
        /* renamed from: a */
        public void mo2143a(AbstractC5368d abstractC5368d) {
        }
    }
}
