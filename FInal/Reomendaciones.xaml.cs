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
    /// <summary>
    /// Lógica de interacción para Reomendaciones.xaml
    /// </summary>
    public partial class Reomendaciones : Window
    {
        public Reomendaciones()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Window2 ventana = new Window2();
            ventana.Show();
            this.Close();
        }
    }
}
