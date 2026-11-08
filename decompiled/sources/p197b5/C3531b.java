package p197b5;

import android.content.Context;
import java.util.Map;
import p022D0.C0172r;
import p022D0.InterfaceC0120F;
import p197b5.AbstractC3548s;
import p232g0.C4331u;
import p276l0.C5498l;
import p276l0.C5499m;

/* renamed from: b5.b */
/* loaded from: classes2.dex */
public final class C3531b extends AbstractC3548s {

    /* renamed from: b */
    public final AbstractC3548s.a f11943b;

    /* renamed from: c */
    public final Map f11944c;

    /* renamed from: b5.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11945a;

        static {
            int[] iArr = new int[AbstractC3548s.a.values().length];
            f11945a = iArr;
            try {
                iArr[AbstractC3548s.a.SMOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11945a[AbstractC3548s.a.DYNAMIC_ADAPTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11945a[AbstractC3548s.a.HTTP_LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3531b(String str, AbstractC3548s.a aVar, Map map) {
        super(str);
        this.f11943b = aVar;
        this.f11944c = map;
    }

    /* renamed from: g */
    public static void m14267g(C5499m.b bVar, Map map, String str) {
        bVar.m23118e(str).m23116c(true);
        if (map.isEmpty()) {
            return;
        }
        bVar.m23117d(map);
    }

    @Override // p197b5.AbstractC3548s
    /* renamed from: d */
    public C4331u mo14268d() {
        C4331u.c m18283h = new C4331u.c().m18283h(this.f11975a);
        int i7 = a.f11945a[this.f11943b.ordinal()];
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str != null) {
            m18283h.m18279d(str);
        }
        return m18283h.m18276a();
    }

    @Override // p197b5.AbstractC3548s
    /* renamed from: e */
    public InterfaceC0120F.a mo14269e(Context context) {
        return m14270f(context, new C5499m.b());
    }

    /* renamed from: f */
    public InterfaceC0120F.a m14270f(Context context, C5499m.b bVar) {
        m14267g(bVar, this.f11944c, (this.f11944c.isEmpty() || !this.f11944c.containsKey("User-Agent")) ? "ExoPlayer" : (String) this.f11944c.get("User-Agent"));
        return new C0172r(context).m673o(new C5498l.a(context, bVar));
    }
}
