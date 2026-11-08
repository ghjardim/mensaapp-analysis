package p365w;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p358v.AbstractC6700b;

/* renamed from: w.i */
/* loaded from: classes.dex */
public abstract class AbstractC6793i {

    /* renamed from: w.i$a */
    public static class a {

        /* renamed from: a */
        public final Bundle f24383a;

        /* renamed from: b */
        public IconCompat f24384b;

        /* renamed from: c */
        public final AbstractC6801q[] f24385c;

        /* renamed from: d */
        public final AbstractC6801q[] f24386d;

        /* renamed from: e */
        public boolean f24387e;

        /* renamed from: f */
        public boolean f24388f;

        /* renamed from: g */
        public final int f24389g;

        /* renamed from: h */
        public final boolean f24390h;

        /* renamed from: i */
        public int f24391i;

        /* renamed from: j */
        public CharSequence f24392j;

        /* renamed from: k */
        public PendingIntent f24393k;

        /* renamed from: l */
        public boolean f24394l;

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.m11949c(null, StringUtils.EMPTY, i7) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m27847a() {
            return this.f24393k;
        }

        /* renamed from: b */
        public boolean m27848b() {
            return this.f24387e;
        }

        /* renamed from: c */
        public Bundle m27849c() {
            return this.f24383a;
        }

        /* renamed from: d */
        public IconCompat m27850d() {
            int i7;
            if (this.f24384b == null && (i7 = this.f24391i) != 0) {
                this.f24384b = IconCompat.m11949c(null, StringUtils.EMPTY, i7);
            }
            return this.f24384b;
        }

        /* renamed from: e */
        public AbstractC6801q[] m27851e() {
            return this.f24385c;
        }

        /* renamed from: f */
        public int m27852f() {
            return this.f24389g;
        }

        /* renamed from: g */
        public boolean m27853g() {
            return this.f24388f;
        }

        /* renamed from: h */
        public CharSequence m27854h() {
            return this.f24392j;
        }

        /* renamed from: i */
        public boolean m27855i() {
            return this.f24394l;
        }

        /* renamed from: j */
        public boolean m27856j() {
            return this.f24390h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC6801q[] abstractC6801qArr, AbstractC6801q[] abstractC6801qArr2, boolean z6, int i7, boolean z7, boolean z8, boolean z9) {
            this.f24388f = true;
            this.f24384b = iconCompat;
            if (iconCompat != null && iconCompat.m11954g() == 2) {
                this.f24391i = iconCompat.m11952e();
            }
            this.f24392j = e.m27868d(charSequence);
            this.f24393k = pendingIntent;
            this.f24383a = bundle == null ? new Bundle() : bundle;
            this.f24385c = abstractC6801qArr;
            this.f24386d = abstractC6801qArr2;
            this.f24387e = z6;
            this.f24389g = i7;
            this.f24388f = z7;
            this.f24390h = z8;
            this.f24394l = z9;
        }
    }

    /* renamed from: w.i$b */
    public static class b extends f {

        /* renamed from: e */
        public IconCompat f24395e;

        /* renamed from: f */
        public IconCompat f24396f;

        /* renamed from: g */
        public boolean f24397g;

        /* renamed from: h */
        public CharSequence f24398h;

        /* renamed from: i */
        public boolean f24399i;

        /* renamed from: w.i$b$a */
        public static class a {
            /* renamed from: a */
            public static void m27861a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: w.i$b$b, reason: collision with other inner class name */
        public static class C7241b {
            /* renamed from: a */
            public static void m27862a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            public static void m27863b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            public static void m27864c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
                bigPictureStyle.showBigPictureWhenCollapsed(z6);
            }
        }

        @Override // p365w.AbstractC6793i.f
        /* renamed from: b */
        public void mo27857b(InterfaceC6792h interfaceC6792h) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC6792h.mo27844a()).setBigContentTitle(this.f24449b);
            IconCompat iconCompat = this.f24395e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C7241b.m27862a(bigContentTitle, this.f24395e.m11960m(interfaceC6792h instanceof C6794j ? ((C6794j) interfaceC6792h).m27907f() : null));
                } else if (iconCompat.m11954g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f24395e.m11951d());
                }
            }
            if (this.f24397g) {
                if (this.f24396f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.m27861a(bigContentTitle, this.f24396f.m11960m(interfaceC6792h instanceof C6794j ? ((C6794j) interfaceC6792h).m27907f() : null));
                }
            }
            if (this.f24451d) {
                bigContentTitle.setSummaryText(this.f24450c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C7241b.m27864c(bigContentTitle, this.f24399i);
                C7241b.m27863b(bigContentTitle, this.f24398h);
            }
        }

        @Override // p365w.AbstractC6793i.f
        /* renamed from: c */
        public String mo27858c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public b m27859h(Bitmap bitmap) {
            this.f24396f = bitmap == null ? null : IconCompat.m11948b(bitmap);
            this.f24397g = true;
            return this;
        }

        /* renamed from: i */
        public b m27860i(Bitmap bitmap) {
            this.f24395e = bitmap == null ? null : IconCompat.m11948b(bitmap);
            return this;
        }
    }

    /* renamed from: w.i$c */
    public static class c extends f {

        /* renamed from: e */
        public CharSequence f24400e;

        @Override // p365w.AbstractC6793i.f
        /* renamed from: a */
        public void mo27865a(Bundle bundle) {
            super.mo27865a(bundle);
        }

        @Override // p365w.AbstractC6793i.f
        /* renamed from: b */
        public void mo27857b(InterfaceC6792h interfaceC6792h) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(interfaceC6792h.mo27844a()).setBigContentTitle(this.f24449b).bigText(this.f24400e);
            if (this.f24451d) {
                bigText.setSummaryText(this.f24450c);
            }
        }

        @Override // p365w.AbstractC6793i.f
        /* renamed from: c */
        public String mo27858c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public c m27866h(CharSequence charSequence) {
            this.f24400e = e.m27868d(charSequence);
            return this;
        }
    }

    /* renamed from: w.i$d */
    public static final class d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m27867a(d dVar) {
            return null;
        }
    }

    /* renamed from: w.i$f */
    public static abstract class f {

        /* renamed from: a */
        public e f24448a;

        /* renamed from: b */
        public CharSequence f24449b;

        /* renamed from: c */
        public CharSequence f24450c;

        /* renamed from: d */
        public boolean f24451d = false;

        /* renamed from: a */
        public void mo27865a(Bundle bundle) {
            if (this.f24451d) {
                bundle.putCharSequence("android.summaryText", this.f24450c);
            }
            CharSequence charSequence = this.f24449b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo27858c = mo27858c();
            if (mo27858c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo27858c);
            }
        }

        /* renamed from: b */
        public abstract void mo27857b(InterfaceC6792h interfaceC6792h);

        /* renamed from: c */
        public abstract String mo27858c();

        /* renamed from: d */
        public RemoteViews m27898d(InterfaceC6792h interfaceC6792h) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m27899e(InterfaceC6792h interfaceC6792h) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m27900f(InterfaceC6792h interfaceC6792h) {
            return null;
        }

        /* renamed from: g */
        public void m27901g(e eVar) {
            if (this.f24448a != eVar) {
                this.f24448a = eVar;
                if (eVar != null) {
                    eVar.m27889v(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m27845a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: b */
    public static Bitmap m27846b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC6700b.f24114b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC6700b.f24113a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    /* renamed from: w.i$e */
    public static class e {

        /* renamed from: A */
        public boolean f24401A;

        /* renamed from: B */
        public boolean f24402B;

        /* renamed from: C */
        public String f24403C;

        /* renamed from: D */
        public Bundle f24404D;

        /* renamed from: E */
        public int f24405E;

        /* renamed from: F */
        public int f24406F;

        /* renamed from: G */
        public Notification f24407G;

        /* renamed from: H */
        public RemoteViews f24408H;

        /* renamed from: I */
        public RemoteViews f24409I;

        /* renamed from: J */
        public RemoteViews f24410J;

        /* renamed from: K */
        public String f24411K;

        /* renamed from: L */
        public int f24412L;

        /* renamed from: M */
        public String f24413M;

        /* renamed from: N */
        public long f24414N;

        /* renamed from: O */
        public int f24415O;

        /* renamed from: P */
        public int f24416P;

        /* renamed from: Q */
        public boolean f24417Q;

        /* renamed from: R */
        public Notification f24418R;

        /* renamed from: S */
        public boolean f24419S;

        /* renamed from: T */
        public Object f24420T;

        /* renamed from: U */
        public ArrayList f24421U;

        /* renamed from: a */
        public Context f24422a;

        /* renamed from: b */
        public ArrayList f24423b;

        /* renamed from: c */
        public ArrayList f24424c;

        /* renamed from: d */
        public ArrayList f24425d;

        /* renamed from: e */
        public CharSequence f24426e;

        /* renamed from: f */
        public CharSequence f24427f;

        /* renamed from: g */
        public PendingIntent f24428g;

        /* renamed from: h */
        public PendingIntent f24429h;

        /* renamed from: i */
        public RemoteViews f24430i;

        /* renamed from: j */
        public IconCompat f24431j;

        /* renamed from: k */
        public CharSequence f24432k;

        /* renamed from: l */
        public int f24433l;

        /* renamed from: m */
        public int f24434m;

        /* renamed from: n */
        public boolean f24435n;

        /* renamed from: o */
        public boolean f24436o;

        /* renamed from: p */
        public f f24437p;

        /* renamed from: q */
        public CharSequence f24438q;

        /* renamed from: r */
        public CharSequence f24439r;

        /* renamed from: s */
        public CharSequence[] f24440s;

        /* renamed from: t */
        public int f24441t;

        /* renamed from: u */
        public int f24442u;

        /* renamed from: v */
        public boolean f24443v;

        /* renamed from: w */
        public String f24444w;

        /* renamed from: x */
        public boolean f24445x;

        /* renamed from: y */
        public String f24446y;

        /* renamed from: z */
        public boolean f24447z;

        /* renamed from: w.i$e$a */
        public static class a {
            /* renamed from: a */
            public static AudioAttributes m27894a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            public static AudioAttributes.Builder m27895b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            public static AudioAttributes.Builder m27896c(AudioAttributes.Builder builder, int i7) {
                return builder.setContentType(i7);
            }

            /* renamed from: d */
            public static AudioAttributes.Builder m27897d(AudioAttributes.Builder builder, int i7) {
                return builder.setUsage(i7);
            }
        }

        public e(Context context, String str) {
            this.f24423b = new ArrayList();
            this.f24424c = new ArrayList();
            this.f24425d = new ArrayList();
            this.f24435n = true;
            this.f24447z = false;
            this.f24405E = 0;
            this.f24406F = 0;
            this.f24412L = 0;
            this.f24415O = 0;
            this.f24416P = 0;
            Notification notification = new Notification();
            this.f24418R = notification;
            this.f24422a = context;
            this.f24411K = str;
            notification.when = System.currentTimeMillis();
            this.f24418R.audioStreamType = -1;
            this.f24434m = 0;
            this.f24421U = new ArrayList();
            this.f24417Q = true;
        }

        /* renamed from: d */
        public static CharSequence m27868d(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public e m27869a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f24423b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification m27870b() {
            return new C6794j(this).m27905c();
        }

        /* renamed from: c */
        public Bundle m27871c() {
            if (this.f24404D == null) {
                this.f24404D = new Bundle();
            }
            return this.f24404D;
        }

        /* renamed from: e */
        public e m27872e(boolean z6) {
            m27880m(16, z6);
            return this;
        }

        /* renamed from: f */
        public e m27873f(String str) {
            this.f24411K = str;
            return this;
        }

        /* renamed from: g */
        public e m27874g(int i7) {
            this.f24405E = i7;
            return this;
        }

        /* renamed from: h */
        public e m27875h(PendingIntent pendingIntent) {
            this.f24428g = pendingIntent;
            return this;
        }

        /* renamed from: i */
        public e m27876i(CharSequence charSequence) {
            this.f24427f = m27868d(charSequence);
            return this;
        }

        /* renamed from: j */
        public e m27877j(CharSequence charSequence) {
            this.f24426e = m27868d(charSequence);
            return this;
        }

        /* renamed from: k */
        public e m27878k(int i7) {
            Notification notification = this.f24418R;
            notification.defaults = i7;
            if ((i7 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: l */
        public e m27879l(PendingIntent pendingIntent) {
            this.f24418R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: m */
        public final void m27880m(int i7, boolean z6) {
            if (z6) {
                Notification notification = this.f24418R;
                notification.flags = i7 | notification.flags;
            } else {
                Notification notification2 = this.f24418R;
                notification2.flags = (~i7) & notification2.flags;
            }
        }

        /* renamed from: n */
        public e m27881n(Bitmap bitmap) {
            this.f24431j = bitmap == null ? null : IconCompat.m11948b(AbstractC6793i.m27846b(this.f24422a, bitmap));
            return this;
        }

        /* renamed from: o */
        public e m27882o(int i7, int i8, int i9) {
            Notification notification = this.f24418R;
            notification.ledARGB = i7;
            notification.ledOnMS = i8;
            notification.ledOffMS = i9;
            notification.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: p */
        public e m27883p(boolean z6) {
            this.f24447z = z6;
            return this;
        }

        /* renamed from: q */
        public e m27884q(int i7) {
            this.f24433l = i7;
            return this;
        }

        /* renamed from: r */
        public e m27885r(int i7) {
            this.f24434m = i7;
            return this;
        }

        /* renamed from: s */
        public e m27886s(boolean z6) {
            this.f24435n = z6;
            return this;
        }

        /* renamed from: t */
        public e m27887t(int i7) {
            this.f24418R.icon = i7;
            return this;
        }

        /* renamed from: u */
        public e m27888u(Uri uri) {
            Notification notification = this.f24418R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder m27897d = a.m27897d(a.m27896c(a.m27895b(), 4), 5);
            this.f24418R.audioAttributes = a.m27894a(m27897d);
            return this;
        }

        /* renamed from: v */
        public e m27889v(f fVar) {
            if (this.f24437p != fVar) {
                this.f24437p = fVar;
                if (fVar != null) {
                    fVar.m27901g(this);
                }
            }
            return this;
        }

        /* renamed from: w */
        public e m27890w(CharSequence charSequence) {
            this.f24418R.tickerText = m27868d(charSequence);
            return this;
        }

        /* renamed from: x */
        public e m27891x(long[] jArr) {
            this.f24418R.vibrate = jArr;
            return this;
        }

        /* renamed from: y */
        public e m27892y(int i7) {
            this.f24406F = i7;
            return this;
        }

        /* renamed from: z */
        public e m27893z(long j7) {
            this.f24418R.when = j7;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
