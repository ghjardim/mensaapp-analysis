package p276l0;

import java.io.IOException;

/* renamed from: l0.h */
/* loaded from: classes.dex */
public class C5494h extends IOException {

    /* renamed from: a */
    public final int f19774a;

    public C5494h(int i7) {
        this.f19774a = i7;
    }

    /* renamed from: a */
    public static boolean m23076a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof C5494h) && ((C5494h) iOException2).f19774a == 2008) {
                return true;
            }
        }
        return false;
    }

    public C5494h(Throwable th, int i7) {
        super(th);
        this.f19774a = i7;
    }

    public C5494h(String str, int i7) {
        super(str);
        this.f19774a = i7;
    }

    public C5494h(String str, Throwable th, int i7) {
        super(str, th);
        this.f19774a = i7;
    }
}
