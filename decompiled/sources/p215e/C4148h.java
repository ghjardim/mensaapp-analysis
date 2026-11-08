package p215e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p207d.C4091a;

/* renamed from: e.h */
/* loaded from: classes.dex */
public final class C4148h extends AbstractC4141a {

    /* renamed from: a */
    public static final a f13886a = new a(null);

    /* renamed from: e.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo9533a(Context context, Intent input) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        return input;
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C4091a mo9534c(int i7, Intent intent) {
        return new C4091a(i7, intent);
    }
}
