package p180Z4;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7008H;

/* renamed from: Z4.N */
/* loaded from: classes2.dex */
public final class C3052N extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3052N(InputStream input) {
        super(input);
        AbstractC5469l.m23028e(input, "input");
    }

    @Override // java.io.ObjectInputStream
    public Class resolveClass(ObjectStreamClass objectStreamClass) {
        Set m28758d = AbstractC7008H.m28758d("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || m28758d.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
