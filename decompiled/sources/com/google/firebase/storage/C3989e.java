package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.AbstractC3975E;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p220e4.C4191c;
import p228f4.AbstractC4281e;
import p228f4.C4279c;

/* renamed from: com.google.firebase.storage.e */
/* loaded from: classes.dex */
public class C3989e extends AbstractC3975E {

    /* renamed from: l */
    public final Uri f13148l;

    /* renamed from: m */
    public long f13149m;

    /* renamed from: n */
    public C4000p f13150n;

    /* renamed from: o */
    public C4191c f13151o;

    /* renamed from: p */
    public long f13152p = -1;

    /* renamed from: q */
    public String f13153q = null;

    /* renamed from: r */
    public volatile Exception f13154r = null;

    /* renamed from: s */
    public long f13155s = 0;

    /* renamed from: t */
    public int f13156t;

    /* renamed from: com.google.firebase.storage.e$a */
    public class a extends AbstractC3975E.b {

        /* renamed from: c */
        public final long f13157c;

        public a(Exception exc, long j7) {
            super(exc);
            this.f13157c = j7;
        }

        /* renamed from: d */
        public long m15995d() {
            return this.f13157c;
        }

        /* renamed from: e */
        public long m15996e() {
            return C3989e.this.m15991m0();
        }
    }

    public C3989e(C4000p c4000p, Uri uri) {
        this.f13150n = c4000p;
        this.f13148l = uri;
        C3990f m16092s = c4000p.m16092s();
        this.f13151o = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16005i());
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: I */
    public C4000p mo15887I() {
        return this.f13150n;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: U */
    public void mo15898U() {
        this.f13151o.m17591a();
        this.f13154r = C3998n.m16023c(Status.f12252q);
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: e0 */
    public void mo15908e0() {
        String str;
        if (this.f13154r != null) {
            m15915j0(64, false);
            return;
        }
        if (m15915j0(4, false)) {
            do {
                this.f13149m = 0L;
                this.f13154r = null;
                this.f13151o.m17593c();
                C4279c c4279c = new C4279c(this.f13150n.m16093t(), this.f13150n.m16082i(), this.f13155s);
                this.f13151o.m17595e(c4279c, false);
                this.f13156t = c4279c.m17916o();
                this.f13154r = c4279c.m17909f() != null ? c4279c.m17909f() : this.f13154r;
                boolean z6 = m15992n0(this.f13156t) && this.f13154r == null && m15880B() == 4;
                if (z6) {
                    this.f13152p = c4279c.m17919r() + this.f13155s;
                    String m17918q = c4279c.m17918q("ETag");
                    if (!TextUtils.isEmpty(m17918q) && (str = this.f13153q) != null && !str.equals(m17918q)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f13155s = 0L;
                        this.f13153q = null;
                        c4279c.m17900C();
                        mo15909f0();
                        return;
                    }
                    this.f13153q = m17918q;
                    try {
                        z6 = m15993o0(c4279c);
                    } catch (IOException e7) {
                        Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e7);
                        this.f13154r = e7;
                    }
                }
                c4279c.m17900C();
                if (z6 && this.f13154r == null && m15880B() == 4) {
                    m15915j0(128, false);
                    return;
                }
                File file = new File(this.f13148l.getPath());
                if (file.exists()) {
                    this.f13155s = file.length();
                } else {
                    this.f13155s = 0L;
                }
                if (m15880B() == 8) {
                    m15915j0(16, false);
                    return;
                }
                if (m15880B() == 32) {
                    if (m15915j0(256, false)) {
                        return;
                    }
                    Log.w("FileDownloadTask", "Unable to change download task to final state from " + m15880B());
                    return;
                }
            } while (this.f13149m > 0);
            m15915j0(64, false);
        }
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: f0 */
    public void mo15909f0() {
        C3977G.m15939b().m15945g(m15883E());
    }

    /* renamed from: l0 */
    public final int m15990l0(InputStream inputStream, byte[] bArr) {
        int read;
        int i7 = 0;
        boolean z6 = false;
        while (i7 != bArr.length && (read = inputStream.read(bArr, i7, bArr.length - i7)) != -1) {
            try {
                i7 += read;
                z6 = true;
            } catch (IOException e7) {
                this.f13154r = e7;
            }
        }
        if (z6) {
            return i7;
        }
        return -1;
    }

    /* renamed from: m0 */
    public long m15991m0() {
        return this.f13152p;
    }

    /* renamed from: n0 */
    public final boolean m15992n0(int i7) {
        return i7 == 308 || (i7 >= 200 && i7 < 300);
    }

    /* renamed from: o0 */
    public final boolean m15993o0(AbstractC4281e abstractC4281e) {
        FileOutputStream fileOutputStream;
        InputStream m17921t = abstractC4281e.m17921t();
        if (m17921t == null) {
            this.f13154r = new IllegalStateException("Unable to open Firebase Storage stream.");
            return false;
        }
        File file = new File(this.f13148l.getPath());
        if (!file.exists()) {
            if (this.f13155s > 0) {
                throw new IOException("The file to download to has been deleted.");
            }
            if (!file.createNewFile()) {
                Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
            }
        }
        boolean z6 = true;
        if (this.f13155s > 0) {
            Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f13155s);
            fileOutputStream = new FileOutputStream(file, true);
        } else {
            fileOutputStream = new FileOutputStream(file);
        }
        try {
            byte[] bArr = new byte[262144];
            while (z6) {
                int m15990l0 = m15990l0(m17921t, bArr);
                if (m15990l0 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, m15990l0);
                this.f13149m += m15990l0;
                if (this.f13154r != null) {
                    Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f13154r);
                    this.f13154r = null;
                    z6 = false;
                }
                if (!m15915j0(4, false)) {
                    z6 = false;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            m17921t.close();
            return z6;
        } catch (Throwable th) {
            fileOutputStream.flush();
            fileOutputStream.close();
            m17921t.close();
            throw th;
        }
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public a mo15911h0() {
        return new a(C3998n.m16025e(this.f13154r, this.f13156t), this.f13149m + this.f13155s);
    }
}
