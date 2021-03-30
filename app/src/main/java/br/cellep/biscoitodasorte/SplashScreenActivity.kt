package br.cellep.biscoitodasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //Executando instruções após determinado tempo
        Handler(Looper.getMainLooper()).postDelayed({
            //Uma das utilidades da classe Intent é usá-la para abrir uma Activity/Tela
            val mIntent = Intent(this, MainActivity2::class.java)

            //Método responsável por executar o Intent
            startActivity(mIntent)

            //Remove a tela da pilha
            finish()
        }, 1000) //tempo em milisegundos

    }
}