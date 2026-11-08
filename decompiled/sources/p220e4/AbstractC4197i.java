package p220e4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Tasks;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.utils.StringUtils;
import p219e3.C4176f;
import p228f4.AbstractC4281e;
import p262j3.AbstractC5368d;
import p303o3.InterfaceC5939b;
import p346t3.C6462C;
import p354u3.InterfaceC6640b;

/* renamed from: e4.i */
/* loaded from: classes.dex */
public abstract class AbstractC4197i {
    /* renamed from: a */
    public static boolean m17604a(Object obj, Object obj2) {
        return AbstractC3798p.m15099b(obj, obj2);
    }

    /* renamed from: b */
    public static String m17605b(InterfaceC5939b interfaceC5939b) {
        if (interfaceC5939b == null) {
            return null;
        }
        try {
            AbstractC5368d abstractC5368d = (AbstractC5368d) Tasks.await(interfaceC5939b.mo23363b(false), 30000L, TimeUnit.MILLISECONDS);
            if (abstractC5368d.mo22073a() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + abstractC5368d.mo22073a());
            }
            return abstractC5368d.mo22074b();
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e9) {
            e = e9;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m17606c(InterfaceC6640b interfaceC6640b) {
        String str;
        if (interfaceC6640b != null) {
            try {
                str = ((C6462C) Tasks.await(interfaceC6640b.mo15348d(false), 30000L, TimeUnit.MILLISECONDS)).m26994g();
            } catch (InterruptedException e7) {
                e = e7;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (ExecutionException e8) {
                e = e8;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (TimeoutException e9) {
                e = e9;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    /* renamed from: d */
    public static Uri m17607d(C4176f c4176f, String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = AbstractC4281e.f14716k;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + AbstractC4192d.m17597b(AbstractC4192d.m17596a(str.substring(5))));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(m17604a(scheme.toLowerCase(), "http") || m17604a(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String m17598c = AbstractC4192d.m17598c(parse.getEncodedPath());
        if (indexOf == 0 && m17598c.startsWith("/")) {
            int indexOf2 = m17598c.indexOf("/b/", 0);
            int i7 = indexOf2 + 3;
            int indexOf3 = m17598c.indexOf("/", i7);
            int indexOf4 = m17598c.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = m17598c.substring(i7, indexOf3);
            m17598c = indexOf4 != -1 ? m17598c.substring(indexOf4 + 3) : StringUtils.EMPTY;
        } else {
            if (indexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        AbstractC3802r.m15124f(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(m17598c).build();
    }

    /* renamed from: e */
    public static long m17608e(String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e7) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e7);
            return 0L;
        }
    }
}
