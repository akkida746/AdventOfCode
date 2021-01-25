package interview;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\deepa\\Desktop\\input.txt");

            Map<Character,Integer> map = new HashMap<>();
            int result = 0;
            int count = 0;
            String line;
            try(BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
                while((line = br.readLine()) != null){

                    if(line.length() == 0){
                        if(count == 1){
                            ++result;
                        }

                        else{
                            for(char key: map.keySet()){
                                if(map.get(key) == count){
                                    ++result;
                                }
                            }
                        }

                        count = 0;
                        map.clear();
                    }
                    else{
                        ++count;
                        for(int i=0;i<line.length();i++){
                            if(map.containsKey(line.charAt(i))){
                                int value = map.get(line.charAt(i));
                                map.put(line.charAt(i), value + 1);
                            }
                            else{
                                map.put(line.charAt(i),1);
                            }
                        }
                    }
                }

                System.out.println("Remaining");
                if(count == 1){
                    result += 1;
                }
                else{
                    for(char key: map.keySet()){
                        if(map.get(key) == count){
                            ++result;
                        }
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Result =" + result);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
