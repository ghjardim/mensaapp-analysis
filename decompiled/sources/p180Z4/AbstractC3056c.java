package p180Z4;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p061I4.C0664p;

/* renamed from: Z4.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3056c {

    /* renamed from: Z4.c$a */
    public static class a extends C0664p {

        /* renamed from: d */
        public static final a f9495d = new a();

        @Override // p061I4.C0664p
        /* renamed from: g */
        public Object mo2670g(byte b7, ByteBuffer byteBuffer) {
            return super.mo2670g(b7, byteBuffer);
        }

        @Override // p061I4.C0664p
        /* renamed from: p */
        public void mo2671p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.mo2671p(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: Z4.c$b */
    public interface b {
        /* renamed from: a */
        Map mo11213a(String str, List list);

        /* renamed from: b */
        Boolean mo11214b(String str, List list);

        /* renamed from: c */
        Boolean mo11215c(String str, Long l7);

        /* renamed from: d */
        Boolean mo11216d(String str, String str2);

        /* renamed from: e */
        Boolean mo11217e(String str, String str2);

        /* renamed from: f */
        Boolean mo11218f(String str, List list);

        /* renamed from: g */
        Boolean mo11219g(String str, Boolean bool);

        /* renamed from: h */
        Boolean mo11220h(String str, Double d7);

        Boolean remove(String str);
    }

    /* renamed from: a */
    public static ArrayList m11224a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
