
## Uzbek language

# Road-Map-Backend


## for-junior

Bu loyihani yosh dasturchilarga qo'llanma bo'lishi uchun yozishni niyat qildim. 
Ko'pincha yosh dasturchilarda real proyektlarda ishlashda yoki proyektni ichiga kirib ketishda muammolar bo'ladi. Shunday muammolarni oldini olish uchun 
biz haqiqiy loyihalarda uchraydigan qismlarni kichik proyektlar qilib, proyektlar ketma-ketligidan iborat kichik harita yaratmoqchimiz. Bunda har bir proyektda kichik ko'nikma va bilimlar olish imkonini beruvchi 
topshiriqlar bo'ladi va bu kelajakda haqiqiy proyektlarda as qotadi.

Kimlarga mo'ljallangan: Java Spring Backend kursni tugatib junor bo'lib ishga kirmoqchi bo'lgan yosh dasturchilarga.

Lohihalarni ham dokument (TZ) ham kod ko'rinishida berib borishga harakat qilamiz.


## Students Project
Studentlar tablitsasi uchun CRUD yasash.  
Pagelar:
1. List page - talabalar ro'yhati, table ko'rinishida. Bu pageda paginition ishlashi kerak. Filter bo'lishi kerak, ro'yhatni excelga export qilishi kerak, Add paga o'tishi, tabledagi rowda esa edit yoki delete imkoniyati bo'lsin(edit alohida pageda).  
2. Add/Edit page - yangi talaba qo'shish yoki ma'lumotlarini o'zgartirish. Avatar kiritish imkoniyati ham bo'lsin. Faylni yuklash diskka bo'lishi kerak yani DBga rasmni yuklash shart emas.
3. View page -  talaba ma'lumotlari. PDF - Rezume yaratish imkoniyati bo'lishi kerak.
Tablitsalar: 
1. Students - id, first_name, last_name, middle_name, description, study_stat_date, study_end_date, field_of_study_id, gender, birthdate, created_at
2. Field_of_studies - id, name, university_id
3. Universities - id, name


Maqsad: Image fayl bilan ishlashni o'rganish. PDF va Excelga export qilish (Apache POI)


## Book Shop
Kitob sotuv do'konini avtomatlashtirish uchun mo'ljallangan loyiha.
Crudlar: Books, Authors, Users, Price
1. User uchun Auth(login parolli)
2. Author view pageda kitob qo'shish imkoniyati bo'lishi kerak
3. Book view pageda User tomonidan comment yozishi
4. Book view pageda User tomonidan sotib olinishi

Tablitsalar:
1. Authors - id, name, ...
2. Books - id, author_id, name, ... 
3. Users - id, login, password, name, ...
4. Comments - id, book_id, user_id, content, created_at 
5. Prices - id, book_id, price,  ... 
6. User_purchases - id, book_id, user_id, price, created_at

Maqsad: `Spring Security`, `JWT`, `DB` - table relations

## Book Shop Manager Panel
Managerlar uchun sotuv jarayoni hisobotlarini ko'rib turish imkoniyati kerak. Bu loyiha  Book shop loyihasini davomi hisoblanadi.
Kerakli hisobotlar:
a) Userlar bo'yicha
1. Ohirgi haftada ro'yhatdan o'tgan Userlar
2. Ro'yhadan o'rgan userlar sonini davrlarda(masalan oylarga bo'lib) hisoboti
3. Eng aktiv userlar - bunda ko'p kitob sotib olgan, ko'p summada kitob sotib olgan, ko'p comment yozgan shartlari bo'yicha chiqarish kerak.
   1. Vali(Ismi)    2(kitob soni)  89,000(summa)  21(comment soni)
   2. Ali           5              53,000         45
   3. ...
   
b) Kitoblar bo'yicha:
1. Eng ko'p sotilgan kitoblarni ko'rsatish
2. Eng mashxur kitoblar - sotilishi, commentlar soni, view count bo'yicha chiqarish kk

c) Yozunchilar bo'yicha. Bu o'zlaringiz ijod qilib ko'rishingiz mumkin.

Maqsad:
1. Qiyin SQLlarni yozib ko'rish. 
2. `DAO` va `Repository` bilan ishlash, 
3. `@Query` anatatsiyasini yutuqlari va kamchiligi.
4. Springda proyekt ichida `native sql`larni yozib ko'rish va uni natijasida kelib chiqadigan muammolarni o'rganish


## Swagger 
Avtoparkni tasavvur qilamiz. Loyida haydovchilar va moshinalar uchun CRUDlar bor
Yangi kelgan haydochularni Exceldan ham import qilib bazaga qo'shish imkoniyatini qo'shish kerak.
1. Excel fayl shabloni oldindan kelishib olingan bo'ladi deb hisoblaymiz. 
2. Frontend qismini yozishi kerak bo'lgan odamga bu lohida APIlari dokumentatsiyasini yaratib berish kerak. Bazi API methodlarni user role bn yopish kerak.
3. 2ta avtopark bor va ular uchun DB connection, settingslar boshqacha bo'lishi kerak

Maqsad: Excel parse. Swagger. Profiles

# For Middle

## Prometheus monitoring
Book shop lohihasidan foydalanishimiz mumkin. Qo'shimcha faqat har bir methodni monitorng qilish kerak bo'ladi
Bunda prometheusni API source ichida ishlatishimiz kerak bo'ladi. Testlsh uchun jMeter bilan har xil sonli senariy asosida zaproslar yuboriladi.

Maqsad: Prometheus, Apache JMeter


## Video blog.
Bitta blogger bor deylik. U o'zini videolarini bitta serverga qo'yib boradi. Yani post uchun CRUD bo'ladi.
Postni ichidagi videoni UIga streaming qilib berish kerak bo'ladi. 

Maqsad: Stream


## Parkovka yoki online navbat 
Parkovkaning band/bo'sh joylarini bilib turish uchun online dastur. 4 qavatli avtomobillarga mo'ljallangan turargoh mavjud va 
uning 4 ta kirish joyi bor deb tasavvur qilaylik. UIda birnechta oyna(client)dan moshina kirgani yoki chiqib ketgani haqida habar keladi.
Bitta asosiy monitor client bo'ladi va hozirgi holatni ko'rsatib turadi:
 - qancha bo'sh joy bor
 - qaysi qavatda qancha bo'sh joy bor


Maqsad: Socketlar bilan ishlashni o'rganish. Multithreading


## ElasticSearch Demo
Elasticsearch demo proyekt uchun talablar quyidagilar:
 - Eng oddiy insert/read by id/update by id/delete by id bo'lishi kerak;
 - Ko'p itemlarni 1ta insert qilish;
 - Filter, har xil field va inner field ham qatnashgan query yozish kerak;


## Upworkdan 1 ta namuman
Bu proyektni upworkda ko'rib qoldim. Tarjimasi manosini yo'qotsa kerak deb o'zini qoldirdim.
```
I need to build a small application without database using Java 17. 
Detailed description can be provided at later stage. You are free to use web frameworks like Spring. 
The application is similar to  a URL shortner. I am a developer myself, but I'm looking for elegant 
code with proper unit test, documentation, comments with simple but maintainable code. 
The code needs to meet coding standards and use latest Java constructs and meet SOLID principles.
The task can be done in less than a day. But you could take a week to complete with test cases, 
documentation and API documentation.
```