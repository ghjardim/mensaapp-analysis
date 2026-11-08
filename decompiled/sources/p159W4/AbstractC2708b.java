package p159W4;

import java.util.Iterator;

/* renamed from: W4.b */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2708b {
    /* renamed from: a */
    public static /* synthetic */ String m9284a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}
