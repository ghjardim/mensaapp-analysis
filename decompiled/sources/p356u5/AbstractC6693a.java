package p356u5;

import android.graphics.Bitmap;

/* renamed from: u5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6693a {
    /* renamed from: a */
    public static final Bitmap.CompressFormat m27606a(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
