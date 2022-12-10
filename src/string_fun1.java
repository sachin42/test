public class string_fun1 {
    public static void main(String[] args) {
//        charAt(index); Example
        String name ="Electrocus Solutions";
        char ch = name.charAt(9);// returns the character value at the location
        System.out.println(ch);
        System.out.println("---------------------------");

//        toLowerCase(); || toLowerCase(Locale.root);
        String name1 = name.toLowerCase();// converts all characters of string to lower case
        System.out.println(name1);
        System.out.println("---------------------------");

//        toUpperCase(); || toUpperCase(Locale.root
        String name2 = name.toUpperCase();//  converts all characters of string to upper case
        System.out.println(name2);
        System.out.println("---------------------------");

//         trim();
        System.out.println(name.length());
        String name3 = name.trim();// trims the all whitespaces before first character
        System.out.println(name3.length());
        System.out.println(name3);
        System.out.println("---------------------------");

//        replace(); || replaceall();
        String name4 = "mama is a good person";
        System.out.println(name4.replace('m','n'));// replace a character with given character
        System.out.println(name4.replaceAll("is","is not"));// replace a word with given word
        System.out.println("---------------------------");

//        join();
        String date = String.join("/","8","12","2022");// joins strings with given string
        String time = String.join(":","04","22","33");

        String name5 = String.join("::",date,time);
        System.out.println(name5);
        System.out.println("---------------------------");

    }
}
