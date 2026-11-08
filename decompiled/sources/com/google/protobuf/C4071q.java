package com.google.protobuf;

import com.google.protobuf.AbstractC4087y;
import java.util.Collections;
import java.util.Map;
import p207d.AbstractC4094d;

/* renamed from: com.google.protobuf.q */
/* loaded from: classes.dex */
public class C4071q {

    /* renamed from: b */
    public static boolean f13483b = true;

    /* renamed from: c */
    public static volatile C4071q f13484c;

    /* renamed from: d */
    public static final C4071q f13485d = new C4071q(true);

    /* renamed from: a */
    public final Map f13486a = Collections.emptyMap();

    /* renamed from: com.google.protobuf.q$a */
    public static final class a {

        /* renamed from: a */
        public final Object f13487a;

        /* renamed from: b */
        public final int f13488b;

        public a(Object obj, int i7) {
            this.f13487a = obj;
            this.f13488b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13487a == aVar.f13487a && this.f13488b == aVar.f13488b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f13487a) * 65535) + this.f13488b;
        }
    }

    public C4071q(boolean z6) {
    }

    /* renamed from: b */
    public static C4071q m16878b() {
        if (!f13483b) {
            return f13485d;
        }
        C4071q c4071q = f13484c;
        if (c4071q == null) {
            synchronized (C4071q.class) {
                try {
                    c4071q = f13484c;
                    if (c4071q == null) {
                        c4071q = AbstractC4069p.m16820a();
                        f13484c = c4071q;
                    }
                } finally {
                }
            }
        }
        return c4071q;
    }

    /* renamed from: a */
    public AbstractC4087y.c m16879a(InterfaceC4034V interfaceC4034V, int i7) {
        AbstractC4094d.m17162a(this.f13486a.get(new a(interfaceC4034V, i7)));
        return null;
    }
}
