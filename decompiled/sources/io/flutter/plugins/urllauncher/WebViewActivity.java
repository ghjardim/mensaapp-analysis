package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p372x.AbstractC6935a;

/* loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* renamed from: c */
    public WebView f17669c;

    /* renamed from: a */
    public final BroadcastReceiver f17667a = new C4786a();

    /* renamed from: b */
    public final WebViewClient f17668b = new C4787b();

    /* renamed from: d */
    public final IntentFilter f17670d = new IntentFilter("close action");

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$a */
    public class C4786a extends BroadcastReceiver {
        public C4786a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$b */
    public class C4787b extends WebViewClient {
        public C4787b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c */
    public class C4788c extends WebChromeClient {

        /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c$a */
        public class a extends WebViewClient {
            public a() {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f17669c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f17669c.loadUrl(str);
                return true;
            }
        }

        public C4788c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f17669c.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    /* renamed from: a */
    public static Intent m20664a(Context context, String str, boolean z6, boolean z7, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z6).putExtra("enableDomStorage", z7).putExtra("com.android.browser.headers", bundle);
    }

    /* renamed from: b */
    public static Map m20665b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f17669c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f17669c.loadUrl(stringExtra, m20665b(intent.getBundleExtra("com.android.browser.headers")));
        this.f17669c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f17669c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f17669c.setWebViewClient(this.f17668b);
        this.f17669c.getSettings().setSupportMultipleWindows(true);
        this.f17669c.setWebChromeClient(new C4788c());
        AbstractC6935a.registerReceiver(this, this.f17667a, this.f17670d, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f17667a);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !this.f17669c.canGoBack()) {
            return super.onKeyDown(i7, keyEvent);
        }
        this.f17669c.goBack();
        return true;
    }
}
