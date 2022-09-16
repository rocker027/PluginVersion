package com.coors.plugin.version

object Libs {
    private const val verAndroidJunit5 = "1.3.0"
    private const val verJunit5 = "5.8.2"
    private const val verKotest = "5.3.0"
    private const val verHiltNavigationCompose = "1.0.0"
    private const val verColiCompose = "2.1.0"
    private const val verViewModelCompose = "2.4.1"
    private const val verActivityCompose = "1.4.0"
    const val verComposeUi: String = "1.1.1"
    private const val verArchCore = "2.1.0"
    private const val verAndroidLegacy = "1.0.0"
    private const val verNavigation = "2.4.1"
    private const val verActivityKtx = "1.4.0"
    private const val verFragmentKtx = "1.4.1"
    private const val verLifecycle = "2.4.1"
    private const val verOkhttp = "4.8.0"
    private const val verRetrofit = "2.8.1"
    private const val verMoshi = "1.13.0"
    private const val verKotlinCoroutines = "1.5.2"
    private const val verKotlinDateTime = "0.2.1"
    private const val verHilt = "2.38.1"
    private const val verHiltViewModel = "1.0.0-alpha01"
    private const val verAndroidJunit = "1.1.3"
    private const val verKotlin = ""
    private const val verSquareUpLogcat = "0.1"
    private const val verAppCompat = "1.4.1"
    private const val verMaterial = "1.5.0"
    private const val verConstraintLayout = "1.1.3"
    private const val verComposeConstraintLayout = "1.0.1"
    private const val verJUnit = "4.12"
    private const val verEspresso = "3.4.0"
    private const val verAndroidxCoreKtx = "1.7.0"
    private const val verMockk = "1.12.8"
    private const val verAndroidTest = "1.4.0"
    private const val verAndroidRunner = "1.4.0"
    private const val verAndroidRules = "1.4.0"

    /**
     * To define dependencies
     */
    const val androidJunit5Runner = "de.mannodermaus.junit5:android-test-runner:$verAndroidJunit5"
    const val androidJunit5Core = "de.mannodermaus.junit5:android-test-core:$verAndroidJunit5"
    const val junit5Engine = "org.junit.jupiter:junit-jupiter-engine:$verJunit5"
    const val junit5Jupiter = "org.junit.jupiter:junit-jupiter-api:$verJunit5"
    const val koTestProperty = "io.kotest:kotest-property:$verKotest"
    const val koTestAssertions = "io.kotest:kotest-assertions-core:$verKotest"
    const val koTestRunner = "io.kotest:kotest-runner-junit5:$verKotest"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:$verHiltNavigationCompose"
    const val coliCompose = "io.coil-kt:coil-compose:$verColiCompose"
    const val composeUnitTest = "androidx.compose.ui:ui-test-junit4:$verComposeUi"
    const val composeUiLiveData = "androidx.compose.runtime:runtime-livedata:$verComposeUi"
    const val composeMaterialDesignIconExtended =
        "androidx.compose.material:material-icons-extended:$verComposeUi"
    const val composeMaterialDesignIcon =
        "androidx.compose.material:material-icons-core:$verComposeUi"
    const val composeMaterialDesign = "androidx.compose.material:material:$verComposeUi"
    const val composeFoundation = "androidx.compose.foundation:foundation:$verComposeUi"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:$verComposeUi"
    const val composeUi = "androidx.compose.ui:ui:$verComposeUi"
    const val composeConstraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:$verComposeConstraintLayout"

    const val androidTestCoreKtx = "androidx.test:core-ktx:$verAndroidTest"
    const val androidTestCore = "androidx.test:core:$verAndroidTest"
    const val androidRules = "androidx.test:rules:$verAndroidRules"
    const val androidRunner = "androidx.test:runner:$verAndroidRunner"
    const val androidJunitKtx = "androidx.test.ext:junit-ktx:$verAndroidJunit"

    const val hiltAndroid = "com.google.dagger:hilt-android:$verHilt"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:$verHilt"

    const val kotlinCoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:$verKotlinCoroutines"
    const val kotlinCoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:$verKotlinCoroutines"
    const val kotlinCoroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:$verKotlinCoroutines"
    const val kotlinDateTime = "org.jetbrains.kotlinx:kotlinx-datetime:$verKotlinDateTime"
    const val androidCoreKtx = "androidx.core:core-ktx:$verAndroidxCoreKtx"
    const val appCompat = "androidx.appcompat:appcompat:$verAppCompat"
    const val activityKtx = "androidx.activity:activity-ktx:$verActivityKtx"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$verFragmentKtx"
    const val squareUpLogcat = "com.squareup.logcat:logcat:$verSquareUpLogcat"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$verKotlin"
    const val materialDesign = "com.google.android.material:material:$verMaterial"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$verConstraintLayout"

    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$verNavigation"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$verNavigation"

    const val activityCompose = "androidx.activity:activity-compose:${verActivityCompose}"

    // lifecycle
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$verLifecycle"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:$verLifecycle"
    const val lifecycleLiveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:$verLifecycle"
    const val lifecycleSaveState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:$verLifecycle"
    const val lifecycleProcess =
        "androidx.lifecycle:lifecycle-process:$verLifecycle"
    const val lifecycleReactLiveStreamsKtx =
        "androidx.lifecycle:lifecycle-reactivestreams-ktx:$verLifecycle"

    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:$verMoshi"
    const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$verMoshi"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:$verMoshi"

    const val viewModelCompose =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${verViewModelCompose}"
    const val animationCompose = "androidx.compose.animation:animation:$verComposeUi"

    const val archCore = "androidx.arch.core:core-testing:$verArchCore"
    const val mockkCore = "io.mockk:mockk:$verMockk"
    const val mockkJvm = "io.mockk:mockk-agent-jvm:$verMockk"
    const val mockkAndroid = "io.mockk:mockk-android:$verMockk"
    const val junit = "junit:junit:$verJUnit"
    const val androidJunit = "androidx.test.ext:junit:$verAndroidJunit"
    const val espresso = "androidx.test.espresso:espresso-core:$verEspresso"
    const val androidLegacy = "androidx.legacy:legacy-support-v4:$verAndroidLegacy"
}

val implementationLibs = listOf(

    Libs.androidCoreKtx,
    Libs.appCompat,
    Libs.materialDesign,
    Libs.constraintLayout,
    Libs.activityKtx,
    Libs.fragmentKtx,
    Libs.navigationFragmentKtx,
    Libs.navigationUiKtx,
    Libs.androidLegacy,

    Libs.kotlinCoroutinesCore,
    Libs.kotlinCoroutinesAndroid,

    Libs.lifecycleKtx,
    Libs.lifecycleViewModelKtx,
    Libs.lifecycleSaveState,
    Libs.lifecycleLiveDataKtx,
    Libs.lifecycleProcess,
    Libs.lifecycleReactLiveStreamsKtx,

    Libs.composeUi,
    Libs.composeConstraintLayout,
    // Tooling support (Previews, etc.,
    Libs.composeUiTooling,
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.,
    Libs.composeFoundation,
    // Integration with activities
    Libs.activityCompose,
    // Animations
    Libs.animationCompose,
    // Integration with ViewModels
    Libs.viewModelCompose,
    // Material Design
    Libs.composeMaterialDesign,
    // Material design icons
    Libs.composeMaterialDesignIcon,
    Libs.composeMaterialDesignIconExtended,
    // Integration with observables
    Libs.composeUiLiveData,
    Libs.coliCompose,
    Libs.hiltNavigationCompose,
    Libs.composeConstraintLayout,
    Libs.hiltAndroid,

    Libs.hiltAndroid,

    Libs.squareUpLogcat,
    Libs.moshiKotlin,
    Libs.moshiAdapters,
)

val testImplementationLibs = listOf(
    Libs.junit,
    Libs.mockkCore,
    Libs.mockkJvm,
    // koTest
    Libs.koTestRunner,
    Libs.koTestAssertions,
    Libs.koTestProperty,
    // junit 5
    Libs.junit5Jupiter,
)

val androidTestImplementationLibs = listOf(
    // Core library
    Libs.androidTestCore,
    Libs.androidTestCoreKtx,

    // AndroidJUnitRunner and JUnit Rules
    Libs.androidRunner,
    Libs.androidRules,

    // Assertions
    Libs.androidJunit,
    Libs.androidJunitKtx,
    Libs.archCore,
    Libs.kotlinCoroutinesTest,
    Libs.mockkJvm,
    Libs.mockkAndroid,
    Libs.androidJunit,
    Libs.espresso,

    // compose UI Tests
    Libs.composeUnitTest,
    Libs.koTestRunner,
    Libs.koTestAssertions,
    Libs.koTestProperty,
    Libs.androidJunit5Core,
)

val kaptLibs = listOf(
    Libs.hiltAndroidCompiler
)

val kspLibs = listOf(
    Libs.moshiCodegen
)

val testRuntimeOnly = listOf(
    Libs.junit5Engine
)

val androidTestRuntimeOnly = listOf(
    Libs.androidJunit5Runner
)