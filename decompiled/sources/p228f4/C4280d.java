package p228f4;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p219e3.C4176f;
import p220e4.C4196h;

/* renamed from: f4.d */
/* loaded from: classes.dex */
public class C4280d extends AbstractC4281e {

    /* renamed from: m */
    public final Integer f14714m;

    /* renamed from: n */
    public final String f14715n;

    public C4280d(C4196h c4196h, C4176f c4176f, Integer num, String str) {
        super(c4196h, c4176f);
        this.f14714m = num;
        this.f14715n = str;
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: e */
    public String mo17894e() {
        return "GET";
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: l */
    public Map mo17895l() {
        HashMap hashMap = new HashMap();
        String m17913j = m17913j();
        if (!m17913j.isEmpty()) {
            hashMap.put("prefix", m17913j + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f14714m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f14715n)) {
            hashMap.put("pageToken", this.f14715n);
        }
        return hashMap;
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: u */
    public Uri mo17896u() {
        return Uri.parse(m17920s().m17602b() + "/b/" + m17920s().m17601a().getAuthority() + "/o");
    }
}
