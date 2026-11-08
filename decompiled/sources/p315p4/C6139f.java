package p315p4;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.p307io.TikaInputStream;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0068l;
import p048G5.AbstractC0467b;
import p061I4.C0659k;
import p069J5.InterfaceC0804p;
import p125R5.AbstractC2291q;
import p125R5.AbstractC2294t;
import p125R5.C2280f;
import p132S5.AbstractC2336K;
import p132S5.AbstractC2388k;
import p132S5.C2363Y;
import p132S5.InterfaceC2334J;
import p315p4.C6134a;
import p371w5.AbstractC6928k;
import p371w5.C6934q;
import p378x5.AbstractC7024o;
import p378x5.AbstractC7032w;
import p392z5.InterfaceC7157e;

/* renamed from: p4.f */
/* loaded from: classes.dex */
public final class C6139f {

    /* renamed from: a */
    public static final C6139f f21921a = new C6139f();

    /* renamed from: p4.f$a */
    public static final class a extends AbstractC0068l implements InterfaceC0804p {

        /* renamed from: a */
        public int f21922a;

        /* renamed from: b */
        public final /* synthetic */ Intent f21923b;

        /* renamed from: c */
        public final /* synthetic */ C6136c f21924c;

        /* renamed from: d */
        public final /* synthetic */ Activity f21925d;

        /* renamed from: e */
        public final /* synthetic */ int f21926e;

        /* renamed from: f */
        public final /* synthetic */ boolean f21927f;

        /* renamed from: n */
        public final /* synthetic */ String f21928n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Intent intent, C6136c c6136c, Activity activity, int i7, boolean z6, String str, InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
            this.f21923b = intent;
            this.f21924c = c6136c;
            this.f21925d = activity;
            this.f21926e = i7;
            this.f21927f = z6;
            this.f21928n = str;
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2334J interfaceC2334J, InterfaceC7157e interfaceC7157e) {
            return ((a) create(interfaceC2334J, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            return new a(this.f21923b, this.f21924c, this.f21925d, this.f21926e, this.f21927f, this.f21928n, interfaceC7157e);
        }

        @Override // p013B5.AbstractC0057a
        public final Object invokeSuspend(Object obj) {
            AbstractC0024c.m76e();
            if (this.f21922a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6928k.m28382b(obj);
            if (this.f21923b == null) {
                this.f21924c.m25543h("unknown_activity", "Unknown activity error, please fill an issue.");
                return C6934q.f24811a;
            }
            ArrayList arrayList = new ArrayList();
            if (this.f21923b.getClipData() != null) {
                ClipData clipData = this.f21923b.getClipData();
                AbstractC5469l.m23025b(clipData);
                int itemCount = clipData.getItemCount();
                for (int i7 = 0; i7 < itemCount; i7++) {
                    ClipData clipData2 = this.f21923b.getClipData();
                    AbstractC5469l.m23025b(clipData2);
                    Uri uri = clipData2.getItemAt(i7).getUri();
                    C6139f c6139f = C6139f.f21921a;
                    Activity activity = this.f21925d;
                    AbstractC5469l.m23025b(uri);
                    c6139f.m25582e(this.f21925d, c6139f.m25596y(activity, uri, this.f21926e), this.f21927f, arrayList);
                }
                this.f21924c.m25544i(arrayList);
            } else if (this.f21923b.getData() != null) {
                C6139f c6139f2 = C6139f.f21921a;
                Activity activity2 = this.f21925d;
                Uri data = this.f21923b.getData();
                AbstractC5469l.m23025b(data);
                Uri m25596y = c6139f2.m25596y(activity2, data, this.f21926e);
                if (AbstractC5469l.m23024a(this.f21928n, "dir")) {
                    String m25575n = C6139f.m25575n(DocumentsContract.buildDocumentUriUsingTree(m25596y, DocumentsContract.getTreeDocumentId(m25596y)), this.f21925d);
                    if (m25575n != null) {
                        this.f21924c.m25544i(m25575n);
                    } else {
                        this.f21924c.m25543h("unknown_path", "Failed to retrieve directory path.");
                    }
                } else {
                    c6139f2.m25582e(this.f21925d, m25596y, this.f21927f, arrayList);
                    c6139f2.m25592s(this.f21924c, arrayList);
                }
            } else {
                Bundle extras = this.f21923b.getExtras();
                if (extras == null || !extras.containsKey("selectedItems")) {
                    this.f21924c.m25543h("unknown_activity", "Unknown activity error, please fill an issue.");
                } else {
                    C6139f c6139f3 = C6139f.f21921a;
                    Bundle extras2 = this.f21923b.getExtras();
                    AbstractC5469l.m23025b(extras2);
                    ArrayList m25591r = c6139f3.m25591r(extras2);
                    if (m25591r != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : m25591r) {
                            if (obj2 instanceof Uri) {
                                arrayList2.add(obj2);
                            }
                        }
                        Activity activity3 = this.f21925d;
                        boolean z6 = this.f21927f;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C6139f.f21921a.m25582e(activity3, (Uri) it.next(), z6, arrayList);
                        }
                    }
                    this.f21924c.m25544i(arrayList);
                }
            }
            return C6934q.f24811a;
        }
    }

    /* renamed from: f */
    public static final boolean m25572f(Context context) {
        AbstractC5469l.m23028e(context, "context");
        try {
            f21921a.m25597z(new File(context.getCacheDir() + "/file_picker/"));
            return true;
        } catch (Exception e7) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e7);
            return false;
        }
    }

    /* renamed from: g */
    public static final Uri m25573g(Uri originalImageUri, int i7, Context context) {
        AbstractC5469l.m23028e(originalImageUri, "originalImageUri");
        AbstractC5469l.m23028e(context, "context");
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(originalImageUri);
            try {
                C6139f c6139f = f21921a;
                File m25583h = c6139f.m25583h(context, originalImageUri);
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(m25583h);
                decodeStream.compress(c6139f.m25584i(context, originalImageUri), i7, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri fromFile = Uri.fromFile(m25583h);
                C6934q c6934q = C6934q.f24811a;
                AbstractC0467b.m1715a(openInputStream, null);
                return fromFile;
            } finally {
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: m */
    public static final String m25574m(Uri uri, Context context) {
        String str;
        AbstractC5469l.m23028e(uri, "uri");
        AbstractC5469l.m23028e(context, "context");
        String str2 = null;
        try {
            if (AbstractC5469l.m23024a(uri.getScheme(), "content")) {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                try {
                    try {
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                                    C6934q c6934q = C6934q.f24811a;
                                    AbstractC0467b.m1715a(query, null);
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC0467b.m1715a(query, th);
                                    throw th2;
                                }
                            }
                        }
                        AbstractC0467b.m1715a(query, null);
                    } catch (Exception e7) {
                        e = e7;
                        str2 = str;
                        Log.e("FilePickerUtils", "Failed to handle file name: " + e);
                        return str2;
                    }
                    C6934q c6934q2 = C6934q.f24811a;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str;
                    throw th;
                }
                str = null;
            } else {
                str = null;
            }
        } catch (Exception e8) {
            e = e8;
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        if (path != null) {
            str2 = AbstractC2294t.m7786o0(path, '/', null, 2, null);
        }
        return str2;
    }

    /* renamed from: n */
    public static final String m25575n(Uri uri, Context con) {
        List m28861g;
        AbstractC5469l.m23028e(con, "con");
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 30 && f21921a.m25593t(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (AbstractC5469l.m23024a(documentId, "downloads")) {
                return path;
            }
            AbstractC5469l.m23025b(documentId);
            if (new C2280f("^ms[df]:.*").m7722a(documentId)) {
                return path + '/' + m25574m(uri, con);
            }
            if (!AbstractC2291q.m7745u(documentId, "raw:", false, 2, null)) {
                return null;
            }
            List m7724c = new C2280f(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).m7724c(documentId, 0);
            if (!m7724c.isEmpty()) {
                ListIterator listIterator = m7724c.listIterator(m7724c.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        m28861g = AbstractC7032w.m28885K(m7724c, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m28861g = AbstractC7024o.m28861g();
            return ((String[]) m28861g.toArray(new String[0]))[1];
        }
        C6139f c6139f = f21921a;
        String m25590q = c6139f.m25590q(uri);
        String separator = File.separator;
        AbstractC5469l.m23027d(separator, "separator");
        if (AbstractC2291q.m7739o(m25590q, separator, false, 2, null)) {
            m25590q = m25590q.substring(0, m25590q.length() - 1);
            AbstractC5469l.m23027d(m25590q, "substring(...)");
        }
        String m25585j = c6139f.m25585j(uri);
        AbstractC5469l.m23027d(separator, "separator");
        if (AbstractC2291q.m7739o(m25585j, separator, false, 2, null)) {
            m25585j = m25585j.substring(0, m25585j.length() - 1);
            AbstractC5469l.m23027d(m25585j, "substring(...)");
        }
        if (m25585j.length() <= 0 || AbstractC2291q.m7739o(m25590q, m25585j, false, 2, null)) {
            return m25590q;
        }
        AbstractC5469l.m23027d(separator, "separator");
        if (AbstractC2291q.m7745u(m25585j, separator, false, 2, null)) {
            return m25590q + m25585j;
        }
        return m25590q + separator + m25585j;
    }

    /* renamed from: u */
    public static final boolean m25576u(Context context, Uri uri) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(uri, "uri");
        String m25586k = f21921a.m25586k(context, uri);
        if (m25586k == null) {
            return false;
        }
        return m25586k.contentEquals("jpg") || m25586k.contentEquals("jpeg") || m25586k.contentEquals("png") || m25586k.contentEquals("webp");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0122 A[Catch: IOException -> 0x011e, TryCatch #8 {IOException -> 0x011e, blocks: (B:65:0x0114, B:67:0x011a, B:56:0x0122, B:58:0x0127), top: B:64:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127 A[Catch: IOException -> 0x011e, TRY_LEAVE, TryCatch #8 {IOException -> 0x011e, blocks: (B:65:0x0114, B:67:0x011a, B:56:0x0122, B:58:0x0127), top: B:64:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p315p4.C6134a m25577w(android.content.Context r13, android.net.Uri r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p315p4.C6139f.m25577w(android.content.Context, android.net.Uri, boolean):p4.a");
    }

    /* renamed from: A */
    public final void m25578A(C6136c c6136c, String str, String str2, String str3, byte[] bArr, C0659k.d result) {
        AbstractC5469l.m23028e(c6136c, "<this>");
        AbstractC5469l.m23028e(result, "result");
        if (!c6136c.m25558w(result)) {
            C6136c.f21897l.m25560a(result);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null && str.length() != 0) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        c6136c.m25553r(bArr);
        if (!AbstractC5469l.m23024a("dir", str2)) {
            intent.setType(m25588o(str, bArr));
        }
        if (str3 != null && str3.length() != 0 && Build.VERSION.SDK_INT >= 26) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str3));
        }
        if (intent.resolveActivity(c6136c.m25545j().getPackageManager()) != null) {
            c6136c.m25545j().startActivityForResult(intent, C6136c.f21897l.m25562c());
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            c6136c.m25543h("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    /* renamed from: B */
    public final void m25579B(C6136c c6136c) {
        Intent intent;
        List m7779h0;
        AbstractC5469l.m23028e(c6136c, "<this>");
        if (c6136c.m25547l() == null) {
            return;
        }
        if (AbstractC5469l.m23024a(c6136c.m25547l(), "dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else if (AbstractC5469l.m23024a(c6136c.m25547l(), "image/*")) {
            intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), c6136c.m25547l());
            intent.setType(c6136c.m25547l());
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c6136c.m25550o());
            intent.putExtra("multi-pick", c6136c.m25550o());
            String m25547l = c6136c.m25547l();
            if (m25547l != null) {
                String str = AbstractC2294t.m7746A(m25547l, ",", false, 2, null) ? m25547l : null;
                if (str != null && (m7779h0 = AbstractC2294t.m7779h0(str, new String[]{","}, false, 0, 6, null)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : m7779h0) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    c6136c.m25552q(new ArrayList(arrayList));
                }
            }
            if (c6136c.m25546k() != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", c6136c.m25546k());
            }
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(c6136c.m25547l());
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c6136c.m25550o());
            intent.putExtra("multi-pick", c6136c.m25550o());
            ArrayList m25546k = c6136c.m25546k();
            if (m25546k != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) m25546k.toArray(new String[0]));
            }
        }
        if (intent.resolveActivity(c6136c.m25545j().getPackageManager()) != null) {
            c6136c.m25545j().startActivityForResult(intent, C6136c.f21897l.m25561b());
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            c6136c.m25543h("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    /* renamed from: C */
    public final void m25580C(C6136c c6136c, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, C0659k.d result) {
        AbstractC5469l.m23028e(result, "result");
        if (c6136c != null && !c6136c.m25558w(result)) {
            C6136c.f21897l.m25560a(result);
            return;
        }
        if (c6136c != null) {
            c6136c.m25559x(str);
        }
        if (bool != null && c6136c != null) {
            c6136c.m25557v(bool.booleanValue());
        }
        if (bool2 != null && c6136c != null) {
            c6136c.m25556u(bool2.booleanValue());
        }
        if (c6136c != null) {
            c6136c.m25552q(arrayList);
        }
        if (num != null && c6136c != null) {
            c6136c.m25554s(num.intValue());
        }
        if (c6136c != null) {
            m25579B(c6136c);
        }
    }

    /* renamed from: D */
    public final Uri m25581D(Context context, Uri uri, byte[] bArr) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(uri, "uri");
        OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri);
        if (openOutputStream != null) {
            if (bArr != null) {
                try {
                    openOutputStream.write(bArr);
                    C6934q c6934q = C6934q.f24811a;
                } finally {
                }
            }
            AbstractC0467b.m1715a(openOutputStream, null);
        }
        return uri;
    }

    /* renamed from: e */
    public final void m25582e(Activity activity, Uri uri, boolean z6, List list) {
        C6134a m25577w = m25577w(activity, uri, z6);
        if (m25577w != null) {
            list.add(m25577w);
        }
    }

    /* renamed from: h */
    public final File m25583h(Context context, Uri uri) {
        File createTempFile = File.createTempFile("IMAGE_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + '_', '.' + m25586k(context, uri), context.getCacheDir());
        AbstractC5469l.m23027d(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    /* renamed from: i */
    public final Bitmap.CompressFormat m25584i(Context context, Uri uri) {
        String m25586k = m25586k(context, uri);
        AbstractC5469l.m23025b(m25586k);
        Locale locale = Locale.getDefault();
        AbstractC5469l.m23027d(locale, "getDefault(...)");
        String upperCase = m25586k.toUpperCase(locale);
        AbstractC5469l.m23027d(upperCase, "toUpperCase(...)");
        return AbstractC5469l.m23024a(upperCase, "PNG") ? Bitmap.CompressFormat.PNG : AbstractC5469l.m23024a(upperCase, "WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: j */
    public final String m25585j(Uri uri) {
        List m28861g;
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        AbstractC5469l.m23025b(treeDocumentId);
        List m7724c = new C2280f(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).m7724c(treeDocumentId, 0);
        if (!m7724c.isEmpty()) {
            ListIterator listIterator = m7724c.listIterator(m7724c.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    m28861g = AbstractC7032w.m28885K(m7724c, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        m28861g = AbstractC7024o.m28861g();
        String[] strArr = (String[]) m28861g.toArray(new String[0]);
        if (strArr.length >= 2) {
            return strArr[1];
        }
        String separator = File.separator;
        AbstractC5469l.m23027d(separator, "separator");
        return separator;
    }

    /* renamed from: k */
    public final String m25586k(Context context, Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
    }

    /* renamed from: l */
    public final String m25587l(byte[] bArr) {
        String detect = new Tika().detect(bArr);
        AbstractC5469l.m23025b(detect);
        return AbstractC2294t.m7784m0(detect, "/", null, 2, null);
    }

    /* renamed from: o */
    public final String m25588o(String str, byte[] bArr) {
        Tika tika = new Tika();
        if (str == null || str.length() == 0) {
            String detect = tika.detect(bArr);
            AbstractC5469l.m23027d(detect, "detect(...)");
            return detect;
        }
        Detector detector = tika.getDetector();
        TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
        Metadata metadata = new Metadata();
        metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, str);
        String mediaType = detector.detect(tikaInputStream, metadata).toString();
        AbstractC5469l.m23027d(mediaType, "toString(...)");
        return mediaType;
    }

    /* renamed from: p */
    public final ArrayList m25589p(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i7));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type " + ((String) arrayList.get(i7)) + " is unsupported and will be ignored.");
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
        }
        return arrayList2;
    }

    /* renamed from: q */
    public final String m25590q(Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        AbstractC5469l.m23025b(treeDocumentId);
        List m7779h0 = AbstractC2294t.m7779h0(treeDocumentId, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER}, false, 0, 6, null);
        if (m7779h0.size() <= 1) {
            return Environment.getExternalStorageDirectory() + '/' + ((String) AbstractC7032w.m28879E(m7779h0));
        }
        String str = (String) m7779h0.get(0);
        String str2 = (String) m7779h0.get(1);
        if (AbstractC2291q.m7740p("primary", str, true)) {
            return Environment.getExternalStorageDirectory() + '/' + str2;
        }
        return "/storage/" + str + '/' + str2;
    }

    /* renamed from: r */
    public final ArrayList m25591r(Bundle bundle) {
        ArrayList parcelableArrayList;
        if (Build.VERSION.SDK_INT < 33) {
            return bundle.getParcelableArrayList("selectedItems");
        }
        parcelableArrayList = bundle.getParcelableArrayList("selectedItems", Parcelable.class);
        return parcelableArrayList;
    }

    /* renamed from: s */
    public final void m25592s(C6136c c6136c, List list) {
        if (list.isEmpty()) {
            c6136c.m25543h("unknown_path", "Failed to retrieve path.");
        } else {
            c6136c.m25544i(list);
        }
    }

    /* renamed from: t */
    public final boolean m25593t(Uri uri) {
        return AbstractC5469l.m23024a(uri.getAuthority(), "com.android.providers.downloads.documents");
    }

    /* renamed from: v */
    public final void m25594v(File file, C6134a.a aVar) {
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e7) {
                Log.e("FilePickerUtils", "File not found: " + e7.getMessage(), null);
            } catch (IOException e8) {
                Log.e("FilePickerUtils", "Failed to close file streams: " + e8.getMessage(), null);
            }
            aVar.m25532b(bArr);
        } catch (Exception e9) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e9 + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    /* renamed from: x */
    public final void m25595x(C6136c c6136c, Activity activity, Intent intent, int i7, boolean z6, String type) {
        AbstractC5469l.m23028e(c6136c, "<this>");
        AbstractC5469l.m23028e(activity, "activity");
        AbstractC5469l.m23028e(type, "type");
        AbstractC2388k.m8128d(AbstractC2336K.m7996a(C2363Y.m8054b()), null, null, new a(intent, c6136c, activity, i7, z6, type, null), 3, null);
    }

    /* renamed from: y */
    public final Uri m25596y(Activity activity, Uri uri, int i7) {
        if (i7 <= 0) {
            return uri;
        }
        Context applicationContext = activity.getApplicationContext();
        AbstractC5469l.m23027d(applicationContext, "getApplicationContext(...)");
        if (!m25576u(applicationContext, uri)) {
            return uri;
        }
        Context applicationContext2 = activity.getApplicationContext();
        AbstractC5469l.m23027d(applicationContext2, "getApplicationContext(...)");
        return m25573g(uri, i7, applicationContext2);
    }

    /* renamed from: z */
    public final void m25597z(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.listFiles() != null && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file2 : listFiles) {
                m25597z(file2);
            }
        }
        file.delete();
    }
}
