package p335s0;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2922e;
import p225f1.AbstractC4240o;
import p232g0.AbstractC4317g;
import p232g0.C4323m;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p300o0.C5912w1;
import p335s0.InterfaceC6326F;

/* renamed from: s0.N */
/* loaded from: classes.dex */
public final class C6334N implements InterfaceC6326F {

    /* renamed from: d */
    public static final InterfaceC6326F.c f22898d = new InterfaceC6326F.c() { // from class: s0.I
        @Override // p335s0.InterfaceC6326F.c
        /* renamed from: a */
        public final InterfaceC6326F mo26507a(UUID uuid) {
            InterfaceC6326F m26514B;
            m26514B = C6334N.m26514B(uuid);
            return m26514B;
        }
    };

    /* renamed from: a */
    public final UUID f22899a;

    /* renamed from: b */
    public final MediaDrm f22900b;

    /* renamed from: c */
    public int f22901c;

    /* renamed from: s0.N$a */
    public static class a {
        /* renamed from: a */
        public static boolean m26532a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        /* renamed from: b */
        public static void m26533b(MediaDrm mediaDrm, byte[] bArr, C5912w1 c5912w1) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId m24874a = c5912w1.m24874a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = m24874a.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            AbstractC6331K.m26511a(AbstractC5332a.m21800e(playbackComponent)).setLogSessionId(m24874a);
        }
    }

    public C6334N(UUID uuid) {
        AbstractC5332a.m21800e(uuid);
        AbstractC5332a.m21797b(!AbstractC4317g.f15028b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f22899a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m26523u(uuid));
        this.f22900b = mediaDrm;
        this.f22901c = 1;
        if (AbstractC4317g.f15030d.equals(uuid) && m26515C()) {
            m26524w(mediaDrm);
        }
    }

    /* renamed from: B */
    public static /* synthetic */ InterfaceC6326F m26514B(UUID uuid) {
        try {
            return m26516D(uuid);
        } catch (C6339T unused) {
            AbstractC5346o.m21862c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C6323C();
        }
    }

    /* renamed from: C */
    public static boolean m26515C() {
        return "ASUS_Z00AD".equals(AbstractC5330M.f18803d);
    }

    /* renamed from: D */
    public static C6334N m26516D(UUID uuid) {
        try {
            return new C6334N(uuid);
        } catch (UnsupportedSchemeException e7) {
            throw new C6339T(1, e7);
        } catch (Exception e8) {
            throw new C6339T(2, e8);
        }
    }

    /* renamed from: p */
    public static byte[] m26519p(byte[] bArr) {
        C5357z c5357z = new C5357z(bArr);
        int m21961t = c5357z.m21961t();
        short m21963v = c5357z.m21963v();
        short m21963v2 = c5357z.m21963v();
        if (m21963v != 1 || m21963v2 != 1) {
            AbstractC5346o.m21865f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short m21963v3 = c5357z.m21963v();
        Charset charset = AbstractC2922e.f9012e;
        String m21924E = c5357z.m21924E(m21963v3, charset);
        if (m21924E.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = m21924E.indexOf("</DATA>");
        if (indexOf == -1) {
            AbstractC5346o.m21867h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = m21924E.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + m21924E.substring(indexOf);
        int i7 = m21961t + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i7);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i7);
        allocate.putShort(m21963v);
        allocate.putShort(m21963v2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    /* renamed from: r */
    public static byte[] m26520r(UUID uuid, byte[] bArr) {
        return AbstractC4317g.f15029c.equals(uuid) ? AbstractC6341a.m26541a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m26521s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p232g0.AbstractC4317g.f15031e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = p225f1.AbstractC4240o.m17809e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = m26519p(r4)
            byte[] r4 = p225f1.AbstractC4240o.m17805a(r0, r4)
        L18:
            int r1 = p259j0.AbstractC5330M.f18800a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = p232g0.AbstractC4317g.f15030d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = p259j0.AbstractC5330M.f18802c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p259j0.AbstractC5330M.f18803d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = p225f1.AbstractC4240o.m17809e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p335s0.C6334N.m26521s(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: t */
    public static String m26522t(UUID uuid, String str) {
        return (AbstractC5330M.f18800a < 26 && AbstractC4317g.f15029c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* renamed from: u */
    public static UUID m26523u(UUID uuid) {
        return (AbstractC5330M.f18800a >= 27 || !AbstractC4317g.f15029c.equals(uuid)) ? uuid : AbstractC4317g.f15028b;
    }

    /* renamed from: w */
    public static void m26524w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: y */
    public static C4323m.b m26525y(UUID uuid, List list) {
        if (!AbstractC4317g.f15030d.equals(uuid)) {
            return (C4323m.b) list.get(0);
        }
        if (AbstractC5330M.f18800a >= 28 && list.size() > 1) {
            C4323m.b bVar = (C4323m.b) list.get(0);
            int i7 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                C4323m.b bVar2 = (C4323m.b) list.get(i8);
                byte[] bArr = (byte[]) AbstractC5332a.m21800e(bVar2.f15075e);
                if (AbstractC5330M.m21729c(bVar2.f15074d, bVar.f15074d) && AbstractC5330M.m21729c(bVar2.f15073c, bVar.f15073c) && AbstractC4240o.m17807c(bArr)) {
                    i7 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i7];
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                byte[] bArr3 = (byte[]) AbstractC5332a.m21800e(((C4323m.b) list.get(i10)).f15075e);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i9, length);
                i9 += length;
            }
            return bVar.m18174b(bArr2);
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            C4323m.b bVar3 = (C4323m.b) list.get(i11);
            int m17811g = AbstractC4240o.m17811g((byte[]) AbstractC5332a.m21800e(bVar3.f15075e));
            int i12 = AbstractC5330M.f18800a;
            if (i12 < 23 && m17811g == 0) {
                return bVar3;
            }
            if (i12 >= 23 && m17811g == 1) {
                return bVar3;
            }
        }
        return (C4323m.b) list.get(0);
    }

    /* renamed from: A */
    public final /* synthetic */ void m26526A(InterfaceC6326F.b bVar, MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
        bVar.mo26506a(this, bArr, i7, i8, bArr2);
    }

    /* renamed from: E */
    public final boolean m26527E() {
        return AbstractC5330M.f18800a < 21 && AbstractC4317g.f15030d.equals(this.f22899a) && "L3".equals(m26530x("securityLevel"));
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: a */
    public void mo26481a(byte[] bArr, C5912w1 c5912w1) {
        if (AbstractC5330M.f18800a >= 31) {
            try {
                a.m26533b(this.f22900b, bArr, c5912w1);
            } catch (UnsupportedOperationException unused) {
                AbstractC5346o.m21867h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: b */
    public Map mo26482b(byte[] bArr) {
        return this.f22900b.queryKeyStatus(bArr);
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: c */
    public InterfaceC6326F.d mo26483c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f22900b.getProvisionRequest();
        return new InterfaceC6326F.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: e */
    public byte[] mo26485e() {
        return this.f22900b.openSession();
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: f */
    public boolean mo26486f(byte[] bArr, String str) {
        boolean z6;
        MediaCrypto mediaCrypto;
        if (AbstractC5330M.f18800a < 31 || !m26531z()) {
            MediaCrypto mediaCrypto2 = null;
            try {
                mediaCrypto = new MediaCrypto(this.f22899a, bArr);
            } catch (MediaCryptoException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                z6 = mediaCrypto.requiresSecureDecoderComponent(str);
                mediaCrypto.release();
            } catch (MediaCryptoException unused2) {
                mediaCrypto2 = mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                z6 = true;
                if (z6) {
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCrypto2 = mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            }
        } else {
            z6 = a.m26532a(this.f22900b, str);
        }
        return (z6 || m26527E()) ? false : true;
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: g */
    public void mo26487g(byte[] bArr, byte[] bArr2) {
        this.f22900b.restoreKeys(bArr, bArr2);
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: h */
    public void mo26488h(byte[] bArr) {
        this.f22900b.closeSession(bArr);
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: i */
    public byte[] mo26489i(byte[] bArr, byte[] bArr2) {
        if (AbstractC4317g.f15029c.equals(this.f22899a)) {
            bArr2 = AbstractC6341a.m26542b(bArr2);
        }
        return this.f22900b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: j */
    public void mo26490j(final InterfaceC6326F.b bVar) {
        this.f22900b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: s0.H
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
                C6334N.this.m26526A(bVar, mediaDrm, bArr, i7, i8, bArr2);
            }
        });
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: k */
    public void mo26491k(byte[] bArr) {
        this.f22900b.provideProvisionResponse(bArr);
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: l */
    public InterfaceC6326F.a mo26492l(byte[] bArr, List list, int i7, HashMap hashMap) {
        C4323m.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = m26525y(this.f22899a, list);
            bArr2 = m26521s(this.f22899a, (byte[]) AbstractC5332a.m21800e(bVar.f15075e));
            str = m26522t(this.f22899a, bVar.f15074d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f22900b.getKeyRequest(bArr, bArr2, str, i7, hashMap);
        byte[] m26520r = m26520r(this.f22899a, keyRequest.getData());
        String m26528q = m26528q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(m26528q) && bVar != null && !TextUtils.isEmpty(bVar.f15073c)) {
            m26528q = bVar.f15073c;
        }
        return new InterfaceC6326F.a(m26520r, m26528q, AbstractC5330M.f18800a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: m */
    public int mo26493m() {
        return 2;
    }

    /* renamed from: q */
    public final String m26528q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return StringUtils.EMPTY;
        }
        if (AbstractC5330M.f18800a >= 33 && "https://default.url".equals(str)) {
            String m26530x = m26530x("version");
            if (Objects.equals(m26530x, "1.2") || Objects.equals(m26530x, "aidl-1")) {
                return StringUtils.EMPTY;
            }
        }
        return str;
    }

    @Override // p335s0.InterfaceC6326F
    public synchronized void release() {
        int i7 = this.f22901c - 1;
        this.f22901c = i7;
        if (i7 == 0) {
            this.f22900b.release();
        }
    }

    @Override // p335s0.InterfaceC6326F
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C6327G mo26484d(byte[] bArr) {
        return new C6327G(m26523u(this.f22899a), bArr, m26527E());
    }

    /* renamed from: x */
    public String m26530x(String str) {
        return this.f22900b.getPropertyString(str);
    }

    /* renamed from: z */
    public final boolean m26531z() {
        if (!this.f22899a.equals(AbstractC4317g.f15030d)) {
            return this.f22899a.equals(AbstractC4317g.f15029c);
        }
        String m26530x = m26530x("version");
        return (m26530x.startsWith("v5.") || m26530x.startsWith("14.") || m26530x.startsWith("15.") || m26530x.startsWith("16.0")) ? false : true;
    }
}
