package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p046G3.C0425g;
import p046G3.C0452t0;
import p046G3.EnumC0418c0;
import p067J3.C0783z0;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2157z;
import p256j$.util.DesugarCollections;

/* renamed from: com.google.firebase.firestore.k */
/* loaded from: classes.dex */
public class C3957k implements Iterable {

    /* renamed from: a */
    public final C3955i f12964a;

    /* renamed from: b */
    public final C0783z0 f12965b;

    /* renamed from: c */
    public final FirebaseFirestore f12966c;

    /* renamed from: d */
    public List f12967d;

    /* renamed from: e */
    public EnumC0418c0 f12968e;

    /* renamed from: f */
    public final C0452t0 f12969f;

    /* renamed from: com.google.firebase.firestore.k$a */
    public class a implements Iterator {

        /* renamed from: a */
        public final Iterator f12970a;

        public a(Iterator it) {
            this.f12970a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3956j next() {
            return C3957k.this.m15660b((InterfaceC1167i) this.f12970a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12970a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public C3957k(C3955i c3955i, C0783z0 c0783z0, FirebaseFirestore firebaseFirestore) {
        this.f12964a = (C3955i) AbstractC2157z.m7329b(c3955i);
        this.f12965b = (C0783z0) AbstractC2157z.m7329b(c0783z0);
        this.f12966c = (FirebaseFirestore) AbstractC2157z.m7329b(firebaseFirestore);
        this.f12969f = new C0452t0(c0783z0.m3339j(), c0783z0.m3340k());
    }

    /* renamed from: b */
    public final C3956j m15660b(InterfaceC1167i interfaceC1167i) {
        return C3956j.m15658h(this.f12966c, interfaceC1167i, this.f12965b.m3340k(), this.f12965b.m3335f().contains(interfaceC1167i.getKey()));
    }

    /* renamed from: e */
    public List m15661e() {
        return m15662f(EnumC0418c0.EXCLUDE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3957k)) {
            return false;
        }
        C3957k c3957k = (C3957k) obj;
        return this.f12966c.equals(c3957k.f12966c) && this.f12964a.equals(c3957k.f12964a) && this.f12965b.equals(c3957k.f12965b) && this.f12969f.equals(c3957k.f12969f);
    }

    /* renamed from: f */
    public List m15662f(EnumC0418c0 enumC0418c0) {
        if (EnumC0418c0.INCLUDE.equals(enumC0418c0) && this.f12965b.m3332b()) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f12967d == null || this.f12968e != enumC0418c0) {
            this.f12967d = DesugarCollections.unmodifiableList(C0425g.m1639a(this.f12966c, enumC0418c0, this.f12965b));
            this.f12968e = enumC0418c0;
        }
        return this.f12967d;
    }

    /* renamed from: g */
    public List m15663g() {
        ArrayList arrayList = new ArrayList(this.f12965b.m3334e().size());
        Iterator it = this.f12965b.m3334e().iterator();
        while (it.hasNext()) {
            arrayList.add(m15660b((InterfaceC1167i) it.next()));
        }
        return arrayList;
    }

    /* renamed from: h */
    public C0452t0 m15664h() {
        return this.f12969f;
    }

    public int hashCode() {
        return (((((this.f12966c.hashCode() * 31) + this.f12964a.hashCode()) * 31) + this.f12965b.hashCode()) * 31) + this.f12969f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f12965b.m3334e().iterator());
    }
}
