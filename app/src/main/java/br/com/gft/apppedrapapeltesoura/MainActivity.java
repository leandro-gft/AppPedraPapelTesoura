package br.com.gft.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {
        opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view) {
        opcaoSelecionada("papel");

    }

    public void selecionarTesoura(View view) {
        opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoEscolhida) {

        ImageView imagem = findViewById(R.id.img_escolha_app);
        TextView text = findViewById(R.id.text_sua_escolha);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "pedra": imagem.setImageResource(R.drawable.pedra); break;
            case "papel": imagem.setImageResource(R.drawable.papel); break;
            case "tesoura": imagem.setImageResource(R.drawable.tesoura); break;
        }

        if (opcaoEscolhida=="papel" && escolhaApp == "pedra" || opcaoEscolhida=="tesoura" && escolhaApp == "papel" || opcaoEscolhida=="pedra" && escolhaApp == "tesoura" ){
            text.setText("Você ganhou!");
        } else if (opcaoEscolhida=="pedra" && escolhaApp == "pedra" || opcaoEscolhida=="papel" && escolhaApp == "papel" || opcaoEscolhida=="tesoura" && escolhaApp == "tesoura" ){
            text.setText("Empatou!");
        } else {
            text.setText("Você perdeu!");
        }

    }
}
