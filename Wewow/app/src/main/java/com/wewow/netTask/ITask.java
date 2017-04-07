package com.wewow.netTask;

import org.json.JSONObject;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by iris on 17/3/14.
 */
public interface ITask {
    @GET("/banner")
    void banner(@Header("User-Agent") String headerContentType, Callback<JSONObject> callback);

    @GET("/index_collection_categorys")
    void indexCollectionCategorys(@Header("User-Agent") String headerContentType, Callback<JSONObject> callback);

    @GET("/new")
    void latestInstite(@Header("User-Agent") String headerContentType, Callback<JSONObject> callback);

    @GET("/discovery_info")
    void hotArtistisAndInstitutes(@Header("User-Agent") String headerContentType, Callback<JSONObject> callback);

    @GET("/update_at")
    void updateAt(@Header("User-Agent") String headerContentType, Callback<JSONObject> callback);

    @GET("/artists_mini")
    void allArtists(@Header("User-Agent") String headerContentType, @Query("user_id") String userId,
                    @Query("page") int page, Callback<JSONObject> callback);

    @GET("/artist_mini")
    void artistDetail(@Header("User-Agent") String headerContentType, @Query("user_id") String userId,
                      @Query("artist_id") String artistId, Callback<JSONObject> callback);

    @GET("/user_followed_mini")
    void artistsSubscribed(@Header("User-Agent") String headerContentType, @Query("user_id") String userId,
                           @Query("page") int page, Callback<JSONObject> callback);


    @POST("/follow")
    void followArtist(@Header("User-Agent") String headerContentType, @Query("user_id") String userId,
                      @Query("artist_id") String artistId, @Query("token") String token, @Query("follow") int follow, Callback<JSONObject> callback);

    @GET("/index_category_collections")
    void categoryArtistsAndInstitutes(@Header("User-Agent") String headerContentType, @Query("collection_category_id") String id,
                                     Callback<JSONObject> callback);


}



