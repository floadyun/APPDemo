package com.demo.view;

/**
 * Created by Administrator on 2017/11/10.
 */

public interface IBaseView<T> {
    void showProgressLoading(String msg);
    void hideProgressLoading();
}
