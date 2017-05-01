package com.apple.uridemo;

import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //UriMatcher.NOMATCH
//        //1 NEW
//        UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
//        //2 addUri,注册uri
//        uriMatcher.addURI("shj","shi",0);
//        uriMatcher.addURI("shj1","shi1",1);
//        //3
//        Uri uri = Uri.parse("content://"+"shj"+"shi/");
//        int match = uriMatcher.match(uri);
//        switch (match){
//            case 0:
//                Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT).show();
//                break;
//            case 1:
//                Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT).show();
//                break;
//        }

    }
    public void click0(View v){
        //UriMatcher.NOMATCH
        //1 NEW
        UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        //2 addUri,注册uri
//        uriMatcher.addURI("shj","shi",0);
//        uriMatcher.addURI("shj1","shi1",1);
        uriMatcher.addURI("com.yfz.Lesson", "people", 0);
        uriMatcher.addURI("com.yfz.Lesson", "person/#", 1);
        //3
        Uri uri = Uri.parse("content://"+"shj"+"shi/");
        int match = uriMatcher.match(uri);
        switch (match){
            case 0:
                Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void click1(View v){
//UriMatcher.NOMATCH
        //1 NEW
        UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        //2 addUri,注册uri,这里的三个参数是随便的吗
//        uriMatcher.addURI("shj","shi",0);
//        uriMatcher.addURI("shj1","shi1",1);
        uriMatcher.addURI("com.yfz.Lesson", "people", 0);
        uriMatcher.addURI("com.yfz.Lesson", "person/#", 1);
        //3
        Uri uri = Uri.parse("content://"+"shj1"+"shi1/");
        int match = uriMatcher.match(uri);
        switch (match){
            case 0:
                Toast.makeText(MainActivity.this,"0",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                break;
        }
    }
//private static final String AUTHORITY = "com.yfz.Lesson";
//    private static final int PEOPLE = 1;
//    private static final int PEOPLE_ID = 2;
//
//    //NO_MATCH表示不匹配任何路径的返回码
//    private static final UriMatcher sURIMatcher = new UriMatcher(UriMatcher.NO_MATCH);
//    static
//    {
//        sURIMatcher.addURI(AUTHORITY, "people", PEOPLE);
//
//        //这里的#代表匹配任意数字，另外还可以用*来匹配任意文本
//        sURIMatcher.addURI(AUTHORITY, "people/#", PEOPLE_ID);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        Log.d("------ Start Activity !!! ------");
//
//        Uri uri1 = Uri.parse("content://" + AUTHORITY + "/people");
////        Log.e("Uri:" + uri1);
////        Log.d("Match 1" + getType(uri1));
//
//        Uri uri2 = Uri.parse("content://" + AUTHORITY + "/people" + "/2");
//
////        Log.e("Uri:" + uri2);
////        Log.d("Match 2" + getType(uri2));
//
//        //拼接Uri
//        Uri cUri = ContentUris.withAppendedId(uri1, 15);
////        Log.e("Uri:" + cUri);
//        //获取ID
//        long id = ContentUris.parseId(cUri);
//        Log.d("Uri ID: ","Uri ID: " + id);
//    }
//
//    private String getType(Uri uri) {
//        int match = sURIMatcher.match(uri);
//        switch (match)
//        {
//            case PEOPLE:
//                return "vnd.android.cursor.dir/person";
//            case PEOPLE_ID:
//                return "vnd.android.cursor.item/person";
//            default:
//                return null;
//        }
//    }
}
