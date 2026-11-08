package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.AbstractC3413c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p016C1.InterfaceC0073b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0073b {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C3408a {
        /* renamed from: c */
        public static void m13482c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: z1.j
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j7) {
                    runnable.run();
                }
            });
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C3409b {
        /* renamed from: a */
        public static Handler m13483a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C3410c {
    }

    /* renamed from: l */
    public static void m13475l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: z1.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3413c.m13510i(context);
            }
        });
    }

    @Override // p016C1.InterfaceC0073b
    /* renamed from: a */
    public List mo207a() {
        return Collections.emptyList();
    }

    @Override // p016C1.InterfaceC0073b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3410c mo208b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C3410c();
        }
        m13477g(context.getApplicationContext());
        return new C3410c();
    }

    /* renamed from: g */
    public void m13477g(final Context context) {
        C3408a.m13482c(new Runnable() { // from class: z1.g
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.m13479i(context);
            }
        });
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m13479i(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C3409b.m13483a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: z1.h
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m13475l(context);
            }
        }, new Random().nextInt(Math.max(PipesIterator.DEFAULT_QUEUE_SIZE, 1)) + 5000);
    }
}
