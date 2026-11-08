package p355u4;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p061I4.C0658j;
import p061I4.C0659k;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7025p;

/* renamed from: u4.c */
/* loaded from: classes.dex */
public final class C6692c implements C0659k.c {

    /* renamed from: c */
    public final PackageManager f24107c;

    /* renamed from: d */
    public final ActivityManager f24108d;

    /* renamed from: e */
    public final ContentResolver f24109e;

    public C6692c(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        AbstractC5469l.m23028e(packageManager, "packageManager");
        AbstractC5469l.m23028e(activityManager, "activityManager");
        AbstractC5469l.m23028e(contentResolver, "contentResolver");
        this.f24107c = packageManager;
        this.f24108d = activityManager;
        this.f24109e = contentResolver;
    }

    /* renamed from: a */
    public final List m27604a() {
        FeatureInfo[] systemAvailableFeatures = this.f24107c.getSystemAvailableFeatures();
        AbstractC5469l.m23027d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name != null) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7025p.m28868n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    @Override // p061I4.C0659k.c
    /* renamed from: b */
    public void mo2185b(C0658j call, C0659k.d result) {
        String str;
        AbstractC5469l.m23028e(call, "call");
        AbstractC5469l.m23028e(result, "result");
        if (!call.f2254a.equals("getDeviceInfo")) {
            result.mo2316c();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("device", Build.DEVICE);
        hashMap.put("display", Build.DISPLAY);
        hashMap.put("fingerprint", Build.FINGERPRINT);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("host", Build.HOST);
        hashMap.put("id", Build.ID);
        hashMap.put("manufacturer", Build.MANUFACTURER);
        hashMap.put("model", Build.MODEL);
        hashMap.put("product", Build.PRODUCT);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 25) {
            String string = Settings.Global.getString(this.f24109e, "device_name");
            if (string == null) {
                string = StringUtils.EMPTY;
            }
            hashMap.put("name", string);
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", AbstractC7024o.m28864j(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", AbstractC7024o.m28864j(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", AbstractC7024o.m28864j(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!m27605c()));
        hashMap.put("systemFeatures", m27604a());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
        hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("baseOS", Build.VERSION.BASE_OS);
        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap2.put("codename", Build.VERSION.CODENAME);
        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap2.put("release", Build.VERSION.RELEASE);
        hashMap2.put("sdkInt", Integer.valueOf(i7));
        hashMap.put("version", hashMap2);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f24108d.getMemoryInfo(memoryInfo);
        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
        hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
        if (i7 >= 26) {
            try {
                str = Build.getSerial();
            } catch (SecurityException unused) {
                str = "unknown";
            }
            hashMap.put("serialNumber", str);
        } else {
            hashMap.put("serialNumber", Build.SERIAL);
        }
        result.mo2314a(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (p125R5.AbstractC2291q.m7745u(r0, "generic", false, 2, null) == false) goto L6;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m27605c() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = p125R5.AbstractC2291q.m7745u(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r5)
            boolean r0 = p125R5.AbstractC2291q.m7745u(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
        L1f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r5)
            boolean r1 = p125R5.AbstractC2291q.m7745u(r0, r1, r2, r3, r4)
            if (r1 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = p125R5.AbstractC2291q.m7745u(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = p125R5.AbstractC2294t.m7746A(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = p125R5.AbstractC2294t.m7746A(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r5 = p125R5.AbstractC2294t.m7746A(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = p125R5.AbstractC2294t.m7746A(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = p125R5.AbstractC2294t.m7746A(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = p125R5.AbstractC2294t.m7746A(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Lb5
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = p125R5.AbstractC2294t.m7746A(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = p125R5.AbstractC2294t.m7746A(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = p125R5.AbstractC2294t.m7746A(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Lb5
            kotlin.jvm.internal.AbstractC5469l.m23027d(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = p125R5.AbstractC2294t.m7746A(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Lb6
        Lb5:
            r2 = 1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p355u4.C6692c.m27605c():boolean");
    }
}
