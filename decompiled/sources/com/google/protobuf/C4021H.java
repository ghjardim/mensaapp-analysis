package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.H */
/* loaded from: classes.dex */
public class C4021H implements Iterator {

    /* renamed from: a */
    public Iterator f13308a;

    public C4021H(Iterator it) {
        this.f13308a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f13308a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13308a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f13308a.remove();
    }
}
