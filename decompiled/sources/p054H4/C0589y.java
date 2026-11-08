package p054H4;

import android.os.Bundle;
import io.flutter.plugin.editing.C4719t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p061I4.C0655g;
import p061I4.C0658j;
import p061I4.C0659k;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.y */
/* loaded from: classes.dex */
public class C0589y {

    /* renamed from: a */
    public final C0659k f2043a;

    /* renamed from: b */
    public f f2044b;

    /* renamed from: c */
    public final C0659k.c f2045c;

    /* renamed from: H4.y$a */
    public class a implements C0659k.c {
        public a() {
        }

        @Override // p061I4.C0659k.c
        /* renamed from: b */
        public void mo2185b(C0658j c0658j, C0659k.d dVar) {
            Object obj;
            Bundle bundle;
            if (C0589y.this.f2044b == null) {
            }
            String str = c0658j.f2254a;
            obj = c0658j.f2255b;
            AbstractC6917b.m28358f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            switch (str) {
                case "TextInput.setPlatformViewClient":
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        C0589y.this.f2044b.mo2378c(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.mo2314a(null);
                        break;
                    } catch (JSONException e7) {
                        dVar.mo2315b("error", e7.getMessage(), null);
                        return;
                    }
                case "TextInput.setEditingState":
                    try {
                        C0589y.this.f2044b.mo2384i(e.m2373a((JSONObject) obj));
                        dVar.mo2314a(null);
                        break;
                    } catch (JSONException e8) {
                        dVar.mo2315b("error", e8.getMessage(), null);
                        return;
                    }
                case "TextInput.setClient":
                    try {
                        JSONArray jSONArray = (JSONArray) obj;
                        C0589y.this.f2044b.mo2379d(jSONArray.getInt(0), b.m2366a(jSONArray.getJSONObject(1)));
                        dVar.mo2314a(null);
                        break;
                    } catch (NoSuchFieldException | JSONException e9) {
                        dVar.mo2315b("error", e9.getMessage(), null);
                        return;
                    }
                case "TextInput.hide":
                    C0589y.this.f2044b.mo2385j();
                    dVar.mo2314a(null);
                    break;
                case "TextInput.show":
                    C0589y.this.f2044b.mo2376a();
                    dVar.mo2314a(null);
                    break;
                case "TextInput.sendAppPrivateCommand":
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        C0589y.this.f2044b.mo2377b(string, bundle);
                        dVar.mo2314a(null);
                        break;
                    } catch (JSONException e10) {
                        dVar.mo2315b("error", e10.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.setEditableSizeAndTransform":
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d7 = jSONObject3.getDouble("width");
                        double d8 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i7 = 0; i7 < 16; i7++) {
                            dArr[i7] = jSONArray2.getDouble(i7);
                        }
                        C0589y.this.f2044b.mo2380e(d7, d8, dArr);
                        dVar.mo2314a(null);
                        break;
                    } catch (JSONException e11) {
                        dVar.mo2315b("error", e11.getMessage(), null);
                        return;
                    }
                case "TextInput.finishAutofillContext":
                    C0589y.this.f2044b.mo2382g(((Boolean) obj).booleanValue());
                    dVar.mo2314a(null);
                    break;
                case "TextInput.clearClient":
                    C0589y.this.f2044b.mo2383h();
                    dVar.mo2314a(null);
                    break;
                case "TextInput.requestAutofill":
                    C0589y.this.f2044b.mo2381f();
                    dVar.mo2314a(null);
                    break;
                default:
                    dVar.mo2316c();
                    break;
            }
        }
    }

    /* renamed from: H4.y$b */
    public static class b {

        /* renamed from: a */
        public final boolean f2047a;

        /* renamed from: b */
        public final boolean f2048b;

        /* renamed from: c */
        public final boolean f2049c;

        /* renamed from: d */
        public final boolean f2050d;

        /* renamed from: e */
        public final boolean f2051e;

        /* renamed from: f */
        public final d f2052f;

        /* renamed from: g */
        public final c f2053g;

        /* renamed from: h */
        public final Integer f2054h;

        /* renamed from: i */
        public final String f2055i;

        /* renamed from: j */
        public final a f2056j;

        /* renamed from: k */
        public final String[] f2057k;

        /* renamed from: l */
        public final b[] f2058l;

        /* renamed from: H4.y$b$a */
        public static class a {

            /* renamed from: a */
            public final String f2059a;

            /* renamed from: b */
            public final String[] f2060b;

            /* renamed from: c */
            public final e f2061c;

            /* renamed from: d */
            public final String f2062d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f2059a = str;
                this.f2060b = strArr;
                this.f2062d = str2;
                this.f2061c = eVar;
            }

            /* renamed from: a */
            public static a m2368a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    strArr[i7] = m2369b(jSONArray.getString(i7));
                }
                return new a(string, strArr, string2, e.m2373a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a3, code lost:
            
                if (r17.equals("familyName") == false) goto L7;
             */
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.String m2369b(java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p054H4.C0589y.b.a.m2369b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f2047a = z6;
            this.f2048b = z7;
            this.f2049c = z8;
            this.f2050d = z9;
            this.f2051e = z10;
            this.f2052f = dVar;
            this.f2053g = cVar;
            this.f2054h = num;
            this.f2055i = str;
            this.f2056j = aVar;
            this.f2057k = strArr;
            this.f2058l = bVarArr;
        }

        /* renamed from: a */
        public static b m2366a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bVarArr2[i7] = m2366a(jSONArray.getJSONObject(i7));
                }
                bVarArr = bVarArr2;
            }
            Integer m2367b = m2367b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    arrayList.add(jSONArray2.optString(i8));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.m2372f(jSONObject.getString("textCapitalization")), c.m2370a(jSONObject.getJSONObject("inputType")), m2367b, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.m2368a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Integer m2367b(java.lang.String r12) {
            /*
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r12.hashCode()
                r6 = 1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r10 = -1
                int r11 = r12.hashCode()
                switch(r11) {
                    case -810971940: goto L76;
                    case -737377923: goto L6d;
                    case -737089298: goto L62;
                    case -737080013: goto L57;
                    case -736940669: goto L4c;
                    case 469250275: goto L41;
                    case 1241689507: goto L36;
                    case 1539450297: goto L2b;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r6 = r10
                goto L80
            L1e:
                java.lang.String r6 = "TextInputAction.previous"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r6 = 8
                goto L80
            L2b:
                java.lang.String r6 = "TextInputAction.newline"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L34
                goto L1b
            L34:
                r6 = r0
                goto L80
            L36:
                java.lang.String r6 = "TextInputAction.go"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L3f
                goto L1b
            L3f:
                r6 = r1
                goto L80
            L41:
                java.lang.String r6 = "TextInputAction.search"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L4a
                goto L1b
            L4a:
                r6 = r2
                goto L80
            L4c:
                java.lang.String r6 = "TextInputAction.send"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L55
                goto L1b
            L55:
                r6 = r3
                goto L80
            L57:
                java.lang.String r6 = "TextInputAction.none"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L60
                goto L1b
            L60:
                r6 = r4
                goto L80
            L62:
                java.lang.String r6 = "TextInputAction.next"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L6b
                goto L1b
            L6b:
                r6 = r5
                goto L80
            L6d:
                java.lang.String r8 = "TextInputAction.done"
                boolean r12 = r12.equals(r8)
                if (r12 != 0) goto L80
                goto L1b
            L76:
                java.lang.String r6 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L7f
                goto L1b
            L7f:
                r6 = r8
            L80:
                switch(r6) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L99;
                    case 4: goto L94;
                    case 5: goto L8f;
                    case 6: goto L8a;
                    case 7: goto L89;
                    case 8: goto L84;
                    default: goto L83;
                }
            L83:
                return r9
            L84:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                return r12
            L89:
                return r7
            L8a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L8f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L94:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L99:
                return r7
            L9a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L9f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            La4:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p054H4.C0589y.b.m2367b(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: H4.y$c */
    public static class c {

        /* renamed from: a */
        public final g f2063a;

        /* renamed from: b */
        public final boolean f2064b;

        /* renamed from: c */
        public final boolean f2065c;

        public c(g gVar, boolean z6, boolean z7) {
            this.f2063a = gVar;
            this.f2064b = z6;
            this.f2065c = z7;
        }

        /* renamed from: a */
        public static c m2370a(JSONObject jSONObject) {
            return new c(g.m2387f(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: H4.y$d */
    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: a */
        public final String f2071a;

        d(String str) {
            this.f2071a = str;
        }

        /* renamed from: f */
        public static d m2372f(String str) {
            for (d dVar : values()) {
                if (dVar.f2071a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: H4.y$e */
    public static class e {

        /* renamed from: a */
        public final String f2072a;

        /* renamed from: b */
        public final int f2073b;

        /* renamed from: c */
        public final int f2074c;

        /* renamed from: d */
        public final int f2075d;

        /* renamed from: e */
        public final int f2076e;

        public e(String str, int i7, int i8, int i9, int i10) {
            if (!(i7 == -1 && i8 == -1) && (i7 < 0 || i8 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i7) + ", " + String.valueOf(i8) + ")");
            }
            if (!(i9 == -1 && i10 == -1) && (i9 < 0 || i9 > i10)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i9) + ", " + String.valueOf(i10) + ")");
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i9));
            }
            if (i7 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i7));
            }
            if (i8 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i8));
            }
            this.f2072a = str;
            this.f2073b = i7;
            this.f2074c = i8;
            this.f2075d = i9;
            this.f2076e = i10;
        }

        /* renamed from: a */
        public static e m2373a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        /* renamed from: b */
        public boolean m2374b() {
            int i7 = this.f2075d;
            return i7 >= 0 && this.f2076e > i7;
        }

        /* renamed from: c */
        public boolean m2375c() {
            return this.f2073b >= 0;
        }
    }

    /* renamed from: H4.y$f */
    public interface f {
        /* renamed from: a */
        void mo2376a();

        /* renamed from: b */
        void mo2377b(String str, Bundle bundle);

        /* renamed from: c */
        void mo2378c(int i7, boolean z6);

        /* renamed from: d */
        void mo2379d(int i7, b bVar);

        /* renamed from: e */
        void mo2380e(double d7, double d8, double[] dArr);

        /* renamed from: f */
        void mo2381f();

        /* renamed from: g */
        void mo2382g(boolean z6);

        /* renamed from: h */
        void mo2383h();

        /* renamed from: i */
        void mo2384i(e eVar);

        /* renamed from: j */
        void mo2385j();
    }

    /* renamed from: H4.y$g */
    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");


        /* renamed from: a */
        public final String f2091a;

        g(String str) {
            this.f2091a = str;
        }

        /* renamed from: f */
        public static g m2387f(String str) {
            for (g gVar : values()) {
                if (gVar.f2091a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public C0589y(C7146a c7146a) {
        a aVar = new a();
        this.f2045c = aVar;
        C0659k c0659k = new C0659k(c7146a, "flutter/textinput", C0655g.f2253a);
        this.f2043a = c0659k;
        c0659k.m2654e(aVar);
    }

    /* renamed from: c */
    public static HashMap m2349c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C4719t) it.next()).m20402b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    /* renamed from: d */
    public static HashMap m2350d(String str, int i7, int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i7));
        hashMap.put("selectionExtent", Integer.valueOf(i8));
        hashMap.put("composingBase", Integer.valueOf(i9));
        hashMap.put("composingExtent", Integer.valueOf(i10));
        return hashMap;
    }

    /* renamed from: b */
    public void m2351b(int i7, Map map) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'commitContent' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.commitContent", map));
    }

    /* renamed from: e */
    public void m2352e(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'done' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.done"));
    }

    /* renamed from: f */
    public void m2353f(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'go' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.go"));
    }

    /* renamed from: g */
    public void m2354g(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'newline' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.newline"));
    }

    /* renamed from: h */
    public void m2355h(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'next' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.next"));
    }

    /* renamed from: i */
    public void m2356i(int i7, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f2043a.m2652c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i7), hashMap));
    }

    /* renamed from: j */
    public void m2357j(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'previous' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.previous"));
    }

    /* renamed from: k */
    public void m2358k() {
        this.f2043a.m2652c("TextInputClient.requestExistingInputState", null);
    }

    /* renamed from: l */
    public void m2359l(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'search' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.search"));
    }

    /* renamed from: m */
    public void m2360m(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'send' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.send"));
    }

    /* renamed from: n */
    public void m2361n(f fVar) {
        this.f2044b = fVar;
    }

    /* renamed from: o */
    public void m2362o(int i7) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending 'unspecified' message.");
        this.f2043a.m2652c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.unspecified"));
    }

    /* renamed from: p */
    public void m2363p(int i7, String str, int i8, int i9, int i10, int i11) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i8 + "\nSelection end: " + i9 + "\nComposing start: " + i10 + "\nComposing end: " + i11);
        this.f2043a.m2652c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i7), m2350d(str, i8, i9, i10, i11)));
    }

    /* renamed from: q */
    public void m2364q(int i7, ArrayList arrayList) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f2043a.m2652c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i7), m2349c(arrayList)));
    }

    /* renamed from: r */
    public void m2365r(int i7, HashMap hashMap) {
        AbstractC6917b.m28358f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e eVar = (e) entry.getValue();
            hashMap2.put((String) entry.getKey(), m2350d(eVar.f2072a, eVar.f2073b, eVar.f2074c, -1, -1));
        }
        this.f2043a.m2652c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i7), hashMap2));
    }
}
