package p228f4;

import org.json.JSONObject;
import p219e3.C4176f;
import p220e4.C4196h;

/* renamed from: f4.k */
/* loaded from: classes.dex */
public class C4287k extends AbstractC4281e {

    /* renamed from: m */
    public final JSONObject f14738m;

    public C4287k(C4196h c4196h, C4176f c4176f, JSONObject jSONObject) {
        super(c4196h, c4176f);
        this.f14738m = jSONObject;
        m17904G("X-HTTP-Method-Override", "PATCH");
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: e */
    public String mo17894e() {
        return "PUT";
    }

    @Override // p228f4.AbstractC4281e
    /* renamed from: g */
    public JSONObject mo17910g() {
        return this.f14738m;
    }
}
