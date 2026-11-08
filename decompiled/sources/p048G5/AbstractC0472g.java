package p048G5;

import java.io.File;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p125R5.AbstractC2294t;

/* renamed from: G5.g */
/* loaded from: classes2.dex */
public abstract class AbstractC0472g extends AbstractC0471f {
    /* renamed from: c */
    public static String m1719c(File file) {
        AbstractC5469l.m23028e(file, "<this>");
        String name = file.getName();
        AbstractC5469l.m23027d(name, "getName(...)");
        return AbstractC2294t.m7785n0(name, '.', StringUtils.EMPTY);
    }
}
