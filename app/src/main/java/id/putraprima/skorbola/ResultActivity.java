package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView resultText, messageText, scorerText;
    String result, message, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.result);
        messageText = findViewById(R.id.winner);
        scorerText = findViewById(R.id.result_name);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            result = bundle.getString("result");
            message = bundle.getString("messages");
            score = bundle.getString("score");

            scorerText.setText(score);
            messageText.setText(message);
            resultText.setText(result);
            System.out.println(score);
        }

    }


}
