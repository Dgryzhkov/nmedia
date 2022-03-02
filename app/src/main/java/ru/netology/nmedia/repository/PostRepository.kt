package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import ru.netology.nmedia.dto.Post

interface PostRepository {

fun likeByIdAsync(id: Long, callback:LikeCallback)
    fun unLikeByIdAsync(id: Long, callback:LikeCallback)
    fun saveAsync(post: Post, callback: SaveRemoveCallback)
    fun removeByIdAsync(id: Long, callback: SaveRemoveCallback)
    fun getAllAsync(callback: GetAllCallback)

    interface GetAllCallback {
        fun onSuccess(posts: List<Post>)
        fun onError(e: Exception)
    }

    interface LikeCallback {
        fun onSuccess(id: Long, post: Post)
        fun onError(e: Exception)
    }

    interface SaveRemoveCallback {
        fun onSuccess()
        fun onError(e: Exception)
    }
}
