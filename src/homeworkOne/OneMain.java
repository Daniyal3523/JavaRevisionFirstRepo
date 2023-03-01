package homeworkOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static homeworkOne.Sample.multiplication;
import static homeworkOne.Sample.wal;

public class OneMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("danny");
        System.out.println("Daniyal");
        System.out.println("Bilal");

        System.out.println("Hamid");
        System.out.println("Muhammad");
        System.out.println(1);

// above all is SOUT - why not in sequence?

        // Data type -> give name = assign the value
        // Only one Variable name can be used within class
        // Concatenation

        //Primitive data types:
        // int = Integer (whole number, example 5, 6, 8)
        // float = Floating (numbers with decimals, example 5.99)
        // char = Character ('A','B','C'-'Z')
        // boolean = Boolean (Use to represent single True/False value)
        // String = String ("Sequence of character", "objects")

        int num = 34;
        System.out.println(num);
        int num1 = 45;
        int num2 = 55;
        System.out.println(num + num2);
        System.out.println("sum is equal to:" + (num + num2));
        System.out.println(num + num1 + num2);
        System.out.println(num * num1);

        {
            if (1 < 2)
                System.out.println("yes");
            else
                System.out.println("no");
            if (10 > 5)
                System.out.println("Haan");
            else
                System.out.println("Nahi");
        }

        //Name reverse
        String Dani = "";


        String nn = "ynnaD";

        for (int k = nn.length() - 1; k >= 0; k--) {
            Dani = Dani + nn.charAt(k);

            System.out.println(Dani);
        }

        String mm = "RAC";
        for (int k = mm.length() - 1; k >= 0; k--) {
            System.out.print(mm.charAt(k));
        }
        System.out.println();
        // Why 6 is not going to next line???
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(x + y + z);

        // Non Primitive Data Type - use to store complex objects
        String nam = "Daniyal";
        System.out.println(nam);

        int aa = 45;
        String aaa = Integer.toString(aa);
        System.out.println(45 + aaa);
//Double
        Double n = 2.34;
        Double bb = 3.45;
        System.out.println(n / bb);
//Float
        Float c = 2.34F;
        Float dd = 3.45F;
        System.out.println(c / dd);

        int i = 125;
        float f = i;
        System.out.println(f);
//Combining Multiple Data Types
        char ss = '4';
        int aaa1 = 56;
        String ff = Integer.toString(aaa1);
        String gg = Character.toString(ss);
        System.out.println(ff);
        System.out.println(ss);

        String abc = Character.toString(ss);
        System.out.println(33 + ss); //Why value is showing 85 not 37???

        int a = 50;
        if (a > 51)
            System.out.println("Agree");
        else
            System.out.println("Disagree");

        {
            int b = 100;
            if (b > 99)
                System.out.println("Greater");
            else if (b == 90)
                System.out.println("Equal");
            else
                System.out.println("Less");
        }

        {
            int Num1 = 10;
            int Num2 = 10;
            if (Num1 > Num2)
                System.out.println("Yes");
            else if (Num1 == Num2)
                System.out.println("Equal");
            else
                System.out.println("No");
        }

// Non Primitive Data Types
        // Array -> [], Class, String and Interface

        String car = "BMW";
        String[] cars = {"Volve", "Ford", "Mazda", "Toyota", "Honda"};

        String array[] = new String[5];
        array[0] = "Alpha";
        array[3] = "Brave";

        System.out.println(array[0]);
        System.out.println(array[3]);

        //Array Declaration
        int ar[] = new int[4];

        int gh = 56;
        System.out.println(gh * 2);

//Amperstand %

        int st = 57 % 8;
        System.out.println(st);

        int tt = 48 % 8;
        System.out.println(tt);

        int stt = 47 % 8;
        System.out.println(stt);

// Intergar + 1
        int uj = 1;
        System.out.println(uj);
// Ing = Ing + 1
        uj++; //These ++ will add 1 in the original value
        uj++;
        ++uj;
        uj++;
        ++uj;
        uj--;
        System.out.println("uj=" + uj);

        int pp = 2;
        pp += 2;  //this += will add the value what is in front
        pp += 2;
        pp++;
        System.out.println("pp=" + pp);

        int tr = 1;
        int abd = 3;
        int hhh = 4;
        int trr = abd + hhh;
        System.out.println(trr);

        String w = "Hi";
        String ww = "My Name Is";
        String www = w + " " + ww; //Spacing
        String wwww = "Daniyal";
        String xx = www + " " + wwww;
        System.out.println(xx);

/*Expected Value/results
        String namee = "Equal to";
            if (namee != "Equal to") ;
            System.out.println("Pass");
            else
        System.out.println("Fail"); */ //Question???? Why else is not working???????????

       /* int 1k = 78;
        if (1k != 78) {
            System.out.println("Passs");
        } else {
            System.out.println("Failll");
        }                                     */ /////Not working??????????????????

        System.out.println("New Work");
        if (45 < 44)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");

        String ai = "muhammad";
        if (1 > 0)
            System.out.println("Nice");
        else
            System.out.println("Not Nice");

        //We use .equal to compare string
        if ("hello".equals("Hello".toLowerCase()))
            System.out.println("passed");
        else
            System.out.println("failed");
        String uy = " Hello Everyone ";
        System.out.println(uy.length());
        System.out.println(uy);
//Remove space Before and After  String statement "***Hello Everyone***"..
        uy = uy.trim();
        System.out.println(uy.length());
        System.out.println(uy);
//Logical Operators -> we use && if to indicate multiple statements are true - See example below
        if (45 > 20 && 45 < 67 && 45 < 78)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

//Logical operators for pipe we need to have at least one condition true -> "||" for different data
        if (45 > 20 || 45 > 67 || 45 > 78)
            System.out.println("some or all conditions passed");
        else if (45 < 20 || 45 > 67 || 45 > 78) {
            System.out.println("Not all conditions passed");
        } else
            System.out.println("hello world");

        if (1 > 2)
            System.out.println("Japan");
        else
            System.out.println("UK");

        if (1 > 2)
            System.out.println("Japan");
        else if (3 > 2) {
            System.out.println("Pak");
        } else
            System.out.println("UK");

//Switch -> Cases
        int day = 4;
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

        //Loops -> If the statement is TRUE this will print infinite
        /*String ino = "I";
        do {
            System.out.println(ino);
        }
        while (8 < 3);

        int ino = "0";
        do {
            System.out.println(ino);
        }
        while (8 < 3); */

//Two ways of adding 1 -> XYZ = XYZ = Num // 1 -> XYZ++
        for (int ufo = 0; ufo <= 10; ufo = ufo + 1)
            System.out.println(ufo);

        for (int ufo = 0; ufo <= 5; ufo++)
            System.out.println("Answer = " + ufo);

// To get the number of characters in a word
        String lll = "Usman";
        System.out.println(lll.length());

// To reverse a Word/Statement (Dynamic forLoop)
        String Word = "namsU";
        for (int g = Word.length() - 1; g >= 0; g--)
            System.out.print(Word.charAt(g));

        System.out.println();

        String kl = "ynnaD";
        for (int tl = kl.length() - 1; tl >= 0; tl--)
            System.out.print(kl.charAt(tl));

        System.out.println();

//Static forLoop
        for (int k = 0; k < 5; k++)
            System.out.println(k);

//Arrays size is fixed or static
//ArrayList -> Size changes according to situation
        //1 example
        String[] carss = {"Volve", "BMW", "Ford", "Tesla", "Cadilac"};
        ArrayList<String> carrss = new ArrayList<>();
        for (int k = 0; k < 5; k++) {
            carrss.add(carss[k]);
        }
        System.out.println(carrss.get(4));

        if (carrss.get(3).equals("Ford"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
      /*  2 example
        String[] Cell = {"Apple", "Samsung", "HTC", "Nokia", "Tmobile"};
        ArrayList<String> Phone = new ArrayList<>();
        for (int c = 0) */

//Nested forLoop

        for (int o = 1; o < 5; o++) {
            for (int m = 4; m >= o; m--)
                System.out.print("*" + "\t");
        }
        System.out.println();

        for (int o = 1; o < 5; o++) {
            for (int m = 1; m <= o; m++)
                System.out.print("*" + "\t");
        }
        System.out.println();

        int weeks = 4;
        int days = 4;
        //outer loop -> weeks
        for (int ii = 1; ii <= weeks; ii++) {
            System.out.println("Week: " + ii);
            //inner loop -> days
            for (int da = 1; da <= days; da++) {
                System.out.println("  Days: " + da);

            }
        }
//Pyramid
        int row = 5;
        //outer loop
        for (int q = 1; q <= row; q++) {
            //inner loop
            for (int e = 1; e <= q; e++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
//HashMap
//Create a HashMap object called capitalCities
        String[] cars1 = {"Volve", "BMW", "Ford", "Tesla", "Cadilac"};
        String[] cars2 = {"Volve", "BMW", "Ford", "Tesla", "Cadilac"};
        String[] cars3 = {"Volve", "BMW", "Ford", "Tesla", "Cadilac"};
        String[] cars4 = {"Volve", "BMW", "Ford", "Tesla", "Cadilac"};

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //Add Keys and Values (Country , City)
        capitalCities.put("England ", " X");
        capitalCities.put("Germany ", " Y");
        capitalCities.put("Norway ", " Z");
        capitalCities.put("USA ", " A");

        System.out.println(capitalCities);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (String k : capitalCities.keySet()) {
            System.out.println(k + ": " + capitalCities.get(k));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<String> ary = new ArrayList<>();
        ary.add("England");
        ary.add("Germany");
        ary.add("Pakistan");

        for (int im = 0; im < ary.size(); im++) {
            System.out.println(ary.get(im));
        }
        for (String country : ary) {
            System.out.println(country);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//Inheritance
        Sample sam = new Sample();
        String aaaa = wal + " is cheap";
        int mull = multiplication + 10;
        System.out.println(aaaa);
        System.out.println(mull);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        String a2 = wal + " is the best place to shop";
        int m2 = multiplication + 20;
        System.out.println(a2);
        System.out.println(m2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(wal);
        System.out.println(multiplication);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//Array List
        ArrayList<String> cars01 = new ArrayList<>(Arrays.asList("Volvo1", "BMW1", "Ford1", "Tesla1", "Cadillac1"));
        ArrayList<String> cars02 = new ArrayList(Arrays.asList("Volvo2", "BMW2", "Ford2", "Tesla2", "Cadillac2"));
        ArrayList<String> cars03 = new ArrayList<>(Arrays.asList("Volvo3", "BMW3", "Ford3", "Tesla3", "Cadillac3"));
        ArrayList<String> cars04 = new ArrayList<>(Arrays.asList("Volvo4", "BMW4", "Ford4", "Tesla4", "Cadillac4"));
        ArrayList<String> cars05 = new ArrayList<>(Arrays.asList("Volvo1", "BMW1", "Ford1", "Tesla1", "Cadillac1"));
        System.out.println(cars01);

        ArrayList<String> Motor = new ArrayList<>();
        String motor = "BMW1000rr";
        System.out.println(motor);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<String> Gas = new ArrayList<>(Arrays.asList("Petrol", "Diesel", "CNG", "Propane"));
        System.out.println(Gas);
        System.out.println(Gas.get(2));
        if ("CNG".equals("CNG".toUpperCase()))
            System.out.println("Passed");
        else
            System.out.println("Failed");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//Hash Map (Key and Values)
        HashMap<String, ArrayList<String>> capitalCity = new HashMap<>();
        //Add keys and values (Country, City)
        capitalCity.put("England", cars01);
        capitalCity.put("Germany", cars02);
        capitalCity.put("Norway", cars03);
        capitalCity.put("USA", cars04);
        System.out.println(capitalCity);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(capitalCity.get("England"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(capitalCity.get("USA").get(2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(cars01);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //String A = "Coding Love I";
        //for (int HW=0; HW <= A.length(); HW--) {
            //System.out.print(A.charAt(HW));

        /*git init
        git add .
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/Dannytech77/JavaRevisionFirstRepo.git
        git push -u origin main*/


/*Encapsulations Types:
Private -> only works within  class
Protected -> only works within a package
Public -> works in entire project
Default -> class & package
 */





        /*Assignment - Nested For Loop - Like the one below
        // * * * *
        // * * *
        // * *
        // *

        int sf = 1;
        for (int aii = 1; aii < 5; aii++ ) {
            for (int b = 1; b <= aii; b++) {
                System.out.print(sf);
            }
        } */


    }

}
