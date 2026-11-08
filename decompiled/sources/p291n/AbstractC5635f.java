package p291n;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: n.f */
/* loaded from: classes.dex */
public abstract class AbstractC5635f {
    /* renamed from: a */
    public static InputConnection m23669a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnection;
    }
}
