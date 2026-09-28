plugins {
    id("com.android.application")
}

android {
    namespace = "co.gov.transitobucaramanga.observatoriodtb"
    compileSdk = 35

    defaultConfig {
        applicationId = "co.gov.transitobucaramanga.observatoriodtb"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity:1.10.0")
}
