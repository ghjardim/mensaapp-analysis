package p088M3;

import com.google.protobuf.C4078t0;
import p219e3.C4188r;
import p272k4.C5413D;
import p272k4.C5438u;

/* renamed from: M3.v */
/* loaded from: classes.dex */
public abstract class AbstractC1180v {
    /* renamed from: a */
    public static C4078t0 m4567a(C5413D c5413d) {
        return c5413d.m22459s0().m22739f0("__local_write_time__").m22462v0();
    }

    /* renamed from: b */
    public static C5413D m4568b(C5413D c5413d) {
        C5413D m22738e0 = c5413d.m22459s0().m22738e0("__previous_value__", null);
        return m4569c(m22738e0) ? m4568b(m22738e0) : m22738e0;
    }

    /* renamed from: c */
    public static boolean m4569c(C5413D c5413d) {
        C5413D m22738e0 = c5413d != null ? c5413d.m22459s0().m22738e0("__type__", null) : null;
        return m22738e0 != null && "server_timestamp".equals(m22738e0.m22461u0());
    }

    /* renamed from: d */
    public static C5413D m4570d(C4188r c4188r, C5413D c5413d) {
        C5413D c5413d2 = (C5413D) C5413D.m22443x0().m22474I("server_timestamp").m17059n();
        C5438u.b m22742y = C5438u.m22735j0().m22742y("__type__", c5413d2).m22742y("__local_write_time__", (C5413D) C5413D.m22443x0().m22475J(C4078t0.m16930f0().m16936x(c4188r.m17567h()).m16935w(c4188r.m17566f())).m17059n());
        if (m4569c(c5413d)) {
            c5413d = m4568b(c5413d);
        }
        if (c5413d != null) {
            m22742y.m22742y("__previous_value__", c5413d);
        }
        return (C5413D) C5413D.m22443x0().m22470E(m22742y).m17059n();
    }
}
