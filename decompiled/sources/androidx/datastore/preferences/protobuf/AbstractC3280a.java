package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC3264J;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a */
/* loaded from: classes.dex */
public abstract class AbstractC3280a implements InterfaceC3264J {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a implements InterfaceC3264J.a {
        /* renamed from: e */
        public static void m12237e(Iterable iterable, List list) {
            AbstractC3312u.m12834a(iterable);
            m12238f(iterable, list);
        }

        /* renamed from: f */
        public static void m12238f(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        /* renamed from: g */
        public static C3289e0 m12239g(InterfaceC3264J interfaceC3264J) {
            return new C3289e0(interfaceC3264J);
        }
    }

    /* renamed from: e */
    public static void m12233e(Iterable iterable, List list) {
        a.m12237e(iterable, list);
    }

    /* renamed from: f */
    public abstract int mo12234f(InterfaceC3278Y interfaceC3278Y);

    /* renamed from: g */
    public C3289e0 m12235g() {
        return new C3289e0(this);
    }

    /* renamed from: i */
    public void m12236i(OutputStream outputStream) {
        AbstractC3296i m12512Y = AbstractC3296i.m12512Y(outputStream, AbstractC3296i.m12493C(mo12094b()));
        mo12096d(m12512Y);
        m12512Y.mo12555V();
    }
}
