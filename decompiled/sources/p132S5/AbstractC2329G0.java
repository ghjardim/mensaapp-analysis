package p132S5;

/* renamed from: S5.G0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2329G0 extends AbstractC2328G {
    /* renamed from: K */
    public abstract AbstractC2329G0 mo7989K();

    /* renamed from: M */
    public final String m7990M() {
        AbstractC2329G0 abstractC2329G0;
        AbstractC2329G0 m8055c = C2363Y.m8055c();
        if (this == m8055c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC2329G0 = m8055c.mo7989K();
        } catch (UnsupportedOperationException unused) {
            abstractC2329G0 = null;
        }
        if (this == abstractC2329G0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
