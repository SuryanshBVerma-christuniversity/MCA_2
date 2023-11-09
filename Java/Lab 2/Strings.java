public class Strings{


    public static void main(String[] args){
        String S = "“We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";
        
        
        System.out.println(S.charAt(4));

        String s1 = S.substring(0,32);
        String s2 = S.substring(0, 64);
        System.out.println(s1.compareTo(s2));

        System.out.println(s1.concat(s2));

        System.out.println(S.contains("thriving"));

        System.out.println(S.endsWith("villages"));

        System.out.println(s1.equals(s2));

        String str = "Hello";
        System.out.println(str.equalsIgnoreCase("HeLlO"));

        String f = String.format("This is line number %d, I am %s", 25, "Nemo");
        System.out.println(f);

        System.out.println(s1.getBytes());

        char dst[] = new char[20];
        s1.getChars(2,20, dst, 0);
        System.out.println(dst);

        System.out.println(s1.indexOf("while"));

        System.out.println(s1.intern());

        String empyt = "";
        System.out.println(empyt.isEmpty());

        String n = s1.join("-", "This", "is", "join");
        System.out.println(n);

        System.out.println(s1.lastIndexOf("workers"));

        System.out.println(S.length());

        System.out.println(s1.replace(" ", "*"));

        n = "Thi s a te ststring";
        System.out.println(n.replaceAll(" ", ""));

        System.out.println(n.split(" "));

        System.out.println(n.startsWith("T"));
        
        System.out.println(n.substring(3));

        System.out.println(n.toCharArray());

        String Caps = "HELLO WORLD";
        System.out.println(Caps.toLowerCase());

        System.out.println(Caps.toUpperCase());

        System.out.println(s2.trim());

        System.out.println(n.valueOf(2.33));
    }
}