package p173Y4;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p026D4.InterfaceC0191a;
import p061I4.InterfaceC0651c;
import p173Y4.AbstractC2954i;
import p221e5.AbstractC4200c;

/* renamed from: Y4.j */
/* loaded from: classes2.dex */
public class C2955j implements InterfaceC0191a, AbstractC2954i.a {

    /* renamed from: c */
    public Context f9078c;

    /* renamed from: Y4.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9079a;

        static {
            int[] iArr = new int[AbstractC2954i.b.values().length];
            f9079a = iArr;
            try {
                iArr[AbstractC2954i.b.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9079a[AbstractC2954i.b.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9079a[AbstractC2954i.b.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9079a[AbstractC2954i.b.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9079a[AbstractC2954i.b.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9079a[AbstractC2954i.b.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9079a[AbstractC2954i.b.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9079a[AbstractC2954i.b.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9079a[AbstractC2954i.b.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9079a[AbstractC2954i.b.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9079a[AbstractC2954i.b.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: C */
    public void mo782C(InterfaceC0191a.b bVar) {
        m10654o(bVar.m786b(), bVar.m785a());
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: a */
    public List mo10639a() {
        return m10649j();
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: b */
    public String mo10640b() {
        return m10651l();
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: c */
    public String mo10641c() {
        return m10652m();
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: d */
    public String mo10642d() {
        return this.f9078c.getCacheDir().getPath();
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: e */
    public String mo10643e() {
        return m10648i();
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: f */
    public String mo10644f() {
        return m10647h();
    }

    @Override // p173Y4.AbstractC2954i.a
    /* renamed from: g */
    public List mo10645g(AbstractC2954i.b bVar) {
        return m10650k(bVar);
    }

    /* renamed from: h */
    public final String m10647h() {
        return AbstractC4200c.m17614d(this.f9078c);
    }

    /* renamed from: i */
    public final String m10648i() {
        return AbstractC4200c.m17613c(this.f9078c);
    }

    /* renamed from: j */
    public final List m10649j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f9078c.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public final List m10650k(AbstractC2954i.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f9078c.getExternalFilesDirs(m10653n(bVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final String m10651l() {
        File externalFilesDir = this.f9078c.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: m */
    public final String m10652m() {
        return this.f9078c.getCacheDir().getPath();
    }

    /* renamed from: n */
    public final String m10653n(AbstractC2954i.b bVar) {
        switch (a.f9079a[bVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + bVar);
        }
    }

    /* renamed from: o */
    public final void m10654o(InterfaceC0651c interfaceC0651c, Context context) {
        try {
            AbstractC2953h.m10637i(interfaceC0651c, this);
        } catch (Exception e7) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e7);
        }
        this.f9078c = context;
    }

    @Override // p026D4.InterfaceC0191a
    /* renamed from: y */
    public void mo783y(InterfaceC0191a.b bVar) {
        AbstractC2953h.m10637i(bVar.m786b(), null);
    }
}
