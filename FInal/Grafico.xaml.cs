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
namespace FInal;

public partial class Grafico : Window
{
    public SeriesCollection SeriesCollection { get; set; }
    public string[] Labels { get; set; }

    public Grafico()
    {
        InitializeComponent();

        // Datos como los de tu gráfico
        Labels = new[]
        {
            "Peligro", "Malo", "Ligeramente malo",
            "Ligeramente bueno", "Bueno", "Muy bueno"
        };

        var valores = new[] { 3, 6, 7, 7, 5, 2 };

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
}