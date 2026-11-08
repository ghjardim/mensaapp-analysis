package p349t6;

/* renamed from: t6.k */
/* loaded from: classes2.dex */
public abstract class AbstractC6573k {
    /* renamed from: a */
    public static Throwable m27289a(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Object[] m27290b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }
}
