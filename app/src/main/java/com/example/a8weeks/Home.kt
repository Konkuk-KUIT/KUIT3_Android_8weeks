package com.example.a8weeks

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.a8weeks.dataClass.PostData
import com.example.a8weeks.databinding.FragmentHomeBinding
import com.example.a8weeks.retrofitIf.PostIF
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Home : Fragment() {
    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        /**방법5 레트로핏 객체 생성
         *
         *
         *
         *
         *
         *
         * **/


        return binding.root
    }

}