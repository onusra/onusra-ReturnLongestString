import java.lang.*;
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public static void main(String[] args){

    }

    
    public String longest(String[] arr){
        int len = 0;
        String first = null;
        for(int i = 0; i < arr.length; i++){
            String n = arr[i];
            if(n.length() > len){
                len = arr[i].length();
                first = arr[i];
            }
        }
        return first;
    }
}
