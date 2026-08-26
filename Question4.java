//Find the smallest of three numbers.
class Question4{
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int c=6;
        if(a<=b && a<=c){
            System.out.println("num is smaller:"+a);
        }
        else if(b<=a && b<=c){
            System.out.println("numis smaller:"+b);
        }else{
            System.out.println("num is smaller:+c");
        }
    }
}