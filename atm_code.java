import java.util.Scanner;


public class atm_code {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        int right = 3 ;
        int balance = 1500;
        int select;

        do{
            System.out.println("Username : ");
            username= input.nextLine();

            System.out.println("Password : ");
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
                        System.out.println("Yeni toplam para:"+balance);
                        break;

                    case 2 :
                        System.out.print("Cekmek istediginiz para miktarini giriniz :");
                        int cmiktar= input.nextInt();
                        if(cmiktar>balance){
                            System.out.println("Bakiyeniz yetersiz!!!");
                        }else {
                            balance -= cmiktar;
                            System.out.println("Kalan bakiye:"+balance);
                        }
                        break;

                    case 3:
                        System.out.println("Bakiyeniz : "+balance);
                        break;

                    case 4 :
                        System.out.println("Gorusmek uzere : ");
                        break;

                    default:
                        System.out.println("Tekrar deneyiniz...");


                }



            }else{
                right--;

                System.out.println("Hatali kullanici adi veya sifre...");
                if(right==0){
                    System.out.println("Hesabiniz bloke olmustur...");
                }else {
                    System.out.println("Kalan hak : "+right);
                }

            }

        }while(right>0);

    }

}