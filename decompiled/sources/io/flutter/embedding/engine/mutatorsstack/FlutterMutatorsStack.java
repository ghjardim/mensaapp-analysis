package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<C4661a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$b */
    public enum EnumC4662b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<C4661a> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new C4661a(path));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i7, int i8, int i9, int i10, float[] fArr) {
        Rect rect = new Rect(i7, i8, i9, i10);
        this.mutators.add(new C4661a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i7, int i8, int i9, int i10) {
        Rect rect = new Rect(i7, i8, i9, i10);
        this.mutators.add(new C4661a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f7) {
        this.mutators.add(new C4661a(f7));
        this.finalOpacity *= f7;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        C4661a c4661a = new C4661a(matrix);
        this.mutators.add(c4661a);
        this.finalMatrix.preConcat(c4661a.m20238a());
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$a */
    public class C4661a {

        /* renamed from: a */
        public Matrix f17343a;

        /* renamed from: b */
        public Rect f17344b;

        /* renamed from: c */
        public Path f17345c;

        /* renamed from: d */
        public float[] f17346d;

        /* renamed from: e */
        public float f17347e;

        /* renamed from: f */
        public EnumC4662b f17348f;

        public C4661a(Rect rect) {
            this.f17347e = 1.0f;
            this.f17348f = EnumC4662b.CLIP_RECT;
            this.f17344b = rect;
        }

        /* renamed from: a */
        public Matrix m20238a() {
            return this.f17343a;
        }

        public C4661a(Rect rect, float[] fArr) {
            this.f17347e = 1.0f;
            this.f17348f = EnumC4662b.CLIP_RRECT;
            this.f17344b = rect;
            this.f17346d = fArr;
        }

        public C4661a(Path path) {
            this.f17347e = 1.0f;
            this.f17348f = EnumC4662b.CLIP_PATH;
            this.f17345c = path;
        }

        public C4661a(Matrix matrix) {
            this.f17347e = 1.0f;
            this.f17348f = EnumC4662b.TRANSFORM;
            this.f17343a = matrix;
        }

        public C4661a(float f7) {
            this.f17347e = 1.0f;
            this.f17348f = EnumC4662b.OPACITY;
            this.f17347e = f7;
        }
    }
}
