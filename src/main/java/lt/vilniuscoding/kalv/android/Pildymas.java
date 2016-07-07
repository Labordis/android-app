package lt.vilniuscoding.kalv.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * VCS
 */
public class Pildymas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        final int value = intent.getIntExtra("itemId", 1);
        setContentView(R.layout.pildymui);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                EditText editText = (EditText) findViewById(R.id.textView);
                if(Saugykla.getIrasai().size() == value) {
                    Saugykla.addIrasai(Saugykla.getIrasai().size()-1, editText.getText().toString());
                } else if(Saugykla.getIrasai().size() > value) {
                    Saugykla.addIrasaiIVieta(value, editText.getText().toString());
                }
                Intent myIntent = new Intent(Pildymas.this, HelloAndroidActivity.class);
                Pildymas.this.startActivity(myIntent);
            }
        });

    }


}
