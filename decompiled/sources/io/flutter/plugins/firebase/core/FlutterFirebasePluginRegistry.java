package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p219e3.C4176f;

@Keep
/* loaded from: classes2.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final C4176f c4176f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: P4.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(C4176f.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                Tasks.await(it.next().getValue().didReinitializeFirebaseCore());
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(C4176f c4176f, TaskCompletionSource taskCompletionSource) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), Tasks.await(entry.getValue().getPluginConstantsForFirebaseApp(c4176f)));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
