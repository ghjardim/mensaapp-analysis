package p237g5;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: g5.l */
/* loaded from: classes2.dex */
public interface InterfaceC4447l extends InterfaceC4451n, InterfaceC4463u {

    /* renamed from: g5.l$a */
    public static final class a implements InterfaceC4447l {
        @Override // p237g5.InterfaceC4451n, p237g5.InterfaceC4463u
        /* renamed from: a */
        public String mo18944a() {
            return "gzip";
        }

        @Override // p237g5.InterfaceC4463u
        /* renamed from: b */
        public InputStream mo18945b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // p237g5.InterfaceC4451n
        /* renamed from: c */
        public OutputStream mo18946c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* renamed from: g5.l$b */
    public static final class b implements InterfaceC4447l {

        /* renamed from: a */
        public static final InterfaceC4447l f15793a = new b();

        @Override // p237g5.InterfaceC4451n, p237g5.InterfaceC4463u
        /* renamed from: a */
        public String mo18944a() {
            return "identity";
        }

        @Override // p237g5.InterfaceC4463u
        /* renamed from: b */
        public InputStream mo18945b(InputStream inputStream) {
            return inputStream;
        }

        @Override // p237g5.InterfaceC4451n
        /* renamed from: c */
        public OutputStream mo18946c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
