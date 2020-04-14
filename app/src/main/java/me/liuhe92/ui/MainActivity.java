package me.liuhe92.ui;


import androidx.appcompat.app.AppCompatActivity;
import me.liuhe92.R;
import me.liuhe92.httputils.OkHttpUtils;
import me.liuhe92.httputils.callback.StringCallback;
import okhttp3.Call;
import okhttp3.Request;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetClick(View view) {
        String url = "http://www.csdn.net/";
        OkHttpUtils
                .get()
                .url(url)
                .addParams("username", "hyman")
                .addParams("password", "123")
                .build()
                .execute(new StringCallback() {

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("123", "12err");
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("123", response);
                    }
                });
    }
}
