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
