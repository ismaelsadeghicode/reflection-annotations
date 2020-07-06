package com.javatar.reflection;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        Class aClass = UserReatApi.class;
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation: annotations){
            if (annotation instanceof Annotation){
                GetAnnotation getAnnotation = (GetAnnotation) annotation;
                System.out.println(getAnnotation.consumes());
                System.out.println(getAnnotation.value());
            }
        }

    }
}
