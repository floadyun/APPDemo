package com.demo.dragger;

import com.demo.di.ActivityScoped;
import com.demo.presenter.IDaggerPresenter;
import dagger.Binds;
import dagger.Module;

/**
 * Created by Administrator on 2017/11/10.
 */
@Module
public abstract class DaggerModule {

    @ActivityScoped
    abstract IDaggerPresenter daggerPresenter();
}
