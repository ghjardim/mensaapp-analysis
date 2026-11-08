package p378x5;

import java.util.AbstractList;
import java.util.List;
import p076K5.InterfaceC0834a;

/* renamed from: x5.e */
/* loaded from: classes2.dex */
public abstract class AbstractC7014e extends AbstractList implements List, InterfaceC0834a {
    /* renamed from: a */
    public abstract int mo28776a();

    /* renamed from: b */
    public abstract Object mo28777b(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return mo28777b(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo28776a();
    }
}
