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

namespace FInal
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
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
            if (App.DatoGlobal == "Search")
            {
                mensaje.Content = "ERROR: Solo numeros";
            }
            else if (!int.TryParse(App.DatoGlobal, out _))
            {
                mensaje.Content = "ERROR: Solo numeros";
            }
            else
            {
                Window2 ventana = new Window2();
                ventana.Show();
                this.Close();
            }
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Información ventana = new Información();
            ventana.Show();
            this.Close();
        }
    }
}