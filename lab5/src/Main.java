// ex1 Necomplicat
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner (System.in);
        String Keylogger = Keyboard.nextLine();
        if (8 < Keylogger.length()) {
            int SpaceCount = 0;
            for(int i = 0; i<Keylogger.length(); i++){
                if(' '  == Keylogger.charAt(i)){
                    SpaceCount++;
                }
            }
            if(SpaceCount == 0){
                if (Keylogger.charAt(0) <= 90 && 65 <= Keylogger.charAt(0)){
                    int SpecChar = 0;
                    for(int i = 0; i<Keylogger.length(); i++){
                        if('#'  == Keylogger.charAt(i) || '$' == Keylogger.charAt(i) || '%' == Keylogger.charAt(i)){
                            SpecChar++;
                        }
                    }
                    if (SpecChar >= 1){
                        System.out.println("Password successfully created");
                    }
                    else{
                        System.out.println("Password must contain at least a special character (#$%)");
                }
                    }
                else{
                    System.out.println("Password must begin with an uppercase letter");
                }
            }

            else{
                System.out.println("Password must not contain any spaces");
            }
        }
        else{
            System.out.println("Password must be at least 8 characters long");
        }

        // Ex 2 String uri
        String Words = Keyboard.nextLine();
        String[] Masina = new String[100];
        int pos = 0;
        int ext = 0;
      for (int i = 0; i< Words.length(); i++){
          if(' ' == Words.charAt(i) || Words.charAt(i) == '\0' ){
              Masina[ext] = Words.substring(pos, i);
              ext++;
              pos = i;
          }
      }
        int min = 32000;
        int max = 0;
        for(int i = 0; i < ext; i++){
            if(Masina[i].length() < min){
                min = Masina[i].length();
            }
            if(Masina[i].length() > max){
                max = Masina[i].length();
            }
        }
        for(int i = 0; i < ext; i++){
            if(Masina[i].length() == min){
                System.out.println("cel mai mic cuvant este " + Masina[i]);
            }
            if(Masina[i].length() == max){
                System.out.println("cel mai mare cuvant este " + Masina[i]);
            }
        }

    }

}





