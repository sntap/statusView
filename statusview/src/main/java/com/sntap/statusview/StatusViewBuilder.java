package com.sntap.statusview;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.view.View;

public class StatusViewBuilder {
    // loading 提示信息
    private String loadingTip;
    // empty 提示信息
    private String emptyTip;
    // error 提示信息
    private String errorTip;

    private String loginTip;

    // 提示信息颜色
    private int tipColor;
    // 提示信息字体大小
    private int tipSize;
    // empty 图标
    private int emptyIcon;
    // error 图标
    private int errorIcon;

    // loign 图标
    private int loginIcon;

    // 是否显示 empty 重试按钮
    private boolean showEmptyRetry;
    // 是否显示 error 重试按钮
    private boolean showErrorRetry;
    // 是否显示 login 重试按钮
    private boolean showLoginRetry;

    // empty 重试按钮文字
    private String emptyRetryText;
    // error 重试按钮文字
    private String errorRetryText;
    // login 登录按钮文字
    private String loginRetryText;

    // 重试按钮文字颜色
    private int retryColor;
    // 重试按钮字体大小
    private int retrySize;
    // 重试按钮 drawable 背景
    private int retryDrawable;
    // empty 重试按钮点击事件
    private View.OnClickListener emptyRetryClickListener;
    // error 重试按钮点击事件
    private View.OnClickListener errorRetryClickListener;
    // login 重试按钮点击事件
    private View.OnClickListener loginRetryClickListener;

    public String getLoadingTip() {
        return loadingTip;
    }

    public String getEmptyTip() {
        return emptyTip;
    }

    public String getErrorTip() {
        return errorTip;
    }

    public String getLoginTip() {
        return loginTip;
    }

    public int getTipColor() {
        return tipColor;
    }

    public int getTipSize() {
        return tipSize;
    }

    public int getEmptyIcon() {
        return emptyIcon;
    }

    public int getErrorIcon() {
        return errorIcon;
    }

    public int getLoginIcon() {
        return loginIcon;
    }

    public boolean isShowEmptyRetry() {
        return showEmptyRetry;
    }

    public boolean isShowErrorRetry() {
        return showErrorRetry;
    }

    public boolean isShowLoginRetry() {
        return showLoginRetry;
    }

    public String getEmptyRetryText() {
        return emptyRetryText;
    }

    public String getErrorRetryText() {
        return errorRetryText;
    }

    public String getLoginRetryText() {
        return loginRetryText;
    }

    public int getRetryColor() {
        return retryColor;
    }

    public int getRetrySize() {
        return retrySize;
    }

    public int getRetryDrawable() {
        return retryDrawable;
    }

    public View.OnClickListener getEmptyRetryClickListener() {
        return emptyRetryClickListener;
    }

    public View.OnClickListener getErrorRetryClickListener() {
        return errorRetryClickListener;
    }

    public View.OnClickListener getLoginRetryClickListener() {
        return loginRetryClickListener;
    }

    public StatusViewBuilder(Builder builder) {
        this.loadingTip = builder.loadingTip;
        this.emptyTip = builder.emptyTip;
        this.errorTip = builder.errorTip;
        this.loginTip = builder.loginTip;
        this.tipColor = builder.tipColor;
        this.tipSize = builder.tipSize;
        this.emptyIcon = builder.emptyIcon;
        this.errorIcon = builder.errorIcon;
        this.showEmptyRetry = builder.showEmptyRetry;
        this.showErrorRetry = builder.showErrorRetry;
        this.showLoginRetry = builder.showLoginRetry;
        this.emptyRetryText = builder.emptyRetryText;
        this.errorRetryText = builder.errorRetryText;
        this.loginRetryText = builder.loginRetryText;
        this.retryColor = builder.retryColor;
        this.retrySize = builder.retrySize;
        this.retryDrawable = builder.retryDrawable;
        this.emptyRetryClickListener = builder.emptyRetryClickListener;
        this.errorRetryClickListener = builder.errorRetryClickListener;
        this.loginRetryClickListener = builder.loginRetryClickListener;
    }

    public static class Builder {
        private String loadingTip;
        private String emptyTip;
        private String errorTip;
        private String loginTip;
        private int tipColor;
        private int tipSize;

        private int emptyIcon;
        private int errorIcon;

        private boolean showEmptyRetry = true;
        private boolean showErrorRetry = true;
        private boolean showLoginRetry = true;
        private String emptyRetryText;
        private String errorRetryText;
        private String loginRetryText;
        private int retryColor;
        private int retrySize;
        private int retryDrawable;
        private View.OnClickListener emptyRetryClickListener;
        private View.OnClickListener errorRetryClickListener;
        private View.OnClickListener loginRetryClickListener;

        public Builder setLoadingTip(String loadingTip) {
            this.loadingTip = loadingTip;
            return this;
        }

        public Builder setEmptyip(String emptyTip) {
            this.emptyTip = emptyTip;
            return this;
        }

        public Builder setErrorTip(String errorTip) {
            this.errorTip = errorTip;
            return this;
        }

        public Builder setLoginTip(String loginTip){
            this.loginTip = loginTip;
            return this;
        }
        public Builder setTipColor(@ColorRes int tipColor) {
            this.tipColor = tipColor;
            return this;
        }

        public Builder setTipSize(int tipSize) {
            this.tipSize = tipSize;
            return this;
        }

        public Builder setEmptyIcon(int emptyIcon) {
            this.emptyIcon = emptyIcon;
            return this;
        }

        public Builder setErrorIcon(int errorIcon) {
            this.errorIcon = errorIcon;
            return this;
        }

        public Builder showEmptyRetry(boolean showEmptyRetry) {
            this.showEmptyRetry = showEmptyRetry;
            return this;
        }

        public Builder showErrorRetry(boolean showErrorRetry) {
            this.showErrorRetry = showErrorRetry;
            return this;
        }

        public Builder showLoginRetry(boolean showErrorRetry){
            this.showErrorRetry= showErrorRetry;
            return this;
        }

        public Builder setEmptyRetryText(String emptyRetryText) {
            this.emptyRetryText = emptyRetryText;
            return this;
        }

        public Builder setErrorRetryText(String errorRetryText) {
            this.errorRetryText = errorRetryText;
            return this;
        }

        public Builder setLoginRetryText(String loginRetryText){
            this.loginRetryText= loginRetryText;
            return this;
        }

        public Builder setRetryColor(@ColorRes int retryColor) {
            this.retryColor = retryColor;
            return this;
        }

        public Builder setRetrySize(int retrySize) {
            this.retrySize = retrySize;
            return this;
        }

        public Builder setRetryDrawable(@DrawableRes int retryDrawable) {
            this.retryDrawable = retryDrawable;
            return this;
        }

        public Builder setOnEmptyRetryClickListener(View.OnClickListener emptyRetryClickListener) {
            this.emptyRetryClickListener = emptyRetryClickListener;
            return this;
        }

        public Builder setOnErrorRetryClickListener(View.OnClickListener errorRetryClickListener) {
            this.errorRetryClickListener = errorRetryClickListener;
            return this;
        }

        public Builder setOnLoginRetryClickListener(View.OnClickListener loginRetryClickListener) {
            this.loginRetryClickListener = loginRetryClickListener;
            return this;
        }


        public StatusViewBuilder build() {
            return new StatusViewBuilder(this);
        }
    }
}
