package dialogactivity.org.dialogactivity.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import dialogactivity.org.dialogactivity.R;

/**
 * Actividad principal, su función es mostrar un cuadro de diálogo basado en otra actividad
 * , utiliza un Intent para comunicar las dos actividades.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btDialog = findViewById(R.id.btDialog);
        btDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dActivity = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(dActivity);
            }
        });
    }
}
