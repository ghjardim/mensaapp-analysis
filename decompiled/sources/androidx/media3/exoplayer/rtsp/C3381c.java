package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.exoplayer.rtsp.AbstractC3386h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.tika.metadata.TikaCoreProperties;
import p232g0.C4295A;
import p259j0.AbstractC5330M;

/* renamed from: androidx.media3.exoplayer.rtsp.c */
/* loaded from: classes.dex */
public final class C3381c {

    /* renamed from: a */
    public final int f10993a;

    /* renamed from: b */
    public final String f10994b;

    /* renamed from: c */
    public final String f10995c;

    /* renamed from: d */
    public final String f10996d;

    public C3381c(int i7, String str, String str2, String str3) {
        this.f10993a = i7;
        this.f10994b = str;
        this.f10995c = str2;
        this.f10996d = str3;
    }

    /* renamed from: a */
    public String m13173a(AbstractC3386h.a aVar, Uri uri, int i7) {
        int i8 = this.f10993a;
        if (i8 == 1) {
            return m13174b(aVar);
        }
        if (i8 == 2) {
            return m13175c(aVar, uri, i7);
        }
        throw C4295A.m17946d(null, new UnsupportedOperationException());
    }

    /* renamed from: b */
    public final String m13174b(AbstractC3386h.a aVar) {
        return AbstractC5330M.m21685H("Basic %s", Base64.encodeToString(AbstractC3386h.m13349d(aVar.f11093a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + aVar.f11094b), 0));
    }

    /* renamed from: c */
    public final String m13175c(AbstractC3386h.a aVar, Uri uri, int i7) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String m13365t = AbstractC3386h.m13365t(i7);
            String m21749i1 = AbstractC5330M.m21749i1(messageDigest.digest(AbstractC3386h.m13349d(aVar.f11093a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f10994b + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + aVar.f11094b)));
            StringBuilder sb = new StringBuilder();
            sb.append(m13365t);
            sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb.append(uri);
            String m21749i12 = AbstractC5330M.m21749i1(messageDigest.digest(AbstractC3386h.m13349d(m21749i1 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f10995c + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + AbstractC5330M.m21749i1(messageDigest.digest(AbstractC3386h.m13349d(sb.toString()))))));
            return this.f10996d.isEmpty() ? AbstractC5330M.m21685H("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f11093a, this.f10994b, this.f10995c, uri, m21749i12) : AbstractC5330M.m21685H("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f11093a, this.f10994b, this.f10995c, uri, m21749i12, this.f10996d);
        } catch (NoSuchAlgorithmException e7) {
            throw C4295A.m17946d(null, e7);
        }
    }
}
