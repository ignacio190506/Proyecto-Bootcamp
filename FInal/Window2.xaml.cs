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

namespace FInal
{

    public partial class Window2 : Window
    {
        public Window2()
        {
            InitializeComponent();
            id_Copiar.Content = App.DatoGlobal;
            CargarDatosDesdeTXT();
        }

        private void TextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            MainWindow ventana = new MainWindow();
            ventana.Show();
            this.Close();
        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {
            Información_2 ventana = new Información_2();
            ventana.Show();
            this.Close();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            Reomendaciones ventana = new Reomendaciones();
            ventana.Show();
            this.Close();
        }
        private void CargarDatosDesdeTXT()
        {
            string ruta = "C:\\Users\\ignac\\Documents\\NetBeansProjects\\Clases_trabajo\\Registro.txt"; // Si está en la misma carpeta del .exe

            if (!System.IO.File.Exists(ruta))
            {
                MessageBox.Show("No se encontró Registro.txt");
                return;
            }

            string[] lineas = System.IO.File.ReadAllLines(ruta);

            foreach (string linea in lineas)
            {
                string[] datos = linea.Split(',');
                if (datos.Length < 7) continue;

      
                if (datos[0] == App.DatoGlobal.ToString())
                {
       
                    urba.Content = datos[1];
                    po.Content = datos[2] + " (Mill)";
                    ta.Content = datos[3] + "°C";
                    ica.Content = datos[4];
                    co2.Content = datos[5];
                    cf.Content = datos[6];
                    re.Content = datos[7];

                    break;
                }
            }
        }

    }
}
