package p182a;

/* renamed from: a.b */
/* loaded from: classes.dex */
public abstract class AbstractC3095b {

    /* renamed from: a */
    public static final String f9571a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m11311b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f9571a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
