package p259j0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p256j$.util.DesugarCollections;

/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C5339h implements Iterable {

    /* renamed from: a */
    public final Object f18826a = new Object();

    /* renamed from: b */
    public final Map f18827b = new HashMap();

    /* renamed from: c */
    public Set f18828c = Collections.emptySet();

    /* renamed from: d */
    public List f18829d = Collections.emptyList();

    /* renamed from: a */
    public void m21826a(Object obj) {
        synchronized (this.f18826a) {
            try {
                ArrayList arrayList = new ArrayList(this.f18829d);
                arrayList.add(obj);
                this.f18829d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f18827b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f18828c);
                    hashSet.add(obj);
                    this.f18828c = DesugarCollections.unmodifiableSet(hashSet);
                }
                this.f18827b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public int m21827b(Object obj) {
        int intValue;
        synchronized (this.f18826a) {
            try {
                intValue = this.f18827b.containsKey(obj) ? ((Integer) this.f18827b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    /* renamed from: e */
    public Set m21828e() {
        Set set;
        synchronized (this.f18826a) {
            set = this.f18828c;
        }
        return set;
    }

    /* renamed from: f */
    public void m21829f(Object obj) {
        synchronized (this.f18826a) {
            try {
                Integer num = (Integer) this.f18827b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f18829d);
                arrayList.remove(obj);
                this.f18829d = DesugarCollections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f18827b.remove(obj);
                    HashSet hashSet = new HashSet(this.f18828c);
                    hashSet.remove(obj);
                    this.f18828c = DesugarCollections.unmodifiableSet(hashSet);
                } else {
                    this.f18827b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f18826a) {
            it = this.f18829d.iterator();
        }
        return it;
    }
}
