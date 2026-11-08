package p140U;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p104O5.AbstractC1421h;
import p140U.AbstractC2494f;
import p371w5.C6926i;
import p378x5.AbstractC7004D;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7032w;

/* renamed from: U.c */
/* loaded from: classes.dex */
public final class C2491c extends AbstractC2494f {

    /* renamed from: a */
    public final Map f7322a;

    /* renamed from: b */
    public final C2490b f7323b;

    /* renamed from: U.c$a */
    public static final class a extends AbstractC5470m implements InterfaceC0800l {

        /* renamed from: a */
        public static final a f7324a = new a();

        public a() {
            super(1);
        }

        @Override // p069J5.InterfaceC0800l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC5469l.m23028e(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((AbstractC2494f.a) entry.getKey()).m8439a() + " = " + (value instanceof byte[] ? AbstractC7020k.m28816L((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ C2491c(Map map, boolean z6, int i7, AbstractC5464g abstractC5464g) {
        this((i7 & 1) != 0 ? new LinkedHashMap() : map, (i7 & 2) != 0 ? true : z6);
    }

    @Override // p140U.AbstractC2494f
    /* renamed from: a */
    public Map mo8423a() {
        C6926i c6926i;
        Set<Map.Entry> entrySet = this.f7322a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1421h.m5528a(AbstractC7004D.m28732a(AbstractC7025p.m28868n(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC5469l.m23027d(copyOf, "copyOf(this, size)");
                c6926i = new C6926i(key, copyOf);
            } else {
                c6926i = new C6926i(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c6926i.m28370c(), c6926i.m28371d());
        }
        return AbstractC2489a.m8420b(linkedHashMap);
    }

    @Override // p140U.AbstractC2494f
    /* renamed from: b */
    public Object mo8424b(AbstractC2494f.a key) {
        AbstractC5469l.m23028e(key, "key");
        Object obj = this.f7322a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC5469l.m23027d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: e */
    public final void m8425e() {
        if (this.f7323b.m8421a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002f->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p140U.C2491c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            U.c r6 = (p140U.C2491c) r6
            java.util.Map r0 = r6.f7322a
            java.util.Map r2 = r5.f7322a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map r2 = r5.f7322a
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map r6 = r6.f7322a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L27
        L25:
            r1 = r3
            goto L67
        L27:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r5.f7322a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L64
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5f
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L64
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L64
            r0 = r3
            goto L65
        L5f:
            boolean r0 = kotlin.jvm.internal.AbstractC5469l.m23024a(r0, r2)
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 != 0) goto L2f
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p140U.C2491c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m8426f() {
        m8425e();
        this.f7322a.clear();
    }

    /* renamed from: g */
    public final void m8427g() {
        this.f7323b.m8422b(true);
    }

    /* renamed from: h */
    public final void m8428h(AbstractC2494f.b... pairs) {
        AbstractC5469l.m23028e(pairs, "pairs");
        m8425e();
        if (pairs.length <= 0) {
            return;
        }
        AbstractC2494f.b bVar = pairs[0];
        throw null;
    }

    public int hashCode() {
        Iterator it = this.f7322a.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i7 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i7;
    }

    /* renamed from: i */
    public final Object m8429i(AbstractC2494f.a key) {
        AbstractC5469l.m23028e(key, "key");
        m8425e();
        return this.f7322a.remove(key);
    }

    /* renamed from: j */
    public final void m8430j(AbstractC2494f.a key, Object obj) {
        AbstractC5469l.m23028e(key, "key");
        m8431k(key, obj);
    }

    /* renamed from: k */
    public final void m8431k(AbstractC2494f.a key, Object obj) {
        AbstractC5469l.m23028e(key, "key");
        m8425e();
        if (obj == null) {
            m8429i(key);
            return;
        }
        if (obj instanceof Set) {
            this.f7322a.put(key, AbstractC2489a.m8419a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f7322a.put(key, obj);
            return;
        }
        Map map = this.f7322a;
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC5469l.m23027d(copyOf, "copyOf(this, size)");
        map.put(key, copyOf);
    }

    public String toString() {
        return AbstractC7032w.m28878D(this.f7322a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f7324a, 24, null);
    }

    public C2491c(Map preferencesMap, boolean z6) {
        AbstractC5469l.m23028e(preferencesMap, "preferencesMap");
        this.f7322a = preferencesMap;
        this.f7323b = new C2490b(z6);
    }
}
