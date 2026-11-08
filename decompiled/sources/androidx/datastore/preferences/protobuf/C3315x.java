package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.x */
/* loaded from: classes.dex */
public class C3315x implements Iterator {

    /* renamed from: a */
    public Iterator f10684a;

    public C3315x(Iterator it) {
        this.f10684a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f10684a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10684a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f10684a.remove();
    }
}
