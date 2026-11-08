package p270k2;

import android.net.Uri;
import java.util.Map;

/* renamed from: k2.b */
/* loaded from: classes.dex */
public final class C5404b extends Thread {

    /* renamed from: a */
    public final /* synthetic */ Map f19359a;

    public C5404b(C5403a c5403a, Map map) {
        this.f19359a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f19359a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        AbstractC5406d.m22375a(buildUpon.build().toString());
    }
}
