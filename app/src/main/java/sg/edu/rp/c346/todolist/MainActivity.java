package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add(new AndroidVersion("MSA", "1/7/2019"));
        arrayList.add(new AndroidVersion("Go for haircut", "22/9/2019"));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, arrayList);
        lv.setAdapter(adapter);
    }
}
