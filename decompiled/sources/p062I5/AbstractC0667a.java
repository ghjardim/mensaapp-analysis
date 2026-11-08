package p062I5;

import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5481x;
import kotlin.jvm.internal.InterfaceC5461d;
import p111P5.InterfaceC1969c;

/* renamed from: I5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0667a {
    /* renamed from: a */
    public static final Class m2675a(InterfaceC1969c interfaceC1969c) {
        AbstractC5469l.m23028e(interfaceC1969c, "<this>");
        Class mo23014c = ((InterfaceC5461d) interfaceC1969c).mo23014c();
        AbstractC5469l.m23026c(mo23014c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return mo23014c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final Class m2676b(InterfaceC1969c interfaceC1969c) {
        AbstractC5469l.m23028e(interfaceC1969c, "<this>");
        Class mo23014c = ((InterfaceC5461d) interfaceC1969c).mo23014c();
        if (!mo23014c.isPrimitive()) {
            AbstractC5469l.m23026c(mo23014c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return mo23014c;
        }
        String name = mo23014c.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    mo23014c = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    mo23014c = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    mo23014c = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    mo23014c = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    mo23014c = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    mo23014c = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    mo23014c = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    mo23014c = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    mo23014c = Short.class;
                    break;
                }
                break;
        }
        AbstractC5469l.m23026c(mo23014c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return mo23014c;
    }

    /* renamed from: c */
    public static final InterfaceC1969c m2677c(Class cls) {
        AbstractC5469l.m23028e(cls, "<this>");
        return AbstractC5481x.m23040b(cls);
    }
}
