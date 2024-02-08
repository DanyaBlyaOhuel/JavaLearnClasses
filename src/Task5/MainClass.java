package Task5;

public class MainClass {

    public static void main(String[] args) {

        //1
        System.out.println(WelcomeCity(new String[]{"John", "Doe", "Jr", "Pidor"}, "Novi Sad", "Serbia"));

        //2
        System.out.println(DoubleChar("123 123"));

        //4
        Task4.Point test = new Task4.Point(1d, 2d);
        Task4.Point test2 = new Task4.Point(5d, 5d);
        Task4.Point test3 = new Task4.Point(3d, 6d);
        Vector testVec = new Vector(test, test3);

        System.out.println(test2.x);
        System.out.println(test2.y);
        System.out.println(testVec.startFrom(test2).pos1);


    }

    static String WelcomeCity(String[] name, String city, String state) {
        StringBuilder Result = new StringBuilder("Hello,");

        for (int i = 0; i < name.length; i++) {
            Result.append(" ").append(name[i]);
        }
        // add City and State
        Result.append("! Welcome to ").append(city).append(", ").append(state).append("!");

        return Result.toString();
    }

    static String DoubleChar(String str) {
        StringBuilder Result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Result.append(str.charAt(i)).append(str.charAt(i));
        }
        return Result.toString();
    }
}
