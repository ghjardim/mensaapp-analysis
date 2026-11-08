package org.apache.tika.extractor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import p222e6.AbstractC4213g;
import p254i6.C4652g;

/* loaded from: classes2.dex */
public class BasicEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private final EmbeddedDocumentBytesConfig config;
    Map<Integer, byte[]> docBytes = new HashMap();

    public BasicEmbeddedDocumentBytesHandler(EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig) {
        this.config = embeddedDocumentBytesConfig;
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i7, Metadata metadata, InputStream inputStream) {
        super.add(i7, metadata, inputStream);
        this.docBytes.put(Integer.valueOf(i7), AbstractC4213g.m17653u(inputStream));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public InputStream getDocument(int i7) {
        return ((C4652g.b) new C4652g.b().m17934d(this.docBytes.get(Integer.valueOf(i7)))).m20179l();
    }
}
