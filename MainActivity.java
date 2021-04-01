package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView txtTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTime = (TextView) findViewById(R.id.textViewTime);
        // Chọn thư viện java.ulity
        Calendar calendar = Calendar.getInstance();

        //gán giá trị calender lại cho textview
        // sử dụng apend thay cho settext để
        txtTime.append(calendar.getTime() + "\n");
        // lấy ra ngày
        txtTime.append(calendar.get(Calendar.DATE) + "\n");
        // lấy ra tháng( nhưng khi gọi 1 mình, nó gọi 0 1 2 3 4 5 6 7 8) bị thiếu đi 1
        txtTime.append(calendar.get(Calendar.MONTH)+ "\n");
        txtTime.append(calendar.get(Calendar.YEAR) + "\n");

        // hàm định dạng ngày

        SimpleDateFormat dingdangngay = new SimpleDateFormat("dd//MM/YYYY"); // 29/03/2021

        txtTime.append(dingdangngay.format(calendar.getTime()) + "\n");

        // tương tự dịnh dạng giờ.

        SimpleDateFormat dingdanggio = new SimpleDateFormat("hh:mm:ss"); // 22:29:34

        txtTime.append(dingdanggio.format(calendar.getTime())+ "\n");
    }
}