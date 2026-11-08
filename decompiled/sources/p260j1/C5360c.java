package p260j1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p248i0.C4503a;
import p249i1.AbstractC4526q;
import p249i1.C4525p;
import p249i1.InterfaceC4520k;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5335d;
import p259j0.AbstractC5346o;
import p259j0.C5356y;
import p259j0.C5357z;
import p260j1.C5360c;
import p272k4.C5410A;

/* renamed from: j1.c */
/* loaded from: classes.dex */
public final class C5360c extends AbstractC5362e {

    /* renamed from: h */
    public final C5357z f18927h = new C5357z();

    /* renamed from: i */
    public final C5356y f18928i = new C5356y();

    /* renamed from: j */
    public int f18929j = -1;

    /* renamed from: k */
    public final boolean f18930k;

    /* renamed from: l */
    public final int f18931l;

    /* renamed from: m */
    public final b[] f18932m;

    /* renamed from: n */
    public b f18933n;

    /* renamed from: o */
    public List f18934o;

    /* renamed from: p */
    public List f18935p;

    /* renamed from: q */
    public c f18936q;

    /* renamed from: r */
    public int f18937r;

    /* renamed from: j1.c$a */
    public static final class a {

        /* renamed from: c */
        public static final Comparator f18938c = new Comparator() { // from class: j1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m22039c;
                m22039c = C5360c.a.m22039c((C5360c.a) obj, (C5360c.a) obj2);
                return m22039c;
            }
        };

        /* renamed from: a */
        public final C4503a f18939a;

        /* renamed from: b */
        public final int f18940b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f7, int i7, int i8, float f8, int i9, float f9, boolean z6, int i10, int i11) {
            C4503a.b m19200n = new C4503a.b().m19201o(charSequence).m19202p(alignment).m19194h(f7, i7).m19195i(i8).m19197k(f8).m19198l(i9).m19200n(f9);
            if (z6) {
                m19200n.m19205s(i10);
            }
            this.f18939a = m19200n.m19187a();
            this.f18940b = i11;
        }

        /* renamed from: c */
        public static /* synthetic */ int m22039c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f18940b, aVar.f18940b);
        }
    }

    /* renamed from: j1.c$b */
    public static final class b {

        /* renamed from: A */
        public static final int[] f18941A;

        /* renamed from: B */
        public static final boolean[] f18942B;

        /* renamed from: C */
        public static final int[] f18943C;

        /* renamed from: D */
        public static final int[] f18944D;

        /* renamed from: E */
        public static final int[] f18945E;

        /* renamed from: F */
        public static final int[] f18946F;

        /* renamed from: v */
        public static final int f18947v = m22041h(2, 2, 2, 0);

        /* renamed from: w */
        public static final int f18948w;

        /* renamed from: x */
        public static final int f18949x;

        /* renamed from: y */
        public static final int[] f18950y;

        /* renamed from: z */
        public static final int[] f18951z;

        /* renamed from: a */
        public final List f18952a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f18953b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f18954c;

        /* renamed from: d */
        public boolean f18955d;

        /* renamed from: e */
        public int f18956e;

        /* renamed from: f */
        public boolean f18957f;

        /* renamed from: g */
        public int f18958g;

        /* renamed from: h */
        public int f18959h;

        /* renamed from: i */
        public int f18960i;

        /* renamed from: j */
        public int f18961j;

        /* renamed from: k */
        public int f18962k;

        /* renamed from: l */
        public int f18963l;

        /* renamed from: m */
        public int f18964m;

        /* renamed from: n */
        public int f18965n;

        /* renamed from: o */
        public int f18966o;

        /* renamed from: p */
        public int f18967p;

        /* renamed from: q */
        public int f18968q;

        /* renamed from: r */
        public int f18969r;

        /* renamed from: s */
        public int f18970s;

        /* renamed from: t */
        public int f18971t;

        /* renamed from: u */
        public int f18972u;

        static {
            int m22041h = m22041h(0, 0, 0, 0);
            f18948w = m22041h;
            int m22041h2 = m22041h(0, 0, 0, 3);
            f18949x = m22041h2;
            f18950y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f18951z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f18941A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f18942B = new boolean[]{false, false, false, true, true, true, false};
            f18943C = new int[]{m22041h, m22041h2, m22041h, m22041h, m22041h2, m22041h, m22041h};
            f18944D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f18945E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f18946F = new int[]{m22041h, m22041h, m22041h, m22041h, m22041h, m22041h2, m22041h2};
        }

        public b() {
            m22051l();
        }

        /* renamed from: g */
        public static int m22040g(int i7, int i8, int i9) {
            return m22041h(i7, i8, i9, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m22041h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p259j0.AbstractC5332a.m21798c(r4, r0, r1)
                p259j0.AbstractC5332a.m21798c(r5, r0, r1)
                p259j0.AbstractC5332a.m21798c(r6, r0, r1)
                p259j0.AbstractC5332a.m21798c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p260j1.C5360c.b.m22041h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m22042a(char c7) {
            if (c7 != '\n') {
                this.f18953b.append(c7);
                return;
            }
            this.f18952a.add(m22045d());
            this.f18953b.clear();
            if (this.f18966o != -1) {
                this.f18966o = 0;
            }
            if (this.f18967p != -1) {
                this.f18967p = 0;
            }
            if (this.f18968q != -1) {
                this.f18968q = 0;
            }
            if (this.f18970s != -1) {
                this.f18970s = 0;
            }
            while (true) {
                if (this.f18952a.size() < this.f18961j && this.f18952a.size() < 15) {
                    this.f18972u = this.f18952a.size();
                    return;
                }
                this.f18952a.remove(0);
            }
        }

        /* renamed from: b */
        public void m22043b() {
            int length = this.f18953b.length();
            if (length > 0) {
                this.f18953b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p260j1.C5360c.a m22044c() {
            /*
                Method dump skipped, instructions count: 194
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p260j1.C5360c.b.m22044c():j1.c$a");
        }

        /* renamed from: d */
        public SpannableString m22045d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f18953b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f18966o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f18966o, length, 33);
                }
                if (this.f18967p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f18967p, length, 33);
                }
                if (this.f18968q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f18969r), this.f18968q, length, 33);
                }
                if (this.f18970s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f18971t), this.f18970s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m22046e() {
            this.f18952a.clear();
            this.f18953b.clear();
            this.f18966o = -1;
            this.f18967p = -1;
            this.f18968q = -1;
            this.f18970s = -1;
            this.f18972u = 0;
        }

        /* renamed from: f */
        public void m22047f(boolean z6, int i7, boolean z7, int i8, int i9, int i10, int i11, int i12, int i13) {
            this.f18954c = true;
            this.f18955d = z6;
            this.f18956e = i7;
            this.f18957f = z7;
            this.f18958g = i8;
            this.f18959h = i9;
            this.f18960i = i11;
            int i14 = i10 + 1;
            if (this.f18961j != i14) {
                this.f18961j = i14;
                while (true) {
                    if (this.f18952a.size() < this.f18961j && this.f18952a.size() < 15) {
                        break;
                    } else {
                        this.f18952a.remove(0);
                    }
                }
            }
            if (i12 != 0 && this.f18963l != i12) {
                this.f18963l = i12;
                int i15 = i12 - 1;
                m22056q(f18943C[i15], f18949x, f18942B[i15], 0, f18951z[i15], f18941A[i15], f18950y[i15]);
            }
            if (i13 == 0 || this.f18964m == i13) {
                return;
            }
            this.f18964m = i13;
            int i16 = i13 - 1;
            m22052m(0, 1, 1, false, false, f18945E[i16], f18944D[i16]);
            m22053n(f18947v, f18946F[i16], f18948w);
        }

        /* renamed from: i */
        public boolean m22048i() {
            return this.f18954c;
        }

        /* renamed from: j */
        public boolean m22049j() {
            return !m22048i() || (this.f18952a.isEmpty() && this.f18953b.length() == 0);
        }

        /* renamed from: k */
        public boolean m22050k() {
            return this.f18955d;
        }

        /* renamed from: l */
        public void m22051l() {
            m22046e();
            this.f18954c = false;
            this.f18955d = false;
            this.f18956e = 4;
            this.f18957f = false;
            this.f18958g = 0;
            this.f18959h = 0;
            this.f18960i = 0;
            this.f18961j = 15;
            this.f18962k = 0;
            this.f18963l = 0;
            this.f18964m = 0;
            int i7 = f18948w;
            this.f18965n = i7;
            this.f18969r = f18947v;
            this.f18971t = i7;
        }

        /* renamed from: m */
        public void m22052m(int i7, int i8, int i9, boolean z6, boolean z7, int i10, int i11) {
            if (this.f18966o != -1) {
                if (!z6) {
                    this.f18953b.setSpan(new StyleSpan(2), this.f18966o, this.f18953b.length(), 33);
                    this.f18966o = -1;
                }
            } else if (z6) {
                this.f18966o = this.f18953b.length();
            }
            if (this.f18967p == -1) {
                if (z7) {
                    this.f18967p = this.f18953b.length();
                }
            } else {
                if (z7) {
                    return;
                }
                this.f18953b.setSpan(new UnderlineSpan(), this.f18967p, this.f18953b.length(), 33);
                this.f18967p = -1;
            }
        }

        /* renamed from: n */
        public void m22053n(int i7, int i8, int i9) {
            if (this.f18968q != -1 && this.f18969r != i7) {
                this.f18953b.setSpan(new ForegroundColorSpan(this.f18969r), this.f18968q, this.f18953b.length(), 33);
            }
            if (i7 != f18947v) {
                this.f18968q = this.f18953b.length();
                this.f18969r = i7;
            }
            if (this.f18970s != -1 && this.f18971t != i8) {
                this.f18953b.setSpan(new BackgroundColorSpan(this.f18971t), this.f18970s, this.f18953b.length(), 33);
            }
            if (i8 != f18948w) {
                this.f18970s = this.f18953b.length();
                this.f18971t = i8;
            }
        }

        /* renamed from: o */
        public void m22054o(int i7, int i8) {
            if (this.f18972u != i7) {
                m22042a('\n');
            }
            this.f18972u = i7;
        }

        /* renamed from: p */
        public void m22055p(boolean z6) {
            this.f18955d = z6;
        }

        /* renamed from: q */
        public void m22056q(int i7, int i8, boolean z6, int i9, int i10, int i11, int i12) {
            this.f18965n = i7;
            this.f18962k = i12;
        }
    }

    /* renamed from: j1.c$c */
    public static final class c {

        /* renamed from: a */
        public final int f18973a;

        /* renamed from: b */
        public final int f18974b;

        /* renamed from: c */
        public final byte[] f18975c;

        /* renamed from: d */
        public int f18976d = 0;

        public c(int i7, int i8) {
            this.f18973a = i7;
            this.f18974b = i8;
            this.f18975c = new byte[(i8 * 2) - 1];
        }
    }

    public C5360c(int i7, List list) {
        this.f18931l = i7 == -1 ? 1 : i7;
        this.f18930k = list != null && AbstractC5335d.m21816i(list);
        this.f18932m = new b[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f18932m[i8] = new b();
        }
        this.f18933n = this.f18932m[0];
    }

    /* renamed from: G */
    private void m22020G() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f18932m[i7].m22051l();
        }
    }

    /* renamed from: r */
    private List m22021r() {
        a m22044c;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            if (!this.f18932m[i7].m22049j() && this.f18932m[i7].m22050k() && (m22044c = this.f18932m[i7].m22044c()) != null) {
                arrayList.add(m22044c);
            }
        }
        Collections.sort(arrayList, a.f18938c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList2.add(((a) arrayList.get(i8)).f18939a);
        }
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    /* renamed from: A */
    public final void m22022A(int i7) {
        if (i7 == 160) {
            this.f18933n.m22042a((char) 13252);
            return;
        }
        AbstractC5346o.m21867h("Cea708Decoder", "Invalid G3 character: " + i7);
        this.f18933n.m22042a('_');
    }

    /* renamed from: B */
    public final void m22023B() {
        this.f18933n.m22052m(this.f18928i.m21908h(4), this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21907g(), this.f18928i.m21907g(), this.f18928i.m21908h(3), this.f18928i.m21908h(3));
    }

    /* renamed from: C */
    public final void m22024C() {
        int m22041h = b.m22041h(this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2));
        int m22041h2 = b.m22041h(this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2));
        this.f18928i.m21918r(2);
        this.f18933n.m22053n(m22041h, m22041h2, b.m22040g(this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2)));
    }

    /* renamed from: D */
    public final void m22025D() {
        this.f18928i.m21918r(4);
        int m21908h = this.f18928i.m21908h(4);
        this.f18928i.m21918r(2);
        this.f18933n.m22054o(m21908h, this.f18928i.m21908h(6));
    }

    /* renamed from: E */
    public final void m22026E() {
        int m22041h = b.m22041h(this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2));
        int m21908h = this.f18928i.m21908h(2);
        int m22040g = b.m22040g(this.f18928i.m21908h(2), this.f18928i.m21908h(2), this.f18928i.m21908h(2));
        if (this.f18928i.m21907g()) {
            m21908h |= 4;
        }
        boolean m21907g = this.f18928i.m21907g();
        int m21908h2 = this.f18928i.m21908h(2);
        int m21908h3 = this.f18928i.m21908h(2);
        int m21908h4 = this.f18928i.m21908h(2);
        this.f18928i.m21918r(8);
        this.f18933n.m22056q(m22041h, m22040g, m21907g, m21908h, m21908h2, m21908h3, m21908h4);
    }

    /* renamed from: F */
    public final void m22027F() {
        c cVar = this.f18936q;
        if (cVar.f18976d != (cVar.f18974b * 2) - 1) {
            AbstractC5346o.m21861b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f18936q.f18974b * 2) - 1) + ", but current index is " + this.f18936q.f18976d + " (sequence number " + this.f18936q.f18973a + ");");
        }
        C5356y c5356y = this.f18928i;
        c cVar2 = this.f18936q;
        c5356y.m21915o(cVar2.f18975c, cVar2.f18976d);
        boolean z6 = false;
        while (true) {
            if (this.f18928i.m21902b() <= 0) {
                break;
            }
            int m21908h = this.f18928i.m21908h(3);
            int m21908h2 = this.f18928i.m21908h(5);
            if (m21908h == 7) {
                this.f18928i.m21918r(2);
                m21908h = this.f18928i.m21908h(6);
                if (m21908h < 7) {
                    AbstractC5346o.m21867h("Cea708Decoder", "Invalid extended service number: " + m21908h);
                }
            }
            if (m21908h2 == 0) {
                if (m21908h != 0) {
                    AbstractC5346o.m21867h("Cea708Decoder", "serviceNumber is non-zero (" + m21908h + ") when blockSize is 0");
                }
            } else if (m21908h != this.f18931l) {
                this.f18928i.m21919s(m21908h2);
            } else {
                int m21905e = this.f18928i.m21905e() + (m21908h2 * 8);
                while (this.f18928i.m21905e() < m21905e) {
                    int m21908h3 = this.f18928i.m21908h(8);
                    if (m21908h3 == 16) {
                        int m21908h4 = this.f18928i.m21908h(8);
                        if (m21908h4 <= 31) {
                            m22031u(m21908h4);
                        } else {
                            if (m21908h4 <= 127) {
                                m22036z(m21908h4);
                            } else if (m21908h4 <= 159) {
                                m22032v(m21908h4);
                            } else if (m21908h4 <= 255) {
                                m22022A(m21908h4);
                            } else {
                                AbstractC5346o.m21867h("Cea708Decoder", "Invalid extended command: " + m21908h4);
                            }
                            z6 = true;
                        }
                    } else if (m21908h3 <= 31) {
                        m22029s(m21908h3);
                    } else {
                        if (m21908h3 <= 127) {
                            m22034x(m21908h3);
                        } else if (m21908h3 <= 159) {
                            m22030t(m21908h3);
                        } else if (m21908h3 <= 255) {
                            m22035y(m21908h3);
                        } else {
                            AbstractC5346o.m21867h("Cea708Decoder", "Invalid base command: " + m21908h3);
                        }
                        z6 = true;
                    }
                }
            }
        }
        if (z6) {
            this.f18934o = m22021r();
        }
    }

    @Override // p260j1.AbstractC5362e, p249i1.InterfaceC4521l
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo19235c(long j7) {
        super.mo19235c(j7);
    }

    @Override // p260j1.AbstractC5362e, p284m0.InterfaceC5559g
    public void flush() {
        super.flush();
        this.f18934o = null;
        this.f18935p = null;
        this.f18937r = 0;
        this.f18933n = this.f18932m[0];
        m22020G();
        this.f18936q = null;
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: g */
    public InterfaceC4520k mo21994g() {
        List list = this.f18934o;
        this.f18935p = list;
        return new C5363f((List) AbstractC5332a.m21800e(list));
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: h */
    public void mo21995h(C4525p c4525p) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(c4525p.f20077d);
        this.f18927h.m21937R(byteBuffer.array(), byteBuffer.limit());
        while (this.f18927h.m21942a() >= 3) {
            int m21926G = this.f18927h.m21926G();
            int i7 = m21926G & 3;
            boolean z6 = (m21926G & 4) == 4;
            byte m21926G2 = (byte) this.f18927h.m21926G();
            byte m21926G3 = (byte) this.f18927h.m21926G();
            if (i7 == 2 || i7 == 3) {
                if (z6) {
                    if (i7 == 3) {
                        m22028q();
                        int i8 = (m21926G2 & 192) >> 6;
                        int i9 = this.f18929j;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            m22020G();
                            AbstractC5346o.m21867h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f18929j + " current=" + i8);
                        }
                        this.f18929j = i8;
                        int i10 = m21926G2 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        c cVar = new c(i8, i10);
                        this.f18936q = cVar;
                        byte[] bArr = cVar.f18975c;
                        int i11 = cVar.f18976d;
                        cVar.f18976d = i11 + 1;
                        bArr[i11] = m21926G3;
                    } else {
                        AbstractC5332a.m21796a(i7 == 2);
                        c cVar2 = this.f18936q;
                        if (cVar2 == null) {
                            AbstractC5346o.m21862c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f18975c;
                            int i12 = cVar2.f18976d;
                            int i13 = i12 + 1;
                            cVar2.f18976d = i13;
                            bArr2[i12] = m21926G2;
                            cVar2.f18976d = i12 + 2;
                            bArr2[i13] = m21926G3;
                        }
                    }
                    c cVar3 = this.f18936q;
                    if (cVar3.f18976d == (cVar3.f18974b * 2) - 1) {
                        m22028q();
                    }
                }
            }
        }
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ C4525p mo22059e() {
        return super.mo22059e();
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ AbstractC4526q mo21993a() {
        return super.mo21993a();
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: m */
    public boolean mo21998m() {
        return this.f18934o != this.f18935p;
    }

    @Override // p260j1.AbstractC5362e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void mo22060f(C4525p c4525p) {
        super.mo22060f(c4525p);
    }

    /* renamed from: q */
    public final void m22028q() {
        if (this.f18936q == null) {
            return;
        }
        m22027F();
        this.f18936q = null;
    }

    @Override // p260j1.AbstractC5362e, p284m0.InterfaceC5559g
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    /* renamed from: s */
    public final void m22029s(int i7) {
        if (i7 != 0) {
            if (i7 == 3) {
                this.f18934o = m22021r();
            }
            if (i7 == 8) {
                this.f18933n.m22043b();
                return;
            }
            switch (i7) {
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    m22020G();
                    break;
                case 13:
                    this.f18933n.m22042a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i7 >= 17 && i7 <= 23) {
                        AbstractC5346o.m21867h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i7);
                        this.f18928i.m21918r(8);
                        break;
                    } else if (i7 >= 24 && i7 <= 31) {
                        AbstractC5346o.m21867h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i7);
                        this.f18928i.m21918r(16);
                        break;
                    } else {
                        AbstractC5346o.m21867h("Cea708Decoder", "Invalid C0 command: " + i7);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: t */
    public final void m22030t(int i7) {
        int i8 = 1;
        switch (i7) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i9 = i7 - 128;
                if (this.f18937r != i9) {
                    this.f18937r = i9;
                    this.f18933n = this.f18932m[i9];
                    break;
                }
                break;
            case 136:
                while (i8 <= 8) {
                    if (this.f18928i.m21907g()) {
                        this.f18932m[8 - i8].m22046e();
                    }
                    i8++;
                }
                break;
            case 137:
                for (int i10 = 1; i10 <= 8; i10++) {
                    if (this.f18928i.m21907g()) {
                        this.f18932m[8 - i10].m22055p(true);
                    }
                }
                break;
            case 138:
                while (i8 <= 8) {
                    if (this.f18928i.m21907g()) {
                        this.f18932m[8 - i8].m22055p(false);
                    }
                    i8++;
                }
                break;
            case 139:
                for (int i11 = 1; i11 <= 8; i11++) {
                    if (this.f18928i.m21907g()) {
                        this.f18932m[8 - i11].m22055p(!r0.m22050k());
                    }
                }
                break;
            case 140:
                while (i8 <= 8) {
                    if (this.f18928i.m21907g()) {
                        this.f18932m[8 - i8].m22051l();
                    }
                    i8++;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                this.f18928i.m21918r(8);
                break;
            case 142:
                break;
            case 143:
                m22020G();
                break;
            case 144:
                if (this.f18933n.m22048i()) {
                    m22023B();
                    break;
                } else {
                    this.f18928i.m21918r(16);
                    break;
                }
            case 145:
                if (this.f18933n.m22048i()) {
                    m22024C();
                    break;
                } else {
                    this.f18928i.m21918r(24);
                    break;
                }
            case 146:
                if (this.f18933n.m22048i()) {
                    m22025D();
                    break;
                } else {
                    this.f18928i.m21918r(16);
                    break;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                AbstractC5346o.m21867h("Cea708Decoder", "Invalid C1 command: " + i7);
                break;
            case 151:
                if (this.f18933n.m22048i()) {
                    m22026E();
                    break;
                } else {
                    this.f18928i.m21918r(32);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i12 = i7 - 152;
                m22033w(i12);
                if (this.f18937r != i12) {
                    this.f18937r = i12;
                    this.f18933n = this.f18932m[i12];
                    break;
                }
                break;
        }
    }

    /* renamed from: u */
    public final void m22031u(int i7) {
        if (i7 <= 7) {
            return;
        }
        if (i7 <= 15) {
            this.f18928i.m21918r(8);
        } else if (i7 <= 23) {
            this.f18928i.m21918r(16);
        } else if (i7 <= 31) {
            this.f18928i.m21918r(24);
        }
    }

    /* renamed from: v */
    public final void m22032v(int i7) {
        if (i7 <= 135) {
            this.f18928i.m21918r(32);
            return;
        }
        if (i7 <= 143) {
            this.f18928i.m21918r(40);
        } else if (i7 <= 159) {
            this.f18928i.m21918r(2);
            this.f18928i.m21918r(this.f18928i.m21908h(6) * 8);
        }
    }

    /* renamed from: w */
    public final void m22033w(int i7) {
        b bVar = this.f18932m[i7];
        this.f18928i.m21918r(2);
        boolean m21907g = this.f18928i.m21907g();
        this.f18928i.m21918r(2);
        int m21908h = this.f18928i.m21908h(3);
        boolean m21907g2 = this.f18928i.m21907g();
        int m21908h2 = this.f18928i.m21908h(7);
        int m21908h3 = this.f18928i.m21908h(8);
        int m21908h4 = this.f18928i.m21908h(4);
        int m21908h5 = this.f18928i.m21908h(4);
        this.f18928i.m21918r(2);
        this.f18928i.m21918r(6);
        this.f18928i.m21918r(2);
        bVar.m22047f(m21907g, m21908h, m21907g2, m21908h2, m21908h3, m21908h5, m21908h4, this.f18928i.m21908h(3), this.f18928i.m21908h(3));
    }

    /* renamed from: x */
    public final void m22034x(int i7) {
        if (i7 == 127) {
            this.f18933n.m22042a((char) 9835);
        } else {
            this.f18933n.m22042a((char) (i7 & 255));
        }
    }

    /* renamed from: y */
    public final void m22035y(int i7) {
        this.f18933n.m22042a((char) (i7 & 255));
    }

    /* renamed from: z */
    public final void m22036z(int i7) {
        if (i7 == 32) {
            this.f18933n.m22042a(' ');
        }
        if (i7 == 33) {
            this.f18933n.m22042a((char) 160);
            return;
        }
        if (i7 == 37) {
            this.f18933n.m22042a((char) 8230);
            return;
        }
        if (i7 == 42) {
            this.f18933n.m22042a((char) 352);
            return;
        }
        if (i7 == 44) {
            this.f18933n.m22042a((char) 338);
            return;
        }
        if (i7 == 63) {
            this.f18933n.m22042a((char) 376);
            return;
        }
        if (i7 == 57) {
            this.f18933n.m22042a((char) 8482);
            return;
        }
        if (i7 == 58) {
            this.f18933n.m22042a((char) 353);
            return;
        }
        if (i7 == 60) {
            this.f18933n.m22042a((char) 339);
            return;
        }
        if (i7 == 61) {
            this.f18933n.m22042a((char) 8480);
            return;
        }
        switch (i7) {
            case 48:
                this.f18933n.m22042a((char) 9608);
                break;
            case 49:
                this.f18933n.m22042a((char) 8216);
                break;
            case 50:
                this.f18933n.m22042a((char) 8217);
                break;
            case 51:
                this.f18933n.m22042a((char) 8220);
                break;
            case 52:
                this.f18933n.m22042a((char) 8221);
                break;
            case 53:
                this.f18933n.m22042a((char) 8226);
                break;
            default:
                switch (i7) {
                    case 118:
                        this.f18933n.m22042a((char) 8539);
                        break;
                    case 119:
                        this.f18933n.m22042a((char) 8540);
                        break;
                    case 120:
                        this.f18933n.m22042a((char) 8541);
                        break;
                    case 121:
                        this.f18933n.m22042a((char) 8542);
                        break;
                    case 122:
                        this.f18933n.m22042a((char) 9474);
                        break;
                    case 123:
                        this.f18933n.m22042a((char) 9488);
                        break;
                    case 124:
                        this.f18933n.m22042a((char) 9492);
                        break;
                    case 125:
                        this.f18933n.m22042a((char) 9472);
                        break;
                    case 126:
                        this.f18933n.m22042a((char) 9496);
                        break;
                    case 127:
                        this.f18933n.m22042a((char) 9484);
                        break;
                    default:
                        AbstractC5346o.m21867h("Cea708Decoder", "Invalid G2 character: " + i7);
                        break;
                }
        }
    }
}
