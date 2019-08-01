package tads.ifpr.viking

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activityragnar.*
import kotlinx.android.synthetic.main.content_ragnar.*
import kotlinx.android.synthetic.main.content_scrol.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityragnar)
        setSupportActionBar(toolbar)

        btRagnarL.setOnClickListener { telaLagertha() }
        btRagnarB.setOnClickListener { telaBjorn() }
        btRagnarF.setOnClickListener { telaFloki() }
    }

    private fun telaLagertha() {
        val intent= Intent(this, LagerthaActivity::class.java)
        startActivity(intent)
    }
    private fun telaFloki() {
        val intent= Intent(this, FlokiActivity::class.java)
        startActivity(intent)
    }
    private fun telaBjorn() {
        val intent= Intent(this, BjornActivity::class.java)
        startActivity(intent)
    }

}
