package com.example.sy6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class NewsContentActivity extends AppCompatActivity {
    public static  void actionStart(Context context,String newsTitle,String newsContent){
        Intent intent=new Intent(context,NewsContentActivity.class);
        intent.putExtra("news_title",newsTitle);
        intent.putExtra("news_content",newsContent);
        context.startActivity(intent);
    }
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);
        //传值
        String newsTitle=getIntent().getStringExtra("news_title");
        String newsContent=getIntent().getStringExtra("news_content");
        NewsContentFragment newsContentFragment=(NewsContentFragment) getSupportFragmentManager().findFragmentById((R.id.news_content_fragment));
        newsContentFragment.refresh(newsTitle,newsContent);//刷新
    }

}
