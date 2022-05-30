import java.util.Scanner;


public class atm_code {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        int right = 3 ;
        int balance = 1500;
        int select;

        while(right>0){
            System.out.print("Username : ");
            username= input.nextLine();

            System.out.print("Password : ");
            password= input.nextLine();

            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Hosgeldiniz !!!");

                System.out.println("Lutfen yapmak isteediginiz islemi seciniz :"+"1) Para yatırma\n"+"2)Para Cekme\n"+"3)Bakiye Sorgula\n"+"4)Cikis Yap.");
                select= input.nextInt();

                switch(select){

                    case 1 :
                        System.out.print("Yatirilacak para miktarini giriniz : ");
                        int miktar = input.nextInt();
                        balance+=miktar;
                        System.out.print("Yeni toplam para:"+balance);
                        break;

                    case 2 :


                }



            }









        }



    }

}