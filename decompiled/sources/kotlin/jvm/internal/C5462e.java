package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p062I5.AbstractC0667a;
import p069J5.InterfaceC0789a;
import p069J5.InterfaceC0790b;
import p069J5.InterfaceC0791c;
import p069J5.InterfaceC0792d;
import p069J5.InterfaceC0793e;
import p069J5.InterfaceC0794f;
import p069J5.InterfaceC0795g;
import p069J5.InterfaceC0796h;
import p069J5.InterfaceC0797i;
import p069J5.InterfaceC0798j;
import p069J5.InterfaceC0799k;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0801m;
import p069J5.InterfaceC0802n;
import p069J5.InterfaceC0803o;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p069J5.InterfaceC0806r;
import p069J5.InterfaceC0807s;
import p069J5.InterfaceC0808t;
import p069J5.InterfaceC0809u;
import p069J5.InterfaceC0810v;
import p069J5.InterfaceC0811w;
import p111P5.InterfaceC1969c;
import p125R5.AbstractC2294t;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p378x5.AbstractC7004D;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7025p;

/* renamed from: kotlin.jvm.internal.e */
/* loaded from: classes2.dex */
public final class C5462e implements InterfaceC1969c, InterfaceC5461d {

    /* renamed from: b */
    public static final a f19696b = new a(null);

    /* renamed from: c */
    public static final Map f19697c;

    /* renamed from: d */
    public static final HashMap f19698d;

    /* renamed from: e */
    public static final HashMap f19699e;

    /* renamed from: f */
    public static final HashMap f19700f;

    /* renamed from: n */
    public static final Map f19701n;

    /* renamed from: a */
    public final Class f19702a;

    /* renamed from: kotlin.jvm.internal.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final String m23018a(Class jClass) {
            String str;
            AbstractC5469l.m23028e(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C5462e.f19700f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C5462e.f19700f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String m23019b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.AbstractC5469l.m23028e(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.AbstractC5469l.m23025b(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = p125R5.AbstractC2294t.m7784m0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.AbstractC5469l.m23025b(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = p125R5.AbstractC2294t.m7784m0(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.AbstractC5469l.m23025b(r0)
                java.lang.String r1 = p125R5.AbstractC2294t.m7783l0(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.C5462e.m23017h()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.C5462e.m23017h()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C5462e.a.m23019b(java.lang.Class):java.lang.String");
        }

        /* renamed from: c */
        public final boolean m23020c(Object obj, Class jClass) {
            AbstractC5469l.m23028e(jClass, "jClass");
            Map map = C5462e.f19697c;
            AbstractC5469l.m23026c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return AbstractC5457A.m23007e(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC0667a.m2676b(AbstractC0667a.m2677c(jClass));
            }
            return jClass.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        int i7 = 0;
        List m28864j = AbstractC7024o.m28864j(InterfaceC0789a.class, InterfaceC0800l.class, InterfaceC0804p.class, InterfaceC0805q.class, InterfaceC0806r.class, InterfaceC0807s.class, InterfaceC0808t.class, InterfaceC0809u.class, InterfaceC0810v.class, InterfaceC0811w.class, InterfaceC0790b.class, InterfaceC0791c.class, InterfaceC0792d.class, InterfaceC0793e.class, InterfaceC0794f.class, InterfaceC0795g.class, InterfaceC0796h.class, InterfaceC0797i.class, InterfaceC0798j.class, InterfaceC0799k.class, InterfaceC0801m.class, InterfaceC0802n.class, InterfaceC0803o.class);
        ArrayList arrayList = new ArrayList(AbstractC7025p.m28868n(m28864j, 10));
        for (Object obj : m28864j) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC7024o.m28867m();
            }
            arrayList.add(AbstractC6930m.m28383a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f19697c = AbstractC7005E.m28742k(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f19698d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f19699e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC5469l.m23027d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            AbstractC5469l.m23025b(str);
            sb.append(AbstractC2294t.m7786o0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            C6926i m28383a = AbstractC6930m.m28383a(sb.toString(), str + ".Companion");
            hashMap3.put(m28383a.m28370c(), m28383a.m28371d());
        }
        for (Map.Entry entry : f19697c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f19700f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7004D.m28732a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC5469l.m23025b(str2);
            linkedHashMap.put(key, AbstractC2294t.m7786o0(str2, '.', null, 2, null));
        }
        f19701n = linkedHashMap;
    }

    public C5462e(Class jClass) {
        AbstractC5469l.m23028e(jClass, "jClass");
        this.f19702a = jClass;
    }

    @Override // p111P5.InterfaceC1969c
    /* renamed from: a */
    public String mo7021a() {
        return f19696b.m23018a(mo23014c());
    }

    @Override // p111P5.InterfaceC1969c
    /* renamed from: b */
    public String mo7022b() {
        return f19696b.m23019b(mo23014c());
    }

    @Override // kotlin.jvm.internal.InterfaceC5461d
    /* renamed from: c */
    public Class mo23014c() {
        return this.f19702a;
    }

    @Override // p111P5.InterfaceC1969c
    /* renamed from: e */
    public boolean mo7023e(Object obj) {
        return f19696b.m23020c(obj, mo23014c());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5462e) && AbstractC5469l.m23024a(AbstractC0667a.m2676b(this), AbstractC0667a.m2676b((InterfaceC1969c) obj));
    }

    public int hashCode() {
        return AbstractC0667a.m2676b(this).hashCode();
    }

    public String toString() {
        return mo23014c() + " (Kotlin reflection is not available)";
    }
}
