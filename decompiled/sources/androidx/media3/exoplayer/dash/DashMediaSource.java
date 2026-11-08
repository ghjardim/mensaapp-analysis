package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.C3372c;
import androidx.media3.exoplayer.dash.C3373d;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.InterfaceC3370a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p022D0.AbstractC0140a;
import p022D0.C0116B;
import p022D0.C0160k;
import p022D0.C0179y;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0158j;
import p050H0.AbstractC0537f;
import p050H0.C0542k;
import p050H0.C0545n;
import p050H0.C0547p;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p050H0.InterfaceC0546o;
import p057I0.AbstractC0616a;
import p171Y2.AbstractC2922e;
import p195b3.AbstractC3525e;
import p232g0.AbstractC4303I;
import p232g0.AbstractC4332v;
import p232g0.C4295A;
import p232g0.C4331u;
import p249i1.InterfaceC4529t;
import p256j$.util.DesugarTimeZone;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p319q0.C6163b;
import p319q0.C6164c;
import p319q0.InterfaceC6168g;
import p327r0.AbstractC6243j;
import p327r0.C6234a;
import p327r0.C6236c;
import p327r0.C6237d;
import p327r0.C6240g;
import p327r0.C6248o;
import p335s0.C6352l;
import p335s0.InterfaceC6321A;
import p335s0.InterfaceC6364x;
import p380y0.C7049b;

/* loaded from: classes.dex */
public final class DashMediaSource extends AbstractC0140a {

    /* renamed from: A */
    public final Object f10802A;

    /* renamed from: B */
    public final SparseArray f10803B;

    /* renamed from: C */
    public final Runnable f10804C;

    /* renamed from: D */
    public final Runnable f10805D;

    /* renamed from: E */
    public final C3373d.b f10806E;

    /* renamed from: F */
    public final InterfaceC0546o f10807F;

    /* renamed from: G */
    public InterfaceC5493g f10808G;

    /* renamed from: H */
    public C0545n f10809H;

    /* renamed from: I */
    public InterfaceC5511y f10810I;

    /* renamed from: J */
    public IOException f10811J;

    /* renamed from: K */
    public Handler f10812K;

    /* renamed from: L */
    public C4331u.g f10813L;

    /* renamed from: M */
    public Uri f10814M;

    /* renamed from: N */
    public Uri f10815N;

    /* renamed from: O */
    public C6236c f10816O;

    /* renamed from: P */
    public boolean f10817P;

    /* renamed from: Q */
    public long f10818Q;

    /* renamed from: R */
    public long f10819R;

    /* renamed from: S */
    public long f10820S;

    /* renamed from: T */
    public int f10821T;

    /* renamed from: U */
    public long f10822U;

    /* renamed from: V */
    public int f10823V;

    /* renamed from: W */
    public C4331u f10824W;

    /* renamed from: o */
    public final boolean f10825o;

    /* renamed from: p */
    public final InterfaceC5493g.a f10826p;

    /* renamed from: q */
    public final InterfaceC3370a.a f10827q;

    /* renamed from: r */
    public final InterfaceC0158j f10828r;

    /* renamed from: s */
    public final InterfaceC6364x f10829s;

    /* renamed from: t */
    public final InterfaceC0544m f10830t;

    /* renamed from: u */
    public final C6163b f10831u;

    /* renamed from: v */
    public final long f10832v;

    /* renamed from: w */
    public final long f10833w;

    /* renamed from: x */
    public final InterfaceC0127M.a f10834x;

    /* renamed from: y */
    public final C0547p.a f10835y;

    /* renamed from: z */
    public final C3366e f10836z;

    public static final class Factory implements InterfaceC0120F.a {

        /* renamed from: a */
        public final InterfaceC3370a.a f10837a;

        /* renamed from: b */
        public final InterfaceC5493g.a f10838b;

        /* renamed from: c */
        public InterfaceC6321A f10839c;

        /* renamed from: d */
        public InterfaceC0158j f10840d;

        /* renamed from: e */
        public InterfaceC0544m f10841e;

        /* renamed from: f */
        public long f10842f;

        /* renamed from: g */
        public long f10843g;

        /* renamed from: h */
        public C0547p.a f10844h;

        public Factory(InterfaceC5493g.a aVar) {
            this(new C3372c.a(aVar), aVar);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public DashMediaSource mo343e(C4331u c4331u) {
            AbstractC5332a.m21800e(c4331u.f15212b);
            C0547p.a aVar = this.f10844h;
            if (aVar == null) {
                aVar = new C6237d();
            }
            List list = c4331u.f15212b.f15307d;
            return new DashMediaSource(c4331u, null, this.f10838b, !list.isEmpty() ? new C7049b(aVar, list) : aVar, this.f10837a, this.f10840d, null, this.f10839c.mo26474a(c4331u), this.f10841e, this.f10842f, this.f10843g, null);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo340b(boolean z6) {
            this.f10837a.mo13055b(z6);
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo342d(InterfaceC6321A interfaceC6321A) {
            this.f10839c = (InterfaceC6321A) AbstractC5332a.m21801f(interfaceC6321A, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory mo341c(InterfaceC0544m interfaceC0544m) {
            this.f10841e = (InterfaceC0544m) AbstractC5332a.m21801f(interfaceC0544m, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory mo339a(InterfaceC4529t.a aVar) {
            this.f10837a.mo13054a((InterfaceC4529t.a) AbstractC5332a.m21800e(aVar));
            return this;
        }

        public Factory(InterfaceC3370a.a aVar, InterfaceC5493g.a aVar2) {
            this.f10837a = (InterfaceC3370a.a) AbstractC5332a.m21800e(aVar);
            this.f10838b = aVar2;
            this.f10839c = new C6352l();
            this.f10841e = new C0542k();
            this.f10842f = 30000L;
            this.f10843g = 5000000L;
            this.f10840d = new C0160k();
            mo340b(true);
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$a */
    public class C3362a implements AbstractC0616a.b {
        public C3362a() {
        }

        @Override // p057I0.AbstractC0616a.b
        /* renamed from: a */
        public void mo2497a(IOException iOException) {
            DashMediaSource.this.m13025a0(iOException);
        }

        @Override // p057I0.AbstractC0616a.b
        /* renamed from: b */
        public void mo2498b() {
            DashMediaSource.this.m13026b0(AbstractC0616a.m2489h());
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$b */
    public static final class C3363b extends AbstractC4303I {

        /* renamed from: e */
        public final long f10846e;

        /* renamed from: f */
        public final long f10847f;

        /* renamed from: g */
        public final long f10848g;

        /* renamed from: h */
        public final int f10849h;

        /* renamed from: i */
        public final long f10850i;

        /* renamed from: j */
        public final long f10851j;

        /* renamed from: k */
        public final long f10852k;

        /* renamed from: l */
        public final C6236c f10853l;

        /* renamed from: m */
        public final C4331u f10854m;

        /* renamed from: n */
        public final C4331u.g f10855n;

        public C3363b(long j7, long j8, long j9, int i7, long j10, long j11, long j12, C6236c c6236c, C4331u c4331u, C4331u.g gVar) {
            AbstractC5332a.m21802g(c6236c.f22291d == (gVar != null));
            this.f10846e = j7;
            this.f10847f = j8;
            this.f10848g = j9;
            this.f10849h = i7;
            this.f10850i = j10;
            this.f10851j = j11;
            this.f10852k = j12;
            this.f10853l = c6236c;
            this.f10854m = c4331u;
            this.f10855n = gVar;
        }

        /* renamed from: t */
        public static boolean m13039t(C6236c c6236c) {
            return c6236c.f22291d && c6236c.f22292e != -9223372036854775807L && c6236c.f22289b == -9223372036854775807L;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: b */
        public int mo302b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f10849h) >= 0 && intValue < mo307i()) {
                return intValue;
            }
            return -1;
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            AbstractC5332a.m21798c(i7, 0, mo307i());
            return bVar.m18052s(z6 ? this.f10853l.m26007d(i7).f22323a : null, z6 ? Integer.valueOf(this.f10849h + i7) : null, 0, this.f10853l.m26010g(i7), AbstractC5330M.m21692K0(this.f10853l.m26007d(i7).f22324b - this.f10853l.m26007d(0).f22324b) - this.f10850i);
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: i */
        public int mo307i() {
            return this.f10853l.m26008e();
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: m */
        public Object mo304m(int i7) {
            AbstractC5332a.m21798c(i7, 0, mo307i());
            return Integer.valueOf(this.f10849h + i7);
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            AbstractC5332a.m21798c(i7, 0, 1);
            long m13040s = m13040s(j7);
            Object obj = AbstractC4303I.c.f14822q;
            C4331u c4331u = this.f10854m;
            C6236c c6236c = this.f10853l;
            return cVar.m18060g(obj, c4331u, c6236c, this.f10846e, this.f10847f, this.f10848g, true, m13039t(c6236c), this.f10855n, m13040s, this.f10851j, 0, mo307i() - 1, this.f10850i);
        }

        @Override // p232g0.AbstractC4303I
        /* renamed from: p */
        public int mo308p() {
            return 1;
        }

        /* renamed from: s */
        public final long m13040s(long j7) {
            long j8 = this.f10852k;
            if (!m13039t(this.f10853l)) {
                return j8;
            }
            if (j7 > 0) {
                j8 += j7;
                if (j8 > this.f10851j) {
                    return -9223372036854775807L;
                }
            }
            long j9 = this.f10850i + j8;
            long m26010g = this.f10853l.m26010g(0);
            int i7 = 0;
            while (i7 < this.f10853l.m26008e() - 1 && j9 >= m26010g) {
                j9 -= m26010g;
                i7++;
                m26010g = this.f10853l.m26010g(i7);
            }
            C6240g m26007d = this.f10853l.m26007d(i7);
            int m26086a = m26007d.m26086a(2);
            if (m26086a == -1) {
                return j8;
            }
            InterfaceC6168g mo26092l = ((AbstractC6243j) ((C6234a) m26007d.f22325c.get(m26086a)).f22280c.get(0)).mo26092l();
            return (mo26092l == null || mo26092l.mo25742i(m26010g) == 0) ? j8 : (j8 + mo26092l.mo25736c(mo26092l.mo25739f(j9, m26010g))) - j9;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$c */
    public final class C3364c implements C3373d.b {
        public C3364c() {
        }

        @Override // androidx.media3.exoplayer.dash.C3373d.b
        /* renamed from: a */
        public void mo13041a() {
            DashMediaSource.this.m13019U();
        }

        @Override // androidx.media3.exoplayer.dash.C3373d.b
        /* renamed from: b */
        public void mo13042b(long j7) {
            DashMediaSource.this.m13018T(j7);
        }

        public /* synthetic */ C3364c(DashMediaSource dashMediaSource, C3362a c3362a) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$d */
    public static final class C3365d implements C0547p.a {

        /* renamed from: a */
        public static final Pattern f10857a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // p050H0.C0547p.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo175a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, AbstractC2922e.f9010c)).readLine();
            try {
                Matcher matcher = f10857a.matcher(readLine);
                if (!matcher.matches()) {
                    throw C4295A.m17945c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j7 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j7 * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e7) {
                throw C4295A.m17945c(null, e7);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$e */
    public final class C3366e implements C0545n.b {
        public C3366e() {
        }

        @Override // p050H0.C0545n.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo468k(C0547p c0547p, long j7, long j8, boolean z6) {
            DashMediaSource.this.m13020V(c0547p, j7, j8);
        }

        @Override // p050H0.C0545n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo473r(C0547p c0547p, long j7, long j8) {
            DashMediaSource.this.m13021W(c0547p, j7, j8);
        }

        @Override // p050H0.C0545n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0545n.c mo471m(C0547p c0547p, long j7, long j8, IOException iOException, int i7) {
            return DashMediaSource.this.m13022X(c0547p, j7, j8, iOException, i7);
        }

        public /* synthetic */ C3366e(DashMediaSource dashMediaSource, C3362a c3362a) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$f */
    public final class C3367f implements InterfaceC0546o {
        public C3367f() {
        }

        /* renamed from: a */
        public final void m13047a() {
            if (DashMediaSource.this.f10811J != null) {
                throw DashMediaSource.this.f10811J;
            }
        }

        @Override // p050H0.InterfaceC0546o
        /* renamed from: c */
        public void mo2097c() {
            DashMediaSource.this.f10809H.mo2097c();
            m13047a();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$g */
    public final class C3368g implements C0545n.b {
        public C3368g() {
        }

        @Override // p050H0.C0545n.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo468k(C0547p c0547p, long j7, long j8, boolean z6) {
            DashMediaSource.this.m13020V(c0547p, j7, j8);
        }

        @Override // p050H0.C0545n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo473r(C0547p c0547p, long j7, long j8) {
            DashMediaSource.this.m13023Y(c0547p, j7, j8);
        }

        @Override // p050H0.C0545n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0545n.c mo471m(C0547p c0547p, long j7, long j8, IOException iOException, int i7) {
            return DashMediaSource.this.m13024Z(c0547p, j7, j8, iOException);
        }

        public /* synthetic */ C3368g(DashMediaSource dashMediaSource, C3362a c3362a) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$h */
    public static final class C3369h implements C0547p.a {
        public C3369h() {
        }

        @Override // p050H0.C0547p.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo175a(Uri uri, InputStream inputStream) {
            return Long.valueOf(AbstractC5330M.m21706R0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public /* synthetic */ C3369h(C3362a c3362a) {
            this();
        }
    }

    static {
        AbstractC4332v.m18323a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(C4331u c4331u, C6236c c6236c, InterfaceC5493g.a aVar, C0547p.a aVar2, InterfaceC3370a.a aVar3, InterfaceC0158j interfaceC0158j, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC0544m interfaceC0544m, long j7, long j8, C3362a c3362a) {
        this(c4331u, c6236c, aVar, aVar2, aVar3, interfaceC0158j, abstractC0537f, interfaceC6364x, interfaceC0544m, j7, j8);
    }

    /* renamed from: L */
    public static long m13009L(C6240g c6240g, long j7, long j8) {
        long m21692K0 = AbstractC5330M.m21692K0(c6240g.f22324b);
        boolean m13012P = m13012P(c6240g);
        long j9 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < c6240g.f22325c.size(); i7++) {
            C6234a c6234a = (C6234a) c6240g.f22325c.get(i7);
            List list = c6234a.f22280c;
            int i8 = c6234a.f22279b;
            boolean z6 = (i8 == 1 || i8 == 2) ? false : true;
            if ((!m13012P || !z6) && !list.isEmpty()) {
                InterfaceC6168g mo26092l = ((AbstractC6243j) list.get(0)).mo26092l();
                if (mo26092l == null) {
                    return m21692K0 + j7;
                }
                long mo25743j = mo26092l.mo25743j(j7, j8);
                if (mo25743j == 0) {
                    return m21692K0;
                }
                long mo25735b = (mo26092l.mo25735b(j7, j8) + mo25743j) - 1;
                j9 = Math.min(j9, mo26092l.mo25734a(mo25735b, j7) + mo26092l.mo25736c(mo25735b) + m21692K0);
            }
        }
        return j9;
    }

    /* renamed from: M */
    public static long m13010M(C6240g c6240g, long j7, long j8) {
        long m21692K0 = AbstractC5330M.m21692K0(c6240g.f22324b);
        boolean m13012P = m13012P(c6240g);
        long j9 = m21692K0;
        for (int i7 = 0; i7 < c6240g.f22325c.size(); i7++) {
            C6234a c6234a = (C6234a) c6240g.f22325c.get(i7);
            List list = c6234a.f22280c;
            int i8 = c6234a.f22279b;
            boolean z6 = (i8 == 1 || i8 == 2) ? false : true;
            if ((!m13012P || !z6) && !list.isEmpty()) {
                InterfaceC6168g mo26092l = ((AbstractC6243j) list.get(0)).mo26092l();
                if (mo26092l == null) {
                    return m21692K0;
                }
                if (mo26092l.mo25743j(j7, j8) == 0) {
                    return m21692K0;
                }
                j9 = Math.max(j9, mo26092l.mo25736c(mo26092l.mo25735b(j7, j8)) + m21692K0);
            }
        }
        return j9;
    }

    /* renamed from: N */
    public static long m13011N(C6236c c6236c, long j7) {
        InterfaceC6168g mo26092l;
        int m26008e = c6236c.m26008e() - 1;
        C6240g m26007d = c6236c.m26007d(m26008e);
        long m21692K0 = AbstractC5330M.m21692K0(m26007d.f22324b);
        long m26010g = c6236c.m26010g(m26008e);
        long m21692K02 = AbstractC5330M.m21692K0(j7);
        long m21692K03 = AbstractC5330M.m21692K0(c6236c.f22288a);
        long m21692K04 = AbstractC5330M.m21692K0(5000L);
        for (int i7 = 0; i7 < m26007d.f22325c.size(); i7++) {
            List list = ((C6234a) m26007d.f22325c.get(i7)).f22280c;
            if (!list.isEmpty() && (mo26092l = ((AbstractC6243j) list.get(0)).mo26092l()) != null) {
                long mo25737d = ((m21692K03 + m21692K0) + mo26092l.mo25737d(m26010g, m21692K02)) - m21692K02;
                if (mo25737d < m21692K04 - PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH || (mo25737d > m21692K04 && mo25737d < m21692K04 + PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH)) {
                    m21692K04 = mo25737d;
                }
            }
        }
        return AbstractC3525e.m14166b(m21692K04, 1000L, RoundingMode.CEILING);
    }

    /* renamed from: P */
    public static boolean m13012P(C6240g c6240g) {
        for (int i7 = 0; i7 < c6240g.f22325c.size(); i7++) {
            int i8 = ((C6234a) c6240g.f22325c.get(i7)).f22279b;
            if (i8 == 1 || i8 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m13013Q(C6240g c6240g) {
        for (int i7 = 0; i7 < c6240g.f22325c.size(); i7++) {
            InterfaceC6168g mo26092l = ((AbstractC6243j) ((C6234a) c6240g.f22325c.get(i7)).f22280c.get(0)).mo26092l();
            if (mo26092l == null || mo26092l.mo25740g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m13014R() {
        m13027c0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m13015i0() {
        Uri uri;
        this.f10812K.removeCallbacks(this.f10804C);
        if (this.f10809H.m2100i()) {
            return;
        }
        if (this.f10809H.m2101j()) {
            this.f10817P = true;
            return;
        }
        synchronized (this.f10802A) {
            uri = this.f10814M;
        }
        this.f10817P = false;
        m13032h0(new C0547p(this.f10808G, uri, 4, this.f10835y), this.f10836z, this.f10830t.mo2088d(4));
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        this.f10810I = interfaceC5511y;
        this.f10829s.mo26607c(Looper.myLooper(), m520A());
        this.f10829s.mo26609f();
        if (this.f10825o) {
            m13027c0(false);
            return;
        }
        this.f10808G = this.f10826p.mo23075a();
        this.f10809H = new C0545n("DashMediaSource");
        this.f10812K = AbstractC5330M.m21671A();
        m13015i0();
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        this.f10817P = false;
        this.f10808G = null;
        C0545n c0545n = this.f10809H;
        if (c0545n != null) {
            c0545n.m2103l();
            this.f10809H = null;
        }
        this.f10818Q = 0L;
        this.f10819R = 0L;
        this.f10814M = this.f10815N;
        this.f10811J = null;
        Handler handler = this.f10812K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f10812K = null;
        }
        this.f10820S = -9223372036854775807L;
        this.f10821T = 0;
        this.f10822U = -9223372036854775807L;
        this.f10803B.clear();
        this.f10831u.m25731i();
        this.f10829s.release();
    }

    /* renamed from: O */
    public final long m13016O() {
        return Math.min((this.f10821T - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
    }

    /* renamed from: S */
    public final void m13017S() {
        AbstractC0616a.m2491j(this.f10809H, new C3362a());
    }

    /* renamed from: T */
    public void m13018T(long j7) {
        long j8 = this.f10822U;
        if (j8 == -9223372036854775807L || j8 < j7) {
            this.f10822U = j7;
        }
    }

    /* renamed from: U */
    public void m13019U() {
        this.f10812K.removeCallbacks(this.f10805D);
        m13015i0();
    }

    /* renamed from: V */
    public void m13020V(C0547p c0547p, long j7, long j8) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        this.f10830t.mo2086b(c0547p.f1805a);
        this.f10834x.m373p(c0179y, c0547p.f1807c);
    }

    /* renamed from: W */
    public void m13021W(C0547p c0547p, long j7, long j8) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        this.f10830t.mo2086b(c0547p.f1805a);
        this.f10834x.m376s(c0179y, c0547p.f1807c);
        C6236c c6236c = (C6236c) c0547p.m2117e();
        C6236c c6236c2 = this.f10816O;
        int m26008e = c6236c2 == null ? 0 : c6236c2.m26008e();
        long j9 = c6236c.m26007d(0).f22324b;
        int i7 = 0;
        while (i7 < m26008e && this.f10816O.m26007d(i7).f22324b < j9) {
            i7++;
        }
        if (c6236c.f22291d) {
            if (m26008e - i7 > c6236c.m26008e()) {
                AbstractC5346o.m21867h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j10 = this.f10822U;
                if (j10 == -9223372036854775807L || c6236c.f22295h * 1000 > j10) {
                    this.f10821T = 0;
                } else {
                    AbstractC5346o.m21867h("DashMediaSource", "Loaded stale dynamic manifest: " + c6236c.f22295h + ", " + this.f10822U);
                }
            }
            int i8 = this.f10821T;
            this.f10821T = i8 + 1;
            if (i8 < this.f10830t.mo2088d(c0547p.f1807c)) {
                m13031g0(m13016O());
                return;
            } else {
                this.f10811J = new C6164c();
                return;
            }
        }
        this.f10816O = c6236c;
        this.f10817P = c6236c.f22291d & this.f10817P;
        this.f10818Q = j7 - j8;
        this.f10819R = j7;
        this.f10823V += i7;
        synchronized (this.f10802A) {
            try {
                if (c0547p.f1806b.f19781a == this.f10814M) {
                    Uri uri = this.f10816O.f22298k;
                    if (uri == null) {
                        uri = c0547p.m2118f();
                    }
                    this.f10814M = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6236c c6236c3 = this.f10816O;
        if (!c6236c3.f22291d || this.f10820S != -9223372036854775807L) {
            m13027c0(true);
            return;
        }
        C6248o c6248o = c6236c3.f22296i;
        if (c6248o != null) {
            m13028d0(c6248o);
        } else {
            m13017S();
        }
    }

    /* renamed from: X */
    public C0545n.c m13022X(C0547p c0547p, long j7, long j8, IOException iOException, int i7) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        long mo2087c = this.f10830t.mo2087c(new InterfaceC0544m.c(c0179y, new C0116B(c0547p.f1807c), iOException, i7));
        C0545n.c m2096h = mo2087c == -9223372036854775807L ? C0545n.f1788g : C0545n.m2096h(false, mo2087c);
        boolean m2108c = m2096h.m2108c();
        this.f10834x.m380w(c0179y, c0547p.f1807c, iOException, !m2108c);
        if (!m2108c) {
            this.f10830t.mo2086b(c0547p.f1805a);
        }
        return m2096h;
    }

    /* renamed from: Y */
    public void m13023Y(C0547p c0547p, long j7, long j8) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        this.f10830t.mo2086b(c0547p.f1805a);
        this.f10834x.m376s(c0179y, c0547p.f1807c);
        m13026b0(((Long) c0547p.m2117e()).longValue() - j7);
    }

    /* renamed from: Z */
    public C0545n.c m13024Z(C0547p c0547p, long j7, long j8, IOException iOException) {
        this.f10834x.m380w(new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a()), c0547p.f1807c, iOException, true);
        this.f10830t.mo2086b(c0547p.f1805a);
        m13025a0(iOException);
        return C0545n.f1787f;
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public synchronized void mo294a(C4331u c4331u) {
        this.f10824W = c4331u;
    }

    /* renamed from: a0 */
    public final void m13025a0(IOException iOException) {
        AbstractC5346o.m21863d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f10820S = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        m13027c0(true);
    }

    /* renamed from: b0 */
    public final void m13026b0(long j7) {
        this.f10820S = j7;
        m13027c0(true);
    }

    /* renamed from: c0 */
    public final void m13027c0(boolean z6) {
        C6240g c6240g;
        long j7;
        long j8;
        for (int i7 = 0; i7 < this.f10803B.size(); i7++) {
            int keyAt = this.f10803B.keyAt(i7);
            if (keyAt >= this.f10823V) {
                ((C3371b) this.f10803B.valueAt(i7)).m13080P(this.f10816O, keyAt - this.f10823V);
            }
        }
        C6240g m26007d = this.f10816O.m26007d(0);
        int m26008e = this.f10816O.m26008e() - 1;
        C6240g m26007d2 = this.f10816O.m26007d(m26008e);
        long m26010g = this.f10816O.m26010g(m26008e);
        long m21692K0 = AbstractC5330M.m21692K0(AbstractC5330M.m21739f0(this.f10820S));
        long m13010M = m13010M(m26007d, this.f10816O.m26010g(0), m21692K0);
        long m13009L = m13009L(m26007d2, m26010g, m21692K0);
        boolean z7 = this.f10816O.f22291d && !m13013Q(m26007d2);
        if (z7) {
            long j9 = this.f10816O.f22293f;
            if (j9 != -9223372036854775807L) {
                m13010M = Math.max(m13010M, m13009L - AbstractC5330M.m21692K0(j9));
            }
        }
        long j10 = m13009L - m13010M;
        C6236c c6236c = this.f10816O;
        if (c6236c.f22291d) {
            AbstractC5332a.m21802g(c6236c.f22288a != -9223372036854775807L);
            long m21692K02 = (m21692K0 - AbstractC5330M.m21692K0(this.f10816O.f22288a)) - m13010M;
            m13033j0(m21692K02, j10);
            long m21758l1 = this.f10816O.f22288a + AbstractC5330M.m21758l1(m13010M);
            long m21692K03 = m21692K02 - AbstractC5330M.m21692K0(this.f10813L.f15286a);
            long min = Math.min(this.f10833w, j10 / 2);
            j7 = m21758l1;
            j8 = m21692K03 < min ? min : m21692K03;
            c6240g = m26007d;
        } else {
            c6240g = m26007d;
            j7 = -9223372036854775807L;
            j8 = 0;
        }
        long m21692K04 = m13010M - AbstractC5330M.m21692K0(c6240g.f22324b);
        C6236c c6236c2 = this.f10816O;
        m522D(new C3363b(c6236c2.f22288a, j7, this.f10820S, this.f10823V, m21692K04, j10, j8, c6236c2, mo331i(), this.f10816O.f22291d ? this.f10813L : null));
        if (this.f10825o) {
            return;
        }
        this.f10812K.removeCallbacks(this.f10805D);
        if (z7) {
            this.f10812K.postDelayed(this.f10805D, m13011N(this.f10816O, AbstractC5330M.m21739f0(this.f10820S)));
        }
        if (this.f10817P) {
            m13015i0();
            return;
        }
        if (z6) {
            C6236c c6236c3 = this.f10816O;
            if (c6236c3.f22291d) {
                long j11 = c6236c3.f22292e;
                if (j11 != -9223372036854775807L) {
                    if (j11 == 0) {
                        j11 = 5000;
                    }
                    m13031g0(Math.max(0L, (this.f10818Q + j11) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* renamed from: d0 */
    public final void m13028d0(C6248o c6248o) {
        String str = c6248o.f22377a;
        if (AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:direct:2014") || AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:direct:2012")) {
            m13029e0(c6248o);
            return;
        }
        if (AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:http-iso:2014") || AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            m13030f0(c6248o, new C3365d());
            return;
        }
        if (AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m13030f0(c6248o, new C3369h(null));
        } else if (AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:ntp:2014") || AbstractC5330M.m21729c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m13017S();
        } else {
            m13025a0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        int intValue = ((Integer) bVar.f367a).intValue() - this.f10823V;
        InterfaceC0127M.a m526x = m526x(bVar);
        C3371b c3371b = new C3371b(intValue + this.f10823V, this.f10816O, this.f10831u, intValue, this.f10827q, this.f10810I, null, this.f10829s, m524v(bVar), this.f10830t, m526x, this.f10820S, this.f10807F, interfaceC0533b, this.f10828r, this.f10806E, m520A());
        this.f10803B.put(c3371b.f10868a, c3371b);
        return c3371b;
    }

    /* renamed from: e0 */
    public final void m13029e0(C6248o c6248o) {
        try {
            m13026b0(AbstractC5330M.m21706R0(c6248o.f22378b) - this.f10819R);
        } catch (C4295A e7) {
            m13025a0(e7);
        }
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        C3371b c3371b = (C3371b) interfaceC0117C;
        c3371b.m13076L();
        this.f10803B.remove(c3371b.f10868a);
    }

    /* renamed from: f0 */
    public final void m13030f0(C6248o c6248o, C0547p.a aVar) {
        m13032h0(new C0547p(this.f10808G, Uri.parse(c6248o.f22378b), 5, aVar), new C3368g(this, null), 1);
    }

    /* renamed from: g0 */
    public final void m13031g0(long j7) {
        this.f10812K.postDelayed(this.f10804C, j7);
    }

    /* renamed from: h0 */
    public final void m13032h0(C0547p c0547p, C0545n.b bVar, int i7) {
        this.f10834x.m382y(new C0179y(c0547p.f1805a, c0547p.f1806b, this.f10809H.m2105n(c0547p, bVar, i7)), c0547p.f1807c);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public synchronized C4331u mo331i() {
        return this.f10824W;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13033j0(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.m13033j0(long, long):void");
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
        this.f10807F.mo2097c();
    }

    public DashMediaSource(C4331u c4331u, C6236c c6236c, InterfaceC5493g.a aVar, C0547p.a aVar2, InterfaceC3370a.a aVar3, InterfaceC0158j interfaceC0158j, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC0544m interfaceC0544m, long j7, long j8) {
        this.f10824W = c4331u;
        this.f10813L = c4331u.f15214d;
        this.f10814M = ((C4331u.h) AbstractC5332a.m21800e(c4331u.f15212b)).f15304a;
        this.f10815N = c4331u.f15212b.f15304a;
        this.f10816O = c6236c;
        this.f10826p = aVar;
        this.f10835y = aVar2;
        this.f10827q = aVar3;
        this.f10829s = interfaceC6364x;
        this.f10830t = interfaceC0544m;
        this.f10832v = j7;
        this.f10833w = j8;
        this.f10828r = interfaceC0158j;
        this.f10831u = new C6163b();
        boolean z6 = c6236c != null;
        this.f10825o = z6;
        C3362a c3362a = null;
        this.f10834x = m526x(null);
        this.f10802A = new Object();
        this.f10803B = new SparseArray();
        this.f10806E = new C3364c(this, c3362a);
        this.f10822U = -9223372036854775807L;
        this.f10820S = -9223372036854775807L;
        if (!z6) {
            this.f10836z = new C3366e(this, c3362a);
            this.f10807F = new C3367f();
            this.f10804C = new Runnable() { // from class: q0.e
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.m13015i0();
                }
            };
            this.f10805D = new Runnable() { // from class: q0.f
                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.m13014R();
                }
            };
            return;
        }
        AbstractC5332a.m21802g(true ^ c6236c.f22291d);
        this.f10836z = null;
        this.f10804C = null;
        this.f10805D = null;
        this.f10807F = new InterfaceC0546o.a();
    }
}
