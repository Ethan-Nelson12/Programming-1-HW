package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,T)
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
    public String CharReplace(String s, int x, char z) {
       
        
        String ending;
        ending = s.substring(0, x) + z + s.substring(x + 1);
        System.out.println(ending);
        
        return ending;
    }
   
}