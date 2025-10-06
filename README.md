# CVgeneratorPDFbennu
 Bu proje, Java ve Apache PDFBox kütüphanesini kullanarak bir PDF özgeçmiş (CV) oluşturur. Proje, hayali bir kullanıcının kişisel bilgilerini, eğitim geçmişini ve iş deneyimlerini PDF formatında düzenli bir şekilde sunar.

Projeyi kullanarak, kendi bilgilerini ekleyebilir ve profesyonel görünümlü bir PDF özgeçmiş oluşturabilirsin.

Özellikler

1- PDF formatında özgeçmiş oluşturma
2-Fotoğraf ekleme desteği
3-Kişisel bilgiler, eğitim ve iş deneyimi bölümleri
4-Basit ve anlaşılır Java kodu ile özelleştirilebilir
5-Maven bağımlılık yönetimi (PDFBox)

# ÖNİZLEME

# Örnek içerik:

İsim: Bennu Dal
Email: bennudal2007@icloud.com
Telefon: +90 505 008 59 21
Adres: Kırklareli, Türkiye
İş Deneyimi:
2020-2021 | Stajyer Yazılım Mühendisi – XYZ Yazılım, Tekirdağ
2022-2023 | Google Jules | Yazılım Geliştirme
2023-2025 | Claude Code | Backend Developer
Eğitim: Lisans Yazılım Mühendisliği | Kırklareli University

#Kurulum

1-Depoyu klonlayın.
2-Maven bağımlılıklarını yükleyin.
3-PdfGenerator.java dosyasını açın ve fotoğraf yolunu kendi bilgisayarınıza göre güncelleyin.
4-Projeyi çalıştırın.

# Kullanım

-Projeyi çalıştırdıktan sonra, proje dizininde ozgecmisbennu.pdf adlı PDF dosyası oluşturulacaktır.

-PDF dosyasını açarak, kişisel bilgilerini, eğitim ve iş deneyimlerini görebilirsin.

# Özelleştirme

1-Kendi adınızı ve bilgilerinizi değiştirmek için PdfGenerator.java içindeki metinleri düzenleyin.

2-Fotoğraf eklemek için PDImageXObject.createFromFile() metoduna kendi fotoğraf yolunu girin.

3-Yazı tipi ve boyutları PDFBox dokümantasyonu üzerinden özelleştirilebilir.

# Bağımlılıklar

-Java 11 veya üzeri

-Apache PDFBox

-Maven (bağımlılık yönetimi için)

