package interview;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\deepa\\Desktop\\input.txt");

            int result = 0;
            String line;
            Set<Character> set = new HashSet<>();
            try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
                while((line = br.readLine()) != null){

                    if(line.equalsIgnoreCase("ac")){
                        System.out.println();
                    }

                    if(line.length() == 0){
                        result += set.size();
                        set.clear();
                    }
                    else{
                        for(int i=0;i<line.length();i++){
                            set.add(line.charAt(i));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(result + set.size());

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
-------------------------------------
Output:
6911
