package p237g5;

import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p171Y2.AbstractC2926i;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4430c0;

/* renamed from: g5.T */
/* loaded from: classes2.dex */
public abstract class AbstractC4418T extends AbstractC4417S.c {

    /* renamed from: a */
    public static final AbstractC4430c0.b f15664a = AbstractC4430c0.b.m18891a(new a());

    /* renamed from: g5.T$a */
    public static final class a {
        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: b */
    public abstract String mo18736b();

    /* renamed from: c */
    public abstract int mo18737c();

    /* renamed from: d */
    public abstract boolean mo18738d();

    /* renamed from: e */
    public abstract AbstractC4430c0.b mo18739e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return AbstractC2926i.m10535c(this).m10540d("policy", mo18736b()).m10538b(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, mo18737c()).m10541e("available", mo18738d()).toString();
    }
}
