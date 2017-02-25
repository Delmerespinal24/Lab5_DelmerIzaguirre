#ifndef FUNCIONPOLINOMICA_H_
#define FUNCIONPOLINOMICA_H_

#include <iostream>
#include <ostream>
#include <vector>

using namespace std;

class FuncionPolinomica
{
  friend ostream& operator<<(ostream& , FuncionPolinomica*);
private:
  int n;
  vector<int> coeficientes;
public:
  FuncionPolinomica();
  FuncionPolinomica(int);
  ~FuncionPolinomica();
  int getN();
  void setN(int);
  //Funcion de coeficientes
  void addCoeficientes();
  int getCoeficiente(int);
  void addCoeficiente(int);
  //Sobre carga de operadores
  FuncionPolinomica* operator+(FuncionPolinomica*);
  FuncionPolinomica* operator-(FuncionPolinomica*);
  FuncionPolinomica* operator*(FuncionPolinomica*);
  FuncionPolinomica* operator/(FuncionPolinomica*);
  void operator++();
  void operator==(FuncionPolinomica*);
  void operator!=(FuncionPolinomica*);
};

#endif
