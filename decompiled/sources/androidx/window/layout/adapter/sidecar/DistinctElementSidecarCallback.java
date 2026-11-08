package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;
import p100O1.C1292a;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b */
    public SidecarDeviceState f11634b;

    /* renamed from: d */
    public final C1292a f11636d;

    /* renamed from: e */
    public final SidecarInterface.SidecarCallback f11637e;

    /* renamed from: a */
    public final Object f11633a = new Object();

    /* renamed from: c */
    public final Map f11635c = new WeakHashMap();

    public DistinctElementSidecarCallback(C1292a c1292a, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f11636d = c1292a;
        this.f11637e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f11633a) {
            try {
                if (this.f11636d.m4909a(this.f11634b, sidecarDeviceState)) {
                    return;
                }
                this.f11634b = sidecarDeviceState;
                this.f11637e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f11633a) {
            try {
                if (this.f11636d.m4912d((SidecarWindowLayoutInfo) this.f11635c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f11635c.put(iBinder, sidecarWindowLayoutInfo);
                this.f11637e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
