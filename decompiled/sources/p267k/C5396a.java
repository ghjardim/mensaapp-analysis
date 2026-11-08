package p267k;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: k.a */
/* loaded from: classes.dex */
public class C5396a implements TransformationMethod {

    /* renamed from: a */
    public Locale f19236a;

    public C5396a(Context context) {
        this.f19236a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f19236a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i7, Rect rect) {
    }
}
