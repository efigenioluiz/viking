package tads.ifpr.viking

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_bjorn.*
import kotlinx.android.synthetic.main.content_bjorn.*
import kotlinx.android.synthetic.main.content_scrol.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)
        setSupportActionBar(toolbar)

        btBjornR.setOnClickListener { telaRagnar() }
        btBjornF.setOnClickListener { telaFloki() }
        btBjornA.setOnClickListener { telaAst() }
        btBjornL.setOnClickListener { telaLagertha() }

    }
    private fun telaLagertha() {
        val intent= Intent(this, LagerthaActivity::class.java)
        startActivity(intent)
    }

    private fun telaRagnar() {
        val intent= Intent(this, RagnarActivity::class.java)
        startActivity(intent)
    }
    private fun telaAst() {
        val intent= Intent(this, AthelstanActivity::class.java)
        startActivity(intent)
    }

    private fun telaFloki() {
        val intent= Intent(this, FlokiActivity::class.java)
        startActivity(intent)
    }

}
