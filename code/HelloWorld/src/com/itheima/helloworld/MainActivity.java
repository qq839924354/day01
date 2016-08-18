package com.itheima.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初始化程序界面  设置布局 为 activity_main
        setContentView(R.layout.activity_main);
    }
}
