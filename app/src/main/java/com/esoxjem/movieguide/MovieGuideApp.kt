package com.esoxjem.movieguide

import android.app.Application
import com.esoxjem.movieguide.movies.listing.ListingComponent
import com.esoxjem.movieguide.movies.listing.ListingModule

/**
 * @author arunsasidharan
 */

class MovieGuideApp : Application() {

    lateinit var appComponent: AppComponent
    var listingComponent: ListingComponent? = null

    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    fun createListingComponent() : ListingComponent? {
        listingComponent = appComponent.plus(ListingModule())
        return listingComponent
    }

    fun releaseListingComponent() {
        listingComponent = null
    }

}
