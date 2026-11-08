package p060I3;

import android.util.Base64;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.C4078t0;
import com.google.protobuf.EnumC4048e0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p067J3.C0735b0;
import p067J3.C0737c0;
import p067J3.C0748i;
import p067J3.C0762p;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1177s;
import p088M3.C1178t;
import p088M3.C1179u;
import p088M3.C1181w;
import p109P3.C1907P;
import p219e3.C4188r;
import p256j$.util.DesugarTimeZone;
import p272k4.C5413D;
import p272k4.C5419b;
import p272k4.C5438u;
import p304o4.C5940a;

/* renamed from: I3.g */
/* loaded from: classes.dex */
public class C0645g {

    /* renamed from: a */
    public final SimpleDateFormat f2219a;

    /* renamed from: b */
    public final C1907P f2220b;

    public C0645g(C1907P c1907p) {
        this.f2220b = c1907p;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f2219a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    /* renamed from: D */
    public static int m2568D(String str) {
        int i7 = 0;
        for (int i8 = 0; i8 < 9; i8++) {
            i7 *= 10;
            if (i8 < str.length()) {
                if (str.charAt(i8) < '0' || str.charAt(i8) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                i7 += str.charAt(i8) - '0';
            }
        }
        return i7;
    }

    /* renamed from: z */
    public static long m2569z(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    /* renamed from: A */
    public final void m2570A(List list, JSONObject jSONObject) {
        C1176r m2585j;
        String string;
        m2585j = m2585j(jSONObject.getJSONObject("field"));
        string = jSONObject.getString("op");
        string.hashCode();
        switch (string) {
            case "IS_NAN":
                list.add(C0762p.m3269e(m2585j, C0762p.b.EQUAL, AbstractC1184z.f3799a));
                return;
            case "IS_NULL":
                list.add(C0762p.m3269e(m2585j, C0762p.b.EQUAL, AbstractC1184z.f3800b));
                return;
            case "IS_NOT_NAN":
                list.add(C0762p.m3269e(m2585j, C0762p.b.NOT_EQUAL, AbstractC1184z.f3799a));
                return;
            case "IS_NOT_NULL":
                list.add(C0762p.m3269e(m2585j, C0762p.b.NOT_EQUAL, AbstractC1184z.f3800b));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    /* renamed from: B */
    public final C5413D m2571B(JSONObject jSONObject) {
        C5413D.b m22443x0 = C5413D.m22443x0();
        if (jSONObject.has("nullValue")) {
            m22443x0.m22472G(EnumC4048e0.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            m22443x0.m22479z(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            m22443x0.m22469D(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            m22443x0.m22467B(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            m2600y(m22443x0, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            m22443x0.m22474I(jSONObject.optString("stringValue", StringUtils.EMPTY));
        } else if (jSONObject.has("bytesValue")) {
            m22443x0.m22466A(AbstractC4055i.m16500l(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            m22443x0.m22473H(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            m2587l(m22443x0, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            m2576a(m22443x0, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else {
            if (!jSONObject.has("mapValue")) {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
            m2590o(m22443x0, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return (C5413D) m22443x0.m17059n();
    }

    /* renamed from: C */
    public final List m2572C(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            m2586k(arrayList, jSONObject);
        }
        return arrayList;
    }

    /* renamed from: E */
    public final void m2573E(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    /* renamed from: F */
    public final void m2574F(JSONObject jSONObject) {
        if (jSONObject.has(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR)) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    /* renamed from: G */
    public final void m2575G(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    /* renamed from: a */
    public final void m2576a(C5413D.b bVar, JSONArray jSONArray) {
        C5419b.b m22551j0 = C5419b.m22551j0();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                m22551j0.m22561x(m2571B(jSONArray.getJSONObject(i7)));
            }
        }
        bVar.m22477x(m22551j0);
    }

    /* renamed from: b */
    public C0643e m2577b(JSONObject jSONObject) {
        return new C0643e(jSONObject.getString("id"), jSONObject.getInt("version"), m2595t(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    /* renamed from: c */
    public C0646h m2578c(JSONObject jSONObject) {
        C1170l m4498j = C1170l.m4498j(m2591p(jSONObject.getString("name")));
        C1181w m2595t = m2595t(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                arrayList.add(optJSONArray.getString(i7));
            }
        }
        return new C0646h(m4498j, m2595t, optBoolean, arrayList);
    }

    /* renamed from: d */
    public final C0647i m2579d(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        m2575G(jSONObject2);
        C1179u m2591p = m2591p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        m2573E(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.optBoolean("allDescendants", false)) {
            str = jSONObject3.getString("collectionId");
        } else {
            m2591p = (C1179u) m2591p.m4463f(jSONObject3.getString("collectionId"));
            str = null;
        }
        C1179u c1179u = m2591p;
        String str2 = str;
        List m2572C = m2572C(jSONObject2.optJSONObject("where"));
        List m2593r = m2593r(jSONObject2.optJSONArray("orderBy"));
        C0748i m2596u = m2596u(jSONObject2.optJSONObject("startAt"));
        C0748i m2582g = m2582g(jSONObject2.optJSONObject("endAt"));
        m2574F(jSONObject2);
        return new C0647i(new C0737c0(c1179u, str2, m2572C, m2593r, m2588m(jSONObject2), C0737c0.a.LIMIT_TO_FIRST, m2596u, m2582g).m3094D(), m2589n(jSONObject));
    }

    /* renamed from: e */
    public final void m2580e(List list, JSONObject jSONObject) {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                m2586k(list, optJSONArray.getJSONObject(i7));
            }
        }
    }

    /* renamed from: f */
    public C0640b m2581f(JSONObject jSONObject) {
        C1170l m4498j = C1170l.m4498j(m2591p(jSONObject.getString("name")));
        C1181w m2595t = m2595t(jSONObject.get("updateTime"));
        C5413D.b m22443x0 = C5413D.m22443x0();
        m2590o(m22443x0, jSONObject.getJSONObject("fields"));
        return new C0640b(C1177s.m4538p(m4498j, m2595t, C1178t.m4551g(m22443x0.m22476w().m22737d0())));
    }

    /* renamed from: g */
    public final C0748i m2582g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C0748i(m2594s(jSONObject), !jSONObject.optBoolean("before", false));
    }

    /* renamed from: h */
    public final void m2583h(List list, JSONObject jSONObject) {
        list.add(C0762p.m3269e(m2585j(jSONObject.getJSONObject("field")), m2584i(jSONObject.getString("op")), m2571B(jSONObject.getJSONObject(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR))));
    }

    /* renamed from: i */
    public final C0762p.b m2584i(String str) {
        return C0762p.b.valueOf(str);
    }

    /* renamed from: j */
    public final C1176r m2585j(JSONObject jSONObject) {
        return C1176r.m4533v(jSONObject.getString("fieldPath"));
    }

    /* renamed from: k */
    public final void m2586k(List list, JSONObject jSONObject) {
        if (jSONObject.has("compositeFilter")) {
            m2580e(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            m2583h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            m2570A(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    /* renamed from: l */
    public final void m2587l(C5413D.b bVar, JSONObject jSONObject) {
        bVar.m22468C(C5940a.m24961f0().m24966w(jSONObject.optDouble("latitude")).m24967x(jSONObject.optDouble("longitude")));
    }

    /* renamed from: m */
    public final int m2588m(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        return optJSONObject != null ? optJSONObject.optInt(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, -1) : jSONObject.optInt("limit", -1);
    }

    /* renamed from: n */
    public final C0737c0.a m2589n(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return C0737c0.a.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return C0737c0.a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    /* renamed from: o */
    public final void m2590o(C5413D.b bVar, JSONObject jSONObject) {
        C5438u.b m22735j0 = C5438u.m22735j0();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                m22735j0.m22742y(next, m2571B(jSONObject.getJSONObject(next)));
            }
        }
        bVar.m22470E(m22735j0);
    }

    /* renamed from: p */
    public final C1179u m2591p(String str) {
        C1179u m4565v = C1179u.m4565v(str);
        if (this.f2220b.m6680c0(m4565v)) {
            return (C1179u) m4565v.m4472r(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    /* renamed from: q */
    public C0648j m2592q(JSONObject jSONObject) {
        return new C0648j(jSONObject.getString("name"), m2579d(jSONObject.getJSONObject("bundledQuery")), m2595t(jSONObject.get("readTime")));
    }

    /* renamed from: r */
    public final List m2593r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                arrayList.add(C0735b0.m3084d(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? C0735b0.a.ASCENDING : C0735b0.a.DESCENDING, m2585j(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public final List m2594s(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                arrayList.add(m2571B(optJSONArray.getJSONObject(i7)));
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public final C1181w m2595t(Object obj) {
        return new C1181w(m2597v(obj));
    }

    /* renamed from: u */
    public final C0748i m2596u(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C0748i(m2594s(jSONObject), jSONObject.optBoolean("before", false));
    }

    /* renamed from: v */
    public final C4188r m2597v(Object obj) {
        if (obj instanceof String) {
            return m2598w((String) obj);
        }
        if (obj instanceof JSONObject) {
            return m2599x((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    /* renamed from: w */
    public final C4188r m2598w(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: " + str);
            }
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            int i7 = 0;
            String substring = str.substring(0, indexOf2);
            String str2 = StringUtils.EMPTY;
            int indexOf3 = substring.indexOf(46);
            if (indexOf3 != -1) {
                String substring2 = substring.substring(0, indexOf3);
                str2 = substring.substring(indexOf3 + 1);
                substring = substring2;
            }
            long time = this.f2219a.parse(substring).getTime() / 1000;
            if (!str2.isEmpty()) {
                i7 = m2568D(str2);
            }
            if (str.charAt(indexOf2) != 'Z') {
                long m2569z = m2569z(str.substring(indexOf2 + 1));
                time = str.charAt(indexOf2) == '+' ? time - m2569z : time + m2569z;
            } else if (str.length() != indexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
            }
            return new C4188r(time, i7);
        } catch (ParseException e7) {
            throw new IllegalArgumentException("Failed to parse timestamp", e7);
        }
    }

    /* renamed from: x */
    public final C4188r m2599x(JSONObject jSONObject) {
        return new C4188r(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    /* renamed from: y */
    public final void m2600y(C5413D.b bVar, Object obj) {
        C4188r m2597v = m2597v(obj);
        bVar.m22475J(C4078t0.m16930f0().m16936x(m2597v.m17567h()).m16935w(m2597v.m17566f()));
    }
}
