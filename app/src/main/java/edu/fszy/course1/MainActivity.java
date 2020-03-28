package edu.fszy.course1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    /*
     * @descript: 主界面响应方法，根据点击的按钮跳转到相对应的DEMO界面
     * @param.in: 参数view，是一个View对象，可以根据输入的view的ID来跳转到相应DEMO的Activity
     * */
    public void MyOnClick(View view){
        //根据ID进入对应DEMO的Activity
        switch (view.getId()){
            default:break;
            case R.id.button_layoutmain_linearlayoutdemo:
                startActivity(new Intent(MainActivity.this, LinearLayoutDemoActivity.class)); //LinearLayout
                break;
            case R.id.button_layoutmain_relativelayoutdemo:
                startActivity(new Intent(MainActivity.this, RelativeLayoutDemoActivity.class)); //RelativeLayout
                break;
            case R.id.button_layoutmain_framelayoutdemo:
                startActivity(new Intent(MainActivity.this, FrameLayoutDemoActivity.class)); // FrameLayout
                break;
            case R.id.button_layoutmain_tablelayoutdemo:
                startActivity(new Intent(MainActivity.this, TableLayoutDemoActivity.class)); //TableLayout
                break;
            case R.id.button_layoutmain_absoulutelayoutdemo:
                startActivity(new Intent(MainActivity.this, AbsoluteLayoutDemoActivity.class)); //AbsoluteLayout
                break;
        }
    }
}
