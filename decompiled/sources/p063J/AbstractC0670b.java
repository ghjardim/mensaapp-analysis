package p063J;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import p021D.C0093a;

/* renamed from: J.b */
/* loaded from: classes.dex */
public abstract class AbstractC0670b {

    /* renamed from: a */
    public static final String[] f2273a = new String[0];

    /* renamed from: J.b$a */
    public static class a {
        /* renamed from: a */
        public static void m2681a(EditorInfo editorInfo, boolean z6) {
            editorInfo.setStylusHandwritingEnabled(z6);
        }
    }

    /* renamed from: a */
    public static void m2679a(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: b */
    public static void m2680b(EditorInfo editorInfo, boolean z6) {
        if (C0093a.m246b()) {
            a.m2681a(editorInfo, z6);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z6);
    }
}
