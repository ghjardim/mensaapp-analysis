package p264j5;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p206c6.C3616d;
import p206c6.C3619g;
import p281l5.C5547i;
import p281l5.EnumC5539a;

/* renamed from: j5.j */
/* loaded from: classes2.dex */
public class C5381j {

    /* renamed from: a */
    public final Logger f19173a;

    /* renamed from: b */
    public final Level f19174b;

    /* renamed from: j5.j$a */
    public enum a {
        INBOUND,
        OUTBOUND
    }

    /* renamed from: j5.j$b */
    public enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* renamed from: a */
        public final int f19185a;

        b(int i7) {
            this.f19185a = i7;
        }

        /* renamed from: b */
        public int m22251b() {
            return this.f19185a;
        }
    }

    public C5381j(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    /* renamed from: l */
    public static String m22238l(C3616d c3616d) {
        if (c3616d.m14618c0() <= 64) {
            return c3616d.m14620d0().mo14542n();
        }
        return c3616d.m14621f0((int) Math.min(c3616d.m14618c0(), 64L)).mo14542n() + "...";
    }

    /* renamed from: m */
    public static String m22239m(C5547i c5547i) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (c5547i.m23260d(bVar.m22251b())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(c5547i.m23257a(bVar.m22251b())));
            }
        }
        return enumMap.toString();
    }

    /* renamed from: a */
    public final boolean m22240a() {
        return this.f19173a.isLoggable(this.f19174b);
    }

    /* renamed from: b */
    public void m22241b(a aVar, int i7, C3616d c3616d, int i8, boolean z6) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " DATA: streamId=" + i7 + " endStream=" + z6 + " length=" + i8 + " bytes=" + m22238l(c3616d));
        }
    }

    /* renamed from: c */
    public void m22242c(a aVar, int i7, EnumC5539a enumC5539a, C3619g c3619g) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " GO_AWAY: lastStreamId=" + i7 + " errorCode=" + enumC5539a + " length=" + c3619g.size() + " bytes=" + m22238l(new C3616d().m14625l0(c3619g)));
        }
    }

    /* renamed from: d */
    public void m22243d(a aVar, int i7, List list, boolean z6) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " HEADERS: streamId=" + i7 + " headers=" + list + " endStream=" + z6);
        }
    }

    /* renamed from: e */
    public void m22244e(a aVar, long j7) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " PING: ack=false bytes=" + j7);
        }
    }

    /* renamed from: f */
    public void m22245f(a aVar, long j7) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " PING: ack=true bytes=" + j7);
        }
    }

    /* renamed from: g */
    public void m22246g(a aVar, int i7, int i8, List list) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " PUSH_PROMISE: streamId=" + i7 + " promisedStreamId=" + i8 + " headers=" + list);
        }
    }

    /* renamed from: h */
    public void m22247h(a aVar, int i7, EnumC5539a enumC5539a) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " RST_STREAM: streamId=" + i7 + " errorCode=" + enumC5539a);
        }
    }

    /* renamed from: i */
    public void m22248i(a aVar, C5547i c5547i) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " SETTINGS: ack=false settings=" + m22239m(c5547i));
        }
    }

    /* renamed from: j */
    public void m22249j(a aVar) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " SETTINGS: ack=true");
        }
    }

    /* renamed from: k */
    public void m22250k(a aVar, int i7, long j7) {
        if (m22240a()) {
            this.f19173a.log(this.f19174b, aVar + " WINDOW_UPDATE: streamId=" + i7 + " windowSizeIncrement=" + j7);
        }
    }

    public C5381j(Level level, Logger logger) {
        this.f19174b = (Level) AbstractC2932o.m10573p(level, "level");
        this.f19173a = (Logger) AbstractC2932o.m10573p(logger, "logger");
    }
}
