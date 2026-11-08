package p256j$.time.chrono;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import p256j$.time.C4822c;
import p256j$.time.C4891l;
import p256j$.time.Instant;
import p256j$.time.ZoneId;
import p256j$.time.temporal.Temporal;
import p256j$.util.Objects;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4835a implements InterfaceC4848n {

    /* renamed from: a */
    private static final ConcurrentHashMap f17918a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ConcurrentHashMap f17919b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final /* synthetic */ int f17920c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return mo20984k().compareTo(((InterfaceC4848n) obj).mo20984k());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    /* renamed from: m */
    static InterfaceC4848n m21003m(AbstractC4835a abstractC4835a, String str) {
        String mo20985r;
        InterfaceC4848n interfaceC4848n = (InterfaceC4848n) f17918a.putIfAbsent(str, abstractC4835a);
        if (interfaceC4848n == null && (mo20985r = abstractC4835a.mo20985r()) != null) {
            f17919b.putIfAbsent(mo20985r, abstractC4835a);
        }
        return interfaceC4848n;
    }

    /* renamed from: l */
    static InterfaceC4848n m21002l(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f17918a;
            InterfaceC4848n interfaceC4848n = (InterfaceC4848n) concurrentHashMap.get(str);
            if (interfaceC4848n == null) {
                interfaceC4848n = (InterfaceC4848n) f17919b.get(str);
            }
            if (interfaceC4848n != null) {
                return interfaceC4848n;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(InterfaceC4848n.class).iterator();
                while (it.hasNext()) {
                    InterfaceC4848n interfaceC4848n2 = (InterfaceC4848n) it.next();
                    if (str.equals(interfaceC4848n2.mo20984k()) || str.equals(interfaceC4848n2.mo20985r())) {
                        return interfaceC4848n2;
                    }
                }
                throw new C4822c("Unknown chronology: " + str);
            }
            C4851q c4851q = C4851q.f17936o;
            m21003m(c4851q, c4851q.mo20984k());
            C4858x c4858x = C4858x.f17959d;
            m21003m(c4858x, c4858x.mo20984k());
            C4825C c4825c = C4825C.f17906d;
            m21003m(c4825c, c4825c.mo20984k());
            C4831I c4831i = C4831I.f17913d;
            m21003m(c4831i, c4831i.mo20984k());
            try {
                for (AbstractC4835a abstractC4835a : Arrays.asList(new AbstractC4835a[0])) {
                    if (!abstractC4835a.mo20984k().equals("ISO")) {
                        m21003m(abstractC4835a, abstractC4835a.mo20984k());
                    }
                }
                C4855u c4855u = C4855u.f17955d;
                m21003m(c4855u, c4855u.mo20984k());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    protected AbstractC4835a() {
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: x */
    public InterfaceC4839e mo21005x(Temporal temporal) {
        try {
            return mo20986y(temporal).mo20998u(C4891l.m21135K(temporal));
        } catch (C4822c e7) {
            throw new C4822c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.k] */
    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: v */
    public InterfaceC4845k mo21004v(Temporal temporal) {
        try {
            ZoneId m20956I = ZoneId.m20956I(temporal);
            try {
                temporal = mo20982D(Instant.m20917J(temporal), m20956I);
                return temporal;
            } catch (C4822c unused) {
                return C4847m.m21033I(m20956I, null, C4841g.m21009I(this, mo21005x(temporal)));
            }
        } catch (C4822c e7) {
            throw new C4822c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e7);
        }
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC4835a) && mo20984k().compareTo(((AbstractC4835a) obj).mo20984k()) == 0;
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    public final int hashCode() {
        return getClass().hashCode() ^ mo20984k().hashCode();
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    public final String toString() {
        return mo20984k();
    }
}
