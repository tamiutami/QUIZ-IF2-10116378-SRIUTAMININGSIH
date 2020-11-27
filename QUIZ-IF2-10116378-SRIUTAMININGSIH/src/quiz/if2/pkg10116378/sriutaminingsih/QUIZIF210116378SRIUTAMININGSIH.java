/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10116378.sriutaminingsih;

import java.util.Scanner;

/**
 *
 * Nama  : SRI UTAMI NINGSIH
 *Kelas : PBO-2
 *NIM   : 10116378
 *Deskripsi : Quiz
 */
public class QUIZIF210116378SRIUTAMININGSIH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer cus = new Customer();
        ServicePrice serP = new ServicePrice();
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);

        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        cus.setName(scn1.nextLine());
        System.out.print("Customer Email : ");
        cus.setEmail(scn2.nextLine());
        serP.displayService();
        serP.setPriceService(serP.getPrice(scn3.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        cus.setMember(serP.checkMemberStatus(scn4.next()));

        System.out.println("\n#*************************************#");
        System.out.println("#**********CUSTOMER INVOICE***********#");
        System.out.println("Data Transaction : "+cus.currentTime());
        System.out.println("Service Price : Rp."+serP.getPriceService());
        System.out.println("Discount : Rp."+serP.getSale(cus.isMember(),serP.getPriceService()));
        System.out.println("Total Pay : Rp."+serP.getTotalPay(serP.getPriceService(),
                serP.getSale(cus.isMember(),serP.getPriceService())));
    }
    
}
