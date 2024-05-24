package com.example.a8weeks.dataClass

import com.google.gson.annotations.SerializedName

/** 방법3 데이터 클래스 정의
 *
 *
 *
 *
 *
 *
 *
 * **/

data class PostData(
    @SerializedName("code")
    val code :Int,
    @SerializedName("status")
    val status :Int,
    @SerializedName("message")
    val message :String,
    @SerializedName("result")
    val result :PostResult,
)

data class PostResult(
    @SerializedName("userProfileImage")
    val userProfileImage :String,
    @SerializedName("nickName")
    val nickName :String,
    @SerializedName("postImage")
    val postImage :String,
    @SerializedName("like")
    val like :Int,
    @SerializedName("contents")
    val contents :String,
)



