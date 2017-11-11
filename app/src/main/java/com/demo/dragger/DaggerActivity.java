package com.demo.dragger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.demo.presenter.IDaggerPresenter;
import com.demo.view.IDaggerView;
import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Administrator on 2017/11/9.
 */

public class DaggerActivity extends DaggerAppCompatActivity implements IDaggerView{

//    @Inject
//    IDaggerPresenter daggerPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        daggerPresenter.hello();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        daggerPresenter.takeView(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
//        daggerPresenter.dropView();
    }
    @Override
    public void showProgressLoading(String msg) {

    }
    @Override
    public void hideProgressLoading() {

    }
}
