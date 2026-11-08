package p345t2;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;

/* renamed from: t2.m */
/* loaded from: classes.dex */
public final class C6444m extends AbstractC6447p {
    public C6444m(AbstractC3648f abstractC3648f) {
        super(abstractC3648f);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        C6440i c6440i = (C6440i) bVar;
        ((C6454w) c6440i.getService()).m26949b(new BinderC6443l(this), c6440i.m26931e());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return status;
    }
}
