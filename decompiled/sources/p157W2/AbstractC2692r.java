package p157W2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: W2.r */
/* loaded from: classes.dex */
public abstract class AbstractC2692r {
    /* renamed from: a */
    public static final List m9188a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2694t abstractC2694t = (AbstractC2694t) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC2694t.mo9190a());
            bundle.putLong("event_timestamp", abstractC2694t.mo9191b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m9189b(int i7, List list) {
        list.add(AbstractC2694t.m9192c(i7, System.currentTimeMillis()));
    }
}
