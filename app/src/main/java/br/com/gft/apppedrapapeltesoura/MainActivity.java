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

    public void selecionarLagarto(View view) {
        opcaoSelecionada("lagarto");
    }

    public void selecionarSpock(View view) {
        opcaoSelecionada("spock");
    }

    public void opcaoSelecionada(String opcaoEscolhida) {
        ImageView imagem = findViewById(R.id.img_escolha_app);
        ImageView imagem2 = findViewById(R.id.img_escolha_app2);
        TextView text = findViewById(R.id.text_sua_escolha);

        String[] opcoes = {"pedra", "papel", "tesoura", "lagarto", "spock"};
        int numero = new Random().nextInt(5);
        String escolhaApp = opcoes[numero];

        switch (opcaoEscolhida){
            case "pedra": imagem2.setImageResource(R.drawable.pedra); break;
            case "papel": imagem2.setImageResource(R.drawable.papel); break;
            case "tesoura": imagem2.setImageResource(R.drawable.tesoura); break;
            case "lagarto": imagem2.setImageResource(R.drawable.lagarto); break;
            case "spock": imagem2.setImageResource(R.drawable.spock); break;
        }

        switch (escolhaApp) {
            case "pedra": imagem.setImageResource(R.drawable.pedra); break;
            case "papel": imagem.setImageResource(R.drawable.papel); break;
            case "tesoura": imagem.setImageResource(R.drawable.tesoura); break;
            case "lagarto": imagem.setImageResource(R.drawable.lagarto); break;
            case "spock": imagem.setImageResource(R.drawable.spock); break;
        }

        if (opcaoEscolhida=="papel" && escolhaApp == "pedra" || opcaoEscolhida=="pedra" && escolhaApp == "lagarto" || opcaoEscolhida=="lagarto" && escolhaApp == "spock" || opcaoEscolhida=="tesoura" && escolhaApp == "lagarto" || opcaoEscolhida=="lagarto" && escolhaApp == "papel" || opcaoEscolhida=="papel" && escolhaApp == "spock" || opcaoEscolhida=="spock" && escolhaApp == "pedra" || opcaoEscolhida=="spock" && escolhaApp == "tesoura" || opcaoEscolhida=="tesoura" && escolhaApp == "papel" || opcaoEscolhida=="pedra" && escolhaApp == "tesoura" ){
            text.setText("Você ganhou!");
        } else if (opcaoEscolhida=="pedra" && escolhaApp == "pedra" || opcaoEscolhida=="lagarto" && escolhaApp == "lagarto" || opcaoEscolhida=="spock" && escolhaApp == "spock" || opcaoEscolhida=="papel" && escolhaApp == "papel" || opcaoEscolhida=="tesoura" && escolhaApp == "tesoura" ){
            text.setText("Empatou!");
        } else {
            text.setText("Você perdeu!");
        }

    }
}
