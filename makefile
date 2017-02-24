main:	FuncionPolinomica.o main.o
	g++ FuncionPolinomica.o main.o -o main

main.o:	FuncionPolinomica.h main.cpp
	g++ -c main.cpp

FuncionPolinomica.o:	FuncionPolinomica.h FuncionPolinomica.cpp
	g++ -c FuncionPolinomica.cpp
