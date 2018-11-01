package com.yotexs.creator;

public interface Creator<T> {

    public T create(Object source);
}
