#include <iostream>
#include <vector>
#include <string>
#include "FuncionPolinomica.h"

using namespace std;

//Funcion para limpiar lo que hay en el vector
void LimpiarVector(vector<FuncionPolinomica*>);

int main()
{
  cout<<"*************************************************" << endl;
  cout<<"*Bienvenido al Programa de Funciones Polinomicas*" << endl;
  cout<<"*************************************************" << endl;
  string respuesta = "s";
  int opcion=0;
  vector<FuncionPolinomica*> funciones;
  vector<FuncionPolinomica*> operaciones;
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
    cout<<"*Ingrese una opcion: " ;
    cin>>opcion;
    while (opcion<1 || opcion>9){
      cout<<"*Error en la funcion" << endl;
      cout<<"*Ingrese una opcion: ";
      cin>> opcion;
    }
    //TODO: hacer la condiciones de opciones
    switch (opcion){
      case 1:{//Agregando funciones
        int n;
        cout<<"Ingrese un numero entre 2 y 5 para el grado de la funcion: ";
        cin>>n;
        while (n<2 || n>5){
          cout<<"Error en el grado" << endl,
          cout<<"Ingrese un numero entre 2 y 5 para el grado de la funcion: ";
          cin>>n;
        }
        FuncionPolinomica* funcion = new FuncionPolinomica(n);
        funcion->addCoeficientes();
        funciones.push_back(funcion);
        cout<< funcion << endl;
        cout<<"Se ha agregado una funcion" << endl;
        break;
      }
      case 2:{//Sumando funciones
        //Listando los indices de las funciones
        cout<<"*Funciones Polinomicas " << endl << endl;
        int suma1=0, suma2=0;
        for (int i=0; i < funciones.size(); i++){
          cout<<i << " " << funciones[i] << endl;
        }
        cout<<endl<<"*Ingrese un indice para la primer funcion: ";
        cin>>suma1;
        //validacion
        while (suma1<0 || suma1>funciones.size()-1){
          cout<<"*Error en el indice" << endl;
          cout<<"*Ingrese un indecie para la primer funcion: ";
          cin>>suma1;
        }
        cout<<"*Ingrese un indice para la segunda funcion: ";
        cin>>suma2;
        while (suma2<0 || suma2>funciones.size()-1){
          cout<<"Error en el indice" << endl;
          cout<<"Ingrese un indice para la segunda funcion: ";
          cin>>suma2;
        }
        FuncionPolinomica* f = *funciones[suma1] + funciones[suma2];
        cout<< f << endl;
        operaciones.push_back(f);
        break;
      }
      case 3:{//Restar funciones
        int resta1=0, resta2 = 0;
        cout<<"Funciones polinomicas" << endl << endl;
        for (int i=0; i < funciones.size(); i++){
          cout<<i << " " << funciones[i]  << endl;
        }
        cout<<endl<<"*Ingrese un indice para la primer funcion: ";
        cin>>resta1;
        //validacion
        while (resta1<0 || resta1>funciones.size()-1){
          cout<<"*Error en el indice" << endl;
          cout<<"*Ingrese un indecie para la primer funcion: ";
          cin>>resta1;
        }
        cout<<"*Ingrese un indice para la segunda funcion: ";
        cin>>resta2;
        while (resta2<0 || resta2>funciones.size()-1){
          cout<<"Error en el indice" << endl;
          cout<<"Ingrese un indice para la segunda funcion: ";
          cin>>resta2;
        }
        FuncionPolinomica* f = *funciones[resta1] - funciones[resta2];
        cout<< f << endl;
        operaciones.push_back(f);
        break;
      }
      case 4:{//Multiplicar funciones
        break;
      }
      case 5:{//Dividir funciones
        break;
      }
      case 6:{//factor comun de funciones
        int indice;
        cout<<"Funciones Polinomicas" << endl << endl;
        for (int i = 0; i<funciones.size(); i++){
          cout<< i <<" " << funciones[i];
        }
        cout<< endl << "Ingrese un indice para encontrar el factor comun: ";
        cin>>indice;
        while (indice<0 && indice>funciones.size()-1){
          cout<<"Error en el indice" << endl;
          cout<<"Ingrese un indice para encontrar el factor comun: ";
          cin>>indice;
        }
        ++(*funciones[indice]);
        cout<< endl;
        break;
      }
      case 7:{//Igualando dos funciones
        cout<<"Funciones Polinomicas" << endl;
        int igual1=0, igual2=0;
        for (int i=0; i<funciones.size(); i++){
          cout<< i << " " << funciones[i] << endl;
        }
        cout<< endl << "Ingrese un indice para la primera funcion: ";
        cin>>igual1;
        while (igual1<0 && igual1>funciones.size()-1){
          cout<<"Error en el indice" << endl;
          cout<<"Ingrese un indice para la primera funcion: ";
          cin>>igual1;
        }
        cout<<"Ingrese otro indice para la segunda funcion: ";
        cin>>igual2;
        while (igual2<0 || igual2>funciones.size()-1){
          cout<<"Error en el indice " << endl;
          cout<<"Ingrese otro indice para la segunda funcion: ";
          cin>>igual2;
        }
        *funciones[igual1]==funciones[igual2];
        cout<< endl;
        break;
      }
      case 8:{//Desigualdar dos funciones
        int desigual1=0, desigual2=0;
        for (int i=0; i<funciones.size(); i++){
          cout<< i << " "<< funciones[i] << endl;
        }
        cout<< endl << "Ingrese un indice para la primera funcion: ";
        cin>>desigual1;
        while (desigual1<0 && desigual1>funciones.size()-1){
          cout<<"Error en el indice" << endl;
          cout<<"Ingrese un indice para la primera funcion: ";
          cin>>desigual1;
        }
        cout<<"Ingrese otro indice para la segunda funcion: ";
        cin>>desigual2;
        while (desigual2<0 || desigual2>funciones.size()-1){
          cout<<"Error en el indice " << endl;
          cout<<"Ingrese otro indice para la segunda funcion: ";
          cin>>desigual2;
        }
        *funciones[desigual1]!=funciones[desigual2] ;
        cout<< endl;
        break;
      }
      case 9: {//Impresion de funciones
        cout<<"***********************"<< endl;
        cout<<"*FUNCIONES POLINOMICAS*" << endl;
        cout<<"***********************" << endl;
        for (int i=0; i<funciones.size(); i++){
          cout<< i << " " << funciones[i];
        }
        cout<< endl;
        break;
      }
    }
    cout<<"Desea continuar [s/n]: ";
    cin>>respuesta;
  }
  if (funciones.size()>-1){
    LimpiarVector(funciones);
  }
  if (operaciones.size()>-1){
    LimpiarVector(operaciones);
  }
  return 0;
}

void LimpiarVector(vector <FuncionPolinomica*> funcion)
{
  for(int i=0; i<funcion.size(); i++){
    delete funcion[i];
  }
  funcion.clear();
}
