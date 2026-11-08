package p225f1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p259j0.C5357z;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public abstract class AbstractC4226a {

    /* renamed from: a */
    public final int f14443a;

    /* renamed from: f1.a$a */
    public static final class a extends AbstractC4226a {

        /* renamed from: b */
        public final long f14444b;

        /* renamed from: c */
        public final List f14445c;

        /* renamed from: d */
        public final List f14446d;

        public a(int i7, long j7) {
            super(i7);
            this.f14444b = j7;
            this.f14445c = new ArrayList();
            this.f14446d = new ArrayList();
        }

        /* renamed from: d */
        public void m17667d(a aVar) {
            this.f14446d.add(aVar);
        }

        /* renamed from: e */
        public void m17668e(b bVar) {
            this.f14445c.add(bVar);
        }

        /* renamed from: f */
        public a m17669f(int i7) {
            int size = this.f14446d.size();
            for (int i8 = 0; i8 < size; i8++) {
                a aVar = (a) this.f14446d.get(i8);
                if (aVar.f14443a == i7) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public b m17670g(int i7) {
            int size = this.f14445c.size();
            for (int i8 = 0; i8 < size; i8++) {
                b bVar = (b) this.f14445c.get(i8);
                if (bVar.f14443a == i7) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p225f1.AbstractC4226a
        public String toString() {
            return AbstractC4226a.m17664a(this.f14443a) + " leaves: " + Arrays.toString(this.f14445c.toArray()) + " containers: " + Arrays.toString(this.f14446d.toArray());
        }
    }

    /* renamed from: f1.a$b */
    public static final class b extends AbstractC4226a {

        /* renamed from: b */
        public final C5357z f14447b;

        public b(int i7, C5357z c5357z) {
            super(i7);
            this.f14447b = c5357z;
        }
    }

    public AbstractC4226a(int i7) {
        this.f14443a = i7;
    }

    /* renamed from: a */
    public static String m17664a(int i7) {
        return StringUtils.EMPTY + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    /* renamed from: b */
    public static int m17665b(int i7) {
        return i7 & 16777215;
    }

    /* renamed from: c */
    public static int m17666c(int i7) {
        return (i7 >> 24) & 255;
    }

    public String toString() {
        return m17664a(this.f14443a);
    }
}
