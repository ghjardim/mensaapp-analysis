package p088M3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: M3.u */
/* loaded from: classes.dex */
public final class C1179u extends AbstractC1163e {

    /* renamed from: b */
    public static final C1179u f3792b = new C1179u(Collections.emptyList());

    public C1179u(List list) {
        super(list);
    }

    /* renamed from: u */
    public static C1179u m4564u(List list) {
        return list.isEmpty() ? f3792b : new C1179u(list);
    }

    /* renamed from: v */
    public static C1179u m4565v(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] split = str.split("/");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new C1179u(arrayList);
    }

    @Override // p088M3.AbstractC1163e
    /* renamed from: g */
    public String mo4464g() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < this.f3753a.size(); i7++) {
            if (i7 > 0) {
                sb.append("/");
            }
            sb.append((String) this.f3753a.get(i7));
        }
        return sb.toString();
    }

    @Override // p088M3.AbstractC1163e
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C1179u mo4466j(List list) {
        return new C1179u(list);
    }
}
