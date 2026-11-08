package p135T1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p135T1.AbstractC2436c;
import p142U1.C2510i;

/* renamed from: T1.d */
/* loaded from: classes.dex */
public class C2437d {

    /* renamed from: a */
    public final Set f7210a;

    /* renamed from: b */
    public final AbstractC2436c.b f7211b;

    /* renamed from: c */
    public final AbstractC2436c.a f7212c;

    /* renamed from: d */
    public boolean f7213d;

    /* renamed from: e */
    public boolean f7214e;

    /* renamed from: T1.d$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f7215a;

        /* renamed from: b */
        public final /* synthetic */ String f7216b;

        /* renamed from: c */
        public final /* synthetic */ String f7217c;

        public a(Context context, String str, String str2, AbstractC2436c.c cVar) {
            this.f7215a = context;
            this.f7216b = str;
            this.f7217c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                r0 = 0
                T1.d r1 = p135T1.C2437d.this     // Catch: p135T1.C2435b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f7215a     // Catch: p135T1.C2435b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f7216b     // Catch: p135T1.C2435b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f7217c     // Catch: p135T1.C2435b -> Ld java.lang.UnsatisfiedLinkError -> Le
                p135T1.C2437d.m8300a(r1, r2, r3, r4)     // Catch: p135T1.C2435b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p135T1.C2437d.a.run():void");
        }
    }

    /* renamed from: T1.d$b */
    public class b implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f7219a;

        public b(String str) {
            this.f7219a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f7219a);
        }
    }

    public C2437d() {
        this(new C2438e(), new C2434a());
    }

    /* renamed from: b */
    public void m8301b(Context context, String str, String str2) {
        File m8302c = m8302c(context);
        File m8303d = m8303d(context, str, str2);
        File[] listFiles = m8302c.listFiles(new b(this.f7211b.mo8295a(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f7213d || !file.getAbsolutePath().equals(m8303d.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    public File m8302c(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: d */
    public File m8303d(Context context, String str, String str2) {
        String mo8295a = this.f7211b.mo8295a(str);
        if (AbstractC2439f.m8309a(str2)) {
            return new File(m8302c(context), mo8295a);
        }
        return new File(m8302c(context), mo8295a + "." + str2);
    }

    /* renamed from: e */
    public void m8304e(Context context, String str) {
        m8305f(context, str, null, null);
    }

    /* renamed from: f */
    public void m8305f(Context context, String str, String str2, AbstractC2436c.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (AbstractC2439f.m8309a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m8308i("Beginning load of %s...", str);
        if (cVar == null) {
            m8306g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    /* renamed from: g */
    public final void m8306g(Context context, String str, String str2) {
        if (this.f7210a.contains(str) && !this.f7213d) {
            m8308i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f7211b.mo8296b(str);
            this.f7210a.add(str);
            m8308i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e7) {
            m8308i("Loading the library normally failed: %s", Log.getStackTraceString(e7));
            m8308i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File m8303d = m8303d(context, str, str2);
            if (!m8303d.exists() || this.f7213d) {
                if (this.f7213d) {
                    m8308i("Forcing a re-link of %s (%s)...", str, str2);
                }
                m8301b(context, str, str2);
                this.f7212c.mo8287a(context, this.f7211b.mo8298d(), this.f7211b.mo8295a(str), m8303d, this);
            }
            try {
                if (this.f7214e) {
                    C2510i c2510i = null;
                    try {
                        C2510i c2510i2 = new C2510i(m8303d);
                        try {
                            List m8463d = c2510i2.m8463d();
                            c2510i2.close();
                            Iterator it = m8463d.iterator();
                            while (it.hasNext()) {
                                m8304e(context, this.f7211b.mo8297c((String) it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            c2510i = c2510i2;
                            if (c2510i != null) {
                                c2510i.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.f7211b.mo8299e(m8303d.getAbsolutePath());
            this.f7210a.add(str);
            m8308i("%s (%s) was re-linked!", str, str2);
        }
    }

    /* renamed from: i */
    public void m8308i(String str, Object... objArr) {
        m8307h(String.format(Locale.US, str, objArr));
    }

    public C2437d(AbstractC2436c.b bVar, AbstractC2436c.a aVar) {
        this.f7210a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f7211b = bVar;
        this.f7212c = aVar;
    }

    /* renamed from: h */
    public void m8307h(String str) {
    }
}
