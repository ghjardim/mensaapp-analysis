package p215e;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7024o;

/* renamed from: e.b */
/* loaded from: classes.dex */
public abstract class AbstractC4142b extends AbstractC4141a {

    /* renamed from: a */
    public static final a f13878a = new a(null);

    /* renamed from: e.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final List m17392a(Intent intent) {
            AbstractC5469l.m23028e(intent, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return AbstractC7024o.m28861g();
            }
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i7 = 0; i7 < itemCount; i7++) {
                    Uri uri = clipData.getItemAt(i7).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        public a() {
        }
    }
}
