package br.cellep.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import br.cellep.biscoitodasorte.databinding.ActivityMain2Binding
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding:ActivityMain2Binding

    val listaDeFrases = arrayListOf<String>(
        "吃 chī - to eat / to consume / to eat at.",
        "早上 zǎoshang - early morning.",
        "对不起 duìbuqǐ - I'm sorry / excuse me  / if you please / sorry?",
        "再见 zàijiàn - goodbye / see you again later.",
        "认识 rènshi - to know / to recognize / to be familiar with.",
        "先生 xiānsheng - teacher / husband / doctor (dialect).",
        "谢谢 xièxie - to thank / thanks / thank you.",
        "巴西 Bāxī - Brazil."
    )
    val n = listaDeFrases.size - 1
    val rnds = (0..n).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtRandom.text = listaDeFrases[rnds]

     //   Quando o botão ABRIR OUTRO BISCOITO for clicado, faça
         binding.img.setOnClickListener {
           //random generator
             val n = listaDeFrases.size - 1
             val rnds = (0..n).random()
             //inputting that random value in a screen and printing it in a textView
             binding.txtRandom.text = listaDeFrases[rnds]
        }

        //Quando o botão VOLTAR for clicado, faça
        binding.btnVoltar.setOnClickListener {
            //Voltamos para a MainActivity
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
        }

        //Escutar o clique do botão sair
        binding.btnSair.setOnClickListener {

            //Criar uma caixa de diálogo
            val alert = AlertDialog.Builder(this)
            //Definindo o título da caixa de diálogo
            alert.setTitle("Atenção!")
            //Definindo o corpo da mensagem
            alert.setMessage("Tem certeza de que deseja sair?")

            //Definindo o rótulo do botão e escutando seu clique
            alert.setPositiveButton("Sair") { dialog, which ->
                finishAffinity()
            }
            //Definindo o rótulo do botão e escutando seu clique
            alert.setNeutralButton("Não") { dialog, which -> }
            //Desabilitar a possibilidade do usuário cancelar a caixa diálogo
            //ao clicar fora da mesma, dessa forma o usuário é obrigado
            //a interagir com os botões
            alert.setCancelable(false)
            //Exibindo a caixa de diálogo
            alert.show()
        }
    }
}