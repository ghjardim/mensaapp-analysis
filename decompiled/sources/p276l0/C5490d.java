package p276l0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p259j0.AbstractC5330M;

/* renamed from: l0.d */
/* loaded from: classes.dex */
public final class C5490d extends AbstractC5488b {

    /* renamed from: e */
    public final ContentResolver f19764e;

    /* renamed from: f */
    public Uri f19765f;

    /* renamed from: g */
    public AssetFileDescriptor f19766g;

    /* renamed from: h */
    public FileInputStream f19767h;

    /* renamed from: i */
    public long f19768i;

    /* renamed from: j */
    public boolean f19769j;

    /* renamed from: l0.d$a */
    public static class a extends C5494h {
        public a(IOException iOException, int i7) {
            super(iOException, i7);
        }
    }

    public C5490d(Context context) {
        super(false);
        this.f19764e = context.getContentResolver();
    }

    @Override // p276l0.InterfaceC5493g
    public void close() {
        this.f19765f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f19767h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f19767h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19766g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new a(e7, 2000);
                    }
                } finally {
                    this.f19766g = null;
                    if (this.f19769j) {
                        this.f19769j = false;
                        m23070w();
                    }
                }
            } catch (IOException e8) {
                throw new a(e8, 2000);
            }
        } catch (Throwable th) {
            this.f19767h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19766g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19766g = null;
                    if (this.f19769j) {
                        this.f19769j = false;
                        m23070w();
                    }
                    throw th;
                } catch (IOException e9) {
                    throw new a(e9, 2000);
                }
            } finally {
                this.f19766g = null;
                if (this.f19769j) {
                    this.f19769j = false;
                    m23070w();
                }
            }
        }
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: o */
    public long mo714o(C5497k c5497k) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri normalizeScheme = c5497k.f19781a.normalizeScheme();
            this.f19765f = normalizeScheme;
            m23071x(c5497k);
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f19764e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f19764e.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f19766g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f19767h = fileInputStream;
            if (length != -1 && c5497k.f19787g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c5497k.f19787g + startOffset) - startOffset;
            if (skip != c5497k.f19787g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f19768i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f19768i = position;
                    if (position < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j7 = length - skip;
                this.f19768i = j7;
                if (j7 < 0) {
                    throw new a(null, 2008);
                }
            }
            long j8 = c5497k.f19788h;
            if (j8 != -1) {
                long j9 = this.f19768i;
                if (j9 != -1) {
                    j8 = Math.min(j9, j8);
                }
                this.f19768i = j8;
            }
            this.f19769j = true;
            m23072y(c5497k);
            long j10 = c5497k.f19788h;
            return j10 != -1 ? j10 : this.f19768i;
        } catch (a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f19768i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new a(e7, 2000);
            }
        }
        int read = ((FileInputStream) AbstractC5330M.m21747i(this.f19767h)).read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f19768i;
        if (j8 != -1) {
            this.f19768i = j8 - read;
        }
        m23069v(read);
        return read;
    }

    @Override // p276l0.InterfaceC5493g
    /* renamed from: s */
    public Uri mo715s() {
        return this.f19765f;
    }
}
