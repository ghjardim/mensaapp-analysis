package p044G1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p334s.C6308a;

/* renamed from: G1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0377a {

    /* renamed from: a */
    public final C6308a f1474a;

    /* renamed from: b */
    public final C6308a f1475b;

    /* renamed from: c */
    public final C6308a f1476c;

    public AbstractC0377a(C6308a c6308a, C6308a c6308a2, C6308a c6308a3) {
        this.f1474a = c6308a;
        this.f1475b = c6308a2;
        this.f1476c = c6308a3;
    }

    /* renamed from: A */
    public abstract void mo1528A(byte[] bArr);

    /* renamed from: B */
    public void m1529B(byte[] bArr, int i7) {
        mo1564w(i7);
        mo1528A(bArr);
    }

    /* renamed from: C */
    public abstract void mo1530C(CharSequence charSequence);

    /* renamed from: D */
    public void m1531D(CharSequence charSequence, int i7) {
        mo1564w(i7);
        mo1530C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo1532E(int i7);

    /* renamed from: F */
    public void m1533F(int i7, int i8) {
        mo1564w(i8);
        mo1532E(i7);
    }

    /* renamed from: G */
    public abstract void mo1534G(Parcelable parcelable);

    /* renamed from: H */
    public void m1535H(Parcelable parcelable, int i7) {
        mo1564w(i7);
        mo1534G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo1536I(String str);

    /* renamed from: J */
    public void m1537J(String str, int i7) {
        mo1564w(i7);
        mo1536I(str);
    }

    /* renamed from: K */
    public void m1538K(InterfaceC0379c interfaceC0379c, AbstractC0377a abstractC0377a) {
        try {
            m1546e(interfaceC0379c.getClass()).invoke(null, interfaceC0379c, abstractC0377a);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
            throw ((RuntimeException) e10.getCause());
        }
    }

    /* renamed from: L */
    public void m1539L(InterfaceC0379c interfaceC0379c) {
        if (interfaceC0379c == null) {
            mo1536I(null);
            return;
        }
        m1541N(interfaceC0379c);
        AbstractC0377a mo1543b = mo1543b();
        m1538K(interfaceC0379c, mo1543b);
        mo1543b.mo1542a();
    }

    /* renamed from: M */
    public void m1540M(InterfaceC0379c interfaceC0379c, int i7) {
        mo1564w(i7);
        m1539L(interfaceC0379c);
    }

    /* renamed from: N */
    public final void m1541N(InterfaceC0379c interfaceC0379c) {
        try {
            mo1536I(m1544c(interfaceC0379c.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(interfaceC0379c.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    /* renamed from: a */
    public abstract void mo1542a();

    /* renamed from: b */
    public abstract AbstractC0377a mo1543b();

    /* renamed from: c */
    public final Class m1544c(Class cls) {
        Class cls2 = (Class) this.f1476c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1476c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    public final Method m1545d(String str) {
        Method method = (Method) this.f1474a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0377a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0377a.class);
        this.f1474a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Method m1546e(Class cls) {
        Method method = (Method) this.f1475b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m1544c = m1544c(cls);
        System.currentTimeMillis();
        Method declaredMethod = m1544c.getDeclaredMethod("write", cls, AbstractC0377a.class);
        this.f1475b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public boolean m1547f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo1548g();

    /* renamed from: h */
    public boolean m1549h(boolean z6, int i7) {
        return !mo1554m(i7) ? z6 : mo1548g();
    }

    /* renamed from: i */
    public abstract byte[] mo1550i();

    /* renamed from: j */
    public byte[] m1551j(byte[] bArr, int i7) {
        return !mo1554m(i7) ? bArr : mo1550i();
    }

    /* renamed from: k */
    public abstract CharSequence mo1552k();

    /* renamed from: l */
    public CharSequence m1553l(CharSequence charSequence, int i7) {
        return !mo1554m(i7) ? charSequence : mo1552k();
    }

    /* renamed from: m */
    public abstract boolean mo1554m(int i7);

    /* renamed from: n */
    public InterfaceC0379c m1555n(String str, AbstractC0377a abstractC0377a) {
        try {
            return (InterfaceC0379c) m1545d(str).invoke(null, abstractC0377a);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    /* renamed from: o */
    public abstract int mo1556o();

    /* renamed from: p */
    public int m1557p(int i7, int i8) {
        return !mo1554m(i8) ? i7 : mo1556o();
    }

    /* renamed from: q */
    public abstract Parcelable mo1558q();

    /* renamed from: r */
    public Parcelable m1559r(Parcelable parcelable, int i7) {
        return !mo1554m(i7) ? parcelable : mo1558q();
    }

    /* renamed from: s */
    public abstract String mo1560s();

    /* renamed from: t */
    public String m1561t(String str, int i7) {
        return !mo1554m(i7) ? str : mo1560s();
    }

    /* renamed from: u */
    public InterfaceC0379c m1562u() {
        String mo1560s = mo1560s();
        if (mo1560s == null) {
            return null;
        }
        return m1555n(mo1560s, mo1543b());
    }

    /* renamed from: v */
    public InterfaceC0379c m1563v(InterfaceC0379c interfaceC0379c, int i7) {
        return !mo1554m(i7) ? interfaceC0379c : m1562u();
    }

    /* renamed from: w */
    public abstract void mo1564w(int i7);

    /* renamed from: y */
    public abstract void mo1566y(boolean z6);

    /* renamed from: z */
    public void m1567z(boolean z6, int i7) {
        mo1564w(i7);
        mo1566y(z6);
    }

    /* renamed from: x */
    public void m1565x(boolean z6, boolean z7) {
    }
}
