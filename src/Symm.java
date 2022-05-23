public class Symm {
    public static void main(String[] args) {
        for(long i=11;i<1000;i++){
            if(symm(i)&&symm(i*i)&&symm(i*i*i)){
                System.out.println(i);
            }
        }
    }

    public static boolean symm(long l) {
        long i, m;
        i = l;
        m = 0;
        while (i != 0) {
            m = m * 10 + i % 10;
            i = i / 10;
        }
        return (m == l);
    }
}
