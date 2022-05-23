import javax.swing.JOptionPane;
public class Repeation {
    public static void main(String[] args) {
        int i,j;
        int s=100;
        String stringi=JOptionPane.showInputDialog("输入一个十进制整数");
        int decimal=Integer.parseInt(stringi);
        String binary;
        System.out.println("十进制数是 "+decimal+" 的二进制数是"+DecimalToBinart(decimal));
    }
    static String DecimalToBinart(int decimal){
        String binary="";
        while(decimal>0){
            binary=decimal%2+binary;
            decimal/=2;
        }
        return binary;
    }

}
