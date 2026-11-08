package p194b2;

import java.util.ArrayList;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p256j$.util.DesugarCollections;

/* renamed from: b2.d */
/* loaded from: classes.dex */
public final class C3518d {

    /* renamed from: c */
    public static final C3518d f11838c = new a().m14137a();

    /* renamed from: a */
    public final String f11839a;

    /* renamed from: b */
    public final List f11840b;

    /* renamed from: b2.d$a */
    public static final class a {

        /* renamed from: a */
        public String f11841a = StringUtils.EMPTY;

        /* renamed from: b */
        public List f11842b = new ArrayList();

        /* renamed from: a */
        public C3518d m14137a() {
            return new C3518d(this.f11841a, DesugarCollections.unmodifiableList(this.f11842b));
        }

        /* renamed from: b */
        public a m14138b(List list) {
            this.f11842b = list;
            return this;
        }

        /* renamed from: c */
        public a m14139c(String str) {
            this.f11841a = str;
            return this;
        }
    }

    public C3518d(String str, List list) {
        this.f11839a = str;
        this.f11840b = list;
    }

    /* renamed from: c */
    public static a m14134c() {
        return new a();
    }

    /* renamed from: a */
    public List m14135a() {
        return this.f11840b;
    }

    /* renamed from: b */
    public String m14136b() {
        return this.f11839a;
    }
}
