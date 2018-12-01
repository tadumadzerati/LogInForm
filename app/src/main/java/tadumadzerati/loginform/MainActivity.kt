package tadumadzerati.loginform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logIn()
    }

    private fun logIn(){
        button.setOnClickListener {
            if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
                val intent = Intent(this,SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
