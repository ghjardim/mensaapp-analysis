package p045G2;

import android.content.Context;

/* renamed from: G2.f */
/* loaded from: classes.dex */
public class C0385f {

    /* renamed from: b */
    public static final C0385f f1488b = new C0385f();

    /* renamed from: a */
    public C0384e f1489a = null;

    /* renamed from: a */
    public static C0384e m1578a(Context context) {
        return f1488b.m1579b(context);
    }

    /* renamed from: b */
    public final synchronized C0384e m1579b(Context context) {
        try {
            if (this.f1489a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f1489a = new C0384e(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1489a;
    }
}
