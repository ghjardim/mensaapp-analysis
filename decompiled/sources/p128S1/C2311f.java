package p128S1;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC5469l;
import p061I4.C0659k;
import p061I4.InterfaceC0661m;
import p371w5.AbstractC6930m;
import p378x5.AbstractC7004D;

/* renamed from: S1.f */
/* loaded from: classes.dex */
public final class C2311f implements InterfaceC0661m {

    /* renamed from: c */
    public final C0659k f7007c;

    public C2311f(C0659k channel) {
        AbstractC5469l.m23028e(channel, "channel");
        this.f7007c = channel;
    }

    @Override // p061I4.InterfaceC0661m
    /* renamed from: a */
    public boolean mo2655a(int i7, int i8, Intent intent) {
        if (i7 != 1000) {
            return false;
        }
        m7825b(i8, intent);
        return true;
    }

    /* renamed from: b */
    public final void m7825b(int i7, Intent intent) {
        if (i7 == -1) {
            this.f7007c.m2652c("onSuccess", null);
            return;
        }
        if (i7 == 0) {
            this.f7007c.m2652c("onCanceled", null);
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            this.f7007c.m2652c("onError", AbstractC7004D.m28733b(AbstractC6930m.m28383a("message", "Internal error")));
        } else {
            String stringExtra = intent != null ? intent.getStringExtra("extra_api_error_message") : null;
            C0659k c0659k = this.f7007c;
            if (stringExtra == null) {
                stringExtra = "Unexpected";
            }
            c0659k.m2652c("onError", AbstractC7004D.m28733b(AbstractC6930m.m28383a("message", stringExtra)));
        }
    }
}
