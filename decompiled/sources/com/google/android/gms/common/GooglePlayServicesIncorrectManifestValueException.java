package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
import p368w2.C6870k;

@KeepName
/* loaded from: classes.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i7) {
        super(i7, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + C6870k.f24689a + " but found " + i7 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
