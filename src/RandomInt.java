import java.util.Random;

public class RandomInt {

    public static void main(String[] args) {
        int par = 0;
        int impar= 0;
        var random = new Random();
        for (int i=0; i <=100; i++){
            int aleatorio = random.nextInt() ;


            if (aleatorio % 2 == 0) {
                par++;
            } else  {
                impar++;
        }
        }//Cierra el for
        System.out.println("Even Count "+par);
        System.out.println("Odd Count" + impar);
        if (par<impar){
            System.out.println("Odd WINS");
        }else if (par>impar){
            System.out.println("EVEN WINS");
        }
        else if (par==impar){
            System.out.println("Everybody wins");
        }


    }//Cierra metodo

}// Cierro clase
