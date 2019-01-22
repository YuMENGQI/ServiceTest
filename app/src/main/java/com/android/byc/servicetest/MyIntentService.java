package com.android.byc.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * @author yu
 * @version 1.0
 * @date 2019/1/22 9:36
 * @description
 */
public class MyIntentService extends IntentService {

    public MyIntentService(){
        super("MyIntentService");//调用父类的有参构造函数
    }

    @Override
    protected void onHandleIntent(Intent intent){
        Log.d("MyIntentService","Thread id is" + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MyIntentService","OnDestroy executed");
    }
}
