package p163X1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: X1.n */
/* loaded from: classes.dex */
public abstract class AbstractC2812n {
    /* renamed from: a */
    public static AbstractC2812n m10062a(long j7) {
        return new C2806h(j7);
    }

    /* renamed from: b */
    public static AbstractC2812n m10063b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? m10062a(Long.parseLong(jsonReader.nextString())) : m10062a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo10047c();
}
