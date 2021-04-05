package Laborator_2.Problema2;

public class Main {
    public static void main(String[] args) {
        double tem[]=new double[10];
        tem[0]= 35.5;
        tem[1]=36.6;
        tem[2]=34.2;
        tem[3]=38.8;
        tem[4]=39.6;
        tem[5]=38.1;
        tem[6]=36.0;
        tem[7]=30.1;
        tem[8]=30.1;
        tem[9]=36.1;
        int n=10;
        double normal[] = new  double[10];
        int contor[] = new int[10];
        int acontor[] = new int[10];
        int j=0;
        int m=0;
        normal[0]=0;

        double anormal[]= new double[10];
        for (int i=0; i<n; i++) {

            if ((tem[i] <37.0) && (tem[i] >35.9)) {
                normal[j]= tem[i];
                contor[j]=i;
                j=j+1;
            }
            else {
                anormal[m] = tem[i];
                acontor[m]=i;
                m=m+1;
            }


        }

        System.out.print("Temperaturi normale: ");

        for (int i=0; i<j; i++){
            System.out.print(normal[i] + "," + contor[i] + "  ; ");
        }

        System.out.println();
        System.out.print("Temperaturi anormale: ");

        for (int i=0; i<m; i++){
            System.out.print(anormal[i] + "," + acontor[i] + " ; ");
        }

    }
}
