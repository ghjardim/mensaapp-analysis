package p327r0;

import java.util.List;
import p256j$.util.DesugarCollections;

/* renamed from: r0.g */
/* loaded from: classes.dex */
public class C6240g {

    /* renamed from: a */
    public final String f22323a;

    /* renamed from: b */
    public final long f22324b;

    /* renamed from: c */
    public final List f22325c;

    /* renamed from: d */
    public final List f22326d;

    /* renamed from: e */
    public final C6238e f22327e;

    public C6240g(String str, long j7, List list, List list2) {
        this(str, j7, list, list2, null);
    }

    /* renamed from: a */
    public int m26086a(int i7) {
        int size = this.f22325c.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((C6234a) this.f22325c.get(i8)).f22279b == i7) {
                return i8;
            }
        }
        return -1;
    }

    public C6240g(String str, long j7, List list, List list2, C6238e c6238e) {
        this.f22323a = str;
        this.f22324b = j7;
        this.f22325c = DesugarCollections.unmodifiableList(list);
        this.f22326d = DesugarCollections.unmodifiableList(list2);
        this.f22327e = c6238e;
    }
}
