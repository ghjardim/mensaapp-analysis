package com.google.protobuf;

/* renamed from: com.google.protobuf.x0 */
/* loaded from: classes.dex */
public class C4086x0 extends AbstractC4082v0 {
    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C4084w0 mo16971g(Object obj) {
        return ((AbstractC4087y) obj).unknownFields;
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo16972h(C4084w0 c4084w0) {
        return c4084w0.m16996d();
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo16973i(C4084w0 c4084w0) {
        return c4084w0.m16997e();
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C4084w0 mo16975k(C4084w0 c4084w0, C4084w0 c4084w02) {
        return C4084w0.m16986c().equals(c4084w02) ? c4084w0 : C4084w0.m16986c().equals(c4084w0) ? C4084w0.m16989j(c4084w0, c4084w02) : c4084w0.m16999i(c4084w02);
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C4084w0 mo16978n() {
        return C4084w0.m16990k();
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo16979o(Object obj, C4084w0 c4084w0) {
        mo16980p(obj, c4084w0);
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo16980p(Object obj, C4084w0 c4084w0) {
        ((AbstractC4087y) obj).unknownFields = c4084w0;
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C4084w0 mo16982r(C4084w0 c4084w0) {
        c4084w0.m16998h();
        return c4084w0;
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo16983s(C4084w0 c4084w0, InterfaceC4016C0 interfaceC4016C0) {
        c4084w0.m17002p(interfaceC4016C0);
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo16984t(C4084w0 c4084w0, InterfaceC4016C0 interfaceC4016C0) {
        c4084w0.m17003r(interfaceC4016C0);
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: j */
    public void mo16974j(Object obj) {
        mo16971g(obj).m16998h();
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: q */
    public boolean mo16981q(InterfaceC4062l0 interfaceC4062l0) {
        return false;
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo16965a(C4084w0 c4084w0, int i7, int i8) {
        c4084w0.m17001n(AbstractC4014B0.m16180c(i7, 5), Integer.valueOf(i8));
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo16966b(C4084w0 c4084w0, int i7, long j7) {
        c4084w0.m17001n(AbstractC4014B0.m16180c(i7, 1), Long.valueOf(j7));
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo16967c(C4084w0 c4084w0, int i7, C4084w0 c4084w02) {
        c4084w0.m17001n(AbstractC4014B0.m16180c(i7, 3), c4084w02);
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo16968d(C4084w0 c4084w0, int i7, AbstractC4055i abstractC4055i) {
        c4084w0.m17001n(AbstractC4014B0.m16180c(i7, 2), abstractC4055i);
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo16969e(C4084w0 c4084w0, int i7, long j7) {
        c4084w0.m17001n(AbstractC4014B0.m16180c(i7, 0), Long.valueOf(j7));
    }

    @Override // com.google.protobuf.AbstractC4082v0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C4084w0 mo16970f(Object obj) {
        C4084w0 mo16971g = mo16971g(obj);
        if (mo16971g != C4084w0.m16986c()) {
            return mo16971g;
        }
        C4084w0 m16990k = C4084w0.m16990k();
        mo16980p(obj, m16990k);
        return m16990k;
    }
}
