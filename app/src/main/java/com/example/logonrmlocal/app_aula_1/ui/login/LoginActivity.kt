package com.example.logonrmlocal.app_aula_1.ui.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.logonrmlocal.app_aula_1.R
import com.example.logonrmlocal.app_aula_1.extensions.value
import com.example.logonrmlocal.app_aula_1.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btFazerPedido.setOnClickListener {
            fazerPedido()
        }
    }

    private fun fazerPedido() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("nome", inputNome.value())
        intent.putExtra("telefone", inputTelefone.value())
        startActivity(intent)
    }
}
