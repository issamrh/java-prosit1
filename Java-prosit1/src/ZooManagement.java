import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

   public ZooManagement(int nbrCages,String zooName){
        this.nbrCages=nbrCages;
        this.zooName=zooName;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter zooname");
        String zooname=sc.nextLine();
        System.out.println("Enter nbCages");
        int nbCages=sc.nextInt();

        ZooManagement z=new ZooManagement(nbCages,zooname);
        System.out.printf(z.zooName+" comporte "+z.nbrCages+" cages");
    }
}
