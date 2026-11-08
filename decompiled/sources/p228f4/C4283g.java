package p228f4;

import android.net.Uri;
import p219e3.C4176f;
import p220e4.C4196h;

/* renamed from: f4.g */
/* loaded from: classes.dex */
public class C4283g extends AbstractC4282f {

    /* renamed from: m */
    public final Uri f14728m;

    /* renamed from: n */
    public final byte[] f14729n;

    /* renamed from: o */
    public final long f14730o;

    /* renamed from: p */
    public final boolean f14731p;

    /* renamed from: q */
    public final int f14732q;

    public C4283g(C4196h c4196h, C4176f c4176f, Uri uri, byte[] bArr, long j7, int i7, boolean z6) {
        super(c4196h, c4176f);
        if (bArr == null && i7 != -1) {
            this.f14718a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j7 < 0) {
            this.f14718a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f14732q = i7;
        this.f14728m = uri;
        this.f14729n = i7 <= 0 ? null : bArr;
        this.f14730o = j7;
        this.f14731p = z6;
        super.m17904G("X-Goog-Upload-Protocol", "resumable");
        if (z6 && i7 > 0) {
            super.m17904G("X-Goog-Upload-Command", "upload, finalize");
        } else if (z6) {
            super.m17904G("X-Goog-Upload-Command", "finalize");
        } else {
            super.m17904G("X-Goog-Upload-Command", "upload");
        }
        super.m17904G("X-Goog-Upload-Offset", Long.toString(j7));
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: e */
    public String mo17894e() {
        return "POST";
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: h */
    public byte[] mo17911h() {
        return this.f14729n;
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: i */
    public int mo17912i() {
        int i7 = this.f14732q;
        if (i7 > 0) {
            return i7;
        }
        return 0;
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: u */
    public Uri mo17896u() {
        return this.f14728m;
    }
}
