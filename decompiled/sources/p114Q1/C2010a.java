package p114Q1;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC5469l;
import org.apache.tika.utils.StringUtils;
import p062I5.AbstractC0667a;
import p069J5.InterfaceC0789a;
import p111P5.InterfaceC1969c;

/* renamed from: Q1.a */
/* loaded from: classes.dex */
public final class C2010a {

    /* renamed from: a */
    public static final C2010a f6218a = new C2010a();

    /* renamed from: e */
    public static final boolean m7145e(String str, InterfaceC0789a block) {
        AbstractC5469l.m23028e(block, "block");
        try {
            boolean booleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFound: ");
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            sb.append(str);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchMethod: ");
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m7146a(InterfaceC0789a classLoader) {
        AbstractC5469l.m23028e(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m7147b(Method method, InterfaceC1969c clazz) {
        AbstractC5469l.m23028e(method, "<this>");
        AbstractC5469l.m23028e(clazz, "clazz");
        return m7148c(method, AbstractC0667a.m2675a(clazz));
    }

    /* renamed from: c */
    public final boolean m7148c(Method method, Class clazz) {
        AbstractC5469l.m23028e(method, "<this>");
        AbstractC5469l.m23028e(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }

    /* renamed from: d */
    public final boolean m7149d(Method method) {
        AbstractC5469l.m23028e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
