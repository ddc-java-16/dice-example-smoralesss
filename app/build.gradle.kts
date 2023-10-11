plugins {
    id("com.android.application")
}

android {
    namespace = "edu.cnm.deepdive.diceexample"
    compileSdk = 34

    defaultConfig {
        applicationId = "edu.cnm.deepdive.diceexample"
        minSdk = 28
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        resValue("string", "base_url", "https://www.dejete.com/" )
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.9.0")
    implementation("io.reactivex.rxjava3:rxjava:3.1.8")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    runtimeOnly("androidx.lifecycle:lifecycle-runtime:2.6.2")
    runtimeOnly ("androidx.lifecycle:lifecycle-livedata:2.6.2")
    runtimeOnly ("androidx.lifecycle:lifecycle-viewmodel:2.6.2")



    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}