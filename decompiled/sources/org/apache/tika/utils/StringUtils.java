package org.apache.tika.utils;

import java.util.List;

/* loaded from: classes2.dex */
public class StringUtils {
    public static final String EMPTY = "";
    static int PAD_LIMIT = 10000;
    public static final String SPACE = " ";

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String joinWith(String str, List<String> list) {
        if (list.size() == 0) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (String str2 : list) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                sb.append(str);
            }
            sb.append(str2);
            i7 = i8;
        }
        return sb.toString();
    }

    public static String leftPad(String str, int i7, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i7 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= PAD_LIMIT) {
            return leftPad(str, i7, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i8 = 0; i8 < length2; i8++) {
            cArr[i8] = charArray[i8 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String repeat(char c7, int i7) {
        if (i7 <= 0) {
            return EMPTY;
        }
        char[] cArr = new char[i7];
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            cArr[i8] = c7;
        }
        return new String(cArr);
    }

    public static String repeat(String str, int i7) {
        if (str == null) {
            return null;
        }
        if (i7 <= 0) {
            return EMPTY;
        }
        int length = str.length();
        if (i7 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i7 <= PAD_LIMIT) {
            return repeat(str.charAt(0), i7);
        }
        int i8 = length * i7;
        if (length == 1) {
            return repeat(str.charAt(0), i7);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i8);
            for (int i9 = 0; i9 < i7; i9++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char[] cArr = new char[i8];
        for (int i10 = (i7 * 2) - 2; i10 >= 0; i10 -= 2) {
            cArr[i10] = charAt;
            cArr[i10 + 1] = charAt2;
        }
        return new String(cArr);
    }

    public static String leftPad(String str, int i7, char c7) {
        if (str == null) {
            return null;
        }
        int length = i7 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > PAD_LIMIT) {
            return leftPad(str, i7, String.valueOf(c7));
        }
        return repeat(c7, length).concat(str);
    }
}
