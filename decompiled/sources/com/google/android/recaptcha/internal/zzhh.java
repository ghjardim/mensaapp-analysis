package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import p104O5.AbstractC1421h;
import p104O5.C1419f;
import p125R5.C2277c;
import p378x5.AbstractC7002B;
import p378x5.AbstractC7025p;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzhh implements zzgx {
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z6 = obj instanceof Byte;
        if (z6 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z7 = obj instanceof Short;
        if (z7 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z8 = obj instanceof Integer;
        if (z8 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z9 = obj instanceof Long;
        if (z9 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z10 = obj instanceof Float;
        if (z10 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z11 = obj instanceof Double;
        if (z11 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i7 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(C2277c.f6921b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i7 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i7] % ((Number) obj2).intValue())));
                    i7++;
                }
                return new String(AbstractC7032w.m28886L(arrayList), C2277c.f6921b);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i7 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i7] % ((Number) obj2).intValue()));
                    i7++;
                }
                return AbstractC7032w.m28888N(arrayList2);
            }
        }
        if (z6 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b7 : bArr) {
                arrayList3.add(Integer.valueOf(b7 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z7 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s7 : sArr) {
                arrayList4.add(Integer.valueOf(s7 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z8 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i8 : iArr) {
                arrayList5.add(Integer.valueOf(i8 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z9 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j7 : jArr) {
                arrayList6.add(Long.valueOf(j7 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z10 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f7 : fArr) {
                arrayList7.add(Float.valueOf(f7 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z11 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d7 : dArr) {
                arrayList8.add(Double.valueOf(d7 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z12 = obj instanceof byte[];
        if (z12 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b8 : bArr2) {
                arrayList9.add(Integer.valueOf(b8 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z13 = obj instanceof short[];
        if (z13 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s8 : sArr2) {
                arrayList10.add(Integer.valueOf(s8 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z14 = obj instanceof int[];
        if (z14 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i7 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i7] % ((Number) obj2).intValue()));
                i7++;
            }
            return AbstractC7032w.m28888N(arrayList11);
        }
        boolean z15 = obj instanceof long[];
        if (z15 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j8 : jArr2) {
                arrayList12.add(Long.valueOf(j8 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z16 = obj instanceof float[];
        if (z16 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f8 : fArr2) {
                arrayList13.add(Float.valueOf(f8 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z17 = obj instanceof double[];
        if (z17 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d8 : dArr2) {
                arrayList14.add(Double.valueOf(d8 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z12 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length4, bArr4.length);
            C1419f m5534g = AbstractC1421h.m5534g(0, length4);
            ArrayList arrayList15 = new ArrayList(AbstractC7025p.m28868n(m5534g, 10));
            Iterator it = m5534g.iterator();
            while (it.hasNext()) {
                int mo5523a = ((AbstractC7002B) it).mo5523a();
                arrayList15.add(Integer.valueOf(bArr3[mo5523a] % bArr4[mo5523a]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length5, sArr4.length);
            C1419f m5534g2 = AbstractC1421h.m5534g(0, length5);
            ArrayList arrayList16 = new ArrayList(AbstractC7025p.m28868n(m5534g2, 10));
            Iterator it2 = m5534g2.iterator();
            while (it2.hasNext()) {
                int mo5523a2 = ((AbstractC7002B) it2).mo5523a();
                arrayList16.add(Integer.valueOf(sArr3[mo5523a2] % sArr4[mo5523a2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z14 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length6, iArr4.length);
            C1419f m5534g3 = AbstractC1421h.m5534g(0, length6);
            ArrayList arrayList17 = new ArrayList(AbstractC7025p.m28868n(m5534g3, 10));
            Iterator it3 = m5534g3.iterator();
            while (it3.hasNext()) {
                int mo5523a3 = ((AbstractC7002B) it3).mo5523a();
                arrayList17.add(Integer.valueOf(iArr3[mo5523a3] % iArr4[mo5523a3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z15 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzgw.zza(this, length7, jArr4.length);
            C1419f m5534g4 = AbstractC1421h.m5534g(0, length7);
            ArrayList arrayList18 = new ArrayList(AbstractC7025p.m28868n(m5534g4, 10));
            Iterator it4 = m5534g4.iterator();
            while (it4.hasNext()) {
                int mo5523a4 = ((AbstractC7002B) it4).mo5523a();
                arrayList18.add(Long.valueOf(jArr3[mo5523a4] % jArr4[mo5523a4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z16 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzgw.zza(this, length8, fArr4.length);
            C1419f m5534g5 = AbstractC1421h.m5534g(0, length8);
            ArrayList arrayList19 = new ArrayList(AbstractC7025p.m28868n(m5534g5, 10));
            Iterator it5 = m5534g5.iterator();
            while (it5.hasNext()) {
                int mo5523a5 = ((AbstractC7002B) it5).mo5523a();
                arrayList19.add(Float.valueOf(fArr3[mo5523a5] % fArr4[mo5523a5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z17 || !(obj2 instanceof double[])) {
            throw new zzce(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzgw.zza(this, length9, dArr4.length);
        C1419f m5534g6 = AbstractC1421h.m5534g(0, length9);
        ArrayList arrayList20 = new ArrayList(AbstractC7025p.m28868n(m5534g6, 10));
        Iterator it6 = m5534g6.iterator();
        while (it6.hasNext()) {
            int mo5523a6 = ((AbstractC7002B) it6).mo5523a();
            arrayList20.add(Double.valueOf(dArr3[mo5523a6] % dArr4[mo5523a6]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i7, zzb(zza2, zza3));
        } catch (ArithmeticException e7) {
            throw new zzce(4, 6, e7);
        }
    }
}
