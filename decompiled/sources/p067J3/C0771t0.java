package p067J3;

import java.util.List;
import p088M3.C1170l;
import p088M3.C1178t;
import p095N3.AbstractC1266f;
import p095N3.C1264d;
import p095N3.C1272l;
import p095N3.C1273m;
import p095N3.C1275o;

/* renamed from: J3.t0 */
/* loaded from: classes.dex */
public class C0771t0 {

    /* renamed from: a */
    public final C1178t f2751a;

    /* renamed from: b */
    public final C1264d f2752b;

    /* renamed from: c */
    public final List f2753c;

    public C0771t0(C1178t c1178t, C1264d c1264d, List list) {
        this.f2751a = c1178t;
        this.f2752b = c1264d;
        this.f2753c = list;
    }

    /* renamed from: a */
    public AbstractC1266f m3308a(C1170l c1170l, C1273m c1273m) {
        C1264d c1264d = this.f2752b;
        return c1264d != null ? new C1272l(c1170l, this.f2751a, c1264d, c1273m, this.f2753c) : new C1275o(c1170l, this.f2751a, c1273m, this.f2753c);
    }
}
