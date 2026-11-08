package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p009B1.C0032d;
import p021D.AbstractC0096d;
import p153V5.InterfaceC2641n;
import p371w5.AbstractC6930m;
import p378x5.AbstractC7005E;

/* renamed from: androidx.lifecycle.C */
/* loaded from: classes.dex */
public final class C3320C {

    /* renamed from: f */
    public static final a f10686f = new a(null);

    /* renamed from: g */
    public static final Class[] f10687g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final Map f10688a;

    /* renamed from: b */
    public final Map f10689b;

    /* renamed from: c */
    public final Map f10690c;

    /* renamed from: d */
    public final Map f10691d;

    /* renamed from: e */
    public final C0032d.c f10692e;

    /* renamed from: androidx.lifecycle.C$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final C3320C m12867a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C3320C();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    AbstractC5469l.m23027d(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C3320C(hashMap);
            }
            ClassLoader classLoader = C3320C.class.getClassLoader();
            AbstractC5469l.m23025b(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = parcelableArrayList.get(i7);
                AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
            }
            return new C3320C(linkedHashMap);
        }

        /* renamed from: b */
        public final boolean m12868b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C3320C.f10687g) {
                AbstractC5469l.m23025b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public C3320C(Map initialState) {
        AbstractC5469l.m23028e(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10688a = linkedHashMap;
        this.f10689b = new LinkedHashMap();
        this.f10690c = new LinkedHashMap();
        this.f10691d = new LinkedHashMap();
        this.f10692e = new C0032d.c() { // from class: androidx.lifecycle.B
            @Override // p009B1.C0032d.c
            /* renamed from: a */
            public final Bundle mo79a() {
                Bundle m12864d;
                m12864d = C3320C.m12864d(C3320C.this);
                return m12864d;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* renamed from: d */
    public static final Bundle m12864d(C3320C this$0) {
        AbstractC5469l.m23028e(this$0, "this$0");
        for (Map.Entry entry : AbstractC7005E.m28744m(this$0.f10689b).entrySet()) {
            this$0.m12866e((String) entry.getKey(), ((C0032d.c) entry.getValue()).mo79a());
        }
        Set<String> keySet = this$0.f10688a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f10688a.get(str));
        }
        return AbstractC0096d.m252a(AbstractC6930m.m28383a("keys", arrayList), AbstractC6930m.m28383a("values", arrayList2));
    }

    /* renamed from: c */
    public final C0032d.c m12865c() {
        return this.f10692e;
    }

    /* renamed from: e */
    public final void m12866e(String key, Object obj) {
        AbstractC5469l.m23028e(key, "key");
        if (!f10686f.m12868b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            AbstractC5469l.m23025b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f10690c.get(key);
        C3355t c3355t = obj2 instanceof C3355t ? (C3355t) obj2 : null;
        if (c3355t != null) {
            c3355t.mo12971n(obj);
        } else {
            this.f10688a.put(key, obj);
        }
        InterfaceC2641n interfaceC2641n = (InterfaceC2641n) this.f10691d.get(key);
        if (interfaceC2641n == null) {
            return;
        }
        interfaceC2641n.setValue(obj);
    }

    public C3320C() {
        this.f10688a = new LinkedHashMap();
        this.f10689b = new LinkedHashMap();
        this.f10690c = new LinkedHashMap();
        this.f10691d = new LinkedHashMap();
        this.f10692e = new C0032d.c() { // from class: androidx.lifecycle.B
            @Override // p009B1.C0032d.c
            /* renamed from: a */
            public final Bundle mo79a() {
                Bundle m12864d;
                m12864d = C3320C.m12864d(C3320C.this);
                return m12864d;
            }
        };
    }
}
