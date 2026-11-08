package com.google.protobuf;

import com.google.protobuf.InterfaceC4034V;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
/* loaded from: classes.dex */
public abstract class AbstractC4039a implements InterfaceC4034V {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class a implements InterfaceC4034V.a {
        /* renamed from: k */
        public static void m16416k(Iterable iterable, List list) {
            AbstractC4015C.m16183a(iterable);
            if (!(iterable instanceof InterfaceC4023J)) {
                if (iterable instanceof InterfaceC4052g0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m16417l(iterable, list);
                    return;
                }
            }
            List mo16257K = ((InterfaceC4023J) iterable).mo16257K();
            InterfaceC4023J interfaceC4023J = (InterfaceC4023J) list;
            int size = list.size();
            for (Object obj : mo16257K) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC4023J.size() - size) + " is null.";
                    for (int size2 = interfaceC4023J.size() - 1; size2 >= size; size2--) {
                        interfaceC4023J.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC4055i) {
                    interfaceC4023J.mo16265v((AbstractC4055i) obj);
                } else {
                    interfaceC4023J.add((String) obj);
                }
            }
        }

        /* renamed from: l */
        public static void m16417l(Iterable iterable, List list) {
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

        /* renamed from: m */
        public static C4080u0 m16418m(InterfaceC4034V interfaceC4034V) {
            return new C4080u0(interfaceC4034V);
        }
    }

    /* renamed from: k */
    public static void m16412k(Iterable iterable, List list) {
        a.m16416k(iterable, list);
    }

    @Override // com.google.protobuf.InterfaceC4034V
    /* renamed from: e */
    public void mo16317e(OutputStream outputStream) {
        AbstractC4061l m16705a0 = AbstractC4061l.m16705a0(outputStream, AbstractC4061l.m16686E(mo16315b()));
        mo16318f(m16705a0);
        m16705a0.mo16753X();
    }

    @Override // com.google.protobuf.InterfaceC4034V
    /* renamed from: i */
    public byte[] mo16319i() {
        try {
            byte[] bArr = new byte[mo16315b()];
            AbstractC4061l m16706b0 = AbstractC4061l.m16706b0(bArr);
            mo16318f(m16706b0);
            m16706b0.m16756d();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(m16414m("byte array"), e7);
        }
    }

    /* renamed from: l */
    public abstract int mo16413l(InterfaceC4066n0 interfaceC4066n0);

    /* renamed from: m */
    public final String m16414m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: n */
    public C4080u0 m16415n() {
        return new C4080u0(this);
    }
}
