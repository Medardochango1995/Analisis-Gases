/*
Diseño e implementación de un algoritmo que le permita gestionar el control de
emisiones de gases del vehículo: mediante un
analizador de gases determinar las emisiones de CO , CO2 y HC de un vehículo a gasolina.
 */
package prueba_analizador;

/**
 *
 * @author Medardo Rene Chango
 */
import java.util.Scanner;
public class Prueba_Analizador {
public static void INTRODUCCION(){
    System.out.println("ESPE");
    System.out.println("Analisador de gases");

}
public static int Determinar_modelo_vehiculo(){
    int anio;
    String tipo_vehiculo,marca_vehiculo;
           Scanner cc=new Scanner(System.in);
           System.out.println("**Determine tipo vehiculo**");
           tipo_vehiculo=cc.next();
           System.out.println("**Determine marca vehiculo**");
           marca_vehiculo=cc.next();
           System.out.println("Determine anio");
           anio=cc.nextInt();
           return 0;
}
public static int Deducir_tipo_motor_veliculo(){
    int cilindros;
    String tipo_modelo_motor;
    Scanner mm=new Scanner(System.in);
    System.out.println("**Intique tipo modelo motor**");
           tipo_modelo_motor=mm.next();
           System.out.println("Numero Cilindros");
           cilindros=mm.nextInt();
           return 0;
}
public static int Determinar_tipo_encendido(){
    String tipo_sistema;
    String especificacion_sistema;
    Scanner xx=new Scanner(System.in);
    System.out.println("**Indique tipo sistema de encendido **");
        tipo_sistema=xx.next();
        System.out.println("**Especifique sistema encendido**");
        especificacion_sistema=xx.next();
             return 0;
}
public static int Comprobar_gases_vehiculo(){
    String tipo_control;
    Scanner aa=new Scanner(System.in);
    System.out.println("**Especificar Tipo control gases **");
        tipo_control=aa.next();
        return 0;


}
public static int Obtener_datos_control_analizador(){
    String tipo_especificacion;
    int gases_CO;
    int gases_CO2;
    int gases_HC;
    Scanner nn=new Scanner(System.in);
    System.out.println("**Intique tipo especificacion Analisis**");
           tipo_especificacion=nn.next();
           System.out.println("**Porcentaje emisiones CO**");
           gases_CO=nn.nextInt();
           System.out.println("**Porcentaje emisiones CO2**");
           gases_CO2=nn.nextInt();
           System.out.println("**Porcentaje emisiones HC**");
           gases_HC=nn.nextInt();
           return 0;
}

public static int Examinar_valores_normativa(){
    String tipo_analisis;
    String codigo_norma;
    int codigo_ambiental;
            Scanner zz=new Scanner(System.in);
            System.out.println("**Tipo Analisis**");
           tipo_analisis=zz.next();
           System.out.println("**Codigo norma**");
           codigo_norma=zz.next();
           System.out.println("**Norma codigo Ambiental**");
           codigo_ambiental=zz.nextInt();
           return 0;
}

public static int Mostrar_analisis_finalizado_mediante_monitor(){
    String tipo_comprobacion;
            int gases_CO;
            int gases_CO2;
            int gases_HC;
    Scanner ss=new Scanner(System.in);
    System.out.println("**Resultados obtenidos**");
           tipo_comprobacion=ss.next();
           System.out.println("**Porcentaje emisiones CO**");
           gases_CO=ss.nextInt();
           System.out.println("**Porcentaje emisiones CO2**");
           gases_CO2=ss.nextInt();
           System.out.println("**Porcentaje emisiones HC**");
           gases_HC=ss.nextInt();
           return 0;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        INTRODUCCION();
        Determinar_modelo_vehiculo();
        Deducir_tipo_motor_veliculo();
        Determinar_tipo_encendido();
        Comprobar_gases_vehiculo();
       Obtener_datos_control_analizador();
       Mostrar_analisis_finalizado_mediante_monitor();

    }

}
