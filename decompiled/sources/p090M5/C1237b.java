package p090M5;

import java.util.Random;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: M5.b */
/* loaded from: classes2.dex */
public final class C1237b extends AbstractC1236a {

    /* renamed from: c */
    public final a f3901c = new a();

    /* renamed from: M5.b$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p090M5.AbstractC1236a
    /* renamed from: c */
    public Random mo4743c() {
        Object obj = this.f3901c.get();
        AbstractC5469l.m23027d(obj, "get(...)");
        return (Random) obj;
    }
}
