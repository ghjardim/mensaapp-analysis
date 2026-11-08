package p166X4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import p370w4.AbstractC6917b;

/* renamed from: X4.b */
/* loaded from: classes2.dex */
public class C2819b {
    /* renamed from: a */
    public static void m10076a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static String m10077b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: c */
    public static String m10078c(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + m10082h(extensionFromMimeType);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        return null;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m10079d(android.content.Context r1, android.net.Uri r2) {
        /*
            android.database.Cursor r1 = m10080f(r1, r2)
            if (r1 == 0) goto L2b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L2b
            int r2 = r1.getColumnCount()     // Catch: java.lang.Throwable -> L21
            r0 = 1
            if (r2 >= r0) goto L14
            goto L2b
        L14:
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = m10082h(r2)     // Catch: java.lang.Throwable -> L21
            r1.close()
            return r2
        L21:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r1 = move-exception
            r2.addSuppressed(r1)
        L2a:
            throw r2
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p166X4.C2819b.m10079d(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: f */
    public static Cursor m10080f(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    /* renamed from: g */
    public static File m10081g(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    /* renamed from: h */
    public static String m10082h(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String str2 = str.split("/")[r4.length - 1];
        for (int i7 = 0; i7 < 2; i7++) {
            str2 = str2.replace(strArr[i7], "_");
        }
        return str2;
    }

    /* renamed from: e */
    public String m10083e(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                String m10079d = m10079d(context, uri);
                String m10078c = m10078c(context, uri);
                if (m10079d == null) {
                    AbstractC6917b.m28359g("FileUtils", "Cannot get file name for " + uri);
                    if (m10078c == null) {
                        m10078c = ".jpg";
                    }
                    m10079d = "image_picker" + m10078c;
                } else if (m10078c != null) {
                    m10079d = m10077b(m10079d) + m10078c;
                }
                File m10081g = m10081g(new File(file, m10079d).getPath(), file.getCanonicalPath());
                FileOutputStream fileOutputStream = new FileOutputStream(m10081g);
                try {
                    m10076a(openInputStream, fileOutputStream);
                    String path = m10081g.getPath();
                    fileOutputStream.close();
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return path;
                } finally {
                }
            } catch (Throwable th) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return null;
        }
    }
}
