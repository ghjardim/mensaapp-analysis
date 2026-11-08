package p206c6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC5469l;
import p206c6.C3601M;

/* renamed from: c6.G */
/* loaded from: classes2.dex */
public class C3595G extends C3627o {
    @Override // p206c6.C3627o, p206c6.AbstractC3622j
    /* renamed from: a */
    public void mo14465a(C3601M source, C3601M target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        AbstractC5469l.m23028e(source, "source");
        AbstractC5469l.m23028e(target, "target");
        try {
            Path m14497r = source.m14497r();
            Path m14497r2 = target.m14497r();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(m14497r, m14497r2, AbstractC3631s.m14690a(standardCopyOption), AbstractC3631s.m14690a(standardCopyOption2));
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e7) {
            message = e7.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // p206c6.C3627o, p206c6.AbstractC3622j
    /* renamed from: h */
    public C3621i mo14466h(C3601M path) {
        AbstractC5469l.m23028e(path, "path");
        return m14467o(path.m14497r());
    }

    /* renamed from: o */
    public final C3621i m14467o(Path nioPath) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        boolean isRegularFile;
        boolean isDirectory;
        long size;
        FileTime creationTime;
        FileTime lastModifiedTime;
        FileTime lastAccessTime;
        AbstractC5469l.m23028e(nioPath, "nioPath");
        try {
            Class m14687a = AbstractC3628p.m14687a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) m14687a, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            Path readSymbolicLink = isSymbolicLink ? Files.readSymbolicLink(nioPath) : null;
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            C3601M m14501f = readSymbolicLink != null ? C3601M.a.m14501f(C3601M.f12052b, readSymbolicLink, false, 1, null) : null;
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            Long m14468p = creationTime != null ? m14468p(creationTime) : null;
            lastModifiedTime = readAttributes.lastModifiedTime();
            Long m14468p2 = lastModifiedTime != null ? m14468p(lastModifiedTime) : null;
            lastAccessTime = readAttributes.lastAccessTime();
            return new C3621i(isRegularFile, isDirectory, m14501f, valueOf, m14468p, m14468p2, lastAccessTime != null ? m14468p(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final Long m14468p(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // p206c6.C3627o
    public String toString() {
        return "NioSystemFileSystem";
    }
}
