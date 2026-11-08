package p230f6;

import p230f6.AbstractC4289a;

/* renamed from: f6.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4290b extends AbstractC4293e {

    /* renamed from: a */
    public AbstractC4289a f14742a;

    /* renamed from: c */
    public static AbstractC4289a.a m17932c(byte[] bArr) {
        return new AbstractC4289a.a(bArr);
    }

    /* renamed from: b */
    public AbstractC4289a m17933b() {
        AbstractC4289a abstractC4289a = this.f14742a;
        if (abstractC4289a != null) {
            return abstractC4289a;
        }
        throw new IllegalStateException("origin == null");
    }

    /* renamed from: d */
    public AbstractC4290b m17934d(byte[] bArr) {
        return m17935e(m17932c(bArr));
    }

    /* renamed from: e */
    public AbstractC4290b m17935e(AbstractC4289a abstractC4289a) {
        this.f14742a = abstractC4289a;
        return (AbstractC4290b) m17942a();
    }
}
