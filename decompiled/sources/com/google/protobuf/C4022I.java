package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p256j$.util.DesugarCollections;

/* renamed from: com.google.protobuf.I */
/* loaded from: classes.dex */
public class C4022I extends AbstractC4043c implements InterfaceC4023J, RandomAccess {

    /* renamed from: c */
    public static final C4022I f13309c;

    /* renamed from: d */
    public static final InterfaceC4023J f13310d;

    /* renamed from: b */
    public final List f13311b;

    static {
        C4022I c4022i = new C4022I(false);
        f13309c = c4022i;
        f13310d = c4022i;
    }

    public C4022I(boolean z6) {
        super(z6);
        this.f13311b = Collections.emptyList();
    }

    /* renamed from: e */
    public static String m16256e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC4055i ? ((AbstractC4055i) obj).m16506G() : AbstractC4015C.m16191i((byte[]) obj);
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: K */
    public List mo16257K() {
        return DesugarCollections.unmodifiableList(this.f13311b);
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i7, String str) {
        m16424a();
        this.f13311b.add(i7, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: c0 */
    public InterfaceC4023J mo16259c0() {
        return mo16195j() ? new C4088y0(this) : this;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m16424a();
        this.f13311b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        Object obj = this.f13311b.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4055i) {
            AbstractC4055i abstractC4055i = (AbstractC4055i) obj;
            String m16506G = abstractC4055i.m16506G();
            if (abstractC4055i.mo16440t()) {
                this.f13311b.set(i7, m16506G);
            }
            return m16506G;
        }
        byte[] bArr = (byte[]) obj;
        String m16191i = AbstractC4015C.m16191i(bArr);
        if (AbstractC4015C.m16189g(bArr)) {
            this.f13311b.set(i7, m16191i);
        }
        return m16191i;
    }

    @Override // com.google.protobuf.AbstractC4015C.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4022I mo16168d(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f13311b);
        return new C4022I(arrayList);
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i7) {
        m16424a();
        Object remove = this.f13311b.remove(i7);
        ((AbstractList) this).modCount++;
        return m16256e(remove);
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i7, String str) {
        m16424a();
        return m16256e(this.f13311b.set(i7, str));
    }

    @Override // com.google.protobuf.AbstractC4043c, com.google.protobuf.AbstractC4015C.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo16195j() {
        return super.mo16195j();
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: l0 */
    public Object mo16264l0(int i7) {
        return this.f13311b.get(i7);
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13311b.size();
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: v */
    public void mo16265v(AbstractC4055i abstractC4055i) {
        m16424a();
        this.f13311b.add(abstractC4055i);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        m16424a();
        if (collection instanceof InterfaceC4023J) {
            collection = ((InterfaceC4023J) collection).mo16257K();
        }
        boolean addAll = this.f13311b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C4022I(int i7) {
        this(new ArrayList(i7));
    }

    public C4022I(ArrayList arrayList) {
        this.f13311b = arrayList;
    }
}
