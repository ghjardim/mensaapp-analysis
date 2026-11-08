package p237g5;

import java.util.IdentityHashMap;
import java.util.Map;
import p171Y2.AbstractC2928k;

/* renamed from: g5.a */
/* loaded from: classes2.dex */
public final class C4425a {

    /* renamed from: b */
    public static final IdentityHashMap f15690b;

    /* renamed from: c */
    public static final C4425a f15691c;

    /* renamed from: a */
    public final IdentityHashMap f15692a;

    /* renamed from: g5.a$b */
    public static final class b {

        /* renamed from: a */
        public C4425a f15693a;

        /* renamed from: b */
        public IdentityHashMap f15694b;

        /* renamed from: a */
        public C4425a m18821a() {
            if (this.f15694b != null) {
                for (Map.Entry entry : this.f15693a.f15692a.entrySet()) {
                    if (!this.f15694b.containsKey(entry.getKey())) {
                        this.f15694b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f15693a = new C4425a(this.f15694b);
                this.f15694b = null;
            }
            return this.f15693a;
        }

        /* renamed from: b */
        public final IdentityHashMap m18822b(int i7) {
            if (this.f15694b == null) {
                this.f15694b = new IdentityHashMap(i7);
            }
            return this.f15694b;
        }

        /* renamed from: c */
        public b m18823c(c cVar) {
            if (this.f15693a.f15692a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f15693a.f15692a);
                identityHashMap.remove(cVar);
                this.f15693a = new C4425a(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.f15694b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* renamed from: d */
        public b m18824d(c cVar, Object obj) {
            m18822b(1).put(cVar, obj);
            return this;
        }

        public b(C4425a c4425a) {
            this.f15693a = c4425a;
        }
    }

    /* renamed from: g5.a$c */
    public static final class c {

        /* renamed from: a */
        public final String f15695a;

        public c(String str) {
            this.f15695a = str;
        }

        /* renamed from: a */
        public static c m18825a(String str) {
            return new c(str);
        }

        public String toString() {
            return this.f15695a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f15690b = identityHashMap;
        f15691c = new C4425a(identityHashMap);
    }

    /* renamed from: c */
    public static b m18818c() {
        return new b();
    }

    /* renamed from: b */
    public Object m18819b(c cVar) {
        return this.f15692a.get(cVar);
    }

    /* renamed from: d */
    public b m18820d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4425a.class != obj.getClass()) {
            return false;
        }
        C4425a c4425a = (C4425a) obj;
        if (this.f15692a.size() != c4425a.f15692a.size()) {
            return false;
        }
        for (Map.Entry entry : this.f15692a.entrySet()) {
            if (!c4425a.f15692a.containsKey(entry.getKey()) || !AbstractC2928k.m10550a(entry.getValue(), c4425a.f15692a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i7 = 0;
        for (Map.Entry entry : this.f15692a.entrySet()) {
            i7 += AbstractC2928k.m10551b(entry.getKey(), entry.getValue());
        }
        return i7;
    }

    public String toString() {
        return this.f15692a.toString();
    }

    public C4425a(IdentityHashMap identityHashMap) {
        this.f15692a = identityHashMap;
    }
}
