package com.ozancanguz.coinstats.data.repository

import com.ozancanguz.coinstats.data.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(private val remoteDataSource: RemoteDataSource) {

    val remote=remoteDataSource
}