package p105P;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: P.a */
/* loaded from: classes.dex */
public abstract class AbstractC1422a {
    /* renamed from: a */
    public static final File m5535a(Context context, String fileName) {
        AbstractC5469l.m23028e(context, "<this>");
        AbstractC5469l.m23028e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
