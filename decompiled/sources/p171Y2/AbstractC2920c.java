package p171Y2;

/* renamed from: Y2.c */
/* loaded from: classes.dex */
public abstract class AbstractC2920c {
    /* renamed from: a */
    public static boolean m10511a(CharSequence charSequence, CharSequence charSequence2) {
        int m10512b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            char charAt2 = charSequence2.charAt(i7);
            if (charAt != charAt2 && ((m10512b = m10512b(charAt)) >= 26 || m10512b != m10512b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m10512b(char c7) {
        return (char) ((c7 | ' ') - 97);
    }

    /* renamed from: c */
    public static boolean m10513c(char c7) {
        return c7 >= 'a' && c7 <= 'z';
    }

    /* renamed from: d */
    public static boolean m10514d(char c7) {
        return c7 >= 'A' && c7 <= 'Z';
    }

    /* renamed from: e */
    public static String m10515e(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (m10514d(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (m10514d(c7)) {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m10516f(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (m10513c(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (m10513c(c7)) {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }
}
