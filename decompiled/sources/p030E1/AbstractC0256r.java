package p030E1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: E1.r */
/* loaded from: classes.dex */
public abstract class AbstractC0256r {

    /* renamed from: a */
    public static final boolean f1077a;

    /* renamed from: b */
    public static final boolean f1078b;

    /* renamed from: c */
    public static final boolean f1079c;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f1077a = true;
        f1078b = true;
        f1079c = i7 >= 28;
    }

    /* renamed from: a */
    public static View m1083a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        AbstractC0223A.m930i(view, matrix);
        AbstractC0223A.m931j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap m1084b = m1084b(view, matrix, rectF, viewGroup);
        if (m1084b != null) {
            imageView.setImageBitmap(m1084b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    public static Bitmap m1084b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z6;
        boolean z7;
        int i7;
        ViewGroup viewGroup2;
        if (f1077a) {
            z6 = !view.isAttachedToWindow();
            z7 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z6 = false;
            z7 = false;
        }
        boolean z8 = f1078b;
        Bitmap bitmap = null;
        if (!z8 || !z6) {
            i7 = 0;
            viewGroup2 = null;
        } else {
            if (!z7) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i7 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f1079c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z8 && z6) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i7);
        }
        return bitmap;
    }

    /* renamed from: c */
    public static Animator m1085c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
