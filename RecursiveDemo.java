public class RecursiveDemo {

    public static void print(int n){
        if(n >1){
            System.out.println(n);
            print((n%2!=0)? (3*n)+1:n/2);
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
