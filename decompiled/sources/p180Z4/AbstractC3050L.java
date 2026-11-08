package p180Z4;

import android.content.Context;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5481x;
import kotlin.jvm.internal.C5475r;
import p083L5.InterfaceC1141a;
import p111P5.InterfaceC1975i;
import p112Q.InterfaceC1987h;
import p125R5.AbstractC2291q;
import p133T.AbstractC2420a;

/* renamed from: Z4.L */
/* loaded from: classes2.dex */
public abstract class AbstractC3050L {

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC1975i[] f9481a = {AbstractC5481x.m23043e(new C5475r(AbstractC3050L.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b */
    public static final InterfaceC1141a f9482b = AbstractC2420a.m8206b("FlutterSharedPreferences", null, null, null, 14, null);

    /* renamed from: b */
    public static final InterfaceC1987h m11205b(Context context) {
        return (InterfaceC1987h) f9482b.mo4412a(context, f9481a[0]);
    }

    /* renamed from: c */
    public static final boolean m11206c(String key, Object obj, Set set) {
        AbstractC5469l.m23028e(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    /* renamed from: d */
    public static final Object m11207d(Object obj, InterfaceC3046H listEncoder) {
        AbstractC5469l.m23028e(listEncoder, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!AbstractC2291q.m7745u(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null)) {
            if (!AbstractC2291q.m7745u(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false, 2, null)) {
                return obj;
            }
            String substring = str.substring(40);
            AbstractC5469l.m23027d(substring, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring));
        }
        if (AbstractC2291q.m7745u(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null)) {
            return obj;
        }
        String substring2 = str.substring(40);
        AbstractC5469l.m23027d(substring2, "substring(...)");
        List mo11172b = listEncoder.mo11172b(substring2);
        AbstractC5469l.m23025b(mo11172b);
        return mo11172b;
    }
}
