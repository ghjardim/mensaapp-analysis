package p166X4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.tika.utils.StringUtils;
import p061I4.InterfaceC0661m;
import p061I4.InterfaceC0663o;
import p166X4.AbstractC2834q;
import p166X4.C2820c;
import p166X4.C2829l;
import p207d.C4098h;
import p215e.C4144d;
import p215e.C4146f;
import p365w.AbstractC6785a;
import p372x.AbstractC6935a;
import p372x.AbstractC6936b;

/* renamed from: X4.l */
/* loaded from: classes2.dex */
public class C2829l implements InterfaceC0661m, InterfaceC0663o {

    /* renamed from: c */
    public final String f8718c;

    /* renamed from: d */
    public final Activity f8719d;

    /* renamed from: e */
    public final C2833p f8720e;

    /* renamed from: f */
    public final C2820c f8721f;

    /* renamed from: g */
    public final h f8722g;

    /* renamed from: h */
    public final d f8723h;

    /* renamed from: i */
    public final C2819b f8724i;

    /* renamed from: j */
    public final ExecutorService f8725j;

    /* renamed from: k */
    public c f8726k;

    /* renamed from: l */
    public Uri f8727l;

    /* renamed from: m */
    public g f8728m;

    /* renamed from: n */
    public final Object f8729n;

    /* renamed from: X4.l$a */
    public class a implements h {

        /* renamed from: a */
        public final /* synthetic */ Activity f8730a;

        public a(Activity activity) {
            this.f8730a = activity;
        }

        @Override // p166X4.C2829l.h
        /* renamed from: a */
        public void mo10146a(String str, int i7) {
            AbstractC6785a.m27824a(this.f8730a, new String[]{str}, i7);
        }

        @Override // p166X4.C2829l.h
        /* renamed from: b */
        public boolean mo10147b() {
            return AbstractC2832o.m10176e(this.f8730a);
        }

        @Override // p166X4.C2829l.h
        /* renamed from: c */
        public boolean mo10148c(String str) {
            return AbstractC6935a.checkSelfPermission(this.f8730a, str) == 0;
        }
    }

    /* renamed from: X4.l$b */
    public class b implements d {

        /* renamed from: a */
        public final /* synthetic */ Activity f8731a;

        public b(Activity activity) {
            this.f8731a = activity;
        }

        @Override // p166X4.C2829l.d
        /* renamed from: a */
        public Uri mo10151a(String str, File file) {
            return AbstractC6936b.m28407h(this.f8731a, str, file);
        }

        @Override // p166X4.C2829l.d
        /* renamed from: b */
        public void mo10152b(Uri uri, final f fVar) {
            MediaScannerConnection.scanFile(this.f8731a, new String[]{uri != null ? uri.getPath() : StringUtils.EMPTY}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: X4.m
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    C2829l.f.this.mo10093a(str);
                }
            });
        }
    }

    /* renamed from: X4.l$c */
    public enum c {
        REAR,
        FRONT
    }

    /* renamed from: X4.l$d */
    public interface d {
        /* renamed from: a */
        Uri mo10151a(String str, File file);

        /* renamed from: b */
        void mo10152b(Uri uri, f fVar);
    }

    /* renamed from: X4.l$e */
    public class e {

        /* renamed from: a */
        public final String f8735a;

        /* renamed from: b */
        public final String f8736b;

        public e(String str, String str2) {
            this.f8735a = str;
            this.f8736b = str2;
        }
    }

    /* renamed from: X4.l$f */
    public interface f {
        /* renamed from: a */
        void mo10093a(String str);
    }

    /* renamed from: X4.l$g */
    public static class g {

        /* renamed from: a */
        public final AbstractC2834q.g f8738a;

        /* renamed from: b */
        public final AbstractC2834q.n f8739b;

        /* renamed from: c */
        public final AbstractC2834q.j f8740c;

        public g(AbstractC2834q.g gVar, AbstractC2834q.n nVar, AbstractC2834q.j jVar) {
            this.f8738a = gVar;
            this.f8739b = nVar;
            this.f8740c = jVar;
        }
    }

    /* renamed from: X4.l$h */
    public interface h {
        /* renamed from: a */
        void mo10146a(String str, int i7);

        /* renamed from: b */
        boolean mo10147b();

        /* renamed from: c */
        boolean mo10148c(String str);
    }

    public C2829l(Activity activity, C2833p c2833p, C2820c c2820c) {
        this(activity, c2833p, null, null, null, c2820c, new a(activity), new b(activity), new C2819b(), Executors.newSingleThreadExecutor());
    }

    /* renamed from: U */
    public static List m10094U(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentActivities(intent, 65536);
    }

    /* renamed from: s */
    private void m10103s(String str, String str2) {
        AbstractC2834q.j jVar;
        synchronized (this.f8729n) {
            try {
                g gVar = this.f8728m;
                jVar = gVar != null ? gVar.f8740c : null;
                this.f8728m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar == null) {
            this.f8721f.m10089f(null, str, str2);
        } else {
            jVar.mo10227b(new AbstractC2834q.d(str, str2, null));
        }
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void m10111H(int i7, Intent intent) {
        if (i7 != -1 || intent == null) {
            m10140u(null);
            return;
        }
        ArrayList m10141v = m10141v(intent, false);
        if (m10141v == null) {
            m10103s("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            m10109F(m10141v);
        }
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void m10114K(int i7, Intent intent) {
        if (i7 != -1 || intent == null) {
            m10140u(null);
            return;
        }
        ArrayList m10141v = m10141v(intent, true);
        if (m10141v == null) {
            m10103s("no_valid_media_uri", "Cannot find the selected media.");
        } else {
            m10109F(m10141v);
        }
    }

    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void m10112I(int i7, Intent intent) {
        if (i7 != -1 || intent == null) {
            m10140u(null);
            return;
        }
        ArrayList m10141v = m10141v(intent, false);
        if (m10141v == null) {
            m10103s("missing_valid_image_uri", "Cannot find at least one of the selected images.");
        } else {
            m10109F(m10141v);
        }
    }

    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void m10115L(int i7, Intent intent) {
        if (i7 != -1 || intent == null) {
            m10140u(null);
            return;
        }
        ArrayList m10141v = m10141v(intent, false);
        if (m10141v == null || m10141v.size() < 1) {
            m10103s("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            m10140u(((e) m10141v.get(0)).f8735a);
        }
    }

    /* renamed from: E */
    public void m10108E(String str, boolean z6) {
        AbstractC2834q.g gVar;
        synchronized (this.f8729n) {
            try {
                g gVar2 = this.f8728m;
                gVar = gVar2 != null ? gVar2.f8738a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gVar == null) {
            m10140u(str);
            return;
        }
        String m10142w = m10142w(str, gVar);
        if (m10142w != null && !m10142w.equals(str) && z6) {
            new File(str).delete();
        }
        m10140u(m10142w);
    }

    /* renamed from: F */
    public final void m10109F(ArrayList arrayList) {
        AbstractC2834q.g gVar;
        synchronized (this.f8729n) {
            try {
                g gVar2 = this.f8728m;
                gVar = gVar2 != null ? gVar2.f8738a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        if (gVar == null) {
            while (i7 < arrayList.size()) {
                arrayList2.add(((e) arrayList.get(i7)).f8735a);
                i7++;
            }
            m10139t(arrayList2);
            return;
        }
        while (i7 < arrayList.size()) {
            e eVar = (e) arrayList.get(i7);
            String str = eVar.f8735a;
            String str2 = eVar.f8736b;
            if (str2 == null || !str2.startsWith("video/")) {
                str = m10142w(eVar.f8735a, gVar);
            }
            arrayList2.add(str);
            i7++;
        }
        m10139t(arrayList2);
    }

    /* renamed from: G */
    public final /* synthetic */ void m10110G(String str) {
        m10108E(str, true);
    }

    /* renamed from: N */
    public final void m10117N(Boolean bool, int i7) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new C4144d(i7).mo9533a(this.f8719d, new C4098h.a().m17190b(C4146f.c.f13883a).m17189a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.f8719d.startActivityForResult(intent, 2346);
    }

    /* renamed from: O */
    public final void m10118O(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new C4146f().mo9533a(this.f8719d, new C4098h.a().m17190b(C4146f.c.f13883a).m17189a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.f8719d.startActivityForResult(intent, 2342);
    }

    /* renamed from: P */
    public final void m10119P(AbstractC2834q.e eVar) {
        Intent intent;
        if (eVar.m10209d().booleanValue()) {
            intent = eVar.m10207b().booleanValue() ? new C4144d(AbstractC2832o.m10172a(eVar)).mo9533a(this.f8719d, new C4098h.a().m17190b(C4146f.b.f13882a).m17189a()) : new C4146f().mo9533a(this.f8719d, new C4098h.a().m17190b(C4146f.b.f13882a).m17189a());
        } else {
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("*/*");
            intent2.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", eVar.m10207b());
            intent = intent2;
        }
        this.f8719d.startActivityForResult(intent, 2347);
    }

    /* renamed from: Q */
    public final void m10120Q(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new C4146f().mo9533a(this.f8719d, new C4098h.a().m17190b(C4146f.d.f13884a).m17189a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.f8719d.startActivityForResult(intent, 2352);
    }

    /* renamed from: R */
    public final void m10121R() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f8726k == c.FRONT) {
            m10130b0(intent);
        }
        File m10136p = m10136p();
        this.f8727l = Uri.parse("file:" + m10136p.getAbsolutePath());
        Uri mo10151a = this.f8723h.mo10151a(this.f8718c, m10136p);
        intent.putExtra("output", mo10151a);
        m10143x(intent, mo10151a);
        try {
            try {
                this.f8719d.startActivityForResult(intent, 2343);
            } catch (ActivityNotFoundException unused) {
                m10136p.delete();
                m10103s("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e7) {
            e7.printStackTrace();
            m10103s("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    /* renamed from: S */
    public final void m10122S() {
        AbstractC2834q.n nVar;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f8729n) {
            try {
                g gVar = this.f8728m;
                nVar = gVar != null ? gVar.f8739b : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nVar != null && nVar.m10237b() != null) {
            intent.putExtra("android.intent.extra.durationLimit", nVar.m10237b().intValue());
        }
        if (this.f8726k == c.FRONT) {
            m10130b0(intent);
        }
        File m10137q = m10137q();
        this.f8727l = Uri.parse("file:" + m10137q.getAbsolutePath());
        Uri mo10151a = this.f8723h.mo10151a(this.f8718c, m10137q);
        intent.putExtra("output", mo10151a);
        m10143x(intent, mo10151a);
        try {
            try {
                this.f8719d.startActivityForResult(intent, 2353);
            } catch (ActivityNotFoundException unused) {
                m10137q.delete();
                m10103s("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e7) {
            e7.printStackTrace();
            m10103s("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    /* renamed from: T */
    public final boolean m10123T() {
        h hVar = this.f8722g;
        if (hVar == null) {
            return false;
        }
        return hVar.mo10147b();
    }

    /* renamed from: V */
    public AbstractC2834q.b m10124V() {
        Map m10085b = this.f8721f.m10085b();
        if (m10085b.isEmpty()) {
            return null;
        }
        AbstractC2834q.b.a aVar = new AbstractC2834q.b.a();
        AbstractC2834q.c cVar = (AbstractC2834q.c) m10085b.get("type");
        if (cVar != null) {
            aVar.m10204d(cVar);
        }
        aVar.m10202b((AbstractC2834q.a) m10085b.get("error"));
        ArrayList arrayList = (ArrayList) m10085b.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Double d7 = (Double) m10085b.get("maxWidth");
                Double d8 = (Double) m10085b.get("maxHeight");
                Integer num = (Integer) m10085b.get("imageQuality");
                arrayList2.add(this.f8720e.m10186j(str, d7, d8, num == null ? 100 : num.intValue()));
            }
            aVar.m10203c(arrayList2);
        }
        this.f8721f.m10084a();
        return aVar.m10201a();
    }

    /* renamed from: W */
    public void m10125W() {
        synchronized (this.f8729n) {
            try {
                g gVar = this.f8728m;
                if (gVar == null) {
                    return;
                }
                AbstractC2834q.g gVar2 = gVar.f8738a;
                this.f8721f.m10090g(gVar2 != null ? C2820c.b.IMAGE : C2820c.b.VIDEO);
                if (gVar2 != null) {
                    this.f8721f.m10087d(gVar2);
                }
                Uri uri = this.f8727l;
                if (uri != null) {
                    this.f8721f.m10088e(uri);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: X */
    public void m10126X(c cVar) {
        this.f8726k = cVar;
    }

    /* renamed from: Y */
    public final boolean m10127Y(AbstractC2834q.g gVar, AbstractC2834q.n nVar, AbstractC2834q.j jVar) {
        synchronized (this.f8729n) {
            try {
                if (this.f8728m != null) {
                    return false;
                }
                this.f8728m = new g(gVar, nVar, jVar);
                this.f8721f.m10084a();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: Z */
    public void m10128Z(AbstractC2834q.g gVar, AbstractC2834q.j jVar) {
        if (!m10127Y(gVar, null, jVar)) {
            m10138r(jVar);
        } else if (!m10123T() || this.f8722g.mo10148c("android.permission.CAMERA")) {
            m10121R();
        } else {
            this.f8722g.mo10146a("android.permission.CAMERA", 2345);
        }
    }

    @Override // p061I4.InterfaceC0661m
    /* renamed from: a */
    public boolean mo2655a(int i7, final int i8, final Intent intent) {
        Runnable runnable;
        if (i7 == 2342) {
            runnable = new Runnable() { // from class: X4.d
                @Override // java.lang.Runnable
                public final void run() {
                    C2829l.this.m10111H(i8, intent);
                }
            };
        } else if (i7 == 2343) {
            runnable = new Runnable() { // from class: X4.f
                @Override // java.lang.Runnable
                public final void run() {
                    C2829l.this.m10113J(i8);
                }
            };
        } else if (i7 == 2346) {
            runnable = new Runnable() { // from class: X4.e
                @Override // java.lang.Runnable
                public final void run() {
                    C2829l.this.m10112I(i8, intent);
                }
            };
        } else if (i7 == 2347) {
            runnable = new Runnable() { // from class: X4.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2829l.this.m10114K(i8, intent);
                }
            };
        } else if (i7 == 2352) {
            runnable = new Runnable() { // from class: X4.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2829l.this.m10115L(i8, intent);
                }
            };
        } else {
            if (i7 != 2353) {
                return false;
            }
            runnable = new Runnable() { // from class: X4.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2829l.this.m10116M(i8);
                }
            };
        }
        this.f8725j.execute(runnable);
        return true;
    }

    /* renamed from: a0 */
    public void m10129a0(AbstractC2834q.n nVar, AbstractC2834q.j jVar) {
        if (!m10127Y(null, nVar, jVar)) {
            m10138r(jVar);
        } else if (!m10123T() || this.f8722g.mo10148c("android.permission.CAMERA")) {
            m10122S();
        } else {
            this.f8722g.mo10146a("android.permission.CAMERA", 2355);
        }
    }

    @Override // p061I4.InterfaceC0663o
    /* renamed from: b */
    public boolean mo2657b(int i7, String[] strArr, int[] iArr) {
        boolean z6 = iArr.length > 0 && iArr[0] == 0;
        if (i7 != 2345) {
            if (i7 != 2355) {
                return false;
            }
            if (z6) {
                m10122S();
            }
        } else if (z6) {
            m10121R();
        }
        if (!z6 && (i7 == 2345 || i7 == 2355)) {
            m10103s("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    /* renamed from: b0 */
    public final void m10130b0(Intent intent) {
        int i7 = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i7 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    /* renamed from: k */
    public void m10131k(AbstractC2834q.g gVar, boolean z6, AbstractC2834q.j jVar) {
        if (m10127Y(gVar, null, jVar)) {
            m10118O(Boolean.valueOf(z6));
        } else {
            m10138r(jVar);
        }
    }

    /* renamed from: l */
    public void m10132l(AbstractC2834q.h hVar, AbstractC2834q.e eVar, AbstractC2834q.j jVar) {
        if (m10127Y(hVar.m10223b(), null, jVar)) {
            m10119P(eVar);
        } else {
            m10138r(jVar);
        }
    }

    /* renamed from: m */
    public void m10133m(AbstractC2834q.g gVar, boolean z6, int i7, AbstractC2834q.j jVar) {
        if (m10127Y(gVar, null, jVar)) {
            m10117N(Boolean.valueOf(z6), i7);
        } else {
            m10138r(jVar);
        }
    }

    /* renamed from: n */
    public void m10134n(AbstractC2834q.n nVar, boolean z6, AbstractC2834q.j jVar) {
        if (m10127Y(null, nVar, jVar)) {
            m10120Q(Boolean.valueOf(z6));
        } else {
            m10138r(jVar);
        }
    }

    /* renamed from: o */
    public final File m10135o(String str) {
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.f8719d.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(uuid, str, cacheDir);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: p */
    public final File m10136p() {
        return m10135o(".jpg");
    }

    /* renamed from: q */
    public final File m10137q() {
        return m10135o(".mp4");
    }

    /* renamed from: r */
    public final void m10138r(AbstractC2834q.j jVar) {
        jVar.mo10227b(new AbstractC2834q.d("already_active", "Image picker is already active", null));
    }

    /* renamed from: t */
    public final void m10139t(ArrayList arrayList) {
        AbstractC2834q.j jVar;
        synchronized (this.f8729n) {
            try {
                g gVar = this.f8728m;
                jVar = gVar != null ? gVar.f8740c : null;
                this.f8728m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar == null) {
            this.f8721f.m10089f(arrayList, null, null);
        } else {
            jVar.mo10226a(arrayList);
        }
    }

    /* renamed from: u */
    public final void m10140u(String str) {
        AbstractC2834q.j jVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f8729n) {
            try {
                g gVar = this.f8728m;
                jVar = gVar != null ? gVar.f8740c : null;
                this.f8728m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.mo10226a(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.f8721f.m10089f(arrayList, null, null);
        }
    }

    /* renamed from: v */
    public final ArrayList m10141v(Intent intent, boolean z6) {
        String m10083e;
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        if (data != null) {
            String m10083e2 = this.f8724i.m10083e(this.f8719d, data);
            if (m10083e2 == null) {
                return null;
            }
            arrayList.add(new e(m10083e2, null));
        } else {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int i7 = 0; i7 < intent.getClipData().getItemCount(); i7++) {
                Uri uri = intent.getClipData().getItemAt(i7).getUri();
                if (uri == null || (m10083e = this.f8724i.m10083e(this.f8719d, uri)) == null) {
                    return null;
                }
                arrayList.add(new e(m10083e, z6 ? this.f8719d.getContentResolver().getType(uri) : null));
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public final String m10142w(String str, AbstractC2834q.g gVar) {
        return this.f8720e.m10186j(str, gVar.m10216c(), gVar.m10215b(), gVar.m10217d().intValue());
    }

    /* renamed from: x */
    public final void m10143x(Intent intent, Uri uri) {
        List m10094U;
        PackageManager.ResolveInfoFlags of;
        PackageManager packageManager = this.f8719d.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            m10094U = packageManager.queryIntentActivities(intent, of);
        } else {
            m10094U = m10094U(packageManager, intent);
        }
        Iterator it = m10094U.iterator();
        while (it.hasNext()) {
            this.f8719d.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uri, 3);
        }
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m10113J(int i7) {
        if (i7 != -1) {
            m10140u(null);
            return;
        }
        Uri uri = this.f8727l;
        d dVar = this.f8723h;
        if (uri == null) {
            uri = Uri.parse(this.f8721f.m10086c());
        }
        dVar.mo10152b(uri, new f() { // from class: X4.j
            @Override // p166X4.C2829l.f
            /* renamed from: a */
            public final void mo10093a(String str) {
                C2829l.this.m10110G(str);
            }
        });
    }

    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void m10116M(int i7) {
        if (i7 != -1) {
            m10140u(null);
            return;
        }
        Uri uri = this.f8727l;
        d dVar = this.f8723h;
        if (uri == null) {
            uri = Uri.parse(this.f8721f.m10086c());
        }
        dVar.mo10152b(uri, new f() { // from class: X4.k
            @Override // p166X4.C2829l.f
            /* renamed from: a */
            public final void mo10093a(String str) {
                C2829l.this.m10140u(str);
            }
        });
    }

    public C2829l(Activity activity, C2833p c2833p, AbstractC2834q.g gVar, AbstractC2834q.n nVar, AbstractC2834q.j jVar, C2820c c2820c, h hVar, d dVar, C2819b c2819b, ExecutorService executorService) {
        this.f8729n = new Object();
        this.f8719d = activity;
        this.f8720e = c2833p;
        this.f8718c = activity.getPackageName() + ".flutter.image_provider";
        if (jVar != null) {
            this.f8728m = new g(gVar, nVar, jVar);
        }
        this.f8722g = hVar;
        this.f8723h = dVar;
        this.f8724i = c2819b;
        this.f8721f = c2820c;
        this.f8725j = executorService;
    }
}
