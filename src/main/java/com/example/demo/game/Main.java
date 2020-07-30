package com.example.demo.game;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

   public static void main(String[] args) throws IOException {


       String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
       String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
       String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};

       SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);


       FileOutputStream outputStream = new FileOutputStream("D:\\FileOutPut\\save.ser");
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


       objectOutputStream.writeObject(savedGame);

       
       objectOutputStream.close();
   }
}