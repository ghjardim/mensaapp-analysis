package p372x;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.mime.MimeTypes;
import org.xmlpull.v1.XmlPullParserException;
import p042G.AbstractC0340b;

/* renamed from: x.b */
/* loaded from: classes.dex */
public abstract class AbstractC6936b extends ContentProvider {

    /* renamed from: e */
    public static final String[] f24812e = {"_display_name", "_size"};

    /* renamed from: f */
    public static final File f24813f = new File("/");

    /* renamed from: n */
    public static final HashMap f24814n = new HashMap();

    /* renamed from: a */
    public final Object f24815a;

    /* renamed from: b */
    public String f24816b;

    /* renamed from: c */
    public b f24817c;

    /* renamed from: d */
    public final int f24818d;

    /* renamed from: x.b$a */
    public static class a {
        /* renamed from: a */
        public static File[] m28412a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: x.b$b */
    public interface b {
        /* renamed from: a */
        File mo28413a(Uri uri);

        /* renamed from: b */
        Uri mo28414b(File file);
    }

    /* renamed from: x.b$c */
    public static class c implements b {

        /* renamed from: a */
        public final String f24819a;

        /* renamed from: b */
        public final HashMap f24820b = new HashMap();

        public c(String str) {
            this.f24819a = str;
        }

        @Override // p372x.AbstractC6936b.b
        /* renamed from: a */
        public File mo28413a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f24820b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m28416d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // p372x.AbstractC6936b.b
        /* renamed from: b */
        public Uri mo28414b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f24820b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (m28416d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f24819a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: c */
        public void m28415c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f24820b.put(str, file.getCanonicalFile());
            } catch (IOException e7) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
            }
        }

        /* renamed from: d */
        public final boolean m28416d(String str, String str2) {
            String m28410k = AbstractC6936b.m28410k(str);
            String m28410k2 = AbstractC6936b.m28410k(str2);
            if (!m28410k.equals(m28410k2)) {
                if (!m28410k.startsWith(m28410k2 + '/')) {
                    return false;
                }
            }
            return true;
        }
    }

    public AbstractC6936b() {
        this(0);
    }

    /* renamed from: b */
    public static File m28402b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: c */
    public static Object[] m28403c(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[i7];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        return objArr2;
    }

    /* renamed from: d */
    public static String[] m28404d(String[] strArr, int i7) {
        String[] strArr2 = new String[i7];
        System.arraycopy(strArr, 0, strArr2, 0, i7);
        return strArr2;
    }

    /* renamed from: e */
    public static XmlResourceParser m28405e(Context context, String str, ProviderInfo providerInfo, int i7) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i7 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i7);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* renamed from: g */
    public static b m28406g(Context context, String str, int i7) {
        b bVar;
        HashMap hashMap = f24814n;
        synchronized (hashMap) {
            try {
                bVar = (b) hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = m28409j(context, str, i7);
                            hashMap.put(str, bVar);
                        } catch (IOException e7) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                        }
                    } catch (XmlPullParserException e8) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* renamed from: h */
    public static Uri m28407h(Context context, String str, File file) {
        return m28406g(context, str, 0).mo28414b(file);
    }

    /* renamed from: i */
    public static int m28408i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX.equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: j */
    public static b m28409j(Context context, String str, int i7) {
        c cVar = new c(str);
        XmlResourceParser m28405e = m28405e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i7);
        while (true) {
            int next = m28405e.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = m28405e.getName();
                File file = null;
                String attributeValue = m28405e.getAttributeValue(null, "name");
                String attributeValue2 = m28405e.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f24813f;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = AbstractC6935a.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = AbstractC6935a.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] m28412a = a.m28412a(context);
                    if (m28412a.length > 0) {
                        file = m28412a[0];
                    }
                }
                if (file != null) {
                    cVar.m28415c(attributeValue, m28402b(file, attributeValue2));
                }
            }
        }
    }

    /* renamed from: k */
    public static String m28410k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f24815a) {
            this.f24816b = str;
        }
        HashMap hashMap = f24814n;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return m28411f().mo28413a(uri).delete() ? 1 : 0;
    }

    /* renamed from: f */
    public final b m28411f() {
        b bVar;
        synchronized (this.f24815a) {
            try {
                AbstractC0340b.m1347d(this.f24816b, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f24817c == null) {
                    this.f24817c = m28406g(getContext(), this.f24816b, this.f24818d);
                }
                bVar = this.f24817c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo28413a = m28411f().mo28413a(uri);
        int lastIndexOf = mo28413a.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return MimeTypes.OCTET_STREAM;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo28413a.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : MimeTypes.OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return MimeTypes.OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(m28411f().mo28413a(uri), m28408i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        File mo28413a = m28411f().mo28413a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f24812e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = queryParameter == null ? mo28413a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(mo28413a.length());
            }
            i8 = i7;
        }
        String[] m28404d = m28404d(strArr3, i8);
        Object[] m28403c = m28403c(objArr, i8);
        MatrixCursor matrixCursor = new MatrixCursor(m28404d, 1);
        matrixCursor.addRow(m28403c);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public AbstractC6936b(int i7) {
        this.f24815a = new Object();
        this.f24818d = i7;
    }
}
