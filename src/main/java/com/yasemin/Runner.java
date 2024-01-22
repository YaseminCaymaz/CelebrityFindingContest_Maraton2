package com.yasemin;

import com.yasemin.controller.CelebrityController;
import com.yasemin.controller.ContestController;
import com.yasemin.controller.ContestantController;
import com.yasemin.entity.Celebrity;
import com.yasemin.entity.Contest;
import com.yasemin.entity.Contestant;
import com.yasemin.utility.CreateRepoImpl;
import com.yasemin.utility.enums.Gender;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


public class Runner {
   public static void main(String[] args) {
//          CreateRepoImpl createRepo = new CreateRepoImpl();
//           createRepo.createCelebrity();
       startCompetition();
    }
    public static CelebrityController celebrityController;
    public static ContestController contestController;
    public static ContestantController contesttantController;

    public static void startCompetition() {
        Contestant contestant = kayit();
        Scanner sc = new Scanner(System.in);
        AtomicInteger sayac = new AtomicInteger(0);
        Contest contest = Contest.builder()
                .contestant(contestant)
                .startTime(System.currentTimeMillis())
                .build();
        List<Celebrity> celebrityList = celebrityController.findAll();
        celebrityList.stream().forEach(x -> {
            System.out.println("*************************************************************************************************");
            System.out.println("Gender..:" + x.getGender() + " Nationalitie..:" + x.getNationalitie() + " Job..:" + x.getJob());
            x.getCelebrityInfo().stream().forEach(y -> {
                System.out.println("IPUCU....:"+y.getInfo());
            });
            System.out.println("Enter your prediction");
            String prediction = sc.nextLine();
            if (x.getName().equalsIgnoreCase(prediction)) {
                System.out.println("Correct");
                sayac.getAndIncrement();
            } else {
                System.out.println("Wrong");
            }
        });
        contest.setEndTime(System.currentTimeMillis());
        contest.setScore(sayac.get());
        System.out.println("Your score is " + sayac.get());
        contesttantController.save(contestant);
        contestController.save(contest);

    }
    public static Contestant kayit(){
        System.out.println("Lutfen adinizi giriniz");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Lutfen cinsiyetinizi giriniz(Male/Famale)...:");
        String gender = sc.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int age = Integer.parseInt(sc.nextLine());
        Contestant contestant = Contestant.builder()
                .name(name)
        .gender(Gender.valueOf(gender.toUpperCase()))
        .age(age)
        .build();
        return contestant;
    }
}
