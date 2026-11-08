package org.apache.tika.renderer;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.file.Files;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.p307io.TemporaryResources;
import org.apache.tika.p307io.TikaInputStream;
import org.apache.tika.pipes.pipesiterator.p309fs.AbstractC6014b;

/* loaded from: classes2.dex */
public class RenderResult implements Closeable {

    /* renamed from: id */
    private final int f21462id;
    private final Metadata metadata;
    private final Object result;
    private final STATUS status;
    TemporaryResources tmp = new TemporaryResources();

    public enum STATUS {
        SUCCESS,
        EXCEPTION,
        TIMEOUT
    }

    public RenderResult(STATUS status, int i7, final Object obj, Metadata metadata) {
        this.status = status;
        this.f21462id = i7;
        this.result = obj;
        this.metadata = metadata;
        if (AbstractC6021a.m25076a(obj)) {
            this.tmp.addResource(new Closeable() { // from class: org.apache.tika.renderer.RenderResult.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Files.delete(AbstractC6014b.m25072a(obj));
                }
            });
        } else if (obj instanceof Closeable) {
            this.tmp.addResource((Closeable) obj);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.tmp.close();
    }

    public int getId() {
        return this.f21462id;
    }

    public InputStream getInputStream() {
        if (AbstractC6021a.m25076a(this.result)) {
            return TikaInputStream.get(AbstractC6014b.m25072a(this.result), this.metadata);
        }
        TikaInputStream tikaInputStream = TikaInputStream.get(new byte[0]);
        tikaInputStream.setOpenContainer(this.result);
        return tikaInputStream;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public STATUS getStatus() {
        return this.status;
    }
}
