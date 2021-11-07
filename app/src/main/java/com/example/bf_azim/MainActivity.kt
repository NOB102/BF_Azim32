package com.example.bf_azim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.bf_azim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout_sbor, BlankFragmentSbor.newInstance())
            .commit()

        binding.buttonNavMenu.setOnItemSelectedListener  {
            when(it.itemId){
            R.id.sbor -> {
                Toast.makeText(this, "сбор", Toast.LENGTH_SHORT).show()

            }
            R.id.otchet -> {
                Toast.makeText(this, "Отчет", Toast.LENGTH_SHORT).show()

            }
            R.id.yvedomleniya -> {
                Toast.makeText(this, "Уведомления", Toast.LENGTH_SHORT).show()

            }
            R.id.profil -> {
                Toast.makeText(this, "ПРОФИЛЬ", Toast.LENGTH_SHORT).show()

            }

            }
            true
        }


    }
}