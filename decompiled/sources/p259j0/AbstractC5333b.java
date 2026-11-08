package p259j0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC3033v;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public abstract class AbstractC5333b {
    /* renamed from: a */
    public static AbstractC3033v m21806a(InterfaceC2924g interfaceC2924g, List list) {
        AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        for (int i7 = 0; i7 < list.size(); i7++) {
            m11045m.mo11040a(interfaceC2924g.apply((Bundle) AbstractC5332a.m21800e((Bundle) list.get(i7))));
        }
        return m11045m.m11063k();
    }

    /* renamed from: b */
    public static ArrayList m21807b(Collection collection, InterfaceC2924g interfaceC2924g) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) interfaceC2924g.apply(it.next()));
        }
        return arrayList;
    }
}
