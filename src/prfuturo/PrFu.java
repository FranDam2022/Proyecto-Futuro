public class PrFu {
    private String valor1;
    private String valor2;

    public PrFu(String valor1, String valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    private String veredicto(){
        if (valor1.equals(valor2)){
        return ("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");}
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
            return ("Poco tiempo de estudio. Debes dedicar más tiempo.");}
        return("Ideal. Trabajas los contenidos en casa");
    }
}
