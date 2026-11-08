package com.google.protobuf;

/* renamed from: com.google.protobuf.b */
/* loaded from: classes.dex */
public abstract class AbstractC4041b implements InterfaceC4050f0 {

    /* renamed from: a */
    public static final C4071q f13355a = C4071q.m16878b();

    /* renamed from: c */
    public final InterfaceC4034V m16421c(InterfaceC4034V interfaceC4034V) {
        if (interfaceC4034V == null || interfaceC4034V.mo16323d()) {
            return interfaceC4034V;
        }
        throw m16422d(interfaceC4034V).m16963a().m16249k(interfaceC4034V);
    }

    /* renamed from: d */
    public final C4080u0 m16422d(InterfaceC4034V interfaceC4034V) {
        return interfaceC4034V instanceof AbstractC4039a ? ((AbstractC4039a) interfaceC4034V).m16415n() : new C4080u0(interfaceC4034V);
    }

    @Override // com.google.protobuf.InterfaceC4050f0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC4034V mo16420a(AbstractC4057j abstractC4057j, C4071q c4071q) {
        return m16421c((InterfaceC4034V) mo16487b(abstractC4057j, c4071q));
    }
}
