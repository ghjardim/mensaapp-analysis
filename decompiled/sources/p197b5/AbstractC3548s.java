package p197b5;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p022D0.InterfaceC0120F;
import p232g0.C4331u;

/* renamed from: b5.s */
/* loaded from: classes2.dex */
public abstract class AbstractC3548s {

    /* renamed from: a */
    public final String f11975a;

    /* renamed from: b5.s$a */
    public enum a {
        UNKNOWN,
        SMOOTH,
        DYNAMIC_ADAPTIVE,
        HTTP_LIVE
    }

    public AbstractC3548s(String str) {
        this.f11975a = str;
    }

    /* renamed from: a */
    public static AbstractC3548s m14308a(String str) {
        if (str.startsWith("asset:///")) {
            return new C3532c(str);
        }
        throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
    }

    /* renamed from: b */
    public static AbstractC3548s m14309b(String str, a aVar, Map map) {
        return new C3531b(str, aVar, new HashMap(map));
    }

    /* renamed from: c */
    public static AbstractC3548s m14310c(String str) {
        if (str.startsWith("rtsp://")) {
            return new C3547r(str);
        }
        throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
    }

    /* renamed from: d */
    public abstract C4331u mo14268d();

    /* renamed from: e */
    public abstract InterfaceC0120F.a mo14269e(Context context);
}
