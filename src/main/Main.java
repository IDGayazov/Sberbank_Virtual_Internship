package main;

import model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Задача_ВС_Java_Сбер.csv"));
        List<City> cities = new ArrayList<>();

        while(sc.hasNext()){
            City c = new City();
            String[] str = sc.nextLine().split(";");
            String foundation;
            if(str.length < 6){
                foundation = "Нет данных";
            }
            else{
                foundation = str[5];
            }
            c.setName(str[1]);
            c.setRegion(str[2]);
            c.setDistrict(str[3]);
            c.setPopulation(Long.parseLong(str[4]));
            c.setFoundation(foundation);
            cities.add(c);
        }
        sc.close();
        for(City c: cities){
            System.out.println(c.getName() + " " + c.getRegion() + " " + c.getDistrict() + " " +
                    c.getPopulation() + " " + c.getFoundation());
        }
    }
}
