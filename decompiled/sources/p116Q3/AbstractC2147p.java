package p116Q3;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;
import p381y1.ExecutorC7060k;

/* renamed from: Q3.p */
/* loaded from: classes.dex */
public abstract class AbstractC2147p {

    /* renamed from: a */
    public static final Executor f6507a = TaskExecutors.MAIN_THREAD;

    /* renamed from: b */
    public static final Executor f6508b = new ExecutorC7060k();

    /* renamed from: c */
    public static final Executor f6509c = new ExecutorC2125C(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
