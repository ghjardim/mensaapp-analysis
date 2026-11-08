package p284m0;

import android.media.MediaCodec;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: m0.c */
/* loaded from: classes.dex */
public final class C5555c {

    /* renamed from: a */
    public byte[] f20063a;

    /* renamed from: b */
    public byte[] f20064b;

    /* renamed from: c */
    public int f20065c;

    /* renamed from: d */
    public int[] f20066d;

    /* renamed from: e */
    public int[] f20067e;

    /* renamed from: f */
    public int f20068f;

    /* renamed from: g */
    public int f20069g;

    /* renamed from: h */
    public int f20070h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f20071i;

    /* renamed from: j */
    public final b f20072j;

    /* renamed from: m0.c$b */
    public static final class b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f20073a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f20074b;

        /* renamed from: b */
        public final void m23284b(int i7, int i8) {
            this.f20074b.set(i7, i8);
            this.f20073a.setPattern(this.f20074b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f20073a = cryptoInfo;
            this.f20074b = AbstractC5558f.m23287a(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5555c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f20071i = cryptoInfo;
        this.f20072j = AbstractC5330M.f18800a >= 24 ? new b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m23280a() {
        return this.f20071i;
    }

    /* renamed from: b */
    public void m23281b(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f20066d == null) {
            int[] iArr = new int[1];
            this.f20066d = iArr;
            this.f20071i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f20066d;
        iArr2[0] = iArr2[0] + i7;
    }

    /* renamed from: c */
    public void m23282c(int i7, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i8, int i9, int i10) {
        this.f20068f = i7;
        this.f20066d = iArr;
        this.f20067e = iArr2;
        this.f20064b = bArr;
        this.f20063a = bArr2;
        this.f20065c = i8;
        this.f20069g = i9;
        this.f20070h = i10;
        MediaCodec.CryptoInfo cryptoInfo = this.f20071i;
        cryptoInfo.numSubSamples = i7;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i8;
        if (AbstractC5330M.f18800a >= 24) {
            ((b) AbstractC5332a.m21800e(this.f20072j)).m23284b(i9, i10);
        }
    }
}
