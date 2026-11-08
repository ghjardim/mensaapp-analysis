package p054H4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.mime.MimeTypes;
import org.json.JSONArray;
import org.json.JSONObject;
import p061I4.C0655g;
import p061I4.C0659k;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.o */
/* loaded from: classes.dex */
public class C0579o {

    /* renamed from: a */
    public final C0659k f1887a;

    /* renamed from: b */
    public h f1888b;

    /* renamed from: c */
    public final C0659k.c f1889c;

    /* renamed from: H4.o$a */
    public class a implements C0659k.c {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x014b A[Catch: JSONException -> 0x003f, TryCatch #1 {JSONException -> 0x003f, blocks: (B:7:0x002b, B:8:0x002f, B:13:0x00df, B:15:0x00e4, B:17:0x00f4, B:19:0x010d, B:21:0x0121, B:31:0x0125, B:24:0x013f, B:26:0x014b, B:28:0x0158, B:33:0x012a, B:34:0x015d, B:36:0x016b, B:38:0x01a1, B:40:0x01af, B:57:0x0241, B:50:0x025d, B:82:0x0198, B:68:0x01d6, B:75:0x01f8, B:47:0x0218, B:89:0x0239, B:61:0x0255, B:54:0x0271, B:91:0x0034, B:94:0x0042, B:97:0x004d, B:100:0x0059, B:103:0x0065, B:106:0x0070, B:109:0x007b, B:112:0x0085, B:115:0x008f, B:118:0x0099, B:121:0x00a3, B:124:0x00ad, B:127:0x00b8, B:130:0x00c3, B:133:0x00ce, B:43:0x0201), top: B:6:0x002b, inners: #0, #3, #7, #11 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0158 A[Catch: JSONException -> 0x003f, TryCatch #1 {JSONException -> 0x003f, blocks: (B:7:0x002b, B:8:0x002f, B:13:0x00df, B:15:0x00e4, B:17:0x00f4, B:19:0x010d, B:21:0x0121, B:31:0x0125, B:24:0x013f, B:26:0x014b, B:28:0x0158, B:33:0x012a, B:34:0x015d, B:36:0x016b, B:38:0x01a1, B:40:0x01af, B:57:0x0241, B:50:0x025d, B:82:0x0198, B:68:0x01d6, B:75:0x01f8, B:47:0x0218, B:89:0x0239, B:61:0x0255, B:54:0x0271, B:91:0x0034, B:94:0x0042, B:97:0x004d, B:100:0x0059, B:103:0x0065, B:106:0x0070, B:109:0x007b, B:112:0x0085, B:115:0x008f, B:118:0x0099, B:121:0x00a3, B:124:0x00ad, B:127:0x00b8, B:130:0x00c3, B:133:0x00ce, B:43:0x0201), top: B:6:0x002b, inners: #0, #3, #7, #11 }] */
        @Override // p061I4.C0659k.c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo2185b(p061I4.C0658j r6, p061I4.C0659k.d r7) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p054H4.C0579o.a.mo2185b(I4.j, I4.k$d):void");
        }
    }

    /* renamed from: H4.o$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1891a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1892b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f1893c;

        static {
            int[] iArr = new int[k.values().length];
            f1893c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1893c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1893c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1893c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f1892b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1892b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f1891a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1891a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1891a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1891a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: H4.o$c */
    public static class c {

        /* renamed from: a */
        public final int f1894a;

        /* renamed from: b */
        public final String f1895b;

        public c(int i7, String str) {
            this.f1894a = i7;
            this.f1895b = str;
        }
    }

    /* renamed from: H4.o$d */
    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: a */
        public String f1899a;

        d(String str) {
            this.f1899a = str;
        }

        /* renamed from: f */
        public static d m2229f(String str) {
            for (d dVar : values()) {
                if (dVar.f1899a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: H4.o$e */
    public enum e {
        PLAIN_TEXT(MimeTypes.PLAIN_TEXT);


        /* renamed from: a */
        public String f1902a;

        e(String str) {
            this.f1902a = str;
        }

        /* renamed from: f */
        public static e m2231f(String str) {
            for (e eVar : values()) {
                if (eVar.f1902a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: H4.o$f */
    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: a */
        public String f1908a;

        f(String str) {
            this.f1908a = str;
        }

        /* renamed from: f */
        public static f m2233f(String str) {
            for (f fVar : values()) {
                if (fVar.f1908a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: H4.o$g */
    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: a */
        public final String f1915a;

        g(String str) {
            this.f1915a = str;
        }

        /* renamed from: f */
        public static g m2235f(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f1915a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: H4.o$h */
    public interface h {
        /* renamed from: b */
        void mo2236b();

        /* renamed from: f */
        void mo2237f(boolean z6);

        /* renamed from: g */
        void mo2238g(k kVar);

        /* renamed from: h */
        void mo2239h(List list);

        /* renamed from: i */
        void mo2240i(g gVar);

        /* renamed from: j */
        void mo2241j(String str);

        /* renamed from: k */
        void mo2242k(String str);

        /* renamed from: l */
        void mo2243l(i iVar);

        /* renamed from: m */
        void mo2244m();

        /* renamed from: n */
        void mo2245n();

        /* renamed from: o */
        void mo2246o(int i7);

        /* renamed from: p */
        CharSequence mo2247p(e eVar);

        /* renamed from: q */
        boolean mo2248q();

        /* renamed from: r */
        void mo2249r(j jVar);

        /* renamed from: s */
        void mo2250s(c cVar);
    }

    /* renamed from: H4.o$i */
    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: a */
        public final String f1919a;

        i(String str) {
            this.f1919a = str;
        }

        /* renamed from: f */
        public static i m2252f(String str) {
            for (i iVar : values()) {
                if (iVar.f1919a.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: H4.o$j */
    public static class j {

        /* renamed from: a */
        public final Integer f1920a;

        /* renamed from: b */
        public final d f1921b;

        /* renamed from: c */
        public final Boolean f1922c;

        /* renamed from: d */
        public final Integer f1923d;

        /* renamed from: e */
        public final d f1924e;

        /* renamed from: f */
        public final Integer f1925f;

        /* renamed from: g */
        public final Boolean f1926g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f1920a = num;
            this.f1921b = dVar;
            this.f1922c = bool;
            this.f1923d = num2;
            this.f1924e = dVar2;
            this.f1925f = num3;
            this.f1926g = bool2;
        }
    }

    /* renamed from: H4.o$k */
    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: a */
        public String f1932a;

        k(String str) {
            this.f1932a = str;
        }

        /* renamed from: f */
        public static k m2254f(String str) {
            for (k kVar : values()) {
                if (kVar.f1932a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* renamed from: H4.o$l */
    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: a */
        public String f1936a;

        l(String str) {
            this.f1936a = str;
        }

        /* renamed from: f */
        public static l m2256f(String str) {
            for (l lVar : values()) {
                if (lVar.f1936a.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public C0579o(C7146a c7146a) {
        a aVar = new a();
        this.f1889c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/platform", C0655g.f2253a);
        this.f1887a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: g */
    public final c m2221g(JSONObject jSONObject) {
        int i7 = jSONObject.getInt("primaryColor");
        if (i7 != 0) {
            i7 |= -16777216;
        }
        return new c(i7, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2222h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            H4.o$f r4 = p054H4.C0579o.f.m2233f(r4)
            int[] r8 = p054H4.C0579o.b.f1891a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p054H4.C0579o.m2222h(org.json.JSONArray):int");
    }

    /* renamed from: i */
    public final j m2223i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.m2229f(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.m2229f(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* renamed from: j */
    public final k m2224j(String str) {
        int i7 = b.f1893c[k.m2254f(str).ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* renamed from: k */
    public final List m2225k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            int i8 = b.f1892b[l.m2256f(jSONArray.getString(i7)).ordinal()];
            if (i8 == 1) {
                arrayList.add(l.TOP_OVERLAYS);
            } else if (i8 == 2) {
                arrayList.add(l.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public void m2226l(h hVar) {
        this.f1888b = hVar;
    }

    /* renamed from: m */
    public void m2227m(boolean z6) {
        AbstractC6917b.m28358f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f1887a.m2652c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z6)));
    }
}
