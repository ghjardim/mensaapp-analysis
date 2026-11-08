package org.apache.tika.mime;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import org.w3c.dom.Document;
import p256j$.util.Collection;
import p256j$.util.function.Consumer$CC;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class MimeTypesFactory {
    public static final String CUSTOM_MIMES_SYS_PROP = "tika.custom-mimetypes";
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(MimeTypesFactory.class);

    public static MimeTypes create() {
        return new MimeTypes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$0(URL url) {
        LOG.mo26374r("Loaded custom mimes file: {}", url);
    }

    public static MimeTypes create(Document document) {
        MimeTypes mimeTypes = new MimeTypes();
        new MimeTypesReader(mimeTypes).read(document);
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream... inputStreamArr) {
        MimeTypes mimeTypes = new MimeTypes();
        MimeTypesReader mimeTypesReader = new MimeTypesReader(mimeTypes);
        for (InputStream inputStream : inputStreamArr) {
            mimeTypesReader.read(inputStream);
        }
        mimeTypes.init();
        return mimeTypes;
    }

    public static MimeTypes create(InputStream inputStream) {
        return create(inputStream);
    }

    public static MimeTypes create(URL... urlArr) {
        int length = urlArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            inputStreamArr[i8] = urlArr[i8].openStream();
        }
        try {
            return create(inputStreamArr);
        } finally {
            while (i7 < length) {
                inputStreamArr[i7].close();
                i7++;
            }
        }
    }

    public static MimeTypes create(URL url) {
        return create(url);
    }

    public static MimeTypes create(String str) {
        return create(MimeTypesReader.class.getResource(str));
    }

    public static MimeTypes create(String str, String str2) {
        return create(str, str2, null);
    }

    public static MimeTypes create(String str, String str2, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = MimeTypesReader.class.getClassLoader();
        }
        URL resource = classLoader.getResource((MimeTypesReader.class.getPackage().getName().replace('.', '/') + "/") + str);
        ArrayList list = Collections.list(classLoader.getResources(str2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        arrayList.addAll(list);
        InterfaceC6304d interfaceC6304d = LOG;
        if (interfaceC6304d.mo26361e()) {
            Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: org.apache.tika.mime.a
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void m21477p(Object obj) {
                    MimeTypesFactory.lambda$create$0((URL) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        String property = System.getProperty(CUSTOM_MIMES_SYS_PROP);
        if (property != null) {
            File file = new File(property);
            if (file.exists()) {
                arrayList.add(file.toURI().toURL());
                if (interfaceC6304d.mo26361e()) {
                    interfaceC6304d.mo26374r("Loaded external custom mimetypes file: {}", file.getAbsolutePath());
                }
            } else {
                throw new IOException("Specified custom mimetypes file not found: " + property);
            }
        }
        return create((URL[]) arrayList.toArray(new URL[0]));
    }
}
