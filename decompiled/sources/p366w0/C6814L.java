package p366w0;

import android.media.MediaCodec;
import android.os.Bundle;
import p284m0.C5555c;

/* renamed from: w0.L */
/* loaded from: classes.dex */
public class C6814L implements InterfaceC6828n {

    /* renamed from: a */
    public final MediaCodec f24485a;

    public C6814L(MediaCodec mediaCodec) {
        this.f24485a = mediaCodec;
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: a */
    public void mo28033a(Bundle bundle) {
        this.f24485a.setParameters(bundle);
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: b */
    public void mo28034b(int i7, int i8, C5555c c5555c, long j7, int i9) {
        this.f24485a.queueSecureInputBuffer(i7, i8, c5555c.m23280a(), j7, i9);
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: c */
    public void mo28035c(int i7, int i8, int i9, long j7, int i10) {
        this.f24485a.queueInputBuffer(i7, i8, i9, j7, i10);
    }

    @Override // p366w0.InterfaceC6828n
    /* renamed from: d */
    public void mo28036d() {
    }

    @Override // p366w0.InterfaceC6828n
    public void flush() {
    }

    @Override // p366w0.InterfaceC6828n
    public void shutdown() {
    }

    @Override // p366w0.InterfaceC6828n
    public void start() {
    }
}
