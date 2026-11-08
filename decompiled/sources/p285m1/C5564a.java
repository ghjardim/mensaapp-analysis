package p285m1;

import android.text.TextUtils;
import p171Y2.AbstractC2920c;
import p259j0.AbstractC5332a;

/* renamed from: m1.a */
/* loaded from: classes.dex */
public final class C5564a {

    /* renamed from: a */
    public final int f20103a;

    /* renamed from: b */
    public final int f20104b;

    /* renamed from: c */
    public final int f20105c;

    /* renamed from: d */
    public final int f20106d;

    /* renamed from: e */
    public final int f20107e;

    public C5564a(int i7, int i8, int i9, int i10, int i11) {
        this.f20103a = i7;
        this.f20104b = i8;
        this.f20105c = i9;
        this.f20106d = i10;
        this.f20107e = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C5564a m23308a(String str) {
        char c7;
        AbstractC5332a.m21796a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String m10515e = AbstractC2920c.m10515e(split[i11].trim());
            m10515e.hashCode();
            switch (m10515e.hashCode()) {
                case 100571:
                    if (m10515e.equals("end")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3556653:
                    if (m10515e.equals("text")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109757538:
                    if (m10515e.equals("start")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109780401:
                    if (m10515e.equals("style")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    i8 = i11;
                    break;
                case 1:
                    i10 = i11;
                    break;
                case 2:
                    i7 = i11;
                    break;
                case 3:
                    i9 = i11;
                    break;
            }
        }
        if (i7 == -1 || i8 == -1 || i10 == -1) {
            return null;
        }
        return new C5564a(i7, i8, i9, i10, split.length);
    }
}
