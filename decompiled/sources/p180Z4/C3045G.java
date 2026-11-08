package p180Z4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p061I4.InterfaceC0651c;
import p125R5.AbstractC2291q;
import p352u1.AbstractC6596b;
import p378x5.AbstractC7032w;

/* renamed from: Z4.G */
/* loaded from: classes2.dex */
public final class C3045G implements InterfaceC3044F {

    /* renamed from: c */
    public InterfaceC0651c f9350c;

    /* renamed from: d */
    public Context f9351d;

    /* renamed from: e */
    public InterfaceC3046H f9352e;

    public C3045G(InterfaceC0651c messenger, Context context, InterfaceC3046H listEncoder) {
        AbstractC5469l.m23028e(messenger, "messenger");
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(listEncoder, "listEncoder");
        this.f9350c = messenger;
        this.f9351d = context;
        this.f9352e = listEncoder;
        try {
            InterfaceC3044F.f9347b.m11168s(messenger, this, "shared_preferences");
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e7);
        }
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: a */
    public void mo11120a(String key, boolean z6, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        m11169p(options).edit().putBoolean(key, z6).apply();
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: b */
    public Boolean mo11121b(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        if (m11169p.contains(key)) {
            return Boolean.valueOf(m11169p.getBoolean(key, true));
        }
        return null;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: c */
    public String mo11122c(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        if (m11169p.contains(key)) {
            return m11169p.getString(key, StringUtils.EMPTY);
        }
        return null;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: d */
    public Double mo11123d(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        if (!m11169p.contains(key)) {
            return null;
        }
        Object m11207d = AbstractC3050L.m11207d(m11169p.getString(key, StringUtils.EMPTY), this.f9352e);
        AbstractC5469l.m23026c(m11207d, "null cannot be cast to non-null type kotlin.Double");
        return (Double) m11207d;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: e */
    public void mo11124e(String key, String value, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(options, "options");
        m11169p(options).edit().putString(key, value).apply();
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: f */
    public List mo11125f(List list, C3048J options) {
        AbstractC5469l.m23028e(options, "options");
        Map<String, ?> all = m11169p(options).getAll();
        AbstractC5469l.m23027d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            AbstractC5469l.m23027d(key, "<get-key>(...)");
            if (AbstractC3050L.m11206c(key, entry.getValue(), list != null ? AbstractC7032w.m28893S(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC7032w.m28889O(linkedHashMap.keySet());
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: g */
    public void mo11126g(String key, double d7, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        m11169p(options).edit().putString(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d7).apply();
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: h */
    public void mo11127h(String key, long j7, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        m11169p(options).edit().putLong(key, j7).apply();
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: i */
    public void mo11128i(List list, C3048J options) {
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        SharedPreferences.Editor edit = m11169p.edit();
        AbstractC5469l.m23027d(edit, "edit(...)");
        Map<String, ?> all = m11169p.getAll();
        AbstractC5469l.m23027d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (AbstractC3050L.m11206c(str, all.get(str), list != null ? AbstractC7032w.m28893S(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        AbstractC5469l.m23027d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC5469l.m23027d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: j */
    public void mo11129j(String key, String value, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(options, "options");
        m11169p(options).edit().putString(key, value).apply();
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: k */
    public Long mo11130k(String key, C3048J options) {
        long j7;
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        if (!m11169p.contains(key)) {
            return null;
        }
        try {
            j7 = m11169p.getLong(key, 0L);
        } catch (ClassCastException unused) {
            j7 = m11169p.getInt(key, 0);
        }
        return Long.valueOf(j7);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: l */
    public Map mo11131l(List list, C3048J options) {
        Object value;
        AbstractC5469l.m23028e(options, "options");
        Map<String, ?> all = m11169p(options).getAll();
        AbstractC5469l.m23027d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (AbstractC3050L.m11206c(entry.getKey(), entry.getValue(), list != null ? AbstractC7032w.m28893S(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object m11207d = AbstractC3050L.m11207d(value, this.f9352e);
                AbstractC5469l.m23026c(m11207d, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, m11207d);
            }
        }
        return hashMap;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: m */
    public List mo11132m(String key, C3048J options) {
        List list;
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        ArrayList arrayList = null;
        if (m11169p.contains(key)) {
            String string = m11169p.getString(key, StringUtils.EMPTY);
            AbstractC5469l.m23025b(string);
            if (AbstractC2291q.m7745u(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) && !AbstractC2291q.m7745u(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) && (list = (List) AbstractC3050L.m11207d(m11169p.getString(key, StringUtils.EMPTY), this.f9352e)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: n */
    public C3053O mo11133n(String key, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(options, "options");
        SharedPreferences m11169p = m11169p(options);
        if (!m11169p.contains(key)) {
            return null;
        }
        String string = m11169p.getString(key, StringUtils.EMPTY);
        AbstractC5469l.m23025b(string);
        return AbstractC2291q.m7745u(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) ? new C3053O(string, EnumC3051M.f9485d) : AbstractC2291q.m7745u(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) ? new C3053O(null, EnumC3051M.f9484c) : new C3053O(null, EnumC3051M.f9486e);
    }

    @Override // p180Z4.InterfaceC3044F
    /* renamed from: o */
    public void mo11134o(String key, List value, C3048J options) {
        AbstractC5469l.m23028e(key, "key");
        AbstractC5469l.m23028e(value, "value");
        AbstractC5469l.m23028e(options, "options");
        m11169p(options).edit().putString(key, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f9352e.mo11171a(value)).apply();
    }

    /* renamed from: p */
    public final SharedPreferences m11169p(C3048J c3048j) {
        if (c3048j.m11174a() == null) {
            SharedPreferences m27469a = AbstractC6596b.m27469a(this.f9351d);
            AbstractC5469l.m23025b(m27469a);
            return m27469a;
        }
        SharedPreferences sharedPreferences = this.f9351d.getSharedPreferences(c3048j.m11174a(), 0);
        AbstractC5469l.m23025b(sharedPreferences);
        return sharedPreferences;
    }

    /* renamed from: q */
    public final void m11170q() {
        InterfaceC3044F.f9347b.m11168s(this.f9350c, null, "shared_preferences");
    }
}
