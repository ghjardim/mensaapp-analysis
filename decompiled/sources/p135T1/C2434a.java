package p135T1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p135T1.AbstractC2436c;

/* renamed from: T1.a */
/* loaded from: classes.dex */
public class C2434a implements AbstractC2436c.a {

    /* renamed from: T1.a$a */
    public static class a {

        /* renamed from: a */
        public ZipFile f7208a;

        /* renamed from: b */
        public ZipEntry f7209b;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f7208a = zipFile;
            this.f7209b = zipEntry;
        }
    }

    @Override // p135T1.AbstractC2436c.a
    /* renamed from: a */
    public void mo8287a(Context context, String[] strArr, String str, File file, C2437d c2437d) {
        String[] strArr2;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        long m8289c;
        a aVar = null;
        Closeable closeable = null;
        try {
            a m8290d = m8290d(context, strArr, str, c2437d);
            try {
                if (m8290d == null) {
                    try {
                        strArr2 = m8291e(context, str);
                    } catch (Exception e7) {
                        strArr2 = new String[]{e7.toString()};
                    }
                    throw new C2435b(str, strArr, strArr2);
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 >= 5) {
                        c2437d.m8307h("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile = m8290d.f7208a;
                            if (zipFile != null) {
                                zipFile.close();
                                return;
                            }
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    c2437d.m8308i("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = m8290d.f7208a.getInputStream(m8290d.f7209b);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                } catch (FileNotFoundException unused2) {
                                    fileOutputStream = null;
                                } catch (IOException unused3) {
                                    fileOutputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                }
                            } catch (FileNotFoundException unused4) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (IOException unused5) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                            try {
                                m8289c = m8289c(inputStream, fileOutputStream);
                                fileOutputStream.getFD().sync();
                            } catch (FileNotFoundException unused6) {
                                m8288b(inputStream);
                                m8288b(fileOutputStream);
                                i7 = i8;
                            } catch (IOException unused7) {
                                m8288b(inputStream);
                                m8288b(fileOutputStream);
                                i7 = i8;
                            } catch (Throwable th3) {
                                th = th3;
                                closeable = inputStream;
                                m8288b(closeable);
                                m8288b(fileOutputStream);
                                throw th;
                            }
                            if (m8289c == file.length()) {
                                m8288b(inputStream);
                                m8288b(fileOutputStream);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                try {
                                    ZipFile zipFile2 = m8290d.f7208a;
                                    if (zipFile2 != null) {
                                        zipFile2.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException unused8) {
                                    return;
                                }
                            }
                            m8288b(inputStream);
                            m8288b(fileOutputStream);
                        }
                    } catch (IOException unused9) {
                    }
                    i7 = i8;
                }
            } catch (Throwable th4) {
                th = th4;
                aVar = m8290d;
                if (aVar != null) {
                    try {
                        ZipFile zipFile3 = aVar.f7208a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: b */
    public final void m8288b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public final long m8289c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j7 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j7;
            }
            outputStream.write(bArr, 0, read);
            j7 += read;
        }
    }

    /* renamed from: d */
    public final a m8290d(Context context, String[] strArr, String str, C2437d c2437d) {
        String[] m8292f = m8292f(context);
        int length = m8292f.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i8 >= length) {
                return null;
            }
            String str2 = m8292f[i8];
            int i9 = i7;
            while (true) {
                int i10 = i9 + 1;
                if (i9 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i9 = i10;
                }
            }
            if (zipFile != null) {
                int i11 = i7;
                while (true) {
                    int i12 = i11 + 1;
                    if (i11 < 5) {
                        int length2 = strArr.length;
                        int i13 = i7;
                        while (i13 < length2) {
                            String str3 = strArr[i13];
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c7 = File.separatorChar;
                            sb.append(c7);
                            sb.append(str3);
                            sb.append(c7);
                            sb.append(str);
                            String sb2 = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[i7] = sb2;
                            objArr[1] = str2;
                            c2437d.m8308i("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new a(zipFile, entry);
                            }
                            i13++;
                            i7 = 0;
                        }
                        i11 = i12;
                        i7 = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i8++;
            i7 = 0;
        }
    }

    /* renamed from: e */
    public final String[] m8291e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c7 = File.separatorChar;
        sb.append(c7);
        sb.append("([^\\");
        sb.append(c7);
        sb.append("]*)");
        sb.append(c7);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m8292f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: f */
    public final String[] m8292f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
