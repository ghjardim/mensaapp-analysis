package p365w;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p207d.AbstractC4094d;
import p334s.C6309b;
import p365w.AbstractC6793i;

/* renamed from: w.j */
/* loaded from: classes.dex */
public class C6794j implements InterfaceC6792h {

    /* renamed from: a */
    public final Context f24452a;

    /* renamed from: b */
    public final Notification.Builder f24453b;

    /* renamed from: c */
    public final AbstractC6793i.e f24454c;

    /* renamed from: d */
    public RemoteViews f24455d;

    /* renamed from: e */
    public RemoteViews f24456e;

    /* renamed from: f */
    public final List f24457f = new ArrayList();

    /* renamed from: g */
    public final Bundle f24458g = new Bundle();

    /* renamed from: h */
    public int f24459h;

    /* renamed from: i */
    public RemoteViews f24460i;

    /* renamed from: w.j$a */
    public static class a {
        /* renamed from: a */
        public static Notification.Builder m27909a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        public static Notification.Action.Builder m27910b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        public static Notification.Action.Builder m27911c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        public static Notification.Action m27912d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        public static String m27913e(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: f */
        public static Notification.Builder m27914f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: g */
        public static Notification.Builder m27915g(Notification.Builder builder, boolean z6) {
            return builder.setGroupSummary(z6);
        }

        /* renamed from: h */
        public static Notification.Builder m27916h(Notification.Builder builder, boolean z6) {
            return builder.setLocalOnly(z6);
        }

        /* renamed from: i */
        public static Notification.Builder m27917i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: w.j$b */
    public static class b {
        /* renamed from: a */
        public static Notification.Builder m27918a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        public static Notification.Builder m27919b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        public static Notification.Builder m27920c(Notification.Builder builder, int i7) {
            return builder.setColor(i7);
        }

        /* renamed from: d */
        public static Notification.Builder m27921d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        public static Notification.Builder m27922e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        public static Notification.Builder m27923f(Notification.Builder builder, int i7) {
            return builder.setVisibility(i7);
        }
    }

    /* renamed from: w.j$c */
    public static class c {
        /* renamed from: a */
        public static Notification.Action.Builder m27924a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        public static Notification.Builder m27925b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        /* renamed from: c */
        public static Notification.Builder m27926c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: w.j$d */
    public static class d {
        /* renamed from: a */
        public static Notification.Action.Builder m27927a(Notification.Action.Builder builder, boolean z6) {
            return builder.setAllowGeneratedReplies(z6);
        }

        /* renamed from: b */
        public static Notification.Builder m27928b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* renamed from: c */
        public static Notification.Builder m27929c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* renamed from: d */
        public static Notification.Builder m27930d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* renamed from: e */
        public static Notification.Builder m27931e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: w.j$e */
    public static class e {
        /* renamed from: a */
        public static Notification.Builder m27932a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* renamed from: b */
        public static Notification.Builder m27933b(Notification.Builder builder, int i7) {
            return builder.setBadgeIconType(i7);
        }

        /* renamed from: c */
        public static Notification.Builder m27934c(Notification.Builder builder, boolean z6) {
            return builder.setColorized(z6);
        }

        /* renamed from: d */
        public static Notification.Builder m27935d(Notification.Builder builder, int i7) {
            return builder.setGroupAlertBehavior(i7);
        }

        /* renamed from: e */
        public static Notification.Builder m27936e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* renamed from: f */
        public static Notification.Builder m27937f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* renamed from: g */
        public static Notification.Builder m27938g(Notification.Builder builder, long j7) {
            return builder.setTimeoutAfter(j7);
        }
    }

    /* renamed from: w.j$f */
    public static class f {
        /* renamed from: a */
        public static Notification.Action.Builder m27939a(Notification.Action.Builder builder, int i7) {
            return builder.setSemanticAction(i7);
        }
    }

    /* renamed from: w.j$g */
    public static class g {
        /* renamed from: a */
        public static Notification.Builder m27940a(Notification.Builder builder, boolean z6) {
            return builder.setAllowSystemGeneratedContextualActions(z6);
        }

        /* renamed from: b */
        public static Notification.Builder m27941b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* renamed from: c */
        public static Notification.Action.Builder m27942c(Notification.Action.Builder builder, boolean z6) {
            return builder.setContextual(z6);
        }
    }

    /* renamed from: w.j$h */
    public static class h {
        /* renamed from: a */
        public static Notification.Action.Builder m27943a(Notification.Action.Builder builder, boolean z6) {
            return builder.setAuthenticationRequired(z6);
        }

        /* renamed from: b */
        public static Notification.Builder m27944b(Notification.Builder builder, int i7) {
            return builder.setForegroundServiceBehavior(i7);
        }
    }

    public C6794j(AbstractC6793i.e eVar) {
        int i7;
        this.f24454c = eVar;
        Context context = eVar.f24422a;
        this.f24452a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f24453b = e.m27932a(context, eVar.f24411K);
        } else {
            this.f24453b = new Notification.Builder(eVar.f24422a);
        }
        Notification notification = eVar.f24418R;
        this.f24453b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f24430i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f24426e).setContentText(eVar.f24427f).setContentInfo(eVar.f24432k).setContentIntent(eVar.f24428g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f24429h, (notification.flags & 128) != 0).setNumber(eVar.f24433l).setProgress(eVar.f24441t, eVar.f24442u, eVar.f24443v);
        Notification.Builder builder = this.f24453b;
        IconCompat iconCompat = eVar.f24431j;
        c.m27925b(builder, iconCompat == null ? null : iconCompat.m11960m(context));
        this.f24453b.setSubText(eVar.f24438q).setUsesChronometer(eVar.f24436o).setPriority(eVar.f24434m);
        Iterator it = eVar.f24423b.iterator();
        while (it.hasNext()) {
            m27904b((AbstractC6793i.a) it.next());
        }
        Bundle bundle = eVar.f24404D;
        if (bundle != null) {
            this.f24458g.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f24455d = eVar.f24408H;
        this.f24456e = eVar.f24409I;
        this.f24453b.setShowWhen(eVar.f24435n);
        a.m27916h(this.f24453b, eVar.f24447z);
        a.m27914f(this.f24453b, eVar.f24444w);
        a.m27917i(this.f24453b, eVar.f24446y);
        a.m27915g(this.f24453b, eVar.f24445x);
        this.f24459h = eVar.f24415O;
        b.m27919b(this.f24453b, eVar.f24403C);
        b.m27920c(this.f24453b, eVar.f24405E);
        b.m27923f(this.f24453b, eVar.f24406F);
        b.m27921d(this.f24453b, eVar.f24407G);
        b.m27922e(this.f24453b, notification.sound, notification.audioAttributes);
        List m27902e = i8 < 28 ? m27902e(m27903g(eVar.f24424c), eVar.f24421U) : eVar.f24421U;
        if (m27902e != null && !m27902e.isEmpty()) {
            Iterator it2 = m27902e.iterator();
            while (it2.hasNext()) {
                b.m27918a(this.f24453b, (String) it2.next());
            }
        }
        this.f24460i = eVar.f24410J;
        if (eVar.f24425d.size() > 0) {
            Bundle bundle2 = eVar.m27871c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < eVar.f24425d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), AbstractC6795k.m27945a((AbstractC6793i.a) eVar.f24425d.get(i9)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.m27871c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f24458g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = eVar.f24420T;
        if (obj != null) {
            c.m27926c(this.f24453b, obj);
        }
        if (i10 >= 24) {
            this.f24453b.setExtras(eVar.f24404D);
            d.m27931e(this.f24453b, eVar.f24440s);
            RemoteViews remoteViews = eVar.f24408H;
            if (remoteViews != null) {
                d.m27929c(this.f24453b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f24409I;
            if (remoteViews2 != null) {
                d.m27928b(this.f24453b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f24410J;
            if (remoteViews3 != null) {
                d.m27930d(this.f24453b, remoteViews3);
            }
        }
        if (i10 >= 26) {
            e.m27933b(this.f24453b, eVar.f24412L);
            e.m27936e(this.f24453b, eVar.f24439r);
            e.m27937f(this.f24453b, eVar.f24413M);
            e.m27938g(this.f24453b, eVar.f24414N);
            e.m27935d(this.f24453b, eVar.f24415O);
            if (eVar.f24402B) {
                e.m27934c(this.f24453b, eVar.f24401A);
            }
            if (!TextUtils.isEmpty(eVar.f24411K)) {
                this.f24453b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it3 = eVar.f24424c.iterator();
            if (it3.hasNext()) {
                AbstractC4094d.m17162a(it3.next());
                throw null;
            }
        }
        if (i10 >= 29) {
            g.m27940a(this.f24453b, eVar.f24417Q);
            g.m27941b(this.f24453b, AbstractC6793i.d.m27867a(null));
        }
        if (i10 >= 31 && (i7 = eVar.f24416P) != 0) {
            h.m27944b(this.f24453b, i7);
        }
        if (eVar.f24419S) {
            if (this.f24454c.f24445x) {
                this.f24459h = 2;
            } else {
                this.f24459h = 1;
            }
            this.f24453b.setVibrate(null);
            this.f24453b.setSound(null);
            int i11 = notification.defaults & (-4);
            notification.defaults = i11;
            this.f24453b.setDefaults(i11);
            if (i10 >= 26) {
                if (TextUtils.isEmpty(this.f24454c.f24444w)) {
                    a.m27914f(this.f24453b, "silent");
                }
                e.m27935d(this.f24453b, this.f24459h);
            }
        }
    }

    /* renamed from: e */
    public static List m27902e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C6309b c6309b = new C6309b(list.size() + list2.size());
        c6309b.addAll(list);
        c6309b.addAll(list2);
        return new ArrayList(c6309b);
    }

    /* renamed from: g */
    public static List m27903g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC4094d.m17162a(it.next());
        throw null;
    }

    @Override // p365w.InterfaceC6792h
    /* renamed from: a */
    public Notification.Builder mo27844a() {
        return this.f24453b;
    }

    /* renamed from: b */
    public final void m27904b(AbstractC6793i.a aVar) {
        IconCompat m27850d = aVar.m27850d();
        Notification.Action.Builder m27924a = c.m27924a(m27850d != null ? m27850d.m11959l() : null, aVar.m27854h(), aVar.m27847a());
        if (aVar.m27851e() != null) {
            for (RemoteInput remoteInput : AbstractC6801q.m27955b(aVar.m27851e())) {
                a.m27911c(m27924a, remoteInput);
            }
        }
        Bundle bundle = aVar.m27849c() != null ? new Bundle(aVar.m27849c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m27848b());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            d.m27927a(m27924a, aVar.m27848b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m27852f());
        if (i7 >= 28) {
            f.m27939a(m27924a, aVar.m27852f());
        }
        if (i7 >= 29) {
            g.m27942c(m27924a, aVar.m27856j());
        }
        if (i7 >= 31) {
            h.m27943a(m27924a, aVar.m27855i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m27853g());
        a.m27910b(m27924a, bundle);
        a.m27909a(this.f24453b, a.m27912d(m27924a));
    }

    /* renamed from: c */
    public Notification m27905c() {
        Bundle m27845a;
        RemoteViews m27900f;
        RemoteViews m27898d;
        AbstractC6793i.f fVar = this.f24454c.f24437p;
        if (fVar != null) {
            fVar.mo27857b(this);
        }
        RemoteViews m27899e = fVar != null ? fVar.m27899e(this) : null;
        Notification m27906d = m27906d();
        if (m27899e != null) {
            m27906d.contentView = m27899e;
        } else {
            RemoteViews remoteViews = this.f24454c.f24408H;
            if (remoteViews != null) {
                m27906d.contentView = remoteViews;
            }
        }
        if (fVar != null && (m27898d = fVar.m27898d(this)) != null) {
            m27906d.bigContentView = m27898d;
        }
        if (fVar != null && (m27900f = this.f24454c.f24437p.m27900f(this)) != null) {
            m27906d.headsUpContentView = m27900f;
        }
        if (fVar != null && (m27845a = AbstractC6793i.m27845a(m27906d)) != null) {
            fVar.mo27865a(m27845a);
        }
        return m27906d;
    }

    /* renamed from: d */
    public Notification m27906d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            return this.f24453b.build();
        }
        if (i7 >= 24) {
            Notification build = this.f24453b.build();
            if (this.f24459h != 0) {
                if (a.m27913e(build) != null && (build.flags & 512) != 0 && this.f24459h == 2) {
                    m27908h(build);
                }
                if (a.m27913e(build) != null && (build.flags & 512) == 0 && this.f24459h == 1) {
                    m27908h(build);
                }
            }
            return build;
        }
        this.f24453b.setExtras(this.f24458g);
        Notification build2 = this.f24453b.build();
        RemoteViews remoteViews = this.f24455d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f24456e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f24460i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f24459h != 0) {
            if (a.m27913e(build2) != null && (build2.flags & 512) != 0 && this.f24459h == 2) {
                m27908h(build2);
            }
            if (a.m27913e(build2) != null && (build2.flags & 512) == 0 && this.f24459h == 1) {
                m27908h(build2);
            }
        }
        return build2;
    }

    /* renamed from: f */
    public Context m27907f() {
        return this.f24452a;
    }

    /* renamed from: h */
    public final void m27908h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
