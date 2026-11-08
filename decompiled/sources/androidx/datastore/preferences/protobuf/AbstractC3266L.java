package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* renamed from: androidx.datastore.preferences.protobuf.L */
/* loaded from: classes.dex */
public abstract class AbstractC3266L {

    /* renamed from: a */
    public static final char[] f10380a;

    static {
        char[] cArr = new char[80];
        f10380a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m12099a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = f10380a;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* renamed from: b */
    public static boolean m12100b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals(StringUtils.EMPTY) : obj instanceof AbstractC3290f ? obj.equals(AbstractC3290f.f10449b) : obj instanceof InterfaceC3264J ? obj == ((InterfaceC3264J) obj).mo12098a() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* renamed from: c */
    public static String m12101c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i7 = 1; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m12102d(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m12102d(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m12102d(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m12099a(i7, sb);
        sb.append(m12101c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC3287d0.m12330c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC3290f) {
            sb.append(": \"");
            sb.append(AbstractC3287d0.m12328a((AbstractC3290f) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC3311t) {
            sb.append(" {");
            m12103e((AbstractC3311t) obj, sb, i7 + 2);
            sb.append("\n");
            m12099a(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i8 = i7 + 2;
        m12102d(sb, i8, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry.getKey());
        m12102d(sb, i8, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry.getValue());
        sb.append("\n");
        m12099a(i7, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016f, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L54;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m12103e(androidx.datastore.preferences.protobuf.InterfaceC3264J r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC3266L.m12103e(androidx.datastore.preferences.protobuf.J, java.lang.StringBuilder, int):void");
    }

    /* renamed from: f */
    public static String m12104f(InterfaceC3264J interfaceC3264J, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m12103e(interfaceC3264J, sb, 0);
        return sb.toString();
    }
}
