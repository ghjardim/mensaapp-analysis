package p305o5;

import java.util.concurrent.Executor;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4427b;
import p237g5.AbstractC4431d;
import p237g5.C4429c;

/* renamed from: o5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC5942b {

    /* renamed from: a */
    public final AbstractC4431d f21428a;

    /* renamed from: b */
    public final C4429c f21429b;

    /* renamed from: o5.b$a */
    public interface a {
        /* renamed from: a */
        AbstractC5942b mo22699a(AbstractC4431d abstractC4431d, C4429c c4429c);
    }

    public AbstractC5942b(AbstractC4431d abstractC4431d, C4429c c4429c) {
        this.f21428a = (AbstractC4431d) AbstractC2932o.m10573p(abstractC4431d, "channel");
        this.f21429b = (C4429c) AbstractC2932o.m10573p(c4429c, "callOptions");
    }

    /* renamed from: a */
    public abstract AbstractC5942b mo22701a(AbstractC4431d abstractC4431d, C4429c c4429c);

    /* renamed from: b */
    public final C4429c m24970b() {
        return this.f21429b;
    }

    /* renamed from: c */
    public final AbstractC5942b m24971c(AbstractC4427b abstractC4427b) {
        return mo22701a(this.f21428a, this.f21429b.m18858l(abstractC4427b));
    }

    /* renamed from: d */
    public final AbstractC5942b m24972d(Executor executor) {
        return mo22701a(this.f21428a, this.f21429b.m18860n(executor));
    }
}
