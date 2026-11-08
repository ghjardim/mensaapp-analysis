package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.protobuf.X */
/* loaded from: classes.dex */
public abstract class AbstractC4036X {

    /* renamed from: a */
    public static final char[] f13330a;

    static {
        char[] cArr = new char[80];
        f13330a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m16324a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = f13330a;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* renamed from: b */
    public static boolean m16325b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals(StringUtils.EMPTY) : obj instanceof AbstractC4055i ? obj.equals(AbstractC4055i.f13379b) : obj instanceof InterfaceC4034V ? obj == ((InterfaceC4034V) obj).mo16322a() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* renamed from: c */
    public static String m16326c(String str) {
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
    public static void m16327d(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m16327d(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m16327d(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m16324a(i7, sb);
        sb.append(m16326c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC4076s0.m16921c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4055i) {
            sb.append(": \"");
            sb.append(AbstractC4076s0.m16919a((AbstractC4055i) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4087y) {
            sb.append(" {");
            m16328e((AbstractC4087y) obj, sb, i7 + 2);
            sb.append("\n");
            m16324a(i7, sb);
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
        m16327d(sb, i8, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, entry.getKey());
        m16327d(sb, i8, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, entry.getValue());
        sb.append("\n");
        m16324a(i7, sb);
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
    public static void m16328e(com.google.protobuf.InterfaceC4034V r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4036X.m16328e(com.google.protobuf.V, java.lang.StringBuilder, int):void");
    }

    /* renamed from: f */
    public static String m16329f(InterfaceC4034V interfaceC4034V, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m16328e(interfaceC4034V, sb, 0);
        return sb.toString();
    }
}
