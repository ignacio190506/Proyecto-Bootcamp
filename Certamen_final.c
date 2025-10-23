#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    FILE *fptr;
    int cant_registros = 0;
    int opcion;
    int id = 0;
    char urba[] = "URBANO";
    char urba1[] = "RURAL";
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
                int urbanizacion = rand() % (2);
                int temperatura = rand() % (36);
                int poblacion = 1 + rand() % (10);
                int PPM = rand() % 501;
                float NO2 = (float) (rand() % (50100))/ 100.0;
                float O3 = (float) (rand() % (50100)) / 100.0;
                float PM10 = (float) (rand() % (50100)) / 100.0;
                float PM25 = (float) (rand() % (50100)) / 100.0;
                float SO2 = (float) (rand() % (50100)) / 100.0;
                if (urbanizacion == 0) {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urba);
                } else {
                    fprintf(fptr, "%.2f,%.2f,%.2f,%.2f,%.2f,%d,%d,%d,%d,%s\n",NO2,O3,SO2,PM10,PM25,id,temperatura,poblacion,PPM,urba1);
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