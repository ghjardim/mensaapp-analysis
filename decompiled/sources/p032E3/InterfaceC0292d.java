package p032E3;

/* renamed from: E3.d */
/* loaded from: classes.dex */
public @interface InterfaceC0292d {

    /* renamed from: E3.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
