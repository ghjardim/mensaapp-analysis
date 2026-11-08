package p321q2;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3647e;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.tasks.Task;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public abstract class AbstractC6183b extends AbstractC3647e {
    private static final C3643a.g zza;
    private static final C3643a.a zzb;
    private static final C3643a zzc;

    static {
        C3643a.g gVar = new C3643a.g();
        zza = gVar;
        C6184c c6184c = new C6184c();
        zzb = c6184c;
        zzc = new C3643a("SmsRetriever.API", c6184c, gVar);
    }

    public AbstractC6183b(Activity activity) {
        super(activity, zzc, (C3643a.d) C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }

    public abstract Task startSmsRetriever();

    public AbstractC6183b(Context context) {
        super(context, zzc, C3643a.d.f12262l, AbstractC3647e.a.f12263c);
    }
}
