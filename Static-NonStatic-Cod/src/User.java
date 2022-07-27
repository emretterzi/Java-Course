public class User {

    public String name;
    public static String counter="bitti";


    public User(String name){


        this.name=name;

    }

    

    static {
       for (int i=0;i<4;i++){

           System.out.println("ben "+(i+1)+".static kod bloğuyum");

       }

    }

    static {
        System.out.println("ben ayrı  bir static kod bloğuyum");


    }

}
