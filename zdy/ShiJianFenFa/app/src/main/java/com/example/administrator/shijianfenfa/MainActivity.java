package com.example.administrator.shijianfenfa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * autour: 王广宽       //名字
 * date:     //系统时间$**$是变量
 * update:     这是一个自定义的查询可以有搜索记录的  EditText  大部分修改都可以在里面，很号修改，
 *             这里的已经修改的   差不多了，如果别的功能，可以参照这个来做一个
 */

public class MainActivity extends AppCompatActivity {

    // 1. 初始化搜索框变量
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.search_view);

        // 4. 设置点击搜索按键后的操作（通过回调接口）
        // 参数 = 搜索框输入的内容
        searchView.setOnClickSearch(new ICallBack() {
            @Override
            public void SearchAciton(String string) {
                System.out.println("我收到了" + string);
            }
        });

        // 5. 设置点击返回按键后的操作（通过回调接口）
        searchView.setOnClickBack(new bCallBack() {
            @Override
            public void BackAciton() {
                finish();
            }
        });


    }



}
