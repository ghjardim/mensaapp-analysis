package p349t6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import p333r6.InterfaceC6304d;
import p341s6.C6400a;
import p341s6.EnumC6401b;
import p341s6.InterfaceC6402c;

/* renamed from: t6.m */
/* loaded from: classes2.dex */
public class C6575m implements InterfaceC6304d {

    /* renamed from: a */
    public final String f23573a;

    /* renamed from: b */
    public volatile InterfaceC6304d f23574b;

    /* renamed from: c */
    public Boolean f23575c;

    /* renamed from: d */
    public Method f23576d;

    /* renamed from: e */
    public C6400a f23577e;

    /* renamed from: f */
    public final Queue f23578f;

    /* renamed from: n */
    public final boolean f23579n;

    public C6575m(String str, Queue queue, boolean z6) {
        this.f23573a = str;
        this.f23578f = queue;
        this.f23579n = z6;
    }

    /* renamed from: A */
    public InterfaceC6304d m27302A() {
        return this.f23574b != null ? this.f23574b : this.f23579n ? C6568f.f23556a : m27303B();
    }

    /* renamed from: B */
    public final InterfaceC6304d m27303B() {
        if (this.f23577e == null) {
            this.f23577e = new C6400a(this, this.f23578f);
        }
        return this.f23577e;
    }

    /* renamed from: C */
    public boolean m27304C() {
        Boolean bool = this.f23575c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f23576d = this.f23574b.getClass().getMethod("log", InterfaceC6402c.class);
            this.f23575c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f23575c = Boolean.FALSE;
        }
        return this.f23575c.booleanValue();
    }

    /* renamed from: D */
    public boolean m27305D() {
        return this.f23574b instanceof C6568f;
    }

    /* renamed from: E */
    public boolean m27306E() {
        return this.f23574b == null;
    }

    /* renamed from: F */
    public void m27307F(InterfaceC6402c interfaceC6402c) {
        if (m27304C()) {
            try {
                this.f23576d.invoke(this.f23574b, interfaceC6402c);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: G */
    public void m27308G(InterfaceC6304d interfaceC6304d) {
        this.f23574b = interfaceC6304d;
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: a */
    public void mo26357a(String str, Object obj) {
        m27302A().mo26357a(str, obj);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: b */
    public void mo26358b(String str, Object obj) {
        m27302A().mo26358b(str, obj);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: c */
    public boolean mo26359c() {
        return m27302A().mo26359c();
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: d */
    public void mo26360d(String str, Object obj, Object obj2) {
        m27302A().mo26360d(str, obj, obj2);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: e */
    public boolean mo26361e() {
        return m27302A().mo26361e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f23573a.equals(((C6575m) obj).f23573a);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: f */
    public boolean mo26362f(EnumC6401b enumC6401b) {
        return m27302A().mo26362f(enumC6401b);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: g */
    public void mo26363g(String str, Object obj) {
        m27302A().mo26363g(str, obj);
    }

    @Override // p333r6.InterfaceC6304d
    public String getName() {
        return this.f23573a;
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: h */
    public void mo26364h(String str, Throwable th) {
        m27302A().mo26364h(str, th);
    }

    public int hashCode() {
        return this.f23573a.hashCode();
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: i */
    public void mo26365i(String str, Object obj, Object obj2) {
        m27302A().mo26365i(str, obj, obj2);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: j */
    public boolean mo26366j() {
        return m27302A().mo26366j();
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: k */
    public void mo26367k(String str, Object... objArr) {
        m27302A().mo26367k(str, objArr);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: l */
    public boolean mo26368l() {
        return m27302A().mo26368l();
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: m */
    public void mo26369m(String str, Object obj, Object obj2) {
        m27302A().mo26369m(str, obj, obj2);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: n */
    public void mo26370n(String str) {
        m27302A().mo26370n(str);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: o */
    public boolean mo26371o() {
        return m27302A().mo26371o();
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: p */
    public void mo26372p(String str, Object obj, Object obj2) {
        m27302A().mo26372p(str, obj, obj2);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: q */
    public void mo26373q(String str, Object... objArr) {
        m27302A().mo26373q(str, objArr);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: r */
    public void mo26374r(String str, Object obj) {
        m27302A().mo26374r(str, obj);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: s */
    public void mo26375s(String str, Object obj) {
        m27302A().mo26375s(str, obj);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: t */
    public void mo26376t(String str, Object... objArr) {
        m27302A().mo26376t(str, objArr);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: u */
    public void mo26377u(String str, Throwable th) {
        m27302A().mo26377u(str, th);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: v */
    public void mo26378v(String str, Throwable th) {
        m27302A().mo26378v(str, th);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: w */
    public void mo26379w(String str) {
        m27302A().mo26379w(str);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: x */
    public void mo26380x(String str) {
        m27302A().mo26380x(str);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: y */
    public void mo26381y(String str) {
        m27302A().mo26381y(str);
    }

    @Override // p333r6.InterfaceC6304d
    /* renamed from: z */
    public void mo26382z(String str, Object obj, Object obj2) {
        m27302A().mo26382z(str, obj, obj2);
    }
}
