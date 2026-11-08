package p249i1;

import java.nio.ByteBuffer;
import p259j0.AbstractC5332a;
import p284m0.AbstractC5563k;

/* renamed from: i1.j */
/* loaded from: classes.dex */
public abstract class AbstractC4519j extends AbstractC5563k implements InterfaceC4521l {

    /* renamed from: o */
    public final String f16152o;

    /* renamed from: i1.j$a */
    public class a extends AbstractC4526q {
        public a() {
        }

        @Override // p284m0.AbstractC5562j
        /* renamed from: r */
        public void mo19242r() {
            AbstractC4519j.this.m23304t(this);
        }
    }

    public AbstractC4519j(String str) {
        super(new C4525p[2], new AbstractC4526q[2]);
        this.f16152o = str;
        m23307w(1024);
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C4522m mo19238k(Throwable th) {
        return new C4522m("Unexpected decode error", th);
    }

    /* renamed from: B */
    public abstract InterfaceC4520k mo1236B(byte[] bArr, int i7, boolean z6);

    @Override // p284m0.AbstractC5563k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C4522m mo19239l(C4525p c4525p, AbstractC4526q abstractC4526q, boolean z6) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC5332a.m21800e(c4525p.f20077d);
            abstractC4526q.m19254s(c4525p.f20079f, mo1236B(byteBuffer.array(), byteBuffer.limit(), z6), c4525p.f16168q);
            abstractC4526q.f20087d = false;
            return null;
        } catch (C4522m e7) {
            return e7;
        }
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C4525p mo19236i() {
        return new C4525p();
    }

    @Override // p284m0.AbstractC5563k
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final AbstractC4526q mo19237j() {
        return new a();
    }

    @Override // p249i1.InterfaceC4521l
    /* renamed from: c */
    public void mo19235c(long j7) {
    }
}
