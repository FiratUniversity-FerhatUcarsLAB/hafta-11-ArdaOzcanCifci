1. Başlangıç (main metodu başlar)
  Kod: System.out.print("No, I ");
  Çıktı: No, I


2. zoop() çağrısı (main içinden)
  Kod: zoop();
  Çıktı: (Değişmedi)


3. İlk baffle() çağrısı (zoop içinden)
  Kod: baffle(); (Şimdi baffle çalışmaya başlar.)
  Çıktı: No, I wug (baffle içindeki System.out.print("wug"); çalıştı.)


4. ping() çağrısı (baffle içinden)
  Kod: ping();
  Çıktı: No, I wug. (ping içindeki System.out.println("."); çalıştı ve yeni satıra geçti.)


5. ping() ve İlk baffle() Tamamlanır (Pop)
  ping() metodu biter, çerçevesi yığından atılır.
  baffle() metodu biter, çerçevesi yığından atılır. Kontrol zoop'a geri döner.
  Çıktı: (Değişmedi)


6. zoop() Devam EdiyorKod
   System.out.print("You wugga ");
   Çıktı: No, I wug.
          You wugga 


7. İkinci baffle() çağrısı (zoop içinden)
  Kod: baffle(); (Şimdi ikinci kez baffle çalışmaya başlar.)
  Çıktı: No, I wug.
         You wugga wug (baffle içindeki System.out.print("wug"); çalıştı.)


8. İkinci ping() çağrısı (baffle içinden)
  Kod: ping();
  Çıktı: No, I wug.
         You wugga wug. (ping içindeki System.out.println("."); çalıştı ve yeni satıra geçti.)


9. İkinci ping(), İkinci baffle() ve zoop() Tamamlanır (Pop)
  ping() metodu biter, çerçevesi yığından atılır.
  baffle() metodu biter, çerçevesi yığından atılır.
  zoop() metodu biter, çerçevesi yığından atılır. Kontrol main'e geri döner.
  Çıktı: (Değişmedi)


10. main Devam EdiyorKod
    System.out.print("I ");
    Çıktı: No, I wug.
           You wugga wug.
           I


11. Üçüncü baffle() çağrısı (main içinden)
  Kod: baffle(); (Şimdi üçüncü kez baffle çalışmaya başlar.)
  Çıktı: No, I wug.
         You wugga wug.
         I wug (baffle içindeki System.out.print("wug"); çalıştı.)


12. Üçüncü ping() çağrısı (baffle içinden)
  Kod: ping();
  Çıktı: No, I wug.
         You wugga wug.
         I wug. (ping içindeki System.out.println("."); çalıştı ve yeni satıra geçti.)


13. Son Tamamlanmalar ve Program Biter
  ping() metodu biter, çerçevesi yığından atılır.
  baffle() metodu biter, çerçevesi yığından atılır.
  main() metodu biter, çerçevesi yığından atılır. Yığın boştur.
  Çıktı: (Değişmedi)


     
















