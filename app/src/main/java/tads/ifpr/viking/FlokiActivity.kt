package tads.ifpr.viking

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_floki.*
import kotlinx.android.synthetic.main.content_floki.*
import kotlinx.android.synthetic.main.content_scrol.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)
        setSupportActionBar(toolbar)
        btFlokiR.setOnClickListener { telaRagnar() }

    }

    private fun telaRagnar() {
        val intent= Intent(this, RagnarActivity::class.java)
        startActivity(intent)
    }
}
