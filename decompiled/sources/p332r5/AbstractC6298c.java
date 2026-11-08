package p332r5;

import android.view.Surface;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: r5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6298c {
    /* renamed from: a */
    public static final Object m26354a(Surface surface, InterfaceC0800l block) {
        AbstractC5469l.m23028e(surface, "<this>");
        AbstractC5469l.m23028e(block, "block");
        try {
            return block.invoke(surface);
        } finally {
            surface.release();
        }
    }
}
