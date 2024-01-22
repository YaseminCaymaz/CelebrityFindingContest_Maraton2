package com.yasemin.utility;


import com.yasemin.entity.Celebrity;
import com.yasemin.entity.CelebrityInfo;

import com.yasemin.repository.CelebrityRepository;
import com.yasemin.utility.enums.Gender;

import java.util.List;

public class CreateRepoImpl {

    private CelebrityRepository celebrityRepository;
    public CreateRepoImpl() {
        this.celebrityRepository = new CelebrityRepository();
    }
      public void createCelebrity(){
        Celebrity celebrity1=Celebrity.builder()
            .name("Tarkan")
            .gender(Gender.MALE)
            .nationalitie("Turk")
            .job("Sarkıcı")
            .image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.instagram.com%2Ftarkan%2F&psig=AOvVaw2LYw133qtSqVramiSKzWGr&ust=1706006788152000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCJiM39bo8IMDFQAAAAAdAAAAABAE")
            .build();
        CelebrityInfo info1=CelebrityInfo.builder()
                .info("Almanya dogumludur ve soyadı 'Tevetogludur.'")
                .celebrity(celebrity1)
                .build();
        CelebrityInfo info2=CelebrityInfo.builder()
                .info("Kuzu kuzu, Dudu, Olurum sana gibi sarkılarıyla tanınır")
                .celebrity(celebrity1)
                .build();
        celebrity1.setCelebrityInfo(List.of(info1,info2));
        celebrityRepository.save(celebrity1);

        celebrity1=Celebrity.builder()
            .name("Türkan Soray")
            .gender(Gender.FEMALE)
            .nationalitie("Turk")
            .job("Aktris")
            .image("https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Turkan_Soray_1310395.jpg/220px-Turkan_Soray_1310395.jpg")
            .build();
        info1=CelebrityInfo.builder()
                .info("Fatma Girik, Hülya Koçyiğit ve Filiz Akın ile birlikte Yeşilçam'ın dört yapraklı yoncası olarak tasvir edilir.'")
                .celebrity(celebrity1)
                .build();
        info2=CelebrityInfo.builder()
                .info("Türk sinemasında \"Sultan\" lakabıyla anılır")
                .celebrity(celebrity1)
                .build();
        CelebrityInfo info3=CelebrityInfo.builder()
                .info("Oynadıgı filmlerden en cok bilineni 'Selvi Boylum Al YAzmalım' dir")
                .celebrity(celebrity1)
                .build();
        celebrity1.setCelebrityInfo(List.of(info1,info2,info3));
        celebrityRepository.save(celebrity1);

        celebrity1=Celebrity.builder()
                .name("Morgan Freeman")
                .gender(Gender.MALE)
                .nationalitie("Amerikalı")
                .job("Aktor")
                .image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Morgan_Freeman_at_The_Pentagon_on_2_August_2023_-_230802-D-PM193-3363_%28cropped%29.jpg/220px-Morgan_Freeman_at_The_Pentagon_on_2_August_2023_-_230802-D-PM193-3363_%28cropped%29.jpg")
                .build();
        info1=CelebrityInfo.builder()
                .info("2005 yılında Milyonluk Bebek filmiyle En İyi Yardımcı Erkek Oyuncu Akademi Ödülü'nü kazand'")
                .celebrity(celebrity1)
                .build();
        info2=CelebrityInfo.builder()
                .info("Street Smart, Bayan Daisy'nin Soförü, Esaretin Bedeli ve Yenilmez filmleriyle Akademi adaylığı elde etti.")
                .celebrity(celebrity1)
                .build();
        celebrity1.setCelebrityInfo(List.of(info1,info2));
        celebrityRepository.save(celebrity1);

        celebrity1=Celebrity.builder()
                .name("Sezen Aksu")
                .gender(Gender.FEMALE)
                .nationalitie("Turk")
                .job("Sarkıcı")
                .image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Sezen_Aksu_konseri_2012.jpg/220px-Sezen_Aksu_konseri_2012.jpg")
                .build();
        info1=CelebrityInfo.builder()
                .info("Sarkıcılığının yanı sıra yazıp bestelediği şarkıları başkalarına vermesi sayesinde söz yazarı ve besteci kimliğiyle de sık sık ön plana çıktı.'")
                .celebrity(celebrity1)
                .build();
        info2=CelebrityInfo.builder()
                .info("Türk şarkıcı-şarkı yazarı ve yapımcıdır.")
                .celebrity(celebrity1)
                .build();
        info3=CelebrityInfo.builder()
                .info("Lakabı Minik Sercedir")
                .celebrity(celebrity1)
                .build();
        celebrity1.setCelebrityInfo(List.of(info1,info2,info3));
        celebrityRepository.save(celebrity1);

        celebrity1=Celebrity.builder()
                .name("Okan Bayülgen")
                .gender(Gender.MALE)
                .nationalitie("Turk")
                .job("Sunucu")
                .image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Okan_Bay%C3%BClgen_in_2019.png/220px-Okan_Bay%C3%BClgen_in_2019.png")
                .build();
        info1=CelebrityInfo.builder()
                .info(", Türk şovmen, oyuncu, tiyatro ve klip yönetmeni, yapımcı, seslendirme sanatçısı ve fotoğrafçı.'")
                .celebrity(celebrity1)
                .build();
        info2=CelebrityInfo.builder()
                .info("Programları; Zaga, Medya Kralı, Muhabbet Kralı vb.")
                .celebrity(celebrity1)
                .build();
        info3=CelebrityInfo.builder()
                .info("Oynadıgı filmler; Hemşo, Agır Roman vb.")
                .celebrity(celebrity1)
                .build();
        celebrity1.setCelebrityInfo(List.of(info1,info2,info3));
        celebrityRepository.save(celebrity1);

    }
}
