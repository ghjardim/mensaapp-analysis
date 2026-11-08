package p377x4;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x4.c */
/* loaded from: classes.dex */
public class C6977c {

    /* renamed from: f */
    public static final Matrix f24993f = new Matrix();

    /* renamed from: a */
    public final FlutterRenderer f24994a;

    /* renamed from: c */
    public final boolean f24996c;

    /* renamed from: e */
    public int f24998e;

    /* renamed from: d */
    public final Map f24997d = new HashMap();

    /* renamed from: b */
    public final C6971O f24995b = C6971O.m28570a();

    public C6977c(FlutterRenderer flutterRenderer, boolean z6) {
        this.f24994a = flutterRenderer;
        this.f24996c = z6;
    }

    /* renamed from: a */
    public final void m28583a(MotionEvent motionEvent, int i7, int i8, int i9, Matrix matrix, ByteBuffer byteBuffer) {
        m28584b(motionEvent, i7, i8, i9, matrix, byteBuffer, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28584b(android.view.MotionEvent r26, int r27, int r28, int r29, android.graphics.Matrix r30, java.nio.ByteBuffer r31, android.content.Context r32) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p377x4.C6977c.m28584b(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    /* renamed from: c */
    public final float m28585c(Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return m28591i(context);
        }
        scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    /* renamed from: d */
    public final int m28586d(int i7) {
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1) {
            return 6;
        }
        if (i7 == 5) {
            return 4;
        }
        if (i7 == 6) {
            return 6;
        }
        if (i7 == 2) {
            return 5;
        }
        if (i7 == 7) {
            return 3;
        }
        if (i7 == 3) {
            return 0;
        }
        return i7 == 8 ? 3 : -1;
    }

    /* renamed from: e */
    public final int m28587e(int i7) {
        if (i7 == 4) {
            return 7;
        }
        if (i7 == 5) {
            return 8;
        }
        return (i7 == 6 || i7 == 0) ? 9 : -1;
    }

    /* renamed from: f */
    public final int m28588f(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 != 3) {
            return i7 != 4 ? 5 : 3;
        }
        return 1;
    }

    /* renamed from: g */
    public final float m28589g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? m28590h(context) : m28591i(context);
    }

    /* renamed from: h */
    public final float m28590h(Context context) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    /* renamed from: i */
    public final int m28591i(Context context) {
        if (this.f24998e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f24998e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f24998e;
    }

    /* renamed from: j */
    public boolean m28592j(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z6 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z6) {
            return false;
        }
        int m28586d = m28586d(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        m28584b(motionEvent, motionEvent.getActionIndex(), m28586d, 0, f24993f, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f24994a.m20257m(allocateDirect, allocateDirect.position());
        return true;
    }

    /* renamed from: k */
    public boolean m28593k(MotionEvent motionEvent) {
        return m28594l(motionEvent, f24993f);
    }

    /* renamed from: l */
    public boolean m28594l(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int m28586d = m28586d(motionEvent.getActionMasked());
        boolean z6 = actionMasked == 0 || actionMasked == 5;
        boolean z7 = !z6 && (actionMasked == 1 || actionMasked == 6);
        int i7 = (z7 && m28588f(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i7) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z6) {
            m28583a(motionEvent, motionEvent.getActionIndex(), m28586d, 0, matrix, allocateDirect);
        } else if (z7) {
            for (int i8 = 0; i8 < pointerCount; i8++) {
                if (i8 != motionEvent.getActionIndex() && motionEvent.getToolType(i8) == 1) {
                    m28583a(motionEvent, i8, 5, 1, matrix, allocateDirect);
                }
            }
            m28583a(motionEvent, motionEvent.getActionIndex(), m28586d, 0, matrix, allocateDirect);
            if (i7 != 0) {
                m28583a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect);
            }
        } else {
            for (int i9 = 0; i9 < pointerCount; i9++) {
                m28583a(motionEvent, i9, m28586d, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f24994a.m20257m(allocateDirect, allocateDirect.position());
        return true;
    }
}
