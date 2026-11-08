package p187a4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: a4.H */
/* loaded from: classes.dex */
public class C3115H implements Closeable {

    /* renamed from: a */
    public final URL f9624a;

    /* renamed from: b */
    public volatile Future f9625b;

    /* renamed from: c */
    public Task f9626c;

    public C3115H(URL url) {
        this.f9624a = url;
    }

    /* renamed from: g */
    public static C3115H m11370g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C3115H(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* renamed from: c */
    public Bitmap m11371c() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f9624a);
        }
        byte[] m11372d = m11372d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m11372d, 0, m11372d.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f9624a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f9624a);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9625b.cancel(true);
    }

    /* renamed from: d */
    public final byte[] m11372d() {
        URLConnection openConnection = this.f9624a.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] m11447d = AbstractC3135b.m11447d(AbstractC3135b.m11445b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + m11447d.length + " bytes from " + this.f9624a);
            }
            if (m11447d.length <= 1048576) {
                return m11447d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: h */
    public Task m11373h() {
        return (Task) AbstractC3802r.m15129k(this.f9626c);
    }

    /* renamed from: j */
    public final /* synthetic */ void m11374j(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m11371c());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* renamed from: m */
    public void m11375m(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9625b = executorService.submit(new Runnable() { // from class: a4.G
            @Override // java.lang.Runnable
            public final void run() {
                C3115H.this.m11374j(taskCompletionSource);
            }
        });
        this.f9626c = taskCompletionSource.getTask();
    }
}
