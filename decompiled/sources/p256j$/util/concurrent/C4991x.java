package p256j$.util.concurrent;

import java.security.PrivilegedAction;

/* renamed from: j$.util.concurrent.x */
/* loaded from: classes3.dex */
final class C4991x implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
