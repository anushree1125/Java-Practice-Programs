import java.util.Scanner;

class SwitchVowel{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char input = sc.next().charAt(0);
        //input = Character.toLowerCase(input);
        switch(input){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            System.out.println("Character "+input+" Vowel");
            break;
            default:{
                System.out.println("Consonant");
            }
        }
    }
        
    }