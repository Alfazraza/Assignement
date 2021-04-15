# Assignement

A simple app to hit the NY Times Most Popular Articles API and show a list of articles, that shows details when items on the list are tapped 

Developed using Kotlin language with MVVM, DataBinding, Retrofit.

Getting Started
1. Pull down the code locally.
2. Open Android Studio and select 'Open an existing Android Studio Project'
3. In Project Build.gradle, please copy this code
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    ext.kotlin_version = '1.3.61'
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.5.4'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

    allprojects {
        repositories {
            google()
            jcenter()

        }
    }

    task clean(type: Delete) {
        delete rootProject.buildDir
    }


4. Change the the gradle.properties as follows : 
org.gradle.jvmargs=-Xmx1536m
# When configured, Gradle will run in incubating parallel mode.
# This option should only be used with decoupled projects. More details, visit
# http://www.gradle.org/docs/current/userguide/multi_project_builds.html#sec:decoupled_projects
# org.gradle.parallel=true
# AndroidX package structure to make it clearer which packages are bundled with the
# Android operating system, and which are packaged with your app's APK
# https://developer.android.com/topic/libraries/support-library/androidx-rn
android.useAndroidX=true
# Automatically convert third-party libraries to use AndroidX
android.enableJetifier=true
# Kotlin code style for this project: "official" or "obsolete":
kotlin.code.style=official
kapt.incremental.apt=true
5. Run the application.


Functionality:
1) Home Screen - Fetching the Most Popular Articles 
2) On click of any article it will take you to the detail screen.


