package p108P2;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p256j$.util.Objects;
import p270k2.C5403a;

/* renamed from: P2.w6 */
/* loaded from: classes.dex */
public final class C1863w6 extends AbstractC1693d7 {

    /* renamed from: d */
    public final Map f5586d;

    /* renamed from: e */
    public final C1645Y2 f5587e;

    /* renamed from: f */
    public final C1645Y2 f5588f;

    /* renamed from: g */
    public final C1645Y2 f5589g;

    /* renamed from: h */
    public final C1645Y2 f5590h;

    /* renamed from: i */
    public final C1645Y2 f5591i;

    /* renamed from: j */
    public final C1645Y2 f5592j;

    public C1863w6(C1828s7 c1828s7) {
        super(c1828s7);
        this.f5586d = new HashMap();
        C1680c3 m5611H = this.f5129a.m5611H();
        Objects.requireNonNull(m5611H);
        this.f5587e = new C1645Y2(m5611H, "last_delete_stale", 0L);
        C1680c3 m5611H2 = this.f5129a.m5611H();
        Objects.requireNonNull(m5611H2);
        this.f5588f = new C1645Y2(m5611H2, "last_delete_stale_batch", 0L);
        C1680c3 m5611H3 = this.f5129a.m5611H();
        Objects.requireNonNull(m5611H3);
        this.f5589g = new C1645Y2(m5611H3, "backoff", 0L);
        C1680c3 m5611H4 = this.f5129a.m5611H();
        Objects.requireNonNull(m5611H4);
        this.f5590h = new C1645Y2(m5611H4, "last_upload", 0L);
        C1680c3 m5611H5 = this.f5129a.m5611H();
        Objects.requireNonNull(m5611H5);
        this.f5591i = new C1645Y2(m5611H5, "last_upload_attempt", 0L);
        C1680c3 m5611H6 = this.f5129a.m5611H();
        Objects.requireNonNull(m5611H6);
        this.f5592j = new C1645Y2(m5611H6, "midnight_offset", 0L);
    }

    @Override // p108P2.AbstractC1693d7
    /* renamed from: l */
    public final boolean mo5961l() {
        return false;
    }

    /* renamed from: m */
    public final Pair m6457m(String str) {
        C1845u6 c1845u6;
        C5403a.a aVar;
        mo5762h();
        C1460C3 c1460c3 = this.f5129a;
        long mo1111b = c1460c3.mo5626d().mo1111b();
        C1845u6 c1845u62 = (C1845u6) this.f5586d.get(str);
        if (c1845u62 != null && mo1111b < c1845u62.f5557c) {
            return new Pair(c1845u62.f5555a, Boolean.valueOf(c1845u62.f5556b));
        }
        C5403a.m22366b(true);
        long m6125C = c1460c3.m5605B().m6125C(str, AbstractC1805q2.f5371b) + mo1111b;
        try {
            try {
                aVar = C5403a.m22365a(c1460c3.mo5625c());
            } catch (PackageManager.NameNotFoundException unused) {
                aVar = null;
                if (c1845u62 != null && mo1111b < c1845u62.f5557c + this.f5129a.m5605B().m6125C(str, AbstractC1805q2.f5374c)) {
                    return new Pair(c1845u62.f5555a, Boolean.valueOf(c1845u62.f5556b));
                }
            }
        } catch (Exception e7) {
            this.f5129a.mo5624b().m5935q().m5903b("Unable to get advertising id", e7);
            c1845u6 = new C1845u6(StringUtils.EMPTY, false, m6125C);
        }
        if (aVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String m22372a = aVar.m22372a();
        c1845u6 = m22372a != null ? new C1845u6(m22372a, aVar.m22373b(), m6125C) : new C1845u6(StringUtils.EMPTY, aVar.m22373b(), m6125C);
        this.f5586d.put(str, c1845u6);
        C5403a.m22366b(false);
        return new Pair(c1845u6.f5555a, Boolean.valueOf(c1845u6.f5556b));
    }

    /* renamed from: n */
    public final Pair m6458n(String str, C1771m4 c1771m4) {
        return c1771m4.m6115r(EnumC1762l4.AD_STORAGE) ? m6457m(str) : new Pair(StringUtils.EMPTY, Boolean.FALSE);
    }

    /* renamed from: o */
    public final String m6459o(String str, boolean z6) {
        mo5762h();
        String str2 = z6 ? (String) m6457m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest m5679w = C1473D7.m5679w();
        if (m5679w == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m5679w.digest(str2.getBytes())));
    }
}
