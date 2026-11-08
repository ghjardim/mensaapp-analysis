package p145U4;

import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.storage.AbstractC3975E;
import com.google.firebase.storage.C3984N;
import com.google.firebase.storage.C3989e;
import com.google.firebase.storage.C3999o;
import com.google.firebase.storage.C4000p;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p061I4.C0659k;

/* renamed from: U4.l */
/* loaded from: classes2.dex */
public class C2568l {

    /* renamed from: l */
    public static final SparseArray f7532l = new SparseArray();

    /* renamed from: a */
    public final a f7533a;

    /* renamed from: b */
    public final int f7534b;

    /* renamed from: c */
    public final C4000p f7535c;

    /* renamed from: d */
    public final byte[] f7536d;

    /* renamed from: e */
    public final Uri f7537e;

    /* renamed from: f */
    public final C3999o f7538f;

    /* renamed from: j */
    public AbstractC3975E f7542j;

    /* renamed from: g */
    public final Object f7539g = new Object();

    /* renamed from: h */
    public final Object f7540h = new Object();

    /* renamed from: i */
    public final Object f7541i = new Object();

    /* renamed from: k */
    public Boolean f7543k = Boolean.FALSE;

    /* renamed from: U4.l$a */
    public enum a {
        FILE,
        BYTES,
        DOWNLOAD
    }

    public C2568l(a aVar, int i7, C4000p c4000p, byte[] bArr, Uri uri, C3999o c3999o) {
        this.f7533a = aVar;
        this.f7534b = i7;
        this.f7535c = c4000p;
        this.f7536d = bArr;
        this.f7537e = uri;
        this.f7538f = c3999o;
        SparseArray sparseArray = f7532l;
        synchronized (sparseArray) {
            sparseArray.put(i7, this);
        }
    }

    /* renamed from: a */
    public static void m8692a() {
        synchronized (f7532l) {
            int i7 = 0;
            while (true) {
                try {
                    SparseArray sparseArray = f7532l;
                    if (i7 < sparseArray.size()) {
                        C2568l c2568l = (C2568l) sparseArray.valueAt(i7);
                        if (c2568l != null) {
                            c2568l.m8700b();
                        }
                        i7++;
                    } else {
                        sparseArray.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public static C2568l m8693c(int i7, C4000p c4000p, File file) {
        return new C2568l(a.DOWNLOAD, i7, c4000p, null, Uri.fromFile(file), null);
    }

    /* renamed from: e */
    public static C2568l m8694e(int i7) {
        C2568l c2568l;
        SparseArray sparseArray = f7532l;
        synchronized (sparseArray) {
            c2568l = (C2568l) sparseArray.get(i7);
        }
        return c2568l;
    }

    /* renamed from: k */
    public static Map m8695k(C3989e.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", aVar.m15934b().m16090q());
        if (aVar.m15935c().isSuccessful()) {
            hashMap.put("bytesTransferred", Long.valueOf(aVar.m15996e()));
        } else {
            hashMap.put("bytesTransferred", Long.valueOf(aVar.m15995d()));
        }
        hashMap.put("totalBytes", Long.valueOf(aVar.m15996e()));
        return hashMap;
    }

    /* renamed from: l */
    public static Map m8696l(Object obj) {
        return obj instanceof C3989e.a ? m8695k((C3989e.a) obj) : m8697m((C3984N.b) obj);
    }

    /* renamed from: m */
    public static Map m8697m(C3984N.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", bVar.m15934b().m16090q());
        hashMap.put("bytesTransferred", Long.valueOf(bVar.m15986d()));
        hashMap.put("totalBytes", Long.valueOf(bVar.m15988f()));
        if (bVar.m15987e() != null) {
            hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, C2567k.m8671V(bVar.m15987e()));
        }
        return hashMap;
    }

    /* renamed from: o */
    public static C2568l m8698o(int i7, C4000p c4000p, byte[] bArr, C3999o c3999o) {
        return new C2568l(a.BYTES, i7, c4000p, bArr, null, c3999o);
    }

    /* renamed from: p */
    public static C2568l m8699p(int i7, C4000p c4000p, Uri uri, C3999o c3999o) {
        return new C2568l(a.FILE, i7, c4000p, null, uri, c3999o);
    }

    /* renamed from: b */
    public void m8700b() {
        if (this.f7543k.booleanValue()) {
            return;
        }
        this.f7543k = Boolean.TRUE;
        SparseArray sparseArray = f7532l;
        synchronized (sparseArray) {
            try {
                if (!this.f7542j.m15889K()) {
                    if (this.f7542j.m15890L()) {
                    }
                    sparseArray.remove(this.f7534b);
                }
                this.f7542j.m15929w();
                sparseArray.remove(this.f7534b);
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f7541i) {
            this.f7541i.notifyAll();
        }
        synchronized (this.f7539g) {
            this.f7539g.notifyAll();
        }
        synchronized (this.f7540h) {
            this.f7540h.notifyAll();
        }
    }

    /* renamed from: d */
    public AbstractC3975E m8701d() {
        return this.f7542j;
    }

    /* renamed from: f */
    public Object m8702f() {
        return this.f7542j.m15884F();
    }

    /* renamed from: g */
    public boolean m8703g() {
        return this.f7543k.booleanValue();
    }

    /* renamed from: h */
    public void m8704h() {
        synchronized (this.f7541i) {
            this.f7541i.notifyAll();
        }
    }

    /* renamed from: i */
    public void m8705i() {
        synchronized (this.f7539g) {
            this.f7539g.notifyAll();
        }
    }

    /* renamed from: j */
    public void m8706j() {
        synchronized (this.f7540h) {
            this.f7540h.notifyAll();
        }
    }

    /* renamed from: n */
    public C2556M m8707n(C0659k c0659k, String str) {
        Uri uri;
        Uri uri2;
        byte[] bArr;
        a aVar = this.f7533a;
        if (aVar == a.BYTES && (bArr = this.f7536d) != null) {
            C3999o c3999o = this.f7538f;
            if (c3999o == null) {
                this.f7542j = this.f7535c.m16098y(bArr);
            } else {
                this.f7542j = this.f7535c.m16099z(bArr, c3999o);
            }
        } else if (aVar == a.FILE && (uri2 = this.f7537e) != null) {
            C3999o c3999o2 = this.f7538f;
            if (c3999o2 == null) {
                this.f7542j = this.f7535c.m16076A(uri2);
            } else {
                this.f7542j = this.f7535c.m16077B(uri2, c3999o2);
            }
        } else {
            if (aVar != a.DOWNLOAD || (uri = this.f7537e) == null) {
                throw new Exception("Unable to start task. Some arguments have no been initialized.");
            }
            this.f7542j = this.f7535c.m16086m(uri);
        }
        return new C2556M(this, this.f7535c.m16092s(), this.f7542j, str);
    }
}
