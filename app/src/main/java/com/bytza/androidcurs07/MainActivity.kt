package com.bytza.androidcurs07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bytza.androidcurs07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var mainSupportFragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccount.setOnClickListener() {
            putFragment(LoginFragment.newInstance())
        }
        binding.btnList.setOnClickListener() {
            putFragment(PetsFragment(mainSupportFragmentManager))
        }

        putFragment(PetsFragment(mainSupportFragmentManager))
    }

    private fun putFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(binding.frgHolder.id, fragment)
            .commit()
    }}