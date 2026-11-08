package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p370w4.AbstractC6917b;

@Keep
/* loaded from: classes2.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final C4790b reflectionAccessors = new C4790b();
    private final SparseArray<C4791c> flutterIdToOrigin = new SparseArray<>();
    private final Map<C4791c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$b */
    public static class C4790b {

        /* renamed from: a */
        public final Method f17675a;

        /* renamed from: b */
        public final Method f17676b;

        /* renamed from: c */
        public final Method f17677c;

        /* renamed from: d */
        public final Method f17678d;

        /* renamed from: e */
        public final Field f17679e;

        /* renamed from: f */
        public final Method f17680f;

        /* renamed from: j */
        public static int m20671j(long j7) {
            return (int) (j7 >> 32);
        }

        /* renamed from: k */
        public static boolean m20672k(long j7, int i7) {
            return (j7 & (1 << i7)) != 0;
        }

        /* renamed from: l */
        public static Long m20673l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                AbstractC6917b.m28359g(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m20672k(readLong, 0)) {
                obtain2.readInt();
            }
            if (m20672k(readLong, 1)) {
                obtain2.readLong();
            }
            if (m20672k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = m20672k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }

        /* renamed from: f */
        public final Long m20674f(AccessibilityNodeInfo accessibilityNodeInfo, int i7) {
            Method method = this.f17678d;
            if (method == null && (this.f17679e == null || this.f17680f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(i7));
                } catch (IllegalAccessException e7) {
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "Failed to access getChildId method.", e7);
                } catch (InvocationTargetException e8) {
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "The getChildId method threw an exception when invoked.", e8);
                }
            } else {
                try {
                    Long l7 = (Long) this.f17680f.invoke(this.f17679e.get(accessibilityNodeInfo), Integer.valueOf(i7));
                    l7.longValue();
                    return l7;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    e = e9;
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                } catch (IllegalAccessException e10) {
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e10);
                } catch (InvocationTargetException e11) {
                    e = e11;
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    return null;
                }
            }
            return null;
        }

        /* renamed from: g */
        public final Long m20675g(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f17676b;
            if (method != null) {
                try {
                    Long l7 = (Long) method.invoke(accessibilityNodeInfo, null);
                    l7.longValue();
                    return l7;
                } catch (IllegalAccessException e7) {
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "Failed to access getParentNodeId method.", e7);
                } catch (InvocationTargetException e8) {
                    AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "The getParentNodeId method threw an exception when invoked.", e8);
                }
            }
            return m20673l(accessibilityNodeInfo);
        }

        /* renamed from: h */
        public final Long m20676h(AccessibilityRecord accessibilityRecord) {
            Method method = this.f17677c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, null);
            } catch (IllegalAccessException e7) {
                AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "Failed to access the getRecordSourceNodeId method.", e7);
                return null;
            } catch (InvocationTargetException e8) {
                AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "The getRecordSourceNodeId method threw an exception when invoked.", e8);
                return null;
            }
        }

        /* renamed from: i */
        public final Long m20677i(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.f17675a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, null);
            } catch (IllegalAccessException e7) {
                AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "Failed to access getSourceNodeId method.", e7);
                return null;
            } catch (InvocationTargetException e8) {
                AbstractC6917b.m28360h(AccessibilityViewEmbedder.TAG, "The getSourceNodeId method threw an exception when invoked.", e8);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C4790b() {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Field field;
            Method method5;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
            } catch (NoSuchMethodException unused) {
                AbstractC6917b.m28359g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
            } catch (NoSuchMethodException unused2) {
                AbstractC6917b.m28359g(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT <= 26) {
                try {
                    method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
                } catch (NoSuchMethodException unused3) {
                    AbstractC6917b.m28359g(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                    method5 = null;
                }
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                    method4 = null;
                } catch (NoSuchMethodException unused4) {
                    AbstractC6917b.m28359g(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                    method3 = null;
                    method4 = null;
                }
                field = method4;
                method6 = method5;
            } else {
                try {
                    Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                    field = declaredField;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                    AbstractC6917b.m28359g(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    method4 = null;
                    field = 0;
                }
            }
            this.f17675a = method;
            this.f17676b = method6;
            this.f17677c = method2;
            this.f17678d = method3;
            this.f17679e = field;
            this.f17680f = method4;
        }
    }

    /* renamed from: io.flutter.view.AccessibilityViewEmbedder$c */
    public static class C4791c {

        /* renamed from: a */
        public final View f17681a;

        /* renamed from: b */
        public final int f17682b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4791c)) {
                return false;
            }
            C4791c c4791c = (C4791c) obj;
            return this.f17682b == c4791c.f17682b && this.f17681a.equals(c4791c.f17681a);
        }

        public int hashCode() {
            return ((this.f17681a.hashCode() + 31) * 31) + this.f17682b;
        }

        public C4791c(View view, int i7) {
            this.f17681a = view;
            this.f17682b = i7;
        }
    }

    public AccessibilityViewEmbedder(View view, int i7) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i7;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i7;
        for (int i8 = 0; i8 < accessibilityNodeInfo.getChildCount(); i8++) {
            Long m20674f = this.reflectionAccessors.m20674f(accessibilityNodeInfo, i8);
            if (m20674f != null) {
                int m20671j = C4790b.m20671j(m20674f.longValue());
                C4791c c4791c = new C4791c(view, m20671j);
                if (this.originToFlutterId.containsKey(c4791c)) {
                    i7 = this.originToFlutterId.get(c4791c).intValue();
                } else {
                    int i9 = this.nextFlutterId;
                    this.nextFlutterId = i9 + 1;
                    cacheVirtualIdMappings(view, m20671j, i9);
                    i7 = i9;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i7);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i7, int i8) {
        C4791c c4791c = new C4791c(view, i7);
        this.originToFlutterId.put(c4791c, Integer.valueOf(i8));
        this.flutterIdToOrigin.put(i8, c4791c);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i7, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i7);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i7);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        int drawingOrder;
        boolean isImportantForAccessibility;
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i7 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        if (i7 >= 24) {
            drawingOrder = accessibilityNodeInfo.getDrawingOrder();
            accessibilityNodeInfo2.setDrawingOrder(drawingOrder);
            isImportantForAccessibility = accessibilityNodeInfo.isImportantForAccessibility();
            accessibilityNodeInfo2.setImportantForAccessibility(isImportantForAccessibility);
        }
        if (i7 >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long m20675g = this.reflectionAccessors.m20675g(accessibilityNodeInfo);
        if (m20675g == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new C4791c(view, C4790b.m20671j(m20675g.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        C4791c c4791c = this.flutterIdToOrigin.get(i7);
        if (c4791c == null || !this.embeddedViewToDisplayBounds.containsKey(c4791c.f17681a) || c4791c.f17681a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = c4791c.f17681a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c4791c.f17682b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, c4791c.f17681a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long m20676h = this.reflectionAccessors.m20676h(accessibilityRecord);
        if (m20676h == null) {
            return null;
        }
        return this.originToFlutterId.get(new C4791c(view, C4790b.m20671j(m20676h.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i7, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long m20677i = this.reflectionAccessors.m20677i(createAccessibilityNodeInfo);
        if (m20677i == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, C4790b.m20671j(m20677i.longValue()), i7);
        return convertToFlutterNode(createAccessibilityNodeInfo, i7, view);
    }

    public boolean onAccessibilityHoverEvent(int i7, MotionEvent motionEvent) {
        C4791c c4791c = this.flutterIdToOrigin.get(i7);
        if (c4791c == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(c4791c.f17681a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i8] = pointerProperties;
            motionEvent.getPointerProperties(i8, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i8, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i8] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return c4791c.f17681a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i7, int i8, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        C4791c c4791c = this.flutterIdToOrigin.get(i7);
        if (c4791c == null || (accessibilityNodeProvider = c4791c.f17681a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(c4791c.f17682b, i8, bundle);
    }

    public View platformViewOfNode(int i7) {
        C4791c c4791c = this.flutterIdToOrigin.get(i7);
        if (c4791c == null) {
            return null;
        }
        return c4791c.f17681a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long m20676h = this.reflectionAccessors.m20676h(accessibilityEvent);
        if (m20676h == null) {
            return false;
        }
        int m20671j = C4790b.m20671j(m20676h.longValue());
        Integer num = this.originToFlutterId.get(new C4791c(view, m20671j));
        if (num == null) {
            int i7 = this.nextFlutterId;
            this.nextFlutterId = i7 + 1;
            Integer valueOf = Integer.valueOf(i7);
            cacheVirtualIdMappings(view, m20671j, i7);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i8 = 0; i8 < obtain.getRecordCount(); i8++) {
            AccessibilityRecord record = obtain.getRecord(i8);
            Long m20676h2 = this.reflectionAccessors.m20676h(record);
            if (m20676h2 == null) {
                return false;
            }
            C4791c c4791c = new C4791c(view, C4790b.m20671j(m20676h2.longValue()));
            if (!this.originToFlutterId.containsKey(c4791c)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(c4791c).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
