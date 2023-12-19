public class Recursive {


    public static void main(String[] args){
        Recursive obj=new Recursive();
        System.out.println(obj.sum(40,18));
    }
    public static int sum(int a ,int b) {
            int k;
            if (a < b) {
                k=sum(a, b-1)+1;
                System.out.println(k);
                return k;
            }
            else if  (a>b){
                k=sum(a, b+1)-1;
                System.out.println(k);
                return k;
            }
            else {
                System.out.println(b);
                return b;
            }

    }
}
