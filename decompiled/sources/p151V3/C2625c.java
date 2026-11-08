package p151V3;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p219e3.C4176f;

/* renamed from: V3.c */
/* loaded from: classes.dex */
public class C2625c {

    /* renamed from: a */
    public File f7768a;

    /* renamed from: b */
    public final C4176f f7769b;

    /* renamed from: V3.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C2625c(C4176f c4176f) {
        this.f7769b = c4176f;
    }

    /* renamed from: a */
    public final File m9031a() {
        if (this.f7768a == null) {
            synchronized (this) {
                try {
                    if (this.f7768a == null) {
                        this.f7768a = new File(this.f7769b.m17532m().getFilesDir(), "PersistedInstallation." + this.f7769b.m17535s() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f7768a;
    }

    /* renamed from: b */
    public AbstractC2626d m9032b(AbstractC2626d abstractC2626d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC2626d.mo9008d());
            jSONObject.put("Status", abstractC2626d.mo9011g().ordinal());
            jSONObject.put("AuthToken", abstractC2626d.mo9006b());
            jSONObject.put("RefreshToken", abstractC2626d.mo9010f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC2626d.mo9012h());
            jSONObject.put("ExpiresInSecs", abstractC2626d.mo9007c());
            jSONObject.put("FisError", abstractC2626d.mo9009e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f7769b.m17532m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(m9031a())) {
            return abstractC2626d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: c */
    public final JSONObject m9033c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m9031a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: d */
    public AbstractC2626d m9034d() {
        JSONObject m9033c = m9033c();
        String optString = m9033c.optString("Fid", null);
        int optInt = m9033c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m9033c.optString("AuthToken", null);
        String optString3 = m9033c.optString("RefreshToken", null);
        long optLong = m9033c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m9033c.optLong("ExpiresInSecs", 0L);
        return AbstractC2626d.m9036a().mo9017d(optString).mo9020g(a.values()[optInt]).mo9015b(optString2).mo9019f(optString3).mo9021h(optLong).mo9016c(optLong2).mo9018e(m9033c.optString("FisError", null)).mo9014a();
    }
}
