
## Karşılaşılan hatalar ve çözümleri
 
* Test class'ı içerisinde tanımlanan page objesi(driver) npe fırlattı. Bunun nedeni aldığı "driver"
parametresinin BaseTest class'ından daha setUp() methodu içerisinde oluşturulmadığından dolayı idi.
  Çözüm olarak setUp() methodu içerisinde page(driver) setleyerek bu çözülmüş oldu.
  
* input tagine sahip elemenler için getText() methodunu kullanamıyoruz. Bunun yerine getAttribute("value")
methodunu kullanabiliriz. Burada "value" ile bir attribute yoksa bile doğru şekilde text'i alabiliyoruz.