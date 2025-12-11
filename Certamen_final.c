#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    FILE *fptr;
    int cant_registros = 0;
    int opcion;
    int contador;
    int id = 0;
    char region1[] = "ARICA";
    char region2[] = "TARAPACA";
    char region3[] = "ANTOFAGASTA";
    char region4[] = "ATACAMA";
    char region5[] = "COQUIMBO";
    char region6[] = "VALPARAISO";
    char region7[] = "METROPOLITANA";
    char region8[] = "O'HIGGINS";
    char region9[] = "MAULE";
    char region10[] = "ÑUBLE";
    char region11[] = "BIOBIO";
    char region12[] = "ARAUCANIA";
    char region13[] = "LOS RIOS";
    char region14[] = "LOS LAGOS";
    char region15[] = "AYSEN";
    char region16[] = "MAGALLANES";
    fptr = fopen("Datos.txt", "w");
    srand(time(NULL));
    int i; 
    printf("Ingrese la opcion correspondiente \n");
    printf("1. Generar datos \n");
    printf("2. Salir \n");
    scanf("%d", &opcion);
    switch (opcion) {
        case 1:
            printf("Cuantos registros quieres: \n");
            scanf("%d", &cant_registros);   
            for (i = 1; i < (cant_registros + 1); i++) {
                id++;
                contador++;
                if (contador > 16) {
                    contador = 1;
                }
                int urbanizacion = rand() % (2);
                int temperatura = rand() % (36);
                int poblacion = 1 + rand() % (10);
                int PPM = rand() % 501;
                float NO2 = (float) (rand() % (50100))/ 100.0;
                float O3 = (float) (rand() % (50100)) / 100.0;
                float PM10 = (float) (rand() % (50100)) / 100.0;
                float PM25 = (float) (rand() % (50100)) / 100.0;
                float SO2 = (float) (rand() % (50100)) / 100.0;
                char urbaf[10]; 
                if (urbanizacion == 0) {
                    strcpy(urbaf, "URBANO");
                } else {
                    strcpy(urbaf,"RURAL");
                }
                if (contador == 1) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region1);
                }
                if (contador == 2) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region2);
                }
                if (contador == 3) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region3);
                }
                if (contador == 4) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region4);
                }
                if (contador == 5) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region5);
                }
                if (contador == 6) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region6);
                }
                if (contador == 7) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region7);
                }
                if (contador == 8) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region8);
                }
                if (contador == 9) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region9);
                }
                if (contador == 10) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region10);
                }
                if (contador == 11) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region11);
                }
                if (contador == 12) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region12);
                }
                if (contador == 13) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region13);
                }
                if (contador == 14) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region14);
                }
                if (contador == 15) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region15);
                }
                if (contador == 16) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urbaf,region16);
                }
            }
            break;
        case 2: 
            printf("Muchas Gracias\n");
            break;
        default:
            printf("Opcion incorrecta \n");
            break;
        fclose(fptr);
    }
    return 0;
}