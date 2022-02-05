import java.util.Scanner;
class Test {
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    String name=sc.nextLine();
    // its use for checking every character from here
    char ch1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char ch2[]=name.toCharArray();  // Storing string into character in array 
    
    for(int i=0;i<ch1.length;i++){
      int count=0;
      for( int j=0;j<ch2.length;j++){
        
        char select =ch1[i];
        char check = ch2[j];
        // checking character 
        if(select==check){
          count++;
        }
        
      }
      if(count>=1){
        System.out.println(ch1[i] + " is repeating  "+ count + " times");
      }
      
    }
  }
}