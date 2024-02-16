package repository;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException {

        //tests
//        Person person = Person.loadFrom(new File("filename.txt"));
//        File file = new File("src/dsad/addasd/ffd.txt");
//        DirectoryPersonRepository dpr = new DirectoryPersonRepository(file);
//
//        dpr.save(person);
        //Person person2 = dpr.load(123456);
        //System.out.println(person2.lastName);

        System.out.println(isPalindrom("Аргентинаманитнегра"));

        System.out.println(countSubString("авотхуйвавахуйловаайухававхуйо", "хуй"));

    }

    public static boolean isPalindrom(String str) {

        char[] chArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            if (chArray[i] != chArray[str.length() - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static int countSubString(String x, String y) {
        int result = 0;
        if (x.length() < y.length()) {
            return result;
        }

        // ленивый метод
//        do {
//         x = x.substring(x.indexOf(y) + y.length());
//
//         result += 1;
//        }
//        while (x.indexOf(y) > 0);

        // OldSchool
        char[] charX = x.toLowerCase().toCharArray();
        char[] charY = y.toLowerCase().toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (charX[i] == charY[0]) {
                for (int j = 0; j < y.length(); j++) {
                    if (charX[i + j] != charY[j]) {
                        break;
                    }

                    if (j == y.length() - 1) {
                        result += 1;
                    }
                }

            }

        }

        return result;
    }

}
