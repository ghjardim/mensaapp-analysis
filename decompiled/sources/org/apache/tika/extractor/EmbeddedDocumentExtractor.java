package org.apache.tika.extractor;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;

/* loaded from: classes2.dex */
public interface EmbeddedDocumentExtractor {
    void parseEmbedded(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, boolean z6);

    boolean shouldParseEmbedded(Metadata metadata);
}
