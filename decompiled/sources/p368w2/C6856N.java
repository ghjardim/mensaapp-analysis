package p368w2;

import java.util.concurrent.Callable;

/* renamed from: w2.N */
/* loaded from: classes.dex */
public final class C6856N extends C6858P {

    /* renamed from: f */
    public final Callable f24666f;

    public /* synthetic */ C6856N(Callable callable, AbstractC6857O abstractC6857O) {
        super();
        this.f24666f = callable;
    }

    @Override // p368w2.C6858P
    /* renamed from: a */
    public final String mo28229a() {
        try {
            return (String) this.f24666f.call();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
