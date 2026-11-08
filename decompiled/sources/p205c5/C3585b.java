package p205c5;

import android.content.Context;
import io.flutter.plugin.platform.AbstractC4771m;
import io.flutter.plugin.platform.InterfaceC4770l;
import p197b5.AbstractC3544o;
import p197b5.AbstractC3545p;
import p197b5.AbstractC3549t;
import p256j$.util.Objects;

/* renamed from: c5.b */
/* loaded from: classes2.dex */
public class C3585b extends AbstractC4771m {

    /* renamed from: b */
    public final a f12046b;

    /* renamed from: c5.b$a */
    public interface a {
        /* renamed from: a */
        AbstractC3549t mo14333a(Long l7);
    }

    public C3585b(a aVar) {
        super(AbstractC3544o.m14271a());
        this.f12046b = aVar;
    }

    @Override // io.flutter.plugin.platform.AbstractC4771m
    /* renamed from: a */
    public InterfaceC4770l mo14455a(Context context, int i7, Object obj) {
        AbstractC3545p.d dVar = (AbstractC3545p.d) obj;
        Objects.requireNonNull(dVar);
        return new C3584a(context, this.f12046b.mo14333a(dVar.m14301b()).m14315e());
    }
}
