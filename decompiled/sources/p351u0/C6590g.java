package p351u0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p232g0.C4302H;
import p232g0.C4327q;
import p256j$.util.DesugarCollections;

/* renamed from: u0.g */
/* loaded from: classes.dex */
public final class C6590g extends AbstractC6591h {

    /* renamed from: n */
    public static final C6590g f23696n = new C6590g(StringUtils.EMPTY, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List f23697d;

    /* renamed from: e */
    public final List f23698e;

    /* renamed from: f */
    public final List f23699f;

    /* renamed from: g */
    public final List f23700g;

    /* renamed from: h */
    public final List f23701h;

    /* renamed from: i */
    public final List f23702i;

    /* renamed from: j */
    public final C4327q f23703j;

    /* renamed from: k */
    public final List f23704k;

    /* renamed from: l */
    public final Map f23705l;

    /* renamed from: m */
    public final List f23706m;

    /* renamed from: u0.g$a */
    public static final class a {

        /* renamed from: a */
        public final Uri f23707a;

        /* renamed from: b */
        public final C4327q f23708b;

        /* renamed from: c */
        public final String f23709c;

        /* renamed from: d */
        public final String f23710d;

        public a(Uri uri, C4327q c4327q, String str, String str2) {
            this.f23707a = uri;
            this.f23708b = c4327q;
            this.f23709c = str;
            this.f23710d = str2;
        }
    }

    /* renamed from: u0.g$b */
    public static final class b {

        /* renamed from: a */
        public final Uri f23711a;

        /* renamed from: b */
        public final C4327q f23712b;

        /* renamed from: c */
        public final String f23713c;

        /* renamed from: d */
        public final String f23714d;

        /* renamed from: e */
        public final String f23715e;

        /* renamed from: f */
        public final String f23716f;

        public b(Uri uri, C4327q c4327q, String str, String str2, String str3, String str4) {
            this.f23711a = uri;
            this.f23712b = c4327q;
            this.f23713c = str;
            this.f23714d = str2;
            this.f23715e = str3;
            this.f23716f = str4;
        }

        /* renamed from: b */
        public static b m27437b(Uri uri) {
            return new b(uri, new C4327q.b().m18250a0("0").m18240Q("application/x-mpegURL").m18234K(), null, null, null, null);
        }

        /* renamed from: a */
        public b m27438a(C4327q c4327q) {
            return new b(this.f23711a, c4327q, this.f23713c, this.f23714d, this.f23715e, this.f23716f);
        }
    }

    public C6590g(String str, List list, List list2, List list3, List list4, List list5, List list6, C4327q c4327q, List list7, boolean z6, Map map, List list8) {
        super(str, list, z6);
        this.f23697d = DesugarCollections.unmodifiableList(m27435f(list2, list3, list4, list5, list6));
        this.f23698e = DesugarCollections.unmodifiableList(list2);
        this.f23699f = DesugarCollections.unmodifiableList(list3);
        this.f23700g = DesugarCollections.unmodifiableList(list4);
        this.f23701h = DesugarCollections.unmodifiableList(list5);
        this.f23702i = DesugarCollections.unmodifiableList(list6);
        this.f23703j = c4327q;
        this.f23704k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.f23705l = DesugarCollections.unmodifiableMap(map);
        this.f23706m = DesugarCollections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m27432b(List list, List list2) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((a) list.get(i7)).f23707a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    public static List m27433d(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 < list2.size()) {
                    C4302H c4302h = (C4302H) list2.get(i9);
                    if (c4302h.f14798b == i7 && c4302h.f14799c == i8) {
                        arrayList.add(obj);
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C6590g m27434e(String str) {
        return new C6590g(StringUtils.EMPTY, Collections.emptyList(), Collections.singletonList(b.m27437b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    public static List m27435f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((b) list.get(i7)).f23711a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m27432b(list2, arrayList);
        m27432b(list3, arrayList);
        m27432b(list4, arrayList);
        m27432b(list5, arrayList);
        return arrayList;
    }

    @Override // p380y0.InterfaceC7048a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6590g mo168a(List list) {
        return new C6590g(this.f23717a, this.f23718b, m27433d(this.f23698e, 0, list), Collections.emptyList(), m27433d(this.f23700g, 1, list), m27433d(this.f23701h, 2, list), Collections.emptyList(), this.f23703j, this.f23704k, this.f23719c, this.f23705l, this.f23706m);
    }
}
