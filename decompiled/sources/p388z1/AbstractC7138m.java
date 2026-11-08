package p388z1;

import java.util.Arrays;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: z1.m */
/* loaded from: classes.dex */
public abstract class AbstractC7138m {

    /* renamed from: a */
    public static final byte[] f25368a = {48, 49, 53, 0};

    /* renamed from: b */
    public static final byte[] f25369b = {48, 49, 48, 0};

    /* renamed from: c */
    public static final byte[] f25370c = {48, 48, 57, 0};

    /* renamed from: d */
    public static final byte[] f25371d = {48, 48, 53, 0};

    /* renamed from: e */
    public static final byte[] f25372e = {48, 48, 49, 0};

    /* renamed from: f */
    public static final byte[] f25373f = {48, 48, 49, 0};

    /* renamed from: g */
    public static final byte[] f25374g = {48, 48, 50, 0};

    /* renamed from: a */
    public static String m29439a(byte[] bArr) {
        return (Arrays.equals(bArr, f25372e) || Arrays.equals(bArr, f25371d)) ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "!";
    }
}
