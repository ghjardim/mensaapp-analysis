package p078L0;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.XMLReaderUtils;
import p085M0.C1144b;
import p092N0.C1243b;
import p099O0.C1291a;
import p106P0.C1423a;
import p113Q0.C2009d;
import p120R0.C2223c;
import p127S0.C2305a;
import p134T0.C2428a;
import p178Z2.AbstractC3033v;
import p209d1.C4105e;
import p217e1.C4157f;
import p225f1.C4233h;
import p225f1.C4238m;
import p232g0.AbstractC4325o;
import p233g1.C4340d;
import p241h1.C4482a;
import p249i1.C4517h;
import p249i1.C4530u;
import p249i1.InterfaceC4529t;
import p259j0.C5322E;
import p272k4.C5410A;
import p272k4.C5413D;
import p328r1.C6251C;
import p328r1.C6258J;
import p328r1.C6263b;
import p328r1.C6266e;
import p328r1.C6269h;
import p328r1.C6271j;
import p336s1.C6368b;
import p344t1.C6430a;

/* renamed from: L0.m */
/* loaded from: classes.dex */
public final class C0878m implements InterfaceC0889x {

    /* renamed from: r */
    public static final int[] f3063r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s */
    public static final a f3064s = new a(new a.InterfaceC7173a() { // from class: L0.k
        @Override // p078L0.C0878m.a.InterfaceC7173a
        /* renamed from: a */
        public final Constructor mo3662a() {
            Constructor m3665i;
            m3665i = C0878m.m3665i();
            return m3665i;
        }
    });

    /* renamed from: t */
    public static final a f3065t = new a(new a.InterfaceC7173a() { // from class: L0.l
        @Override // p078L0.C0878m.a.InterfaceC7173a
        /* renamed from: a */
        public final Constructor mo3662a() {
            Constructor m3666j;
            m3666j = C0878m.m3666j();
            return m3666j;
        }
    });

    /* renamed from: b */
    public boolean f3066b;

    /* renamed from: c */
    public boolean f3067c;

    /* renamed from: d */
    public int f3068d;

    /* renamed from: e */
    public int f3069e;

    /* renamed from: f */
    public int f3070f;

    /* renamed from: g */
    public int f3071g;

    /* renamed from: h */
    public int f3072h;

    /* renamed from: i */
    public int f3073i;

    /* renamed from: j */
    public int f3074j;

    /* renamed from: l */
    public int f3076l;

    /* renamed from: m */
    public AbstractC3033v f3077m;

    /* renamed from: q */
    public int f3081q;

    /* renamed from: k */
    public int f3075k = 1;

    /* renamed from: n */
    public int f3078n = 112800;

    /* renamed from: p */
    public InterfaceC4529t.a f3080p = new C4517h();

    /* renamed from: o */
    public boolean f3079o = true;

    /* renamed from: L0.m$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC7173a f3082a;

        /* renamed from: b */
        public final AtomicBoolean f3083b = new AtomicBoolean(false);

        /* renamed from: c */
        public Constructor f3084c;

        /* renamed from: L0.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC7173a {
            /* renamed from: a */
            Constructor mo3662a();
        }

        public a(InterfaceC7173a interfaceC7173a) {
            this.f3082a = interfaceC7173a;
        }

        /* renamed from: a */
        public InterfaceC0883r m3671a(Object... objArr) {
            Constructor m3672b = m3672b();
            if (m3672b == null) {
                return null;
            }
            try {
                return (InterfaceC0883r) m3672b.newInstance(objArr);
            } catch (Exception e7) {
                throw new IllegalStateException("Unexpected error creating extractor", e7);
            }
        }

        /* renamed from: b */
        public final Constructor m3672b() {
            synchronized (this.f3083b) {
                if (this.f3083b.get()) {
                    return this.f3084c;
                }
                try {
                    return this.f3082a.mo3662a();
                } catch (ClassNotFoundException unused) {
                    this.f3083b.set(true);
                    return this.f3084c;
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
        }
    }

    /* renamed from: i */
    public static Constructor m3665i() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC0883r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* renamed from: j */
    public static Constructor m3666j() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC0883r.class).getConstructor(null);
    }

    @Override // p078L0.InterfaceC0889x
    /* renamed from: b */
    public synchronized InterfaceC0883r[] mo648b() {
        return mo650d(Uri.EMPTY, new HashMap());
    }

    @Override // p078L0.InterfaceC0889x
    /* renamed from: d */
    public synchronized InterfaceC0883r[] mo650d(Uri uri, Map map) {
        InterfaceC0883r[] interfaceC0883rArr;
        try {
            int[] iArr = f3063r;
            ArrayList arrayList = new ArrayList(iArr.length);
            int m18180b = AbstractC4325o.m18180b(map);
            if (m18180b != -1) {
                m3667g(m18180b, arrayList);
            }
            int m18181c = AbstractC4325o.m18181c(uri);
            if (m18181c != -1 && m18181c != m18180b) {
                m3667g(m18181c, arrayList);
            }
            for (int i7 : iArr) {
                if (i7 != m18180b && i7 != m18181c) {
                    m3667g(i7, arrayList);
                }
            }
            interfaceC0883rArr = new InterfaceC0883r[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                InterfaceC0883r interfaceC0883r = (InterfaceC0883r) arrayList.get(i8);
                if (this.f3079o && !(interfaceC0883r.mo697d() instanceof C4233h) && !(interfaceC0883r.mo697d() instanceof C4238m) && !(interfaceC0883r.mo697d() instanceof C6258J) && !(interfaceC0883r.mo697d() instanceof C1243b) && !(interfaceC0883r.mo697d() instanceof C4105e)) {
                    interfaceC0883r = new C4530u(interfaceC0883r, this.f3080p);
                }
                interfaceC0883rArr[i8] = interfaceC0883r;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0883rArr;
    }

    /* renamed from: g */
    public final void m3667g(int i7, List list) {
        switch (i7) {
            case 0:
                list.add(new C6263b());
                break;
            case 1:
                list.add(new C6266e());
                break;
            case 2:
                list.add(new C6269h(this.f3068d | (this.f3066b ? 1 : 0) | (this.f3067c ? 2 : 0)));
                break;
            case 3:
                list.add(new C1144b(this.f3069e | (this.f3066b ? 1 : 0) | (this.f3067c ? 2 : 0)));
                break;
            case 4:
                InterfaceC0883r m3671a = f3064s.m3671a(Integer.valueOf(this.f3070f));
                if (m3671a == null) {
                    list.add(new C2009d(this.f3070f));
                    break;
                } else {
                    list.add(m3671a);
                    break;
                }
            case 5:
                list.add(new C2223c());
                break;
            case 6:
                list.add(new C4105e(this.f3080p, (this.f3079o ? 0 : 2) | this.f3071g));
                break;
            case 7:
                list.add(new C4157f(this.f3074j | (this.f3066b ? 1 : 0) | (this.f3067c ? 2 : 0)));
                break;
            case 8:
                list.add(new C4233h(this.f3080p, this.f3073i | (this.f3079o ? 0 : 32)));
                list.add(new C4238m(this.f3080p, this.f3072h | (this.f3079o ? 0 : 16)));
                break;
            case 9:
                list.add(new C4340d());
                break;
            case 10:
                list.add(new C6251C());
                break;
            case 11:
                if (this.f3077m == null) {
                    this.f3077m = AbstractC3033v.m11050t();
                }
                list.add(new C6258J(this.f3075k, !this.f3079o ? 1 : 0, this.f3080p, new C5322E(0L), new C6271j(this.f3076l, this.f3077m), this.f3078n));
                break;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                list.add(new C6368b());
                break;
            case 14:
                list.add(new C2428a(this.f3081q));
                break;
            case 15:
                InterfaceC0883r m3671a2 = f3065t.m3671a(new Object[0]);
                if (m3671a2 != null) {
                    list.add(m3671a2);
                    break;
                }
                break;
            case 16:
                list.add(new C1243b(1 ^ (this.f3079o ? 1 : 0), this.f3080p));
                break;
            case 17:
                list.add(new C4482a());
                break;
            case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                list.add(new C6430a());
                break;
            case 19:
                list.add(new C1423a());
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int i8 = this.f3072h;
                if ((i8 & 2) == 0 && (i8 & 4) == 0) {
                    list.add(new C2305a());
                    break;
                }
                break;
            case 21:
                list.add(new C1291a());
                break;
        }
    }

    @Override // p078L0.InterfaceC0889x
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public synchronized C0878m mo649c(boolean z6) {
        this.f3079o = z6;
        return this;
    }

    /* renamed from: k */
    public synchronized C0878m m3669k(int i7) {
        this.f3081q = i7;
        return this;
    }

    @Override // p078L0.InterfaceC0889x
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public synchronized C0878m mo647a(InterfaceC4529t.a aVar) {
        this.f3080p = aVar;
        return this;
    }
}
