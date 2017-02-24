#ifndef FUNCIONPOLINOMICA_H_
#define FUNCIONPOLINOMICA_H_

#include <iostream>
#include <vector>

using namespace std;

class FuncionPolinomica
{
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
  void setCoeficiente(int, int);
  //Sobre carga de operadores
  FuncionPolinomica* operator+(FuncionPolinomica*);
  FuncionPolinomica* operator-(FuncionPolinomica*);
  FuncionPolinomica* operator*(FuncionPolinomica*);
  FuncionPolinomica* operator/(FuncionPolinomica*);
  FuncionPolinomica* operator()(FuncionPolinomica*);
  void operator==(FuncionPolinomica*);
  void operator!=(FuncionPolinomica*);
  void operator<<(FuncionPolinomica*);
};
#endif
