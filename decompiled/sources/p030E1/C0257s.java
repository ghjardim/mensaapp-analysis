package p030E1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: E1.s */
/* loaded from: classes.dex */
public class C0257s {

    /* renamed from: b */
    public View f1081b;

    /* renamed from: a */
    public final Map f1080a = new HashMap();

    /* renamed from: c */
    public final ArrayList f1082c = new ArrayList();

    public C0257s(View view) {
        this.f1081b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0257s)) {
            return false;
        }
        C0257s c0257s = (C0257s) obj;
        return this.f1081b == c0257s.f1081b && this.f1080a.equals(c0257s.f1080a);
    }

    public int hashCode() {
        return (this.f1081b.hashCode() * 31) + this.f1080a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1081b + "\n") + "    values:";
        for (String str2 : this.f1080a.keySet()) {
            str = str + "    " + str2 + ": " + this.f1080a.get(str2) + "\n";
        }
        return str;
    }
}
