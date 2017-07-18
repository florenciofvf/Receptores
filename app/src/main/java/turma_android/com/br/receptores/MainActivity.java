package turma_android.com.br.receptores;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ReceptorDinamico dinamico = new ReceptorDinamico();
    private ReceptorLocal local = new ReceptorLocal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        registerReceiver(dinamico, new IntentFilter("RECEPTOR_DINAMICO"));

        LocalBroadcastManager.getInstance(this)
                .registerReceiver(local, new IntentFilter("RECEPTOR_LOCAL"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(dinamico);

        LocalBroadcastManager.getInstance(this)
                .unregisterReceiver(local);
    }

    public void mensagemReceptorEstatico(View view) {
        Intent it = new Intent("RECEPTOR_ESTATICO");
        sendBroadcast(it);
    }

    public void mensagemReceptorDinamico(View view) {
        Intent it = new Intent("RECEPTOR_DINAMICO");
        sendBroadcast(it);
    }

    public void mensagemReceptorLocal(View view) {
        Intent it = new Intent("RECEPTOR_LOCAL");
        LocalBroadcastManager.getInstance(this)
                .sendBroadcast(it);
    }
}
