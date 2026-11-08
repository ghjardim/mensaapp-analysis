package p256j$.util.stream;

import java.security.PrivilegedAction;

/* renamed from: j$.util.stream.N3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5102N3 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
