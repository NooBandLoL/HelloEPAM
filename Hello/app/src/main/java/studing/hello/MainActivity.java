package studing.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_main = (Button) findViewById(R.id.button);

        button_main.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(android.view.View view) {
                Toast.makeText(MainActivity.this, "HelloEpam", Toast.LENGTH_LONG).show();
            }
        });
    }
}
