package p116Q3;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/* renamed from: Q3.u */
/* loaded from: classes.dex */
public abstract class AbstractC2152u {

    /* renamed from: Q3.u$a */
    public static class a {
        /* renamed from: a */
        public static void m7307a(File file) {
            Path path;
            try {
                path = file.toPath();
                Files.deleteIfExists(path);
            } catch (IOException e7) {
                throw new IOException("Failed to delete file " + file + ": " + e7);
            }
        }
    }

    /* renamed from: Q3.u$b */
    public static class b {
        /* renamed from: a */
        public static void m7308a(File file) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
    }

    /* renamed from: a */
    public static void m7306a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.m7307a(file);
        } else {
            b.m7308a(file);
        }
    }
}
