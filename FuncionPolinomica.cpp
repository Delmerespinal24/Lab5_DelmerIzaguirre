#include "FuncionPolinomica.h"

FuncionPolinomica::FuncionPolinomica(){}

FuncionPolinomica::FuncionPolinomica(int p)
{
  n=p;
}

FuncionPolinomica::~FuncionPolinomica(){}

int FuncionPolinomica::getN()
{
  return n;
}

void FuncionPolinomica::setN(int p)
{
  n=p;
}

void FuncionPolinomica::addCoeficientes()
{
  int c;
  for(int i=0; i<=n; i++){
    cout<<"Ingrese un numero para el x^"  << i << ": ";
    cin>>c;
    coeficientes.push_back(c);
  }
}

int FuncionPolinomica::getCoeficiente(int i)
{
  return coeficientes[i];
}

void FuncionPolinomica::addCoeficiente(int c)
{
  coeficientes.push_back(c);
}

FuncionPolinomica* FuncionPolinomica::operator+(FuncionPolinomica* funcion)
{
  int potencia;
  FuncionPolinomica* f;
  int nuevoCoeficiente = 0;
  if (n>funcion->getN()){
    potencia=n;
    f = new FuncionPolinomica(potencia);
    for (int i=0; i<=potencia; i++){
      if (funcion->getN()>i){
        nuevoCoeficiente = this->getCoeficiente(i) + funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }else {
        nuevoCoeficiente = this->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }
    }
  }else if (n==funcion->getN()){
    potencia = n;
    f = new FuncionPolinomica(potencia);
    for (int i=0; i<=potencia; i++){
      nuevoCoeficiente = this->getCoeficiente(i) + funcion->getCoeficiente(i);
      f->addCoeficiente(nuevoCoeficiente);
    }
  }else if (n<funcion->getN()){
    potencia = funcion->getN();
    f = new FuncionPolinomica(potencia);
    for (int i=0; i<=potencia; i++){
      if (n>i){
        nuevoCoeficiente = this->getCoeficiente(i) + funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }else {
        nuevoCoeficiente = this->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }
    }
  }
  return f;
}

FuncionPolinomica* FuncionPolinomica::operator-(FuncionPolinomica* funcion)
{
  int potencia;
  FuncionPolinomica* f;
  int nuevoCoeficiente = 0;
  if (n>funcion->getN()){
    potencia=n;
    f = new FuncionPolinomica(potencia);
    for (int i=0; i<=potencia; i++){
      if (funcion->getN()>i){
        nuevoCoeficiente = this->getCoeficiente(i) - funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }else {
        nuevoCoeficiente = this->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }
    }
  }else if (n==funcion->getN()){
    potencia = n;
    f = new FuncionPolinomica(potencia);
    for (int i=0; i<=potencia; i++){
      nuevoCoeficiente = this->getCoeficiente(i) - funcion->getCoeficiente(i);
      f->addCoeficiente(nuevoCoeficiente);
    }
  }else if (n<funcion->getN()){
    potencia = funcion->getN();
    f = new FuncionPolinomica(potencia);
    for (int i=0; i<=potencia; i++){
      if (n>i){
        nuevoCoeficiente = this->getCoeficiente(i) - funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }else {
        nuevoCoeficiente = this->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }
    }
  }
  return f;
}
