package p253i5;

import java.nio.charset.Charset;
import p171Y2.AbstractC2922e;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4412M;
import p237g5.AbstractC4414O;
import p237g5.C4424Z;
import p237g5.C4448l0;
import p253i5.AbstractC4594a;

/* renamed from: i5.V */
/* loaded from: classes2.dex */
public abstract class AbstractC4586V extends AbstractC4594a.c {

    /* renamed from: w */
    public static final AbstractC4412M.a f16646w;

    /* renamed from: x */
    public static final C4424Z.g f16647x;

    /* renamed from: s */
    public C4448l0 f16648s;

    /* renamed from: t */
    public C4424Z f16649t;

    /* renamed from: u */
    public Charset f16650u;

    /* renamed from: v */
    public boolean f16651v;

    /* renamed from: i5.V$a */
    public class a implements AbstractC4412M.a {
        @Override // p237g5.C4424Z.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer mo18816b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, AbstractC4412M.f15634a));
        }

        @Override // p237g5.C4424Z.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] mo18815a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f16646w = aVar;
        f16647x = AbstractC4412M.m18672b(":status", aVar);
    }

    public AbstractC4586V(int i7, C4576P0 c4576p0, C4587V0 c4587v0) {
        super(i7, c4576p0, c4587v0);
        this.f16650u = AbstractC2922e.f9010c;
    }

    /* renamed from: O */
    public static Charset m19667O(C4424Z c4424z) {
        String str = (String) c4424z.m18779g(AbstractC4580S.f16578j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return AbstractC2922e.f9010c;
    }

    /* renamed from: R */
    public static void m19668R(C4424Z c4424z) {
        c4424z.m18777e(f16647x);
        c4424z.m18777e(AbstractC4414O.f15637b);
        c4424z.m18777e(AbstractC4414O.f15636a);
    }

    /* renamed from: P */
    public abstract void mo19669P(C4448l0 c4448l0, boolean z6, C4424Z c4424z);

    /* renamed from: Q */
    public final C4448l0 m19670Q(C4424Z c4424z) {
        C4448l0 c4448l0 = (C4448l0) c4424z.m18779g(AbstractC4414O.f15637b);
        if (c4448l0 != null) {
            return c4448l0.m18963q((String) c4424z.m18779g(AbstractC4414O.f15636a));
        }
        if (this.f16651v) {
            return C4448l0.f15797g.m18963q("missing GRPC status in response");
        }
        Integer num = (Integer) c4424z.m18779g(f16647x);
        return (num != null ? AbstractC4580S.m19607m(num.intValue()) : C4448l0.f15809s.m18963q("missing HTTP status code")).m18957e("missing GRPC status, inferred error from HTTP status code");
    }

    /* renamed from: S */
    public void m19671S(InterfaceC4645z0 interfaceC4645z0, boolean z6) {
        C4448l0 c4448l0 = this.f16648s;
        if (c4448l0 != null) {
            this.f16648s = c4448l0.m18957e("DATA-----------------------------\n" + AbstractC4546A0.m19331e(interfaceC4645z0, this.f16650u));
            interfaceC4645z0.close();
            if (this.f16648s.m18960n().length() > 1000 || z6) {
                mo19669P(this.f16648s, false, this.f16649t);
                return;
            }
            return;
        }
        if (!this.f16651v) {
            mo19669P(C4448l0.f15809s.m18963q("headers not received before payload"), false, new C4424Z());
            return;
        }
        int mo19335b = interfaceC4645z0.mo19335b();
        m19780D(interfaceC4645z0);
        if (z6) {
            if (mo19335b > 0) {
                this.f16648s = C4448l0.f15809s.m18963q("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f16648s = C4448l0.f15809s.m18963q("Received unexpected EOS on empty DATA frame from server");
            }
            C4424Z c4424z = new C4424Z();
            this.f16649t = c4424z;
            m19790N(this.f16648s, false, c4424z);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: T */
    public void m19672T(C4424Z c4424z) {
        AbstractC2932o.m10573p(c4424z, "headers");
        C4448l0 c4448l0 = this.f16648s;
        if (c4448l0 != null) {
            this.f16648s = c4448l0.m18957e("headers: " + c4424z);
            return;
        }
        try {
            if (this.f16651v) {
                C4448l0 m18963q = C4448l0.f15809s.m18963q("Received headers twice");
                this.f16648s = m18963q;
                if (m18963q != null) {
                    this.f16648s = m18963q.m18957e("headers: " + c4424z);
                    this.f16649t = c4424z;
                    this.f16650u = m19667O(c4424z);
                    return;
                }
                return;
            }
            Integer num = (Integer) c4424z.m18779g(f16647x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                C4448l0 c4448l02 = this.f16648s;
                if (c4448l02 != null) {
                    this.f16648s = c4448l02.m18957e("headers: " + c4424z);
                    this.f16649t = c4424z;
                    this.f16650u = m19667O(c4424z);
                    return;
                }
                return;
            }
            this.f16651v = true;
            C4448l0 m19674V = m19674V(c4424z);
            this.f16648s = m19674V;
            if (m19674V != null) {
                if (m19674V != null) {
                    this.f16648s = m19674V.m18957e("headers: " + c4424z);
                    this.f16649t = c4424z;
                    this.f16650u = m19667O(c4424z);
                    return;
                }
                return;
            }
            m19668R(c4424z);
            m19781E(c4424z);
            C4448l0 c4448l03 = this.f16648s;
            if (c4448l03 != null) {
                this.f16648s = c4448l03.m18957e("headers: " + c4424z);
                this.f16649t = c4424z;
                this.f16650u = m19667O(c4424z);
            }
        } catch (Throwable th) {
            C4448l0 c4448l04 = this.f16648s;
            if (c4448l04 != null) {
                this.f16648s = c4448l04.m18957e("headers: " + c4424z);
                this.f16649t = c4424z;
                this.f16650u = m19667O(c4424z);
            }
            throw th;
        }
    }

    /* renamed from: U */
    public void m19673U(C4424Z c4424z) {
        AbstractC2932o.m10573p(c4424z, "trailers");
        if (this.f16648s == null && !this.f16651v) {
            C4448l0 m19674V = m19674V(c4424z);
            this.f16648s = m19674V;
            if (m19674V != null) {
                this.f16649t = c4424z;
            }
        }
        C4448l0 c4448l0 = this.f16648s;
        if (c4448l0 == null) {
            C4448l0 m19670Q = m19670Q(c4424z);
            m19668R(c4424z);
            m19782F(c4424z, m19670Q);
        } else {
            C4448l0 m18957e = c4448l0.m18957e("trailers: " + c4424z);
            this.f16648s = m18957e;
            mo19669P(m18957e, false, this.f16649t);
        }
    }

    /* renamed from: V */
    public final C4448l0 m19674V(C4424Z c4424z) {
        Integer num = (Integer) c4424z.m18779g(f16647x);
        if (num == null) {
            return C4448l0.f15809s.m18963q("Missing HTTP status code");
        }
        String str = (String) c4424z.m18779g(AbstractC4580S.f16578j);
        if (AbstractC4580S.m19608n(str)) {
            return null;
        }
        return AbstractC4580S.m19607m(num.intValue()).m18957e("invalid content-type: " + str);
    }

    @Override // p253i5.AbstractC4594a.c, p253i5.C4619m0.b
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo19531c(boolean z6) {
        super.mo19531c(z6);
    }
}
