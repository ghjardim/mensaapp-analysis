package p220e4;

import android.net.Uri;
import org.apache.tika.metadata.TikaCoreProperties;
import p004A3.C0020a;
import p228f4.AbstractC4281e;

/* renamed from: e4.h */
/* loaded from: classes.dex */
public class C4196h {

    /* renamed from: a */
    public final Uri f14054a;

    /* renamed from: b */
    public final Uri f14055b;

    /* renamed from: c */
    public final Uri f14056c;

    public C4196h(Uri uri, C0020a c0020a) {
        Uri parse;
        this.f14056c = uri;
        if (c0020a == null) {
            parse = AbstractC4281e.f14716k;
        } else {
            parse = Uri.parse("http://" + c0020a.m68a() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c0020a.m69b() + "/v0");
        }
        this.f14054a = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String m17596a = AbstractC4192d.m17596a(uri.getPath());
        if (m17596a.length() > 0 && !"/".equals(m17596a)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(m17596a);
        }
        this.f14055b = appendEncodedPath.build();
    }

    /* renamed from: a */
    public Uri m17601a() {
        return this.f14056c;
    }

    /* renamed from: b */
    public Uri m17602b() {
        return this.f14054a;
    }

    /* renamed from: c */
    public Uri m17603c() {
        return this.f14055b;
    }
}
