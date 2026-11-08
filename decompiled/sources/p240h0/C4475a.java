package p240h0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p178Z2.AbstractC3033v;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5332a;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C4475a {

    /* renamed from: a */
    public final AbstractC3033v f15920a;

    /* renamed from: b */
    public final List f15921b = new ArrayList();

    /* renamed from: c */
    public ByteBuffer[] f15922c = new ByteBuffer[0];

    /* renamed from: d */
    public InterfaceC4476b.a f15923d;

    /* renamed from: e */
    public InterfaceC4476b.a f15924e;

    /* renamed from: f */
    public boolean f15925f;

    public C4475a(AbstractC3033v abstractC3033v) {
        this.f15920a = abstractC3033v;
        InterfaceC4476b.a aVar = InterfaceC4476b.a.f15927e;
        this.f15923d = aVar;
        this.f15924e = aVar;
        this.f15925f = false;
    }

    /* renamed from: a */
    public InterfaceC4476b.a m19045a(InterfaceC4476b.a aVar) {
        if (aVar.equals(InterfaceC4476b.a.f15927e)) {
            throw new InterfaceC4476b.b(aVar);
        }
        for (int i7 = 0; i7 < this.f15920a.size(); i7++) {
            InterfaceC4476b interfaceC4476b = (InterfaceC4476b) this.f15920a.get(i7);
            InterfaceC4476b.a mo19058d = interfaceC4476b.mo19058d(aVar);
            if (interfaceC4476b.isActive()) {
                AbstractC5332a.m21802g(!mo19058d.equals(InterfaceC4476b.a.f15927e));
                aVar = mo19058d;
            }
        }
        this.f15924e = aVar;
        return aVar;
    }

    /* renamed from: b */
    public void m19046b() {
        this.f15921b.clear();
        this.f15923d = this.f15924e;
        this.f15925f = false;
        for (int i7 = 0; i7 < this.f15920a.size(); i7++) {
            InterfaceC4476b interfaceC4476b = (InterfaceC4476b) this.f15920a.get(i7);
            interfaceC4476b.flush();
            if (interfaceC4476b.isActive()) {
                this.f15921b.add(interfaceC4476b);
            }
        }
        this.f15922c = new ByteBuffer[this.f15921b.size()];
        for (int i8 = 0; i8 <= m19047c(); i8++) {
            this.f15922c[i8] = ((InterfaceC4476b) this.f15921b.get(i8)).mo19055a();
        }
    }

    /* renamed from: c */
    public final int m19047c() {
        return this.f15922c.length - 1;
    }

    /* renamed from: d */
    public ByteBuffer m19048d() {
        if (!m19050f()) {
            return InterfaceC4476b.f15926a;
        }
        ByteBuffer byteBuffer = this.f15922c[m19047c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m19051g(InterfaceC4476b.f15926a);
        return this.f15922c[m19047c()];
    }

    /* renamed from: e */
    public boolean m19049e() {
        return this.f15925f && ((InterfaceC4476b) this.f15921b.get(m19047c())).mo19057c() && !this.f15922c[m19047c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4475a)) {
            return false;
        }
        C4475a c4475a = (C4475a) obj;
        if (this.f15920a.size() != c4475a.f15920a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f15920a.size(); i7++) {
            if (this.f15920a.get(i7) != c4475a.f15920a.get(i7)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m19050f() {
        return !this.f15921b.isEmpty();
    }

    /* renamed from: g */
    public final void m19051g(ByteBuffer byteBuffer) {
        boolean z6;
        for (boolean z7 = true; z7; z7 = z6) {
            z6 = false;
            int i7 = 0;
            while (i7 <= m19047c()) {
                if (!this.f15922c[i7].hasRemaining()) {
                    InterfaceC4476b interfaceC4476b = (InterfaceC4476b) this.f15921b.get(i7);
                    if (!interfaceC4476b.mo19057c()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f15922c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC4476b.f15926a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC4476b.mo19056b(byteBuffer2);
                        this.f15922c[i7] = interfaceC4476b.mo19055a();
                        z6 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f15922c[i7].hasRemaining();
                    } else if (!this.f15922c[i7].hasRemaining() && i7 < m19047c()) {
                        ((InterfaceC4476b) this.f15921b.get(i7 + 1)).mo19059e();
                    }
                }
                i7++;
            }
        }
    }

    /* renamed from: h */
    public void m19052h() {
        if (!m19050f() || this.f15925f) {
            return;
        }
        this.f15925f = true;
        ((InterfaceC4476b) this.f15921b.get(0)).mo19059e();
    }

    public int hashCode() {
        return this.f15920a.hashCode();
    }

    /* renamed from: i */
    public void m19053i(ByteBuffer byteBuffer) {
        if (!m19050f() || this.f15925f) {
            return;
        }
        m19051g(byteBuffer);
    }

    /* renamed from: j */
    public void m19054j() {
        for (int i7 = 0; i7 < this.f15920a.size(); i7++) {
            InterfaceC4476b interfaceC4476b = (InterfaceC4476b) this.f15920a.get(i7);
            interfaceC4476b.flush();
            interfaceC4476b.reset();
        }
        this.f15922c = new ByteBuffer[0];
        InterfaceC4476b.a aVar = InterfaceC4476b.a.f15927e;
        this.f15923d = aVar;
        this.f15924e = aVar;
        this.f15925f = false;
    }
}
