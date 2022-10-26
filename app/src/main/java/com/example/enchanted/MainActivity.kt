package com.example.enchanted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var homeFragment = HomeFragment();
    private var profileFragment = ProfileFragment();
    private var settingsFragment = SettingsFragment();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.Home -> replaceFragment(homeFragment)
                R.id.Profile -> replaceFragment(profileFragment)
                R.id.Settings -> replaceFragment(settingsFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction();
            transaction.replace(R.id.frameLayout, fragment);
            transaction.commit();
        }
    }

    /** Called when the user touches the button */
    fun dispense(view: View) {
        Toast.makeText(this@MainActivity, "dispense.", Toast.LENGTH_SHORT).show()
    }
    fun interact(view: View) {
        Toast.makeText(this@MainActivity, "interact.", Toast.LENGTH_SHORT).show()
    }
    fun snap(view: View) {
        Toast.makeText(this@MainActivity, "snap", Toast.LENGTH_SHORT).show()
    }
    fun voice(view: View) {
        Toast.makeText(this@MainActivity, "voice", Toast.LENGTH_SHORT).show()
    }
}