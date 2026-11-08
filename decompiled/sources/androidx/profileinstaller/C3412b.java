package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.AbstractC3413c;
import androidx.profileinstaller.C3412b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p388z1.AbstractC7129d;
import p388z1.AbstractC7137l;
import p388z1.AbstractC7138m;
import p388z1.C7128c;

/* renamed from: androidx.profileinstaller.b */
/* loaded from: classes.dex */
public class C3412b {

    /* renamed from: a */
    public final AssetManager f11256a;

    /* renamed from: b */
    public final Executor f11257b;

    /* renamed from: c */
    public final AbstractC3413c.c f11258c;

    /* renamed from: e */
    public final File f11260e;

    /* renamed from: f */
    public final String f11261f;

    /* renamed from: g */
    public final String f11262g;

    /* renamed from: h */
    public final String f11263h;

    /* renamed from: j */
    public C7128c[] f11265j;

    /* renamed from: k */
    public byte[] f11266k;

    /* renamed from: i */
    public boolean f11264i = false;

    /* renamed from: d */
    public final byte[] f11259d = m13489d();

    public C3412b(AssetManager assetManager, Executor executor, AbstractC3413c.c cVar, String str, String str2, String str3, File file) {
        this.f11256a = assetManager;
        this.f11257b = executor;
        this.f11258c = cVar;
        this.f11261f = str;
        this.f11262g = str2;
        this.f11263h = str3;
        this.f11260e = file;
    }

    /* renamed from: d */
    public static byte[] m13489d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 24 || i7 > 34) {
            return null;
        }
        switch (i7) {
            case 24:
            case 25:
                return AbstractC7138m.f25372e;
            case 26:
                return AbstractC7138m.f25371d;
            case 27:
                return AbstractC7138m.f25370c;
            case 28:
            case 29:
            case 30:
                return AbstractC7138m.f25369b;
            case 31:
            case 32:
            case 33:
            case 34:
                return AbstractC7138m.f25368a;
            default:
                return null;
        }
    }

    /* renamed from: k */
    public static boolean m13490k() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 24 || i7 > 34) {
            return false;
        }
        if (i7 != 24 && i7 != 25) {
            switch (i7) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final C3412b m13491b(C7128c[] c7128cArr, byte[] bArr) {
        InputStream m13496h;
        try {
            m13496h = m13496h(this.f11256a, this.f11263h);
        } catch (FileNotFoundException e7) {
            this.f11258c.mo13469b(9, e7);
        } catch (IOException e8) {
            this.f11258c.mo13469b(7, e8);
        } catch (IllegalStateException e9) {
            this.f11265j = null;
            this.f11258c.mo13469b(8, e9);
        }
        if (m13496h == null) {
            if (m13496h != null) {
                m13496h.close();
            }
            return null;
        }
        try {
            this.f11265j = AbstractC7137l.m29429q(m13496h, AbstractC7137l.m29427o(m13496h, AbstractC7137l.f25367b), bArr, c7128cArr);
            m13496h.close();
            return this;
        } catch (Throwable th) {
            try {
                m13496h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void m13492c() {
        if (!this.f11264i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: e */
    public boolean m13493e() {
        if (this.f11259d == null) {
            m13499l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f11260e.exists()) {
            try {
                this.f11260e.createNewFile();
            } catch (IOException unused) {
                m13499l(4, null);
                return false;
            }
        } else if (!this.f11260e.canWrite()) {
            m13499l(4, null);
            return false;
        }
        this.f11264i = true;
        return true;
    }

    /* renamed from: f */
    public final InputStream m13494f(AssetManager assetManager) {
        try {
            return m13496h(assetManager, this.f11262g);
        } catch (FileNotFoundException e7) {
            this.f11258c.mo13469b(6, e7);
            return null;
        } catch (IOException e8) {
            this.f11258c.mo13469b(7, e8);
            return null;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m13495g(int i7, Object obj) {
        this.f11258c.mo13469b(i7, obj);
    }

    /* renamed from: h */
    public final InputStream m13496h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f11258c.mo13468a(5, null);
            }
            return null;
        }
    }

    /* renamed from: i */
    public C3412b m13497i() {
        C3412b m13491b;
        m13492c();
        if (this.f11259d == null) {
            return this;
        }
        InputStream m13494f = m13494f(this.f11256a);
        if (m13494f != null) {
            this.f11265j = m13498j(m13494f);
        }
        C7128c[] c7128cArr = this.f11265j;
        return (c7128cArr == null || !m13490k() || (m13491b = m13491b(c7128cArr, this.f11259d)) == null) ? this : m13491b;
    }

    /* renamed from: j */
    public final C7128c[] m13498j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C7128c[] m29435w = AbstractC7137l.m29435w(inputStream, AbstractC7137l.m29427o(inputStream, AbstractC7137l.f25366a), this.f11261f);
                        try {
                            inputStream.close();
                            return m29435w;
                        } catch (IOException e7) {
                            this.f11258c.mo13469b(7, e7);
                            return m29435w;
                        }
                    } catch (IOException e8) {
                        this.f11258c.mo13469b(7, e8);
                        return null;
                    }
                } catch (IllegalStateException e9) {
                    this.f11258c.mo13469b(8, e9);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e10) {
                this.f11258c.mo13469b(7, e10);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                this.f11258c.mo13469b(7, e11);
            }
            throw th;
        }
    }

    /* renamed from: l */
    public final void m13499l(final int i7, final Object obj) {
        this.f11257b.execute(new Runnable() { // from class: z1.b
            @Override // java.lang.Runnable
            public final void run() {
                C3412b.this.m13495g(i7, obj);
            }
        });
    }

    /* renamed from: m */
    public C3412b m13500m() {
        ByteArrayOutputStream byteArrayOutputStream;
        C7128c[] c7128cArr = this.f11265j;
        byte[] bArr = this.f11259d;
        if (c7128cArr != null && bArr != null) {
            m13492c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    AbstractC7137l.m29402E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e7) {
                this.f11258c.mo13469b(7, e7);
            } catch (IllegalStateException e8) {
                this.f11258c.mo13469b(8, e8);
            }
            if (!AbstractC7137l.m29399B(byteArrayOutputStream, bArr, c7128cArr)) {
                this.f11258c.mo13469b(5, null);
                this.f11265j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f11266k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f11265j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public boolean m13501n() {
        byte[] bArr = this.f11266k;
        if (bArr == null) {
            return false;
        }
        m13492c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f11260e);
                    try {
                        AbstractC7129d.m29388l(byteArrayInputStream, fileOutputStream);
                        m13499l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f11266k = null;
                this.f11265j = null;
            }
        } catch (FileNotFoundException e7) {
            m13499l(6, e7);
            return false;
        } catch (IOException e8) {
            m13499l(7, e8);
            return false;
        }
    }
}
