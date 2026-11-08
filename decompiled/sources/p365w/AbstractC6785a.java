package p365w;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import p372x.AbstractC6935a;

/* renamed from: w.a */
/* loaded from: classes.dex */
public abstract class AbstractC6785a extends AbstractC6935a {

    /* renamed from: w.a$a */
    public static class a {
        /* renamed from: a */
        public static void m27827a(Activity activity, String[] strArr, int i7) {
            activity.requestPermissions(strArr, i7);
        }
    }

    /* renamed from: w.a$b */
    public interface b {
        /* renamed from: b */
        void mo9930b(int i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m27824a(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof b) {
            ((b) activity).mo9930b(i7);
        }
        a.m27827a(activity, strArr, i7);
    }

    /* renamed from: b */
    public static void m27825b(Activity activity, Intent intent, int i7, Bundle bundle) {
        activity.startActivityForResult(intent, i7, bundle);
    }

    /* renamed from: c */
    public static void m27826c(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }
}
