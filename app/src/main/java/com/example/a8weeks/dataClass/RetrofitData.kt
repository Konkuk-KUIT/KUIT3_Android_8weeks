package com.example.a8weeks.dataClass

import com.google.gson.annotations.SerializedName

data class PostData (
    @SerializedName("code")
    val code: Int,
    @SerializedName("status")
    val status: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("result")
    val result: PostResult
)

data class PostResult (
    @SerializedName("userProfileImage")
    val userProfileImage: String,
    @SerializedName("nickName")
    val nickName: String,
    @SerializedName("postImage")
    val postImage: String,
    @SerializedName("like")
    val like: Int,
    @SerializedName("contents")
    val contents: String
)



