package p228f4;

import android.net.Uri;
import p219e3.C4176f;
import p220e4.C4196h;

/* renamed from: f4.i */
/* loaded from: classes.dex */
public class C4285i extends AbstractC4282f {

    /* renamed from: m */
    public final Uri f14735m;

    public C4285i(C4196h c4196h, C4176f c4176f, Uri uri) {
        super(c4196h, c4176f);
        this.f14735m = uri;
        super.m17904G("X-Goog-Upload-Protocol", "resumable");
        super.m17904G("X-Goog-Upload-Command", "query");
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: e */
    public String mo17894e() {
        return "POST";
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: u */
    public Uri mo17896u() {
        return this.f14735m;
    }
}
