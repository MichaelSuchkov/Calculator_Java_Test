import java.util.Scanner;
public class Calc_test {
    public static  void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Введите формулу:");
        String formula = s.nextLine();

        int i = 0, b = 0, a, z = 0, m, g = 0, f1, f2, rez = 0, prov = 0;
        String c = "", sz = "";

        // Работа с первым числом

        a = Character.getNumericValue(formula.charAt(0));
        while (a != -1){
            c += formula.charAt(i);
            i += 1 ;
            a = Character.getNumericValue(formula.charAt(i));
        }
        if ("I".equals(c) || "II".equals(c) || "III".equals(c) || "IV".equals(c) || "V".equals(c) || "VI".equals(c) || "VII".equals(c) || "VIII".equals(c) || "IX".equals(c) || "X".equals(c)) {
            f1 = 1;
            switch (c) {
                case "I":
                    c = "1";
                    break;
                case "II":
                    c = "2";
                    break;
                case "III":
                    c = "3";
                    break;
                case "IV":
                    c = "4";
                    break;
                case "V":
                    c = "5";
                    break;
                case "VI":
                    c = "6";
                    break;
                case "VII":
                    c = "7";
                    break;
                case "VIII":
                    c = "8";
                    break;
                case "IX":
                    c = "9";
                    break;
                case "X":
                    c = "10";
                    break;
            }
        } else {
            f1 = 0;
        }

        b = Integer.parseInt(c);


        // Работа со знаком

        for (m = 0 ; m <= formula.length()-1; m++){
            if (formula.charAt(m) == '+' || formula.charAt(m) == '-' || formula.charAt(m) == '*' || formula.charAt(m) == '/' ) {
                g = formula.charAt(m);
                prov += 1;
            }
        }

        // Проверка условия

        if (prov == 0) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
            System.exit(0);
        }

        if (prov >= 2) {
            System.out.println("throws Exception т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit(0);
        }

        // Работа со вторым числом

        for (m = i+1; m <= formula.length()-1; m++){
            sz += formula.charAt(m);
        }
        if ("I".equals(sz) || "II".equals(sz) || "III".equals(sz) || "IV".equals(sz) || "V".equals(sz) || "VI".equals(sz) || "VII".equals(sz) || "VIII".equals(sz) || "IX".equals(sz) || "X".equals(sz)){
            f2 = 1;
            switch (sz){
                case "I":
                    sz = "1";
                    break;
                case "II":
                    sz = "2";
                    break;
                case "III":
                    sz = "3";
                    break;
                case "IV":
                    sz = "4";
                    break;
                case "V":
                    sz = "5";
                    break;
                case "VI":
                    sz = "6";
                    break;
                case "VII":
                    sz = "7";
                    break;
                case "VIII":
                    sz = "8";
                    break;
                case "IX":
                    sz = "9";
                    break;
                case "X":
                    sz = "10";
                    break;
            }
        }
        else {
            f2 = 0;
        }
        z = Integer.parseInt(sz);

        if (f1 != f2){
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            System.exit(0);
        }


        // Вычисление выражения

        switch (g){
            case '+':
                rez = b+z;
                break;
            case '-':
                rez = b-z;
                break;
            case '/':
                rez = b/z;
                break;
            case '*':
                rez = b*z;
                break;
        }

        if (f1 == 1 && f2 == 1 && rez <= 0) {
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            System.exit(0);
        }

        if (f1 == 1 && f2 == 1 && rez<90 ) {
            String[] Rome = new String[] {"I","II","III","IV","V","VI","VII","VIII", "IX", "X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII", "XIX", "XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII", "XXIX", "XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII", "XXXIX", "XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII", "XLIX", "L", "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII", "LIX", "LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII", "LXIX", "LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII", "LXXIX", "LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII", "LXXXIX", "XC", "I","II","III","IV","V","VI","VII","VIII", "IX", "X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII", "XIX", "XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII", "XXIX", "XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII", "XXXIX", "XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII", "XLIX", "L", "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII", "LIX", "LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII", "LXIX", "LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII", "LXXIX", "LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            System.out.println(Rome[rez-1]);
        }
        else if (f1 == 1 && f2 == 1 && 90 <= rez ){
            String[] Rome2 = new String[]{  "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            System.out.println(Rome2[rez-90]);
        }
        else{
            System.out.println(rez);
        }
    }
}
