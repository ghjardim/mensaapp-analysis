package p215e;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;
import p215e.AbstractC4141a;
import p371w5.AbstractC6930m;
import p371w5.C6926i;
import p372x.AbstractC6935a;
import p378x5.AbstractC7004D;
import p378x5.AbstractC7005E;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7032w;

/* renamed from: e.g */
/* loaded from: classes.dex */
public final class C4147g extends AbstractC4141a {

    /* renamed from: a */
    public static final a f13885a = new a(null);

    /* renamed from: e.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final Intent m17411a(String[] input) {
            AbstractC5469l.m23028e(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            AbstractC5469l.m23027d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        public a() {
        }
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo9533a(Context context, String[] input) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        return f13885a.m17411a(input);
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC4141a.a mo17390b(Context context, String[] input) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        if (input.length == 0) {
            return new AbstractC4141a.a(AbstractC7005E.m28735d());
        }
        for (String str : input) {
            if (AbstractC6935a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1421h.m5528a(AbstractC7004D.m28732a(input.length), 16));
        for (String str2 : input) {
            C6926i m28383a = AbstractC6930m.m28383a(str2, Boolean.TRUE);
            linkedHashMap.put(m28383a.m28370c(), m28383a.m28371d());
        }
        return new AbstractC4141a.a(linkedHashMap);
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map mo9534c(int i7, Intent intent) {
        if (i7 != -1) {
            return AbstractC7005E.m28735d();
        }
        if (intent == null) {
            return AbstractC7005E.m28735d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return AbstractC7005E.m28735d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i8 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i8 == 0));
        }
        return AbstractC7005E.m28742k(AbstractC7032w.m28895U(AbstractC7020k.m28844q(stringArrayExtra), arrayList));
    }
}
