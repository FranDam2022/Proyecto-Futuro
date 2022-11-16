import java.util.Scanner;
public class PrFuMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String modulo;
        String horas;

        System.out.println("Alumno "+args[0]+" "+args[1]+" "+args[2]);

        System.out.println("Indica cuantos módulos de este ciclo formativo tienes matriculados");
        modulo = sc.next();
        System.out.println("Indica as horas semanales que dedicas al estudio");
        horas = sc.next();

        PrFu h = new PrFu(modulo, horas);

        System.out.println(h.veredicto());
    }

}

