package p227f3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public final class C4273a extends ThreadPoolExecutor {
    public C4273a(FirebaseAnalytics firebaseAnalytics, int i7, int i8, long j7, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
