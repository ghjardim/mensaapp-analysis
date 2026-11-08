package p354u3;

import com.google.android.gms.internal.p395firebaseauthapi.zzzp;
import java.util.HashMap;
import java.util.Map;
import p003A2.C0019a;
import p346t3.C6462C;

/* renamed from: u3.M */
/* loaded from: classes.dex */
public abstract class AbstractC6625M {

    /* renamed from: a */
    public static final C0019a f23963a = new C0019a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C6462C m27502a(String str) {
        Map hashMap;
        try {
            hashMap = AbstractC6624L.m27499b(str);
        } catch (zzzp e7) {
            f23963a.m60b("Error parsing token claims", e7, new Object[0]);
            hashMap = new HashMap();
        }
        return new C6462C(str, hashMap);
    }
}
