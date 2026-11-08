package p112Q;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: Q.c */
/* loaded from: classes.dex */
public final class C1982c extends IOException {
    public /* synthetic */ C1982c(String str, Throwable th, int i7, AbstractC5464g abstractC5464g) {
        this(str, (i7 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1982c(String message, Throwable th) {
        super(message, th);
        AbstractC5469l.m23028e(message, "message");
    }
}
