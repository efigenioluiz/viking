package tads.ifpr.viking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_scrol.*
import kotlinx.android.synthetic.main.content_scrol.*

class ScrolActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrol)
        toolbar.title= ""
        setSupportActionBar(toolbar)

        btRagnar.setOnClickListener { telaRagnar() }
        btLagertha.setOnClickListener { telaLagertha() }
        btRollo.setOnClickListener { telaRollo() }
        btFloki.setOnClickListener { telaFloki() }
        btAtl.setOnClickListener { telaAst() }
        btBjorn.setOnClickListener { telaBjorn() }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_scrol, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun telaBjorn() {
        val intent= Intent(this, BjornActivity::class.java)
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

    private fun telaRollo() {
        val intent= Intent(this, RolloActivity::class.java)
        startActivity(intent)
    }

    private fun telaLagertha() {
        val intent= Intent(this, LagerthaActivity::class.java)
        startActivity(intent)
    }

    private fun telaRagnar() {
        val intent= Intent(this, RagnarActivity::class.java)
        startActivity(intent)
    }

}
