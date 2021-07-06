public class App {
    
    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Tipos de datos y operadores
        String res = "Hola";
        int resultado = 15 + 32;
        int resultado1 = 125 - 32;
        float resultado2 = 58 * 21;
        double resultado3 = 25 / 3;
        int resultado4 = 21 % 9;
        //Operadores unarios
        resultado++; //resultado = resultado + 1
        resultado--; //resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;
        //Operadores lógicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 >= 8;
        respuesta = 5 <= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;

    }
}
