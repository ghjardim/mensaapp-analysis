package p166X4;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p166X4.AbstractC2834q;

/* renamed from: X4.c */
/* loaded from: classes2.dex */
public class C2820c {

    /* renamed from: a */
    public final Context f8695a;

    /* renamed from: X4.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8696a;

        static {
            int[] iArr = new int[b.values().length];
            f8696a = iArr;
            try {
                iArr[b.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8696a[b.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: X4.c$b */
    public enum b {
        IMAGE,
        VIDEO
    }

    public C2820c(Context context) {
        this.f8695a = context;
    }

    /* renamed from: a */
    public void m10084a() {
        this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    /* renamed from: b */
    public Map m10085b() {
        Set<String> stringSet;
        HashMap hashMap = new HashMap();
        boolean z6 = false;
        SharedPreferences sharedPreferences = this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z7 = true;
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
            hashMap.put("pathList", new ArrayList(stringSet));
            z6 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            AbstractC2834q.a.C7189a c7189a = new AbstractC2834q.a.C7189a();
            c7189a.m10194b(sharedPreferences.getString("flutter_image_picker_error_code", StringUtils.EMPTY));
            if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                c7189a.m10195c(sharedPreferences.getString("flutter_image_picker_error_message", StringUtils.EMPTY));
            }
            hashMap.put("error", c7189a.m10193a());
        } else {
            z7 = z6;
        }
        if (z7) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                hashMap.put("type", sharedPreferences.getString("flutter_image_picker_type", StringUtils.EMPTY).equals("video") ? AbstractC2834q.c.VIDEO : AbstractC2834q.c.IMAGE);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        return hashMap;
    }

    /* renamed from: c */
    public String m10086c() {
        return this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY);
    }

    /* renamed from: d */
    public void m10087d(AbstractC2834q.g gVar) {
        SharedPreferences.Editor edit = this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (gVar.m10216c() != null) {
            edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(gVar.m10216c().doubleValue()));
        }
        if (gVar.m10215b() != null) {
            edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(gVar.m10215b().doubleValue()));
        }
        edit.putInt("flutter_image_picker_image_quality", gVar.m10217d().intValue());
        edit.apply();
    }

    /* renamed from: e */
    public void m10088e(Uri uri) {
        this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    /* renamed from: f */
    public void m10089f(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    /* renamed from: g */
    public void m10090g(b bVar) {
        int i7 = a.f8696a[bVar.ordinal()];
        if (i7 == 1) {
            m10091h("image");
        } else {
            if (i7 != 2) {
                return;
            }
            m10091h("video");
        }
    }

    /* renamed from: h */
    public final void m10091h(String str) {
        this.f8695a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", str).apply();
    }
}
