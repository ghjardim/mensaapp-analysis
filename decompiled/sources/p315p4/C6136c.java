package p315p4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p061I4.C0652d;
import p061I4.C0659k;
import p061I4.InterfaceC0661m;

/* renamed from: p4.c */
/* loaded from: classes.dex */
public final class C6136c implements InterfaceC0661m {

    /* renamed from: l */
    public static final a f21897l = new a(null);

    /* renamed from: m */
    public static final int f21898m = (C6137d.class.hashCode() + 43) & 65535;

    /* renamed from: n */
    public static final int f21899n = (C6137d.class.hashCode() + 83) & 65535;

    /* renamed from: c */
    public final Activity f21900c;

    /* renamed from: d */
    public C0659k.d f21901d;

    /* renamed from: e */
    public boolean f21902e;

    /* renamed from: f */
    public boolean f21903f;

    /* renamed from: g */
    public String f21904g;

    /* renamed from: h */
    public int f21905h;

    /* renamed from: i */
    public ArrayList f21906i;

    /* renamed from: j */
    public C0652d.b f21907j;

    /* renamed from: k */
    public byte[] f21908k;

    /* renamed from: p4.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final void m25560a(C0659k.d result) {
            AbstractC5469l.m23028e(result, "result");
            result.mo2315b("already_active", "File picker is already active", null);
        }

        /* renamed from: b */
        public final int m25561b() {
            return C6136c.f21898m;
        }

        /* renamed from: c */
        public final int m25562c() {
            return C6136c.f21899n;
        }

        public a() {
        }
    }

    public C6136c(Activity activity, C0659k.d dVar) {
        AbstractC5469l.m23028e(activity, "activity");
        this.f21900c = activity;
        this.f21901d = dVar;
    }

    /* renamed from: g */
    public static final void m25540g(C6136c c6136c, boolean z6) {
        C0652d.b bVar = c6136c.f21907j;
        if (bVar != null) {
            bVar.mo2629a(Boolean.valueOf(z6));
        }
    }

    @Override // p061I4.InterfaceC0661m
    /* renamed from: a */
    public boolean mo2655a(int i7, int i8, Intent intent) {
        if (i7 == f21899n) {
            return m25549n(i8, intent);
        }
        if (i7 == f21898m) {
            return m25548m(i8, intent);
        }
        m25543h("unknown_activity", "Unknown activity error, please file an issue.");
        return false;
    }

    /* renamed from: e */
    public final void m25541e() {
        this.f21901d = null;
    }

    /* renamed from: f */
    public final void m25542f(final boolean z6) {
        if (this.f21907j == null || AbstractC5469l.m23024a(this.f21904g, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: p4.b
            @Override // java.lang.Runnable
            public final void run() {
                C6136c.m25540g(C6136c.this, z6);
            }
        });
    }

    /* renamed from: h */
    public final void m25543h(String errorCode, String str) {
        AbstractC5469l.m23028e(errorCode, "errorCode");
        m25542f(false);
        C0659k.d dVar = this.f21901d;
        if (dVar != null) {
            dVar.mo2315b(errorCode, str, null);
        }
        m25541e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r2 == 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25544i(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            r5.m25542f(r0)
            I4.k$d r0 = r5.f21901d
            if (r0 == 0) goto L50
            r1 = 0
            if (r6 == 0) goto L17
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L11
            r2 = r6
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 != 0) goto L15
            goto L17
        L15:
            r1 = r2
            goto L4a
        L17:
            boolean r2 = r6 instanceof java.util.ArrayList
            if (r2 == 0) goto L1e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            goto L1f
        L1e:
            r6 = r1
        L1f:
            if (r6 == 0) goto L4a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r6.next()
            boolean r4 = r3 instanceof p315p4.C6134a
            if (r4 == 0) goto L3b
            p4.a r3 = (p315p4.C6134a) r3
            goto L3c
        L3b:
            r3 = r1
        L3c:
            if (r3 == 0) goto L43
            java.util.HashMap r3 = r3.m25530a()
            goto L44
        L43:
            r3 = r1
        L44:
            if (r3 == 0) goto L2a
            r2.add(r3)
            goto L2a
        L4a:
            r0.mo2314a(r1)
            r5.m25541e()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p315p4.C6136c.m25544i(java.lang.Object):void");
    }

    /* renamed from: j */
    public final Activity m25545j() {
        return this.f21900c;
    }

    /* renamed from: k */
    public final ArrayList m25546k() {
        return this.f21906i;
    }

    /* renamed from: l */
    public final String m25547l() {
        return this.f21904g;
    }

    /* renamed from: m */
    public final boolean m25548m(int i7, Intent intent) {
        if (i7 != -1) {
            if (i7 != 0) {
                return false;
            }
            m25544i(null);
            return true;
        }
        m25542f(true);
        C6139f c6139f = C6139f.f21921a;
        Activity activity = this.f21900c;
        int i8 = this.f21905h;
        boolean z6 = this.f21903f;
        String str = this.f21904g;
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        c6139f.m25595x(this, activity, intent, i8, z6, str);
        return true;
    }

    /* renamed from: n */
    public final boolean m25549n(int i7, Intent intent) {
        if (i7 == -1) {
            return m25551p(intent != null ? intent.getData() : null);
        }
        if (i7 != 0) {
            return false;
        }
        m25544i(null);
        return false;
    }

    /* renamed from: o */
    public final boolean m25550o() {
        return this.f21902e;
    }

    /* renamed from: p */
    public final boolean m25551p(Uri uri) {
        if (uri == null) {
            return false;
        }
        m25542f(true);
        try {
            Uri m25581D = C6139f.f21921a.m25581D(this.f21900c, uri, this.f21908k);
            if (m25581D != null) {
                uri = m25581D;
            }
            m25544i(uri.getPath());
            return true;
        } catch (IOException e7) {
            Log.e("FilePickerDelegate", "Error while saving file", e7);
            m25543h("Error while saving file", e7.getMessage());
            return false;
        }
    }

    /* renamed from: q */
    public final void m25552q(ArrayList arrayList) {
        this.f21906i = arrayList;
    }

    /* renamed from: r */
    public final void m25553r(byte[] bArr) {
        this.f21908k = bArr;
    }

    /* renamed from: s */
    public final void m25554s(int i7) {
        this.f21905h = i7;
    }

    /* renamed from: t */
    public final void m25555t(C0652d.b bVar) {
        this.f21907j = bVar;
    }

    /* renamed from: u */
    public final void m25556u(boolean z6) {
        this.f21903f = z6;
    }

    /* renamed from: v */
    public final void m25557v(boolean z6) {
        this.f21902e = z6;
    }

    /* renamed from: w */
    public final boolean m25558w(C0659k.d result) {
        AbstractC5469l.m23028e(result, "result");
        if (this.f21901d != null) {
            return false;
        }
        this.f21901d = result;
        return true;
    }

    /* renamed from: x */
    public final void m25559x(String str) {
        this.f21904g = str;
    }

    public /* synthetic */ C6136c(Activity activity, C0659k.d dVar, int i7, AbstractC5464g abstractC5464g) {
        this(activity, (i7 & 2) != 0 ? null : dVar);
    }
}
