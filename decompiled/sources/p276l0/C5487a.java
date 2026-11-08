package p276l0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: l0.a */
/* loaded from: classes.dex */
public final class C5487a extends AbstractC5488b {

    /* renamed from: e */
    public final AssetManager f19755e;

    /* renamed from: f */
    public Uri f19756f;

    /* renamed from: g */
    public InputStream f19757g;

    /* renamed from: h */
    public long f19758h;

    /* renamed from: i */
    public boolean f19759i;

    /* renamed from: l0.a$a */
    public static final class a extends C5494h {
        public a(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public C5487a(Context context) {
        super(false);
        this.f19755e = context.getAssets();
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f19756f = null;
        try {
            try {
                InputStream inputStream = this.f19757g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        } finally {
            this.f19757g = null;
            if (this.f19759i) {
                this.f19759i = false;
                m23070w();
            }
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        try {
            Uri uri = c5497k.f19781a;
            this.f19756f = uri;
            String str = (String) AbstractC5332a.m21800e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            m23071x(c5497k);
            InputStream open = this.f19755e.open(str, 1);
            this.f19757g = open;
            if (open.skip(c5497k.f19787g) < c5497k.f19787g) {
                throw new a(null, 2008);
            }
            long j7 = c5497k.f19788h;
            if (j7 != -1) {
                this.f19758h = j7;
            } else {
                long available = this.f19757g.available();
                this.f19758h = available;
                if (available == 2147483647L) {
                    this.f19758h = -1L;
                }
            }
            this.f19759i = true;
            m23072y(c5497k);
            return this.f19758h;
        } catch (a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19758h;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        }
        int read = ((InputStream) AbstractC5330M.m21747i(this.f19757g)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f19758h;
        if (j8 != -1) {
            this.f19758h = j8 - read;
        }
        m23069v(read);
        return read;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f19756f;
    }
}
