package p028E;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p023D1.AbstractC0181a;
import p028E.AbstractC0206k;
import p256j$.util.Objects;
import p334s.C6317j;
import p379y.AbstractC7040e;

/* renamed from: E.e */
/* loaded from: classes.dex */
public abstract class AbstractC0200e {

    /* renamed from: a */
    public static final C6317j f797a = new C6317j(2);

    /* renamed from: b */
    public static final Comparator f798b = new Comparator() { // from class: E.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m807g;
            m807g = AbstractC0200e.m807g((byte[]) obj, (byte[]) obj2);
            return m807g;
        }
    };

    /* renamed from: E.e$a */
    public interface a {
        /* renamed from: a */
        Cursor mo809a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* renamed from: E.e$b */
    public static class b implements a {

        /* renamed from: a */
        public final ContentProviderClient f799a;

        public b(Context context, Uri uri) {
            this.f799a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p028E.AbstractC0200e.a
        /* renamed from: a */
        public Cursor mo809a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f799a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e7) {
                Log.w("FontsProvider", "Unable to query the content provider", e7);
                return null;
            }
        }

        @Override // p028E.AbstractC0200e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f799a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* renamed from: E.e$c */
    public static class c implements a {

        /* renamed from: a */
        public final ContentProviderClient f800a;

        public c(Context context, Uri uri) {
            this.f800a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p028E.AbstractC0200e.a
        /* renamed from: a */
        public Cursor mo809a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f800a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e7) {
                Log.w("FontsProvider", "Unable to query the content provider", e7);
                return null;
            }
        }

        @Override // p028E.AbstractC0200e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f800a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* renamed from: E.e$d */
    public static class d {

        /* renamed from: a */
        public String f801a;

        /* renamed from: b */
        public String f802b;

        /* renamed from: c */
        public List f803c;

        public d(String str, String str2, List list) {
            this.f801a = str;
            this.f802b = str2;
            this.f803c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f801a, dVar.f801a) && Objects.equals(this.f802b, dVar.f802b) && Objects.equals(this.f803c, dVar.f803c);
        }

        public int hashCode() {
            return Objects.hash(this.f801a, this.f802b, this.f803c);
        }
    }

    /* renamed from: b */
    public static List m802b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m803c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List m804d(C0201f c0201f, Resources resources) {
        return c0201f.m811b() != null ? c0201f.m811b() : AbstractC7040e.m28962c(resources, c0201f.m812c());
    }

    /* renamed from: e */
    public static AbstractC0206k.a m805e(Context context, List list, CancellationSignal cancellationSignal) {
        AbstractC0181a.m729c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0201f c0201f = (C0201f) list.get(i7);
                ProviderInfo m806f = m806f(context.getPackageManager(), c0201f, context.getResources());
                if (m806f == null) {
                    return AbstractC0206k.a.m832b(1, null);
                }
                arrayList.add(m808h(context, c0201f, m806f.authority, cancellationSignal));
            }
            return AbstractC0206k.a.m831a(0, arrayList);
        } finally {
            AbstractC0181a.m732f();
        }
    }

    /* renamed from: f */
    public static ProviderInfo m806f(PackageManager packageManager, C0201f c0201f, Resources resources) {
        AbstractC0181a.m729c("FontProvider.getProvider");
        try {
            List m804d = m804d(c0201f, resources);
            d dVar = new d(c0201f.m814e(), c0201f.m815f(), m804d);
            ProviderInfo providerInfo = (ProviderInfo) f797a.get(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String m814e = c0201f.m814e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m814e, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + m814e);
            }
            if (!resolveContentProvider.packageName.equals(c0201f.m815f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + m814e + ", but package was not " + c0201f.m815f());
            }
            List m802b = m802b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(m802b, f798b);
            for (int i7 = 0; i7 < m804d.size(); i7++) {
                ArrayList arrayList = new ArrayList((Collection) m804d.get(i7));
                Collections.sort(arrayList, f798b);
                if (m803c(m802b, arrayList)) {
                    f797a.put(dVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            AbstractC0181a.m732f();
            return null;
        } finally {
            AbstractC0181a.m732f();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m807g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = bArr2[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static AbstractC0206k.b[] m808h(Context context, C0201f c0201f, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList;
        Uri withAppendedId;
        boolean z6;
        AbstractC0181a.m729c("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a m800a = AbstractC0199d.m800a(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0181a.m729c("ContentQueryWrapper.query");
                try {
                    cursor = m800a.mo809a(build, strArr, "query = ?", new String[]{c0201f.m816g()}, null, cancellationSignal);
                    AbstractC0181a.m732f();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i7 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            int i8 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                arrayList = arrayList3;
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                arrayList = arrayList3;
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            int i9 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                            if (columnIndex6 != -1) {
                                z6 = true;
                                if (cursor.getInt(columnIndex6) == 1) {
                                    AbstractC0206k.b m837a = AbstractC0206k.b.m837a(withAppendedId, i8, i9, z6, i7);
                                    arrayList3 = arrayList;
                                    arrayList3.add(m837a);
                                }
                            }
                            z6 = false;
                            AbstractC0206k.b m837a2 = AbstractC0206k.b.m837a(withAppendedId, i8, i9, z6, i7);
                            arrayList3 = arrayList;
                            arrayList3.add(m837a2);
                        }
                        arrayList2 = arrayList3;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    m800a.close();
                    return (AbstractC0206k.b[]) arrayList2.toArray(new AbstractC0206k.b[0]);
                } finally {
                    AbstractC0181a.m732f();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                m800a.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
