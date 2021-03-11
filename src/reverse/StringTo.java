package reverse;

public class StringTo {
    public static double stringToDouble(String str){
        return Double.valueOf(str);
    }

    public static void main(String[] args){
        System.out.println(stringToDouble("123"));
    }
}
