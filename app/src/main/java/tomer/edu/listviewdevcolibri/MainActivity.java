package tomer.edu.listviewdevcolibri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import tomer.edu.listviewdevcolibri.adapter.PhoneModelAdapter;
import tomer.edu.listviewdevcolibri.pojo.PhoneModel;

public class MainActivity extends AppCompatActivity {

    private ListView lstView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstView = (ListView) findViewById(R.id.lstView);

        //List<String> items = initData();
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());

        lstView.setAdapter(adapter);
    }

    private List<PhoneModel> initData(){
        List<PhoneModel> list = new ArrayList<PhoneModel>();

        list.add(new PhoneModel(1, "IPhone", 1000));
        list.add(new PhoneModel(2, "HTC", 4546));
        list.add(new PhoneModel(3, "Samsung" , 888));
        list.add(new PhoneModel(4, "LG", 700));

        return list;
    }
}
