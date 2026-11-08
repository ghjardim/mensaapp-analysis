package p071K0;

import java.nio.ByteBuffer;
import org.apache.tika.pipes.PipesConfigBase;
import p022D0.InterfaceC0120F;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.C5357z;
import p284m0.C5561i;
import p292n0.AbstractC5705W0;
import p292n0.AbstractC5745n;

/* renamed from: K0.b */
/* loaded from: classes.dex */
public final class C0821b extends AbstractC5745n {

    /* renamed from: A */
    public long f2843A;

    /* renamed from: B */
    public InterfaceC0820a f2844B;

    /* renamed from: C */
    public long f2845C;

    /* renamed from: y */
    public final C5561i f2846y;

    /* renamed from: z */
    public final C5357z f2847z;

    public C0821b() {
        super(6);
        this.f2846y = new C5561i(1);
        this.f2847z = new C5357z();
    }

    @Override // p292n0.AbstractC5745n, p292n0.C5697S0.b
    /* renamed from: A */
    public void mo2838A(int i7, Object obj) {
        if (i7 == 8) {
            this.f2844B = (InterfaceC0820a) obj;
        } else {
            super.mo2838A(i7, obj);
        }
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: S */
    public void mo1248S() {
        m3439h0();
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: V */
    public void mo1249V(long j7, boolean z6) {
        this.f2845C = Long.MIN_VALUE;
        m3439h0();
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: a */
    public int mo1250a(C4327q c4327q) {
        return "application/x-camera-motion".equals(c4327q.f15138n) ? AbstractC5705W0.m23918a(4) : AbstractC5705W0.m23918a(0);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: b */
    public boolean mo1251b() {
        return true;
    }

    @Override // p292n0.AbstractC5745n
    /* renamed from: b0 */
    public void mo1252b0(C4327q[] c4327qArr, long j7, long j8, InterfaceC0120F.b bVar) {
        this.f2843A = j8;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: c */
    public boolean mo1253c() {
        return mo23909o();
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: g */
    public void mo1254g(long j7, long j8) {
        while (!mo23909o() && this.f2845C < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + j7) {
            this.f2846y.mo19253j();
            if (m24172d0(m24164M(), this.f2846y, 0) != -4 || this.f2846y.m23275m()) {
                return;
            }
            long j9 = this.f2846y.f20079f;
            this.f2845C = j9;
            boolean z6 = j9 < m24166O();
            if (this.f2844B != null && !z6) {
                this.f2846y.m23291t();
                float[] m3438g0 = m3438g0((ByteBuffer) AbstractC5330M.m21747i(this.f2846y.f20077d));
                if (m3438g0 != null) {
                    ((InterfaceC0820a) AbstractC5330M.m21747i(this.f2844B)).mo3436a(this.f2845C - this.f2843A, m3438g0);
                }
            }
        }
    }

    /* renamed from: g0 */
    public final float[] m3438g0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f2847z.m21937R(byteBuffer.array(), byteBuffer.limit());
        this.f2847z.m21939T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i7 = 0; i7 < 3; i7++) {
            fArr[i7] = Float.intBitsToFloat(this.f2847z.m21961t());
        }
        return fArr;
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    public String getName() {
        return "CameraMotionRenderer";
    }

    /* renamed from: h0 */
    public final void m3439h0() {
        InterfaceC0820a interfaceC0820a = this.f2844B;
        if (interfaceC0820a != null) {
            interfaceC0820a.mo3437d();
        }
    }
}
