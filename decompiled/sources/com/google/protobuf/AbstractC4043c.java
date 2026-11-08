package com.google.protobuf;

import com.google.protobuf.AbstractC4015C;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
/* loaded from: classes.dex */
public abstract class AbstractC4043c extends AbstractList implements AbstractC4015C.e {

    /* renamed from: a */
    public boolean f13356a;

    public AbstractC4043c() {
        this(true);
    }

    /* renamed from: a */
    public void m16424a() {
        if (!this.f13356a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m16424a();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m16424a();
        return super.addAll(collection);
    }

    @Override // com.google.protobuf.AbstractC4015C.e
    /* renamed from: c */
    public final void mo16194c() {
        if (this.f13356a) {
            this.f13356a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m16424a();
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

    /* renamed from: j */
    public boolean mo16195j() {
        return this.f13356a;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i7);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m16424a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        m16424a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        m16424a();
        return super.retainAll(collection);
    }

    public AbstractC4043c(boolean z6) {
        this.f13356a = z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        m16424a();
        return super.addAll(i7, collection);
    }
}
