package p253i5;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2939v;
import p237g5.AbstractC4438g0;
import p237g5.C4403D;
import p237g5.InterfaceC4440h0;

/* renamed from: i5.x0 */
/* loaded from: classes2.dex */
public class C4641x0 implements InterfaceC4440h0 {

    /* renamed from: d */
    public static final Logger f17283d = Logger.getLogger(C4641x0.class.getName());

    /* renamed from: e */
    public static final c f17284e = new a();

    /* renamed from: f */
    public static final InterfaceC2939v f17285f = new b();

    /* renamed from: a */
    public final InterfaceC2939v f17286a;

    /* renamed from: b */
    public final c f17287b;

    /* renamed from: c */
    public final InetSocketAddress f17288c;

    /* renamed from: i5.x0$a */
    public class a implements c {
        @Override // p253i5.C4641x0.c
        /* renamed from: a */
        public PasswordAuthentication mo20173a(String str, InetAddress inetAddress, int i7, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i7, StringUtils.EMPTY);
            } catch (MalformedURLException unused) {
                C4641x0.f17283d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i7, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: i5.x0$b */
    public class b implements InterfaceC2939v {
        @Override // p171Y2.InterfaceC2939v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* renamed from: i5.x0$c */
    public interface c {
        /* renamed from: a */
        PasswordAuthentication mo20173a(String str, InetAddress inetAddress, int i7, String str2, String str3, String str4);
    }

    public C4641x0() {
        this(f17285f, f17284e, System.getenv("GRPC_PROXY_EXP"));
    }

    /* renamed from: d */
    public static InetSocketAddress m20171d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f17283d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // p237g5.InterfaceC4440h0
    /* renamed from: a */
    public AbstractC4438g0 mo18926a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f17288c != null ? C4403D.m18629e().m18636c(this.f17288c).m18637d((InetSocketAddress) socketAddress).m18634a() : m20172c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    /* renamed from: c */
    public final AbstractC4438g0 m20172c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, AbstractC4580S.m19603i(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f17286a.get();
                if (proxySelector == null) {
                    f17283d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f17283d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication mo20173a = this.f17287b.mo20173a(AbstractC4580S.m19603i(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", StringUtils.EMPTY, null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C4403D.b m18636c = C4403D.m18629e().m18637d(inetSocketAddress).m18636c(inetSocketAddress2);
                if (mo20173a == null) {
                    return m18636c.m18634a();
                }
                return m18636c.m18638e(mo20173a.getUserName()).m18635b(mo20173a.getPassword() != null ? new String(mo20173a.getPassword()) : null).m18634a();
            } catch (URISyntaxException e7) {
                f17283d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e7);
                return null;
            }
        } catch (Throwable th) {
            f17283d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    public C4641x0(InterfaceC2939v interfaceC2939v, c cVar, String str) {
        this.f17286a = (InterfaceC2939v) AbstractC2932o.m10572o(interfaceC2939v);
        this.f17287b = (c) AbstractC2932o.m10572o(cVar);
        if (str != null) {
            this.f17288c = m20171d(str);
        } else {
            this.f17288c = null;
        }
    }
}
