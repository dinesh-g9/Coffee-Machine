public class Main {

    public static void main(String[] args) {
        int count = 0;
        Secret[] secret = Secret.values();
        for (Secret s:
             secret) {
            if(s.name().startsWith("STAR"))
                count++;
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/