package p211d3;

import java.util.concurrent.Executor;

/* renamed from: d3.a */
/* loaded from: classes.dex */
public enum EnumC4111a implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
