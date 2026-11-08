package p104O5;

import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: O5.c */
/* loaded from: classes2.dex */
public final class C1416c extends AbstractC1414a {

    /* renamed from: e */
    public static final a f4463e = new a(null);

    /* renamed from: f */
    public static final C1416c f4464f = new C1416c(1, 0);

    /* renamed from: O5.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C1416c(char c7, char c8) {
        super(c7, c8, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1416c) {
            if (!isEmpty() || !((C1416c) obj).isEmpty()) {
                C1416c c1416c = (C1416c) obj;
                if (m5514a() != c1416c.m5514a() || m5515b() != c1416c.m5515b()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m5514a() * 31) + m5515b();
    }

    public boolean isEmpty() {
        return AbstractC5469l.m23029f(m5514a(), m5515b()) > 0;
    }

    public String toString() {
        return m5514a() + ".." + m5515b();
    }
}
