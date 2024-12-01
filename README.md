# 🎥 Gifanim - A Powerful GIF Playback Library for Jetpack Compose 🎨✨

    🚀 Looking for an easy way to play GIF animations in your Jetpack Compose projects?
    
    With Gifanim, you have full control over your animations!  🧙‍♂️
   



## 🌟 Features

     🔄 Play and Pause: Start or stop the animation anytime you want!
     
     ⏳ Timed Playback: Play the animation for a set duration and then stop. 
     
     🕒 Speed Control: Adjust the playback speed (speed up or slow down) of the GIF.  
     
     ♾️ Loop Count: Play the animation with limited or infinite looping.  
     
     🌈 Full Customization: Customize scale, color filters, and much more!

    

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
    gifUrl = "R.drawable.loading_animation",
    contentDescription = "Loading animation"
)
````


#### 2️⃣ Advanced Customization

```kotlin
GifPlayer(
    gifUrl = "R.drawable.loading_animation",
    contentDescription = "Loading animation",
    modifier = Modifier.fillMaxSize(),
    isPlaying = true,             // Start the animation
    playbackSpeed = 0.5f,         // Slow down the speed by 50%
    loopCount = 3,                // Play the animation 3 times
    onStart = { println("Started!") }, // Triggered when the animation starts
    onStop = { println("Stopped!") } // Triggered when the animation stops
)
```

## 🤔 Why Gifanim?
    
    💡 Simple and user-friendly usage  
    
    ⚡ Fast and highly performant  
    
    🔧 Flexible structure  
    
    🎨 Perfect compatibility with Jetpack Compose
