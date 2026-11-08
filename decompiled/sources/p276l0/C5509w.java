package p276l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: l0.w */
/* loaded from: classes.dex */
public final class C5509w extends AbstractC5488b {

    /* renamed from: e */
    public final Context f19857e;

    /* renamed from: f */
    public C5497k f19858f;

    /* renamed from: g */
    public AssetFileDescriptor f19859g;

    /* renamed from: h */
    public InputStream f19860h;

    /* renamed from: i */
    public long f19861i;

    /* renamed from: j */
    public boolean f19862j;

    /* renamed from: l0.w$a */
    public static class a extends C5494h {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th, int i7) {
            super(str, th, i7);
        }
    }

    public C5509w(Context context) {
        super(false);
        this.f19857e = context.getApplicationContext();
    }

    /* renamed from: A */
    public static int m23134A(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    /* renamed from: z */
    public static AssetFileDescriptor m23135z(Context context, C5497k c5497k) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = c5497k.f19781a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = m23134A(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String str = (String) AbstractC5332a.m21800e(normalizeScheme.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (str.matches("\\d+")) {
                identifier = m23134A(str);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new a("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e8) {
            throw new a(null, e8, 2005);
        }
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f19858f = null;
        try {
            try {
                InputStream inputStream = this.f19860h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f19860h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19859g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new a(null, e7, 2000);
                    }
                } finally {
                    this.f19859g = null;
                    if (this.f19862j) {
                        this.f19862j = false;
                        m23070w();
                    }
                }
            } catch (IOException e8) {
                throw new a(null, e8, 2000);
            }
        } catch (Throwable th) {
            this.f19860h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19859g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19859g = null;
                    if (this.f19862j) {
                        this.f19862j = false;
                        m23070w();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new a(null, e9, 2000);
                }
            } finally {
                this.f19859g = null;
                if (this.f19862j) {
                    this.f19862j = false;
                    m23070w();
                }
            }
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        this.f19858f = c5497k;
        m23071x(c5497k);
        AssetFileDescriptor m23135z = m23135z(this.f19857e, c5497k);
        this.f19859g = m23135z;
        long length = m23135z.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f19859g.getFileDescriptor());
        this.f19860h = fileInputStream;
        if (length != -1) {
            try {
                if (c5497k.f19787g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e7) {
                throw e7;
            } catch (IOException e8) {
                throw new a(null, e8, 2000);
            }
        }
        long startOffset = this.f19859g.getStartOffset();
        long skip = fileInputStream.skip(c5497k.f19787g + startOffset) - startOffset;
        if (skip != c5497k.f19787g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f19861i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f19861i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j7 = length - skip;
            this.f19861i = j7;
            if (j7 < 0) {
                throw new C5494h(2008);
            }
        }
        long j8 = c5497k.f19788h;
        if (j8 != -1) {
            long j9 = this.f19861i;
            if (j9 != -1) {
                j8 = Math.min(j9, j8);
            }
            this.f19861i = j8;
        }
        this.f19862j = true;
        m23072y(c5497k);
        long j10 = c5497k.f19788h;
        return j10 != -1 ? j10 : this.f19861i;
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19861i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(null, e7, 2000);
            }
        }
        int read = ((InputStream) AbstractC5330M.m21747i(this.f19860h)).read(bArr, i7, i8);
        if (read == -1) {
            if (this.f19861i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j8 = this.f19861i;
        if (j8 != -1) {
            this.f19861i = j8 - read;
        }
        m23069v(read);
        return read;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        C5497k c5497k = this.f19858f;
        if (c5497k != null) {
            return c5497k.f19781a;
        }
        return null;
    }
}
