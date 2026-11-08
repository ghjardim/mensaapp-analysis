package p031E2;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: E2.k */
/* loaded from: classes.dex */
public abstract class AbstractC0275k {

    /* renamed from: a */
    public static final Pattern f1098a = Pattern.compile("\\\\.");

    /* renamed from: b */
    public static final Pattern f1099b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* renamed from: a */
    public static String m1128a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f1099b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
