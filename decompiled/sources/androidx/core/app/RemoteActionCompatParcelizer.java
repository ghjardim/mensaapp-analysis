package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p044G1.AbstractC0377a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0377a abstractC0377a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f10300a = (IconCompat) abstractC0377a.m1563v(remoteActionCompat.f10300a, 1);
        remoteActionCompat.f10301b = abstractC0377a.m1553l(remoteActionCompat.f10301b, 2);
        remoteActionCompat.f10302c = abstractC0377a.m1553l(remoteActionCompat.f10302c, 3);
        remoteActionCompat.f10303d = (PendingIntent) abstractC0377a.m1559r(remoteActionCompat.f10303d, 4);
        remoteActionCompat.f10304e = abstractC0377a.m1549h(remoteActionCompat.f10304e, 5);
        remoteActionCompat.f10305f = abstractC0377a.m1549h(remoteActionCompat.f10305f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0377a abstractC0377a) {
        abstractC0377a.m1565x(false, false);
        abstractC0377a.m1540M(remoteActionCompat.f10300a, 1);
        abstractC0377a.m1531D(remoteActionCompat.f10301b, 2);
        abstractC0377a.m1531D(remoteActionCompat.f10302c, 3);
        abstractC0377a.m1535H(remoteActionCompat.f10303d, 4);
        abstractC0377a.m1567z(remoteActionCompat.f10304e, 5);
        abstractC0377a.m1567z(remoteActionCompat.f10305f, 6);
    }
}
