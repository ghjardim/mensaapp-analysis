package p285m1;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import p171Y2.AbstractC2920c;
import p171Y2.AbstractC2922e;
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
import p285m1.C5566c;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class C5565b implements InterfaceC4529t {

    /* renamed from: g */
    public static final Pattern f20108g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a */
    public final boolean f20109a;

    /* renamed from: b */
    public final C5564a f20110b;

    /* renamed from: d */
    public Map f20112d;

    /* renamed from: e */
    public float f20113e = -3.4028235E38f;

    /* renamed from: f */
    public float f20114f = -3.4028235E38f;

    /* renamed from: c */
    public final C5357z f20111c = new C5357z();

    public C5565b(List list) {
        if (list == null || list.isEmpty()) {
            this.f20109a = false;
            this.f20110b = null;
            return;
        }
        this.f20109a = true;
        String m21687I = AbstractC5330M.m21687I((byte[]) list.get(0));
        AbstractC5332a.m21796a(m21687I.startsWith("Format:"));
        this.f20110b = (C5564a) AbstractC5332a.m21800e(C5564a.m23308a(m21687I));
        m23320j(new C5357z((byte[]) list.get(1)), AbstractC2922e.f9010c);
    }

    /* renamed from: d */
    public static int m23309d(long j7, List list, List list2) {
        int i7;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j7) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j7) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        list.add(i7, Long.valueOf(j7));
        list2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i7 - 1)));
        return i7;
    }

    /* renamed from: e */
    public static float m23310e(int i7) {
        if (i7 == 0) {
            return 0.05f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: f */
    public static C4503a m23311f(String str, C5566c c5566c, C5566c.b bVar, float f7, float f8) {
        SpannableString spannableString = new SpannableString(str);
        C4503a.b m19201o = new C4503a.b().m19201o(spannableString);
        if (c5566c != null) {
            if (c5566c.f20117c != null) {
                spannableString.setSpan(new ForegroundColorSpan(c5566c.f20117c.intValue()), 0, spannableString.length(), 33);
            }
            if (c5566c.f20124j == 3 && c5566c.f20118d != null) {
                spannableString.setSpan(new BackgroundColorSpan(c5566c.f20118d.intValue()), 0, spannableString.length(), 33);
            }
            float f9 = c5566c.f20119e;
            if (f9 != -3.4028235E38f && f8 != -3.4028235E38f) {
                m19201o.m19203q(f9 / f8, 1);
            }
            boolean z6 = c5566c.f20120f;
            if (z6 && c5566c.f20121g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z6) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c5566c.f20121g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c5566c.f20122h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c5566c.f20123i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i7 = bVar.f20140a;
        if (i7 == -1) {
            i7 = c5566c != null ? c5566c.f20116b : -1;
        }
        m19201o.m19202p(m23316p(i7)).m19198l(m23315o(i7)).m19195i(m23314n(i7));
        PointF pointF = bVar.f20141b;
        if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
            m19201o.m19197k(m23310e(m19201o.m19190d()));
            m19201o.m19194h(m23310e(m19201o.m19189c()), 0);
        } else {
            m19201o.m19197k(pointF.x / f7);
            m19201o.m19194h(bVar.f20141b.y / f8, 0);
        }
        return m19201o.m19187a();
    }

    /* renamed from: l */
    public static Map m23312l(C5357z c5357z, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5566c.a aVar = null;
        while (true) {
            String m21960s = c5357z.m21960s(charset);
            if (m21960s == null || (c5357z.m21942a() != 0 && c5357z.m21949h(charset) == '[')) {
                break;
            }
            if (m21960s.startsWith("Format:")) {
                aVar = C5566c.a.m23331a(m21960s);
            } else if (m21960s.startsWith("Style:")) {
                if (aVar == null) {
                    AbstractC5346o.m21867h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + m21960s);
                } else {
                    C5566c m23323b = C5566c.m23323b(m21960s, aVar);
                    if (m23323b != null) {
                        linkedHashMap.put(m23323b.f20115a, m23323b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: m */
    public static long m23313m(String str) {
        Matcher matcher = f20108g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) AbstractC5330M.m21747i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) AbstractC5330M.m21747i(matcher.group(2))) * 60000000) + (Long.parseLong((String) AbstractC5330M.m21747i(matcher.group(3))) * 1000000) + (Long.parseLong((String) AbstractC5330M.m21747i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: n */
    public static int m23314n(int i7) {
        switch (i7) {
            case -1:
                break;
            case 0:
            default:
                AbstractC5346o.m21867h("SsaParser", "Unknown alignment: " + i7);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: o */
    public static int m23315o(int i7) {
        switch (i7) {
            case -1:
                break;
            case 0:
            default:
                AbstractC5346o.m21867h("SsaParser", "Unknown alignment: " + i7);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: p */
    public static Layout.Alignment m23316p(int i7) {
        switch (i7) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC5346o.m21867h("SsaParser", "Unknown alignment: " + i7);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f20111c.m21937R(bArr, i7 + i8);
        this.f20111c.m21939T(i7);
        Charset m23317g = m23317g(this.f20111c);
        if (!this.f20109a) {
            m23320j(this.f20111c, m23317g);
        }
        m23319i(this.f20111c, arrayList3, arrayList4, m23317g);
        ArrayList arrayList5 = (bVar.f16174a == -9223372036854775807L || !bVar.f16175b) ? null : new ArrayList();
        int i9 = 0;
        while (i9 < arrayList3.size()) {
            List list = (List) arrayList3.get(i9);
            if (list.isEmpty() && i9 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i9 == arrayList3.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = ((Long) arrayList4.get(i9)).longValue();
                long longValue2 = ((Long) arrayList4.get(i9 + 1)).longValue() - ((Long) arrayList4.get(i9)).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                long j7 = bVar.f16174a;
                if (j7 == -9223372036854775807L || longValue >= j7) {
                    interfaceC5338g.accept(new C4514e(list, longValue, longValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new C4514e(list, longValue, longValue2));
                }
            }
            i9++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                interfaceC5338g.accept((C4514e) it.next());
            }
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 1;
    }

    /* renamed from: g */
    public final Charset m23317g(C5357z c5357z) {
        Charset m21934O = c5357z.m21934O();
        return m21934O != null ? m21934O : AbstractC2922e.f9010c;
    }

    /* renamed from: h */
    public final void m23318h(String str, C5564a c5564a, List list, List list2) {
        int i7;
        AbstractC5332a.m21796a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c5564a.f20107e);
        if (split.length != c5564a.f20107e) {
            AbstractC5346o.m21867h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long m23313m = m23313m(split[c5564a.f20103a]);
        if (m23313m == -9223372036854775807L) {
            AbstractC5346o.m21867h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long m23313m2 = m23313m(split[c5564a.f20104b]);
        if (m23313m2 == -9223372036854775807L) {
            AbstractC5346o.m21867h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f20112d;
        C5566c c5566c = (map == null || (i7 = c5564a.f20105c) == -1) ? null : (C5566c) map.get(split[i7].trim());
        String str2 = split[c5564a.f20106d];
        C4503a m23311f = m23311f(C5566c.b.m23335d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c5566c, C5566c.b.m23333b(str2), this.f20113e, this.f20114f);
        int m23309d = m23309d(m23313m2, list2, list);
        for (int m23309d2 = m23309d(m23313m, list2, list); m23309d2 < m23309d; m23309d2++) {
            ((List) list.get(m23309d2)).add(m23311f);
        }
    }

    /* renamed from: i */
    public final void m23319i(C5357z c5357z, List list, List list2, Charset charset) {
        C5564a c5564a = this.f20109a ? this.f20110b : null;
        while (true) {
            String m21960s = c5357z.m21960s(charset);
            if (m21960s == null) {
                return;
            }
            if (m21960s.startsWith("Format:")) {
                c5564a = C5564a.m23308a(m21960s);
            } else if (m21960s.startsWith("Dialogue:")) {
                if (c5564a == null) {
                    AbstractC5346o.m21867h("SsaParser", "Skipping dialogue line before complete format: " + m21960s);
                } else {
                    m23318h(m21960s, c5564a, list, list2);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m23320j(C5357z c5357z, Charset charset) {
        while (true) {
            String m21960s = c5357z.m21960s(charset);
            if (m21960s == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m21960s)) {
                m23321k(c5357z, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(m21960s)) {
                this.f20112d = m23312l(c5357z, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(m21960s)) {
                AbstractC5346o.m21865f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(m21960s)) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final void m23321k(C5357z c5357z, Charset charset) {
        while (true) {
            String m21960s = c5357z.m21960s(charset);
            if (m21960s == null) {
                return;
            }
            if (c5357z.m21942a() != 0 && c5357z.m21949h(charset) == '[') {
                return;
            }
            String[] split = m21960s.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            if (split.length == 2) {
                String m10515e = AbstractC2920c.m10515e(split[0].trim());
                m10515e.hashCode();
                if (m10515e.equals("playresx")) {
                    this.f20113e = Float.parseFloat(split[1].trim());
                } else if (m10515e.equals("playresy")) {
                    try {
                        this.f20114f = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
