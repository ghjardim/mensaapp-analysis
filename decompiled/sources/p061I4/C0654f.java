package p061I4;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: I4.f */
/* loaded from: classes.dex */
public final class C0654f implements InterfaceC0657i {

    /* renamed from: a */
    public static final C0654f f2252a = new C0654f();

    @Override // p061I4.InterfaceC0657i
    /* renamed from: a */
    public ByteBuffer mo2637a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object m2646a = AbstractC0656h.m2646a(obj);
        return m2646a instanceof String ? C0666r.f2272b.mo2637a(JSONObject.quote((String) m2646a)) : C0666r.f2272b.mo2637a(m2646a.toString());
    }

    @Override // p061I4.InterfaceC0657i
    /* renamed from: b */
    public Object mo2638b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C0666r.f2272b.mo2638b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
