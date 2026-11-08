package p135T1;

import android.os.Build;
import p135T1.AbstractC2436c;

/* renamed from: T1.e */
/* loaded from: classes.dex */
public final class C2438e implements AbstractC2436c.b {
    @Override // p135T1.AbstractC2436c.b
    /* renamed from: a */
    public String mo8295a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // p135T1.AbstractC2436c.b
    /* renamed from: b */
    public void mo8296b(String str) {
        System.loadLibrary(str);
    }

    @Override // p135T1.AbstractC2436c.b
    /* renamed from: c */
    public String mo8297c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // p135T1.AbstractC2436c.b
    /* renamed from: d */
    public String[] mo8298d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !AbstractC2439f.m8309a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // p135T1.AbstractC2436c.b
    /* renamed from: e */
    public void mo8299e(String str) {
        System.load(str);
    }
}
