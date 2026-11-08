package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j7);
        }

        public static Builder builder() {
            C3889c c3889c = new C3889c();
            c3889c.m15244a(0);
            return c3889c;
        }

        /* renamed from: a */
        public abstract int mo15205a();

        /* renamed from: b */
        public abstract long mo15206b();
    }

    public static abstract class StandardIntegrityToken {
        public abstract Task<Integer> showDialog(Activity activity, int i7);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        public static Builder builder() {
            return new C3893f();
        }

        /* renamed from: a */
        public abstract String mo15207a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
