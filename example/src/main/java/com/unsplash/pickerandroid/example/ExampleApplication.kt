package com.unsplash.pickerandroid.example

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "3515b1926e0a3846cfa3bdd6347acc1333101c8be0f8829666d422da06421bbc",
            "1a375f879fe2342d6990dc147486a65a263691e8dafcda453e1cf3041d4a7337"
            /* optional page size (number of photos per page) */
        )
            /* .setLoggingEnabled(true) // if you want to see the http requests */
    }
}
