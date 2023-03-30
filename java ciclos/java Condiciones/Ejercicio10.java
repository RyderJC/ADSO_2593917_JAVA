import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float nota_mayor=0;
        float nota_menor=1000;

        System.out.println("=> Ingrese la nota de matematicas: ");
        float nota1 = entrada.nextFloat();

        System.out.println("=> Ingrese la nota de Espanol: ");
        float nota2 = entrada.nextFloat();

        System.out.println("=> Ingrese la nota de Ingles: ");
        float nota3 = entrada.nextFloat();

        System.out.println("=> Ingrese la nota de Ciencias Naturales: ");
        float nota4 = entrada.nextFloat();

        System.out.println("=> Ingrese la nota de Deportes: ");
        float nota5 = entrada.nextFloat();

        float promedio=(nota1+nota2+nota3+nota4+nota5)/5;

        if (nota1<nota_menor) {
            nota_menor=nota1;
        }if (nota2<nota_menor) {
            nota_menor=nota2;
        }if (nota3<nota_menor) {
            nota_menor=nota3;
        }if (nota4<nota_menor) {
            nota_menor=nota4;
        }if (nota5<nota_menor) {
            nota_menor=nota5;
        }if (nota1>nota_mayor) {
            nota_mayor=nota1;
        }if (nota2>nota_mayor) {
            nota_mayor=nota2;
        }if (nota3>nota_mayor) {
            nota_mayor=nota3;
        }if (nota4>nota_mayor) {
            nota_mayor=nota4;
        }if (nota5>nota_mayor) {
            nota_mayor=nota5;
        }if (nota_menor==nota1) {
            System.out.println("·Esta es la asignatura con menor nota: Matematicas");
        }else if (nota_menor==nota2) {
            System.out.println("·Esta es la asignatura con menor nota: Espanol");
        }else if (nota_menor==nota3) {
            System.out.println("·Esta es la asignatura con menor nota: Ingles");
        }else if (nota_menor==nota4) {
            System.out.println("·Esta es la asignatura con menor nota: Ciencias naturales");
        }else if (nota_menor==nota5) {
            System.out.println("·Esta es la asignatura con menor nota: Deportes");
        }if (nota_mayor==nota1) {
            System.out.println("·Esta es la asignatura con mejor nota: Matematicas");
        }else if (nota_mayor==nota2) {
            System.out.println("·Esta es la asignatura con mejor nota: Espanol");
        }else if (nota_mayor==nota3) {
            System.out.println("·Esta es la asignatura con mejor nota: Ingles");
        }else if (nota_mayor==nota4) {
            System.out.println("·Esta es la asignatura con mejor nota: Ciencias naturales");
        }else if (nota_mayor==nota5) {
            System.out.println("·Esta es la asignatura con mejor nota: Deportes");

        }System.out.println("·Este es el promedio de las cinco notas: " + promedio);

        if (promedio<3 && nota_menor==nota1) {
            System.out.println("·Debio obtener una nota de 3,9 en Matematicas para aprobar el periodo");
        }else if (promedio<3 && nota_menor==nota2) {
            System.out.println("·Debio obtener una nota de 3,9 en Espanol para aprobar el periodo");
        }else if (promedio<3 && nota_menor==nota3) {
            System.out.println("·Debio obtener una nota de 3,9 en Ingles para aprobar el periodo");
        }else if (promedio<3 && nota_menor==nota4) {
            System.out.println("·Debio obtener una nota de 3,9 en Ciencias Naturales para aprobar el periodo");
        }else if (promedio<3 && nota_menor==nota5) {
            System.out.println("·Debio obtener una nota de 3,9 en Deportes para aprobar el periodo");
        }else{
            System.out.println("");
        }

    }
}