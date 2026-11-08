package p306o6;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.fetcher.RangeFetcher;

/* renamed from: o6.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5944a {
    /* renamed from: a */
    public static InputStream m24973a(RangeFetcher rangeFetcher, String str, long j7, long j8, Metadata metadata) {
        return rangeFetcher.fetch(str, j7, j8, metadata, new ParseContext());
    }
}
