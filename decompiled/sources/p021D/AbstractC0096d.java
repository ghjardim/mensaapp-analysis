package p021D;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6926i;

/* renamed from: D.d */
/* loaded from: classes.dex */
public abstract class AbstractC0096d {
    /* renamed from: a */
    public static final Bundle m252a(C6926i... c6926iArr) {
        Bundle bundle = new Bundle(c6926iArr.length);
        for (C6926i c6926i : c6926iArr) {
            String str = (String) c6926i.m28368a();
            Object m28369b = c6926i.m28369b();
            if (m28369b == null) {
                bundle.putString(str, null);
            } else if (m28369b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) m28369b).booleanValue());
            } else if (m28369b instanceof Byte) {
                bundle.putByte(str, ((Number) m28369b).byteValue());
            } else if (m28369b instanceof Character) {
                bundle.putChar(str, ((Character) m28369b).charValue());
            } else if (m28369b instanceof Double) {
                bundle.putDouble(str, ((Number) m28369b).doubleValue());
            } else if (m28369b instanceof Float) {
                bundle.putFloat(str, ((Number) m28369b).floatValue());
            } else if (m28369b instanceof Integer) {
                bundle.putInt(str, ((Number) m28369b).intValue());
            } else if (m28369b instanceof Long) {
                bundle.putLong(str, ((Number) m28369b).longValue());
            } else if (m28369b instanceof Short) {
                bundle.putShort(str, ((Number) m28369b).shortValue());
            } else if (m28369b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) m28369b);
            } else if (m28369b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) m28369b);
            } else if (m28369b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) m28369b);
            } else if (m28369b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) m28369b);
            } else if (m28369b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) m28369b);
            } else if (m28369b instanceof char[]) {
                bundle.putCharArray(str, (char[]) m28369b);
            } else if (m28369b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) m28369b);
            } else if (m28369b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) m28369b);
            } else if (m28369b instanceof int[]) {
                bundle.putIntArray(str, (int[]) m28369b);
            } else if (m28369b instanceof long[]) {
                bundle.putLongArray(str, (long[]) m28369b);
            } else if (m28369b instanceof short[]) {
                bundle.putShortArray(str, (short[]) m28369b);
            } else if (m28369b instanceof Object[]) {
                Class<?> componentType = m28369b.getClass().getComponentType();
                AbstractC5469l.m23025b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC5469l.m23026c(m28369b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) m28369b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC5469l.m23026c(m28369b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) m28369b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC5469l.m23026c(m28369b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) m28369b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) m28369b);
                }
            } else if (m28369b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) m28369b);
            } else if (m28369b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) m28369b);
            } else if (m28369b instanceof Size) {
                C0094b.m248a(bundle, str, (Size) m28369b);
            } else {
                if (!(m28369b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + m28369b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                C0094b.m249b(bundle, str, (SizeF) m28369b);
            }
        }
        return bundle;
    }
}
