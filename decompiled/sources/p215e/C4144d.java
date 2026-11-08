package p215e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p207d.C4098h;
import p215e.AbstractC4141a;
import p215e.C4146f;
import p378x5.AbstractC7024o;

/* renamed from: e.d */
/* loaded from: classes.dex */
public class C4144d extends AbstractC4141a {

    /* renamed from: b */
    public static final a f13879b = new a(null);

    /* renamed from: a */
    public final int f13880a;

    /* renamed from: e.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    public C4144d(int i7) {
        this.f13880a = i7;
        if (i7 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo9533a(Context context, C4098h input) {
        int pickImagesMaxLimit;
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        C4146f.a aVar = C4146f.f13881a;
        if (aVar.m17407f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.m17404c(input.m17187a()));
            int i7 = this.f13880a;
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            if (i7 > pickImagesMaxLimit) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f13880a);
            return intent;
        }
        if (aVar.m17406e(context)) {
            ResolveInfo m17403b = aVar.m17403b(context);
            if (m17403b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = m17403b.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.m17404c(input.m17187a()));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.f13880a);
            return intent2;
        }
        if (aVar.m17405d(context)) {
            ResolveInfo m17402a = aVar.m17402a(context);
            if (m17402a == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = m17402a.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f13880a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.m17404c(input.m17187a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC4141a.a mo17390b(Context context, C4098h input) {
        AbstractC5469l.m23028e(context, "context");
        AbstractC5469l.m23028e(input, "input");
        return null;
    }

    @Override // p215e.AbstractC4141a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List mo9534c(int i7, Intent intent) {
        List m17392a;
        if (i7 != -1) {
            intent = null;
        }
        return (intent == null || (m17392a = AbstractC4142b.f13878a.m17392a(intent)) == null) ? AbstractC7024o.m28861g() : m17392a;
    }
}
