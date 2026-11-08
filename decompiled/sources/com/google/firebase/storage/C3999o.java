package com.google.firebase.storage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
import p220e4.AbstractC4197i;

/* renamed from: com.google.firebase.storage.o */
/* loaded from: classes.dex */
public class C3999o {

    /* renamed from: a */
    public String f13191a;

    /* renamed from: b */
    public C3990f f13192b;

    /* renamed from: c */
    public C4000p f13193c;

    /* renamed from: d */
    public String f13194d;

    /* renamed from: e */
    public String f13195e;

    /* renamed from: f */
    public c f13196f;

    /* renamed from: g */
    public String f13197g;

    /* renamed from: h */
    public String f13198h;

    /* renamed from: i */
    public String f13199i;

    /* renamed from: j */
    public long f13200j;

    /* renamed from: k */
    public String f13201k;

    /* renamed from: l */
    public c f13202l;

    /* renamed from: m */
    public c f13203m;

    /* renamed from: n */
    public c f13204n;

    /* renamed from: o */
    public c f13205o;

    /* renamed from: p */
    public c f13206p;

    /* renamed from: com.google.firebase.storage.o$c */
    public static class c {

        /* renamed from: a */
        public final boolean f13209a;

        /* renamed from: b */
        public final Object f13210b;

        public c(Object obj, boolean z6) {
            this.f13209a = z6;
            this.f13210b = obj;
        }

        /* renamed from: c */
        public static c m16071c(Object obj) {
            return new c(obj, false);
        }

        /* renamed from: d */
        public static c m16072d(Object obj) {
            return new c(obj, true);
        }

        /* renamed from: a */
        public Object m16073a() {
            return this.f13210b;
        }

        /* renamed from: b */
        public boolean m16074b() {
            return this.f13209a;
        }
    }

    /* renamed from: A */
    public String m16045A() {
        return this.f13195e;
    }

    /* renamed from: B */
    public String m16046B() {
        return this.f13201k;
    }

    /* renamed from: C */
    public String m16047C() {
        return this.f13197g;
    }

    /* renamed from: D */
    public String m16048D() {
        String m16049E = m16049E();
        if (TextUtils.isEmpty(m16049E)) {
            return null;
        }
        int lastIndexOf = m16049E.lastIndexOf(47);
        return lastIndexOf != -1 ? m16049E.substring(lastIndexOf + 1) : m16049E;
    }

    /* renamed from: E */
    public String m16049E() {
        String str = this.f13191a;
        return str != null ? str : StringUtils.EMPTY;
    }

    /* renamed from: F */
    public long m16050F() {
        return this.f13200j;
    }

    /* renamed from: G */
    public long m16051G() {
        return AbstractC4197i.m17608e(this.f13199i);
    }

    /* renamed from: q */
    public JSONObject m16052q() {
        HashMap hashMap = new HashMap();
        if (this.f13196f.m16074b()) {
            hashMap.put("contentType", m16058w());
        }
        if (this.f13206p.m16074b()) {
            hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, new JSONObject((Map) this.f13206p.m16073a()));
        }
        if (this.f13202l.m16074b()) {
            hashMap.put("cacheControl", m16054s());
        }
        if (this.f13203m.m16074b()) {
            hashMap.put("contentDisposition", m16055t());
        }
        if (this.f13204n.m16074b()) {
            hashMap.put("contentEncoding", m16056u());
        }
        if (this.f13205o.m16074b()) {
            hashMap.put("contentLanguage", m16057v());
        }
        return new JSONObject(hashMap);
    }

    /* renamed from: r */
    public String m16053r() {
        return this.f13194d;
    }

    /* renamed from: s */
    public String m16054s() {
        return (String) this.f13202l.m16073a();
    }

    /* renamed from: t */
    public String m16055t() {
        return (String) this.f13203m.m16073a();
    }

    /* renamed from: u */
    public String m16056u() {
        return (String) this.f13204n.m16073a();
    }

    /* renamed from: v */
    public String m16057v() {
        return (String) this.f13205o.m16073a();
    }

    /* renamed from: w */
    public String m16058w() {
        return (String) this.f13196f.m16073a();
    }

    /* renamed from: x */
    public long m16059x() {
        return AbstractC4197i.m17608e(this.f13198h);
    }

    /* renamed from: y */
    public String m16060y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) ((Map) this.f13206p.m16073a()).get(str);
    }

    /* renamed from: z */
    public Set m16061z() {
        return ((Map) this.f13206p.m16073a()).keySet();
    }

    /* renamed from: com.google.firebase.storage.o$b */
    public static class b {

        /* renamed from: a */
        public C3999o f13207a;

        /* renamed from: b */
        public boolean f13208b;

        public b() {
            this.f13207a = new C3999o();
        }

        /* renamed from: a */
        public C3999o m16062a() {
            return new C3999o(this.f13208b);
        }

        /* renamed from: b */
        public final String m16063b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        /* renamed from: c */
        public final void m16064c(JSONObject jSONObject) {
            this.f13207a.f13195e = jSONObject.optString("generation");
            this.f13207a.f13191a = jSONObject.optString("name");
            this.f13207a.f13194d = jSONObject.optString("bucket");
            this.f13207a.f13197g = jSONObject.optString("metageneration");
            this.f13207a.f13198h = jSONObject.optString("timeCreated");
            this.f13207a.f13199i = jSONObject.optString("updated");
            this.f13207a.f13200j = jSONObject.optLong("size");
            this.f13207a.f13201k = jSONObject.optString("md5Hash");
            if (jSONObject.has(ExternalParsersConfigReaderMetKeys.METADATA_TAG) && !jSONObject.isNull(ExternalParsersConfigReaderMetKeys.METADATA_TAG)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m16070i(next, jSONObject2.getString(next));
                }
            }
            String m16063b = m16063b(jSONObject, "contentType");
            if (m16063b != null) {
                m16069h(m16063b);
            }
            String m16063b2 = m16063b(jSONObject, "cacheControl");
            if (m16063b2 != null) {
                m16065d(m16063b2);
            }
            String m16063b3 = m16063b(jSONObject, "contentDisposition");
            if (m16063b3 != null) {
                m16066e(m16063b3);
            }
            String m16063b4 = m16063b(jSONObject, "contentEncoding");
            if (m16063b4 != null) {
                m16067f(m16063b4);
            }
            String m16063b5 = m16063b(jSONObject, "contentLanguage");
            if (m16063b5 != null) {
                m16068g(m16063b5);
            }
        }

        /* renamed from: d */
        public b m16065d(String str) {
            this.f13207a.f13202l = c.m16072d(str);
            return this;
        }

        /* renamed from: e */
        public b m16066e(String str) {
            this.f13207a.f13203m = c.m16072d(str);
            return this;
        }

        /* renamed from: f */
        public b m16067f(String str) {
            this.f13207a.f13204n = c.m16072d(str);
            return this;
        }

        /* renamed from: g */
        public b m16068g(String str) {
            this.f13207a.f13205o = c.m16072d(str);
            return this;
        }

        /* renamed from: h */
        public b m16069h(String str) {
            this.f13207a.f13196f = c.m16072d(str);
            return this;
        }

        /* renamed from: i */
        public b m16070i(String str, String str2) {
            if (!this.f13207a.f13206p.m16074b()) {
                this.f13207a.f13206p = c.m16072d(new HashMap());
            }
            ((Map) this.f13207a.f13206p.m16073a()).put(str, str2);
            return this;
        }

        public b(JSONObject jSONObject, C4000p c4000p) {
            this(jSONObject);
            this.f13207a.f13193c = c4000p;
        }

        public b(JSONObject jSONObject) {
            this.f13207a = new C3999o();
            if (jSONObject != null) {
                m16064c(jSONObject);
                this.f13208b = true;
            }
        }
    }

    public C3999o() {
        this.f13191a = null;
        this.f13192b = null;
        this.f13193c = null;
        this.f13194d = null;
        this.f13195e = null;
        this.f13196f = c.m16071c(StringUtils.EMPTY);
        this.f13197g = null;
        this.f13198h = null;
        this.f13199i = null;
        this.f13201k = null;
        this.f13202l = c.m16071c(StringUtils.EMPTY);
        this.f13203m = c.m16071c(StringUtils.EMPTY);
        this.f13204n = c.m16071c(StringUtils.EMPTY);
        this.f13205o = c.m16071c(StringUtils.EMPTY);
        this.f13206p = c.m16071c(Collections.emptyMap());
    }

    public C3999o(C3999o c3999o, boolean z6) {
        this.f13191a = null;
        this.f13192b = null;
        this.f13193c = null;
        this.f13194d = null;
        this.f13195e = null;
        this.f13196f = c.m16071c(StringUtils.EMPTY);
        this.f13197g = null;
        this.f13198h = null;
        this.f13199i = null;
        this.f13201k = null;
        this.f13202l = c.m16071c(StringUtils.EMPTY);
        this.f13203m = c.m16071c(StringUtils.EMPTY);
        this.f13204n = c.m16071c(StringUtils.EMPTY);
        this.f13205o = c.m16071c(StringUtils.EMPTY);
        this.f13206p = c.m16071c(Collections.emptyMap());
        AbstractC3802r.m15129k(c3999o);
        this.f13191a = c3999o.f13191a;
        this.f13192b = c3999o.f13192b;
        this.f13193c = c3999o.f13193c;
        this.f13194d = c3999o.f13194d;
        this.f13196f = c3999o.f13196f;
        this.f13202l = c3999o.f13202l;
        this.f13203m = c3999o.f13203m;
        this.f13204n = c3999o.f13204n;
        this.f13205o = c3999o.f13205o;
        this.f13206p = c3999o.f13206p;
        if (z6) {
            this.f13201k = c3999o.f13201k;
            this.f13200j = c3999o.f13200j;
            this.f13199i = c3999o.f13199i;
            this.f13198h = c3999o.f13198h;
            this.f13197g = c3999o.f13197g;
            this.f13195e = c3999o.f13195e;
        }
    }
}
