# Kotlin Multiplatform Mobile

## Exploring the KMM Project Structure - KMM For Beginner

The project structure, mainly const of this folder.

```
app/
├── androidApp/
├── iosApp/
├── shared/
├── build.gradle.kts
└── gradle/
```

## Creating first Hello World on KMM App

[KMM](https://kotlinlang.org/lp/mobile/) is stands for Kotlin Multiplatform Mobile.
Share the logic of your iOS and Android apps while keeping the UX native

### What is Kotlin Multiplatform Mobile (KMM)?

Kotlin Multiplatform Mobile is an SDK for iOS and Android app development. It offers all the combined benefits of creating cross-platform and native apps.

It is trusted in production by many of the world’s leading companies, including Philips, Netflix, Leroy Merlin, and VMWare.

**Requisites**
- Android Studio
- JDK
- XCode
- brew


Se debe instalar kdoctor, que es una herramienta de JetBrains para verificar si se tiene instalado las herramientas necesarias para trabajar con KMM

- **`brew install kdoctor`**
- **`kdoctor`**


To download Xcode, you can visit this link to know what version is supported by you OS
- [Apple Suport Xcode](https://developer.apple.com/support/xcode)
- [Download Xcode](https://developer.apple.com/download/all/)

- Download Kotlin Multiplatform Mobile plugin from Android Studio

CocoaPods is a dependency manager for iOS apps.
For install cocoaPods we need have ruby installed on our computer.

- **`brew install ruby@2.7`**
- **`gem install cocoapods`**
- **`gem install cocoapods-generate`**

If not work, install with brew way

:bulb: [Installing Cocoapods on M1 Macbook Air, Big Sur](https://dev.to/staceypyee/installing-cocoapods-on-m1-macbook-air-big-sur-h0l)

- **`brew install cocoapods`**
- **`brew link --overwrite cocoapods`**
- **`brew unlink cocoapods && brew link cocoapods`**