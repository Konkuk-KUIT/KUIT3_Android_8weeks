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
import retrofit2.create


class Home : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        // 방법5 레트로핏 객체 생성
        val retrofit = Retrofit.Builder().baseUrl("http://3.34.69.27")
            .addConverterFactory(GsonConverterFactory.create()).build()

        val service = retrofit.create(PostIF::class.java)

        service.posts.enqueue(object : Callback<PostData> {
            override fun onResponse(call: Call<PostData>, response: Response<PostData>) {
                if (response.isSuccessful) {
                    val response = response.body()
                    // 받아온 파일 적용하기
                    if (response != null) {
                        Glide.with(requireContext())
                            .load(response.result.postImage)
                            .into(binding.ivHomePostingImage)
                        Glide.with(requireContext())
                            .load(response.result.userProfileImage)
                            .into(binding.sivHomePostingProfile)
                        binding.tvHomePostingProfileName.setText(response.result.nickName)
                        binding.tvHomePostingInfo.setText(response.result.nickName)
                        binding.tvHomePostingInfo2.setText("님 외 " + response.result.like + "명이 좋아합니다")
                        binding.tvHomePostingContentName.setText(response.result.nickName)
                        binding.tvHomePostingContent.setText(response.result.contents)

                    }
                    if (response != null) {
                        Log.d("성공", response.result.postImage)
                    }
                }
            }

            override fun onFailure(call: Call<PostData>, t: Throwable) {
                Log.d("실패", t.message.toString())
            }
        })


        return binding.root
    }

}