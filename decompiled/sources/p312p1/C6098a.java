package p312p1;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2922e;
import p178Z2.AbstractC3033v;
import p248i0.C4503a;
import p249i1.AbstractC4528s;
import p249i1.C4514e;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public final class C6098a implements InterfaceC4529t {

    /* renamed from: a */
    public final C5357z f21794a = new C5357z();

    /* renamed from: b */
    public final boolean f21795b;

    /* renamed from: c */
    public final int f21796c;

    /* renamed from: d */
    public final int f21797d;

    /* renamed from: e */
    public final String f21798e;

    /* renamed from: f */
    public final float f21799f;

    /* renamed from: g */
    public final int f21800g;

    public C6098a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f21796c = 0;
            this.f21797d = -1;
            this.f21798e = "sans-serif";
            this.f21795b = false;
            this.f21799f = 0.85f;
            this.f21800g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f21796c = bArr[24];
        this.f21797d = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
        this.f21798e = "Serif".equals(AbstractC5330M.m21689J(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f21800g = i7;
        boolean z6 = (bArr[0] & 32) != 0;
        this.f21795b = z6;
        if (z6) {
            this.f21799f = AbstractC5330M.m21764o(((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f21799f = 0.85f;
        }
    }

    /* renamed from: e */
    public static void m25438e(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    /* renamed from: f */
    public static void m25439f(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            boolean z6 = (i7 & 1) != 0;
            boolean z7 = (i7 & 2) != 0;
            if (z6) {
                if (z7) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                }
            } else if (z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            }
            boolean z8 = (i7 & 4) != 0;
            if (z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            }
            if (z8 || z6 || z7) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
        }
    }

    /* renamed from: g */
    public static void m25440g(SpannableStringBuilder spannableStringBuilder, String str, int i7, int i8) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i7, i8, 16711713);
        }
    }

    /* renamed from: h */
    public static String m25441h(C5357z c5357z) {
        AbstractC5332a.m21796a(c5357z.m21942a() >= 2);
        int m21932M = c5357z.m21932M();
        if (m21932M == 0) {
            return StringUtils.EMPTY;
        }
        int m21947f = c5357z.m21947f();
        Charset m21934O = c5357z.m21934O();
        int m21947f2 = m21932M - (c5357z.m21947f() - m21947f);
        if (m21934O == null) {
            m21934O = AbstractC2922e.f9010c;
        }
        return c5357z.m21924E(m21947f2, m21934O);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        this.f21794a.m21937R(bArr, i7 + i8);
        this.f21794a.m21939T(i7);
        String m25441h = m25441h(this.f21794a);
        if (m25441h.isEmpty()) {
            interfaceC5338g.accept(new C4514e(AbstractC3033v.m11050t(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m25441h);
        m25439f(spannableStringBuilder, this.f21796c, 0, 0, spannableStringBuilder.length(), 16711680);
        m25438e(spannableStringBuilder, this.f21797d, -1, 0, spannableStringBuilder.length(), 16711680);
        m25440g(spannableStringBuilder, this.f21798e, 0, spannableStringBuilder.length());
        float f7 = this.f21799f;
        while (this.f21794a.m21942a() >= 8) {
            int m21947f = this.f21794a.m21947f();
            int m21957p = this.f21794a.m21957p();
            int m21957p2 = this.f21794a.m21957p();
            if (m21957p2 == 1937013100) {
                AbstractC5332a.m21796a(this.f21794a.m21942a() >= 2);
                int m21932M = this.f21794a.m21932M();
                for (int i9 = 0; i9 < m21932M; i9++) {
                    m25442d(this.f21794a, spannableStringBuilder);
                }
            } else if (m21957p2 == 1952608120 && this.f21795b) {
                AbstractC5332a.m21796a(this.f21794a.m21942a() >= 2);
                f7 = AbstractC5330M.m21764o(this.f21794a.m21932M() / this.f21800g, 0.0f, 0.95f);
            }
            this.f21794a.m21939T(m21947f + m21957p);
        }
        interfaceC5338g.accept(new C4514e(AbstractC3033v.m11051u(new C4503a.b().m19201o(spannableStringBuilder).m19194h(f7, 0).m19195i(0).m19187a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 2;
    }

    /* renamed from: d */
    public final void m25442d(C5357z c5357z, SpannableStringBuilder spannableStringBuilder) {
        AbstractC5332a.m21796a(c5357z.m21942a() >= 12);
        int m21932M = c5357z.m21932M();
        int m21932M2 = c5357z.m21932M();
        c5357z.m21940U(2);
        int m21926G = c5357z.m21926G();
        c5357z.m21940U(1);
        int m21957p = c5357z.m21957p();
        if (m21932M2 > spannableStringBuilder.length()) {
            AbstractC5346o.m21867h("Tx3gParser", "Truncating styl end (" + m21932M2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            m21932M2 = spannableStringBuilder.length();
        }
        if (m21932M < m21932M2) {
            int i7 = m21932M2;
            m25439f(spannableStringBuilder, m21926G, this.f21796c, m21932M, i7, 0);
            m25438e(spannableStringBuilder, m21957p, this.f21797d, m21932M, i7, 0);
            return;
        }
        AbstractC5346o.m21867h("Tx3gParser", "Ignoring styl with start (" + m21932M + ") >= end (" + m21932M2 + ").");
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
