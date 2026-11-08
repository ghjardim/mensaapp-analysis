package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p123R3.C2253f;
import p212d4.AbstractC4123e;
import p212d4.AbstractC4126h;
import p212d4.C4121c;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: e */
    public static /* synthetic */ String m15270e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : StringUtils.EMPTY;
    }

    /* renamed from: f */
    public static /* synthetic */ String m15271f(Context context) {
        int i7;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return StringUtils.EMPTY;
        }
        i7 = applicationInfo.minSdkVersion;
        return String.valueOf(i7);
    }

    /* renamed from: g */
    public static /* synthetic */ String m15272g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? StringUtils.EMPTY : "embedded";
    }

    /* renamed from: h */
    public static /* synthetic */ String m15273h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m15274i(installerPackageName) : StringUtils.EMPTY;
    }

    /* renamed from: i */
    public static String m15274i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4121c.m17304c());
        arrayList.add(C2253f.m7668g());
        arrayList.add(AbstractC4126h.m17313b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC4126h.m17313b("fire-core", "21.0.0"));
        arrayList.add(AbstractC4126h.m17313b("device-name", m15274i(Build.PRODUCT)));
        arrayList.add(AbstractC4126h.m17313b("device-model", m15274i(Build.DEVICE)));
        arrayList.add(AbstractC4126h.m17313b("device-brand", m15274i(Build.BRAND)));
        arrayList.add(AbstractC4126h.m17314c("android-target-sdk", new AbstractC4126h.a() { // from class: e3.i
            @Override // p212d4.AbstractC4126h.a
            /* renamed from: a */
            public final String mo17316a(Object obj) {
                String m15270e;
                m15270e = FirebaseCommonRegistrar.m15270e((Context) obj);
                return m15270e;
            }
        }));
        arrayList.add(AbstractC4126h.m17314c("android-min-sdk", new AbstractC4126h.a() { // from class: e3.j
            @Override // p212d4.AbstractC4126h.a
            /* renamed from: a */
            public final String mo17316a(Object obj) {
                String m15271f;
                m15271f = FirebaseCommonRegistrar.m15271f((Context) obj);
                return m15271f;
            }
        }));
        arrayList.add(AbstractC4126h.m17314c("android-platform", new AbstractC4126h.a() { // from class: e3.k
            @Override // p212d4.AbstractC4126h.a
            /* renamed from: a */
            public final String mo17316a(Object obj) {
                String m15272g;
                m15272g = FirebaseCommonRegistrar.m15272g((Context) obj);
                return m15272g;
            }
        }));
        arrayList.add(AbstractC4126h.m17314c("android-installer", new AbstractC4126h.a() { // from class: e3.l
            @Override // p212d4.AbstractC4126h.a
            /* renamed from: a */
            public final String mo17316a(Object obj) {
                String m15273h;
                m15273h = FirebaseCommonRegistrar.m15273h((Context) obj);
                return m15273h;
            }
        }));
        String m17310a = AbstractC4123e.m17310a();
        if (m17310a != null) {
            arrayList.add(AbstractC4126h.m17313b("kotlin", m17310a));
        }
        return arrayList;
    }
}
