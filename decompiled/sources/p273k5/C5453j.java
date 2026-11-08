package p273k5;

import java.net.ProtocolException;
import org.apache.tika.utils.StringUtils;

/* renamed from: k5.j */
/* loaded from: classes2.dex */
public final class C5453j {

    /* renamed from: a */
    public final EnumC5452i f19681a;

    /* renamed from: b */
    public final int f19682b;

    /* renamed from: c */
    public final String f19683c;

    public C5453j(EnumC5452i enumC5452i, int i7, String str) {
        this.f19681a = enumC5452i;
        this.f19682b = i7;
        this.f19683c = str;
    }

    /* renamed from: a */
    public static C5453j m22998a(String str) {
        EnumC5452i enumC5452i;
        int i7;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                enumC5452i = EnumC5452i.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC5452i = EnumC5452i.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC5452i = EnumC5452i.HTTP_1_0;
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (str.length() < i8) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i7, i8));
            if (str.length() <= i8) {
                str2 = StringUtils.EMPTY;
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i7 + 4);
            }
            return new C5453j(enumC5452i, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19681a == EnumC5452i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f19682b);
        if (this.f19683c != null) {
            sb.append(' ');
            sb.append(this.f19683c);
        }
        return sb.toString();
    }
}
