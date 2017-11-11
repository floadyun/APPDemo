package com.demo.presenter;

/**
 * Created by Administrator on 2017/11/10.
 */

public interface IBasePresenter<T>{
    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    void takeView(T view);

    /**
     * Drops the reference to the view when destroyed
     */
    void dropView();
}
