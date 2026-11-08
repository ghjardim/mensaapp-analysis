package p356u5;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5469l;
import p048G5.AbstractC0466a;
import p048G5.AbstractC0467b;

/* renamed from: u5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6695c {
    /* renamed from: a */
    public static final File m27607a(Bitmap bitmap, File file, int i7, int i8) {
        AbstractC5469l.m23028e(bitmap, "<this>");
        AbstractC5469l.m23028e(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        bitmap.compress(AbstractC6693a.m27606a(i7), i8, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }

    /* renamed from: b */
    public static final void m27608b(InputStream inputStream, File file) {
        AbstractC5469l.m23028e(inputStream, "<this>");
        AbstractC5469l.m23028e(file, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            AbstractC0466a.m1713b(inputStream, fileOutputStream, 0, 2, null);
            AbstractC0467b.m1715a(fileOutputStream, null);
        } finally {
        }
    }
}
