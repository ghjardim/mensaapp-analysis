package io.flutter.view;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.plugin.platform.InterfaceC4777s;
import io.flutter.view.C4804i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import p054H4.C0565a;
import p221e5.AbstractC4206i;
import p221e5.InterfaceC4202e;
import p370w4.AbstractC6917b;

/* renamed from: io.flutter.view.i */
/* loaded from: classes2.dex */
public class C4804i extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final View f17691a;

    /* renamed from: b */
    public final C0565a f17692b;

    /* renamed from: c */
    public final AccessibilityManager f17693c;

    /* renamed from: d */
    public final AccessibilityViewEmbedder f17694d;

    /* renamed from: e */
    public final InterfaceC4777s f17695e;

    /* renamed from: f */
    public final ContentResolver f17696f;

    /* renamed from: g */
    public final Map f17697g;

    /* renamed from: h */
    public final Map f17698h;

    /* renamed from: i */
    public l f17699i;

    /* renamed from: j */
    public Integer f17700j;

    /* renamed from: k */
    public Integer f17701k;

    /* renamed from: l */
    public int f17702l;

    /* renamed from: m */
    public l f17703m;

    /* renamed from: n */
    public l f17704n;

    /* renamed from: o */
    public l f17705o;

    /* renamed from: p */
    public final List f17706p;

    /* renamed from: q */
    public int f17707q;

    /* renamed from: r */
    public Integer f17708r;

    /* renamed from: s */
    public k f17709s;

    /* renamed from: t */
    public boolean f17710t;

    /* renamed from: u */
    public boolean f17711u;

    /* renamed from: v */
    public final C0565a.b f17712v;

    /* renamed from: w */
    public final AccessibilityManager.AccessibilityStateChangeListener f17713w;

    /* renamed from: x */
    public final AccessibilityManager.TouchExplorationStateChangeListener f17714x;

    /* renamed from: y */
    public final ContentObserver f17715y;

    /* renamed from: z */
    public static final int f17690z = ((g.SCROLL_RIGHT.f17756a | g.SCROLL_LEFT.f17756a) | g.SCROLL_UP.f17756a) | g.SCROLL_DOWN.f17756a;

    /* renamed from: A */
    public static final int f17687A = ((((((((((i.HAS_CHECKED_STATE.f17794a | i.IS_CHECKED.f17794a) | i.IS_SELECTED.f17794a) | i.IS_TEXT_FIELD.f17794a) | i.IS_FOCUSED.f17794a) | i.HAS_ENABLED_STATE.f17794a) | i.IS_ENABLED.f17794a) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f17794a) | i.HAS_TOGGLED_STATE.f17794a) | i.IS_TOGGLED.f17794a) | i.IS_FOCUSABLE.f17794a) | i.IS_SLIDER.f17794a;

    /* renamed from: B */
    public static int f17688B = 267386881;

    /* renamed from: C */
    public static int f17689C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f17756a & g.DID_LOSE_ACCESSIBILITY_FOCUS.f17756a) & g.SHOW_ON_SCREEN.f17756a;

    /* renamed from: io.flutter.view.i$a */
    public class a implements C0565a.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.InterfaceC4656a
        /* renamed from: a */
        public void mo20189a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            C4804i.this.m20734d0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.InterfaceC4656a
        /* renamed from: b */
        public void mo20190b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            C4804i.this.m20733c0(byteBuffer, strArr);
        }

        @Override // p054H4.C0565a.b
        /* renamed from: c */
        public void mo2171c(int i7) {
            C4804i.this.m20724T(i7, 1);
        }

        @Override // p054H4.C0565a.b
        /* renamed from: d */
        public void mo2172d(String str) {
            if (Build.VERSION.SDK_INT >= 36) {
                AbstractC6917b.m28359g("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
            }
            C4804i.this.f17691a.announceForAccessibility(str);
        }

        @Override // p054H4.C0565a.b
        /* renamed from: e */
        public void mo2173e(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent m20713I = C4804i.this.m20713I(0, 32);
            m20713I.getText().add(str);
            C4804i.this.m20725U(m20713I);
        }

        @Override // p054H4.C0565a.b
        /* renamed from: f */
        public void mo2174f(int i7) {
            C4804i.this.m20724T(i7, 8);
        }

        @Override // p054H4.C0565a.b
        /* renamed from: g */
        public void mo2175g(int i7) {
            C4804i.this.m20724T(i7, 2);
        }
    }

    /* renamed from: io.flutter.view.i$b */
    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z6) {
            if (C4804i.this.f17711u) {
                return;
            }
            if (z6) {
                C4804i.this.f17692b.m2169g(C4804i.this.f17712v);
                C4804i.this.f17692b.m2167e();
            } else {
                C4804i.this.m20729Y(false);
                C4804i.this.f17692b.m2169g(null);
                C4804i.this.f17692b.m2166d();
            }
            if (C4804i.this.f17709s != null) {
                C4804i.this.f17709s.mo20755a(z6, C4804i.this.f17693c.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.i$c */
    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            onChange(z6, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6, Uri uri) {
            if (C4804i.this.f17711u) {
                return;
            }
            if (Settings.Global.getFloat(C4804i.this.f17696f, "transition_animation_scale", 1.0f) == 0.0f) {
                C4804i.m20692f(C4804i.this, f.DISABLE_ANIMATIONS.f17730a);
            } else {
                C4804i.m20691e(C4804i.this, ~f.DISABLE_ANIMATIONS.f17730a);
            }
            C4804i.this.m20726V();
        }
    }

    /* renamed from: io.flutter.view.i$d */
    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ AccessibilityManager f17719a;

        public d(AccessibilityManager accessibilityManager) {
            this.f17719a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            if (C4804i.this.f17711u) {
                return;
            }
            if (!z6) {
                C4804i.this.m20729Y(false);
                C4804i.this.m20718N();
            }
            if (C4804i.this.f17709s != null) {
                C4804i.this.f17709s.mo20755a(this.f17719a.isEnabled(), z6);
            }
        }
    }

    /* renamed from: io.flutter.view.i$e */
    public static /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17721a;

        static {
            int[] iArr = new int[o.values().length];
            f17721a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17721a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17721a[o.URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: io.flutter.view.i$f */
    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* renamed from: a */
        public final int f17730a;

        f(int i7) {
            this.f17730a = i7;
        }
    }

    /* renamed from: io.flutter.view.i$g */
    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608);


        /* renamed from: a */
        public final int f17756a;

        g(int i7) {
            this.f17756a = i7;
        }
    }

    /* renamed from: io.flutter.view.i$h */
    public static class h {

        /* renamed from: a */
        public int f17757a = -1;

        /* renamed from: b */
        public int f17758b = -1;

        /* renamed from: c */
        public int f17759c = -1;

        /* renamed from: d */
        public String f17760d;

        /* renamed from: e */
        public String f17761e;
    }

    /* renamed from: io.flutter.view.i$i */
    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(268435456),
        HAS_REQUIRED_STATE(536870912),
        IS_REQUIRED(1073741824);


        /* renamed from: a */
        public final int f17794a;

        i(int i7) {
            this.f17794a = i7;
        }
    }

    /* renamed from: io.flutter.view.i$j */
    public static class j extends n {

        /* renamed from: d */
        public String f17795d;

        public j() {
            super(null);
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.i$k */
    public interface k {
        /* renamed from: a */
        void mo20755a(boolean z6, boolean z7);
    }

    /* renamed from: io.flutter.view.i$l */
    public static class l {

        /* renamed from: A */
        public String f17796A;

        /* renamed from: C */
        public p f17798C;

        /* renamed from: E */
        public int f17800E;

        /* renamed from: F */
        public int f17801F;

        /* renamed from: G */
        public int f17802G;

        /* renamed from: H */
        public int f17803H;

        /* renamed from: I */
        public float f17804I;

        /* renamed from: J */
        public float f17805J;

        /* renamed from: K */
        public float f17806K;

        /* renamed from: L */
        public String f17807L;

        /* renamed from: M */
        public String f17808M;

        /* renamed from: N */
        public float f17809N;

        /* renamed from: O */
        public float f17810O;

        /* renamed from: P */
        public float f17811P;

        /* renamed from: Q */
        public float f17812Q;

        /* renamed from: R */
        public float[] f17813R;

        /* renamed from: S */
        public l f17814S;

        /* renamed from: V */
        public List f17817V;

        /* renamed from: W */
        public h f17818W;

        /* renamed from: X */
        public h f17819X;

        /* renamed from: Z */
        public float[] f17821Z;

        /* renamed from: a */
        public final C4804i f17822a;

        /* renamed from: b0 */
        public float[] f17825b0;

        /* renamed from: c */
        public int f17826c;

        /* renamed from: c0 */
        public Rect f17827c0;

        /* renamed from: d */
        public int f17828d;

        /* renamed from: e */
        public int f17829e;

        /* renamed from: f */
        public int f17830f;

        /* renamed from: g */
        public int f17831g;

        /* renamed from: h */
        public int f17832h;

        /* renamed from: i */
        public int f17833i;

        /* renamed from: j */
        public int f17834j;

        /* renamed from: k */
        public int f17835k;

        /* renamed from: l */
        public float f17836l;

        /* renamed from: m */
        public float f17837m;

        /* renamed from: n */
        public float f17838n;

        /* renamed from: o */
        public String f17839o;

        /* renamed from: p */
        public String f17840p;

        /* renamed from: q */
        public List f17841q;

        /* renamed from: r */
        public String f17842r;

        /* renamed from: s */
        public List f17843s;

        /* renamed from: t */
        public String f17844t;

        /* renamed from: u */
        public List f17845u;

        /* renamed from: v */
        public String f17846v;

        /* renamed from: w */
        public List f17847w;

        /* renamed from: x */
        public String f17848x;

        /* renamed from: y */
        public List f17849y;

        /* renamed from: z */
        public String f17850z;

        /* renamed from: b */
        public int f17824b = -1;

        /* renamed from: B */
        public int f17797B = -1;

        /* renamed from: D */
        public boolean f17799D = false;

        /* renamed from: T */
        public List f17815T = new ArrayList();

        /* renamed from: U */
        public List f17816U = new ArrayList();

        /* renamed from: Y */
        public boolean f17820Y = true;

        /* renamed from: a0 */
        public boolean f17823a0 = true;

        public l(C4804i c4804i) {
            this.f17822a = c4804i;
        }

        /* renamed from: C0 */
        public static boolean m20759C0(l lVar, InterfaceC4202e interfaceC4202e) {
            return (lVar == null || lVar.m20825l0(interfaceC4202e) == null) ? false : true;
        }

        /* renamed from: n */
        public static /* synthetic */ int m20802n(l lVar, int i7) {
            int i8 = lVar.f17832h + i7;
            lVar.f17832h = i8;
            return i8;
        }

        /* renamed from: o */
        public static /* synthetic */ int m20803o(l lVar, int i7) {
            int i8 = lVar.f17832h - i7;
            lVar.f17832h = i8;
            return i8;
        }

        /* renamed from: A0 */
        public final float m20815A0(float f7, float f8, float f9, float f10) {
            return Math.max(f7, Math.max(f8, Math.max(f9, f10)));
        }

        /* renamed from: B0 */
        public final float m20816B0(float f7, float f8, float f9, float f10) {
            return Math.min(f7, Math.min(f8, Math.min(f9, f10)));
        }

        /* renamed from: D0 */
        public final void m20817D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f7 = fArr[3];
            fArr[0] = fArr[0] / f7;
            fArr[1] = fArr[1] / f7;
            fArr[2] = fArr[2] / f7;
            fArr[3] = 0.0f;
        }

        /* renamed from: E0 */
        public final void m20818E0(float[] fArr, Set set, boolean z6) {
            set.add(this);
            if (this.f17823a0) {
                z6 = true;
            }
            if (z6) {
                if (this.f17825b0 == null) {
                    this.f17825b0 = new float[16];
                }
                if (this.f17813R == null) {
                    this.f17813R = new float[16];
                }
                Matrix.multiplyMM(this.f17825b0, 0, fArr, 0, this.f17813R, 0);
                float[] fArr2 = {this.f17809N, this.f17810O, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                m20817D0(fArr3, this.f17825b0, fArr2);
                fArr2[0] = this.f17811P;
                fArr2[1] = this.f17810O;
                m20817D0(fArr4, this.f17825b0, fArr2);
                fArr2[0] = this.f17811P;
                fArr2[1] = this.f17812Q;
                m20817D0(fArr5, this.f17825b0, fArr2);
                fArr2[0] = this.f17809N;
                fArr2[1] = this.f17812Q;
                m20817D0(fArr6, this.f17825b0, fArr2);
                if (this.f17827c0 == null) {
                    this.f17827c0 = new Rect();
                }
                this.f17827c0.set(Math.round(m20816B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m20816B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(m20815A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(m20815A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f17823a0 = false;
            }
            int i7 = -1;
            for (l lVar : this.f17815T) {
                lVar.f17797B = i7;
                i7 = lVar.f17824b;
                lVar.m20818E0(this.f17825b0, set, z6);
            }
        }

        /* renamed from: F0 */
        public final void m20819F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f17799D = true;
            this.f17807L = this.f17842r;
            this.f17808M = this.f17840p;
            this.f17800E = this.f17826c;
            this.f17801F = this.f17828d;
            this.f17802G = this.f17831g;
            this.f17803H = this.f17832h;
            this.f17804I = this.f17836l;
            this.f17805J = this.f17837m;
            this.f17806K = this.f17838n;
            this.f17826c = byteBuffer.getInt();
            this.f17828d = byteBuffer.getInt();
            this.f17829e = byteBuffer.getInt();
            this.f17830f = byteBuffer.getInt();
            this.f17831g = byteBuffer.getInt();
            this.f17832h = byteBuffer.getInt();
            this.f17833i = byteBuffer.getInt();
            this.f17834j = byteBuffer.getInt();
            this.f17835k = byteBuffer.getInt();
            this.f17836l = byteBuffer.getFloat();
            this.f17837m = byteBuffer.getFloat();
            this.f17838n = byteBuffer.getFloat();
            int i7 = byteBuffer.getInt();
            this.f17839o = i7 == -1 ? null : strArr[i7];
            int i8 = byteBuffer.getInt();
            this.f17840p = i8 == -1 ? null : strArr[i8];
            this.f17841q = m20830q0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f17842r = i9 == -1 ? null : strArr[i9];
            this.f17843s = m20830q0(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            this.f17844t = i10 == -1 ? null : strArr[i10];
            this.f17845u = m20830q0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f17846v = i11 == -1 ? null : strArr[i11];
            this.f17847w = m20830q0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f17848x = i12 == -1 ? null : strArr[i12];
            this.f17849y = m20830q0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f17850z = i13 == -1 ? null : strArr[i13];
            int i14 = byteBuffer.getInt();
            this.f17796A = i14 == -1 ? null : strArr[i14];
            this.f17798C = p.m20842f(byteBuffer.getInt());
            this.f17809N = byteBuffer.getFloat();
            this.f17810O = byteBuffer.getFloat();
            this.f17811P = byteBuffer.getFloat();
            this.f17812Q = byteBuffer.getFloat();
            if (this.f17813R == null) {
                this.f17813R = new float[16];
            }
            for (int i15 = 0; i15 < 16; i15++) {
                this.f17813R[i15] = byteBuffer.getFloat();
            }
            this.f17820Y = true;
            this.f17823a0 = true;
            int i16 = byteBuffer.getInt();
            this.f17815T.clear();
            this.f17816U.clear();
            for (int i17 = 0; i17 < i16; i17++) {
                l m20741z = this.f17822a.m20741z(byteBuffer.getInt());
                m20741z.f17814S = this;
                this.f17815T.add(m20741z);
            }
            for (int i18 = 0; i18 < i16; i18++) {
                l m20741z2 = this.f17822a.m20741z(byteBuffer.getInt());
                m20741z2.f17814S = this;
                this.f17816U.add(m20741z2);
            }
            int i19 = byteBuffer.getInt();
            if (i19 == 0) {
                this.f17817V = null;
                return;
            }
            List list = this.f17817V;
            if (list == null) {
                this.f17817V = new ArrayList(i19);
            } else {
                list.clear();
            }
            for (int i20 = 0; i20 < i19; i20++) {
                h m20740y = this.f17822a.m20740y(byteBuffer.getInt());
                if (m20740y.f17759c == g.TAP.f17756a) {
                    this.f17818W = m20740y;
                } else if (m20740y.f17759c == g.LONG_PRESS.f17756a) {
                    this.f17819X = m20740y;
                } else {
                    this.f17817V.add(m20740y);
                }
                this.f17817V.add(m20740y);
            }
        }

        /* renamed from: g0 */
        public final void m20820g0(List list) {
            if (m20837x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = this.f17815T.iterator();
            while (it.hasNext()) {
                ((l) it.next()).m20820g0(list);
            }
        }

        /* renamed from: h0 */
        public final SpannableString m20821h0(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    int i7 = e.f17721a[nVar.f17853c.ordinal()];
                    if (i7 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f17851a, nVar.f17852b, 0);
                    } else if (i7 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f17795d)), nVar.f17851a, nVar.f17852b, 0);
                    } else if (i7 == 3) {
                        spannableString.setSpan(new URLSpan(((q) nVar).f17862d), nVar.f17851a, nVar.f17852b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* renamed from: i0 */
        public final boolean m20822i0() {
            String str;
            String str2 = this.f17840p;
            if (str2 == null && this.f17808M == null) {
                return false;
            }
            return str2 == null || (str = this.f17808M) == null || !str2.equals(str);
        }

        /* renamed from: j0 */
        public final boolean m20823j0() {
            return (Float.isNaN(this.f17836l) || Float.isNaN(this.f17804I) || this.f17804I == this.f17836l) ? false : true;
        }

        /* renamed from: k0 */
        public final void m20824k0() {
            if (this.f17820Y) {
                this.f17820Y = false;
                if (this.f17821Z == null) {
                    this.f17821Z = new float[16];
                }
                if (Matrix.invertM(this.f17821Z, 0, this.f17813R, 0)) {
                    return;
                }
                Arrays.fill(this.f17821Z, 0.0f);
            }
        }

        /* renamed from: l0 */
        public final l m20825l0(InterfaceC4202e interfaceC4202e) {
            for (l lVar = this.f17814S; lVar != null; lVar = lVar.f17814S) {
                if (interfaceC4202e.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* renamed from: m0 */
        public final Rect m20826m0() {
            return this.f17827c0;
        }

        /* renamed from: n0 */
        public final CharSequence m20827n0() {
            return m20821h0(this.f17848x, this.f17849y);
        }

        /* renamed from: o0 */
        public final CharSequence m20828o0() {
            List list = this.f17841q;
            String str = this.f17796A;
            if (str != null && str.length() > 0) {
                list = list == null ? new ArrayList() : new ArrayList(list);
                q qVar = new q(null);
                qVar.f17851a = 0;
                qVar.f17852b = this.f17840p.length();
                qVar.f17862d = this.f17796A;
                qVar.f17853c = o.URL;
                list.add(qVar);
            }
            return m20821h0(this.f17840p, list);
        }

        /* renamed from: p0 */
        public final String m20829p0() {
            String str;
            if (m20837x0(i.NAMES_ROUTE) && (str = this.f17840p) != null && !str.isEmpty()) {
                return this.f17840p;
            }
            Iterator it = this.f17815T.iterator();
            while (it.hasNext()) {
                String m20829p0 = ((l) it.next()).m20829p0();
                if (m20829p0 != null && !m20829p0.isEmpty()) {
                    return m20829p0;
                }
            }
            return null;
        }

        /* renamed from: q0 */
        public final List m20830q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i7 = byteBuffer.getInt();
            a aVar = null;
            if (i7 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i11 = e.f17721a[oVar.ordinal()];
                if (i11 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f17851a = i9;
                    mVar.f17852b = i10;
                    mVar.f17853c = oVar;
                    arrayList.add(mVar);
                } else if (i11 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f17851a = i9;
                    jVar.f17852b = i10;
                    jVar.f17853c = oVar;
                    jVar.f17795d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* renamed from: r0 */
        public final CharSequence m20831r0() {
            CharSequence[] charSequenceArr = {m20828o0(), m20827n0()};
            CharSequence charSequence = null;
            for (int i7 = 0; i7 < 2; i7++) {
                CharSequence charSequence2 = charSequenceArr[i7];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* renamed from: s0 */
        public final CharSequence m20832s0() {
            return m20821h0(this.f17842r, this.f17843s);
        }

        /* renamed from: t0 */
        public final CharSequence m20833t0() {
            CharSequence[] charSequenceArr = {m20832s0(), m20828o0(), m20827n0()};
            CharSequence charSequence = null;
            for (int i7 = 0; i7 < 3; i7++) {
                CharSequence charSequence2 = charSequenceArr[i7];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* renamed from: u0 */
        public final boolean m20834u0(g gVar) {
            return (gVar.f17756a & this.f17801F) != 0;
        }

        /* renamed from: v0 */
        public final boolean m20835v0(i iVar) {
            return (iVar.f17794a & this.f17800E) != 0;
        }

        /* renamed from: w0 */
        public final boolean m20836w0(g gVar) {
            return (gVar.f17756a & this.f17828d) != 0;
        }

        /* renamed from: x0 */
        public final boolean m20837x0(i iVar) {
            return (iVar.f17794a & this.f17826c) != 0;
        }

        /* renamed from: y0 */
        public final l m20838y0(float[] fArr, boolean z6) {
            float f7 = fArr[3];
            boolean z7 = false;
            float f8 = fArr[0] / f7;
            float f9 = fArr[1] / f7;
            if (f8 < this.f17809N || f8 >= this.f17811P || f9 < this.f17810O || f9 >= this.f17812Q) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.f17816U) {
                if (!lVar.m20837x0(i.IS_HIDDEN)) {
                    lVar.m20824k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.f17821Z, 0, fArr, 0);
                    l m20838y0 = lVar.m20838y0(fArr2, z6);
                    if (m20838y0 != null) {
                        return m20838y0;
                    }
                }
            }
            if (z6 && this.f17833i != -1) {
                z7 = true;
            }
            if (m20839z0() || z7) {
                return this;
            }
            return null;
        }

        /* renamed from: z0 */
        public final boolean m20839z0() {
            String str;
            String str2;
            String str3;
            if (m20837x0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (m20837x0(i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.f17828d & (~C4804i.f17690z)) == 0 && (this.f17826c & C4804i.f17687A) == 0 && ((str = this.f17840p) == null || str.isEmpty()) && (((str2 = this.f17842r) == null || str2.isEmpty()) && ((str3 = this.f17848x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    /* renamed from: io.flutter.view.i$m */
    public static class m extends n {
        public m() {
            super(null);
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.i$n */
    public static class n {

        /* renamed from: a */
        public int f17851a;

        /* renamed from: b */
        public int f17852b;

        /* renamed from: c */
        public o f17853c;

        public n() {
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* renamed from: io.flutter.view.i$o */
    public enum o {
        SPELLOUT,
        LOCALE,
        URL
    }

    /* renamed from: io.flutter.view.i$p */
    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        /* renamed from: f */
        public static p m20842f(int i7) {
            return i7 != 1 ? i7 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    /* renamed from: io.flutter.view.i$q */
    public static class q extends n {

        /* renamed from: d */
        public String f17862d;

        public q() {
            super(null);
        }

        public /* synthetic */ q(a aVar) {
            this();
        }
    }

    public C4804i(View view, C0565a c0565a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, InterfaceC4777s interfaceC4777s) {
        this(view, c0565a, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), interfaceC4777s);
    }

    /* renamed from: F */
    public static /* synthetic */ boolean m20685F(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m20686G(l lVar) {
        return lVar.m20837x0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* renamed from: e */
    public static /* synthetic */ int m20691e(C4804i c4804i, int i7) {
        int i8 = i7 & c4804i.f17702l;
        c4804i.f17702l = i8;
        return i8;
    }

    /* renamed from: f */
    public static /* synthetic */ int m20692f(C4804i c4804i, int i7) {
        int i8 = i7 | c4804i.f17702l;
        c4804i.f17702l = i8;
        return i8;
    }

    /* renamed from: A */
    public final l m20707A() {
        return (l) this.f17697g.get(0);
    }

    /* renamed from: B */
    public final void m20708B(float f7, float f8, boolean z6) {
        l m20838y0;
        if (this.f17697g.isEmpty() || (m20838y0 = m20707A().m20838y0(new float[]{f7, f8, 0.0f, 1.0f}, z6)) == this.f17705o) {
            return;
        }
        if (m20838y0 != null) {
            m20724T(m20838y0.f17824b, 128);
        }
        l lVar = this.f17705o;
        if (lVar != null) {
            m20724T(lVar.f17824b, 256);
        }
        this.f17705o = m20838y0;
    }

    /* renamed from: C */
    public boolean m20709C() {
        return this.f17693c.isEnabled();
    }

    /* renamed from: D */
    public final boolean m20710D(l lVar) {
        if (lVar.m20837x0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.m20833t0() == null && (lVar.f17828d & (~f17689C)) == 0) ? false : true;
    }

    /* renamed from: E */
    public boolean m20711E() {
        return this.f17693c.isTouchExplorationEnabled();
    }

    /* renamed from: H */
    public AccessibilityEvent m20712H(int i7) {
        return AccessibilityEvent.obtain(i7);
    }

    /* renamed from: I */
    public final AccessibilityEvent m20713I(int i7, int i8) {
        AccessibilityEvent m20712H = m20712H(i8);
        m20712H.setPackageName(this.f17691a.getContext().getPackageName());
        m20712H.setSource(this.f17691a, i7);
        return m20712H;
    }

    /* renamed from: J */
    public AccessibilityNodeInfo m20714J(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    /* renamed from: K */
    public AccessibilityNodeInfo m20715K(View view, int i7) {
        return AccessibilityNodeInfo.obtain(view, i7);
    }

    /* renamed from: L */
    public boolean m20716L(MotionEvent motionEvent) {
        return m20717M(motionEvent, false);
    }

    /* renamed from: M */
    public boolean m20717M(MotionEvent motionEvent, boolean z6) {
        if (!this.f17693c.isTouchExplorationEnabled() || this.f17697g.isEmpty()) {
            return false;
        }
        l m20838y0 = m20707A().m20838y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z6);
        if (m20838y0 != null && m20838y0.f17833i != -1) {
            if (z6) {
                return false;
            }
            return this.f17694d.onAccessibilityHoverEvent(m20838y0.f17824b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            m20708B(motionEvent.getX(), motionEvent.getY(), z6);
        } else {
            if (motionEvent.getAction() != 10) {
                AbstractC6917b.m28353a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            m20718N();
        }
        return true;
    }

    /* renamed from: N */
    public final void m20718N() {
        l lVar = this.f17705o;
        if (lVar != null) {
            m20724T(lVar.f17824b, 256);
            this.f17705o = null;
        }
    }

    /* renamed from: O */
    public final void m20719O(l lVar) {
        String m20829p0 = lVar.m20829p0();
        if (m20829p0 == null) {
            m20829p0 = StringUtils.SPACE;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            m20728X(m20829p0);
            return;
        }
        AccessibilityEvent m20713I = m20713I(lVar.f17824b, 32);
        m20713I.getText().add(m20829p0);
        m20725U(m20713I);
    }

    /* renamed from: P */
    public final boolean m20720P(l lVar, int i7, Bundle bundle, boolean z6) {
        int i8 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z7 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i9 = lVar.f17831g;
        int i10 = lVar.f17832h;
        m20722R(lVar, i8, z6, z7);
        if (i9 != lVar.f17831g || i10 != lVar.f17832h) {
            String str = lVar.f17842r != null ? lVar.f17842r : StringUtils.EMPTY;
            AccessibilityEvent m20713I = m20713I(lVar.f17824b, 8192);
            m20713I.getText().add(str);
            m20713I.setFromIndex(lVar.f17831g);
            m20713I.setToIndex(lVar.f17832h);
            m20713I.setItemCount(str.length());
            m20725U(m20713I);
        }
        if (i8 == 1) {
            if (z6) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.m20836w0(gVar)) {
                    this.f17692b.m2165c(i7, gVar, Boolean.valueOf(z7));
                    return true;
                }
            }
            if (z6) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.m20836w0(gVar2)) {
                return false;
            }
            this.f17692b.m2165c(i7, gVar2, Boolean.valueOf(z7));
            return true;
        }
        if (i8 != 2) {
            return i8 == 4 || i8 == 8 || i8 == 16;
        }
        if (z6) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.m20836w0(gVar3)) {
                this.f17692b.m2165c(i7, gVar3, Boolean.valueOf(z7));
                return true;
            }
        }
        if (z6) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.m20836w0(gVar4)) {
            return false;
        }
        this.f17692b.m2165c(i7, gVar4, Boolean.valueOf(z7));
        return true;
    }

    /* renamed from: Q */
    public final boolean m20721Q(l lVar, int i7, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? StringUtils.EMPTY : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f17692b.m2165c(i7, g.SET_TEXT, string);
        lVar.f17842r = string;
        lVar.f17843s = null;
        return true;
    }

    /* renamed from: R */
    public final void m20722R(l lVar, int i7, boolean z6, boolean z7) {
        if (lVar.f17832h < 0 || lVar.f17831g < 0) {
            return;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8 || i7 == 16) {
                        if (z6) {
                            lVar.f17832h = lVar.f17842r.length();
                        } else {
                            lVar.f17832h = 0;
                        }
                    }
                } else if (z6 && lVar.f17832h < lVar.f17842r.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.f17842r.substring(lVar.f17832h));
                    if (matcher.find()) {
                        l.m20802n(lVar, matcher.start(1));
                    } else {
                        lVar.f17832h = lVar.f17842r.length();
                    }
                } else if (!z6 && lVar.f17832h > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f17842r.substring(0, lVar.f17832h));
                    if (matcher2.find()) {
                        lVar.f17832h = matcher2.start(1);
                    } else {
                        lVar.f17832h = 0;
                    }
                }
            } else if (z6 && lVar.f17832h < lVar.f17842r.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f17842r.substring(lVar.f17832h));
                matcher3.find();
                if (matcher3.find()) {
                    l.m20802n(lVar, matcher3.start(1));
                } else {
                    lVar.f17832h = lVar.f17842r.length();
                }
            } else if (!z6 && lVar.f17832h > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f17842r.substring(0, lVar.f17832h));
                if (matcher4.find()) {
                    lVar.f17832h = matcher4.start(1);
                }
            }
        } else if (z6 && lVar.f17832h < lVar.f17842r.length()) {
            l.m20802n(lVar, 1);
        } else if (!z6 && lVar.f17832h > 0) {
            l.m20803o(lVar, 1);
        }
        if (z7) {
            return;
        }
        lVar.f17831g = lVar.f17832h;
    }

    /* renamed from: S */
    public void m20723S() {
        this.f17711u = true;
        this.f17695e.mo20447d();
        m20731a0(null);
        this.f17693c.removeAccessibilityStateChangeListener(this.f17713w);
        this.f17693c.removeTouchExplorationStateChangeListener(this.f17714x);
        this.f17696f.unregisterContentObserver(this.f17715y);
        this.f17692b.m2169g(null);
    }

    /* renamed from: T */
    public void m20724T(int i7, int i8) {
        if (this.f17693c.isEnabled()) {
            m20725U(m20713I(i7, i8));
        }
    }

    /* renamed from: U */
    public final void m20725U(AccessibilityEvent accessibilityEvent) {
        if (this.f17693c.isEnabled()) {
            this.f17691a.getParent().requestSendAccessibilityEvent(this.f17691a, accessibilityEvent);
        }
    }

    /* renamed from: V */
    public final void m20726V() {
        this.f17692b.m2168f(this.f17702l);
    }

    /* renamed from: W */
    public final void m20727W(int i7) {
        AccessibilityEvent m20713I = m20713I(i7, 2048);
        m20713I.setContentChangeTypes(1);
        m20725U(m20713I);
    }

    /* renamed from: X */
    public final void m20728X(String str) {
        this.f17691a.setAccessibilityPaneTitle(str);
    }

    /* renamed from: Y */
    public final void m20729Y(boolean z6) {
        if (this.f17710t == z6) {
            return;
        }
        this.f17710t = z6;
        if (z6) {
            this.f17702l |= f.ACCESSIBLE_NAVIGATION.f17730a;
        } else {
            this.f17702l &= ~f.ACCESSIBLE_NAVIGATION.f17730a;
        }
        m20726V();
    }

    /* renamed from: Z */
    public final void m20730Z() {
        int i7;
        View view = this.f17691a;
        if (view == null || view.getResources() == null) {
            return;
        }
        i7 = this.f17691a.getResources().getConfiguration().fontWeightAdjustment;
        if (i7 == Integer.MAX_VALUE || i7 < 300) {
            this.f17702l &= ~f.BOLD_TEXT.f17730a;
        } else {
            this.f17702l |= f.BOLD_TEXT.f17730a;
        }
        m20726V();
    }

    /* renamed from: a0 */
    public void m20731a0(k kVar) {
        this.f17709s = kVar;
    }

    /* renamed from: b0 */
    public final boolean m20732b0(final l lVar) {
        return lVar.f17834j > 0 && (l.m20759C0(this.f17699i, new InterfaceC4202e() { // from class: io.flutter.view.g
            @Override // p221e5.InterfaceC4202e
            public final boolean test(Object obj) {
                boolean m20685F;
                m20685F = C4804i.m20685F(C4804i.l.this, (C4804i.l) obj);
                return m20685F;
            }
        }) || !l.m20759C0(this.f17699i, new InterfaceC4202e() { // from class: io.flutter.view.h
            @Override // p221e5.InterfaceC4202e
            public final boolean test(Object obj) {
                boolean m20686G;
                m20686G = C4804i.m20686G((C4804i.l) obj);
                return m20686G;
            }
        }));
    }

    /* renamed from: c0 */
    public void m20733c0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h m20740y = m20740y(byteBuffer.getInt());
            m20740y.f17759c = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            String str = null;
            m20740y.f17760d = i7 == -1 ? null : strArr[i7];
            int i8 = byteBuffer.getInt();
            if (i8 != -1) {
                str = strArr[i8];
            }
            m20740y.f17761e = str;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        int i8;
        boolean z6 = true;
        m20729Y(true);
        if (i7 >= 65536) {
            return this.f17694d.createAccessibilityNodeInfo(i7);
        }
        if (i7 == -1) {
            AccessibilityNodeInfo m20714J = m20714J(this.f17691a);
            this.f17691a.onInitializeAccessibilityNodeInfo(m20714J);
            if (this.f17697g.containsKey(0)) {
                m20714J.addChild(this.f17691a, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                m20714J.setImportantForAccessibility(false);
            }
            return m20714J;
        }
        l lVar = (l) this.f17697g.get(Integer.valueOf(i7));
        if (lVar == null) {
            return null;
        }
        if (lVar.f17833i != -1 && this.f17695e.mo20446c(lVar.f17833i)) {
            View mo20445b = this.f17695e.mo20445b(lVar.f17833i);
            if (mo20445b == null) {
                return null;
            }
            return this.f17694d.getRootNode(mo20445b, lVar.f17824b, lVar.m20826m0());
        }
        AccessibilityNodeInfo m20715K = m20715K(this.f17691a, i7);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            m20715K.setImportantForAccessibility(m20710D(lVar));
        }
        CharSequence charSequence = StringUtils.EMPTY;
        m20715K.setViewIdResourceName(StringUtils.EMPTY);
        if (lVar.f17839o != null) {
            m20715K.setViewIdResourceName(lVar.f17839o);
        }
        m20715K.setPackageName(this.f17691a.getContext().getPackageName());
        m20715K.setClassName("android.view.View");
        m20715K.setSource(this.f17691a, i7);
        m20715K.setFocusable(lVar.m20839z0());
        l lVar2 = this.f17703m;
        if (lVar2 != null) {
            m20715K.setFocused(lVar2.f17824b == i7);
        }
        l lVar3 = this.f17699i;
        if (lVar3 != null) {
            m20715K.setAccessibilityFocused(lVar3.f17824b == i7);
        }
        i iVar = i.IS_TEXT_FIELD;
        if (lVar.m20837x0(iVar)) {
            m20715K.setPassword(lVar.m20837x0(i.IS_OBSCURED));
            if (!lVar.m20837x0(i.IS_READ_ONLY)) {
                m20715K.setClassName("android.widget.EditText");
            }
            m20715K.setEditable(!lVar.m20837x0(r9));
            if (lVar.f17831g != -1 && lVar.f17832h != -1) {
                m20715K.setTextSelection(lVar.f17831g, lVar.f17832h);
            }
            l lVar4 = this.f17699i;
            if (lVar4 != null && lVar4.f17824b == i7) {
                m20715K.setLiveRegion(1);
            }
            if (lVar.m20836w0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                m20715K.addAction(256);
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (lVar.m20836w0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                m20715K.addAction(512);
                i8 = 1;
            }
            if (lVar.m20836w0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                m20715K.addAction(256);
                i8 |= 2;
            }
            if (lVar.m20836w0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                m20715K.addAction(512);
                i8 |= 2;
            }
            m20715K.setMovementGranularities(i8);
            if (lVar.f17829e >= 0) {
                int length = lVar.f17842r == null ? 0 : lVar.f17842r.length();
                int unused = lVar.f17830f;
                int unused2 = lVar.f17829e;
                m20715K.setMaxTextLength((length - lVar.f17830f) + lVar.f17829e);
            }
        }
        if (lVar.m20836w0(g.SET_SELECTION)) {
            m20715K.addAction(131072);
        }
        if (lVar.m20836w0(g.COPY)) {
            m20715K.addAction(16384);
        }
        if (lVar.m20836w0(g.CUT)) {
            m20715K.addAction(65536);
        }
        if (lVar.m20836w0(g.PASTE)) {
            m20715K.addAction(32768);
        }
        if (lVar.m20836w0(g.SET_TEXT)) {
            m20715K.addAction(2097152);
        }
        if (lVar.m20837x0(i.IS_BUTTON)) {
            m20715K.setClassName("android.widget.Button");
        }
        if (lVar.m20837x0(i.IS_IMAGE)) {
            m20715K.setClassName("android.widget.ImageView");
        }
        if (lVar.m20836w0(g.DISMISS)) {
            m20715K.setDismissable(true);
            m20715K.addAction(1048576);
        }
        if (lVar.f17814S != null) {
            m20715K.setParent(this.f17691a, lVar.f17814S.f17824b);
        } else {
            m20715K.setParent(this.f17691a);
        }
        if (lVar.f17797B != -1) {
            m20715K.setTraversalAfter(this.f17691a, lVar.f17797B);
        }
        Rect m20826m0 = lVar.m20826m0();
        if (lVar.f17814S != null) {
            Rect m20826m02 = lVar.f17814S.m20826m0();
            Rect rect = new Rect(m20826m0);
            rect.offset(-m20826m02.left, -m20826m02.top);
            m20715K.setBoundsInParent(rect);
        } else {
            m20715K.setBoundsInParent(m20826m0);
        }
        m20715K.setBoundsInScreen(m20739x(m20826m0));
        m20715K.setVisibleToUser(true);
        m20715K.setEnabled(!lVar.m20837x0(i.HAS_ENABLED_STATE) || lVar.m20837x0(i.IS_ENABLED));
        if (lVar.m20836w0(g.TAP)) {
            if (lVar.f17818W != null) {
                m20715K.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.f17818W.f17761e));
                m20715K.setClickable(true);
            } else {
                m20715K.addAction(16);
                m20715K.setClickable(true);
            }
        } else if (lVar.m20837x0(i.IS_SLIDER)) {
            m20715K.addAction(16);
            m20715K.setClickable(true);
        }
        if (lVar.m20836w0(g.LONG_PRESS)) {
            if (lVar.f17819X != null) {
                m20715K.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.f17819X.f17761e));
                m20715K.setLongClickable(true);
            } else {
                m20715K.addAction(32);
                m20715K.setLongClickable(true);
            }
        }
        g gVar = g.SCROLL_LEFT;
        if (lVar.m20836w0(gVar) || lVar.m20836w0(g.SCROLL_UP) || lVar.m20836w0(g.SCROLL_RIGHT) || lVar.m20836w0(g.SCROLL_DOWN)) {
            m20715K.setScrollable(true);
            if (lVar.m20837x0(i.HAS_IMPLICIT_SCROLLING)) {
                if (lVar.m20836w0(gVar) || lVar.m20836w0(g.SCROLL_RIGHT)) {
                    if (m20732b0(lVar)) {
                        m20715K.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar.f17834j, false));
                    } else {
                        m20715K.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (m20732b0(lVar)) {
                    m20715K.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar.f17834j, 0, false));
                } else {
                    m20715K.setClassName("android.widget.ScrollView");
                }
            }
            if (lVar.m20836w0(gVar) || lVar.m20836w0(g.SCROLL_UP)) {
                m20715K.addAction(4096);
            }
            if (lVar.m20836w0(g.SCROLL_RIGHT) || lVar.m20836w0(g.SCROLL_DOWN)) {
                m20715K.addAction(8192);
            }
        }
        g gVar2 = g.INCREASE;
        if (lVar.m20836w0(gVar2) || lVar.m20836w0(g.DECREASE)) {
            m20715K.setClassName("android.widget.SeekBar");
            if (lVar.m20836w0(gVar2)) {
                m20715K.addAction(4096);
            }
            if (lVar.m20836w0(g.DECREASE)) {
                m20715K.addAction(8192);
            }
        }
        if (lVar.m20837x0(i.IS_LIVE_REGION)) {
            m20715K.setLiveRegion(1);
        }
        if (lVar.m20837x0(iVar)) {
            m20715K.setText(lVar.m20832s0());
            if (i9 >= 28) {
                m20715K.setHintText(lVar.m20831r0());
            }
        } else if (!lVar.m20837x0(i.SCOPES_ROUTE)) {
            CharSequence m20833t0 = lVar.m20833t0();
            if (i9 < 28 && lVar.f17850z != null) {
                if (m20833t0 != null) {
                    charSequence = m20833t0;
                }
                m20833t0 = ((Object) charSequence) + "\n" + lVar.f17850z;
            }
            if (m20833t0 != null) {
                m20715K.setContentDescription(m20833t0);
            }
        }
        if (i9 >= 28 && lVar.f17850z != null) {
            m20715K.setTooltipText(lVar.f17850z);
        }
        boolean m20837x0 = lVar.m20837x0(i.HAS_CHECKED_STATE);
        boolean m20837x02 = lVar.m20837x0(i.HAS_TOGGLED_STATE);
        if (!m20837x0 && !m20837x02) {
            z6 = false;
        }
        m20715K.setCheckable(z6);
        if (m20837x0) {
            m20715K.setChecked(lVar.m20837x0(i.IS_CHECKED));
            if (lVar.m20837x0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                m20715K.setClassName("android.widget.RadioButton");
            } else {
                m20715K.setClassName("android.widget.CheckBox");
            }
        } else if (m20837x02) {
            m20715K.setChecked(lVar.m20837x0(i.IS_TOGGLED));
            m20715K.setClassName("android.widget.Switch");
        }
        m20715K.setSelected(lVar.m20837x0(i.IS_SELECTED));
        if (i9 >= 28) {
            m20715K.setHeading(lVar.m20837x0(i.IS_HEADER));
        }
        l lVar5 = this.f17699i;
        if (lVar5 == null || lVar5.f17824b != i7) {
            m20715K.addAction(64);
        } else {
            m20715K.addAction(128);
        }
        if (lVar.f17817V != null) {
            for (h hVar : lVar.f17817V) {
                m20715K.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f17757a, hVar.f17760d));
            }
        }
        for (l lVar6 : lVar.f17815T) {
            if (!lVar6.m20837x0(i.IS_HIDDEN)) {
                if (lVar6.f17833i != -1) {
                    View mo20445b2 = this.f17695e.mo20445b(lVar6.f17833i);
                    if (!this.f17695e.mo20446c(lVar6.f17833i)) {
                        m20715K.addChild(mo20445b2);
                    }
                }
                m20715K.addChild(this.f17691a, lVar6.f17824b);
            }
        }
        return m20715K;
    }

    /* renamed from: d0 */
    public void m20734d0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f7;
        float f8;
        WindowInsets rootWindowInsets;
        View mo20445b;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l m20741z = m20741z(byteBuffer.getInt());
            m20741z.m20819F0(byteBuffer, strArr, byteBufferArr);
            if (!m20741z.m20837x0(i.IS_HIDDEN)) {
                if (m20741z.m20837x0(i.IS_FOCUSED)) {
                    this.f17703m = m20741z;
                }
                if (m20741z.f17799D) {
                    arrayList.add(m20741z);
                }
                if (m20741z.f17833i != -1 && !this.f17695e.mo20446c(m20741z.f17833i) && (mo20445b = this.f17695e.mo20445b(m20741z.f17833i)) != null) {
                    mo20445b.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l m20707A = m20707A();
        ArrayList<l> arrayList2 = new ArrayList();
        if (m20707A != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT >= 28 ? m20737v() : true) && (rootWindowInsets = this.f17691a.getRootWindowInsets()) != null) {
                if (!this.f17708r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    m20707A.f17823a0 = true;
                    m20707A.f17820Y = true;
                }
                this.f17708r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
            }
            m20707A.m20818E0(fArr, hashSet, false);
            m20707A.m20820g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f17706p.contains(Integer.valueOf(lVar4.f17824b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f17824b != this.f17707q || arrayList2.size() != this.f17706p.size())) {
            this.f17707q = lVar3.f17824b;
            m20719O(lVar3);
        }
        this.f17706p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f17706p.add(Integer.valueOf(((l) it.next()).f17824b));
        }
        Iterator it2 = this.f17697g.entrySet().iterator();
        while (it2.hasNext()) {
            l lVar5 = (l) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(lVar5)) {
                m20735e0(lVar5);
                it2.remove();
            }
        }
        m20727W(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar6 = (l) it3.next();
            if (lVar6.m20823j0()) {
                AccessibilityEvent m20713I = m20713I(lVar6.f17824b, 4096);
                float f9 = lVar6.f17836l;
                float f10 = lVar6.f17837m;
                if (Float.isInfinite(lVar6.f17837m)) {
                    if (f9 > 70000.0f) {
                        f9 = 70000.0f;
                    }
                    f10 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.f17838n)) {
                    f7 = f10 + 100000.0f;
                    if (f9 < -70000.0f) {
                        f9 = -70000.0f;
                    }
                    f8 = f9 + 100000.0f;
                } else {
                    f7 = f10 - lVar6.f17838n;
                    f8 = f9 - lVar6.f17838n;
                }
                if (lVar6.m20834u0(g.SCROLL_UP) || lVar6.m20834u0(g.SCROLL_DOWN)) {
                    m20713I.setScrollY((int) f8);
                    m20713I.setMaxScrollY((int) f7);
                } else if (lVar6.m20834u0(g.SCROLL_LEFT) || lVar6.m20834u0(g.SCROLL_RIGHT)) {
                    m20713I.setScrollX((int) f8);
                    m20713I.setMaxScrollX((int) f7);
                }
                if (lVar6.f17834j > 0) {
                    m20713I.setItemCount(lVar6.f17834j);
                    m20713I.setFromIndex(lVar6.f17835k);
                    Iterator it4 = lVar6.f17816U.iterator();
                    int i7 = 0;
                    while (it4.hasNext()) {
                        if (!((l) it4.next()).m20837x0(i.IS_HIDDEN)) {
                            i7++;
                        }
                    }
                    m20713I.setToIndex((lVar6.f17835k + i7) - 1);
                }
                m20725U(m20713I);
            }
            if (lVar6.m20837x0(i.IS_LIVE_REGION) && lVar6.m20822i0()) {
                m20727W(lVar6.f17824b);
            }
            l lVar7 = this.f17699i;
            if (lVar7 != null && lVar7.f17824b == lVar6.f17824b) {
                i iVar = i.IS_SELECTED;
                if (!lVar6.m20835v0(iVar) && lVar6.m20837x0(iVar)) {
                    AccessibilityEvent m20713I2 = m20713I(lVar6.f17824b, 4);
                    m20713I2.getText().add(lVar6.f17840p);
                    m20725U(m20713I2);
                }
            }
            l lVar8 = this.f17703m;
            if (lVar8 != null && lVar8.f17824b == lVar6.f17824b && ((lVar2 = this.f17704n) == null || lVar2.f17824b != this.f17703m.f17824b)) {
                this.f17704n = this.f17703m;
                m20725U(m20713I(lVar6.f17824b, 8));
            } else if (this.f17703m == null) {
                this.f17704n = null;
            }
            l lVar9 = this.f17703m;
            if (lVar9 != null && lVar9.f17824b == lVar6.f17824b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar6.m20835v0(iVar2) && lVar6.m20837x0(iVar2) && ((lVar = this.f17699i) == null || lVar.f17824b == this.f17703m.f17824b)) {
                    String str = lVar6.f17807L;
                    String str2 = StringUtils.EMPTY;
                    String str3 = str != null ? lVar6.f17807L : StringUtils.EMPTY;
                    if (lVar6.f17842r != null) {
                        str2 = lVar6.f17842r;
                    }
                    AccessibilityEvent m20736u = m20736u(lVar6.f17824b, str3, str2);
                    if (m20736u != null) {
                        m20725U(m20736u);
                    }
                    if (lVar6.f17802G != lVar6.f17831g || lVar6.f17803H != lVar6.f17832h) {
                        AccessibilityEvent m20713I3 = m20713I(lVar6.f17824b, 8192);
                        m20713I3.getText().add(str2);
                        m20713I3.setFromIndex(lVar6.f17831g);
                        m20713I3.setToIndex(lVar6.f17832h);
                        m20713I3.setItemCount(str2.length());
                        m20725U(m20713I3);
                    }
                }
            }
        }
    }

    /* renamed from: e0 */
    public final void m20735e0(l lVar) {
        View mo20445b;
        Integer num;
        lVar.f17814S = null;
        if (lVar.f17833i != -1 && (num = this.f17700j) != null && this.f17694d.platformViewOfNode(num.intValue()) == this.f17695e.mo20445b(lVar.f17833i)) {
            m20724T(this.f17700j.intValue(), 65536);
            this.f17700j = null;
        }
        if (lVar.f17833i != -1 && (mo20445b = this.f17695e.mo20445b(lVar.f17833i)) != null) {
            mo20445b.setImportantForAccessibility(4);
        }
        l lVar2 = this.f17699i;
        if (lVar2 == lVar) {
            m20724T(lVar2.f17824b, 65536);
            this.f17699i = null;
        }
        if (this.f17703m == lVar) {
            this.f17703m = null;
        }
        if (this.f17705o == lVar) {
            this.f17705o = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i7) {
        if (i7 == 1) {
            l lVar = this.f17703m;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f17824b);
            }
            Integer num = this.f17701k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i7 != 2) {
            return null;
        }
        l lVar2 = this.f17699i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f17824b);
        }
        Integer num2 = this.f17700j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i7, int i8, Bundle bundle) {
        if (i7 >= 65536) {
            boolean performAction = this.f17694d.performAction(i7, i8, bundle);
            if (performAction && i8 == 128) {
                this.f17700j = null;
            }
            return performAction;
        }
        l lVar = (l) this.f17697g.get(Integer.valueOf(i7));
        if (lVar == null) {
            return false;
        }
        switch (i8) {
            case 16:
                this.f17692b.m2164b(i7, g.TAP);
                return true;
            case 32:
                this.f17692b.m2164b(i7, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f17699i == null) {
                    this.f17691a.invalidate();
                }
                this.f17699i = lVar;
                this.f17692b.m2164b(i7, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(lVar.f17824b));
                this.f17692b.f1844a.m2612c(hashMap);
                m20724T(i7, 32768);
                if (lVar.m20836w0(g.INCREASE) || lVar.m20836w0(g.DECREASE)) {
                    m20724T(i7, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f17699i;
                if (lVar2 != null && lVar2.f17824b == i7) {
                    this.f17699i = null;
                }
                Integer num = this.f17700j;
                if (num != null && num.intValue() == i7) {
                    this.f17700j = null;
                }
                this.f17692b.m2164b(i7, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                m20724T(i7, 65536);
                return true;
            case 256:
                return m20720P(lVar, i7, bundle, true);
            case 512:
                return m20720P(lVar, i7, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (lVar.m20836w0(gVar)) {
                    this.f17692b.m2164b(i7, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (lVar.m20836w0(gVar2)) {
                        this.f17692b.m2164b(i7, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!lVar.m20836w0(gVar3)) {
                            return false;
                        }
                        lVar.f17842r = lVar.f17844t;
                        lVar.f17843s = lVar.f17845u;
                        m20724T(i7, 4);
                        this.f17692b.m2164b(i7, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (lVar.m20836w0(gVar4)) {
                    this.f17692b.m2164b(i7, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (lVar.m20836w0(gVar5)) {
                        this.f17692b.m2164b(i7, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!lVar.m20836w0(gVar6)) {
                            return false;
                        }
                        lVar.f17842r = lVar.f17846v;
                        lVar.f17843s = lVar.f17847w;
                        m20724T(i7, 4);
                        this.f17692b.m2164b(i7, gVar6);
                    }
                }
                return true;
            case 16384:
                this.f17692b.m2164b(i7, g.COPY);
                return true;
            case 32768:
                this.f17692b.m2164b(i7, g.PASTE);
                return true;
            case 65536:
                this.f17692b.m2164b(i7, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put("base", Integer.valueOf(lVar.f17832h));
                    hashMap2.put("extent", Integer.valueOf(lVar.f17832h));
                }
                this.f17692b.m2165c(i7, g.SET_SELECTION, hashMap2);
                l lVar3 = (l) this.f17697g.get(Integer.valueOf(i7));
                lVar3.f17831g = ((Integer) hashMap2.get("base")).intValue();
                lVar3.f17832h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f17692b.m2164b(i7, g.DISMISS);
                return true;
            case 2097152:
                return m20721Q(lVar, i7, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f17692b.m2164b(i7, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.f17698h.get(Integer.valueOf(i8 - f17688B));
                if (hVar == null) {
                    return false;
                }
                this.f17692b.m2165c(i7, g.CUSTOM_ACTION, Integer.valueOf(hVar.f17758b));
                return true;
        }
    }

    /* renamed from: u */
    public final AccessibilityEvent m20736u(int i7, String str, String str2) {
        AccessibilityEvent m20713I = m20713I(i7, 16);
        m20713I.setBeforeText(str);
        m20713I.getText().add(str2);
        int i8 = 0;
        while (i8 < str.length() && i8 < str2.length() && str.charAt(i8) == str2.charAt(i8)) {
            i8++;
        }
        if (i8 >= str.length() && i8 >= str2.length()) {
            return null;
        }
        m20713I.setFromIndex(i8);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i8 && length2 >= i8 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        m20713I.setRemovedCount((length - i8) + 1);
        m20713I.setAddedCount((length2 - i8) + 1);
        return m20713I;
    }

    /* renamed from: v */
    public final boolean m20737v() {
        int i7;
        Activity m17627e = AbstractC4206i.m17627e(this.f17691a.getContext());
        if (m17627e == null || m17627e.getWindow() == null) {
            return false;
        }
        i7 = m17627e.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i7 == 2 || i7 == 0;
    }

    /* renamed from: w */
    public boolean m20738w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f17694d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f17694d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f17701k = recordFlutterId;
            this.f17703m = null;
            return true;
        }
        if (eventType == 128) {
            this.f17705o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f17700j = recordFlutterId;
            this.f17699i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f17701k = null;
        this.f17700j = null;
        return true;
    }

    /* renamed from: x */
    public final Rect m20739x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f17691a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* renamed from: y */
    public final h m20740y(int i7) {
        h hVar = (h) this.f17698h.get(Integer.valueOf(i7));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f17758b = i7;
        hVar2.f17757a = f17688B + i7;
        this.f17698h.put(Integer.valueOf(i7), hVar2);
        return hVar2;
    }

    /* renamed from: z */
    public final l m20741z(int i7) {
        l lVar = (l) this.f17697g.get(Integer.valueOf(i7));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f17824b = i7;
        this.f17697g.put(Integer.valueOf(i7), lVar2);
        return lVar2;
    }

    public C4804i(View view, C0565a c0565a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, InterfaceC4777s interfaceC4777s) {
        this.f17697g = new HashMap();
        this.f17698h = new HashMap();
        this.f17702l = 0;
        this.f17706p = new ArrayList();
        this.f17707q = 0;
        this.f17708r = 0;
        this.f17710t = false;
        this.f17711u = false;
        this.f17712v = new a();
        b bVar = new b();
        this.f17713w = bVar;
        c cVar = new c(new Handler());
        this.f17715y = cVar;
        this.f17691a = view;
        this.f17692b = c0565a;
        this.f17693c = accessibilityManager;
        this.f17696f = contentResolver;
        this.f17694d = accessibilityViewEmbedder;
        this.f17695e = interfaceC4777s;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f17714x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            m20730Z();
        }
        interfaceC4777s.mo20444a(this);
    }
}
