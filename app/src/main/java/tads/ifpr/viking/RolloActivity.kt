package tads.ifpr.viking

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_rollo.*
import kotlinx.android.synthetic.main.content_rollo.*
import kotlinx.android.synthetic.main.content_scrol.*

class RolloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)
        setSupportActionBar(toolbar)
        btRolloB.setOnClickListener { telaBjorn() }

    }
    private fun telaBjorn() {
        val intent= Intent(this, BjornActivity::class.java)
        startActivity(intent)
    }

}
