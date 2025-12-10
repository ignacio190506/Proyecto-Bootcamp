using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using LiveCharts;
using LiveCharts.Wpf;
using System.IO;
namespace FInal;

public partial class Grafico : Window
{
    public SeriesCollection SeriesCollection { get; set; }
    public string[] Labels { get; set; }

    public Grafico()
    {
        InitializeComponent();

        Labels = new[]
        {
            "Peligro", "Malo", "Ligeramente malo",
            "Ligeramente bueno", "Bueno", "Muy bueno"
        };

        int[] valores = ContarClasificaciones("C:\\Users\\ignac\\Documents\\NetBeansProjects\\Clases_trabajo\\Registro.txt");

        SeriesCollection = new SeriesCollection
        {
            new ColumnSeries
            {
                Title = "Cant. de Lugares",
                Values = new ChartValues<int>(valores)
            }
        };

        DataContext = this;
    }

    private void Button_Click(object sender, RoutedEventArgs e)
    {
        MainWindow ventana = new MainWindow();
        ventana.Show();
        this.Close();
    }

    private int[] ContarClasificaciones(string ruta)
    {
        int peligro = 0;
        int malo = 0;
        int ligeramenteMalo = 0;
        int ligeramenteBueno = 0;
        int bueno = 0;
        int muyBueno = 0;

        if (!File.Exists(ruta))
            return new int[6]; 

        foreach (string linea in File.ReadLines(ruta))
        {
            if (string.IsNullOrWhiteSpace(linea))
                continue;

            string[] datos = linea.Split(',');

            if (datos.Length <= 6)
                continue;

            string clasificacion = datos[6].Trim().ToLower();

            switch (clasificacion)
            {
                case "peligro":
                    peligro++;
                    break;
                case "malo":
                    malo++;
                    break;
                case "ligeramente malo":
                    ligeramenteMalo++;
                    break;
                case "ligeramente bueno":
                    ligeramenteBueno++;
                    break;
                case "bueno":
                    bueno++;
                    break;
                case "muy bueno":
                    muyBueno++;
                    break;
            }
        }

        return new int[]
        {
            peligro,
            malo,
            ligeramenteMalo,
            ligeramenteBueno,
            bueno,
            muyBueno
        };
    }
}