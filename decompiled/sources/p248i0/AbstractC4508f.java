package p248i0;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* renamed from: i0.f */
/* loaded from: classes.dex */
public abstract class AbstractC4508f {
    /* renamed from: a */
    public static void m19211a(Spannable spannable, float f7, int i7, int i8, int i9) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i7, i8, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i7 && spannable.getSpanEnd(relativeSizeSpan) >= i8) {
                f7 *= relativeSizeSpan.getSizeChange();
            }
            m19213c(spannable, relativeSizeSpan, i7, i8, i9);
        }
        spannable.setSpan(new RelativeSizeSpan(f7), i7, i8, i9);
    }

    /* renamed from: b */
    public static void m19212b(Spannable spannable, Object obj, int i7, int i8, int i9) {
        for (Object obj2 : spannable.getSpans(i7, i8, obj.getClass())) {
            m19213c(spannable, obj2, i7, i8, i9);
        }
        spannable.setSpan(obj, i7, i8, i9);
    }

    /* renamed from: c */
    public static void m19213c(Spannable spannable, Object obj, int i7, int i8, int i9) {
        if (spannable.getSpanStart(obj) == i7 && spannable.getSpanEnd(obj) == i8 && spannable.getSpanFlags(obj) == i9) {
            spannable.removeSpan(obj);
        }
    }
}
