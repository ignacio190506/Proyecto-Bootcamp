/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_trabajo;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ignac
 */
public class Output implements Interface {


    public static void main(String[] args) throws IOException {
        System.out.println("SISTEMA DE MONITOREO DE CALIDAD DEL AIRE\n");
        
        // Inicialización de las listas que guardan los objetos
        
        LugarObj lob = new LugarObj(); 
        AireObj aob = new AireObj();
        ICAObj iob = new ICAObj();
        ComponentesObj cob = new ComponentesObj();
        ElementosObj eob = new ElementosObj();
        CalificadorObj caob = new CalificadorObj();
        
        // Inicialización variables de lectura de archivos
        
        float concentracionNO2,concentracionO3,concentracionSO2,pm10,pm25;
        int id, temperatura, poblacion, PPM;
        String urbanizacion;
        
        // EMPEZAMOS LA LECTURA DE ARCHIVOS
        // Asignación de variable al archivo a leer
        String nombreArchivo = "C:\\Users\\ignac\\Desktop\\Programación\\C, C++\\Clases\\Tareas\\output\\Datos.txt";
        
        System.out.println("Lectura de archivos... de" + nombreArchivo);
        try {
            // BUSCA EL ARCHIVO 
            File archivo = new File(nombreArchivo); 
            // LEE EL ARCHIVO LINEA POR LINEA 
            Scanner scanner = new Scanner(archivo);
            // MIETRAS EXISTE UNA NUEVA LINEA POR LEER SE SEGUIRÁ LEYENDO EL ARCHIVO Y HACIENDO OBJETOS
            while(scanner.hasNextLine()) {
                // ASIGNO UNA VARIABLE AL SCANNER DE LA PROXIMA LINEA LLAMADO "LINEA"
                String linea = scanner.nextLine();
                // SEPARO CADA LINEA EN UNA LISTA DE STRING CON EL METODO SPLIT SEGUN LA COMA
                String [] datos = linea.split(",");
                // TRANFORMO CADA DATO A SU TIPO DE DATO CORRESPONDIENTE CON TIPO.PARSE.TIPO()
                concentracionNO2 = Float.parseFloat(datos[0]);
                concentracionO3 = Float.parseFloat(datos[1]);
                concentracionSO2 = Float.parseFloat(datos[2]);
                pm10 = Float.parseFloat(datos[3]);
                pm25 = Float.parseFloat(datos[4]);
                id = Integer.parseInt(datos[5]);
                temperatura = Integer.parseInt(datos[6]);
                poblacion = Integer.parseInt(datos[7]);
                PPM = Integer.parseInt(datos[8]);
                // AL YA SER UN STRING NO NECESITA ESTE CAMBIO
                urbanizacion = datos[9];
                // CREACIÓN ELEMENTOS QUÍMICOS
                // Elemento Nitrógeno (N)
                Elemento elementoN = new Elemento();    
                elementoN.setNombre("N");
                elementoN.setNumeroatomico(7);
                elementoN.setMasaatomica(Interface.MASAATOMICAN);
                elementoN.setRadioatomico(65);
                elementoN.setCantidadpormolecula(1);


                // Elemento Oxígeno (O)
                Elemento elementoO = new Elemento();
                elementoO.setNombre("O");
                elementoO.setNumeroatomico(8);
                elementoO.setMasaatomica(Interface.MASAATOMICAO);
                elementoO.setRadioatomico(60);
                elementoO.setCantidadpormolecula(2);

                // Elemento Azufre (S)
                Elemento elementoS = new Elemento();
                elementoS.setNombre("S");
                elementoS.setNumeroatomico(16);
                elementoS.setMasaatomica(Interface.MASAATOMICAS);
                elementoS.setRadioatomico(100);
                elementoS.setCantidadpormolecula(1);

                //CREAR LISTAS DE ELEMENTOS PARA CADA COMPONENTE 

                // Lista para NO2 (1N + 2O)
                ListaElementos listaElementosNO2 = new ListaElementos();
                elementoN.setCantidadpormolecula(1);
                listaElementosNO2.agregarComponente(elementoN);
                elementoO.setCantidadpormolecula(2);
                listaElementosNO2.agregarComponente(elementoO);

                // Lista para O3 (3O)
                ListaElementos listaElementosO3 = new ListaElementos();
                Elemento elementoO3 = new Elemento();
                elementoO3.setNombre("O");
                elementoO3.setNumeroatomico(8);
                elementoO3.setMasaatomica(16);
                elementoO3.setRadioatomico(60);
                elementoO3.setCantidadpormolecula(3);
                listaElementosO3.agregarComponente(elementoO3);

                // Lista para SO2 (1S + 2O)
                ListaElementos listaElementosSO2 = new ListaElementos();
                elementoS.setCantidadpormolecula(1);
                listaElementosSO2.agregarComponente(elementoS);
                Elemento elementoO2 = new Elemento();
                elementoO2.setNombre("O");
                elementoO2.setNumeroatomico(8);
                elementoO2.setMasaatomica(16);
                elementoO2.setRadioatomico(60);
                elementoO2.setCantidadpormolecula(2);
                listaElementosSO2.agregarComponente(elementoO2);

                //CREAR COMPONENTES CON DATOS DEL SIMULADOR
                // Componente NO2
                Componente componenteNO2 = new Componente();
                componenteNO2.setNombre("NO2");
                componenteNO2.setConcentracion(concentracionNO2);  // Dato simulador
                componenteNO2.setMasaatomica(Interface.MASAATOMICANO2);
                componenteNO2.setRadioatomico(0);
                componenteNO2.setLista(listaElementosNO2);
     

                // Componente O3
                Componente componenteO3 = new Componente();
                componenteO3.setNombre("O3");
                componenteO3.setConcentracion(concentracionO3);  // Dato simulador
                componenteO3.setMasaatomica(Interface.MASAATOMICAO3);
                componenteO3.setRadioatomico(0);
                componenteO3.setLista(listaElementosO3);
                
                // Componente SO2
                Componente componenteSO2 = new Componente();
                componenteSO2.setNombre("SO2");
                componenteSO2.setConcentracion(concentracionSO2);  // Dato simulador
                componenteSO2.setMasaatomica(Interface.MASAATOMICASO2);
                componenteSO2.setRadioatomico(0);
                componenteSO2.setLista(listaElementosSO2);


                //CREAR LISTA DE COMPONENTES
                ListaComponentes listaComponentes = new ListaComponentes();
                listaComponentes.agregarComponente(componenteNO2);
                listaComponentes.agregarComponente(componenteO3);
                listaComponentes.agregarComponente(componenteSO2);

                //CREAR Y CALCULAR ICA

                ICA ica = new ICA();
                ica.setPm10(pm10);  // Dato simulador
                ica.setPm25(pm25);  // Dato simulador
                ica.setLista(listaComponentes);

                // Calcular clasificación numérica del ICA
                float clasificacionICA = ica.calcularClasificacion_N();
                ica.setClasificacion_N(clasificacionICA);

                //CREAR AIRE CON DATOS DEL SIMULADOR


                Aire aire = new Aire();
                aire.setIca(ica);
                aire.setPPM_Co2(PPM);  // Dato simulador: ppm_Co2
                aire.setTemperatura(temperatura);  // Dato simulador: Temperatura

                // Calcular saturación de CO2
                float saturacionCO2 = aire.obtenerSaturacion_Co2();
                aire.setSaturacion_Co2(saturacionCO2);


                //CREAR CALIFICADOR Y CALCULAR CLASIFICACIONES

                Calificador calificador = new Calificador();
                calificador.setSaturacion_Co2(aire.getSaturacion_Co2());
                calificador.setClasificacion_n_ICA(ica.getClasificacion_N());

                // Calcular clasificación textual de CO2
                calificador.calcularClasificacionT_CO2();
                String clasificacionCO2 = calificador.getClasificacion_t_Co2();
                aire.setClasificacion_Co2(clasificacionCO2);
  

                // Calcular clasificación textual de ICA
                calificador.calcularClasificacionT_ICA();
                String clasificacionICATexto = calificador.getClasificacion_t_ICA();
                ica.setClasificacion_T(clasificacionICATexto);
  
                // Calcular clasificación total
                calificador.calcularClasificacion_t();
                String clasificacionTotal = calificador.getClasificacion_t();


                //CREAR LISTA DE RECOMENDACIONES
                ListaRecomendaciones recomendaciones = new ListaRecomendaciones();

                // Agregar recomendaciones según la clasificación
                if (clasificacionTotal.equals("Muy bueno")) {
                    recomendaciones.agregarRecomendaciones("Excelente calidad del aire. Disfrute de actividades al aire libre");
                    recomendaciones.agregarRecomendaciones("No hay restricciones para ningun grupo poblacional");
                    recomendaciones.agregarRecomendaciones("Unicamente personas con enfermedades cronicas respiratorias resguardarse");
                } else if (clasificacionTotal.equals("Bueno")) {
                    recomendaciones.agregarRecomendaciones("Calidad del aire aceptable para la mayoria.");
                    recomendaciones.agregarRecomendaciones("Personas sensibles deben considerar limitar actividades prolongadas al aire libre");
                    recomendaciones.agregarRecomendaciones("Personas no sensibles pueden realizar cualquier tipo de actividad física");
                } else if (clasificacionTotal.equals("Ligeramente Bueno")) {
                    recomendaciones.agregarRecomendaciones("Calidad de aire aceptable");
                    recomendaciones.agregarRecomendaciones("Personas sensibles niños y adultos mayores limitar actividades prolongadas al aire libre");
                    recomendaciones.agregarRecomendaciones("Cualquier otra persona puede realizar las actividad de forma normal");
                } else if (clasificacionTotal.equals("Ligeramente Malo")){
                    recomendaciones.agregarRecomendaciones("Calidad de aire no recomendada");
                    recomendaciones.agregarRecomendaciones("Evitar el uso de automoviles buses o cualquier medio de transporte contaminante");
                    recomendaciones.agregarRecomendaciones("Evitar la actividad fisica intensa y prolongada al aire libre");
                } else if (clasificacionTotal.equals("Malo") || clasificacionTotal.equals("Peligro")) {
                    recomendaciones.agregarRecomendaciones("Se recomienda no realizar ejercicio para nadie en la problacion");
                    recomendaciones.agregarRecomendaciones("Use mascarilla si debe salir");
                    recomendaciones.agregarRecomendaciones("Mantenga ventanas cerradas");
                } else {
                    recomendaciones.agregarRecomendaciones("Peligro inminente");
                    recomendaciones.agregarRecomendaciones("Se recomienda evacuar la zona");
                    recomendaciones.agregarRecomendaciones("Peligro de enfermedades respiratorias");
                }

                calificador.setListaRe(recomendaciones);

                //CREAR LUGAR CON DATOS DEL SIMULADOR   
 

                Lugar lugar = new Lugar();
                lugar.setID(id);  // Dato simulador: Id
                lugar.setPoblacion(poblacion);  // Dato simulador: Poblacion
                lugar.setUrbanización(urbanizacion);  // Dato simulador: Urbanizacion
                lugar.setClasificación(clasificacionTotal);
                lugar.setAire(aire);
                lugar.setListaRe(recomendaciones);
                
                // ALMACENAR TODOS LOS OBJETOS RESPECTIVO EN LA LISTA DE OBJETOS
                lob.agregarLugares(lugar);
                aob.agregarAires(aire);
                iob.agregarICAS(ica);
                caob.agregarRangos(calificador);
                eob.agregarComponente(elementoS);
                eob.agregarComponente(elementoO);
                eob.agregarComponente(elementoN);
                cob.agregarComponentes(componenteO3);
                cob.agregarComponentes(componenteNO2);
                cob.agregarComponentes(componenteSO2);
                }
            // CERRAR LA LECTURA DE ARCHIVOS CORRESPONDIENTE
            scanner.close();
            // CAPTURACIÓN DE ERRORES, (NECESARIA PARA UTILIZAR EL SCANNER)
            } catch (FileNotFoundException e) {
            System.err.println("Error fatal: Archivo '" + nombreArchivo + "' no encontrado.");
            return; // Termina la ejecución si no se puede leer el archivo
        } catch (NumberFormatException e) {
            System.err.println("Error de formato: Asegúrate de que los valores numéricos sean correctos y sin espacios extra.");
            return;
        }
        // MOSTRAR RESUMEN COMPLETO 
        // CREACION LISTA RESULTADOS DE LA LISTA OBJETOS
        ArrayList<Lugar> resultados = lob.obtenerRegistros();
        // EMPEZAMOS EL RESUMEN
        System.out.println ("RESUMEN DEL MONITOREO");
        // HACEMOS CICLO FOR PARA ENTRAR A CADA ELEMENTO DE LA LISTA 
        // Iterar sobre todos los objetos Lugar almacenados
        try {
            FileWriter registro = new FileWriter("Registro.txt");
            for (Lugar lugar : resultados) {
                Aire aire = lugar.getAire();
                ICA ica = aire.getICA();

                // Accedemos a los componentes a través de ICA (si ListaComponentes tiene un getter)
                // Aquí solo mostramos las métricas principales para simplificar el resumen.

                System.out.println("\n--- REGISTRO ID: " + lugar.getID() + " ---");
                System.out.println("Tipo/Poblacion: " + lugar.getUrbanización() + " (" + lugar.getPoblacion() + " millones de habitantes)");

                System.out.println("\nMEDICIONES");
                System.out.println("CO2: " + aire.getppm_Co2() + " ppm (" + String.format("%.2f", aire.getSaturacion_Co2()) + "%)");
                System.out.println("Temperatura: " + aire.getTemperatura() + " Celcius");
                System.out.println("PM10: " + ica.getPm10() + " ug/m | PM2.5: " + ica.getPm25() + " ug/m");

                System.out.println("\nCALIFICACIONES");
                System.out.println("ICA Numerico: " + String.format("%.2f", ica.getClasificacion_N()));
                System.out.println("ICA: " + ica.getClasificacion_T());
                System.out.println("CO2: " + aire.getClasificacion_Co2());
                System.out.println("CALIFICACION FINAL: " + lugar.getClasificación());


                ListaRecomendaciones recomendaciones = lugar.getListare();
                ArrayList<String> listare = recomendaciones.obtenerRecomendaciones();
                System.out.println("\nRecomendaciones");
                for (String rec: listare) {
                    System.out.println(rec);
                }
                registro.write(lugar.getID() + ",");
                registro.write(lugar.getUrbanización() + ",");
                registro.write(lugar.getPoblacion() + ",");
                registro.write(aire.getTemperatura() + ",");
                registro.write(ica.getClasificacion_T() + ",");
                registro.write(aire.getClasificacion_Co2() + ",");
                registro.write(lugar.getClasificación() + ",");
                for (String rec: listare){
                    registro.write(rec + ",");
                }
                registro.write("\n");   
        }
        registro.close();
        } catch (IOException e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
         
        
        System.out.println("\nMonitoreo completado exitosamente");
    }
    
}