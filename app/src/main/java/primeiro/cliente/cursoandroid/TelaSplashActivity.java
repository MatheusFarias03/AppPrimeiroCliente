package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {

    String TAG = "APP_PRIMEIRO_CLIENTE";
    int tempoDeEspera = 15000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        trocarTela();
    }

    private void trocarTela(){
        Log.d(TAG, "trocarTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "trocarTela: Esperando um tempo");

                Intent trocarDeTela = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();
            }
        }, tempoDeEspera);
    }

}