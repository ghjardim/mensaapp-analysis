package p260j1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p248i0.C4503a;
import p249i1.AbstractC4526q;
import p249i1.C4525p;
import p249i1.InterfaceC4520k;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C5358a extends AbstractC5362e {

    /* renamed from: i */
    public final int f18899i;

    /* renamed from: j */
    public final int f18900j;

    /* renamed from: k */
    public final int f18901k;

    /* renamed from: l */
    public final long f18902l;

    /* renamed from: o */
    public List f18905o;

    /* renamed from: p */
    public List f18906p;

    /* renamed from: q */
    public int f18907q;

    /* renamed from: r */
    public int f18908r;

    /* renamed from: s */
    public boolean f18909s;

    /* renamed from: t */
    public boolean f18910t;

    /* renamed from: u */
    public byte f18911u;

    /* renamed from: v */
    public byte f18912v;

    /* renamed from: x */
    public boolean f18914x;

    /* renamed from: y */
    public long f18915y;

    /* renamed from: z */
    public static final int[] f18897z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A */
    public static final int[] f18890A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B */
    public static final int[] f18891B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C */
    public static final int[] f18892C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D */
    public static final int[] f18893D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E */
    public static final int[] f18894E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F */
    public static final int[] f18895F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G */
    public static final boolean[] f18896G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h */
    public final C5357z f18898h = new C5357z();

    /* renamed from: m */
    public final ArrayList f18903m = new ArrayList();

    /* renamed from: n */
    public a f18904n = new a(0, 4);

    /* renamed from: w */
    public int f18913w = 0;

    /* renamed from: j1.a$a */
    public static final class a {

        /* renamed from: a */
        public final List f18916a = new ArrayList();

        /* renamed from: b */
        public final List f18917b = new ArrayList();

        /* renamed from: c */
        public final StringBuilder f18918c = new StringBuilder();

        /* renamed from: d */
        public int f18919d;

        /* renamed from: e */
        public int f18920e;

        /* renamed from: f */
        public int f18921f;

        /* renamed from: g */
        public int f18922g;

        /* renamed from: h */
        public int f18923h;

        /* renamed from: j1.a$a$a, reason: collision with other inner class name */
        public static class C7232a {

            /* renamed from: a */
            public final int f18924a;

            /* renamed from: b */
            public final boolean f18925b;

            /* renamed from: c */
            public int f18926c;

            public C7232a(int i7, boolean z6, int i8) {
                this.f18924a = i7;
                this.f18925b = z6;
                this.f18926c = i8;
            }
        }

        public a(int i7, int i8) {
            m22015j(i7);
            this.f18923h = i8;
        }

        /* renamed from: n */
        public static void m22007n(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9) {
            if (i9 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i7, i8, 33);
        }

        /* renamed from: o */
        public static void m22008o(SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i7, i8, 33);
        }

        /* renamed from: q */
        public static void m22009q(SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i8, 33);
        }

        /* renamed from: e */
        public void m22010e(char c7) {
            if (this.f18918c.length() < 32) {
                this.f18918c.append(c7);
            }
        }

        /* renamed from: f */
        public void m22011f() {
            int length = this.f18918c.length();
            if (length > 0) {
                this.f18918c.delete(length - 1, length);
                for (int size = this.f18916a.size() - 1; size >= 0; size--) {
                    C7232a c7232a = (C7232a) this.f18916a.get(size);
                    int i7 = c7232a.f18926c;
                    if (i7 != length) {
                        return;
                    }
                    c7232a.f18926c = i7 - 1;
                }
            }
        }

        /* renamed from: g */
        public C4503a m22012g(int i7) {
            float f7;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i8 = 0; i8 < this.f18917b.size(); i8++) {
                spannableStringBuilder.append((CharSequence) this.f18917b.get(i8));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m22013h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i9 = this.f18920e + this.f18921f;
            int length = (32 - i9) - spannableStringBuilder.length();
            int i10 = i9 - length;
            if (i7 == Integer.MIN_VALUE) {
                i7 = (this.f18922g != 2 || (Math.abs(i10) >= 3 && length >= 0)) ? (this.f18922g != 2 || i10 <= 0) ? 0 : 2 : 1;
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    i9 = 32 - length;
                }
                f7 = ((i9 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f7 = 0.5f;
            }
            int i11 = this.f18919d;
            if (i11 > 7) {
                i11 -= 17;
            } else if (this.f18922g == 1) {
                i11 -= this.f18923h - 1;
            }
            return new C4503a.b().m19201o(spannableStringBuilder).m19202p(Layout.Alignment.ALIGN_NORMAL).m19194h(i11, 1).m19197k(f7).m19198l(i7).m19187a();
        }

        /* renamed from: h */
        public final SpannableString m22013h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f18918c);
            int length = spannableStringBuilder.length();
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            boolean z6 = false;
            while (i11 < this.f18916a.size()) {
                C7232a c7232a = (C7232a) this.f18916a.get(i11);
                boolean z7 = c7232a.f18925b;
                int i13 = c7232a.f18924a;
                if (i13 != 8) {
                    boolean z8 = i13 == 7;
                    if (i13 != 7) {
                        i10 = C5358a.f18891B[i13];
                    }
                    z6 = z8;
                }
                int i14 = c7232a.f18926c;
                i11++;
                if (i14 != (i11 < this.f18916a.size() ? ((C7232a) this.f18916a.get(i11)).f18926c : length)) {
                    if (i7 != -1 && !z7) {
                        m22009q(spannableStringBuilder, i7, i14);
                        i7 = -1;
                    } else if (i7 == -1 && z7) {
                        i7 = i14;
                    }
                    if (i8 != -1 && !z6) {
                        m22008o(spannableStringBuilder, i8, i14);
                        i8 = -1;
                    } else if (i8 == -1 && z6) {
                        i8 = i14;
                    }
                    if (i10 != i9) {
                        m22007n(spannableStringBuilder, i12, i14, i9);
                        i9 = i10;
                        i12 = i14;
                    }
                }
            }
            if (i7 != -1 && i7 != length) {
                m22009q(spannableStringBuilder, i7, length);
            }
            if (i8 != -1 && i8 != length) {
                m22008o(spannableStringBuilder, i8, length);
            }
            if (i12 != length) {
                m22007n(spannableStringBuilder, i12, length, i9);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: i */
        public boolean m22014i() {
            return this.f18916a.isEmpty() && this.f18917b.isEmpty() && this.f18918c.length() == 0;
        }

        /* renamed from: j */
        public void m22015j(int i7) {
            this.f18922g = i7;
            this.f18916a.clear();
            this.f18917b.clear();
            this.f18918c.setLength(0);
            this.f18919d = 15;
            this.f18920e = 0;
            this.f18921f = 0;
        }

        /* renamed from: k */
        public void m22016k() {
            this.f18917b.add(m22013h());
            this.f18918c.setLength(0);
            this.f18916a.clear();
            int min = Math.min(this.f18923h, this.f18919d);
            while (this.f18917b.size() >= min) {
                this.f18917b.remove(0);
            }
        }

        /* renamed from: l */
        public void m22017l(int i7) {
            this.f18922g = i7;
        }

        /* renamed from: m */
        public void m22018m(int i7) {
            this.f18923h = i7;
        }

        /* renamed from: p */
        public void m22019p(int i7, boolean z6) {
            this.f18916a.add(new C7232a(i7, z6, this.f18918c.length()));
        }
    }

    public C5358a(String str, int i7, long j7) {
        if (j7 != -9223372036854775807L) {
            AbstractC5332a.m21796a(j7 >= 16000);
            this.f18902l = j7 * 1000;
        } else {
            this.f18902l = -9223372036854775807L;
        }
        this.f18899i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.f18901k = 0;
            this.f18900j = 0;
        } else if (i7 == 2) {
            this.f18901k = 1;
            this.f18900j = 0;
        } else if (i7 == 3) {
            this.f18901k = 0;
            this.f18900j = 1;
        } else if (i7 != 4) {
            AbstractC5346o.m21867h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f18901k = 0;
            this.f18900j = 0;
        } else {
            this.f18901k = 1;
            this.f18900j = 1;
        }
        m21989O(0);
        m21988N();
        this.f18914x = true;
        this.f18915y = -9223372036854775807L;
    }

    /* renamed from: B */
    public static boolean m21968B(byte b7) {
        return (b7 & 224) == 0;
    }

    /* renamed from: C */
    public static boolean m21969C(byte b7, byte b8) {
        return (b7 & 246) == 18 && (b8 & 224) == 32;
    }

    /* renamed from: D */
    public static boolean m21970D(byte b7, byte b8) {
        return (b7 & 247) == 17 && (b8 & 240) == 32;
    }

    /* renamed from: E */
    public static boolean m21971E(byte b7, byte b8) {
        return (b7 & 246) == 20 && (b8 & 240) == 32;
    }

    /* renamed from: F */
    public static boolean m21972F(byte b7, byte b8) {
        return (b7 & 240) == 16 && (b8 & 192) == 64;
    }

    /* renamed from: G */
    public static boolean m21973G(byte b7) {
        return (b7 & 240) == 16;
    }

    /* renamed from: I */
    public static boolean m21974I(byte b7) {
        return (b7 & 246) == 20;
    }

    /* renamed from: J */
    public static boolean m21975J(byte b7, byte b8) {
        return (b7 & 247) == 17 && (b8 & 240) == 48;
    }

    /* renamed from: K */
    public static boolean m21976K(byte b7, byte b8) {
        return (b7 & 247) == 23 && b8 >= 33 && b8 <= 35;
    }

    /* renamed from: L */
    public static boolean m21977L(byte b7) {
        return 1 <= b7 && b7 <= 15;
    }

    /* renamed from: r */
    public static char m21979r(byte b7) {
        return (char) f18892C[(b7 & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: s */
    public static int m21980s(byte b7) {
        return (b7 >> 3) & 1;
    }

    /* renamed from: u */
    public static char m21981u(byte b7) {
        return (char) f18894E[b7 & 31];
    }

    /* renamed from: v */
    public static char m21982v(byte b7) {
        return (char) f18895F[b7 & 31];
    }

    /* renamed from: w */
    public static char m21983w(byte b7, byte b8) {
        return (b7 & 1) == 0 ? m21981u(b8) : m21982v(b8);
    }

    /* renamed from: x */
    public static char m21984x(byte b7) {
        return (char) f18893D[b7 & 15];
    }

    /* renamed from: A */
    public final void m21985A(byte b7, byte b8) {
        int i7 = f18897z[b7 & 7];
        if ((b8 & 32) != 0) {
            i7++;
        }
        if (i7 != this.f18904n.f18919d) {
            if (this.f18907q != 1 && !this.f18904n.m22014i()) {
                a aVar = new a(this.f18907q, this.f18908r);
                this.f18904n = aVar;
                this.f18903m.add(aVar);
            }
            this.f18904n.f18919d = i7;
        }
        boolean z6 = (b8 & 16) == 16;
        boolean z7 = (b8 & 1) == 1;
        int i8 = (b8 >> 1) & 7;
        this.f18904n.m22019p(z6 ? 8 : i8, z7);
        if (z6) {
            this.f18904n.f18920e = f18890A[i8];
        }
    }

    /* renamed from: H */
    public final boolean m21986H(boolean z6, byte b7, byte b8) {
        if (!z6 || !m21973G(b7)) {
            this.f18910t = false;
        } else {
            if (this.f18910t && this.f18911u == b7 && this.f18912v == b8) {
                this.f18910t = false;
                return true;
            }
            this.f18910t = true;
            this.f18911u = b7;
            this.f18912v = b8;
        }
        return false;
    }

    /* renamed from: M */
    public final void m21987M(byte b7, byte b8) {
        if (m21977L(b7)) {
            this.f18914x = false;
            return;
        }
        if (m21974I(b7)) {
            if (b8 != 32 && b8 != 47) {
                switch (b8) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b8) {
                            case 42:
                            case 43:
                                this.f18914x = false;
                                break;
                        }
                }
            }
            this.f18914x = true;
        }
    }

    /* renamed from: N */
    public final void m21988N() {
        this.f18904n.m22015j(this.f18907q);
        this.f18903m.clear();
        this.f18903m.add(this.f18904n);
    }

    /* renamed from: O */
    public final void m21989O(int i7) {
        int i8 = this.f18907q;
        if (i8 == i7) {
            return;
        }
        this.f18907q = i7;
        if (i7 == 3) {
            for (int i9 = 0; i9 < this.f18903m.size(); i9++) {
                ((a) this.f18903m.get(i9)).m22017l(i7);
            }
            return;
        }
        m21988N();
        if (i8 == 3 || i7 == 1 || i7 == 0) {
            this.f18905o = Collections.emptyList();
        }
    }

    /* renamed from: P */
    public final void m21990P(int i7) {
        this.f18908r = i7;
        this.f18904n.m22018m(i7);
    }

    /* renamed from: Q */
    public final boolean m21991Q() {
        return (this.f18902l == -9223372036854775807L || this.f18915y == -9223372036854775807L || m22062l() - this.f18915y < this.f18902l) ? false : true;
    }

    /* renamed from: R */
    public final boolean m21992R(byte b7) {
        if (m21968B(b7)) {
            this.f18913w = m21980s(b7);
        }
        return this.f18913w == this.f18901k;
    }

    @Override // p260j1.AbstractC5362e, p249i1.InterfaceC4521l
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo19235c(long j7) {
        super.mo19235c(j7);
    }

    @Override // p260j1.AbstractC5362e, p284m0.InterfaceC5559g
    public void flush() {
        super.flush();
        this.f18905o = null;
        this.f18906p = null;
        m21989O(0);
        m21990P(4);
        m21988N();
        this.f18909s = false;
        this.f18910t = false;
        this.f18911u = (byte) 0;
        this.f18912v = (byte) 0;
        this.f18913w = 0;
        this.f18914x = true;
        this.f18915y = -9223372036854775807L;
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: g */
    public InterfaceC4520k mo21994g() {
        List list = this.f18905o;
        this.f18906p = list;
        return new C5363f((List) AbstractC5332a.m21800e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // p260j1.AbstractC5362e
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo21995h(p249i1.C4525p r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p260j1.C5358a.mo21995h(i1.p):void");
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ C4525p mo22059e() {
        return super.mo22059e();
    }

    @Override // p260j1.AbstractC5362e, p284m0.InterfaceC5559g
    /* renamed from: j */
    public AbstractC4526q mo21993a() {
        AbstractC4526q m22061k;
        AbstractC4526q mo21993a = super.mo21993a();
        if (mo21993a != null) {
            return mo21993a;
        }
        if (!m21991Q() || (m22061k = m22061k()) == null) {
            return null;
        }
        this.f18905o = Collections.emptyList();
        this.f18915y = -9223372036854775807L;
        m22061k.m19254s(m22062l(), mo21994g(), Long.MAX_VALUE);
        return m22061k;
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: m */
    public boolean mo21998m() {
        return this.f18905o != this.f18906p;
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo22060f(C4525p c4525p) {
        super.mo22060f(c4525p);
    }

    /* renamed from: t */
    public final List m22000t() {
        int size = this.f18903m.size();
        ArrayList arrayList = new ArrayList(size);
        int i7 = 2;
        for (int i8 = 0; i8 < size; i8++) {
            C4503a m22012g = ((a) this.f18903m.get(i8)).m22012g(Integer.MIN_VALUE);
            arrayList.add(m22012g);
            if (m22012g != null) {
                i7 = Math.min(i7, m22012g.f16099i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            C4503a c4503a = (C4503a) arrayList.get(i9);
            if (c4503a != null) {
                if (c4503a.f16099i != i7) {
                    c4503a = (C4503a) AbstractC5332a.m21800e(((a) this.f18903m.get(i9)).m22012g(i7));
                }
                arrayList2.add(c4503a);
            }
        }
        return arrayList2;
    }

    /* renamed from: y */
    public final void m22001y(byte b7) {
        this.f18904n.m22010e(' ');
        this.f18904n.m22019p((b7 >> 1) & 7, (b7 & 1) == 1);
    }

    /* renamed from: z */
    public final void m22002z(byte b7) {
        if (b7 == 32) {
            m21989O(2);
            return;
        }
        if (b7 == 41) {
            m21989O(3);
            return;
        }
        switch (b7) {
            case 37:
                m21989O(1);
                m21990P(2);
                break;
            case 38:
                m21989O(1);
                m21990P(3);
                break;
            case 39:
                m21989O(1);
                m21990P(4);
                break;
            default:
                int i7 = this.f18907q;
                if (i7 != 0) {
                    if (b7 == 33) {
                        this.f18904n.m22011f();
                        break;
                    } else {
                        switch (b7) {
                            case 44:
                                this.f18905o = Collections.emptyList();
                                int i8 = this.f18907q;
                                if (i8 == 1 || i8 == 3) {
                                    m21988N();
                                    break;
                                }
                            case 45:
                                if (i7 == 1 && !this.f18904n.m22014i()) {
                                    this.f18904n.m22016k();
                                    break;
                                }
                                break;
                            case 46:
                                m21988N();
                                break;
                            case 47:
                                this.f18905o = m22000t();
                                m21988N();
                                break;
                        }
                    }
                }
                break;
        }
    }

    @Override // p260j1.AbstractC5362e, p284m0.InterfaceC5559g
    public void release() {
    }
}
