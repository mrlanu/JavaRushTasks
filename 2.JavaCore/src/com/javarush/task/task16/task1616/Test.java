public class Test
{
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        String s3 = s1.substring(4);

        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
        System.out.println(s2);
        System.out.println(s3);
    }
}