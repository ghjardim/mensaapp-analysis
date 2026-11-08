package p135T1;

import java.util.Arrays;

/* renamed from: T1.b */
/* loaded from: classes.dex */
public class C2435b extends RuntimeException {
    public C2435b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
