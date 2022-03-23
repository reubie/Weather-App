# Weather-App
<a href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat" alt="API" /></a>
<a href="https://ktlint.github.io/"><img src="https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg" alt="ktlint" /></a>

Weatherapp is a simple weather forecast app, which uses some APIs to fetch 5 day / 3 hour forecast data from the [OpenWeatherMap](https://openweathermap.org/forecast5) and to fetch places,cities,counties,coords etc. from [Algolia Places](https://community.algolia.com/places/). The main goal of this app is to be a sample of how to build an high quality Android application that uses the Architecture components, Hilt etc. in Kotlin.

## Libraries and tools 🛠

<li><a href="https://developer.android.com/topic/libraries/architecture/navigation/">Navigation</a></li>
<li><a href="https://developer.android.com/training/data-storage/shared-preferences">Shared Preferences</a></li>
<li><a href="https://developer.android.com/topic/libraries/architecture/viewmodel">ViewModel</a></li>
<li><a href="https://developer.android.com/topic/libraries/architecture/livedata">LiveData</a></li>
<li><a href="https://developer.android.com/reference/androidx/lifecycle/Transformations">Transformations</a></li>
<li><a href="https://developer.android.com/topic/libraries/data-binding">Data Binding</a></li>
<li><a href="https://developer.android.com/topic/libraries/architecture/room">RoomDB</a></li>
<li><a href="https://github.com/ReactiveX/RxJava">RxJava</a></li>
<li><a href="https://github.com/ReactiveX/RxAndroid">RxAndroid</a></li>
<li><a href="https://github.com/ReactiveX/RxKotlin">RxKotlin</a></li>
<li><a href="https://square.github.io/retrofit/">Retrofit</a></li>
<li><a href="https://github.com/square/okhttp">OkHttp</a></li>

## Architecture
The app uses MVVM [Model-View-ViewModel] architecture to have a unidirectional flow of data, separation of concern, testability, and a lot more.



