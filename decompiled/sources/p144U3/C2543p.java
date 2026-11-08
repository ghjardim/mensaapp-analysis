package p144U3;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import p151V3.AbstractC2626d;
import p165X3.C2817b;
import p165X3.InterfaceC2816a;

/* renamed from: U3.p */
/* loaded from: classes.dex */
public final class C2543p {

    /* renamed from: b */
    public static final long f7414b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f7415c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C2543p f7416d;

    /* renamed from: a */
    public final InterfaceC2816a f7417a;

    public C2543p(InterfaceC2816a interfaceC2816a) {
        this.f7417a = interfaceC2816a;
    }

    /* renamed from: c */
    public static C2543p m8524c() {
        return m8525d(C2817b.m10073b());
    }

    /* renamed from: d */
    public static C2543p m8525d(InterfaceC2816a interfaceC2816a) {
        if (f7416d == null) {
            f7416d = new C2543p(interfaceC2816a);
        }
        return f7416d;
    }

    /* renamed from: g */
    public static boolean m8526g(String str) {
        return f7415c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m8527h(String str) {
        return str.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
    }

    /* renamed from: a */
    public long m8528a() {
        return this.f7417a.mo10072a();
    }

    /* renamed from: b */
    public long m8529b() {
        return TimeUnit.MILLISECONDS.toSeconds(m8528a());
    }

    /* renamed from: e */
    public long m8530e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m8531f(AbstractC2626d abstractC2626d) {
        return TextUtils.isEmpty(abstractC2626d.mo9006b()) || abstractC2626d.mo9012h() + abstractC2626d.mo9007c() < m8529b() + f7414b;
    }
}
