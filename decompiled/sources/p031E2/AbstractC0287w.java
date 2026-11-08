package p031E2;

import android.os.StrictMode;

/* renamed from: E2.w */
/* loaded from: classes.dex */
public abstract class AbstractC0287w {
    /* renamed from: a */
    public static StrictMode.VmPolicy m1154a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (AbstractC0277m.m1138i()) {
            StrictMode.setVmPolicy(AbstractC0286v.m1153a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
