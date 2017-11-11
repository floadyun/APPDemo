package com.demo.presenter;


import android.support.annotation.Nullable;

import com.demo.di.ActivityScoped;
import com.demo.view.IDaggerView;
import javax.inject.Inject;

/**
 * Created by Administrator on 2017/11/10.
 */
@ActivityScoped
public class IDaggerPresenter implements IBasePresenter<IDaggerView> {

    @Nullable
    private IDaggerView daggerView;

    @Inject
    public IDaggerPresenter() {

    }
    public void hello(){
        System.out.println("hello, dagger!");
    }

    @Override
    public void takeView(IDaggerView view) {
        this.daggerView = view;
    }
    @Override
    public void dropView() {
        this.daggerView = null;
    }
}
