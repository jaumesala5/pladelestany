package cat.dam.jaume.habitantsdelpladelestany;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    String[] municipis = new String[]{
            "Crespià", "Banyoles", "Camós", "Cornellà del Terri", "Esponellà",
            "Fontcoberta", "Palol de Revardit", "Porqueres", "Sant Miquel de Campmajor",
            "Serinyà", "Vilademuls"};

    int[] nHabitants = new int[]{
            254, 20053, 677, 2399, 463, 1469, 448, 4677, 229, 1133, 835};

    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, municipis);
        AutoCompleteTextView atv_municipis = (AutoCompleteTextView)
                findViewById(R.id.tv_Entrada);
        atv_municipis.setAdapter(adapter);


        final Button btn_1 = findViewById(R.id.idButton);
        final TextView tv_1 = findViewById(R.id.nHabitants);

        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AutoCompleteTextView source = (AutoCompleteTextView) findViewById(R.id.tv_Entrada);
                String valorUsuari = source.getText().toString();
                int conver = 0;
                for (int i = 0; i < municipis.length; i++) {
                    if (valorUsuari.equals(municipis[i])) {
                        conver = nHabitants[i];
                    }
                    String numPoblacioFinal = Integer.toString(conver);
                    tv_1.setText(numPoblacioFinal);
                }
            }


        });
    }
}