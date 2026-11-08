package p386z;

import java.util.ArrayList;
import java.util.List;
import p256j$.util.DesugarCollections;
import p256j$.util.Objects;

/* renamed from: z.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7091f {
    /* renamed from: a */
    public static /* synthetic */ List m29220a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
