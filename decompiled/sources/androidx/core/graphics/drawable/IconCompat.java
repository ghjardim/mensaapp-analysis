package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.apache.tika.metadata.TikaCoreProperties;
import p042G.AbstractC0340b;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f10306k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f10307a;

    /* renamed from: b */
    public Object f10308b;

    /* renamed from: c */
    public byte[] f10309c;

    /* renamed from: d */
    public Parcelable f10310d;

    /* renamed from: e */
    public int f10311e;

    /* renamed from: f */
    public int f10312f;

    /* renamed from: g */
    public ColorStateList f10313g;

    /* renamed from: h */
    public PorterDuff.Mode f10314h;

    /* renamed from: i */
    public String f10315i;

    /* renamed from: j */
    public String f10316j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C3239a {
        /* renamed from: a */
        public static int m11961a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C3241c.m11967a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            }
        }

        /* renamed from: b */
        public static String m11962b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C3241c.m11968b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            }
        }

        /* renamed from: c */
        public static int m11963c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C3241c.m11969c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                return -1;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                return -1;
            }
        }

        /* renamed from: d */
        public static Uri m11964d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C3241c.m11970d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            }
        }

        /* renamed from: e */
        public static Icon m11965e(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f10307a) {
                case -1:
                    return (Icon) iconCompat.f10308b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f10308b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m11953f(), iconCompat.f10311e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f10308b, iconCompat.f10311e, iconCompat.f10312f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f10308b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m11947a((Bitmap) iconCompat.f10308b, false));
                        break;
                    } else {
                        createWithBitmap = C3240b.m11966a((Bitmap) iconCompat.f10308b);
                        break;
                    }
                case 6:
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        createWithBitmap = C3242d.m11971a(iconCompat.m11955h());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m11955h());
                        }
                        InputStream m11956i = iconCompat.m11956i(context);
                        if (m11956i == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m11955h());
                        }
                        if (i7 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.m11947a(BitmapFactory.decodeStream(m11956i), false));
                            break;
                        } else {
                            createWithBitmap = C3240b.m11966a(BitmapFactory.decodeStream(m11956i));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f10313g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f10314h;
            if (mode != IconCompat.f10306k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C3240b {
        /* renamed from: a */
        public static Icon m11966a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C3241c {
        /* renamed from: a */
        public static int m11967a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        public static String m11968b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        public static int m11969c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        public static Uri m11970d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C3242d {
        /* renamed from: a */
        public static Icon m11971a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f10307a = -1;
        this.f10309c = null;
        this.f10310d = null;
        this.f10311e = 0;
        this.f10312f = 0;
        this.f10313g = null;
        this.f10314h = f10306k;
        this.f10315i = null;
    }

    /* renamed from: a */
    public static Bitmap m11947a(Bitmap bitmap, boolean z6) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z6) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m11948b(Bitmap bitmap) {
        AbstractC0340b.m1346c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f10308b = bitmap;
        return iconCompat;
    }

    /* renamed from: c */
    public static IconCompat m11949c(Resources resources, String str, int i7) {
        AbstractC0340b.m1346c(str);
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f10311e = i7;
        if (resources != null) {
            try {
                iconCompat.f10308b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f10308b = str;
        }
        iconCompat.f10316j = str;
        return iconCompat;
    }

    /* renamed from: n */
    public static String m11950n(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public Bitmap m11951d() {
        int i7 = this.f10307a;
        if (i7 == -1) {
            Object obj = this.f10308b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f10308b;
        }
        if (i7 == 5) {
            return m11947a((Bitmap) this.f10308b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: e */
    public int m11952e() {
        int i7 = this.f10307a;
        if (i7 == -1) {
            return C3239a.m11961a(this.f10308b);
        }
        if (i7 == 2) {
            return this.f10311e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: f */
    public String m11953f() {
        int i7 = this.f10307a;
        if (i7 == -1) {
            return C3239a.m11962b(this.f10308b);
        }
        if (i7 == 2) {
            String str = this.f10316j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f10308b).split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0] : this.f10316j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: g */
    public int m11954g() {
        int i7 = this.f10307a;
        return i7 == -1 ? C3239a.m11963c(this.f10308b) : i7;
    }

    /* renamed from: h */
    public Uri m11955h() {
        int i7 = this.f10307a;
        if (i7 == -1) {
            return C3239a.m11964d(this.f10308b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f10308b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: i */
    public InputStream m11956i(Context context) {
        Uri m11955h = m11955h();
        String scheme = m11955h.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m11955h);
            } catch (Exception e7) {
                Log.w("IconCompat", "Unable to load image from URI: " + m11955h, e7);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f10308b));
        } catch (FileNotFoundException e8) {
            Log.w("IconCompat", "Unable to load image from path: " + m11955h, e8);
            return null;
        }
    }

    /* renamed from: j */
    public void m11957j() {
        this.f10314h = PorterDuff.Mode.valueOf(this.f10315i);
        switch (this.f10307a) {
            case -1:
                Parcelable parcelable = this.f10310d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f10308b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f10310d;
                if (parcelable2 != null) {
                    this.f10308b = parcelable2;
                    return;
                }
                byte[] bArr = this.f10309c;
                this.f10308b = bArr;
                this.f10307a = 3;
                this.f10311e = 0;
                this.f10312f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f10309c, Charset.forName("UTF-16"));
                this.f10308b = str;
                if (this.f10307a == 2 && this.f10316j == null) {
                    this.f10316j = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f10308b = this.f10309c;
                return;
        }
    }

    /* renamed from: k */
    public void m11958k(boolean z6) {
        this.f10315i = this.f10314h.name();
        switch (this.f10307a) {
            case -1:
                if (z6) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f10310d = (Parcelable) this.f10308b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z6) {
                    this.f10310d = (Parcelable) this.f10308b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f10308b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f10309c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f10309c = ((String) this.f10308b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f10309c = (byte[]) this.f10308b;
                return;
            case 4:
            case 6:
                this.f10309c = this.f10308b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* renamed from: l */
    public Icon m11959l() {
        return m11960m(null);
    }

    /* renamed from: m */
    public Icon m11960m(Context context) {
        return C3239a.m11965e(this, context);
    }

    public String toString() {
        if (this.f10307a == -1) {
            return String.valueOf(this.f10308b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m11950n(this.f10307a));
        switch (this.f10307a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f10308b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f10308b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f10316j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m11952e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f10311e);
                if (this.f10312f != 0) {
                    sb.append(" off=");
                    sb.append(this.f10312f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f10308b);
                break;
        }
        if (this.f10313g != null) {
            sb.append(" tint=");
            sb.append(this.f10313g);
        }
        if (this.f10314h != f10306k) {
            sb.append(" mode=");
            sb.append(this.f10314h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i7) {
        this.f10309c = null;
        this.f10310d = null;
        this.f10311e = 0;
        this.f10312f = 0;
        this.f10313g = null;
        this.f10314h = f10306k;
        this.f10315i = null;
        this.f10307a = i7;
    }
}
