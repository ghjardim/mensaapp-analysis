package p320q1;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p248i0.AbstractC4508f;
import p248i0.C4503a;
import p248i0.C4506d;
import p248i0.C4507e;
import p256j$.util.DesugarCollections;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p320q1.AbstractC6176e;

/* renamed from: q1.e */
/* loaded from: classes.dex */
public abstract class AbstractC6176e {

    /* renamed from: a */
    public static final Pattern f22100a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f22101b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map f22102c;

    /* renamed from: d */
    public static final Map f22103d;

    /* renamed from: q1.e$b */
    public static class b {

        /* renamed from: c */
        public static final Comparator f22104c = new Comparator() { // from class: q1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m25819e;
                m25819e = AbstractC6176e.b.m25819e((AbstractC6176e.b) obj, (AbstractC6176e.b) obj2);
                return m25819e;
            }
        };

        /* renamed from: a */
        public final c f22105a;

        /* renamed from: b */
        public final int f22106b;

        /* renamed from: e */
        public static /* synthetic */ int m25819e(b bVar, b bVar2) {
            return Integer.compare(bVar.f22105a.f22108b, bVar2.f22105a.f22108b);
        }

        public b(c cVar, int i7) {
            this.f22105a = cVar;
            this.f22106b = i7;
        }
    }

    /* renamed from: q1.e$c */
    public static final class c {

        /* renamed from: a */
        public final String f22107a;

        /* renamed from: b */
        public final int f22108b;

        /* renamed from: c */
        public final String f22109c;

        /* renamed from: d */
        public final Set f22110d;

        public c(String str, int i7, String str2, Set set) {
            this.f22108b = i7;
            this.f22107a = str;
            this.f22109c = str2;
            this.f22110d = set;
        }

        /* renamed from: a */
        public static c m25820a(String str, int i7) {
            String str2;
            String trim = str.trim();
            AbstractC5332a.m21796a(!trim.isEmpty());
            int indexOf = trim.indexOf(StringUtils.SPACE);
            if (indexOf == -1) {
                str2 = StringUtils.EMPTY;
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m21737e1 = AbstractC5330M.m21737e1(trim, "\\.");
            String str3 = m21737e1[0];
            HashSet hashSet = new HashSet();
            for (int i8 = 1; i8 < m21737e1.length; i8++) {
                hashSet.add(m21737e1[i8]);
            }
            return new c(str3, i7, str2, hashSet);
        }

        /* renamed from: b */
        public static c m25821b() {
            return new c(StringUtils.EMPTY, 0, StringUtils.EMPTY, Collections.emptySet());
        }
    }

    /* renamed from: q1.e$d */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final int f22111a;

        /* renamed from: b */
        public final C6174c f22112b;

        public d(int i7, C6174c c6174c) {
            this.f22111a = i7;
            this.f22112b = c6174c;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f22111a, dVar.f22111a);
        }
    }

    /* renamed from: q1.e$e */
    public static final class e {

        /* renamed from: c */
        public CharSequence f22115c;

        /* renamed from: a */
        public long f22113a = 0;

        /* renamed from: b */
        public long f22114b = 0;

        /* renamed from: d */
        public int f22116d = 2;

        /* renamed from: e */
        public float f22117e = -3.4028235E38f;

        /* renamed from: f */
        public int f22118f = 1;

        /* renamed from: g */
        public int f22119g = 0;

        /* renamed from: h */
        public float f22120h = -3.4028235E38f;

        /* renamed from: i */
        public int f22121i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f22122j = 1.0f;

        /* renamed from: k */
        public int f22123k = Integer.MIN_VALUE;

        /* renamed from: b */
        public static float m25823b(float f7, int i7) {
            if (f7 == -3.4028235E38f || i7 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                return f7 != -3.4028235E38f ? f7 : i7 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        public static Layout.Alignment m25824c(int i7) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            AbstractC5346o.m21867h("WebvttCueParser", "Unknown textAlignment: " + i7);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        public static float m25825d(int i7, float f7) {
            if (i7 == 0) {
                return 1.0f - f7;
            }
            if (i7 == 1) {
                return f7 <= 0.5f ? f7 * 2.0f : (1.0f - f7) * 2.0f;
            }
            if (i7 == 2) {
                return f7;
            }
            throw new IllegalStateException(String.valueOf(i7));
        }

        /* renamed from: e */
        public static float m25826e(int i7) {
            if (i7 != 4) {
                return i7 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public static int m25827f(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 3) {
                return 2;
            }
            if (i7 != 4) {
                return i7 != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C6175d m25828a() {
            return new C6175d(m25829g().m19187a(), this.f22113a, this.f22114b);
        }

        /* renamed from: g */
        public C4503a.b m25829g() {
            float f7 = this.f22120h;
            if (f7 == -3.4028235E38f) {
                f7 = m25826e(this.f22116d);
            }
            int i7 = this.f22121i;
            if (i7 == Integer.MIN_VALUE) {
                i7 = m25827f(this.f22116d);
            }
            C4503a.b m19204r = new C4503a.b().m19202p(m25824c(this.f22116d)).m19194h(m25823b(this.f22117e, this.f22118f), this.f22118f).m19195i(this.f22119g).m19197k(f7).m19198l(i7).m19200n(Math.min(this.f22122j, m25825d(i7, f7))).m19204r(this.f22123k);
            CharSequence charSequence = this.f22115c;
            if (charSequence != null) {
                m19204r.m19201o(charSequence);
            }
            return m19204r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f22102c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f22103d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m25792a(SpannableStringBuilder spannableStringBuilder, Set set, int i7, int i8) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f22102c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i7, i8, 33);
            } else {
                Map map2 = f22103d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i7, i8, 33);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m25793b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                AbstractC5346o.m21867h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    /* renamed from: c */
    public static void m25794c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int m25800i = m25800i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f22104c);
        int i7 = cVar.f22108b;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if ("rt".equals(((b) arrayList.get(i9)).f22105a.f22107a)) {
                b bVar = (b) arrayList.get(i9);
                int m25798g = m25798g(m25800i(list2, str, bVar.f22105a), m25800i, 1);
                int i10 = bVar.f22105a.f22108b - i8;
                int i11 = bVar.f22106b - i8;
                CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                spannableStringBuilder.delete(i10, i11);
                spannableStringBuilder.setSpan(new C4507e(subSequence.toString(), m25798g), i7, i10, 33);
                i8 += subSequence.length();
                i7 = i10;
            }
        }
    }

    /* renamed from: d */
    public static void m25795d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i7;
        int length;
        i7 = cVar.f22108b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f22107a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case "c":
                m25792a(spannableStringBuilder, cVar.f22110d, i7, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case "ruby":
                m25794c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List m25799h = m25799h(list2, str, cVar);
        for (int i8 = 0; i8 < m25799h.size(); i8++) {
            m25796e(spannableStringBuilder, ((d) m25799h.get(i8)).f22112b, i7, length);
        }
    }

    /* renamed from: e */
    public static void m25796e(SpannableStringBuilder spannableStringBuilder, C6174c c6174c, int i7, int i8) {
        if (c6174c == null) {
            return;
        }
        if (c6174c.m25774i() != -1) {
            AbstractC4508f.m19212b(spannableStringBuilder, new StyleSpan(c6174c.m25774i()), i7, i8, 33);
        }
        if (c6174c.m25777l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i7, i8, 33);
        }
        if (c6174c.m25778m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i8, 33);
        }
        if (c6174c.m25776k()) {
            AbstractC4508f.m19212b(spannableStringBuilder, new ForegroundColorSpan(c6174c.m25768c()), i7, i8, 33);
        }
        if (c6174c.m25775j()) {
            AbstractC4508f.m19212b(spannableStringBuilder, new BackgroundColorSpan(c6174c.m25766a()), i7, i8, 33);
        }
        if (c6174c.m25769d() != null) {
            AbstractC4508f.m19212b(spannableStringBuilder, new TypefaceSpan(c6174c.m25769d()), i7, i8, 33);
        }
        int m25771f = c6174c.m25771f();
        if (m25771f == 1) {
            AbstractC4508f.m19212b(spannableStringBuilder, new AbsoluteSizeSpan((int) c6174c.m25770e(), true), i7, i8, 33);
        } else if (m25771f == 2) {
            AbstractC4508f.m19212b(spannableStringBuilder, new RelativeSizeSpan(c6174c.m25770e()), i7, i8, 33);
        } else if (m25771f == 3) {
            AbstractC4508f.m19212b(spannableStringBuilder, new RelativeSizeSpan(c6174c.m25770e() / 100.0f), i7, i8, 33);
        }
        if (c6174c.m25767b()) {
            spannableStringBuilder.setSpan(new C4506d(), i7, i8, 33);
        }
    }

    /* renamed from: f */
    public static int m25797f(String str, int i7) {
        int indexOf = str.indexOf(62, i7);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: g */
    public static int m25798g(int i7, int i8, int i9) {
        if (i7 != -1) {
            return i7;
        }
        if (i8 != -1) {
            return i8;
        }
        if (i9 != -1) {
            return i9;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static List m25799h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6174c c6174c = (C6174c) list.get(i7);
            int m25773h = c6174c.m25773h(str, cVar.f22107a, cVar.f22110d, cVar.f22109c);
            if (m25773h > 0) {
                arrayList.add(new d(m25773h, c6174c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static int m25800i(List list, String str, c cVar) {
        List m25799h = m25799h(list, str, cVar);
        for (int i7 = 0; i7 < m25799h.size(); i7++) {
            C6174c c6174c = ((d) m25799h.get(i7)).f22112b;
            if (c6174c.m25772g() != -1) {
                return c6174c.m25772g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static String m25801j(String str) {
        String trim = str.trim();
        AbstractC5332a.m21796a(!trim.isEmpty());
        return AbstractC5330M.m21740f1(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    public static boolean m25802k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static C4503a m25803l(CharSequence charSequence) {
        e eVar = new e();
        eVar.f22115c = charSequence;
        return eVar.m25829g().m19187a();
    }

    /* renamed from: m */
    public static C6175d m25804m(C5357z c5357z, List list) {
        String m21959r = c5357z.m21959r();
        if (m21959r == null) {
            return null;
        }
        Pattern pattern = f22100a;
        Matcher matcher = pattern.matcher(m21959r);
        if (matcher.matches()) {
            return m25805n(null, matcher, c5357z, list);
        }
        String m21959r2 = c5357z.m21959r();
        if (m21959r2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(m21959r2);
        if (matcher2.matches()) {
            return m25805n(m21959r.trim(), matcher2, c5357z, list);
        }
        return null;
    }

    /* renamed from: n */
    public static C6175d m25805n(String str, Matcher matcher, C5357z c5357z, List list) {
        e eVar = new e();
        try {
            eVar.f22113a = AbstractC6179h.m25835d((String) AbstractC5332a.m21800e(matcher.group(1)));
            eVar.f22114b = AbstractC6179h.m25835d((String) AbstractC5332a.m21800e(matcher.group(2)));
            m25807p((String) AbstractC5332a.m21800e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String m21959r = c5357z.m21959r();
            while (!TextUtils.isEmpty(m21959r)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(m21959r.trim());
                m21959r = c5357z.m21959r();
            }
            eVar.f22115c = m25808q(str, sb.toString(), list);
            return eVar.m25828a();
        } catch (NumberFormatException unused) {
            AbstractC5346o.m21867h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: o */
    public static C4503a.b m25806o(String str) {
        e eVar = new e();
        m25807p(str, eVar);
        return eVar.m25829g();
    }

    /* renamed from: p */
    public static void m25807p(String str, e eVar) {
        Matcher matcher = f22101b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC5332a.m21800e(matcher.group(1));
            String str3 = (String) AbstractC5332a.m21800e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m25810s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f22116d = m25813v(str3);
                } else if ("position".equals(str2)) {
                    m25812u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f22122j = AbstractC6179h.m25834c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f22123k = m25814w(str3);
                } else {
                    AbstractC5346o.m21867h("WebvttCueParser", "Unknown cue setting " + str2 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str3);
                }
            } catch (NumberFormatException unused) {
                AbstractC5346o.m21867h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    public static SpannedString m25808q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < str2.length()) {
            char charAt = str2.charAt(i7);
            if (charAt == '&') {
                i7++;
                int indexOf = str2.indexOf(59, i7);
                int indexOf2 = str2.indexOf(32, i7);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m25793b(str2.substring(i7, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) StringUtils.SPACE);
                    }
                    i7 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i7++;
            } else {
                int i8 = i7 + 1;
                if (i8 < str2.length()) {
                    boolean z6 = str2.charAt(i8) == '/';
                    i8 = m25797f(str2, i8);
                    int i9 = i8 - 2;
                    boolean z7 = str2.charAt(i9) == '/';
                    int i10 = i7 + (z6 ? 2 : 1);
                    if (!z7) {
                        i9 = i8 - 1;
                    }
                    String substring = str2.substring(i10, i9);
                    if (!substring.trim().isEmpty()) {
                        String m25801j = m25801j(substring);
                        if (m25802k(m25801j)) {
                            if (z6) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    m25795d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f22107a.equals(m25801j)) {
                                        break;
                                    }
                                }
                            } else if (!z7) {
                                arrayDeque.push(c.m25820a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i7 = i8;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m25795d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m25795d(str, c.m25821b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    public static int m25809r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                AbstractC5346o.m21867h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: s */
    public static void m25810s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f22119g = m25809r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f22117e = AbstractC6179h.m25834c(str);
            eVar.f22118f = 0;
        } else {
            eVar.f22117e = Integer.parseInt(str);
            eVar.f22118f = 1;
        }
    }

    /* renamed from: t */
    public static int m25811t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                AbstractC5346o.m21867h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: u */
    public static void m25812u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f22121i = m25811t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f22120h = AbstractC6179h.m25834c(str);
    }

    /* renamed from: v */
    public static int m25813v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                AbstractC5346o.m21867h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    public static int m25814w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        AbstractC5346o.m21867h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
