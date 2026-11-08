package p108P2;

import android.text.TextUtils;

/* renamed from: P2.f1 */
/* loaded from: classes.dex */
public final class C1705f1 {

    /* renamed from: a */
    public final EnumC1744j4 f5127a;

    public C1705f1(EnumC1744j4 enumC1744j4) {
        this.f5127a = enumC1744j4;
    }

    /* renamed from: a */
    public static C1705f1 m6066a(String str) {
        return new C1705f1((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC1744j4.UNINITIALIZED : C1771m4.m6099g(str.charAt(0)));
    }

    /* renamed from: b */
    public final EnumC1744j4 m6067b() {
        return this.f5127a;
    }

    /* renamed from: c */
    public final String m6068c() {
        return String.valueOf(C1771m4.m6097a(this.f5127a));
    }
}
