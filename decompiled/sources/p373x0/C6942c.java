package p373x0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p022D0.InterfaceC0120F;
import p141U0.C2500b;
import p141U0.InterfaceC2499a;
import p232g0.C4327q;
import p232g0.C4334x;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p292n0.AbstractC5705W0;
import p292n0.AbstractC5745n;
import p292n0.C5756s0;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C6942c extends AbstractC5745n implements Handler.Callback {

    /* renamed from: A */
    public final Handler f24822A;

    /* renamed from: B */
    public final C2500b f24823B;

    /* renamed from: C */
    public final boolean f24824C;

    /* renamed from: D */
    public InterfaceC2499a f24825D;

    /* renamed from: E */
    public boolean f24826E;

    /* renamed from: F */
    public boolean f24827F;

    /* renamed from: G */
    public long f24828G;

    /* renamed from: H */
    public C4334x f24829H;

    /* renamed from: I */
    public long f24830I;

    /* renamed from: y */
    public final InterfaceC6940a f24831y;

    /* renamed from: z */
    public final InterfaceC6941b f24832z;

    public C6942c(InterfaceC6941b interfaceC6941b, Looper looper) {
        this(interfaceC6941b, looper, InterfaceC6940a.f24821a);
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        this.f24829H = null;
        this.f24825D = null;
        this.f24830I = -9223372036854775807L;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        this.f24829H = null;
        this.f24826E = false;
        this.f24827F = false;
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: a */
    public int mo1250a(C4327q c4327q) {
        if (this.f24831y.mo28419a(c4327q)) {
            return AbstractC5705W0.m23918a(c4327q.f15123K == 0 ? 4 : 2);
        }
        return AbstractC5705W0.m23918a(0);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        return true;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: b0 */
    public void mo1252b0(C4327q[] c4327qArr, long j7, long j8, InterfaceC0120F.b bVar) {
        this.f24825D = this.f24831y.mo28420b(c4327qArr[0]);
        C4334x c4334x = this.f24829H;
        if (c4334x != null) {
            this.f24829H = c4334x.m18400c((c4334x.f15433b + this.f24830I) - j8);
        }
        this.f24830I = j8;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        return this.f24827F;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: g */
    public void mo1254g(long j7, long j8) {
        boolean z6 = true;
        while (z6) {
            m28426l0();
            z6 = m28425k0(j7);
        }
    }

    /* renamed from: g0 */
    public final void m28421g0(C4334x c4334x, List list) {
        for (int i7 = 0; i7 < c4334x.m18402e(); i7++) {
            C4327q mo8979C = c4334x.m18401d(i7).mo8979C();
            if (mo8979C == null || !this.f24831y.mo28419a(mo8979C)) {
                list.add(c4334x.m18401d(i7));
            } else {
                InterfaceC2499a mo28420b = this.f24831y.mo28420b(mo8979C);
                byte[] bArr = (byte[]) AbstractC5332a.m21800e(c4334x.m18401d(i7).mo8981q0());
                this.f24823B.mo19253j();
                this.f24823B.m23290s(bArr.length);
                ((ByteBuffer) AbstractC5330M.m21747i(this.f24823B.f20077d)).put(bArr);
                this.f24823B.m23291t();
                C4334x mo8456a = mo28420b.mo8456a(this.f24823B);
                if (mo8456a != null) {
                    m28421g0(mo8456a, list);
                }
            }
        }
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    public String getName() {
        return "MetadataRenderer";
    }

    /* renamed from: h0 */
    public final long m28422h0(long j7) {
        AbstractC5332a.m21802g(j7 != -9223372036854775807L);
        AbstractC5332a.m21802g(this.f24830I != -9223372036854775807L);
        return j7 - this.f24830I;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m28424j0((C4334x) message.obj);
        return true;
    }

    /* renamed from: i0 */
    public final void m28423i0(C4334x c4334x) {
        Handler handler = this.f24822A;
        if (handler != null) {
            handler.obtainMessage(1, c4334x).sendToTarget();
        } else {
            m28424j0(c4334x);
        }
    }

    /* renamed from: j0 */
    public final void m28424j0(C4334x c4334x) {
        this.f24832z.mo24107o(c4334x);
    }

    /* renamed from: k0 */
    public final boolean m28425k0(long j7) {
        boolean z6;
        C4334x c4334x = this.f24829H;
        if (c4334x == null || (!this.f24824C && c4334x.f15433b > m28422h0(j7))) {
            z6 = false;
        } else {
            m28423i0(this.f24829H);
            this.f24829H = null;
            z6 = true;
        }
        if (this.f24826E && this.f24829H == null) {
            this.f24827F = true;
        }
        return z6;
    }

    /* renamed from: l0 */
    public final void m28426l0() {
        if (this.f24826E || this.f24829H != null) {
            return;
        }
        this.f24823B.mo19253j();
        C5756s0 m24164M = m24164M();
        int m24172d0 = m24172d0(m24164M, this.f24823B, 0);
        if (m24172d0 != -4) {
            if (m24172d0 == -5) {
                this.f24828G = ((C4327q) AbstractC5332a.m21800e(m24164M.f20950b)).f15143s;
                return;
            }
            return;
        }
        if (this.f24823B.m23275m()) {
            this.f24826E = true;
            return;
        }
        if (this.f24823B.f20079f >= m24166O()) {
            C2500b c2500b = this.f24823B;
            c2500b.f7337q = this.f24828G;
            c2500b.m23291t();
            C4334x mo8456a = ((InterfaceC2499a) AbstractC5330M.m21747i(this.f24825D)).mo8456a(this.f24823B);
            if (mo8456a != null) {
                ArrayList arrayList = new ArrayList(mo8456a.m18402e());
                m28421g0(mo8456a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f24829H = new C4334x(m28422h0(this.f24823B.f20079f), arrayList);
            }
        }
    }

    public C6942c(InterfaceC6941b interfaceC6941b, Looper looper, InterfaceC6940a interfaceC6940a) {
        this(interfaceC6941b, looper, interfaceC6940a, false);
    }

    public C6942c(InterfaceC6941b interfaceC6941b, Looper looper, InterfaceC6940a interfaceC6940a, boolean z6) {
        super(5);
        this.f24832z = (InterfaceC6941b) AbstractC5332a.m21800e(interfaceC6941b);
        this.f24822A = looper == null ? null : AbstractC5330M.m21786z(looper, this);
        this.f24831y = (InterfaceC6940a) AbstractC5332a.m21800e(interfaceC6940a);
        this.f24824C = z6;
        this.f24823B = new C2500b();
        this.f24830I = -9223372036854775807L;
    }
}
