package org.apache.tika.extractor;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;

/* loaded from: classes2.dex */
public interface EmbeddedStreamTranslator {
    boolean shouldTranslate(InputStream inputStream, Metadata metadata);

    InputStream translate(InputStream inputStream, Metadata metadata);
}
