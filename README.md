# road-map-for-junior

Bu loyihani yosh dasturchilarga qo'llanma bo'lishi uchun yozishni niyat qildim. 
Ko'pincha yosh dasturchilarda real proyektlarda ishlashda yoki proyektni ichiga kirib ketishda muammolar bo'ladi. Shunday muammolarni oldini olish uchun 
men kichik proyektlar ketma-ketligidan iborat kichik harita yaratmoqchiman. Bunda har bir proyektda kichik ko'nikma va bilimlar olish imkonini beruvchi 
topshiriqlar bo'ladi va bu kelajakda haqiqiy proyektlarda as qotadi.

Kimlarga mo'ljallangan: Java Spring Backend kursni tugatib junor bo'lib ishga kirmoqchi bo'lgan yosh dasturchilarga.

Lohihalarni ham dokument (TZ) ham kod sifatida berib borishga harakat qilaman.


## Students Project
Studentlar tablitsasi uchun CRUD yasash.  
Pagelar:
1. List page - talabalar ro'yhati, table ko'rinishida. Bu pageda paginition ishlashi kerak. Filter bo'lishi kerak, ro'yhatni excelga export qilishi kerak, Add paga o'tishi, tabledagi rowda esa edit yoki delete imkoniyati bo'lsin(edit alohida pageda).  
2. Add/Edit page - yangi talaba qo'shish yoki ma'lumotlarini o'zgartirish. Avatar kiritish imkoniyati ham bo'lsin. Faylni yuklash diskka bo'lishi kerak yani DBga rasmni yuklash shart emas.
3. View page -  talaba ma'lumotlari. PDF - Rezume yaratish imkoniyati bo'lishi kerak.
Tablitsalar: 
1. Students - id, first_name, last_name, middle_name, description, study_stat_date, study_end_date, university_id, field_of_study, gender, birthdate, created_at
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

Tablitsalar. 
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

