package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f10060a;

    /* renamed from: b */
    public TypedValue f10061b;

    /* renamed from: c */
    public TypedValue f10062c;

    /* renamed from: d */
    public TypedValue f10063d;

    /* renamed from: e */
    public TypedValue f10064e;

    /* renamed from: f */
    public TypedValue f10065f;

    /* renamed from: n */
    public final Rect f10066n;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC3208a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m11789a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f10064e == null) {
            this.f10064e = new TypedValue();
        }
        return this.f10064e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f10065f == null) {
            this.f10065f = new TypedValue();
        }
        return this.f10065f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f10062c == null) {
            this.f10062c = new TypedValue();
        }
        return this.f10062c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f10063d == null) {
            this.f10063d = new TypedValue();
        }
        return this.f10063d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f10060a == null) {
            this.f10060a = new TypedValue();
        }
        return this.f10060a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f10061b == null) {
            this.f10061b = new TypedValue();
        }
        return this.f10061b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC3208a interfaceC3208a) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10066n = new Rect();
    }
}
