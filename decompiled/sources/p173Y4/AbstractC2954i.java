package p173Y4;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Y4.i */
/* loaded from: classes2.dex */
public abstract class AbstractC2954i {

    /* renamed from: Y4.i$a */
    public interface a {
        /* renamed from: a */
        List mo10639a();

        /* renamed from: b */
        String mo10640b();

        /* renamed from: c */
        String mo10641c();

        /* renamed from: d */
        String mo10642d();

        /* renamed from: e */
        String mo10643e();

        /* renamed from: f */
        String mo10644f();

        /* renamed from: g */
        List mo10645g(b bVar);
    }

    /* renamed from: Y4.i$b */
    public enum b {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* renamed from: a */
        public final int f9077a;

        b(int i7) {
            this.f9077a = i7;
        }
    }

    /* renamed from: a */
    public static ArrayList m10638a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
