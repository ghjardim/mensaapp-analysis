package p025D3;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p011B3.C0044c;
import p011B3.C0045d;
import p011B3.InterfaceC0046e;
import p011B3.InterfaceC0047f;
import p011B3.InterfaceC0048g;
import p011B3.InterfaceC0049h;

/* renamed from: D3.e */
/* loaded from: classes.dex */
public final class C0190e implements InterfaceC0047f, InterfaceC0049h {

    /* renamed from: a */
    public C0190e f771a = null;

    /* renamed from: b */
    public boolean f772b = true;

    /* renamed from: c */
    public final JsonWriter f773c;

    /* renamed from: d */
    public final Map f774d;

    /* renamed from: e */
    public final Map f775e;

    /* renamed from: f */
    public final InterfaceC0046e f776f;

    /* renamed from: g */
    public final boolean f777g;

    public C0190e(Writer writer, Map map, Map map2, InterfaceC0046e interfaceC0046e, boolean z6) {
        this.f773c = new JsonWriter(writer);
        this.f774d = map;
        this.f775e = map2;
        this.f776f = interfaceC0046e;
        this.f777g = z6;
    }

    @Override // p011B3.InterfaceC0047f
    /* renamed from: a */
    public InterfaceC0047f mo112a(C0045d c0045d, long j7) {
        return m772k(c0045d.m108b(), j7);
    }

    @Override // p011B3.InterfaceC0047f
    /* renamed from: b */
    public InterfaceC0047f mo113b(C0045d c0045d, int i7) {
        return m771j(c0045d.m108b(), i7);
    }

    @Override // p011B3.InterfaceC0047f
    /* renamed from: c */
    public InterfaceC0047f mo114c(C0045d c0045d, Object obj) {
        return m773l(c0045d.m108b(), obj);
    }

    /* renamed from: f */
    public C0190e m767f(int i7) {
        m781t();
        this.f773c.value(i7);
        return this;
    }

    /* renamed from: g */
    public C0190e m768g(long j7) {
        m781t();
        this.f773c.value(j7);
        return this;
    }

    /* renamed from: h */
    public C0190e m769h(Object obj, boolean z6) {
        int i7 = 0;
        if (z6 && m776o(obj)) {
            throw new C0044c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f773c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f773c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f773c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m769h(it.next(), false);
                }
                this.f773c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f773c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m773l((String) key, entry.getValue());
                    } catch (ClassCastException e7) {
                        throw new C0044c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                    }
                }
                this.f773c.endObject();
                return this;
            }
            InterfaceC0046e interfaceC0046e = (InterfaceC0046e) this.f774d.get(obj.getClass());
            if (interfaceC0046e != null) {
                return m778q(interfaceC0046e, obj, z6);
            }
            InterfaceC0048g interfaceC0048g = (InterfaceC0048g) this.f775e.get(obj.getClass());
            if (interfaceC0048g != null) {
                interfaceC0048g.mo105a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m778q(this.f776f, obj, z6);
            }
            mo115d(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m775n((byte[]) obj);
        }
        this.f773c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                this.f773c.value(r7[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                m768g(jArr[i7]);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                this.f773c.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                this.f773c.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m769h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m769h(obj2, false);
            }
        }
        this.f773c.endArray();
        return this;
    }

    @Override // p011B3.InterfaceC0049h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0190e mo115d(String str) {
        m781t();
        this.f773c.value(str);
        return this;
    }

    /* renamed from: j */
    public C0190e m771j(String str, int i7) {
        m781t();
        this.f773c.name(str);
        return m767f(i7);
    }

    /* renamed from: k */
    public C0190e m772k(String str, long j7) {
        m781t();
        this.f773c.name(str);
        return m768g(j7);
    }

    /* renamed from: l */
    public C0190e m773l(String str, Object obj) {
        return this.f777g ? m780s(str, obj) : m779r(str, obj);
    }

    @Override // p011B3.InterfaceC0049h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0190e mo116e(boolean z6) {
        m781t();
        this.f773c.value(z6);
        return this;
    }

    /* renamed from: n */
    public C0190e m775n(byte[] bArr) {
        m781t();
        if (bArr == null) {
            this.f773c.nullValue();
        } else {
            this.f773c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: o */
    public final boolean m776o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: p */
    public void m777p() {
        m781t();
        this.f773c.flush();
    }

    /* renamed from: q */
    public C0190e m778q(InterfaceC0046e interfaceC0046e, Object obj, boolean z6) {
        if (!z6) {
            this.f773c.beginObject();
        }
        interfaceC0046e.mo105a(obj, this);
        if (!z6) {
            this.f773c.endObject();
        }
        return this;
    }

    /* renamed from: r */
    public final C0190e m779r(String str, Object obj) {
        m781t();
        this.f773c.name(str);
        if (obj != null) {
            return m769h(obj, false);
        }
        this.f773c.nullValue();
        return this;
    }

    /* renamed from: s */
    public final C0190e m780s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m781t();
        this.f773c.name(str);
        return m769h(obj, false);
    }

    /* renamed from: t */
    public final void m781t() {
        if (!this.f772b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C0190e c0190e = this.f771a;
        if (c0190e != null) {
            c0190e.m781t();
            this.f771a.f772b = false;
            this.f771a = null;
            this.f773c.endObject();
        }
    }
}
