package p012B4;

import org.apache.tika.utils.StringUtils;

/* renamed from: B4.b */
/* loaded from: classes.dex */
public final class C0051b {

    /* renamed from: a */
    public final String f176a;

    /* renamed from: b */
    public final String f177b;

    /* renamed from: c */
    public final String f178c;

    /* renamed from: d */
    public final String f179d;

    /* renamed from: e */
    public final String f180e;

    /* renamed from: f */
    public final String f181f;

    /* renamed from: g */
    public final boolean f182g;

    public C0051b(String str, String str2, String str3, String str4, String str5, String str6, boolean z6) {
        this.f176a = str == null ? "libapp.so" : str;
        this.f177b = str2 == null ? "vm_snapshot_data" : str2;
        this.f178c = str3 == null ? "isolate_snapshot_data" : str3;
        this.f179d = str4 == null ? "flutter_assets" : str4;
        this.f181f = str6;
        this.f180e = str5 == null ? StringUtils.EMPTY : str5;
        this.f182g = z6;
    }
}
