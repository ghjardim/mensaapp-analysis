package io.flutter.plugin.editing;

import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.plugin.editing.t */
/* loaded from: classes.dex */
public final class C4719t {

    /* renamed from: a */
    public CharSequence f17495a;

    /* renamed from: b */
    public CharSequence f17496b;

    /* renamed from: c */
    public int f17497c;

    /* renamed from: d */
    public int f17498d;

    /* renamed from: e */
    public int f17499e;

    /* renamed from: f */
    public int f17500f;

    /* renamed from: g */
    public int f17501g;

    /* renamed from: h */
    public int f17502h;

    public C4719t(CharSequence charSequence, int i7, int i8, CharSequence charSequence2, int i9, int i10, int i11, int i12) {
        this.f17499e = i9;
        this.f17500f = i10;
        this.f17501g = i11;
        this.f17502h = i12;
        m20401a(charSequence, charSequence2.toString(), i7, i8);
    }

    /* renamed from: a */
    public final void m20401a(CharSequence charSequence, CharSequence charSequence2, int i7, int i8) {
        this.f17495a = charSequence;
        this.f17496b = charSequence2;
        this.f17497c = i7;
        this.f17498d = i8;
    }

    /* renamed from: b */
    public JSONObject m20402b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f17495a.toString());
            jSONObject.put("deltaText", this.f17496b.toString());
            jSONObject.put("deltaStart", this.f17497c);
            jSONObject.put("deltaEnd", this.f17498d);
            jSONObject.put("selectionBase", this.f17499e);
            jSONObject.put("selectionExtent", this.f17500f);
            jSONObject.put("composingBase", this.f17501g);
            jSONObject.put("composingExtent", this.f17502h);
        } catch (JSONException e7) {
            AbstractC6917b.m28354b("TextEditingDelta", "unable to create JSONObject: " + e7);
        }
        return jSONObject;
    }

    public C4719t(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        this.f17499e = i7;
        this.f17500f = i8;
        this.f17501g = i9;
        this.f17502h = i10;
        m20401a(charSequence, StringUtils.EMPTY, -1, -1);
    }
}
