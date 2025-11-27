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
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class Window1 : Window
    {
        public Window1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {

        }

        private void TextBox_TextChanged(object sender, TextChangedEventArgs e)
        {
            App.DatoGlobal = Buscador.Text;
        }

        private void Buscador_GotFocus(object sender, RoutedEventArgs e)
        {
            if (Buscador.Text == "Search")
                Buscador.Text = "";
        }

        private void Buscador_LostFocus(object sender, RoutedEventArgs e)
        {
            if (Buscador.Text == "")
                Buscador.Text = "Search";
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {

        }
    }
}
