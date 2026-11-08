package p368w2;

import java.lang.ref.WeakReference;

/* renamed from: w2.E */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6847E extends AbstractBinderC6845C {

    /* renamed from: c */
    public static final WeakReference f24642c = new WeakReference(null);

    /* renamed from: b */
    public WeakReference f24643b;

    public AbstractBinderC6847E(byte[] bArr) {
        super(bArr);
        this.f24643b = f24642c;
    }

    /* renamed from: Y */
    public abstract byte[] mo28215Y();

    @Override // p368w2.AbstractBinderC6845C
    /* renamed from: f */
    public final byte[] mo28217f() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f24643b.get();
                if (bArr == null) {
                    bArr = mo28215Y();
                    this.f24643b = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
