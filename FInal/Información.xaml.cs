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
    public partial class Información : Window
    {
        public Información()
        {
            InitializeComponent();
        }

        private void btn_proposito_Click(object sender, RoutedEventArgs e)
        {
            Proposito.Visibility = Visibility.Visible;
        }

        private void btn_ofrecemos_Click(object sender, RoutedEventArgs e)
        {
            Ofrecemos.Visibility = Visibility.Visible;
        }

        private void btn_hicimos_Click(object sender, RoutedEventArgs e)
        {
            Hicimos.Visibility = Visibility.Visible;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            MainWindow ventana = new MainWindow();
            ventana.Show();
            this.Close();

        }
    }
}
