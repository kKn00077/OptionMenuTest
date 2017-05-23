package kn0077.kr.hs.emirim.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linear;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear=(LinearLayout) findViewById(R.id.linear);
        but=(Button)findViewById(R.id.but_ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater=getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);//메모리에 menu1.xml을 할당
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch(item.getItemId()){//MenuItem 안에 있는 메서드. 사용하면 선택된 item의 아이디를 불러올 수 있다.
            case R.id.item_blue : linear.setBackgroundColor(Color.BLUE); return true; // 리턴 트루를 만나면 아예 메서드를 빠져나감
            case R.id.item_red : linear.setBackgroundColor(Color.RED); return true;
            case R.id.item_yellow : linear.setBackgroundColor(Color.YELLOW); return true;
            case R.id.item_but_rotate : but.setRotation(but.getRotation()+45); return true; // 겟로테이션으로 현재 각도를 불러와 그 각도를 기준으로 45도씩 회전
            case R.id.item_but_size : but.setScaleX(but.getScrollX()*1.5f); return true; // 현재 버튼 사이즈에서 가로(X)로 2배 세로로(Y) 2배
        }

        return false;
    }
}
