import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {

    ArrayList<String> blomsterNavne = new ArrayList<>();
    int total;
    public FlowerShop(String x, String y, String z, String e,
                      String n, String q, String r, String o,
                      String p, String ti){
        blomsterNavne.add(x);
        blomsterNavne.add(y);
        blomsterNavne.add(z);
        blomsterNavne.add(e);
        blomsterNavne.add(n);
        blomsterNavne.add(q);
        blomsterNavne.add(r);
        blomsterNavne.add(o);
        blomsterNavne.add(p);
        blomsterNavne.add(ti);
    }
    public void displayFlowersAndPrice(){
        int count = 1;
        for(String s:blomsterNavne){
            System.out.println(count+". "+s);
            count++;
        }
        System.out.println("Prisliste:\n" +
                "Blomst 1-4: 20 kr\n" +
                "Blomst 5-7: 30 kr\n" +
                "Blomst 8-10: 50 kr\n" +
                "Buket: 50 kr");

    }
    public void runDialog(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvor mange blomster kunne du tænke dig? ");
        int flowerCount = scan.nextInt();
        scan.nextLine();
        System.out.println("Her er listen med alle blomsterne og deres priser!");
        displayFlowersAndPrice();
        for(int i = 0; i < flowerCount;i++) {
            System.out.println("Skriv tallet på den blomst du kunne tænke dig: ");
            int flowerChoice = scan.nextInt();
            scan.nextLine();
            switch (flowerChoice) {
                case 1, 2, 3, 4:
                    total += 20;
                    break;
                case 5, 6, 7:
                    total += 30;
                    break;
                case 8, 9, 10:
                    total += 50;
                    break;
                default:
                    System.out.println("ugyldigt");
            }
        }
        System.out.println("Kunne du tænke dig at få det bundet i en buket? Y/N");
        String choice = scan.nextLine();
        if(choice.equalsIgnoreCase("y")){
            total = 50;
            System.out.println("Total pris på købet: " + total);
        } else if (choice.equalsIgnoreCase("n")){
            System.out.println("Total pris på købet: " + total);
        }
    }
}
