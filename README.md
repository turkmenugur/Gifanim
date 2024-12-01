# 🎥 Gifanim - Jetpack Compose için Güçlü GIF Oynatma Kitaplığı 🎨✨

    🚀 Jetpack Compose projelerinizde GIF animasyonlarını kolayca oynatmak mı istiyorsunuz?  

    Gifanim ile animasyonların kontrolü artık elinizde! 🧙‍♂️
   



## 🌟 Özellikler

     🔄 Oynat ve Duraklat: Animasyonu istediğiniz zaman başlatın veya durdurun!
     
     ⏳ Zamanlanmış Oynatma: Belirli bir süre oynatabilir ve sonra durdurabilirsiniz.  
     
     🕒 Hız Kontrolü: GIF'in oynatma hızını (hızlanma veya yavaşlama) kontrol edin.  
     
     ♾️ Döngü Sayısı: Animasyonu sınırlı veya sonsuz döngüde oynatın.  
     
     🌈 Tam Özelleştirme: Animasyon ölçeği, renk filtreleri ve daha fazlası!

    

## 📦 Kurulum

 1️⃣ Bağımlılıklar Ekle

    Aşağıdakileri 'build.gradle' dosyanızın 'dependencies' bölümüne ekleyin:

```gradle
dependencies {
    implementation("com.github.turkmenugur:gifanim:1.0.0")
}
```

## 🚀 Nasıl Kullanılır?

#### 1️⃣ Basit GIF Oynatma

```kotlin
GifPlayer(
    gifUrl = "https://media.giphy.com/media/3o6Zt481isNVuQI1l6/giphy.gif",
    contentDescription = "Eğlenceli GIF"
)
````


#### 2️⃣ Gelişmiş Özelleştirme

```kotlin
GifPlayer(
    gifUrl = "R.drawable.loading_animation",
    contentDescription = "Yükleme animasyonu",
    modifier = Modifier.fillMaxSize(),
    isPlaying = true,             // Animasyonu başlat
    playbackSpeed = 0.5f,         // Hızı %50 yavaşlatır
    loopCount = 3,                // Animasyonu 3 kez döngüye al
    onStart = { println("Başladı!") }, // Animasyon başladığında çağrılır
    onStop = { println("Durduruldu!") } // Animasyon durduğunda çağrılır
)
```

## 🤔 Neden Gifanim?
    
    💡 Basit ve kullanıcı dostu kullanım  
    
    ⚡ Hızlı ve yüksek performans  
    
    🔧 Esnek yapı  
    
    🎨 Jetpack Compose ile mükemmel uyum
