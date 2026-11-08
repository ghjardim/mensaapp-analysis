package p139T5;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p132S5.InterfaceC2330H;
import p392z5.AbstractC7153a;
import p392z5.InterfaceC7161i;

/* renamed from: T5.b */
/* loaded from: classes2.dex */
public final class C2484b extends AbstractC7153a implements InterfaceC2330H {
    private volatile Object _preHandler;

    public C2484b() {
        super(InterfaceC2330H.f7065i);
        this._preHandler = this;
    }

    /* renamed from: D */
    public final Method m8411D() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // p132S5.InterfaceC2330H
    /* renamed from: a */
    public void mo7991a(InterfaceC7161i interfaceC7161i, Throwable th) {
        int i7 = Build.VERSION.SDK_INT;
        if (26 > i7 || i7 >= 28) {
            return;
        }
        Method m8411D = m8411D();
        Object invoke = m8411D != null ? m8411D.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
