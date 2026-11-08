package p376x3;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: x3.d */
/* loaded from: classes.dex */
public class C6949d implements Iterator {

    /* renamed from: a */
    public final ArrayDeque f24860a = new ArrayDeque();

    /* renamed from: b */
    public final boolean f24861b;

    public C6949d(InterfaceC6953h interfaceC6953h, Object obj, Comparator comparator, boolean z6) {
        this.f24861b = z6;
        while (!interfaceC6953h.isEmpty()) {
            int compare = obj != null ? z6 ? comparator.compare(obj, interfaceC6953h.getKey()) : comparator.compare(interfaceC6953h.getKey(), obj) : 1;
            if (compare < 0) {
                interfaceC6953h = z6 ? interfaceC6953h.mo28481b() : interfaceC6953h.mo28484f();
            } else if (compare == 0) {
                this.f24860a.push((AbstractC6955j) interfaceC6953h);
                return;
            } else {
                this.f24860a.push((AbstractC6955j) interfaceC6953h);
                interfaceC6953h = z6 ? interfaceC6953h.mo28484f() : interfaceC6953h.mo28481b();
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        try {
            AbstractC6955j abstractC6955j = (AbstractC6955j) this.f24860a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(abstractC6955j.getKey(), abstractC6955j.getValue());
            if (this.f24861b) {
                for (InterfaceC6953h mo28481b = abstractC6955j.mo28481b(); !mo28481b.isEmpty(); mo28481b = mo28481b.mo28484f()) {
                    this.f24860a.push((AbstractC6955j) mo28481b);
                }
            } else {
                for (InterfaceC6953h mo28484f = abstractC6955j.mo28484f(); !mo28484f.isEmpty(); mo28484f = mo28484f.mo28481b()) {
                    this.f24860a.push((AbstractC6955j) mo28484f);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24860a.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
