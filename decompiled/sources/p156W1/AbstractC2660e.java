package p156W1;

/* renamed from: W1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2660e {
    /* renamed from: a */
    public static String m9133a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb.append(str2.charAt(i7));
            }
        }
        return sb.toString();
    }
}
