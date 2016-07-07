package lt.vilniuscoding.kalv.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.List;

public class HelloAndroidActivity extends Activity {


    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Saugykla.getIrasai() == null) {
            new Saugykla();
        }
        initActions();
    }

    private void initActions() {

        listView = (ListView) findViewById(R.id.sampleListView);

        List<String> irasai = Saugykla.getIrasai();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, irasai);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent myIntent = new Intent(HelloAndroidActivity.this, Pildymas.class);
                myIntent.putExtra("itemId", i);
                HelloAndroidActivity.this.startActivity(myIntent);
            }
        });
    }

}

