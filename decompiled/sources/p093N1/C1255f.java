package p093N1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import p058I1.C0618b;
import p079L1.C0895d;
import p079L1.C0901j;
import p079L1.C0902k;
import p079L1.C0907p;
import p079L1.InterfaceC0894c;

/* renamed from: N1.f */
/* loaded from: classes.dex */
public final class C1255f {

    /* renamed from: a */
    public static final C1255f f3977a = new C1255f();

    /* renamed from: a */
    public final InterfaceC0894c m4801a(C0902k windowMetrics, FoldingFeature oemFeature) {
        C0895d.b m3725a;
        InterfaceC0894c.b bVar;
        AbstractC5469l.m23028e(windowMetrics, "windowMetrics");
        AbstractC5469l.m23028e(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            m3725a = C0895d.b.f3121b.m3725a();
        } else {
            if (type != 2) {
                return null;
            }
            m3725a = C0895d.b.f3121b.m3726b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar = InterfaceC0894c.b.f3114c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = InterfaceC0894c.b.f3115d;
        }
        Rect bounds = oemFeature.getBounds();
        AbstractC5469l.m23027d(bounds, "oemFeature.bounds");
        if (!m4804d(windowMetrics, new C0618b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        AbstractC5469l.m23027d(bounds2, "oemFeature.bounds");
        return new C0895d(new C0618b(bounds2), m3725a, bVar);
    }

    /* renamed from: b */
    public final C0901j m4802b(C0902k windowMetrics, WindowLayoutInfo info) {
        InterfaceC0894c interfaceC0894c;
        AbstractC5469l.m23028e(windowMetrics, "windowMetrics");
        AbstractC5469l.m23028e(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        AbstractC5469l.m23027d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                C1255f c1255f = f3977a;
                AbstractC5469l.m23027d(feature, "feature");
                interfaceC0894c = c1255f.m4801a(windowMetrics, feature);
            } else {
                interfaceC0894c = null;
            }
            if (interfaceC0894c != null) {
                arrayList.add(interfaceC0894c);
            }
        }
        return new C0901j(arrayList);
    }

    /* renamed from: c */
    public final C0901j m4803c(Context context, WindowLayoutInfo info) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(info, "info");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            return m4802b(C0907p.f3155b.m3765c(context), info);
        }
        if (i7 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return m4802b(C0907p.f3155b.m3764b((Activity) context), info);
    }

    /* renamed from: d */
    public final boolean m4804d(C0902k c0902k, C0618b c0618b) {
        Rect m3757a = c0902k.m3757a();
        if (c0618b.m2504e()) {
            return false;
        }
        if (c0618b.m2503d() != m3757a.width() && c0618b.m2500a() != m3757a.height()) {
            return false;
        }
        if (c0618b.m2503d() >= m3757a.width() || c0618b.m2500a() >= m3757a.height()) {
            return (c0618b.m2503d() == m3757a.width() && c0618b.m2500a() == m3757a.height()) ? false : true;
        }
        return false;
    }
}
