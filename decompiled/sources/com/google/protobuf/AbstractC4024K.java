package com.google.protobuf;

import com.google.protobuf.AbstractC4015C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p256j$.util.DesugarCollections;

/* renamed from: com.google.protobuf.K */
/* loaded from: classes.dex */
public abstract class AbstractC4024K {

    /* renamed from: a */
    public static final AbstractC4024K f13312a;

    /* renamed from: b */
    public static final AbstractC4024K f13313b;

    /* renamed from: com.google.protobuf.K$b */
    public static final class b extends AbstractC4024K {

        /* renamed from: c */
        public static final Class f13314c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        /* renamed from: f */
        public static List m16271f(Object obj, long j7) {
            return (List) AbstractC4090z0.m17087G(obj, j7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m16272g(Object obj, long j7, int i7) {
            C4022I c4022i;
            List m16271f = m16271f(obj, j7);
            if (m16271f.isEmpty()) {
                List c4022i2 = m16271f instanceof InterfaceC4023J ? new C4022I(i7) : ((m16271f instanceof InterfaceC4052g0) && (m16271f instanceof AbstractC4015C.e)) ? ((AbstractC4015C.e) m16271f).mo16168d(i7) : new ArrayList(i7);
                AbstractC4090z0.m17102V(obj, j7, c4022i2);
                return c4022i2;
            }
            if (f13314c.isAssignableFrom(m16271f.getClass())) {
                ArrayList arrayList = new ArrayList(m16271f.size() + i7);
                arrayList.addAll(m16271f);
                AbstractC4090z0.m17102V(obj, j7, arrayList);
                c4022i = arrayList;
            } else {
                if (!(m16271f instanceof C4088y0)) {
                    if (!(m16271f instanceof InterfaceC4052g0) || !(m16271f instanceof AbstractC4015C.e)) {
                        return m16271f;
                    }
                    AbstractC4015C.e eVar = (AbstractC4015C.e) m16271f;
                    if (eVar.mo16195j()) {
                        return m16271f;
                    }
                    AbstractC4015C.e mo16168d = eVar.mo16168d(m16271f.size() + i7);
                    AbstractC4090z0.m17102V(obj, j7, mo16168d);
                    return mo16168d;
                }
                C4022I c4022i3 = new C4022I(m16271f.size() + i7);
                c4022i3.addAll((C4088y0) m16271f);
                AbstractC4090z0.m17102V(obj, j7, c4022i3);
                c4022i = c4022i3;
            }
            return c4022i;
        }

        @Override // com.google.protobuf.AbstractC4024K
        /* renamed from: c */
        public void mo16268c(Object obj, long j7) {
            Object unmodifiableList;
            List list = (List) AbstractC4090z0.m17087G(obj, j7);
            if (list instanceof InterfaceC4023J) {
                unmodifiableList = ((InterfaceC4023J) list).mo16259c0();
            } else {
                if (f13314c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC4052g0) && (list instanceof AbstractC4015C.e)) {
                    AbstractC4015C.e eVar = (AbstractC4015C.e) list;
                    if (eVar.mo16195j()) {
                        eVar.mo16194c();
                        return;
                    }
                    return;
                }
                unmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            AbstractC4090z0.m17102V(obj, j7, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC4024K
        /* renamed from: d */
        public void mo16269d(Object obj, Object obj2, long j7) {
            List m16271f = m16271f(obj2, j7);
            List m16272g = m16272g(obj, j7, m16271f.size());
            int size = m16272g.size();
            int size2 = m16271f.size();
            if (size > 0 && size2 > 0) {
                m16272g.addAll(m16271f);
            }
            if (size > 0) {
                m16271f = m16272g;
            }
            AbstractC4090z0.m17102V(obj, j7, m16271f);
        }

        @Override // com.google.protobuf.AbstractC4024K
        /* renamed from: e */
        public List mo16270e(Object obj, long j7) {
            return m16272g(obj, j7, 10);
        }
    }

    /* renamed from: com.google.protobuf.K$c */
    public static final class c extends AbstractC4024K {
        public c() {
            super();
        }

        /* renamed from: f */
        public static AbstractC4015C.e m16273f(Object obj, long j7) {
            return (AbstractC4015C.e) AbstractC4090z0.m17087G(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC4024K
        /* renamed from: c */
        public void mo16268c(Object obj, long j7) {
            m16273f(obj, j7).mo16194c();
        }

        @Override // com.google.protobuf.AbstractC4024K
        /* renamed from: d */
        public void mo16269d(Object obj, Object obj2, long j7) {
            AbstractC4015C.e m16273f = m16273f(obj, j7);
            AbstractC4015C.e m16273f2 = m16273f(obj2, j7);
            int size = m16273f.size();
            int size2 = m16273f2.size();
            if (size > 0 && size2 > 0) {
                if (!m16273f.mo16195j()) {
                    m16273f = m16273f.mo16168d(size2 + size);
                }
                m16273f.addAll(m16273f2);
            }
            if (size > 0) {
                m16273f2 = m16273f;
            }
            AbstractC4090z0.m17102V(obj, j7, m16273f2);
        }

        @Override // com.google.protobuf.AbstractC4024K
        /* renamed from: e */
        public List mo16270e(Object obj, long j7) {
            AbstractC4015C.e m16273f = m16273f(obj, j7);
            if (m16273f.mo16195j()) {
                return m16273f;
            }
            int size = m16273f.size();
            AbstractC4015C.e mo16168d = m16273f.mo16168d(size == 0 ? 10 : size * 2);
            AbstractC4090z0.m17102V(obj, j7, mo16168d);
            return mo16168d;
        }
    }

    static {
        f13312a = new b();
        f13313b = new c();
    }

    /* renamed from: a */
    public static AbstractC4024K m16266a() {
        return f13312a;
    }

    /* renamed from: b */
    public static AbstractC4024K m16267b() {
        return f13313b;
    }

    /* renamed from: c */
    public abstract void mo16268c(Object obj, long j7);

    /* renamed from: d */
    public abstract void mo16269d(Object obj, Object obj2, long j7);

    /* renamed from: e */
    public abstract List mo16270e(Object obj, long j7);

    public AbstractC4024K() {
    }
}
