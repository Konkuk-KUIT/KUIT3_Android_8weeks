package com.example.a8weeks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a8weeks.dataClass.PostData
import com.example.a8weeks.databinding.ActivityMainBinding
import com.example.a8weeks.retrofitIf.PostIF
import com.example.a8weeks.ui.theme._8weeksTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigation.itemIconTintList = null
        binding.navigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Home()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_search -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Search()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_create -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Create()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_reels -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Reels()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Profile()).commit()
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener true
                }
            }
        }

        binding.mainFrm.setOnClickListener {  }


        binding.navigation.selectedItemId = R.id.menu_home
    }
}

