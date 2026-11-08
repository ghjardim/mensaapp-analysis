package p238g6;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;

/* renamed from: g6.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4473e {

    /* renamed from: a */
    public static final OpenOption[] f15906a;

    /* renamed from: b */
    public static final OpenOption[] f15907b;

    /* renamed from: c */
    public static final CopyOption[] f15908c;

    /* renamed from: d */
    public static final InterfaceC4469a[] f15909d;

    /* renamed from: e */
    public static final FileAttribute[] f15910e;

    /* renamed from: f */
    public static final FileVisitOption[] f15911f;

    /* renamed from: g */
    public static final LinkOption[] f15912g;

    /* renamed from: h */
    public static final LinkOption[] f15913h;

    /* renamed from: i */
    public static final LinkOption f15914i;

    /* renamed from: j */
    public static final OpenOption[] f15915j;

    /* renamed from: k */
    public static final Path[] f15916k;

    static {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        StandardOpenOption standardOpenOption4;
        LinkOption linkOption;
        standardOpenOption = StandardOpenOption.CREATE;
        standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        f15906a = new OpenOption[]{standardOpenOption, standardOpenOption2};
        standardOpenOption3 = StandardOpenOption.CREATE;
        standardOpenOption4 = StandardOpenOption.APPEND;
        f15907b = new OpenOption[]{standardOpenOption3, standardOpenOption4};
        f15908c = new CopyOption[0];
        f15909d = new InterfaceC4469a[0];
        f15910e = new FileAttribute[0];
        f15911f = new FileVisitOption[0];
        f15912g = new LinkOption[0];
        linkOption = LinkOption.NOFOLLOW_LINKS;
        f15913h = new LinkOption[]{linkOption};
        f15914i = null;
        f15915j = new OpenOption[0];
        f15916k = new Path[0];
    }
}
