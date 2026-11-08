package p259j0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2920c;

/* renamed from: j0.G */
/* loaded from: classes.dex */
public abstract class AbstractC5324G {
    /* renamed from: a */
    public static String m21661a(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !AbstractC2920c.m10511a(scheme, scheme2)) : scheme2 == null) {
            if (AbstractC5330M.m21729c(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int min = Math.min(pathSegments.size(), pathSegments2.size());
                int i7 = 0;
                for (int i8 = 0; i8 < min && pathSegments.get(i8).equals(pathSegments2.get(i8)); i8++) {
                    i7++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i9 = i7; i9 < pathSegments.size(); i9++) {
                    sb.append("../");
                }
                while (i7 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i7));
                    if (i7 < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i7++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    /* renamed from: b */
    public static int[] m21662b(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: c */
    public static boolean m21663c(String str) {
        return (str == null || m21662b(str)[0] == -1) ? false : true;
    }

    /* renamed from: d */
    public static String m21664d(StringBuilder sb, int i7, int i8) {
        int i9;
        int i10;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i11 = i7;
        int i12 = i11;
        while (i11 <= i8) {
            if (i11 == i8) {
                i9 = i11;
            } else if (sb.charAt(i11) == '/') {
                i9 = i11 + 1;
            } else {
                i11++;
            }
            int i13 = i12 + 1;
            if (i11 == i13 && sb.charAt(i12) == '.') {
                sb.delete(i12, i9);
                i8 -= i9 - i12;
            } else {
                if (i11 == i12 + 2 && sb.charAt(i12) == '.' && sb.charAt(i13) == '.') {
                    i10 = sb.lastIndexOf("/", i12 - 2) + 1;
                    int i14 = i10 > i7 ? i10 : i7;
                    sb.delete(i14, i9);
                    i8 -= i9 - i14;
                } else {
                    i10 = i11 + 1;
                }
                i12 = i10;
            }
            i11 = i12;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m21665e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = StringUtils.EMPTY;
        }
        if (str2 == null) {
            str2 = StringUtils.EMPTY;
        }
        int[] m21662b = m21662b(str2);
        if (m21662b[0] != -1) {
            sb.append(str2);
            m21664d(sb, m21662b[1], m21662b[2]);
            return sb.toString();
        }
        int[] m21662b2 = m21662b(str);
        if (m21662b[3] == 0) {
            sb.append((CharSequence) str, 0, m21662b2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (m21662b[2] == 0) {
            sb.append((CharSequence) str, 0, m21662b2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i7 = m21662b[1];
        if (i7 != 0) {
            int i8 = m21662b2[0] + 1;
            sb.append((CharSequence) str, 0, i8);
            sb.append(str2);
            return m21664d(sb, m21662b[1] + i8, i8 + m21662b[2]);
        }
        if (str2.charAt(i7) == '/') {
            sb.append((CharSequence) str, 0, m21662b2[1]);
            sb.append(str2);
            int i9 = m21662b2[1];
            return m21664d(sb, i9, m21662b[2] + i9);
        }
        int i10 = m21662b2[0] + 2;
        int i11 = m21662b2[1];
        if (i10 >= i11 || i11 != m21662b2[2]) {
            int lastIndexOf = str.lastIndexOf(47, m21662b2[2] - 1);
            int i12 = lastIndexOf == -1 ? m21662b2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i12);
            sb.append(str2);
            return m21664d(sb, m21662b2[1], i12 + m21662b[2]);
        }
        sb.append((CharSequence) str, 0, i11);
        sb.append('/');
        sb.append(str2);
        int i13 = m21662b2[1];
        return m21664d(sb, i13, m21662b[2] + i13 + 1);
    }

    /* renamed from: f */
    public static Uri m21666f(String str, String str2) {
        return Uri.parse(m21665e(str, str2));
    }
}
