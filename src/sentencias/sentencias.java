package sentencias;

import java.util.Scanner;

public class sentencias {
    public static void main(String[] args) {
        p1();
        p2();
        p3();
        p4();
        p5();
        p6();
        p7();
        p8();
        p9();
        p10();
        p11();
        p12();
        p13();
        p14a();
        p14b();
        p15a();
        p15b();
        p16();
        p17();
        p18();
        p19();
        p20();
        p21();
        p22();
        p23();
        p24();
        p25();
        p26();
        p27();
        p28();
        p29();
        p30();
        p31();
        p32();
        p33();
        p34();
        p35();
        p36();
        p37();
        p38();
        p39();
        p40();
        p41();
        p42();
        p43();
        p44();
        p45();
    }

    public static void p1() {
        System.out.println("Problema 1 Haz  un  programa  que  según  el  valor  de  x  (un  valor  entrado  por  teclado),  indique  si  es  mayor  que  10 con el mensaje “demasiado alto” o menor que 10 con el mensaje “demasiado bajo”. ");
    }

    public static void p2() {
        System.out.println("Problema 2 Haz un programa que, según el día de la semana, nos diga “a estudiar toca!” o “por fin descanso!” ");
    }

    public static void p3() {
        System.out.println("Problema 3 Haz  un  programa  que  decida,  según  el  dinero  que  tengamos,  si  vamos  al  videoclub,  al  cine  o  nos vamos “al parque...”. Nota: usa condicionales “anidados”.");
    }
    public static void p4() {
        System.out.println("Problema 4 Muestra por pantalla el resultado de sumar 5 variables, y dile al usuario “te has pasado!” si el resultado es > 100.  ");
    }
    public static void p5() {
        System.out.println("Problema 5 Toma el ejercicio anterior, y muestra por pantalla si el resultado es múltiplo de 2, 3 o 5. ");
    }
    public static void p6() {
        System.out.println("Problema 6 Presenta  un  menú  al  usuario  donde  pueda  escoger  5  opciones.  Si  selecciona  cualquiera  de  ellas, muestra por pantalla: “has escogido la opción X”. Usa un switch.");
    }
    public static void p7() {
        System.out.println("Problema 7 ¿Qué sucede si quitamos los “break” en el ejercicio anterior? Explica por qué. ");
    }
    public static void p8() {
        System.out.println("Problema 8 Haz un bucle que nos muestre todos los números del 1 al 100.  ");
    }
    public static void p9() {
        System.out.println("Problema 9 Muestra ahora la tabla de multiplicar del 37.  ");
    }
    public static void p10() {
        System.out.println("Problema 10 Muestra todos los números pares que haya entre 3 y 99. Nota: “no vale” saltar de 2 en 2, debes usar unif dentro de un bucle");
    }
    public static void p11() {
        System.out.println("Problema 11 ¿Qué diferencia hay entre while y do-while? Demuéstralo con un ejemplo. (pista: do-while se ejecuta al menos 1 vez)");
    }
    public static void p12() {
        System.out.println("Problema 12 Haz un bucle “for” de 1 a 5.000, que termine cuando lleguemos a la vuelta 25. Pista: usa el “break”.  ");
    }
    public static void p13() {
        System.out.println("Problema 13 Haz un bucle “while” que nos cuente los números del 4 al 296. Además, sáltate todos los números que sean múltiplos de 5. Pista: usa el “continue”. ");
    }
    public static void p14a() {
        System.out.println("Problema 14 Se  pretende  escribir  un  programa  que  determinara  si  un  número  es  positivo  o  negativo.  Dos programadores diferentes han escrito dos programas diferentes, Signo1 y Signo2:");
        System.out.println("Indica  si  los  dos  programas  son  correctos,  si  sólo lo  es  uno  de  ellos,  indica  cual,  o  si  ninguno  de  los dos es correcto. Razonad la respuesta");
        System.out.println("Signo1");
        Scanner reader = new Scanner(System.in);
        int a;
        a = reader.nextInt();
        if(a>=0) {
            System.out.println("poditivo");
        }
        System.out.println("negativo");
    }

    public static void p14b(){
        System.out.println("Problema 14 Se  pretende  escribir  un  programa  que  determinara  si  un  número  es  positivo  o  negativo.  Dos programadores diferentes han escrito dos programas diferentes, Signo1 y Signo2:");
        System.out.println("Indica  si  los  dos  programas  son  correctos,  si  sólo lo  es  uno  de  ellos,  indica  cual,  o  si  ninguno  de  los dos es correcto. Razonad la respuesta");
        System.out.println("Signo2");
        Scanner reader = new Scanner(System.in);
        int a;
        a = reader.nextInt();
        if(a>=0) {
            System.out.println("poditivo");
        }
        else {
            System.out.println("negativo");
        }
    }
    public static void p15a() {
        System.out.println("Problema 15 Respecto  de  los  programas  Cond2  y  Cond3  que  se  dan a  continuación  responde  a  las  cuestiones siguientes:  ");
        Scanner reader = new Scanner(System.in);
        int a,b;
        System.out.print("introduce un valor a: ");
        a =  reader.nextInt();
        System.out.print("introduce el valor de b: ");
        b= reader.nextInt();
        if(a%2==0) {
            if (b % 2 == 0) {
                System.out.println("Si");
            } else {
                System.out.println("NO");
            }
        }
        if(b%2==0) {
            System.out.println("NO");
        }
        else{
            System.out.println("SI");
        }
        System.out.println("a) ¿Qué resultado produce Cond2 si se le dan los valores 15 y 78? ¿Y Cond3?  ");
        System.out.println("b) ¿Qué resultado produce Cond2 si se le dan los valores 10 y 22? ¿Y Cond3?  ");
        System.out.println("c) ¿Qué resultado produce Cond2 si se le dan los valores 17 y 21? ¿Y Cond3? ");
        System.out.println("d) Cond2 y Cond3 siempre producen el mismo resultado, ¿o no? ");
    }

    public static void p15b() {
        System.out.println("Problema 15 Respecto  de  los  programas  Cond2  y  Cond3  que  se  dan a  continuación  responde  a  las  cuestiones siguientes:  ");
        Scanner reader = new Scanner(System.in);
        int a,b,c;
        System.out.println("introduce valor a: ");
        a = reader.nextInt();
        System.out.print("introduce el valor de b ");
        b = reader.nextInt();
        c = a%2 + b%2;
        if(c!=0 && c!=2){
            System.out.println("NO");
        }
        else{
            System.out.println("SI");
        }
        System.out.println("a) ¿Qué resultado produce Cond2 si se le dan los valores 15 y 78? ¿Y Cond3?  ");
        System.out.println("b) ¿Qué resultado produce Cond2 si se le dan los valores 10 y 22? ¿Y Cond3?  ");
        System.out.println("c) ¿Qué resultado produce Cond2 si se le dan los valores 17 y 21? ¿Y Cond3? ");
        System.out.println("d) Cond2 y Cond3 siempre producen el mismo resultado, ¿o no? ");
    }
    public static void p16() {
        System.out.println("Problema 16 Respecto del programa que se da a continuación responde a las cuestiones siguientes:");
        Scanner reader = new Scanner(System.in);
        int a, b, c;
        int qp, qn;
        System.out.print("Introduce el valor de a: ");
        a = reader.nextInt();
        System.out.print("Introduce el valor de b: ");
        b = reader.nextInt();
        System.out.print("Introduce el valor de c: ");
        c = reader.nextInt();
        qp = 0;
        qn = 0;
        if (a > 0) {
            qp = qp + 1;
        } else {
            qn = qn + 1;
        }
        if (c >= 0) {
            qp = qp + 1;
        } else {
            qn = qn + 1;
        }
        if (qp > qn) {
            System.out.println("YUPI");
        }
        System.out.println("ADEU");
        System.out.println("a) ¿Qué resultado produce si se le dan los valores 10, -23 y 12?  ");
        System.out.println("ADEU b) ¿Qué resultado produce si se le dan los valores 3, 7 y -9?  ");
        System.out.println("c) ¿En qué circunstancias escribe YUPI antes de escribir ADEU? (¿cuándo escribe YUPI?) ");
    }

    public static void p17() {
        System.out.println("Problema 17 Respecto al siguiente programa que se da a continuación, responde a las cuestiones siguientes:  ");
        Scanner reader = new Scanner(System.in);
        double a,resultat;
        int n, voltes;
        System.out.print("introduce el valor de a: ");
        a = reader.nextDouble();
        System.out.print("introduce el valor de n: ");
        n = reader.nextInt();
        resultat = 1.0;
        voltes = 0;
        while (voltes!=n){
            voltes= voltes+1;
            resultat = resultat*a;
        }
        System.out.println("El resultat es " +  resultat);
        System.out.println("a) ¿Qué resultado produce si se le dan los valores 5 y 3?  ");
        System.out.println("b) ¿Qué resultado produce si se le dan los valores 2 y 3? ");
        System.out.println("c) ¿Qué resultado produce si se le dan los valores 1 y -1?  ");
        System.out.println("d) ¿Qué es lo que calcula este programa?  ");
    }
    public static void p18() {
        System.out.println("Problema 18 Cuando  el  programa  sea  ejecutado,  ¿cuáles  serán  los  valores  finales  de  las  variables  aaa  y  ccc (que escribirá el programa) si el valor leído del teclado y asignado a la variable bbb es 10?  ");
        Scanner reader = new Scanner(System.in);
        int aaa, bbb, ccc;
        System.out.print("introduce un numero: ");
        bbb = reader.nextInt();
        aaa=0;
        ccc=0;
        while (aaa<bbb) {
            ccc = ccc + aaa;
            aaa++;
        }
        System.out.println(aaa);
        System.out.println(ccc);
    }
    public static void p19() {
        System.out.println("Problema 19 Respecto del programa que se da a continuación responde a las cuestiones siguientes:");
        Scanner reader = new Scanner(System.in);
        int a,b;
        System.out.println("introduce el valor de a: ");
        a = reader.nextInt();
        System.out.println("introduce el valor de b: ");
        b = reader.nextInt();;
        while (!(a==b)) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("el resultado es " + a);
        System.out.println("a) ¿Qué resultado produce si se le dan los valores 2 y 5?");
        System.out.println("b) ¿Qué resultado produce si se le dan los valores 14 y 21?");
        System.out.println("c) ¿Qué resultado produce si se le dan los valores 57 y 95? ");
    }
    public static void p20() {
        System.out.println("Problema 20 Cuando  el  siguiente  programa  sea  ejecutado,  ¿Cuáles  serán  los  valores  finales  de  las  variables ahora  y  suma  si  el  valor  (leído  del  teclado  y  asignado  a  la  variable  stop  es  34  (que  escriba  el programa?) ");
        Scanner reader = new Scanner(System.in);
        int ahora, suma, stop;
        System.out.print("Introduce el valor de Stop: ");
        stop = reader.nextInt();
        suma =0;
        ahora= 15;
        while(ahora<= stop) {
            ahora = ahora + 2;
            if (ahora % 5 == 0) {
                suma = suma + ahora;
            }
        }
        System.out.println("ahora: " + ahora);
        System.out.println("suma: " + suma);
    }
    public static void p21() {
        System.out.println("Problema 21 Respecto del programa que se da a continuación responde a las cuestiones siguientes:");
        Scanner reader = new Scanner(System.in);
        int num, f;
        boolean acabar;
        System.out.println("Introduce un numero: ");
        num = reader.nextInt();
        acabar = (num == 0);
        f = 1;
        while (!acabar) {
            f = f * num;
            num = num - 1;
            acabar = (num == 0);
        }
        System.out.println("el resultado es: " + f);
        System.out.println("a) ¿Qué resultado produce si se le da el valor 3?  ");
        System.out.println("b) ¿Qué resultado produce si se le da el valor 5?  ");
        System.out.println("c) ¿Qué resultado produce si se le da el valor 0?  ");
        System.out.println("d) ¿Qué resultado produce si se le da el valor -1? ");
        System.out.println("e) ¿Que es lo que calcula este programa?");
    }

    public static void p22() {
        System.out.println("Problema 22 Si  se  ejecutara  el  siguiente  fragmento  de  programa,  ¿cuáles  serían  los  valores  finales  de las siguientes variables: exterior, interior, sumaGrande y sumaPequeña? ");
        int exterior, interior = 0;
        int sumaGrande, sumaPequeña = 0;
        sumaGrande = 0;
        exterior = 2;
        while (exterior < 12) {
            if (exterior % 2 == 0) {
                sumaPequeña = 0;
                interior = 5;
                while (interior <= exterior) {
                    sumaPequeña = sumaPequeña + interior;
                    interior++;
                }
                sumaGrande = sumaGrande + sumaPequeña;
            }
            exterior++;
        }
        System.out.println("exterior:" + exterior);
        System.out.println("interior:" + interior);
        System.out.println("sumaGrande:" + sumaGrande);
        System.out.println("sumaPequeña:" + sumaPequeña);
    }
    public static void p23() {
        System.out.println("Problema 23 contesta las siguientes preguntas");
        Scanner reader = new Scanner(System.in);
        int primero, ultimo, actual;
        int buenos;
        System.out.print("introduce el valor del primero ");
        primero = reader.nextInt();
        System.out.print("introduce el numero del ultimo");
        ultimo = reader.nextInt();
        actual = primero;
        buenos = 0;
        while (actual != ultimo + 1) {
            if (actual % 2 == 1 && actual % 3 == 0) {
                buenos = buenos + 1;
            }
            actual++;
        }
        System.out.println("actual= " + actual);
        System.out.println("buenos= " + buenos);
        System.out.println("a) Suponed que cuando  el programa se ejecuta, se le subministran, en este orden, los valores 10 y 25 (que serán recogidos en  las variables primer  y último, respectivamente). ¿Cuáles serán los valores  de las variables actual y buenos al finalizar la ejecución? (Que escribirá el programa al ser ejecutado?)");
        System.out.println("b) Suponed que los valores suministrados son 25 y 10. ¿Qué valores escribirá el programa?  ");
        System.out.println("c) La condición actual != ultimo + 1 que controla la iteración, ¿se puede escribir de alguna otra manera que haga el programa más robusto? ");
    }

    public static void p24() {
        System.out.println("Problema 24 Cuando  el  programa  sea  ejecutado,  ¿cuáles  serán  los  valores  finales  de  las  variables  ahora  y suma (que escribirá el programa) si los valores leídos de teclado son 50 (asignado a la variable terminacion) y 3 (asignado a la variable control): ");
        Scanner reader = new Scanner(System.in);
        int ahora, terminacion;
        int control;
        int suma;
        System.out.print("Introduce numero de terminacion");
        terminacion = reader.nextInt();
        System.out.print("Introduce un numero de control");
        control = reader.nextInt();
        ahora = 5;
        suma = 0;
        while (ahora <= terminacion) {
            if (control == 0) {
                if (ahora % 10 == 0) {
                    suma = suma + ahora;
                }
            } else {
                if (ahora % 10 == 5) {
                    suma = suma + ahora;
                }
            }
            ahora = ahora + 5;
        }
        System.out.println(ahora);
        System.out.println(suma);

    }

    public static void p25() {
        System.out.println("Problema 25 Cuando   el   programa   sea   ejecutado   cuales   serán   los   valores   finales   de   las variables actualInterior,  actualExterior,  sumaInterior  y sumaExterior,  si  el  valor  leído  del  teclado  y asignado a la variable finalExterior es: a) 4  y  b) 10  ");
        Scanner reader = new Scanner(System.in);
        int actualExterior, finalExterior;
        int actualInterior = 0;
        int sumaInterior = 0, sumaExterior;
        System.out.print("Introduce el valor de finalExterior");
        finalExterior = reader.nextInt();
        sumaExterior = 0;
        actualExterior = 1;
        while (actualExterior <= finalExterior) {
            sumaInterior = 0;
            actualInterior = 1;
            while (actualInterior < actualExterior) {
                sumaInterior = sumaInterior + actualInterior;
                actualInterior = actualInterior + 1;
            }
            sumaExterior = sumaExterior + sumaInterior;
            actualExterior = actualExterior + 1;
        }
        System.out.println("actualinterior: " + actualInterior);
        System.out.println("actualExterior: " + actualExterior);
        System.out.println("sumaInterior: " + sumaInterior);
        System.out.println("sumaExterior: " + sumaExterior);
    }
    public static void p26(){
        System.out.println("Problema 26 Escribe un programa que lea dos números enteros y los vuelva a escribir ordenados de menor a mayor. Por ejemplo, si los números dados son 4  y 17 el  programa tendría que escribir 4, 17, mientras que si los números dados son 45, 29 el programa tendría que escribir 29, 45.");
    }
    public static void p27(){
        System.out.println("Problema 27 Escribe un programa que lea tres números reales y que como resultado escriba cuantos de los nombres leídos son negativos. Por ejemplo, si los números dados son -1.34, 12.56 y 34.76 el programa tendría que escribir 1, mientras que si los números dados son 4.09, 234.0 y 45.66 entonces el programa tendríaque escribir 0. ");
    }
    public static void p28(){
        System.out.println("Problema 28 Escribe un programa que lea tres números y que escriba todos los que son más grandes que el primero. Por ejemplo, si los números dados fueran (en este orden) 13, 45, 3, el programa tendría que escribir 45; si los números dados fuesen 17, 23, 19 el programa tendría que escribir 23, 19. Y si los números dadosfuesen 19, 19, 20 entonces el programa tendría que escribir 20. ");
    }
    public static void p29(){
        System.out.println("Problema 29 Haz un programa que calcule las siguientes fórmulas y muestre los resultados por pantalla: ");
    }
    public static void p30(){
        System.out.println("Problema 30 Haz un programa que genere tres números aleatorios de tipo float entre 0 y 9, los muestre por pantalla, diga cuál es el mayor, cual es el menor y cuál es su producto. ");
    }

    public static void p31(){
        System.out.println("Problema 31 Vamos  a  hacer  una  calculadora  muy  simple,  sólo  podrá  operar  con  dos  números  y  realizar  una  sola operación. La calculadora pedirá dos números, y luego el tipo de operación que será (+) para la suma, (-)  para  la  resta,  (*)  para  la  multiplicación,  (/) para  la  división  y  (%)  para  el  resto.  Después  de  haber mostrado el resultado por pantalla finalizará el programa. La calculadora operará con números enteros de tipo long. ");
    }

    public static void p32(){
        System.out.println("Problema 32 Haz que el ordenador se piense un número del 1 al 100, que el usuario tratará de adivinar. El ordenador irá  contando  el  número  de  intentos.  Si  el  usuario  falla  el  número,  el  ordenador  le  dirá  si  el  número pensado es mayor o menor. Cuando el usuario acierte el número, el programa le dará la enhorabuena y le  dirá  el  número  de  intentos  que  ha  necesitado  para  adivinarlo.  Luego  el  programa,  le  preguntará  al usuario si quiere jugar otra partida, en caso afirmativo se continuará con el juego y en caso contrario se finalizará el programa.");
    }

    public static void p33(){
        System.out.println("Problema 33 Escribe un programa que lea 3 números e indique si alguno de ellos es repetido o no. Por ejemplo, si los  números  dados  fuesen  3,  5,  8  el  programa  tendría  que  escribir  “No  hay  repeticiones”;  si  los números dados fuesen -3, 2, -3 el programa tendría que escribir “Hay repeticiones”. Y si los números dados fuesen 4, 4, 4 el programa tendría que escribir “Hay repeticiones”. Nota el programa sólo puede escribir “Hay repetición” o “No hay repetición” una sola vez. ");
    }

    public static void p34(){
        System.out.println("Problema 34 Escribe un programa que lea 3 números enteros y calcule la suma de todos los que son múltiples de 5. Si ninguno de los números leídos es múltiple de 5, entonces el resultado ha de ser 0. Por ejemplo, si los números dados son 34, 45  y 30  entonces  el resultado ha de ser 75  (45+30=75); si los números dados son  20,  -15  y  -5  el  resultado  ha  de  ser  0  (20+(-15)+(-5)=0);  y  si  los  números  dados  son  33,  21  y  19 entonces el resultado ha de ser 0 (ninguno de los tres es múltiple de 5)");
        System.out.println("Pista: un número es múltiplo de 5 si, y sólo si, al dividirlo por 5 el resto de esta división es 0.  ");
    }
    public static void p35(){
        System.out.println("Problema 35 Igual  que  en  el  apartado  anterior,  pero  ahora,  si  ninguno  de  los  números  dados  es  múltiple  de  5,  en lugar de dar resultado 0 el programa tiene que escribir “No hay ningún número múltiplo de 5”. ");
    }
    public static void p36(){
        System.out.println("Problema 36 Escribe un programa que lea 3  números enteros y que, después, haga lo siguiente: Si el primer número es positivo (y mayor que cero)  entonces tiene que escribir un mensaje indicando si  alguno de los dos números siguientes es múltiple de 7 o no. Si el primer número es negativo entonces tiene que escribir los dos números siguientes ordenados de mayor a menor. Si el primer número es cero entonces ha de calcular la suma de los valores absolutos de los dos siguientes. ");
        System.out.println("NOTA: Por ejemplo, si los números dados son 6, 14, 9 el programa tiene que escribir “Alguno de los dos últimos es múltiplo de 7”; si los números dados son 1, 18, 24 entonces el programa debe de escribir “Ninguno de los dos últimos es múltiple de 7; si los números dados son -4, 7, 5 entonces el programa debe de escribir 7, 5. Y si los números dados son 0, 3, -4 el programa tiene que escribir 7. ");
    }
    public static void p37(){
        System.out.println("Problema 37 Escribe un programa que lea 4 números  enteros, sume los pares por un lado  y los impares por otro e indique si la suma de los pares es superior o igual a 4 veces la suma de los impares, o no.  ");
        System.out.println("NOTA: Por ejemplo, si los números dados son 7, 20, 30, 5 el programa tendría que escribir “La suma de  los  pares  supera  o  es  igual  a  4  veces  la  suma  de  los  impares”  porque  20+30  >=  4(7+5);  si  los números dados fuesen 10, 3, 5, 2 el programa tendría que escribir “La suma de los pares no supera ni es igual a 4 veces la suma de los impares” porque 10+2 < 4(3+5).");
    }

    public static void p38(){
        System.out.println("Problema 38 Escribe  un  programa  que  lea  un  número  n  (n  >  0)  y  escriba  en  la  pantalla  todos  los  números  enteros positivos  entre  0  y  n  (los  dos  incluidos).  Por  ejemplo,  si  el  nombre  que  se  le  da  es  7,  el  resultado tendría que ser:");
        System.out.println("0 1 2 3 4 5 6 7 ");
        System.out.println("El programa no hace falta que verifique si el número dado es cero o inferior porque supondremos que quien lo introduce lo hace correctamente.");
    }
    public static void p39(){
        System.out.println("Problema 39 Igual  que  el  anterior  pero  separando  los  números  con  comas  y  poniendo  un  punto  al  final (detrás  del último nombre). Por ejemplo, si el número dado es 5, el resultado tendría que ser:");
        System.out.println("0,1,2,3,4,5");
    }

    public static void p40(){
        System.out.println("Problema 40 Escribe un programa que dados dos números m y n  (m < n) escriba ordenadamente, todos los números del  intervalo  [m,  n]  (m  y  n  incluidos).  Por  ejemplo,  si  los  números  dados  son  -5  y  4,  el  resultado tendría que ser: ");
        System.out.println("-5 -4 -3 -2 -1 0 1 2 3 4 ");
        System.out.println("Es  necesario  que  el  programa  verifique  que  el  primer  número  (m)  es  estrictamente  menor  que  el segundo (n). Si no es así el programa tendría que escribir un mensaje indicando que el primer número ha de ser más pequeño que el segundo. ");
    }

    public static void p41(){
        System.out.println("Problema 41 Igual que en el ejercicio anterior pero en sentido decreciente. Por ejemplo, si los números dados son 7 y 15, el resultado tendría que ser: ");
        System.out.println("15 14 13 12 11 10 9 8 7 ");
    }

    public static void p42(){
        System.out.println("Problema 42 Escribe un programa que dado un número entero n escriba la taula de multiplicar de n. Por ejemplo, si el número dado es 7 el resultado tendría que ser: ");
        System.out.println("7x1=7 7x2=14  7x3=21 ... 7x9=63  7x10= 70 ");
    }

    public static void p43(){
        System.out.println("Problema 43 Escribe  un  programa  que  lea  un  número  n  (n  >=  1)  y dibuje  en  la  pantalla  un  cuadrado  de  n  x  n asteriscos (*). Por ejemplo, si se le da el número 3 el resultado tendría que ser:");
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
    }

    public static void p44(){
        System.out.println("Problema 44 Escribe  un  programa  que  lea  un  número    n  (n  >=  1)  y  dibuje  en  la  pantalla  un  cuadrado  de  n  x  n formado  por  los  números  enteros  positivos  entre  1  y  n.  Por  ejemplo,  si  se  le  da  el  nombre  4  el resultado tendría que ser:");
        System.out.println("1111");
        System.out.println("2222");
        System.out.println("3333");
        System.out.println("4444");
    }


}



