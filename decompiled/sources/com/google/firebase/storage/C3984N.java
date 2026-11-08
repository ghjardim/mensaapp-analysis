package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.storage.AbstractC3975E;
import com.google.firebase.storage.C3999o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.json.JSONException;
import p031E2.C0271g;
import p031E2.InterfaceC0268d;
import p220e4.AbstractC4197i;
import p220e4.C4190b;
import p220e4.C4191c;
import p220e4.C4194f;
import p220e4.InterfaceC4193e;
import p228f4.AbstractC4281e;
import p228f4.C4283g;
import p228f4.C4284h;
import p228f4.C4285i;
import p228f4.C4286j;
import p303o3.InterfaceC5939b;
import p354u3.InterfaceC6640b;

/* renamed from: com.google.firebase.storage.N */
/* loaded from: classes.dex */
public class C3984N extends AbstractC3975E {

    /* renamed from: E */
    public static final Random f13117E = new Random();

    /* renamed from: F */
    public static InterfaceC4193e f13118F = new C4194f();

    /* renamed from: G */
    public static InterfaceC0268d f13119G = C0271g.m1116d();

    /* renamed from: A */
    public volatile String f13120A;

    /* renamed from: B */
    public volatile long f13121B;

    /* renamed from: C */
    public int f13122C;

    /* renamed from: D */
    public final int f13123D;

    /* renamed from: l */
    public final C4000p f13124l;

    /* renamed from: m */
    public final Uri f13125m;

    /* renamed from: n */
    public final long f13126n;

    /* renamed from: o */
    public final C4190b f13127o;

    /* renamed from: p */
    public final AtomicLong f13128p;

    /* renamed from: q */
    public final InterfaceC6640b f13129q;

    /* renamed from: r */
    public final InterfaceC5939b f13130r;

    /* renamed from: s */
    public int f13131s;

    /* renamed from: t */
    public C4191c f13132t;

    /* renamed from: u */
    public boolean f13133u;

    /* renamed from: v */
    public volatile C3999o f13134v;

    /* renamed from: w */
    public volatile Uri f13135w;

    /* renamed from: x */
    public volatile Exception f13136x;

    /* renamed from: y */
    public volatile Exception f13137y;

    /* renamed from: z */
    public volatile int f13138z;

    /* renamed from: com.google.firebase.storage.N$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4281e f13139a;

        public a(AbstractC4281e abstractC4281e) {
            this.f13139a = abstractC4281e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13139a.m17899B(AbstractC4197i.m17606c(C3984N.this.f13129q), AbstractC4197i.m17605b(C3984N.this.f13130r), C3984N.this.f13124l.m16082i().m17532m());
        }
    }

    /* renamed from: com.google.firebase.storage.N$b */
    public class b extends AbstractC3975E.b {

        /* renamed from: c */
        public final long f13141c;

        /* renamed from: d */
        public final Uri f13142d;

        /* renamed from: e */
        public final C3999o f13143e;

        public b(Exception exc, long j7, Uri uri, C3999o c3999o) {
            super(exc);
            this.f13141c = j7;
            this.f13142d = uri;
            this.f13143e = c3999o;
        }

        /* renamed from: d */
        public long m15986d() {
            return this.f13141c;
        }

        /* renamed from: e */
        public C3999o m15987e() {
            return this.f13143e;
        }

        /* renamed from: f */
        public long m15988f() {
            return C3984N.this.m15977q0();
        }
    }

    public C3984N(C4000p c4000p, C3999o c3999o, byte[] bArr) {
        this.f13128p = new AtomicLong(0L);
        this.f13131s = 262144;
        this.f13135w = null;
        this.f13136x = null;
        this.f13137y = null;
        this.f13138z = 0;
        this.f13122C = 0;
        this.f13123D = PipesIterator.DEFAULT_QUEUE_SIZE;
        AbstractC3802r.m15129k(c4000p);
        AbstractC3802r.m15129k(bArr);
        C3990f m16092s = c4000p.m16092s();
        this.f13126n = bArr.length;
        this.f13124l = c4000p;
        this.f13134v = c3999o;
        InterfaceC6640b m16001c = m16092s.m16001c();
        this.f13129q = m16001c;
        InterfaceC5939b m16000b = m16092s.m16000b();
        this.f13130r = m16000b;
        this.f13125m = null;
        this.f13127o = new C4190b(new ByteArrayInputStream(bArr), 262144);
        this.f13133u = true;
        this.f13121B = m16092s.m16004h();
        this.f13132t = new C4191c(m16092s.m15999a().m17532m(), m16001c, m16000b, m16092s.m16007k());
    }

    /* renamed from: r0 */
    private boolean m15974r0(int i7) {
        return i7 == 308 || (i7 >= 200 && i7 < 300);
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: I */
    public C4000p mo15887I() {
        return this.f13124l;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: U */
    public void mo15898U() {
        this.f13132t.m17591a();
        C4284h c4284h = this.f13135w != null ? new C4284h(this.f13124l.m16093t(), this.f13124l.m16082i(), this.f13135w) : null;
        if (c4284h != null) {
            C3977G.m15939b().m15944f(new a(c4284h));
        }
        this.f13136x = C3998n.m16023c(Status.f12252q);
        super.mo15898U();
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: c0 */
    public void mo15906c0() {
        this.f13136x = null;
        this.f13137y = null;
        this.f13138z = 0;
        this.f13120A = null;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: e0 */
    public void mo15908e0() {
        this.f13132t.m17593c();
        if (!m15915j0(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.f13124l.m16089p() == null) {
            this.f13136x = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.f13136x != null) {
            return;
        }
        if (this.f13135w == null) {
            m15975o0();
        } else {
            m15979t0(false);
        }
        boolean m15983x0 = m15983x0();
        while (m15983x0) {
            m15985z0();
            m15983x0 = m15983x0();
            if (m15983x0) {
                m15915j0(4, false);
            }
        }
        if (!this.f13133u || m15880B() == 16) {
            return;
        }
        try {
            this.f13127o.m17586c();
        } catch (IOException e7) {
            Log.e("UploadTask", "Unable to close stream.", e7);
        }
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: f0 */
    public void mo15909f0() {
        C3977G.m15939b().m15946h(m15883E());
    }

    /* renamed from: o0 */
    public final void m15975o0() {
        String m16058w = this.f13134v != null ? this.f13134v.m16058w() : null;
        if (this.f13125m != null && TextUtils.isEmpty(m16058w)) {
            m16058w = this.f13124l.m16092s().m15999a().m17532m().getContentResolver().getType(this.f13125m);
        }
        if (TextUtils.isEmpty(m16058w)) {
            m16058w = MimeTypes.OCTET_STREAM;
        }
        C4286j c4286j = new C4286j(this.f13124l.m16093t(), this.f13124l.m16082i(), this.f13134v != null ? this.f13134v.m16052q() : null, m16058w);
        if (m15981v0(c4286j)) {
            String m17918q = c4286j.m17918q("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(m17918q)) {
                return;
            }
            this.f13135w = Uri.parse(m17918q);
        }
    }

    /* renamed from: p0 */
    public final boolean m15976p0(AbstractC4281e abstractC4281e) {
        try {
            Log.d("UploadTask", "Waiting " + this.f13122C + " milliseconds");
            f13118F.mo17599a(this.f13122C + f13117E.nextInt(250));
            boolean m15980u0 = m15980u0(abstractC4281e);
            if (m15980u0) {
                this.f13122C = 0;
            }
            return m15980u0;
        } catch (InterruptedException e7) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f13137y = e7;
            return false;
        }
    }

    /* renamed from: q0 */
    public long m15977q0() {
        return this.f13126n;
    }

    /* renamed from: s0 */
    public final boolean m15978s0(AbstractC4281e abstractC4281e) {
        int m17916o = abstractC4281e.m17916o();
        if (this.f13132t.m17592b(m17916o)) {
            m17916o = -2;
        }
        this.f13138z = m17916o;
        this.f13137y = abstractC4281e.m17909f();
        this.f13120A = abstractC4281e.m17918q("X-Goog-Upload-Status");
        return m15974r0(this.f13138z) && this.f13137y == null;
    }

    /* renamed from: t0 */
    public final boolean m15979t0(boolean z6) {
        C4285i c4285i = new C4285i(this.f13124l.m16093t(), this.f13124l.m16082i(), this.f13135w);
        if ("final".equals(this.f13120A)) {
            return false;
        }
        if (z6) {
            if (!m15981v0(c4285i)) {
                return false;
            }
        } else if (!m15980u0(c4285i)) {
            return false;
        }
        if ("final".equals(c4285i.m17918q("X-Goog-Upload-Status"))) {
            this.f13136x = new IOException("The server has terminated the upload session");
            return false;
        }
        String m17918q = c4285i.m17918q("X-Goog-Upload-Size-Received");
        long parseLong = !TextUtils.isEmpty(m17918q) ? Long.parseLong(m17918q) : 0L;
        long j7 = this.f13128p.get();
        if (j7 > parseLong) {
            this.f13136x = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j7 >= parseLong) {
            return true;
        }
        try {
            if (this.f13127o.m17584a((int) r7) != parseLong - j7) {
                this.f13136x = new IOException("Unexpected end of stream encountered.");
                return false;
            }
            if (this.f13128p.compareAndSet(j7, parseLong)) {
                return true;
            }
            Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
            this.f13136x = new IllegalStateException("uploaded bytes changed unexpectedly.");
            return false;
        } catch (IOException e7) {
            Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e7);
            this.f13136x = e7;
            return false;
        }
    }

    /* renamed from: u0 */
    public final boolean m15980u0(AbstractC4281e abstractC4281e) {
        abstractC4281e.m17899B(AbstractC4197i.m17606c(this.f13129q), AbstractC4197i.m17605b(this.f13130r), this.f13124l.m16082i().m17532m());
        return m15978s0(abstractC4281e);
    }

    /* renamed from: v0 */
    public final boolean m15981v0(AbstractC4281e abstractC4281e) {
        this.f13132t.m17594d(abstractC4281e);
        return m15978s0(abstractC4281e);
    }

    /* renamed from: w0 */
    public final boolean m15982w0() {
        if (!"final".equals(this.f13120A)) {
            return true;
        }
        if (this.f13136x == null) {
            this.f13136x = new IOException("The server has terminated the upload session", this.f13137y);
        }
        m15915j0(64, false);
        return false;
    }

    /* renamed from: x0 */
    public final boolean m15983x0() {
        if (m15880B() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f13136x = new InterruptedException();
            m15915j0(64, false);
            return false;
        }
        if (m15880B() == 32) {
            m15915j0(256, false);
            return false;
        }
        if (m15880B() == 8) {
            m15915j0(16, false);
            return false;
        }
        if (!m15982w0()) {
            return false;
        }
        if (this.f13135w == null) {
            if (this.f13136x == null) {
                this.f13136x = new IllegalStateException("Unable to obtain an upload URL.");
            }
            m15915j0(64, false);
            return false;
        }
        if (this.f13136x != null) {
            m15915j0(64, false);
            return false;
        }
        boolean z6 = this.f13137y != null || this.f13138z < 200 || this.f13138z >= 300;
        long mo1111b = f13119G.mo1111b() + this.f13121B;
        long mo1111b2 = f13119G.mo1111b() + this.f13122C;
        if (z6) {
            if (mo1111b2 > mo1111b || !m15979t0(true)) {
                if (m15982w0()) {
                    m15915j0(64, false);
                }
                return false;
            }
            this.f13122C = Math.max(this.f13122C * 2, PipesIterator.DEFAULT_QUEUE_SIZE);
        }
        return true;
    }

    @Override // com.google.firebase.storage.AbstractC3975E
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b mo15911h0() {
        return new b(C3998n.m16025e(this.f13136x != null ? this.f13136x : this.f13137y, this.f13138z), this.f13128p.get(), this.f13135w, this.f13134v);
    }

    /* renamed from: z0 */
    public final void m15985z0() {
        try {
            this.f13127o.m17587d(this.f13131s);
            int min = Math.min(this.f13131s, this.f13127o.m17585b());
            C4283g c4283g = new C4283g(this.f13124l.m16093t(), this.f13124l.m16082i(), this.f13135w, this.f13127o.m17588e(), this.f13128p.get(), min, this.f13127o.m17589f());
            if (!m15976p0(c4283g)) {
                this.f13131s = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f13131s);
                return;
            }
            this.f13128p.getAndAdd(min);
            if (!this.f13127o.m17589f()) {
                this.f13127o.m17584a(min);
                int i7 = this.f13131s;
                if (i7 < 33554432) {
                    this.f13131s = i7 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f13131s);
                    return;
                }
                return;
            }
            try {
                this.f13134v = new C3999o.b(c4283g.m17915n(), this.f13124l).m16062a();
                m15915j0(4, false);
                m15915j0(128, false);
            } catch (JSONException e7) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + c4283g.m17914m(), e7);
                this.f13136x = e7;
            }
        } catch (IOException e8) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e8);
            this.f13136x = e8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3984N(com.google.firebase.storage.C4000p r11, com.google.firebase.storage.C3999o r12, android.net.Uri r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.C3984N.<init>(com.google.firebase.storage.p, com.google.firebase.storage.o, android.net.Uri, android.net.Uri):void");
    }
}
