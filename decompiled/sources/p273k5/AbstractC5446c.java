package p273k5;

import java.io.UnsupportedEncodingException;
import org.apache.tika.metadata.TikaCoreProperties;
import p206c6.C3619g;

/* renamed from: k5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5446c {
    /* renamed from: a */
    public static String m22950a(String str, String str2) {
        try {
            return "Basic " + C3619g.m14641w((str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2).getBytes("ISO-8859-1")).mo14540b();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
