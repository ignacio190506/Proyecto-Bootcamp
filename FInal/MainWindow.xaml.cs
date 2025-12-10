using System.Drawing.Text;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.IO;

namespace FInal
{

    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void TextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }
        private void Buscador_GotFocus(object sender, RoutedEventArgs e)
        {
            if (Buscador.Text == "Buscar...")
            {
                Buscador.Text = "";
            }
            if (mensaje.Content == "ERROR: Solo numeros")
            {
                mensaje.Content = "";
            }
            if (mensaje.Content == "ERROR: Archivo no encontrado")
            {
                mensaje.Content = "";
            }
            if (mensaje.Content == "ERROR: ID fuera de rango")
            {
                mensaje.Content = "";
            }
        }
        private void Buscador_LostFocus(object sender, RoutedEventArgs e)
        {
            if (string.IsNullOrWhiteSpace(Buscador.Text))
                Buscador.Text = "Buscar...";
        }

        private void TextBox_TextChanged_1(object sender, TextChangedEventArgs e)
        {

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Grafico ventana = new Grafico();
            ventana.Show();
            this.Close();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            App.DatoGlobal = Buscador.Text;
            if (App.DatoGlobal == "Buscar..." || string.IsNullOrWhiteSpace(App.DatoGlobal))
            {
                mensaje.Content = "ERROR: Solo numeros";
            }
            if (!int.TryParse(App.DatoGlobal, out int id))
            {
                mensaje.Content = "ERROR: Solo numeros";
                return;
            }
            string ruta = "C:\\Users\\ignac\\Documents\\NetBeansProjects\\Clases_trabajo\\Registro.txt";

            if (!File.Exists(ruta))
            {
                mensaje.Content = "ERROR: Archivo no encontrado";
                return;
            }

            int cantidadRegistros = File.ReadAllLines(ruta).Length;

            if (id < 1 || id > cantidadRegistros)
            {
                mensaje.Content = "ERROR: ID fuera de rango";
                return;
            }

            Window2 ventana = new Window2();
            ventana.Show();
            this.Close();
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Información ventana = new Información();
            ventana.Show();
            this.Close();
        }
    }
}