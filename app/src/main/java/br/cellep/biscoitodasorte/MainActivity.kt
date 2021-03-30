package br.cellep.biscoitodasorte

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.cellep.biscoitodasorte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Quando o botão ABRIR MEU BISCOITO for clicado, faça
        binding.btnGerar1.setOnClickListener {
            //A Splash Activity é aberta
            val mIntent = Intent(this, SplashScreenActivity::class.java)
            startActivity(mIntent)
        }
    }
}