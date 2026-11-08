package p343t0;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p178Z2.AbstractC3033v;
import p203c3.AbstractC3577g;
import p217e1.C4157f;
import p225f1.C4233h;
import p232g0.AbstractC4325o;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p232g0.C4334x;
import p249i1.C4517h;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p300o0.C5912w1;
import p328r1.C6258J;
import p328r1.C6263b;
import p328r1.C6266e;
import p328r1.C6269h;
import p328r1.C6271j;

/* renamed from: t0.d */
/* loaded from: classes.dex */
public final class C6410d implements InterfaceC6414h {

    /* renamed from: f */
    public static final int[] f23141f = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    public final int f23142b;

    /* renamed from: c */
    public InterfaceC4529t.a f23143c;

    /* renamed from: d */
    public boolean f23144d;

    /* renamed from: e */
    public final boolean f23145e;

    public C6410d() {
        this(0, true);
    }

    /* renamed from: e */
    public static void m26765e(int i7, List list) {
        if (AbstractC3577g.m14427j(f23141f, i7) == -1 || list.contains(Integer.valueOf(i7))) {
            return;
        }
        list.add(Integer.valueOf(i7));
    }

    /* renamed from: h */
    public static C4233h m26766h(InterfaceC4529t.a aVar, boolean z6, C5322E c5322e, C4327q c4327q, List list) {
        int i7 = m26768k(c4327q) ? 4 : 0;
        if (!z6) {
            aVar = InterfaceC4529t.a.f16172a;
            i7 |= 32;
        }
        InterfaceC4529t.a aVar2 = aVar;
        int i8 = i7;
        if (list == null) {
            list = AbstractC3033v.m11050t();
        }
        return new C4233h(aVar2, i8, c5322e, null, list, null);
    }

    /* renamed from: i */
    public static C6258J m26767i(int i7, boolean z6, C4327q c4327q, List list, C5322E c5322e, InterfaceC4529t.a aVar, boolean z7) {
        int i8;
        int i9 = i7 | 16;
        if (list != null) {
            i9 = i7 | 48;
        } else {
            list = z6 ? Collections.singletonList(new C4327q.b().m18264o0("application/cea-608").m18234K()) : Collections.emptyList();
        }
        String str = c4327q.f15134j;
        if (!TextUtils.isEmpty(str)) {
            if (!AbstractC4336z.m18409b(str, "audio/mp4a-latm")) {
                i9 |= 2;
            }
            if (!AbstractC4336z.m18409b(str, "video/avc")) {
                i9 |= 4;
            }
        }
        if (z7) {
            i8 = 0;
        } else {
            aVar = InterfaceC4529t.a.f16172a;
            i8 = 1;
        }
        return new C6258J(2, i8, aVar, c5322e, new C6271j(i9, list), 112800);
    }

    /* renamed from: k */
    public static boolean m26768k(C4327q c4327q) {
        C4334x c4334x = c4327q.f15135k;
        if (c4334x == null) {
            return false;
        }
        for (int i7 = 0; i7 < c4334x.m18402e(); i7++) {
            if (c4334x.m18401d(i7) instanceof C6426t) {
                return !((C6426t) r2).f23313c.isEmpty();
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m26769m(InterfaceC0883r interfaceC0883r, InterfaceC0884s interfaceC0884s) {
        try {
            boolean mo700i = interfaceC0883r.mo700i(interfaceC0884s);
            interfaceC0884s.mo3518p();
            return mo700i;
        } catch (EOFException unused) {
            interfaceC0884s.mo3518p();
            return false;
        } catch (Throwable th) {
            interfaceC0884s.mo3518p();
            throw th;
        }
    }

    @Override // p343t0.InterfaceC6414h
    /* renamed from: c */
    public C4327q mo26772c(C4327q c4327q) {
        String str;
        if (!this.f23144d || !this.f23143c.mo19226a(c4327q)) {
            return c4327q;
        }
        C4327q.b m18242S = c4327q.m18193a().m18264o0("application/x-media3-cues").m18242S(this.f23143c.mo19228c(c4327q));
        StringBuilder sb = new StringBuilder();
        sb.append(c4327q.f15138n);
        if (c4327q.f15134j != null) {
            str = StringUtils.SPACE + c4327q.f15134j;
        } else {
            str = StringUtils.EMPTY;
        }
        sb.append(str);
        return m18242S.m18238O(sb.toString()).m18268s0(Long.MAX_VALUE).m18234K();
    }

    @Override // p343t0.InterfaceC6414h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6408b mo26773d(Uri uri, C4327q c4327q, List list, C5322E c5322e, Map map, InterfaceC0884s interfaceC0884s, C5912w1 c5912w1) {
        int m18179a = AbstractC4325o.m18179a(c4327q.f15138n);
        int m18180b = AbstractC4325o.m18180b(map);
        int m18181c = AbstractC4325o.m18181c(uri);
        int[] iArr = f23141f;
        ArrayList arrayList = new ArrayList(iArr.length);
        m26765e(m18179a, arrayList);
        m26765e(m18180b, arrayList);
        m26765e(m18181c, arrayList);
        for (int i7 : iArr) {
            m26765e(i7, arrayList);
        }
        interfaceC0884s.mo3518p();
        InterfaceC0883r interfaceC0883r = null;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            int intValue = ((Integer) arrayList.get(i8)).intValue();
            InterfaceC0883r interfaceC0883r2 = (InterfaceC0883r) AbstractC5332a.m21800e(m26775g(intValue, c4327q, list, c5322e));
            if (m26769m(interfaceC0883r2, interfaceC0884s)) {
                return new C6408b(interfaceC0883r2, c4327q, c5322e, this.f23143c, this.f23144d);
            }
            if (interfaceC0883r == null && (intValue == m18179a || intValue == m18180b || intValue == m18181c || intValue == 11)) {
                interfaceC0883r = interfaceC0883r2;
            }
        }
        return new C6408b((InterfaceC0883r) AbstractC5332a.m21800e(interfaceC0883r), c4327q, c5322e, this.f23143c, this.f23144d);
    }

    /* renamed from: g */
    public final InterfaceC0883r m26775g(int i7, C4327q c4327q, List list, C5322E c5322e) {
        if (i7 == 0) {
            return new C6263b();
        }
        if (i7 == 1) {
            return new C6266e();
        }
        if (i7 == 2) {
            return new C6269h();
        }
        if (i7 == 7) {
            return new C4157f(0, 0L);
        }
        if (i7 == 8) {
            return m26766h(this.f23143c, this.f23144d, c5322e, c4327q, list);
        }
        if (i7 == 11) {
            return m26767i(this.f23142b, this.f23145e, c4327q, list, c5322e, this.f23143c, this.f23144d);
        }
        if (i7 != 13) {
            return null;
        }
        return new C6429w(c4327q.f15128d, c5322e, this.f23143c, this.f23144d);
    }

    @Override // p343t0.InterfaceC6414h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C6410d mo26771b(boolean z6) {
        this.f23144d = z6;
        return this;
    }

    @Override // p343t0.InterfaceC6414h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C6410d mo26770a(InterfaceC4529t.a aVar) {
        this.f23143c = aVar;
        return this;
    }

    public C6410d(int i7, boolean z6) {
        this.f23142b = i7;
        this.f23145e = z6;
        this.f23143c = new C4517h();
    }
}
