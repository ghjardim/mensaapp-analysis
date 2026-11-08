package p206c6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: c6.o */
/* loaded from: classes2.dex */
public class C3627o extends AbstractC3622j {
    @Override // p206c6.AbstractC3622j
    /* renamed from: a */
    public void mo14465a(C3601M source, C3601M target) {
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(target, "target");
        if (source.m14496q().renameTo(target.m14496q())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: d */
    public void mo14555d(C3601M dir, boolean z6) {
        AbstractC5469l.m23028e(dir, "dir");
        if (dir.m14496q().mkdir()) {
            return;
        }
        C3621i mo14466h = mo14466h(dir);
        if (mo14466h == null || !mo14466h.m14675c()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z6) {
            throw new IOException(dir + " already exist.");
        }
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: f */
    public void mo14556f(C3601M path, boolean z6) {
        AbstractC5469l.m23028e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File m14496q = path.m14496q();
        if (m14496q.delete()) {
            return;
        }
        if (m14496q.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z6) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: h */
    public C3621i mo14466h(C3601M path) {
        AbstractC5469l.m23028e(path, "path");
        File m14496q = path.m14496q();
        boolean isFile = m14496q.isFile();
        boolean isDirectory = m14496q.isDirectory();
        long lastModified = m14496q.lastModified();
        long length = m14496q.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || m14496q.exists()) {
            return new C3621i(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: i */
    public AbstractC3620h mo14557i(C3601M file) {
        AbstractC5469l.m23028e(file, "file");
        return new C3626n(false, new RandomAccessFile(file.m14496q(), "r"));
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: k */
    public AbstractC3620h mo14558k(C3601M file, boolean z6, boolean z7) {
        AbstractC5469l.m23028e(file, "file");
        if (z6 && z7) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z6) {
            m14685m(file);
        }
        if (z7) {
            m14686n(file);
        }
        return new C3626n(true, new RandomAccessFile(file.m14496q(), "rw"));
    }

    @Override // p206c6.AbstractC3622j
    /* renamed from: l */
    public InterfaceC3609V mo14559l(C3601M file) {
        AbstractC5469l.m23028e(file, "file");
        return AbstractC3596H.m14473e(file.m14496q());
    }

    /* renamed from: m */
    public final void m14685m(C3601M c3601m) {
        if (m14680g(c3601m)) {
            throw new IOException(c3601m + " already exists.");
        }
    }

    /* renamed from: n */
    public final void m14686n(C3601M c3601m) {
        if (m14680g(c3601m)) {
            return;
        }
        throw new IOException(c3601m + " doesn't exist.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
