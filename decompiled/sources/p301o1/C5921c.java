package p301o1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import p248i0.C4503a;
import p259j0.AbstractC5332a;

/* renamed from: o1.c */
/* loaded from: classes.dex */
public final class C5921c {

    /* renamed from: a */
    public final String f21334a;

    /* renamed from: b */
    public final String f21335b;

    /* renamed from: c */
    public final boolean f21336c;

    /* renamed from: d */
    public final long f21337d;

    /* renamed from: e */
    public final long f21338e;

    /* renamed from: f */
    public final C5925g f21339f;

    /* renamed from: g */
    public final String[] f21340g;

    /* renamed from: h */
    public final String f21341h;

    /* renamed from: i */
    public final String f21342i;

    /* renamed from: j */
    public final C5921c f21343j;

    /* renamed from: k */
    public final HashMap f21344k;

    /* renamed from: l */
    public final HashMap f21345l;

    /* renamed from: m */
    public List f21346m;

    public C5921c(String str, String str2, long j7, long j8, C5925g c5925g, String[] strArr, String str3, String str4, C5921c c5921c) {
        this.f21334a = str;
        this.f21335b = str2;
        this.f21342i = str4;
        this.f21339f = c5925g;
        this.f21340g = strArr;
        this.f21336c = str2 != null;
        this.f21337d = j7;
        this.f21338e = j8;
        this.f21341h = (String) AbstractC5332a.m21800e(str3);
        this.f21343j = c5921c;
        this.f21344k = new HashMap();
        this.f21345l = new HashMap();
    }

    /* renamed from: c */
    public static C5921c m24880c(String str, long j7, long j8, C5925g c5925g, String[] strArr, String str2, String str3, C5921c c5921c) {
        return new C5921c(str, null, j7, j8, c5925g, strArr, str2, str3, c5921c);
    }

    /* renamed from: d */
    public static C5921c m24881d(String str) {
        return new C5921c(null, AbstractC5924f.m24912b(str), -9223372036854775807L, -9223372036854775807L, null, null, StringUtils.EMPTY, null, null);
    }

    /* renamed from: e */
    public static void m24882e(SpannableStringBuilder spannableStringBuilder) {
        for (C5919a c5919a : (C5919a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5919a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c5919a), spannableStringBuilder.getSpanEnd(c5919a), StringUtils.EMPTY);
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                int i9 = i8;
                while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                    i9++;
                }
                int i10 = i9 - i8;
                if (i10 > 0) {
                    spannableStringBuilder.delete(i7, i10 + i7);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
            if (spannableStringBuilder.charAt(i11) == '\n') {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i12) == ' ') {
                    spannableStringBuilder.delete(i12, i11 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    spannableStringBuilder.delete(i13, i14);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* renamed from: k */
    public static SpannableStringBuilder m24883k(String str, Map map) {
        if (!map.containsKey(str)) {
            C4503a.b bVar = new C4503a.b();
            bVar.m19201o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) AbstractC5332a.m21800e(((C4503a.b) map.get(str)).m19191e());
    }

    /* renamed from: a */
    public void m24884a(C5921c c5921c) {
        if (this.f21346m == null) {
            this.f21346m = new ArrayList();
        }
        this.f21346m.add(c5921c);
    }

    /* renamed from: b */
    public final void m24885b(Map map, C4503a.b bVar, int i7, int i8, int i9) {
        C5925g m24916f = AbstractC5924f.m24916f(this.f21339f, this.f21340g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m19191e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.m19201o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (m24916f != null) {
            AbstractC5924f.m24911a(spannableStringBuilder2, i7, i8, m24916f, this.f21343j, map, i9);
            if ("p".equals(this.f21334a)) {
                if (m24916f.m24938k() != Float.MAX_VALUE) {
                    bVar.m19199m((m24916f.m24938k() * (-90.0f)) / 100.0f);
                }
                if (m24916f.m24940m() != null) {
                    bVar.m19202p(m24916f.m24940m());
                }
                if (m24916f.m24935h() != null) {
                    bVar.m19196j(m24916f.m24935h());
                }
            }
        }
    }

    /* renamed from: f */
    public C5921c m24886f(int i7) {
        List list = this.f21346m;
        if (list != null) {
            return (C5921c) list.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m24887g() {
        List list = this.f21346m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List m24888h(long j7, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        m24893n(j7, this.f21341h, arrayList);
        TreeMap treeMap = new TreeMap();
        m24895p(j7, false, this.f21341h, treeMap);
        m24894o(j7, map, map2, this.f21341h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C5923e c5923e = (C5923e) AbstractC5332a.m21800e((C5923e) map2.get(pair.first));
                arrayList2.add(new C4503a.b().m19192f(decodeByteArray).m19197k(c5923e.f21362b).m19198l(0).m19194h(c5923e.f21363c, 0).m19195i(c5923e.f21365e).m19200n(c5923e.f21366f).m19193g(c5923e.f21367g).m19204r(c5923e.f21370j).m19187a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C5923e c5923e2 = (C5923e) AbstractC5332a.m21800e((C5923e) map2.get(entry.getKey()));
            C4503a.b bVar = (C4503a.b) entry.getValue();
            m24882e((SpannableStringBuilder) AbstractC5332a.m21800e(bVar.m19191e()));
            bVar.m19194h(c5923e2.f21363c, c5923e2.f21364d);
            bVar.m19195i(c5923e2.f21365e);
            bVar.m19197k(c5923e2.f21362b);
            bVar.m19200n(c5923e2.f21366f);
            bVar.m19203q(c5923e2.f21369i, c5923e2.f21368h);
            bVar.m19204r(c5923e2.f21370j);
            arrayList2.add(bVar.m19187a());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void m24889i(TreeSet treeSet, boolean z6) {
        boolean equals = "p".equals(this.f21334a);
        boolean equals2 = "div".equals(this.f21334a);
        if (z6 || equals || (equals2 && this.f21342i != null)) {
            long j7 = this.f21337d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.f21338e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f21346m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f21346m.size(); i7++) {
            ((C5921c) this.f21346m.get(i7)).m24889i(treeSet, z6 || equals);
        }
    }

    /* renamed from: j */
    public long[] m24890j() {
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        m24889i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m24891l() {
        return this.f21340g;
    }

    /* renamed from: m */
    public boolean m24892m(long j7) {
        long j8 = this.f21337d;
        return (j8 == -9223372036854775807L && this.f21338e == -9223372036854775807L) || (j8 <= j7 && this.f21338e == -9223372036854775807L) || ((j8 == -9223372036854775807L && j7 < this.f21338e) || (j8 <= j7 && j7 < this.f21338e));
    }

    /* renamed from: n */
    public final void m24893n(long j7, String str, List list) {
        if (!StringUtils.EMPTY.equals(this.f21341h)) {
            str = this.f21341h;
        }
        if (m24892m(j7) && "div".equals(this.f21334a) && this.f21342i != null) {
            list.add(new Pair(str, this.f21342i));
            return;
        }
        for (int i7 = 0; i7 < m24887g(); i7++) {
            m24886f(i7).m24893n(j7, str, list);
        }
    }

    /* renamed from: o */
    public final void m24894o(long j7, Map map, Map map2, String str, Map map3) {
        int i7;
        if (m24892m(j7)) {
            String str2 = StringUtils.EMPTY.equals(this.f21341h) ? str : this.f21341h;
            Iterator it = this.f21345l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.f21344k.containsKey(str3) ? ((Integer) this.f21344k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    m24885b(map, (C4503a.b) AbstractC5332a.m21800e((C4503a.b) map3.get(str3)), intValue, intValue2, ((C5923e) AbstractC5332a.m21800e((C5923e) map2.get(str2))).f21370j);
                }
            }
            while (i7 < m24887g()) {
                m24886f(i7).m24894o(j7, map, map2, str2, map3);
                i7++;
            }
        }
    }

    /* renamed from: p */
    public final void m24895p(long j7, boolean z6, String str, Map map) {
        this.f21344k.clear();
        this.f21345l.clear();
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(this.f21334a)) {
            return;
        }
        if (!StringUtils.EMPTY.equals(this.f21341h)) {
            str = this.f21341h;
        }
        if (this.f21336c && z6) {
            m24883k(str, map).append((CharSequence) AbstractC5332a.m21800e(this.f21335b));
            return;
        }
        if ("br".equals(this.f21334a) && z6) {
            m24883k(str, map).append('\n');
            return;
        }
        if (m24892m(j7)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f21344k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) AbstractC5332a.m21800e(((C4503a.b) entry.getValue()).m19191e())).length()));
            }
            boolean equals = "p".equals(this.f21334a);
            for (int i7 = 0; i7 < m24887g(); i7++) {
                m24886f(i7).m24895p(j7, z6 || equals, str, map);
            }
            if (equals) {
                AbstractC5924f.m24913c(m24883k(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f21345l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) AbstractC5332a.m21800e(((C4503a.b) entry2.getValue()).m19191e())).length()));
            }
        }
    }
}
