package androidx.datastore.preferences.protobuf;

import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.e0 */
/* loaded from: classes.dex */
public class C3289e0 extends RuntimeException {

    /* renamed from: a */
    public final List f10448a;

    public C3289e0(InterfaceC3264J interfaceC3264J) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f10448a = null;
    }

    /* renamed from: a */
    public C3313v m12333a() {
        return new C3313v(getMessage());
    }
}
