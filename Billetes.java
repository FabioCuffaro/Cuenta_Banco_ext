package CuentaBanco;


import java.util.Scanner;

public class Billetes {

    public static void main(String[] args) {

        /**
         *Partiendo de la base principal, que existe el módulo que te devuelve el resto de una división
         *Y que las divisiones enteras, no devuelven decimales...

         *Podemos crear un cajero que te devuelva numero de billetes de cada clase en base al dinero que
         *entregues
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("\n ==== Cajero ====");
        System.out.print("\n Introduce número de € retirar:  ");
        int money = sc.nextInt();

        if(money % 5 != 0){
            System.out.println("\n No se podrán entregar: "+ money % 5+"€. Ya que no entregamos monedas");
            money = money - (money % 5);
        }

        /**
         * Una vez que ya hemos quitado el resto, vamos llamando al método para ver cuántos billetes sacar cada vez
         * y le restamos esos billetes al dinero original.
         */

        System.out.println("\n === Número de billetes ===\n");

        int step1 = moneyBill(money,50);
        money = money - step1 * 50;
        int step2 = moneyBill(money, 20);
        money = money - step2 * 20;
        int step3 = moneyBill(money, 10);
        money = money - step3 * 10;
        moneyBill(money, 5);

        sc.close();
    }


    /**
     * Método que devuelve el número de billetes de cada clase
     */

    private static int moneyBill(int money, int denomination){

        int amount = money / denomination;

        System.out.printf(" Billetes de %d € : %d\n",denomination, amount);

        return amount;

    }

}

