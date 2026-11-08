package p108P2;

import android.os.Bundle;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* renamed from: P2.i4 */
/* loaded from: classes.dex */
public abstract class AbstractC1735i4 {
    /* renamed from: a */
    public static Object m6087a(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    /* renamed from: b */
    public static void m6088b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, ((Long) obj).longValue());
        } else {
            bundle.putString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, obj.toString());
        }
    }
}
