package p125R5;

/* renamed from: R5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2276b extends AbstractC2275a {
    /* renamed from: d */
    public static final boolean m7714d(char c7, char c8, boolean z6) {
        if (c7 == c8) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
