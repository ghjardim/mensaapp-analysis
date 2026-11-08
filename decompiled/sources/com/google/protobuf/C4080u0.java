package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.u0 */
/* loaded from: classes.dex */
public class C4080u0 extends RuntimeException {

    /* renamed from: a */
    public final List f13520a;

    public C4080u0(InterfaceC4034V interfaceC4034V) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f13520a = null;
    }

    /* renamed from: a */
    public C4017D m16963a() {
        return new C4017D(getMessage());
    }
}
