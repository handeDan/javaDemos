public class User {
    public String name;
    public static int counter = 0;

    static {
        System.out.println("this is a static scope");
    }
    //static yazmasaydık çağırılan User object üretildiğinde console'da yazılacaktı.
    //static yazınca ne kadar User instance oluştursak da 1 kere çağırır.

    static {
        System.out.println("static scope ran.");

        int random = (int) (Math.random()*10);

        System.out.println("Random number : " + random);
        System.out.println("Default counter : " + counter);
        counter = random;
    }

    public User(String name) {
        this.name = name;
        counter ++;

        System.out.println("Updated counter : " + counter);
    }


}
