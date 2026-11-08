package org.apache.tika.p307io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class TemporaryResources implements Closeable {
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(TemporaryResources.class);
    private final LinkedList<Closeable> resources = new LinkedList<>();
    private Path tempFileDir = null;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createTempFile$0(Path path) {
        File file;
        try {
            Files.delete(path);
        } catch (IOException unused) {
            LOG.mo26380x("delete tmp file fail, will delete it on exit");
            file = path.toFile();
            file.deleteOnExit();
        }
    }

    public void addResource(Closeable closeable) {
        this.resources.addFirst(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<Closeable> it = this.resources.iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e7) {
                if (iOException == null) {
                    iOException = e7;
                } else {
                    iOException.addSuppressed(e7);
                }
            }
        }
        this.resources.clear();
        if (iOException != null) {
            throw iOException;
        }
    }

    public Path createTempFile(String str) {
        if (StringUtils.isBlank(str)) {
            str = ".tmp";
        }
        Path path = this.tempFileDir;
        final Path createTempFile = path == null ? Files.createTempFile("apache-tika-", str, new FileAttribute[0]) : Files.createTempFile(path, "apache-tika-", str, new FileAttribute[0]);
        addResource(new Closeable() { // from class: org.apache.tika.io.f
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                TemporaryResources.lambda$createTempFile$0(createTempFile);
            }
        });
        return createTempFile;
    }

    public File createTemporaryFile() {
        File file;
        file = createTempFile(StringUtils.EMPTY).toFile();
        return file;
    }

    public void dispose() {
        try {
            close();
        } catch (IOException e7) {
            throw new TikaException("Failed to close temporary resources", e7);
        }
    }

    public <T extends Closeable> T getResource(Class<T> cls) {
        Iterator<Closeable> it = this.resources.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (cls.isAssignableFrom(t7.getClass())) {
                return t7;
            }
        }
        return null;
    }

    public void setTemporaryFileDirectory(Path path) {
        this.tempFileDir = path;
    }

    public void setTemporaryFileDirectory(File file) {
        this.tempFileDir = file == null ? null : file.toPath();
    }

    public Path createTempFile() {
        return createTempFile(StringUtils.EMPTY);
    }

    public Path createTempFile(Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        if (StringUtils.isBlank(str)) {
            return createTempFile(StringUtils.EMPTY);
        }
        return createTempFile(FilenameUtils.getSuffixFromPath(str));
    }
}
