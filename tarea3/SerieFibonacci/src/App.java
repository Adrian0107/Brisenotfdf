public class App {
    public static void main(String[] args) throws Exception {
        public static void main(String[] args) throws Exception {
            int num1=0;
            int num2=1;
            int temp;
            int limite=100;
            System.out.println(num1);
            System.out.println(num2);
     
            while(num2+num1<=limite){
                temp=num1;
                num1=num2;
                num2=temp+num1;
                System.out.println(num2);
     
            }
         }
     }
