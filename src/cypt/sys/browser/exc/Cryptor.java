package cypt.sys.browser.exc;

import javax.swing.JOptionPane;

public class Cryptor {

    public String Cifrar(String comando, String chave) {

        return null;
    }

    public static String CovertChave(String chave) {
        String ChaveRetorno = "";
        if (chave.length() < 9 && chave.length() > 0) {
//            int t = chave.length();

//            System.out.println(t);
            chave = chave.toUpperCase().trim();
            for (int t = 1; t < (chave.length() + 1); t++) {
//                System.out.println(chave.substring((t-1), (t))+" - "+t);
                String Xchave = chave.substring((t - 1), t);
                switch (Xchave) {
                    case "A":
                        ChaveRetorno = ChaveRetorno + "8";
                        break;
                    case "B":
                        ChaveRetorno = ChaveRetorno + "5";
                        break;
                    case "C":
                        ChaveRetorno = ChaveRetorno + "7";
                        break;
                    case "D":
                        ChaveRetorno = ChaveRetorno + "2";
                        break;
                    case "E":
                        ChaveRetorno = ChaveRetorno + "5";
                        break;
                    case "F":
                        ChaveRetorno = ChaveRetorno + "1";
                        break;
                    case "G":
                        ChaveRetorno = ChaveRetorno + "4";
                        break;
                    case "H":
                        ChaveRetorno = ChaveRetorno + "9";
                        break;
                    case "I":
                        ChaveRetorno = ChaveRetorno + "4";
                        break;
                    case "J":
                        ChaveRetorno = ChaveRetorno + "8";
                        break;
                    case "K":
                        ChaveRetorno = ChaveRetorno + "3";
                        break;
                    case "L":
                        ChaveRetorno = ChaveRetorno + "3";
                        break;
                    case "M":
                        ChaveRetorno = ChaveRetorno + "2";
                        break;
                    case "N":
                        ChaveRetorno = ChaveRetorno + "6";
                        break;
                    case "O":
                        ChaveRetorno = ChaveRetorno + "8";
                        break;
                    case "P":
                        ChaveRetorno = ChaveRetorno + "5";
                        break;
                    case "Q":
                        ChaveRetorno = ChaveRetorno + "1";
                        break;
                    case "R":
                        ChaveRetorno = ChaveRetorno + "4";
                        break;
                    case "S":
                        ChaveRetorno = ChaveRetorno + "6";
                        break;
                    case "T":
                        ChaveRetorno = ChaveRetorno + "8";
                        break;
                    case "U":
                        ChaveRetorno = ChaveRetorno + "4";
                        break;
                    case "V":
                        ChaveRetorno = ChaveRetorno + "3";
                        break;
                    case "W":
                        ChaveRetorno = ChaveRetorno + "7";
                        break;
                    case "X":
                        ChaveRetorno = ChaveRetorno + "3";
                        break;
                    case "Y":
                        ChaveRetorno = ChaveRetorno + "7";
                        break;
                    case "Z":
                        ChaveRetorno = ChaveRetorno + "2";
                        break;
                    case "0":
                        ChaveRetorno = ChaveRetorno + "8";
                        break;
                    case "1":
                        ChaveRetorno = ChaveRetorno + "5";
                        break;
                    case "2":
                        ChaveRetorno = ChaveRetorno + "6";
                        break;
                    case "3":
                        ChaveRetorno = ChaveRetorno + "4";
                        break;
                    case "4":
                        ChaveRetorno = ChaveRetorno + "2";
                        break;
                    case "5":
                        ChaveRetorno = ChaveRetorno + "7";
                        break;
                    case "6":
                        ChaveRetorno = ChaveRetorno + "9";
                        break;
                    case "7":
                        ChaveRetorno = ChaveRetorno + "5";
                        break;
                    case "8":
                        ChaveRetorno = ChaveRetorno + "3";
                        break;
                    case "9":
                        ChaveRetorno = ChaveRetorno + "1";
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Key!", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
//        System.out.println(ChaveRetorno);
        return ChaveRetorno;
    }

    public static char CifrarT(String mens, int chave, boolean peso) {
//        Scanner t = new Scanner(System.in);
//        Scanner v = new Scanner(System.in);
        if (peso) {
            chave = 26 - chave;
        }
        char ascii;
        char x, y;
//        System.out.println("Digite a mensagem: ");
//        String mens = t.nextLine();
//        System.out.println("Digite a CHAVE: ");//chave será um número que deslocará a mensagem pela sua quantidade (msg 'a' e chave = 3, cifra= 'c')
//        int chave = v.nextInt();
        while (chave >= 26) {//chave tem que ter o tamanho do alfabeto
            chave = chave - 26;
        }
        for (int i = 0; i < mens.length(); i++) {
            //Tratamento Letras minusculas  
            if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {//letrans minusculas de acordo com a tabela ASCII
                if ((int) (mens.charAt(i) + chave) > 122) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
//                    System.out.print(ascii + " ");
                    return ascii;
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
//                    System.out.print(ascii + " ");
                    return ascii;

                }
            }
            //Tratamento Letras mausculas
            if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {
                if (mens.charAt(i) + chave > 90) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 90);
                    ascii = (char) (64 + y);
//                    System.out.print(ascii + " ");
                    return ascii;
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
//                    System.out.print(ascii + " ");
                    return ascii;
                }
            }
        }
        return ' ';
    }

    public static char CifrarN(String mens, int chave, boolean peso) {

        int value = Integer.valueOf(mens);
        int soma = 0;

        if (peso) {
            soma = value - chave;
            if (soma < 0) {
                soma = soma + 10;
            }
        } else {
            soma = value + chave;
            if (soma > 9) {
                soma = soma - 10;
            }
        }

        System.out.println(soma);
        return ' ';
    }

    public static void main(String[] args) {
        
        int peso = 2;
//        CovertChave("eoçPpo");
//        System.out.println(CifrarT("p", 5, false));
//        System.out.println(CifrarT("u", 5, true));

       String c = String.valueOf(CifrarN("7", peso, false))+"";
        
        System.out.println(c);
        
        System.out.println(CifrarN(c, peso, true));
    }
}
