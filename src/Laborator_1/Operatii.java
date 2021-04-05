package Laborator_1;
import java.math.*;
public class Operatii {

        public Operatii() {

        }

        public  int adunare(int x, int y) {
                return x + y;

        }

        public  int scadere(int x, int y) {
                return x -y;
        }

        public  int distana(int x, int y) {
                return Math.abs(x - y);
        }

        public  int inmultire(int x, int y) {

                return x * y;
        }

        public  double media(int x, int y) {
              double m;
              m = (x + y) / 2.0;
              return m;

        }

        public int maxim(int x, int y) {
                if (x > y)
                        return x;
                return y;
        }


        public int minim(int x, int y)
        {
               if(x<y)
                       return x;
               return y;
        }
}

