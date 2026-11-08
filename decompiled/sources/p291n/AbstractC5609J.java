package p291n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p000A.AbstractC0000a;
import p070K.C0816e;
import p223f.AbstractC4216a;
import p247i.AbstractC4501c;

/* renamed from: n.J */
/* loaded from: classes.dex */
public abstract class AbstractC5609J extends ListView {

    /* renamed from: a */
    public final Rect f20268a;

    /* renamed from: b */
    public int f20269b;

    /* renamed from: c */
    public int f20270c;

    /* renamed from: d */
    public int f20271d;

    /* renamed from: e */
    public int f20272e;

    /* renamed from: f */
    public int f20273f;

    /* renamed from: n */
    public Field f20274n;

    /* renamed from: o */
    public a f20275o;

    /* renamed from: p */
    public boolean f20276p;

    /* renamed from: q */
    public boolean f20277q;

    /* renamed from: r */
    public boolean f20278r;

    /* renamed from: s */
    public C0816e f20279s;

    /* renamed from: t */
    public b f20280t;

    /* renamed from: n.J$a */
    public static class a extends AbstractC4501c {

        /* renamed from: b */
        public boolean f20281b;

        public a(Drawable drawable) {
            super(drawable);
            this.f20281b = true;
        }

        /* renamed from: c */
        public void m23512c(boolean z6) {
            this.f20281b = z6;
        }

        @Override // p247i.AbstractC4501c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f20281b) {
                super.draw(canvas);
            }
        }

        @Override // p247i.AbstractC4501c, android.graphics.drawable.Drawable
        public void setHotspot(float f7, float f8) {
            if (this.f20281b) {
                super.setHotspot(f7, f8);
            }
        }

        @Override // p247i.AbstractC4501c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f20281b) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // p247i.AbstractC4501c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f20281b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p247i.AbstractC4501c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z6, boolean z7) {
            if (this.f20281b) {
                return super.setVisible(z6, z7);
            }
            return false;
        }
    }

    /* renamed from: n.J$b */
    public class b implements Runnable {
        public b() {
        }

        /* renamed from: a */
        public void m23513a() {
            AbstractC5609J abstractC5609J = AbstractC5609J.this;
            abstractC5609J.f20280t = null;
            abstractC5609J.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m23514b() {
            AbstractC5609J.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5609J abstractC5609J = AbstractC5609J.this;
            abstractC5609J.f20280t = null;
            abstractC5609J.drawableStateChanged();
        }
    }

    public AbstractC5609J(Context context, boolean z6) {
        super(context, null, AbstractC4216a.f14088n);
        this.f20268a = new Rect();
        this.f20269b = 0;
        this.f20270c = 0;
        this.f20271d = 0;
        this.f20272e = 0;
        this.f20277q = z6;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f20274n = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m23500a() {
        this.f20278r = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f20273f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    /* renamed from: b */
    public final void m23501b(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    /* renamed from: c */
    public final void m23502c(Canvas canvas) {
        Drawable selector;
        if (this.f20268a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f20268a);
        selector.draw(canvas);
    }

    /* renamed from: d */
    public int mo23503d(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i7, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i10) {
                return (i11 < 0 || i13 <= i11 || i15 <= 0 || i12 == i10) ? i10 : i15;
            }
            if (i11 >= 0 && i13 >= i11) {
                i15 = i12;
            }
            i13++;
        }
        return i12;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m23502c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f20280t != null) {
            return;
        }
        super.drawableStateChanged();
        m23509j(true);
        m23511l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo23504e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m23508i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m23501b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m23500a()
        L4d:
            if (r3 == 0) goto L65
            K.e r9 = r7.f20279s
            if (r9 != 0) goto L5a
            K.e r9 = new K.e
            r9.<init>(r7)
            r7.f20279s = r9
        L5a:
            K.e r9 = r7.f20279s
            r9.m3363m(r1)
            K.e r9 = r7.f20279s
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            K.e r8 = r7.f20279s
            if (r8 == 0) goto L6c
            r8.m3363m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p291n.AbstractC5609J.mo23504e(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: f */
    public final void m23505f(int i7, View view) {
        Rect rect = this.f20268a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f20269b;
        rect.top -= this.f20270c;
        rect.right += this.f20271d;
        rect.bottom += this.f20272e;
        try {
            boolean z6 = this.f20274n.getBoolean(this);
            if (view.isEnabled() != z6) {
                this.f20274n.set(this, Boolean.valueOf(!z6));
                if (i7 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void m23506g(int i7, View view) {
        Drawable selector = getSelector();
        boolean z6 = (selector == null || i7 == -1) ? false : true;
        if (z6) {
            selector.setVisible(false, false);
        }
        m23505f(i7, view);
        if (z6) {
            Rect rect = this.f20268a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            AbstractC0000a.m9j(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    public final void m23507h(int i7, View view, float f7, float f8) {
        m23506g(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        AbstractC0000a.m9j(selector, f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f20277q || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f20277q || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void m23508i(View view, int i7, float f7, float f8) {
        View childAt;
        this.f20278r = true;
        drawableHotspotChanged(f7, f8);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.f20273f;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f20273f = i7;
        view.drawableHotspotChanged(f7 - view.getLeft(), f8 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m23507h(i7, view, f7, f8);
        m23509j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f20277q || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f20277q && this.f20276p) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final void m23509j(boolean z6) {
        a aVar = this.f20275o;
        if (aVar != null) {
            aVar.m23512c(z6);
        }
    }

    /* renamed from: k */
    public final boolean m23510k() {
        return this.f20278r;
    }

    /* renamed from: l */
    public final void m23511l() {
        Drawable selector = getSelector();
        if (selector != null && m23510k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f20280t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f20280t == null) {
            b bVar = new b();
            this.f20280t = bVar;
            bVar.m23514b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m23511l();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20273f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f20280t;
        if (bVar != null) {
            bVar.m23513a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f20276p = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f20275o = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f20269b = rect.left;
        this.f20270c = rect.top;
        this.f20271d = rect.right;
        this.f20272e = rect.bottom;
    }
}
