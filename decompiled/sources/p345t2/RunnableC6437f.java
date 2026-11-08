package p345t2;

import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.AbstractC3651i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3718u;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.tika.metadata.HttpHeaders;
import p003A2.C0019a;

/* renamed from: t2.f */
/* loaded from: classes.dex */
public final class RunnableC6437f implements Runnable {

    /* renamed from: c */
    public static final C0019a f23342c = new C0019a("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    public final String f23343a;

    /* renamed from: b */
    public final C3718u f23344b = new C3718u(null);

    public RunnableC6437f(String str) {
        this.f23343a = AbstractC3802r.m15123e(str);
    }

    /* renamed from: a */
    public static AbstractC3650h m26930a(String str) {
        if (str == null) {
            return AbstractC3651i.m14821a(new Status(4), null);
        }
        RunnableC6437f runnableC6437f = new RunnableC6437f(str);
        new Thread(runnableC6437f).start();
        return runnableC6437f.f23344b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f12250o;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f23343a).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f12248f;
            } else {
                f23342c.m61c("Unable to revoke access!", new Object[0]);
            }
            f23342c.m59a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            f23342c.m61c("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            f23342c.m61c("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f23344b.setResult(status);
    }
}
