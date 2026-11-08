package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.plugin.platform.C4767i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.tika.mime.MimeTypes;
import p049H.C0508e0;
import p054H4.C0579o;
import p191b.InterfaceC3502z;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.plugin.platform.i */
/* loaded from: classes.dex */
public class C4767i {

    /* renamed from: a */
    public final Activity f17569a;

    /* renamed from: b */
    public final C0579o f17570b;

    /* renamed from: c */
    public final d f17571c;

    /* renamed from: d */
    public C0579o.j f17572d;

    /* renamed from: e */
    public int f17573e;

    /* renamed from: f */
    public final C0579o.h f17574f;

    /* renamed from: io.flutter.plugin.platform.i$a */
    public class a implements C0579o.h {
        public a() {
        }

        @Override // p054H4.C0579o.h
        /* renamed from: b */
        public void mo2236b() {
            C4767i.this.m20535t();
        }

        @Override // p054H4.C0579o.h
        /* renamed from: f */
        public void mo2237f(boolean z6) {
            C4767i.this.m20538w(z6);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: g */
        public void mo2238g(C0579o.k kVar) {
            C4767i.this.m20541z(kVar);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: h */
        public void mo2239h(List list) {
            C4767i.this.m20525A(list);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: i */
        public void mo2240i(C0579o.g gVar) {
            C4767i.this.m20530F(gVar);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: j */
        public void mo2241j(String str) {
            C4767i.this.m20537v(str);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: k */
        public void mo2242k(String str) {
            C4767i.this.m20528D(str);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: l */
        public void mo2243l(C0579o.i iVar) {
            C4767i.this.m20534s(iVar);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: m */
        public void mo2244m() {
            C4767i.this.m20540y();
        }

        @Override // p054H4.C0579o.h
        /* renamed from: n */
        public void mo2245n() {
            C4767i.this.m20536u();
        }

        @Override // p054H4.C0579o.h
        /* renamed from: o */
        public void mo2246o(int i7) {
            C4767i.this.m20526B(i7);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: p */
        public CharSequence mo2247p(C0579o.e eVar) {
            return C4767i.this.m20533r(eVar);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: q */
        public boolean mo2248q() {
            return C4767i.this.m20531p();
        }

        @Override // p054H4.C0579o.h
        /* renamed from: r */
        public void mo2249r(C0579o.j jVar) {
            C4767i.this.m20527C(jVar);
        }

        @Override // p054H4.C0579o.h
        /* renamed from: s */
        public void mo2250s(C0579o.c cVar) {
            C4767i.this.m20539x(cVar);
        }
    }

    /* renamed from: io.flutter.plugin.platform.i$b */
    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f17576a;

        public b(View view) {
            this.f17576a = view;
        }

        /* renamed from: b */
        public final /* synthetic */ void m20543b(int i7) {
            if ((i7 & 4) == 0) {
                C4767i.this.f17570b.m2227m(true);
            } else {
                C4767i.this.f17570b.m2227m(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i7) {
            this.f17576a.post(new Runnable() { // from class: io.flutter.plugin.platform.j
                @Override // java.lang.Runnable
                public final void run() {
                    C4767i.b.this.m20543b(i7);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugin.platform.i$c */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17578a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f17579b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f17580c;

        static {
            int[] iArr = new int[C0579o.d.values().length];
            f17580c = iArr;
            try {
                iArr[C0579o.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17580c[C0579o.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C0579o.l.values().length];
            f17579b = iArr2;
            try {
                iArr2[C0579o.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17579b[C0579o.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[C0579o.g.values().length];
            f17578a = iArr3;
            try {
                iArr3[C0579o.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17578a[C0579o.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17578a[C0579o.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17578a[C0579o.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17578a[C0579o.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.i$d */
    public interface d {
        /* renamed from: b */
        boolean mo20544b();

        /* renamed from: f */
        void mo20545f(boolean z6);
    }

    public C4767i(Activity activity, C0579o c0579o, d dVar) {
        a aVar = new a();
        this.f17574f = aVar;
        this.f17569a = activity;
        this.f17570b = c0579o;
        c0579o.m2226l(aVar);
        this.f17571c = dVar;
        this.f17573e = 1280;
    }

    /* renamed from: A */
    public final void m20525A(List list) {
        int i7 = list.size() == 0 ? 5894 : 1798;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int i9 = c.f17579b[((C0579o.l) list.get(i8)).ordinal()];
            if (i9 == 1) {
                i7 &= -5;
            } else if (i9 == 2) {
                i7 &= -515;
            }
        }
        this.f17573e = i7;
        m20529E();
    }

    /* renamed from: B */
    public final void m20526B(int i7) {
        this.f17569a.setRequestedOrientation(i7);
    }

    /* renamed from: C */
    public final void m20527C(C0579o.j jVar) {
        Window window = this.f17569a.getWindow();
        C0508e0 c0508e0 = new C0508e0(window, window.getDecorView());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        C0579o.d dVar = jVar.f1921b;
        if (dVar != null) {
            int i8 = c.f17580c[dVar.ordinal()];
            if (i8 == 1) {
                c0508e0.m1936b(true);
            } else if (i8 == 2) {
                c0508e0.m1936b(false);
            }
        }
        Integer num = jVar.f1920a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = jVar.f1922c;
        if (bool != null && i7 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i7 >= 26) {
            C0579o.d dVar2 = jVar.f1924e;
            if (dVar2 != null) {
                int i9 = c.f17580c[dVar2.ordinal()];
                if (i9 == 1) {
                    c0508e0.m1935a(true);
                } else if (i9 == 2) {
                    c0508e0.m1935a(false);
                }
            }
            Integer num2 = jVar.f1923d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f1925f;
        if (num3 != null && i7 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f1926g;
        if (bool2 != null && i7 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f17572d = jVar;
    }

    /* renamed from: D */
    public final void m20528D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f17569a.startActivity(Intent.createChooser(intent, null));
    }

    /* renamed from: E */
    public void m20529E() {
        this.f17569a.getWindow().getDecorView().setSystemUiVisibility(this.f17573e);
        C0579o.j jVar = this.f17572d;
        if (jVar != null) {
            m20527C(jVar);
        }
    }

    /* renamed from: F */
    public void m20530F(C0579o.g gVar) {
        View decorView = this.f17569a.getWindow().getDecorView();
        int i7 = c.f17578a[gVar.ordinal()];
        if (i7 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i7 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i7 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i7 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i7 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    /* renamed from: p */
    public final boolean m20531p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f17569a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* renamed from: q */
    public void m20532q() {
        this.f17570b.m2226l(null);
    }

    /* renamed from: r */
    public final CharSequence m20533r(C0579o.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f17569a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != C0579o.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            AbstractC6917b.m28359g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            AbstractC6917b.m28359g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        AssetFileDescriptor openTypedAssetFileDescriptor = this.f17569a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.f17569a);
                        if (openTypedAssetFileDescriptor != null) {
                            openTypedAssetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        e = e7;
                        charSequence = text;
                        AbstractC6917b.m28360h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                }
                return text;
            } catch (IOException e8) {
                e = e8;
            }
        } catch (FileNotFoundException unused) {
            AbstractC6917b.m28359g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e9) {
            AbstractC6917b.m28360h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e9);
            return null;
        }
    }

    /* renamed from: s */
    public final void m20534s(C0579o.i iVar) {
        if (iVar == C0579o.i.CLICK) {
            this.f17569a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final void m20535t() {
        d dVar = this.f17571c;
        if (dVar == null || !dVar.mo20544b()) {
            Activity activity = this.f17569a;
            if (activity instanceof InterfaceC3502z) {
                ((InterfaceC3502z) activity).mo9943h().m14061k();
            } else {
                activity.finish();
            }
        }
    }

    /* renamed from: u */
    public final void m20536u() {
        m20529E();
    }

    /* renamed from: v */
    public final void m20537v(String str) {
        ((ClipboardManager) this.f17569a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* renamed from: w */
    public final void m20538w(boolean z6) {
        d dVar = this.f17571c;
        if (dVar != null) {
            dVar.mo20545f(z6);
        }
    }

    /* renamed from: x */
    public final void m20539x(C0579o.c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f17569a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f1895b, (Bitmap) null, cVar.f1894a));
            return;
        }
        AbstractC4766h.m20509a();
        this.f17569a.setTaskDescription(AbstractC4765g.m20508a(cVar.f1895b, 0, cVar.f1894a));
    }

    /* renamed from: y */
    public final void m20540y() {
        View decorView = this.f17569a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* renamed from: z */
    public final void m20541z(C0579o.k kVar) {
        int i7;
        if (kVar == C0579o.k.LEAN_BACK) {
            i7 = 1798;
        } else if (kVar == C0579o.k.IMMERSIVE) {
            i7 = 3846;
        } else if (kVar == C0579o.k.IMMERSIVE_STICKY) {
            i7 = 5894;
        } else if (kVar != C0579o.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i7 = 1792;
        }
        this.f17573e = i7;
        m20529E();
    }
}
