package com.br.culturanerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FrasesActivity extends AppCompatActivity {

    private Button fras, frasM;
    private TextView rfras, rfrasM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);

        fras = (Button) findViewById(R.id.frases);
        frasM = (Button) findViewById(R.id.frasesMoti);
        rfras = (TextView) findViewById(R.id.respFrases);
        rfrasM = (TextView) findViewById(R.id.respFrasesMoti);

        fras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //Clicando no "fras" ele vai procurar uma frase abaixo;
                String[] frases = { // Uma array de String chamada frases, recebe as frases abaixo;

                        "O dinheiro não traz felicidade — para quem não sabe o que fazer com ele.",
                        "Lágrimas não são argumentos.",
                        "Só a poesia possui as coisas vivas. O resto é necropsia.",
                        "Entretanto, vida diferente não quer dizer vida pior.",
                        "A perfeição no amor consiste no sacrifício dos desejos do amante que deseja somente agradar a pessoa amada.",
                        "Adoramos a perfeição, porque não a podemos ter; repugna-la-íamos se a tivéssemos. O perfeito é o desumano porque o humano é imperfeito.",
                        "O meu passado é tudo quanto não consegui ser. Nem as sensações de momentos idos me são saudosas: o que se sente exige o momento; passado este, há um virar de página e a história continua, mas não o texto.",
                        "Querer não é poder. Quem pôde, quis antes de poder só depois de poder. Quem quer nunca há-de poder, porque se perde em querer.",
                        "O amor é quando a gente mora um no outro.",
                };

                int numero = new Random().nextInt(9 ); // A Variavel de nome numero, recebe 9 frases

                TextView frase = findViewById(R.id.respFrases); // Aqui a frase selecionada será impressa na "respFrases" do Layout
                frase.setText(frases[numero]);// Aqui será "setado" uma frase entre as nove para impressão na tela

            }
        });

        frasM.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String[] frases = {

                        "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis",
                        "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
                        "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
                        "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
                        "No meio da dificuldade encontra-se a oportunidade.",
                        "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre.",
                        "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
                        "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.",
                        "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.",
                };

                int numero = new Random().nextInt(9 );

                TextView frase = findViewById(R.id.respFrasesMoti);
                frase.setText(frases[numero]);
            }
        });
    }
}