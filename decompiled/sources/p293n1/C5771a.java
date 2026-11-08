package p293n1;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2922e;
import p178Z2.AbstractC3033v;
import p248i0.C4503a;
import p249i1.AbstractC4528s;
import p249i1.C4514e;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p259j0.InterfaceC5338g;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public final class C5771a implements InterfaceC4529t {

    /* renamed from: d */
    public static final Pattern f21050d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e */
    public static final Pattern f21051e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a */
    public final StringBuilder f21052a = new StringBuilder();

    /* renamed from: b */
    public final ArrayList f21053b = new ArrayList();

    /* renamed from: c */
    public final C5357z f21054c = new C5357z();

    /* renamed from: e */
    private Charset m24417e(C5357z c5357z) {
        Charset m21934O = c5357z.m21934O();
        return m21934O != null ? m21934O : AbstractC2922e.f9010c;
    }

    /* renamed from: f */
    public static float m24418f(int i7) {
        if (i7 == 0) {
            return 0.08f;
        }
        if (i7 == 1) {
            return 0.5f;
        }
        if (i7 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static long m24419g(Matcher matcher, int i7) {
        String group = matcher.group(i7 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) AbstractC5332a.m21800e(matcher.group(i7 + 2))) * 60000) + (Long.parseLong((String) AbstractC5332a.m21800e(matcher.group(i7 + 3))) * 1000);
        String group2 = matcher.group(i7 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: a */
    public /* synthetic */ InterfaceC4520k mo19257a(byte[] bArr, int i7, int i8) {
        return AbstractC4528s.m19255a(this, bArr, i7, i8);
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: b */
    public void mo19258b(byte[] bArr, int i7, int i8, InterfaceC4529t.b bVar, InterfaceC5338g interfaceC5338g) {
        String str;
        InterfaceC5338g interfaceC5338g2;
        String m21960s;
        String str2;
        String str3;
        InterfaceC5338g interfaceC5338g3;
        InterfaceC5338g interfaceC5338g4 = interfaceC5338g;
        String str4 = "SubripParser";
        this.f21054c.m21937R(bArr, i7 + i8);
        this.f21054c.m21939T(i7);
        Charset m24417e = m24417e(this.f21054c);
        ArrayList arrayList = (bVar.f16174a == -9223372036854775807L || !bVar.f16175b) ? null : new ArrayList();
        while (true) {
            String m21960s2 = this.f21054c.m21960s(m24417e);
            if (m21960s2 == null) {
                break;
            }
            if (m21960s2.length() != 0) {
                try {
                    Integer.parseInt(m21960s2);
                    m21960s = this.f21054c.m21960s(m24417e);
                } catch (NumberFormatException unused) {
                    str = str4;
                    interfaceC5338g2 = interfaceC5338g4;
                    AbstractC5346o.m21867h(str, "Skipping invalid index: " + m21960s2);
                }
                if (m21960s == null) {
                    AbstractC5346o.m21867h(str4, "Unexpected end");
                    break;
                }
                Matcher matcher = f21050d.matcher(m21960s);
                if (matcher.matches()) {
                    long m24419g = m24419g(matcher, 1);
                    long m24419g2 = m24419g(matcher, 6);
                    int i9 = 0;
                    this.f21052a.setLength(0);
                    this.f21053b.clear();
                    String m21960s3 = this.f21054c.m21960s(m24417e);
                    while (!TextUtils.isEmpty(m21960s3)) {
                        if (this.f21052a.length() > 0) {
                            this.f21052a.append("<br>");
                        }
                        this.f21052a.append(m24421h(m21960s3, this.f21053b));
                        m21960s3 = this.f21054c.m21960s(m24417e);
                    }
                    Spanned fromHtml = Html.fromHtml(this.f21052a.toString());
                    while (true) {
                        if (i9 >= this.f21053b.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = (String) this.f21053b.get(i9);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i9++;
                        }
                    }
                    long j7 = bVar.f16174a;
                    if (j7 == -9223372036854775807L || m24419g >= j7) {
                        interfaceC5338g3 = interfaceC5338g;
                        interfaceC5338g3.accept(new C4514e(AbstractC3033v.m11051u(m24420d(fromHtml, str3)), m24419g, m24419g2 - m24419g));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new C4514e(AbstractC3033v.m11051u(m24420d(fromHtml, str3)), m24419g, m24419g2 - m24419g));
                        }
                        interfaceC5338g3 = interfaceC5338g;
                    }
                    interfaceC5338g4 = interfaceC5338g3;
                    str4 = str2;
                } else {
                    String str5 = str4;
                    interfaceC5338g2 = interfaceC5338g4;
                    str = str5;
                    AbstractC5346o.m21867h(str, "Skipping invalid timing: " + m21960s);
                    interfaceC5338g4 = interfaceC5338g2;
                    str4 = str;
                }
            }
        }
        InterfaceC5338g interfaceC5338g5 = interfaceC5338g4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC5338g5.accept((C4514e) it.next());
            }
        }
    }

    @Override // p249i1.InterfaceC4529t
    /* renamed from: c */
    public int mo19259c() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: d */
    public final C4503a m24420d(Spanned spanned, String str) {
        char c7;
        char c8;
        C4503a.b m19201o = new C4503a.b().m19201o(spanned);
        if (str == null) {
            return m19201o.m19187a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0 || c7 == 1 || c7 == 2) {
            m19201o.m19198l(0);
        } else if (c7 == 3 || c7 == 4 || c7 == 5) {
            m19201o.m19198l(2);
        } else {
            m19201o.m19198l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        if (c8 == 0 || c8 == 1 || c8 == 2) {
            m19201o.m19195i(2);
        } else if (c8 == 3 || c8 == 4 || c8 == 5) {
            m19201o.m19195i(0);
        } else {
            m19201o.m19195i(1);
        }
        return m19201o.m19197k(m24418f(m19201o.m19190d())).m19194h(m24418f(m19201o.m19189c()), 0).m19187a();
    }

    /* renamed from: h */
    public final String m24421h(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f21051e.matcher(trim);
        int i7 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i7;
            int length = group.length();
            sb.replace(start, start + length, StringUtils.EMPTY);
            i7 += length;
        }
        return sb.toString();
    }

    @Override // p249i1.InterfaceC4529t
    public /* synthetic */ void reset() {
        AbstractC4528s.m19256b(this);
    }
}
