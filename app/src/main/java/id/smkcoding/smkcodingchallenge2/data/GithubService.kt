package id.smkcoding.smkcodingchallenge2.data

import id.smkcoding.smkcodingchallenge2.GithubUserItem
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Fakhry on 5/7/20.
 */
interface GithubService {

    @GET("users")
    fun getUsers(): Call<List<GithubUserItem>>

}
