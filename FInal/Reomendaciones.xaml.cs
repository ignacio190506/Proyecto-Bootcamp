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
    public partial class Reomendaciones : Window
    {
        public Reomendaciones()
        { 
            InitializeComponent();
            CargarDatosDesdeTXT();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Window2 ventana = new Window2();
            ventana.Show();
            this.Close();
        }

        private void CargarDatosDesdeTXT()
        {
            string ruta = "C:\\Users\\ignac\\Documents\\NetBeansProjects\\Clases_trabajo\\Registro.txt"; 

            if (!System.IO.File.Exists(ruta))
            {
                MessageBox.Show("No se encontró Registro.txt");
                return;
            }

            string[] lineas = System.IO.File.ReadAllLines(ruta);

            foreach (string linea in lineas)
            {
                string[] datos = linea.Split(',');
                if (datos.Length < 8) continue;


                if (datos[0] == App.DatoGlobal.ToString())
                {
            
                    Recomendación_1.Content = datos[8];
                    Recomendación_2.Content = datos[9];
                    Recomendación_3.Content = datos[10];

                    break;
                }
            }
        }
    }
}