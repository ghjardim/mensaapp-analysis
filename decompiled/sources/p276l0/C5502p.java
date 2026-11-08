package p276l0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: l0.p */
/* loaded from: classes.dex */
public final class C5502p extends AbstractC5488b {

    /* renamed from: e */
    public RandomAccessFile f19842e;

    /* renamed from: f */
    public Uri f19843f;

    /* renamed from: g */
    public long f19844g;

    /* renamed from: h */
    public boolean f19845h;

    /* renamed from: l0.p$a */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m23126b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: l0.p$b */
    public static class b extends C5494h {
        public b(Throwable th, int i7) {
            super(th, i7);
        }

        public b(String str, Throwable th, int i7) {
            super(str, th, i7);
        }
    }

    public C5502p() {
        super(false);
    }

    /* renamed from: z */
    public static RandomAccessFile m23124z(Uri uri) {
        try {
            return new RandomAccessFile((String) AbstractC5332a.m21800e(uri.getPath()), "r");
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e7, (AbstractC5330M.f18800a < 21 || !a.m23126b(e7.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e7, 1004);
        } catch (SecurityException e8) {
            throw new b(e8, 2006);
        } catch (RuntimeException e9) {
            throw new b(e9, 2000);
        }
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f19843f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19842e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new b(e7, 2000);
            }
        } finally {
            this.f19842e = null;
            if (this.f19845h) {
                this.f19845h = false;
                m23070w();
            }
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        Uri uri = c5497k.f19781a;
        this.f19843f = uri;
        m23071x(c5497k);
        RandomAccessFile m23124z = m23124z(uri);
        this.f19842e = m23124z;
        try {
            m23124z.seek(c5497k.f19787g);
            long j7 = c5497k.f19788h;
            if (j7 == -1) {
                j7 = this.f19842e.length() - c5497k.f19787g;
            }
            this.f19844g = j7;
            if (j7 < 0) {
                throw new b(null, null, 2008);
            }
            this.f19845h = true;
            m23072y(c5497k);
            return this.f19844g;
        } catch (IOException e7) {
            throw new b(e7, 2000);
        }
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f19844g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) AbstractC5330M.m21747i(this.f19842e)).read(bArr, i7, (int) Math.min(this.f19844g, i8));
            if (read > 0) {
                this.f19844g -= read;
                m23069v(read);
            }
            return read;
        } catch (IOException e7) {
            throw new b(e7, 2000);
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f19843f;
    }
}
