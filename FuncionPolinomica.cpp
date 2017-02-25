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
      if (funcion->getN()>=i){
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
      if (n>=i){
        nuevoCoeficiente = this->getCoeficiente(i) + funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }else{
        nuevoCoeficiente = funcion->getCoeficiente(i);
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
      if (funcion->getN()>=i){
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
      if (n>=i){
        nuevoCoeficiente = this->getCoeficiente(i) - funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }else {
        nuevoCoeficiente = funcion->getCoeficiente(i);
        f->addCoeficiente(nuevoCoeficiente);
      }
    }
  }
  return f;
}

FuncionPolinomica* FuncionPolinomica::operator*(FuncionPolinomica* funcion)
{

}

FuncionPolinomica* FuncionPolinomica::operator/(FuncionPolinomica* funcion)
{

}

void FuncionPolinomica::operator()()
{
  bool comparacion;
  int factor=0;
  for (int i=0; i<=n; i++){
    for (int j=0; j<=n; i++){
      if (this->getCoeficiente(i)<=this->getCoeficiente(j)){
        comparacion=true;
      }else {
        comparacion=false;
        break;
      }
      if (comparacion==true){
        factor = this->getCoeficiente(i);
        break;
      }
    }
  }
  if (factor==0){
    cout<<"No hay factor comun" << endl;
  }else {
    bool verificador;
    for (int i=0; i<=n;i++){
      if (this->getCoeficiente(i)%factor==0){
        verificador = true;
      }else {
        verificador=false;
        break;
      }
    }
    if (verificador==true){
      cout<<"El factor comun es el numero " << factor << endl;
    }else {
      cout<<"No hay factor comun " << endl;
    }
  }

}

void FuncionPolinomica::operator==(FuncionPolinomica* funcion)
{
  if (n!=funcion->getN()){
    cout<<"Las funciones no son iguales";
  }else {
    bool comparador = true;
    for (int i=0; i<=n; i++){
      if (this->getCoeficiente(i)==funcion->getCoeficiente(i)){
        comparador = true;
      }else {
        comparador=false;
        break;
      }
    }
    if (comparador==true){
      cout<<"Las funciones son exactamente iguales ";
    }else {
      cout<<"Las funciones no son iguales";
    }
  }
}
void FuncionPolinomica::operator!=(FuncionPolinomica* funcion)
{
  if (n!=funcion->getN()){
    cout<<"Las funciones no son iguales";
  }else {
    bool comparador = true;
    for (int i=0; i<=n; i++){
      if (this->getCoeficiente(i)==funcion->getCoeficiente(i)){
        comparador=true;
      }else {
        comparador=false;
        break;
      }
    }
    if (comparador==true){
      cout<<"Las funciones son iguales";
    }else {
      cout<<"Las funciones son distintos";
    }
  }
}

ostream& operator<<(ostream& os,FuncionPolinomica* funcion)
{
  os << "F(x): ";
  for(int i=funcion->getN(); i>=0 ; i--){
    if (i!=0){
      os<< funcion->getCoeficiente(i) << "x^"<< i << " + " ;
    }
    else {
      os<< funcion->getCoeficiente(i);
    }
  }
  return os;
}
