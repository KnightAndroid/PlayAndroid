package com.zj.network.service

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

//Service的写法
interface UrlService {
    //通用下载
    @Streaming
    @GET
    suspend fun downloadFile(@Url url: String): Response<ResponseBody>
}