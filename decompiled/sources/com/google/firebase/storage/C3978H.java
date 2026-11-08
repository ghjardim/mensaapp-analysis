package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.storage.AbstractC3975E;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p220e4.C4191c;
import p228f4.AbstractC4281e;
import p228f4.C4279c;

/* renamed from: com.google.firebase.storage.H */
/* loaded from: classes.dex */
public class C3978H extends AbstractC3975E {

    /* renamed from: l */
    public C4000p f13078l;

    /* renamed from: m */
    public C4191c f13079m;

    /* renamed from: p */
    public b f13082p;

    /* renamed from: r */
    public long f13084r;

    /* renamed from: s */
    public long f13085s;

    /* renamed from: t */
    public InputStream f13086t;

    /* renamed from: u */
    public AbstractC4281e f13087u;

    /* renamed from: v */
    public String f13088v;

    /* renamed from: n */
    public volatile Exception f13080n = null;

    /* renamed from: o */
    public volatile int f13081o = 0;

    /* renamed from: q */
    public long f13083q = -1;

    /* renamed from: com.google.firebase.storage.H$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream call() {
            return C3978H.this.m15951o0();
        }
    }

    /* renamed from: com.google.firebase.storage.H$b */
    public interface b {
        /* renamed from: a */
        void mo15956a(d dVar, InputStream inputStream);
    }

    /* renamed from: com.google.firebase.storage.H$d */
    public class d extends AbstractC3975E.b {

        /* renamed from: c */
        public final long f13097c;

        public d(Exception exc, long j7) {
            super(exc);
            this.f13097c = j7;
        }
    }

    public C3978H(C4000p c4000p) {
        this.f13078l = c4000p;
        C3990f m16092s = c4000p.m16092s();
        this.f13079m = new C4191c(m16092s.m15999a().m17532m(), m16092s.m16001c(), m16092s.m16000b(), m16092s.m16005i());
    }

    /* renamed from: p0 */
    private boolean m15950p0(int i7) {
        return i7 == 308 || (i7 >= 200 && i7 < 300);
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: I */
    public C4000p mo15887I() {
        return this.f13078l;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: U */
    public void mo15898U() {
        this.f13079m.m17591a();
        this.f13080n = C3998n.m16023c(Status.f12252q);
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: X */
    public void mo15901X() {
        this.f13085s = this.f13084r;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: a0 */
    public boolean mo15904a0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: d0 */
    public boolean mo15907d0() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: e0 */
    public void mo15908e0() {
        if (this.f13080n != null) {
            m15915j0(64, false);
            return;
        }
        if (m15915j0(4, false)) {
            c cVar = new c(new a(), this);
            this.f13086t = new BufferedInputStream(cVar);
            try {
                cVar.m15959d();
                b bVar = this.f13082p;
                if (bVar != null) {
                    try {
                        bVar.mo15956a((d) m15910g0(), this.f13086t);
                    } catch (Exception e7) {
                        Log.w("StreamDownloadTask", "Exception occurred calling doInBackground.", e7);
                        this.f13080n = e7;
                    }
                }
            } catch (IOException e8) {
                Log.d("StreamDownloadTask", "Initial opening of Stream failed", e8);
                this.f13080n = e8;
            }
            if (this.f13086t == null) {
                this.f13087u.m17900C();
                this.f13087u = null;
            }
            if (this.f13080n == null && m15880B() == 4) {
                m15915j0(4, false);
                m15915j0(128, false);
                return;
            }
            if (m15915j0(m15880B() == 32 ? 256 : 64, false)) {
                return;
            }
            Log.w("StreamDownloadTask", "Unable to change download task to final state from " + m15880B());
        }
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: f0 */
    public void mo15909f0() {
        C3977G.m15939b().m15945g(m15883E());
    }

    /* renamed from: o0 */
    public final InputStream m15951o0() {
        String str;
        this.f13079m.m17593c();
        AbstractC4281e abstractC4281e = this.f13087u;
        if (abstractC4281e != null) {
            abstractC4281e.m17900C();
        }
        C4279c c4279c = new C4279c(this.f13078l.m16093t(), this.f13078l.m16082i(), this.f13084r);
        this.f13087u = c4279c;
        this.f13079m.m17595e(c4279c, false);
        this.f13081o = this.f13087u.m17916o();
        this.f13080n = this.f13087u.m17909f() != null ? this.f13087u.m17909f() : this.f13080n;
        if (!m15950p0(this.f13081o) || this.f13080n != null || m15880B() != 4) {
            throw new IOException("Could not open resulting stream.");
        }
        String m17918q = this.f13087u.m17918q("ETag");
        if (!TextUtils.isEmpty(m17918q) && (str = this.f13088v) != null && !str.equals(m17918q)) {
            this.f13081o = 409;
            throw new IOException("The ETag on the server changed.");
        }
        this.f13088v = m17918q;
        this.f13083q = this.f13087u.m17919r() + this.f13084r;
        return this.f13087u.m17921t();
    }

    /* renamed from: q0 */
    public void m15952q0(long j7) {
        long j8 = this.f13084r + j7;
        this.f13084r = j8;
        if (this.f13085s + 262144 <= j8) {
            if (m15880B() == 4) {
                m15915j0(4, false);
            } else {
                this.f13085s = this.f13084r;
            }
        }
    }

    /* renamed from: r0 */
    public C3978H m15953r0(b bVar) {
        AbstractC3802r.m15129k(bVar);
        AbstractC3802r.m15132n(this.f13082p == null);
        this.f13082p = bVar;
        return this;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public d mo15911h0() {
        return new d(C3998n.m16025e(this.f13080n, this.f13081o), this.f13085s);
    }

    /* renamed from: com.google.firebase.storage.H$c */
    public static class c extends InputStream {

        /* renamed from: a */
        public C3978H f13090a;

        /* renamed from: b */
        public InputStream f13091b;

        /* renamed from: c */
        public Callable f13092c;

        /* renamed from: d */
        public IOException f13093d;

        /* renamed from: e */
        public long f13094e;

        /* renamed from: f */
        public long f13095f;

        /* renamed from: n */
        public boolean f13096n;

        public c(Callable callable, C3978H c3978h) {
            this.f13090a = c3978h;
            this.f13092c = callable;
        }

        @Override // java.io.InputStream
        public int available() {
            while (m15959d()) {
                try {
                    return this.f13091b.available();
                } catch (IOException e7) {
                    this.f13093d = e7;
                }
            }
            throw this.f13093d;
        }

        /* renamed from: c */
        public final void m15958c() {
            C3978H c3978h = this.f13090a;
            if (c3978h != null && c3978h.m15880B() == 32) {
                throw new C3985a();
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.f13091b;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13096n = true;
            C3978H c3978h = this.f13090a;
            if (c3978h != null && c3978h.f13087u != null) {
                this.f13090a.f13087u.m17900C();
                this.f13090a.f13087u = null;
            }
            m15958c();
        }

        /* renamed from: d */
        public final boolean m15959d() {
            m15958c();
            if (this.f13093d != null) {
                try {
                    InputStream inputStream = this.f13091b;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.f13091b = null;
                if (this.f13095f == this.f13094e) {
                    Log.i("StreamDownloadTask", "Encountered exception during stream operation. Aborting.", this.f13093d);
                    return false;
                }
                Log.i("StreamDownloadTask", "Encountered exception during stream operation. Retrying at " + this.f13094e, this.f13093d);
                this.f13095f = this.f13094e;
                this.f13093d = null;
            }
            if (this.f13096n) {
                throw new IOException("Can't perform operation on closed stream");
            }
            if (this.f13091b != null) {
                return true;
            }
            try {
                this.f13091b = (InputStream) this.f13092c.call();
                return true;
            } catch (Exception e7) {
                if (e7 instanceof IOException) {
                    throw ((IOException) e7);
                }
                throw new IOException("Unable to open stream", e7);
            }
        }

        /* renamed from: g */
        public final void m15960g(long j7) {
            C3978H c3978h = this.f13090a;
            if (c3978h != null) {
                c3978h.m15952q0(j7);
            }
            this.f13094e += j7;
        }

        @Override // java.io.InputStream
        public void mark(int i7) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            while (m15959d()) {
                try {
                    int read = this.f13091b.read();
                    if (read != -1) {
                        m15960g(1L);
                    }
                    return read;
                } catch (IOException e7) {
                    this.f13093d = e7;
                }
            }
            throw this.f13093d;
        }

        @Override // java.io.InputStream
        public long skip(long j7) {
            long j8 = 0;
            while (m15959d()) {
                while (j7 > 262144) {
                    try {
                        long skip = this.f13091b.skip(262144L);
                        if (skip < 0) {
                            if (j8 == 0) {
                                return -1L;
                            }
                            return j8;
                        }
                        j8 += skip;
                        j7 -= skip;
                        m15960g(skip);
                        m15958c();
                    } catch (IOException e7) {
                        this.f13093d = e7;
                    }
                }
                if (j7 > 0) {
                    long skip2 = this.f13091b.skip(j7);
                    if (skip2 < 0) {
                        if (j8 == 0) {
                            return -1L;
                        }
                        return j8;
                    }
                    j8 += skip2;
                    j7 -= skip2;
                    m15960g(skip2);
                }
                if (j7 == 0) {
                    return j8;
                }
            }
            throw this.f13093d;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            int i9 = 0;
            while (m15959d()) {
                while (i8 > 262144) {
                    try {
                        int read = this.f13091b.read(bArr, i7, 262144);
                        if (read == -1) {
                            if (i9 == 0) {
                                return -1;
                            }
                            return i9;
                        }
                        i9 += read;
                        i7 += read;
                        i8 -= read;
                        m15960g(read);
                        m15958c();
                    } catch (IOException e7) {
                        this.f13093d = e7;
                    }
                }
                if (i8 > 0) {
                    int read2 = this.f13091b.read(bArr, i7, i8);
                    if (read2 == -1) {
                        if (i9 == 0) {
                            return -1;
                        }
                        return i9;
                    }
                    i7 += read2;
                    i9 += read2;
                    i8 -= read2;
                    m15960g(read2);
                }
                if (i8 == 0) {
                    return i9;
                }
            }
            throw this.f13093d;
        }
    }
}
