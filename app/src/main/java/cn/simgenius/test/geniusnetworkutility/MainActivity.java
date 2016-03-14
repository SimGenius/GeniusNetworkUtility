package cn.simgenius.test.geniusnetworkutility;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import cn.simgenius.test.geniusnetworkutility.util.JSONArrayGet;
import cn.simgenius.test.geniusnetworkutility.util.JSONArrayPost;
import cn.simgenius.test.geniusnetworkutility.util.JSONObjectPost;
import cn.simgenius.test.geniusnetworkutility.util.StringGet;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.txt);

//        new JSONGet().executeTask("http://simgenius.cn/blog2/content?target=info&id=9",
//                new JSONGet.OnTaskFinishListener() {
//                    @Override
//                    public void onTaskFinish(JSONObject jsonObject) {
//                        textView.setText(jsonObject.toString());
//                    }
//                });
//
//        new JSONArrayGet("http://simgenius.cn/blog2/content?target=content&id=9", new JSONArrayGet.OnTaskFinishListener() {
//            @Override
//            public void onTaskFinish(JSONArray result) {
//                textView.setText(result.toString());
//            }
//        });
//        Map<String,String> map = new HashMap<>();
//        map.put("target","content");
//        map.put("id","9");
        new JSONArrayPost("http://simgenius.cn/blog2/content", map, new JSONArrayPost.OnTaskFinishListener() {
            @Override
            public void onTaskFinish(JSONArray result) {
                textView.setText(result.toString());
            }
        });

        new StringGet("http://simgenius.cn/", new StringGet.OnTaskFinishListener() {
            @Override
            public void onTaskFinish(String result) {
                textView.setText(result.toString());
            }
        });
    }
}
