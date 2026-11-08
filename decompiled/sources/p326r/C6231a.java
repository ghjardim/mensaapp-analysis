package p326r;

import android.os.Bundle;

/* renamed from: r.a */
/* loaded from: classes.dex */
public final class C6231a {

    /* renamed from: a */
    public final Integer f22258a;

    /* renamed from: b */
    public final Integer f22259b;

    /* renamed from: c */
    public final Integer f22260c;

    /* renamed from: d */
    public final Integer f22261d;

    /* renamed from: r.a$a */
    public static final class a {

        /* renamed from: a */
        public Integer f22262a;

        /* renamed from: b */
        public Integer f22263b;

        /* renamed from: c */
        public Integer f22264c;

        /* renamed from: d */
        public Integer f22265d;

        /* renamed from: a */
        public C6231a m25993a() {
            return new C6231a(this.f22262a, this.f22263b, this.f22264c, this.f22265d);
        }
    }

    public C6231a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f22258a = num;
        this.f22259b = num2;
        this.f22260c = num3;
        this.f22261d = num4;
    }

    /* renamed from: a */
    public Bundle m25992a() {
        Bundle bundle = new Bundle();
        Integer num = this.f22258a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f22259b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f22260c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f22261d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
