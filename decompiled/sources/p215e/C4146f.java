package p215e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p207d.C4098h;
import p215e.AbstractC4141a;
import p371w5.C6925h;
import p378x5.AbstractC7032w;

/* renamed from: e.f */
/* loaded from: classes.dex */
public class C4146f extends AbstractC4141a {

    /* renamed from: a */
    public static final a f13881a = new a(null);

    /* renamed from: e.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final ResolveInfo m17402a(Context context) {
            AbstractC5469l.m23028e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: b */
        public final ResolveInfo m17403b(Context context) {
            AbstractC5469l.m23028e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: c */
        public final String m17404c(e input) {
            AbstractC5469l.m23028e(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof d) {
                return "video/*";
            }
            if (input instanceof b) {
                return null;
            }
            throw new C6925h();
        }

        /* renamed from: d */
        public final boolean m17405d(Context context) {
            AbstractC5469l.m23028e(context, "context");
            return m17402a(context) != null;
        }

        /* renamed from: e */
        public final boolean m17406e(Context context) {
            AbstractC5469l.m23028e(context, "context");
            return m17403b(context) != null;
        }

        /* renamed from: f */
        public final boolean m17407f() {
            int extensionVersion;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                return true;
            }
            if (i7 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion >= 2) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    /* renamed from: e.f$b */
    public static final class b implements e {

        /* renamed from: a */
        public static final b f13882a = new b();
    }

    /* renamed from: e.f$c */
    public static final class c implements e {

        /* renamed from: a */
        public static final c f13883a = new c();
    }

    /* renamed from: e.f$d */
    public static final class d implements e {

        /* renamed from: a */
        public static final d f13884a = new d();
    }

    /* renamed from: e.f$e */
    public interface e {
    }

    /* renamed from: f */
    public static final boolean m17398f() {
        return f13881a.m17407f();
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo9533a(Context context, C4098h input) {
        Intent intent;
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        a aVar = f13881a;
        if (aVar.m17407f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.m17404c(input.m17187a()));
            return intent2;
        }
        if (aVar.m17406e(context)) {
            ResolveInfo m17403b = aVar.m17403b(context);
            if (m17403b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = m17403b.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(aVar.m17404c(input.m17187a()));
        } else {
            if (!aVar.m17405d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.m17404c(input.m17187a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo m17402a = aVar.m17402a(context);
            if (m17402a == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = m17402a.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.setType(aVar.m17404c(input.m17187a()));
        }
        return intent;
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC4141a.a mo17390b(Context context, C4098h input) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        return null;
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Uri mo9534c(int i7, Intent intent) {
        if (i7 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) AbstractC7032w.m28900y(AbstractC4142b.f13878a.m17392a(intent));
        }
        return data;
    }
}
