package org.apache.tika.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Param;
import org.apache.tika.config.ParamField;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class AnnotationUtils {
    private static final InterfaceC6304d LOG = AbstractC6306f.m26394k(AnnotationUtils.class);
    private static final Map<Class<?>, List<ParamField>> PARAM_INFO = new HashMap();

    public static void assignFieldParams(Object obj, Map<String, Param> map) {
        Class<?> cls = obj.getClass();
        Map<Class<?>, List<ParamField>> map2 = PARAM_INFO;
        if (!map2.containsKey(cls)) {
            synchronized (TikaConfig.class) {
                try {
                    if (!map2.containsKey(cls)) {
                        List<AccessibleObject> collectInfo = collectInfo(cls, Field.class);
                        ArrayList arrayList = new ArrayList(collectInfo.size());
                        Iterator<AccessibleObject> it = collectInfo.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ParamField(it.next()));
                        }
                        PARAM_INFO.put(cls, arrayList);
                    }
                } finally {
                }
            }
        }
        for (ParamField paramField : PARAM_INFO.get(cls)) {
            Param param = map.get(paramField.getName());
            if (param != null) {
                if (!paramField.getType().isAssignableFrom(param.getType())) {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Value '%s' of type '%s' can't be assigned to field '%s' of defined type '%s'", param.getValue(), param.getValue().getClass(), paramField.getName(), paramField.getType()));
                }
                try {
                    paramField.assignValue(obj, param.getValue());
                } catch (IllegalAccessException e7) {
                    LOG.mo26372p("Error assigning value '{}' to '{}'", param.getValue(), param.getName());
                    throw new TikaConfigException(e7.getMessage(), e7);
                } catch (InvocationTargetException e8) {
                    LOG.mo26372p("Error assigning value '{}' to '{}'", param.getValue(), param.getName());
                    Throwable cause = e8.getCause();
                    Throwable th = e8;
                    if (cause != null) {
                        th = e8.getCause();
                    }
                    throw new TikaConfigException(th.getMessage(), th);
                }
            } else {
                if (paramField.isRequired()) {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Param %s is required for %s, but it is not given in config.", paramField.getName(), obj.getClass().getName()));
                }
                LOG.mo26370n("Param not supplied, field is not mandatory");
            }
        }
    }

    private static List<AccessibleObject> collectInfo(Class<?> cls, Class<? extends Annotation> cls2) {
        ArrayList<AccessibleObject> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cls != null && cls != Object.class) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
            cls = cls.getSuperclass();
        }
        for (AccessibleObject accessibleObject : arrayList) {
            if (accessibleObject.isAnnotationPresent(cls2)) {
                accessibleObject.setAccessible(true);
                arrayList2.add(accessibleObject);
            }
        }
        return arrayList2;
    }
}
