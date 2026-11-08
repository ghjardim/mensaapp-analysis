package p056I;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: I.b */
/* loaded from: classes.dex */
public abstract class AbstractC0592b {
    /* renamed from: a */
    public static int m2389a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* renamed from: b */
    public static void m2390b(AccessibilityEvent accessibilityEvent, int i7) {
        accessibilityEvent.setContentChangeTypes(i7);
    }
}
