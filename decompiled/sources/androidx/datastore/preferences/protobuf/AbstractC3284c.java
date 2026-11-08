package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3312u;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c */
/* loaded from: classes.dex */
public abstract class AbstractC3284c extends AbstractList implements AbstractC3312u.b {

    /* renamed from: a */
    public boolean f10443a;

    public AbstractC3284c(boolean z6) {
        this.f10443a = z6;
    }

    /* renamed from: a */
    public void m12322a() {
        if (!this.f10443a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m12322a();
        return super.addAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3312u.b
    /* renamed from: c */
    public final void mo12323c() {
        if (this.f10443a) {
            this.f10443a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m12322a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!get(i7).equals(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (i7 * 31) + get(i8).hashCode();
        }
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3312u.b
    /* renamed from: j */
    public boolean mo12324j() {
        return this.f10443a;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i7);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m12322a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        m12322a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        m12322a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        m12322a();
        return super.addAll(i7, collection);
    }
}
