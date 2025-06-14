import java.util.*;

public class Solution {
    public int numUniqueEmails(String[] emails) {


        Set<String> trimmed = new HashSet<>();

        for(String email : emails){

            String[] split = email.split("@");

            String local = split[0];
            String domain = split[1];

            local = local.split("\\+")[0];
            local = local.replace(".", "");

            //System.out.println(local);



            trimmed.add(local+"@"+domain);

        }




        return trimmed.size();
    }
}