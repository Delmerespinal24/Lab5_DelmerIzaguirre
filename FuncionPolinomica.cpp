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
  for(int i=0; i<n; i++){
    cout<<"Ingrese un numero: ";
    cin>>c;
    coeficientes.push_back(c);
  }
}

int FuncionPolinomica::getCoeficiente(int i)
{
  return coeficientes[i];
}

void FuncionPolinomica::setCoeficiente(int i, int c)
{
  coeficientes[i]=c;
}

FuncionPolinomica* FuncionPolinomica::operator+(FuncionPolinomica* funcion)
{

}
