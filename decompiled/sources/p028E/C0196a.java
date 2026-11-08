package p028E;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import p028E.AbstractC0205j;
import p028E.AbstractC0206k;

/* renamed from: E.a */
/* loaded from: classes.dex */
public class C0196a {

    /* renamed from: a */
    public final AbstractC0206k.c f789a;

    /* renamed from: b */
    public final Executor f790b;

    /* renamed from: E.a$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0206k.c f791a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f792b;

        public a(AbstractC0206k.c cVar, Typeface typeface) {
            this.f791a = cVar;
            this.f792b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f791a.mo844b(this.f792b);
        }
    }

    /* renamed from: E.a$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0206k.c f794a;

        /* renamed from: b */
        public final /* synthetic */ int f795b;

        public b(AbstractC0206k.c cVar, int i7) {
            this.f794a = cVar;
            this.f795b = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f794a.mo843a(this.f795b);
        }
    }

    public C0196a(AbstractC0206k.c cVar, Executor executor) {
        this.f789a = cVar;
        this.f790b = executor;
    }

    /* renamed from: a */
    public final void m796a(int i7) {
        this.f790b.execute(new b(this.f789a, i7));
    }

    /* renamed from: b */
    public void m797b(AbstractC0205j.e eVar) {
        if (eVar.m829a()) {
            m798c(eVar.f824a);
        } else {
            m796a(eVar.f825b);
        }
    }

    /* renamed from: c */
    public final void m798c(Typeface typeface) {
        this.f790b.execute(new a(this.f789a, typeface));
    }
}
