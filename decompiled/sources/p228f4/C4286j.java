package p228f4;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p219e3.C4176f;
import p220e4.C4196h;

/* renamed from: f4.j */
/* loaded from: classes.dex */
public class C4286j extends AbstractC4282f {

    /* renamed from: m */
    public final JSONObject f14736m;

    /* renamed from: n */
    public final String f14737n;

    public C4286j(C4196h c4196h, C4176f c4176f, JSONObject jSONObject, String str) {
        super(c4196h, c4176f);
        this.f14736m = jSONObject;
        this.f14737n = str;
        if (TextUtils.isEmpty(str)) {
            this.f14718a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.m17904G("X-Goog-Upload-Protocol", "resumable");
        super.m17904G("X-Goog-Upload-Command", "start");
        super.m17904G("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: e */
    public String mo17894e() {
        return "POST";
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: g */
    public JSONObject mo17910g() {
        return this.f14736m;
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: l */
    public Map mo17895l() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", m17913j());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: u */
    public Uri mo17896u() {
        String authority = m17920s().m17601a().getAuthority();
        Uri.Builder buildUpon = m17920s().m17602b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
