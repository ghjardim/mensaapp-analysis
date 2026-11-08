package com.google.android.gms.tasks;

/* loaded from: classes.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j7) {
        this.zza = j7;
    }

    public static void createAndAddCallback(Task<Object> task, long j7) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j7));
    }

    public native void nativeOnComplete(long j7, Object obj, boolean z6, boolean z7, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object obj;
        String str;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
