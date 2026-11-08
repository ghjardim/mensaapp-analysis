package p349t6;

import java.util.HashMap;
import java.util.Map;
import p357u6.InterfaceC6697a;

/* renamed from: t6.b */
/* loaded from: classes2.dex */
public class C6564b implements InterfaceC6697a {

    /* renamed from: a */
    public final C6578p f23552a = new C6578p();

    /* renamed from: b */
    public final InheritableThreadLocal f23553b = new a();

    /* renamed from: t6.b$a */
    public class a extends InheritableThreadLocal {
        public a() {
        }

        @Override // java.lang.InheritableThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
