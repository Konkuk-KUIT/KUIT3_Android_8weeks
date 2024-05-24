package com.example.a8weeks.retrofitIf;

import com.example.a8weeks.dataClass.PostData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostIF {

   /**방법4 인터페이스 선언
    *
    *
    *
    *
    *
    * **/

   @GET("/week/post")
   Call<PostData> getPosts();
}
