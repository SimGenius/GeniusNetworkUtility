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

        new StringGet("http://baidu.com", new StringGet.OnTaskFinishListener() {
            @Override
            public void onTaskFinish(String result) {
                textView.setText(result.toString());
            }
        });
    }
}
