package p386z;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p028E.AbstractC0206k;
import p379y.AbstractC7040e;

/* renamed from: z.l */
/* loaded from: classes.dex */
public class C7097l extends AbstractC7098m {
    /* renamed from: j */
    public static FontFamily m29256j(CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, ContentResolver contentResolver) {
        int i7;
        ParcelFileDescriptor openFileDescriptor;
        int length = bVarArr.length;
        FontFamily.Builder builder = null;
        while (i7 < length) {
            AbstractC0206k.b bVar = bVarArr[i7];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(bVar.m840d(), "r", cancellationSignal);
            } catch (IOException e7) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            }
            if (openFileDescriptor == null) {
                i7 = openFileDescriptor == null ? i7 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.m841e()).setSlant(bVar.m842f() ? 1 : 0).setTtcIndex(bVar.m839c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: k */
    public static int m29257k(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: a */
    public Typeface mo29233a(Context context, AbstractC7040e.c cVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (AbstractC7040e.d dVar : cVar.m28969a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.m28971b()).setWeight(dVar.m28974e()).setSlant(dVar.m28975f() ? 1 : 0).setTtcIndex(dVar.m28972c()).setFontVariationSettings(dVar.m28973d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m29259i(build2, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: b */
    public Typeface mo29234b(Context context, CancellationSignal cancellationSignal, AbstractC0206k.b[] bVarArr, int i7) {
        try {
            FontFamily m29256j = m29256j(cancellationSignal, bVarArr, context.getContentResolver());
            if (m29256j == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(m29256j).setStyle(m29259i(m29256j, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: c */
    public Typeface mo29240c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily m29256j = m29256j(cancellationSignal, (AbstractC0206k.b[]) list.get(0), contentResolver);
            if (m29256j == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(m29256j);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily m29256j2 = m29256j(cancellationSignal, (AbstractC0206k.b[]) list.get(i8), contentResolver);
                if (m29256j2 != null) {
                    customFallbackBuilder.addCustomFallback(m29256j2);
                }
            }
            return customFallbackBuilder.setStyle(m29259i(m29256j, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: e */
    public Typeface mo29241e(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p386z.AbstractC7098m
    /* renamed from: h */
    public AbstractC0206k.b mo29258h(AbstractC0206k.b[] bVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: i */
    public final Font m29259i(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m29257k = m29257k(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int m29257k2 = m29257k(fontStyle, font2.getStyle());
            if (m29257k2 < m29257k) {
                font = font2;
                m29257k = m29257k2;
            }
        }
        return font;
    }
}
