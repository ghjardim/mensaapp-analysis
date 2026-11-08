package p187a4;

import java.util.Locale;

/* renamed from: a4.U */
/* loaded from: classes.dex */
public final class C3127U extends Exception {

    /* renamed from: a */
    public final int f9640a;

    public C3127U(String str) {
        super(str);
        this.f9640a = m11405a(str);
    }

    /* renamed from: a */
    public final int m11405a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
