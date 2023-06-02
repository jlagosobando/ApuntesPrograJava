
 /**
 * com.example.dev Paquete de desarrollo de la solución
 */
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8

public class Main_Pass {
    public static String Gen_Pass(){
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String min = may.toLowerCase();
        String nums = "0123456789";
        String alphanums = may + min + nums;

        int randomLength = 6 + (int) (Math.random() * 4);
        StringBuilder pass = new StringBuilder(randomLength);
        pass.append(may.charAt((int)(Math.random() * may.length())));
        pass.append(nums.charAt((int)(Math.random() * nums.length())));


        for(int i=2;i<randomLength;i++)
        {
            pass.append(alphanums.charAt((int) (Math.random() * alphanums.length())));
        }
        return pass.toString();
    }
}
