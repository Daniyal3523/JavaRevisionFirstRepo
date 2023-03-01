package classWork;

import homeworkOne.Sample;

import javax.naming.PartialResultException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RevisionTwoMain {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("This is the revision - Feb 26 23");
     //Primitive Data Types
        //Integer
        int number = 50;
        System.out.println(number);
        System.out.println(number - 10);
        number = 20;
        System.out.println(number);
        int number2 = 40;
        System.out.println("Sum = " + (number + number2));
        System.out.println("Values = " + number + "," + number2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Character
        char ch1 = '5';
        System.out.println(ch1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Non Primitive Data Types
        //String
        String name1 = "Daniyal";
        System.out.println(name1);
        int int1 = 20;
        String aaa = Integer.toString(int1);
        System.out.println(int1);
        System.out.println(aaa);
        int int2 = 15;
        String bbb = Integer.toString(int2);
        System.out.println(bbb);
        //Float
        Float float1 = 2.34F;
        Float float2 = 3.45F;
        int int3 = 125;
        float f1 = int3;
        System.out.println(f1);
        System.out.println((f1/float1)+float2);
        System.out.println(float1/float2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        char ch2 = '5';
        int int4 = 15;
        String name2 = Integer.toString(int4);
        String name3 = Character.toString(ch2);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(20 +","+ name3);

        int int5 = 50;
        if (int5 > 51) {
            System.out.println("Yes");
        }else if (int5 == 50) {
            System.out.println("Mid");
        } else {
            System.out.println("No");
        }
        //True and False
        int int6 = 100;
        int int7 = 200;
        System.out.println(int6 < int7);

        String car1 = "BMW"; //String -> One character
        String[] car2 = {"BMW", "Mercedes", "Ford", "Toyota", "Honda"}; //Sting Array"[]" -> Multiple character
        //Array Declaration -> Declaring a String is an Array
        String array[] = new String[5];
        array[0] = "Alpha";
        array[4] = "Beta";
        System.out.println(array[0]);

        int ar[] = new int[4];
        array[1] = "Danny";
        System.out.println(array[1]);
        //Ampersand %
        int Percentage = 58 % 8;
        System.out.println(Percentage);
        //++
        int int8 = 1;
        int8 += 2;
        int8 += 3;
        int8 ++;
        int8 ++;
        int8 ++; //add 1
        int8 --; //sub 1
        System.out.println(int8);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int aa = 1;
        int bb = 2;
        int cc = 3;
        int dd = aa + bb;
        System.out.println(aa);
        System.out.println(dd);
        System.out.println(cc);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        //Expected values/results
        String name4 = "HP";
        if (name4 == "HP"){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        if (name4 != "HP"){
        System.out.println("Test Passed");}
        else {
            System.out.println("Test Failed");
        }
        int int9 = 80;
        if (int9 != 70){
            System.out.println("Not Equal");
        }else {
            System.out.println("Its Equal");
        }
        String name5 = "Muhammad";
        if (45 == 45) {
            System.out.println(name5);
        }else {
            System.out.println("NO");
        }
        //Lenght -> Count length
        String name6 = " Muhammad Daniyal ";
        System.out.println(name6.length());
        //Trim -> remove space
        name6 = name6.trim();
        System.out.println(name6.length());
        //Logical Operators ( && -> AND)
        if (45>20 && 45<67 && 45<78) {
            System.out.println("All True");
        } else {
            System.out.println("Not True");}
        //For logical operators for pipe we need at lease one correct condition ( || -> OR)
        if (45<20 || 45>67 || 45>78) {
            System.out.println("Some or all passed");
        } else if (45>20 || 45>67 || 45>78) {
            System.out.println("Some conditions passed");
        } else {
            System.out.println("Hello World");
        }
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        //Min & Max
        int [] math = {2, 4, 6, 8};
        System.out.println(Arrays.stream(math).min());
        System.out.println(Arrays.stream(math).max());

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        int week = 3;
        switch (week){
            case 1:
                System.out.println("Chest and Tricep");
                break;
            case 2:
                System.out.println("Back and Biceps");
                break;
            case 3:
                System.out.println("Legs and Shoulders");
        }
        //Loops
        //Reverse
        int loop1 = 8;
        while (loop1 > 0){
            System.out.println(loop1);
            loop1--;
        }
        System.out.println("-------------------");
        //Forward
        int loop2 = 0;
        while (loop2 < 5){
            System.out.println(loop2);
            loop2++;
        }
        //Count characters
        System.out.println("-------------------");
        String MyName = "Daniyal";
        System.out.println(MyName.length());
        //Reverse Character -> Dynamic Loop
        String MyName2 = "layinaD";
        for (int revName = MyName2.length()-1; revName >= 0; revName--){
            System.out.print(MyName2.charAt(revName));
        }
        System.out.println("");
        String MyName3 = "RAC";
        for (int sample = MyName3.length()-1; sample >= 0; sample--) {
            System.out.print(MyName3.charAt(sample));
        }
        System.out.println("");
        //Static Loop
        //forward (<) less than
        for (int kkk=0; kkk<5; kkk++){
            System.out.println(kkk);
        }
        System.out.println("");
        System.out.println("---------------");
        //forward (>=)
        for (int kk=0; kk<=5; kk++){
            System.out.println(kk);
        }
        System.out.println("");
        System.out.println("---------------");
        //reverse (>) greater than
        for (int k=5; k>0; k--){
            System.out.println(k);
        }
        System.out.println("");
        System.out.println("---------------");

        String[] Vehicles = {"BMW", "Mercedes", "Ford", "Toyota", "Honda"};
        ArrayList<String> Brands = new ArrayList<String>();
        for (int X=0; X<5; X++){
            Brands.add(Vehicles[X]);
        }
        {
            System.out.println(Vehicles[2]);
        }
        if (Vehicles[2].equals("Ford")){
            System.out.println("it is correct");
        }else {
            System.out.println("Wrong");
        }
        //
        if (Vehicles[2].equals("BMW")){
            System.out.println("it is correct");
        }else {
            System.out.println("Wrong");
        }
        //decreasing number by 1
        int dec1 = 2;
        for (int dec2 = 1; dec2 < 5; dec2++){
            for (int dec3=4; dec3>=dec2; dec3--){
                System.out.print(dec3+"\t");
            }
        }
        System.out.println("");
        for (int inc1 = 0; inc1 < 5; inc1++){
            for (int inc2 = 1; inc2 <= 5; inc2++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<String> ary1 = new ArrayList<>();
        ary1.add("England");
        ary1.add("Germany");
        ary1.add("Pakistan");
        System.out.println(ary1);

        for (int ary0 = 0; ary0 < ary1.size(); ary0++){
            System.out.println(ary1.get(ary0));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Inheritance
        //Pull Sample class into this class
        Sample smpl = new Sample();

        String inht1 = smpl.wal + " is the best place to shop";
        int inht2 = smpl.multiplication + 10;
        System.out.println(inht1);
        System.out.println(inht2);

        //System.out.println(wal);  -> How to extend???????????????

        //Array Lists & HashMap
          //Array List
        ArrayList<String> List1 = new ArrayList<>();
        List1.add("One way of doing array list with single word"); {
            System.out.println(List1);
        }
         //Hash Map
        ArrayList<String> List2 = new ArrayList<>(Arrays.asList("One2", "Two2", "Three2", "Four2", "Five2"));
        System.out.println(List2);
        ArrayList<String> List3 = new ArrayList<>(Arrays.asList("One3", "Two3", "Three3", "Four3", "Five3"));
        ArrayList<String> List4 = new ArrayList<>(Arrays.asList("One4", "Two4", "Three4", "Four4", "Five4"));
        ArrayList<String> List5 = new ArrayList<>(Arrays.asList("One5", "Two5", "Three5", "Four5", "Five5"));
        System.out.println(List4);
        //Hash Map (Keys & Values)
        HashMap<String, ArrayList<String>> capitalCities = new HashMap<>();
        capitalCities.put("Pakistan", List2);
        capitalCities.put("India", List3);
        capitalCities.put("Japan", List4);

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Pakistan"));
        System.out.println(capitalCities.get("India").get(3));

        for (String F: capitalCities.keySet()){
            System.out.println(F+": "+ capitalCities.get(F)); //What is KeySet for???????
        }

        for (int K=0; K<List1.size(); K++){
            if (capitalCities.get("Pakistan").get(K).equals(List1.get(K))){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }






















    }
}
