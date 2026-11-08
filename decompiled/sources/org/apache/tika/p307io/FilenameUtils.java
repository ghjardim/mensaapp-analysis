package org.apache.tika.p307io;

import java.util.HashSet;
import java.util.Locale;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public class FilenameUtils {
    private static final HashSet<Character> RESERVED = new HashSet<>(38);
    public static final char[] RESERVED_FILENAME_CHARACTERS;

    static {
        char[] cArr = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, '?', ':', '*', '<', '>', '|'};
        RESERVED_FILENAME_CHARACTERS = cArr;
        for (char c7 : cArr) {
            RESERVED.add(Character.valueOf(c7));
        }
    }

    public static String getName(String str) {
        if (str != null && str.length() != 0) {
            String substring = str.substring(Math.max(str.lastIndexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER), Math.max(str.lastIndexOf("/"), str.lastIndexOf("\\"))) + 1);
            if (!substring.equals("..") && !substring.equals(".")) {
                return substring;
            }
        }
        return StringUtils.EMPTY;
    }

    public static String getSuffixFromPath(String str) {
        String name = getName(str);
        int lastIndexOf = name.lastIndexOf(".");
        return (lastIndexOf <= -1 || name.length() - lastIndexOf >= 6) ? StringUtils.EMPTY : name.substring(lastIndexOf);
    }

    public static String normalize(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i7 = 0; i7 < length; i7++) {
            char c7 = charArray[i7];
            if (RESERVED.contains(Character.valueOf(c7))) {
                sb.append('%');
                sb.append(c7 < 16 ? "0" : StringUtils.EMPTY);
                sb.append(Integer.toHexString(c7).toUpperCase(Locale.ROOT));
            } else {
                sb.append(c7);
            }
        }
        return sb.toString();
    }
}
