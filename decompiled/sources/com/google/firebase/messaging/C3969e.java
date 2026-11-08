package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C3969e;
import java.util.Map;
import java.util.concurrent.Executor;
import p334s.C6308a;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes.dex */
public class C3969e {

    /* renamed from: a */
    public final Executor f13036a;

    /* renamed from: b */
    public final Map f13037b = new C6308a();

    /* renamed from: com.google.firebase.messaging.e$a */
    public interface a {
        Task start();
    }

    public C3969e(Executor executor) {
        this.f13036a = executor;
    }

    /* renamed from: b */
    public synchronized Task m15855b(final String str, a aVar) {
        Task task = (Task) this.f13037b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f13036a, new Continuation() { // from class: a4.T
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m15856c;
                m15856c = C3969e.this.m15856c(str, task2);
                return m15856c;
            }
        });
        this.f13037b.put(str, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: c */
    public final /* synthetic */ Task m15856c(String str, Task task) {
        synchronized (this) {
            this.f13037b.remove(str);
        }
        return task;
    }
}
