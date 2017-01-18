package com.esoxjem.movieguide

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author arunsasidharan
 */
@Module
class AppModule(private val application: Application) {

    @Provides @Singleton
    fun provideContext(): Context {
        return application
    }
}