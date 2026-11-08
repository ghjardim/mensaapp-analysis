package p372x;

import android.content.Context;
import android.os.Process;
import p042G.AbstractC0340b;
import p365w.AbstractC6788d;

/* renamed from: x.e */
/* loaded from: classes.dex */
public abstract class AbstractC6939e {
    /* renamed from: a */
    public static int m28417a(Context context, String str, int i7, int i8, String str2) {
        if (context.checkPermission(str, i7, i8) == -1) {
            return -1;
        }
        String m27831c = AbstractC6788d.m27831c(str);
        if (m27831c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i8);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i8 || !AbstractC0340b.m1344a(context.getPackageName(), str2)) ? AbstractC6788d.m27830b(context, m27831c, str2) : AbstractC6788d.m27829a(context, i8, m27831c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m28418b(Context context, String str) {
        return m28417a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
