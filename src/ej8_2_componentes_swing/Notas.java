package ej8_2_componentes_swing;

public class Notas {
    protected double[] listaNotas;
    protected double promedioNotas;
    protected double desviacionEstandar;
    protected double mayorNota;
    protected double menorNota;
    
    protected Notas(double nota1, double nota2, double nota3, double nota4, double nota5){
        listaNotas = new double[5];
        listaNotas[0] = nota1;
        listaNotas[1] = nota2;
        listaNotas[2] = nota3;
        listaNotas[3] = nota4;
        listaNotas[4] = nota5;
        calcularPromedio();
        calcularDesviacion();
        calcularMayorNota();
        calcularMenorNota();
    }
    
    private void calcularPromedio(){
        double sumaNotas = 0;
        for (double nota : listaNotas) {
            sumaNotas += nota;
        }
        promedioNotas = sumaNotas / 5;
    }
    
    private void calcularDesviacion(){
        double promedio = promedioNotas;
        double resta, resultado;
        double sumaCuad = 0;
        for (double nota : listaNotas) {
            resta = nota - promedio;
            sumaCuad += Math.pow((resta),2);
        }
        resultado = sumaCuad / 5;
        desviacionEstandar = Math.sqrt(resultado);
    }
    
    private void calcularMayorNota(){
        int i;
        double mayor = listaNotas[0];
        for (i = 1; i < 5; i++){
            if (mayor  < listaNotas[i]){
                mayor = listaNotas[i];
            }
        }
        mayorNota = mayor;
    }
    
    private void calcularMenorNota(){
        int i;
        double menor = listaNotas[0];
        for (i = 1; i < 5; i++){
            if (menor  > listaNotas[i]){
                menor = listaNotas[i];
            }
        }
        menorNota = menor;
    }
    
}