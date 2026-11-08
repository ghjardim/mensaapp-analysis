package p108P2;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: P2.D */
/* loaded from: classes.dex */
public final class C1465D extends AbstractC1717g4 {

    /* renamed from: c */
    public long f4576c;

    /* renamed from: d */
    public String f4577d;

    public C1465D(C1460C3 c1460c3) {
        super(c1460c3);
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: j */
    public final boolean mo5654j() {
        Calendar calendar = Calendar.getInstance();
        this.f4576c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f4577d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* renamed from: o */
    public final long m5655o() {
        m6078k();
        return this.f4576c;
    }

    /* renamed from: p */
    public final String m5656p() {
        m6078k();
        return this.f4577d;
    }
}
