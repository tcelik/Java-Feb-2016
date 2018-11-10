/*----------------------------------------------------------------------------------------------------------------------
    Bir java dosyasında birden fazla sınıf bildirimi yapılabilir.
    Burada 3 tane sınıf bildirimi yapılmıştır (App, Test, Sample, sınıf bildirimin genel biçimini hatırlayın.)

    Buradaki ayrıntı şu:
        Bunlardan sadece biri [erişim belirleyici] olarak public olabilir. Örneğin App public ise diğerleri public olamaz
        [erişim belirleyici] olarak public bildirilmişşe, bu sınıfın ismi ile dosyanın ismi aynı olmalı.

        Aksi durumda sınıflardan hiçbiri public erişim belirleyici ile bildirilmemişse. Dosyanın ismi sınıf isimlerinden
        bambaşka olabilir.

----------------------------------------------------------------------------------------------------------------------*/
package csd;


class App {
    public static void main(String[] args)
    {
        System.out.println("Merhaba Java");
    }
}

class Test {
    //...
}

class Sample {
    //...
}