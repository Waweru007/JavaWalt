package com.wesh;

import java.util.ArrayList;

public class TestAcc {
    public static void main(String[] args) {
        Account acc1= new Account("Mark", "AC001", 60000);
        Account acc2= new Account("Jim", "AC002", 40000);
        Account acc3= new Account("Tosh", "AC003", 70000, "Student");
        Account acc4= new Account("Marcus", "AC004", 80000);
        Account acc5= new Account("Pesh", "AC005", 90000, "Current");

        System.out.println(acc3.getAccNo());
        System.out.println(acc4.getBalance());
        acc4.setBalance(78000);
        System.out.println(acc4.getBalance());
        acc4.withdraw(-10000);
        System.out.println(acc4.getBalance());

        acc4.deposit(2000);
        System.out.println(acc4.getBalance());
        //Creating an Array

        Account[] accounts={acc1,acc2,acc3,acc4,acc5};
        int[] ages={8,4,5,7,8,9,16};
        String[] names={"Jamo", "Miky", "Keny", "Timo", "Pato"};

        for (Account k:accounts ) {
            System.out.println(k.getBalance() + "  " + k.getName());

        }

        for ( String name:names){
            System.out.println(name);

        }

        //Arraylistcan be Ammended
        ArrayList<Account> accounts2=new ArrayList<>();
        accounts2.add(acc1);
        accounts2.add(acc2);
        accounts2.add(acc3);
        accounts2.add(acc4);
        accounts2.add(acc5);

        System.out.println(accounts2.size());
        accounts2.remove(2);
        System.out.println(accounts2.size());

        //accounts2.clear();
        System.out.println(accounts2.size());

        //Queues, list, linked list, stacks

        System.out.println("-----------------------------------------");

        Account big= Functions.checkBigger(acc1,acc2);

        System.out.println(big.getName() +"  "+ big.getBalance());

        double ans= Functions.devide(100, 50);
        System.out.println(ans);




    }

}
