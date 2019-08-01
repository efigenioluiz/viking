package tads.ifpr.viking

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_lagertha.*
import kotlinx.android.synthetic.main.content_lagertha.*
import kotlinx.android.synthetic.main.content_scrol.*

class LagerthaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)
        setSupportActionBar(toolbar)

        btLagerthaR.setOnClickListener { telaRagnar() }
        btLagerthaB.setOnClickListener { telaBjorn() }

    }
    private fun telaRagnar() {
        val intent= Intent(this, RagnarActivity::class.java)
        startActivity(intent)
    }
    private fun telaBjorn() {
        val intent= Intent(this, BjornActivity::class.java)
        startActivity(intent)
    }


}
