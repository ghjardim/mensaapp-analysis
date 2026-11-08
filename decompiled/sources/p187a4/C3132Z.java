package p187a4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.regex.Pattern;

/* renamed from: a4.Z */
/* loaded from: classes.dex */
public final class C3132Z {

    /* renamed from: d */
    public static final Pattern f9659d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f9660a;

    /* renamed from: b */
    public final String f9661b;

    /* renamed from: c */
    public final String f9662c;

    public C3132Z(String str, String str2) {
        this.f9660a = m11430d(str2, str);
        this.f9661b = str;
        this.f9662c = str + "!" + str2;
    }

    /* renamed from: a */
    public static C3132Z m11429a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C3132Z(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m11430d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f9659d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* renamed from: f */
    public static C3132Z m11431f(String str) {
        return new C3132Z("S", str);
    }

    /* renamed from: g */
    public static C3132Z m11432g(String str) {
        return new C3132Z("U", str);
    }

    /* renamed from: b */
    public String m11433b() {
        return this.f9661b;
    }

    /* renamed from: c */
    public String m11434c() {
        return this.f9660a;
    }

    /* renamed from: e */
    public String m11435e() {
        return this.f9662c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3132Z)) {
            return false;
        }
        C3132Z c3132z = (C3132Z) obj;
        return this.f9660a.equals(c3132z.f9660a) && this.f9661b.equals(c3132z.f9661b);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f9661b, this.f9660a);
    }
}
