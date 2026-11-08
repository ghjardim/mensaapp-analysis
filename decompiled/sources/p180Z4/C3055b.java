package p180Z4;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: Z4.b */
/* loaded from: classes2.dex */
public final class C3055b implements InterfaceC3046H {
    @Override // p180Z4.InterfaceC3046H
    /* renamed from: a */
    public String mo11171a(List list) {
        AbstractC5469l.m23028e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        AbstractC5469l.m23027d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    @Override // p180Z4.InterfaceC3046H
    /* renamed from: b */
    public List mo11172b(String listString) {
        AbstractC5469l.m23028e(listString, "listString");
        Object readObject = new C3052N(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
        AbstractC5469l.m23026c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) readObject) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
