package p075K4;

import android.view.PointerIcon;
import java.util.HashMap;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p054H4.C0577m;
import p256j$.util.Map;

/* renamed from: K4.a */
/* loaded from: classes.dex */
public class C0833a {

    /* renamed from: c */
    public static HashMap f2870c;

    /* renamed from: a */
    public final c f2871a;

    /* renamed from: b */
    public final C0577m f2872b;

    /* renamed from: K4.a$a */
    public class a implements C0577m.b {
        public a() {
        }

        @Override // p054H4.C0577m.b
        /* renamed from: a */
        public void mo2211a(String str) {
            C0833a.this.f2871a.setPointerIcon(C0833a.this.m3496d(str));
        }
    }

    /* renamed from: K4.a$b */
    public class b extends HashMap {
        public b() {
            put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
            put("allScroll", 1013);
            put("basic", Integer.valueOf(PipesIterator.DEFAULT_QUEUE_SIZE));
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: K4.a$c */
    public interface c {
        /* renamed from: a */
        PointerIcon mo3497a(int i7);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C0833a(c cVar, C0577m c0577m) {
        this.f2871a = cVar;
        this.f2872b = c0577m;
        c0577m.m2210b(new a());
    }

    /* renamed from: c */
    public void m3495c() {
        this.f2872b.m2210b(null);
    }

    /* renamed from: d */
    public final PointerIcon m3496d(String str) {
        if (f2870c == null) {
            f2870c = new b();
        }
        return this.f2871a.mo3497a(((Integer) Map.EL.getOrDefault(f2870c, str, Integer.valueOf(PipesIterator.DEFAULT_QUEUE_SIZE))).intValue());
    }
}
