package p180Z4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p026D4.InterfaceC0191a;
import p061I4.InterfaceC0651c;
import p180Z4.AbstractC3056c;
import p256j$.util.Objects;

/* renamed from: Z4.a */
/* loaded from: classes2.dex */
public class C3054a implements InterfaceC0191a, AbstractC3056c.b {

    /* renamed from: c */
    public SharedPreferences f9493c;

    /* renamed from: d */
    public final InterfaceC3046H f9494d;

    /* renamed from: Z4.a$a */
    public static class a implements InterfaceC3046H {
        @Override // p180Z4.InterfaceC3046H
        /* renamed from: a */
        public String mo11171a(List list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // p180Z4.InterfaceC3046H
        /* renamed from: b */
        public List mo11172b(String str) {
            try {
                return (List) new C3052N(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public C3054a() {
        this(new a());
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m11222j(bVar.m786b(), bVar.m785a());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: a */
    public Map mo11213a(String str, List list) {
        return m11221i(str, list == null ? null : new HashSet(list));
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: b */
    public Boolean mo11214b(String str, List list) {
        SharedPreferences.Editor edit = this.f9493c.edit();
        Map<String, ?> all = this.f9493c.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: c */
    public Boolean mo11215c(String str, Long l7) {
        return Boolean.valueOf(this.f9493c.edit().putLong(str, l7.longValue()).commit());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: d */
    public Boolean mo11216d(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f9493c.edit().putString(str, str2).commit());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: e */
    public Boolean mo11217e(String str, String str2) {
        return Boolean.valueOf(this.f9493c.edit().putString(str, str2).commit());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: f */
    public Boolean mo11218f(String str, List list) {
        return Boolean.valueOf(this.f9493c.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f9494d.mo11171a(list)).commit());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: g */
    public Boolean mo11219g(String str, Boolean bool) {
        return Boolean.valueOf(this.f9493c.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // p180Z4.AbstractC3056c.b
    /* renamed from: h */
    public Boolean mo11220h(String str, Double d7) {
        String d8 = Double.toString(d7.doubleValue());
        return Boolean.valueOf(this.f9493c.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit());
    }

    /* renamed from: i */
    public final Map m11221i(String str, Set set) {
        Map<String, ?> all = this.f9493c.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                Object obj = all.get(str2);
                Objects.requireNonNull(obj);
                hashMap.put(str2, m11223k(str2, obj));
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public final void m11222j(InterfaceC0651c interfaceC0651c, Context context) {
        this.f9493c = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            AbstractC3066m.m11235k(interfaceC0651c, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    /* renamed from: k */
    public final Object m11223k(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? obj : this.f9494d.mo11172b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f9493c.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f9494d.mo11171a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // p180Z4.AbstractC3056c.b
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f9493c.edit().remove(str).commit());
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        AbstractC3066m.m11235k(bVar.m786b(), null);
    }

    public C3054a(InterfaceC3046H interfaceC3046H) {
        this.f9494d = interfaceC3046H;
    }
}
