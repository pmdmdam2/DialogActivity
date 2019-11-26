package dialogactivity.org.dialogactivity.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import dialogactivity.org.dialogactivity.R;

/**
 * Actividad que implementa el cuadro de diálogo personalizado
 */
public class DialogActivity extends AppCompatActivity {
    private Button btSi;
    private Button btNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btSi=findViewById(R.id.btSi);
        btNo=findViewById(R.id.btNo);

        btSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
