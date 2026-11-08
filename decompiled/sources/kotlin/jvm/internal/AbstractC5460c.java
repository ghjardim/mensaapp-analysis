package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p062I5.C0668b;
import p111P5.EnumC1977k;
import p111P5.InterfaceC1968b;
import p111P5.InterfaceC1971e;
import p111P5.InterfaceC1976j;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5460c implements InterfaceC1968b, Serializable {
    public static final Object NO_RECEIVER = a.f19695a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1968b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.c$a */
    public static class a implements Serializable {

        /* renamed from: a */
        public static final a f19695a = new a();
    }

    public AbstractC5460c(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override // p111P5.InterfaceC1968b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p111P5.InterfaceC1968b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1968b compute() {
        InterfaceC1968b interfaceC1968b = this.reflected;
        if (interfaceC1968b != null) {
            return interfaceC1968b;
        }
        InterfaceC1968b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract InterfaceC1968b computeReflected();

    @Override // p111P5.InterfaceC1967a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p111P5.InterfaceC1968b
    public String getName() {
        return this.name;
    }

    public InterfaceC1971e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC5481x.m23041c(cls) : AbstractC5481x.m23040b(cls);
    }

    @Override // p111P5.InterfaceC1968b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC1968b getReflected() {
        InterfaceC1968b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C0668b();
    }

    @Override // p111P5.InterfaceC1968b
    public InterfaceC1976j getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p111P5.InterfaceC1968b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p111P5.InterfaceC1968b
    public EnumC1977k getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p111P5.InterfaceC1968b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p111P5.InterfaceC1968b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p111P5.InterfaceC1968b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
