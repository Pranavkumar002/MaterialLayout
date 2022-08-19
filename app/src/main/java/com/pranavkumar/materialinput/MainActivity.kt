package com.pranavkumar.materialinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doOnTextChanged
import com.pranavkumar.materialinput.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etEmail.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0)>3){
                binding.tilEmail.error = resources.getString(R.string.enter_email)
            }else{
                binding.tilEmail.error = null
            }
        }
    }
}