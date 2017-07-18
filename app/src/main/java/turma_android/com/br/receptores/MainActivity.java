package turma_android.com.br.receptores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void mensagemReceptorEstatico(View view) {
        Intent it = new Intent("RECEPTOR_ESTATICO");
        sendBroadcast(it);
    }

    public void mensagemReceptorDinamico(View view) {
    }

    public void mensagemReceptorLocal(View view) {
    }
}
