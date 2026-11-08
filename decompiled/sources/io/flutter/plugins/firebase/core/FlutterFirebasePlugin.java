package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p219e3.C4176f;

@Keep
/* loaded from: classes2.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    Task<Void> didReinitializeFirebaseCore();

    Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C4176f c4176f);
}
