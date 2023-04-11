public class stringsMethodes {
    public static void main(String[] args) {
        String str = "Dishan Dey";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim()); // use to trim spaces before or after a string
        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 6));    // end index is excluded
        System.out.println(str.replace('D', 'I'));
        System.out.println(str.replace("Dishan", "Ishan"));
        System.out.println(str.startsWith("Dis"));
        System.out.println(str.endsWith("Deb"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("D"));
        System.out.println(str.indexOf("D",6));
        System.out.println(str.lastIndexOf("D"));
        System.out.println(str.lastIndexOf("D",6));
        System.out.println(str.equals("Dishan Dey"));
        System.out.println(str.equalsIgnoreCase("dishan dey"));
    }
}
