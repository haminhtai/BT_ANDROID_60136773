package cntt61.mssv60136773.autocompletetextview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static final String[] NATIONS = new String[] {
              "Australia", "England", "Viet Nam", "Albania", "USA", "Algeria"};
    AutoCompleteTextView autoTV;
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, NATIONS);
        autoTV = findViewById(R.id.autoCpv);
        autoTV.setAdapter(adapter);
    }
}