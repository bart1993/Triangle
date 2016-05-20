/**
 * Created by bart on 10.05.16.
 */
public class Tringlee {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Tringlee[] ta = new Tringlee[4];
        while (x < 4) {
            ta[x] = new Tringlee();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("treugolnik" + x + ", zona");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x = 27;
        Tringlee t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(" zona t5 =" + t5.area);
    }

        void setArea (){
            area = (height * length) / 2;

        }


    }

