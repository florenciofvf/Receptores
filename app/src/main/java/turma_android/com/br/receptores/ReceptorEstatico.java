package turma_android.com.br.receptores;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceptorEstatico extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String acao = intent.getAction();

        Toast.makeText(context, acao, Toast.LENGTH_SHORT).show();
    }

}
