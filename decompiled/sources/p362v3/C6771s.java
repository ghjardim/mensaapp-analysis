package p362v3;

import java.util.Arrays;
import java.util.List;

/* renamed from: v3.s */
/* loaded from: classes.dex */
public class C6771s extends C6772t {

    /* renamed from: a */
    public final List f24364a;

    public C6771s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f24364a = list;
    }
}
