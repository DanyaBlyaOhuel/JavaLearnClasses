public class Task5p1 {


    public static void main(String[] args) {

        //1
        System.out.println(WelcomeCity(new String[]{"John", "Doe", "Jr", "Pidor"}, "Novi Sad", "Serbia"));

        //2
        System.out.println(DoubleChar("123 123"));

    }

    static String WelcomeCity (String[] name, String city, String state){
        StringBuilder Result = new StringBuilder("Hello,");

        for (int i = 0; i < name.length; i++) {
            Result.append(" ").append(name[i]);
        }
        // add City and State
        Result.append("! Welcome to ").append(city).append(", ").append(state).append("!");

        return Result.toString();
    }

    static String DoubleChar (String str) {
        StringBuilder Result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Result.append(str.charAt(i)).append(str.charAt(i));
        }
        return Result.toString();
    }
}
