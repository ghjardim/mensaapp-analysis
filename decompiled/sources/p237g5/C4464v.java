package p237g5;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p171Y2.AbstractC2932o;
import p171Y2.C2925h;
import p237g5.InterfaceC4447l;
import p256j$.util.DesugarCollections;

/* renamed from: g5.v */
/* loaded from: classes2.dex */
public final class C4464v {

    /* renamed from: c */
    public static final C2925h f15896c = C2925h.m10525f(',');

    /* renamed from: d */
    public static final C4464v f15897d = m19027a().m19032f(new InterfaceC4447l.a(), true).m19032f(InterfaceC4447l.b.f15793a, false);

    /* renamed from: a */
    public final Map f15898a;

    /* renamed from: b */
    public final byte[] f15899b;

    /* renamed from: g5.v$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC4463u f15900a;

        /* renamed from: b */
        public final boolean f15901b;

        public a(InterfaceC4463u interfaceC4463u, boolean z6) {
            this.f15900a = (InterfaceC4463u) AbstractC2932o.m10573p(interfaceC4463u, "decompressor");
            this.f15901b = z6;
        }
    }

    public C4464v(InterfaceC4463u interfaceC4463u, boolean z6, C4464v c4464v) {
        String mo18944a = interfaceC4463u.mo18944a();
        AbstractC2932o.m10562e(!mo18944a.contains(","), "Comma is currently not allowed in message encoding");
        int size = c4464v.f15898a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c4464v.f15898a.containsKey(interfaceC4463u.mo18944a()) ? size : size + 1);
        for (a aVar : c4464v.f15898a.values()) {
            String mo18944a2 = aVar.f15900a.mo18944a();
            if (!mo18944a2.equals(mo18944a)) {
                linkedHashMap.put(mo18944a2, new a(aVar.f15900a, aVar.f15901b));
            }
        }
        linkedHashMap.put(mo18944a, new a(interfaceC4463u, z6));
        this.f15898a = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.f15899b = f15896c.m10530d(m19029b()).getBytes(Charset.forName("US-ASCII"));
    }

    /* renamed from: a */
    public static C4464v m19027a() {
        return new C4464v();
    }

    /* renamed from: c */
    public static C4464v m19028c() {
        return f15897d;
    }

    /* renamed from: b */
    public Set m19029b() {
        HashSet hashSet = new HashSet(this.f15898a.size());
        for (Map.Entry entry : this.f15898a.entrySet()) {
            if (((a) entry.getValue()).f15901b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    /* renamed from: d */
    public byte[] m19030d() {
        return this.f15899b;
    }

    /* renamed from: e */
    public InterfaceC4463u m19031e(String str) {
        a aVar = (a) this.f15898a.get(str);
        if (aVar != null) {
            return aVar.f15900a;
        }
        return null;
    }

    /* renamed from: f */
    public C4464v m19032f(InterfaceC4463u interfaceC4463u, boolean z6) {
        return new C4464v(interfaceC4463u, z6, this);
    }

    public C4464v() {
        this.f15898a = new LinkedHashMap(0);
        this.f15899b = new byte[0];
    }
}
