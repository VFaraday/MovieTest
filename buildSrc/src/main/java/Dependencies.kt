object Versions {
    //Core
    const val navigation = "2.3.2"
    const val coroutines = "1.7.3"
    const val glide = "4.12.0"
    const val timber = "4.7.1"
    const val lifecycle = "2.2.0"
    const val androidx_core = "1.3.2"
    const val retrofitCoroutines = "0.9.2"
    const val multidex = "2.0.1"
    const val hilt = "2.48.1"
    const val navCompose = "2.7.5"
    const val hiltNavCompose = "1.0.0"
    const val coilCompose = "2.5.0"

    //Remote
    const val retrofit = "2.9.0"
    const val retrofitGson = "2.9.0"
    const val okhttp = "4.9.0"

    //UI
    const val constraintlayout = "2.0.4"
    const val appcompat = "1.6.1"
    const val material = "1.10.0"
    const val swipelayout = "1.1.0"

    //Test
    const val assertj = "3.6.2"
    const val coreTesting = "2.1.0"
    const val mockito = "3.5.13"
    const val mockitoKotlin = "2.2.0"
    const val coroutinesTest = "1.4.2"
    const val jUnit = "4.12"
    const val espresso = "3.3.0"
    const val androidxJunit = "1.1.2"

}

object AppMetaData {
    const val id = "com.zattoo.movies"
    const val compileSdkVersion = 29
    const val targetSdkVersion = 29
    const val minSdkVersion = 21
    const val buildToolsVersion = "30.0.3"
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Deps {
    //Core
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidx_core}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"

    //UI
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val swiperefresh =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipelayout}"
    const val navigationFragment =
        "android.arch.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "android.arch.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val coil = "io.coil-kt:coil-compose:${Versions.coilCompose}"

    //
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"
    const val hilNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavCompose}"

    //Hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltKapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"


    //Networking
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
    const val retrofitCoroutines =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    const val okhttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val gson = "com.google.code.gson:gson:${Versions.retrofitGson}"

    //Coroutines
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    //Lifecycle
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    //Timber
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    //Multidex
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"

    //Test
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val mockitoCore = "org.mockito:mockito-core:3.0.0${Versions.mockito}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val coreTesting = "androidx.arch.core:core-testing:${Versions.coreTesting}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTest}"
    const val assertJ = "org.assertj:assertj-core:${Versions.assertj}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
    const val espressoIdlingResource = "androidx.test.espresso:espresso-idling-resource:${Versions.espresso}"
}