package p142U1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import p256j$.util.DesugarCollections;

/* renamed from: U1.i */
/* loaded from: classes.dex */
public class C2510i implements Closeable {

    /* renamed from: a */
    public final int f7356a = 1179403647;

    /* renamed from: b */
    public final FileChannel f7357b;

    public C2510i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f7357b = new FileInputStream(file).getChannel();
    }

    /* renamed from: a */
    public final long m8461a(AbstractC2505d abstractC2505d, long j7, long j8) {
        for (long j9 = 0; j9 < j7; j9++) {
            AbstractC2506e mo8459b = abstractC2505d.mo8459b(j9);
            if (mo8459b.f7349a == 1) {
                long j10 = mo8459b.f7351c;
                if (j10 <= j8 && j8 <= mo8459b.f7352d + j10) {
                    return (j8 - j10) + mo8459b.f7350b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: c */
    public AbstractC2505d m8462c() {
        this.f7357b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m8469r(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short m8465h = m8465h(allocate, 4L);
        boolean z6 = m8465h(allocate, 5L) == 2;
        if (m8465h == 1) {
            return new C2508g(z6, this);
        }
        if (m8465h == 2) {
            return new C2509h(z6, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7357b.close();
    }

    /* renamed from: d */
    public List m8463d() {
        long j7;
        AbstractC2504c mo8458a;
        this.f7357b.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC2505d m8462c = m8462c();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(m8462c.f7340a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j8 = m8462c.f7345f;
        int i7 = 0;
        if (j8 == 65535) {
            j8 = m8462c.mo8460c(0).f7353a;
        }
        long j9 = 0;
        while (true) {
            if (j9 >= j8) {
                j7 = 0;
                break;
            }
            AbstractC2506e mo8459b = m8462c.mo8459b(j9);
            if (mo8459b.f7349a == 2) {
                j7 = mo8459b.f7350b;
                break;
            }
            j9++;
        }
        if (j7 == 0) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j10 = 0;
        do {
            mo8458a = m8462c.mo8458a(j7, i7);
            long j11 = mo8458a.f7338a;
            if (j11 == 1) {
                arrayList2.add(Long.valueOf(mo8458a.f7339b));
            } else if (j11 == 5) {
                j10 = mo8458a.f7339b;
            }
            i7++;
        } while (mo8458a.f7338a != 0);
        if (j10 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long m8461a = m8461a(m8462c, j8, j10);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(m8468o(allocate, ((Long) it.next()).longValue() + m8461a));
        }
        return arrayList;
    }

    /* renamed from: g */
    public void m8464g(ByteBuffer byteBuffer, long j7, int i7) {
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        long j8 = 0;
        while (j8 < i7) {
            int read = this.f7357b.read(byteBuffer, j7 + j8);
            if (read == -1) {
                throw new EOFException();
            }
            j8 += read;
        }
        byteBuffer.position(0);
    }

    /* renamed from: h */
    public short m8465h(ByteBuffer byteBuffer, long j7) {
        m8464g(byteBuffer, j7, 1);
        return (short) (byteBuffer.get() & ForkServer.ERROR);
    }

    /* renamed from: j */
    public int m8466j(ByteBuffer byteBuffer, long j7) {
        m8464g(byteBuffer, j7, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: m */
    public long m8467m(ByteBuffer byteBuffer, long j7) {
        m8464g(byteBuffer, j7, 8);
        return byteBuffer.getLong();
    }

    /* renamed from: o */
    public String m8468o(ByteBuffer byteBuffer, long j7) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j8 = 1 + j7;
            short m8465h = m8465h(byteBuffer, j7);
            if (m8465h == 0) {
                return sb.toString();
            }
            sb.append((char) m8465h);
            j7 = j8;
        }
    }

    /* renamed from: r */
    public long m8469r(ByteBuffer byteBuffer, long j7) {
        m8464g(byteBuffer, j7, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
