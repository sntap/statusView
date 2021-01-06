package com.sntap.library.test;

import android.content.Intent;
import android.os.Handler;
import android.view.View;

import com.sntap.library.test.base.BaseActivity;
import com.sntap.statusview.StatusView;
import com.sntap.statusview.StatusViewBuilder;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private StatusView statusView;

    @OnClick(R.id.tv_start)
    public void start() {
        startActivity(new Intent(this, TabActivity.class));
    }

    @Override
    protected int initLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        statusView = StatusView.init(this, R.id.ll_text);
        statusView.config(new StatusViewBuilder.Builder()
                .setOnErrorRetryClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        statusView.showLoadingView();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                statusView.showEmptyView();
                            }
                        }, 1500);
                    }
                })
                .setOnLoginRetryClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        statusView.showLoadingView();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                statusView.showContentView();
                            }
                        }, 1500);
                    }
                })
                .setOnEmptyRetryClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        statusView.showLoadingView();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                statusView.showContentView();
                            }
                        }, 1500);
                    }
                }).build());

//        statusView.showContentView();

        statusView.showLoginView();
        statusView.setLoginTip("9999");
        statusView.setLoginRetryTip("99929333");
        if(statusView.statusViewNow == StatusView.StatusViewNow.LoginView){
            statusView.setLoginTip("Now");
            statusView.setBackgroudColor(R.color.colorAccent);
        }

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                }
//                catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }, 1500);
    }
}
