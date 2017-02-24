#include <iostream>
#include <vector>
#include <string>
#include "FuncionPolinomica.h"

using namespace std;

int main()
{
  cout<<"*************************************************" << endl;
  cout<<"*Bienvenido al Programa de Funciones Polinomicas*" << endl;
  cout<<"*************************************************" << endl;
  string respuesta = "s";
  int opcion=0;
  vector<FuncionPolinomica*> funciones;
  while (respuesta=="s"){
    cout<<"*MENU DE OPCIONES" << endl;
    cout<<"*1- Agregar funcion polinomica" << endl;
    cout<<"*2- Sumar funciones Polinomicas" << endl;
    cout<<"*3- Restar funciones polinomicas" << endl;
    cout<<"*4- Multiplicar funciones polinomicas" << endl;
    cout<<"*5- Dividir funciones polinomicas" << endl;
    cout<<"*6- Encontrar factor comun"<< endl;
    cout<<"*7- Igualar dos funciones " << endl;
    cout<<"*8- Desigualdar funciones" << endl;
    cout<<"*9- Imprimir las funciones" << endl;
    cout<<" Ingrese una opcion: " ;
    cin>>opcion;
    while (opcion<1 || opcion>9){
      cout<<"Error en la funcion" << endl;
      cout<<"Ingrese una opcion: ";
      cin>> opcion;
    }
    //TODO: hacer la condiciones de opciones
    switch (opcion){
      case 1:{//Agregando funciones
        int n;
        cout<<"Ingrese un numero para el grado de la funcion: ";
        cin>>n;
        FuncionPolinomica* funcion = new FuncionPolinomica(n);
        funcion->addCoeficientes();
        funciones.push_back(funcion);
        cout<<"Se ha agregado una funcion" << endl;
      }
      case 2:{//Sumando funciones

      }
      case 3:{//Restar funciones

      }
      case 4:{//Multiplicar funciones

      }
      case 5:{//Dividir funciones

      }
      case 6:{//factor comun de funciones

      }
      case 7:{//Igualando dos funciones

      }
      case 8:{//Desigualdar dos funciones

      }
      case 9: {//Impresion de funciones

      }
    }
    cout<<"Desea continuar [s/n]: ";
    cin>>respuesta;
  }
  return 0;
}
