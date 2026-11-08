package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3312u;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes.dex */
public final class C3317z implements InterfaceC3316y {
    /* renamed from: d */
    public static AbstractC3312u.b m12860d(Object obj, long j7) {
        return (AbstractC3312u.b) AbstractC3297i0.m12639z(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3316y
    /* renamed from: a */
    public void mo12857a(Object obj, Object obj2, long j7) {
        AbstractC3312u.b m12860d = m12860d(obj, j7);
        AbstractC3312u.b m12860d2 = m12860d(obj2, j7);
        int size = m12860d.size();
        int size2 = m12860d2.size();
        if (size > 0 && size2 > 0) {
            if (!m12860d.mo12324j()) {
                m12860d = m12860d.mo12187d(size2 + size);
            }
            m12860d.addAll(m12860d2);
        }
        if (size > 0) {
            m12860d2 = m12860d;
        }
        AbstractC3297i0.m12611O(obj, j7, m12860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3316y
    /* renamed from: b */
    public void mo12858b(Object obj, long j7) {
        m12860d(obj, j7).mo12323c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3316y
    /* renamed from: c */
    public List mo12859c(Object obj, long j7) {
        AbstractC3312u.b m12860d = m12860d(obj, j7);
        if (m12860d.mo12324j()) {
            return m12860d;
        }
        int size = m12860d.size();
        AbstractC3312u.b mo12187d = m12860d.mo12187d(size == 0 ? 10 : size * 2);
        AbstractC3297i0.m12611O(obj, j7, mo12187d);
        return mo12187d;
    }
}
