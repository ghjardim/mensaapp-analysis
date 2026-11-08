package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.firebase.storage.j */
/* loaded from: classes.dex */
public final class C3994j {

    /* renamed from: a */
    public final List f13180a;

    /* renamed from: b */
    public final List f13181b;

    /* renamed from: c */
    public final String f13182c;

    public C3994j(List list, List list2, String str) {
        this.f13180a = list;
        this.f13181b = list2;
        this.f13182c = str;
    }

    /* renamed from: a */
    public static C3994j m16017a(C3990f c3990f, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                String string = jSONArray.getString(i7);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(c3990f.m16010n(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                arrayList2.add(c3990f.m16010n(jSONArray2.getJSONObject(i8).getString("name")));
            }
        }
        return new C3994j(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    /* renamed from: b */
    public List m16018b() {
        return this.f13181b;
    }

    /* renamed from: c */
    public String m16019c() {
        return this.f13182c;
    }

    /* renamed from: d */
    public List m16020d() {
        return this.f13180a;
    }
}
