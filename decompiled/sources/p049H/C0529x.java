package p049H;

import android.os.Build;
import android.view.View;

/* renamed from: H.x */
/* loaded from: classes.dex */
public final class C0529x {

    /* renamed from: a */
    public final c f1719a;

    /* renamed from: H.x$a */
    public static class a extends c {

        /* renamed from: a */
        public final View f1720a;

        public a(View view) {
            this.f1720a = view;
        }
    }

    /* renamed from: H.x$b */
    public static class b extends a {

        /* renamed from: b */
        public View f1721b;

        public b(View view) {
            super(view);
            this.f1721b = view;
        }
    }

    /* renamed from: H.x$c */
    public static class c {
    }

    public C0529x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1719a = new b(view);
        } else {
            this.f1719a = new a(view);
        }
    }
}
