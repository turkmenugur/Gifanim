# 🎥 Gifanim - A Powerful GIF Playback Library for Jetpack Compose 🎨✨

    🚀 Looking for an easy way to play GIF animations in your Jetpack Compose projects?
    
    With Gifanim, you have full control over your animations!  🧙‍♂️
   



## 🌟 Features

     🔄 Play and Pause: Start or stop the animation anytime you want!
               
     ♾️ Loop Count: Play the animation with limited or infinite looping.  
     
     🌈 Full Customization: Customize scale and much more!

    

## 📦 Installation

 1️⃣ Add Dependencies

    Add the following to the 'dependencyResolutionManagement' section in your 'settings.gradle' file:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io")  }
    }
}
```

    Then, include this in the dependencies section of your 'build.gradle' file:

```gradle
dependencies {
    implementation("com.github.turkmenugur:gifanim:1.0.0")
}
```

## 🚀 How to Use?

#### 1️⃣ Simple GIF Playback

```kotlin
GifPlayer(
    gifResId = R.drawable.loading_animation,
)
````


#### 2️⃣ Advanced Customization

```kotlin
GifPlayer(
    gifResId = R.drawable.loading_animation,
    modifier = Modifier.padding(16.dp),
    loopCount = 3,
    onStart = {
        Toast.makeText(context, "Animation started", Toast.LENGTH_SHORT).show()
    },
    onStop = {
        Toast.makeText(context, "Animation is over!", Toast.LENGTH_SHORT).show()
    },
    width = 200,
    height = 200
)
```

![gifanim usage](https://github.com/user-attachments/assets/93d064f2-1dfc-43f9-97da-eb4b25506565)

## 🤔 Why Gifanim?
    
    💡 Simple and user-friendly usage  
    
    ⚡ Fast and highly performant  
    
    🔧 Flexible structure  
    
    🎨 Perfect compatibility with Jetpack Compose
