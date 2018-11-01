package com.yotexs;

import org.dozer.CustomConverter;

import com.yotexs.creator.CreatorFactory;

import java.util.Locale;

public class JdkConverter implements CustomConverter {

    private CreatorFactory creatorFactory = new CreatorFactory();

    @Override
    public Object convert(Object destination, Object source, Class<?> destinationClass, Class<?> sourceClass) {

        if (destinationClass == null || sourceClass == null) {
            return destination;
        }

        if (source == null) {
            destination = null;
        } else if (destinationClass.isAssignableFrom(Locale.class) && sourceClass.isAssignableFrom(Locale.class)) {
            destination = creatorFactory.createLocaleCreator().create(source);
        }

        return destination;
    }
}
