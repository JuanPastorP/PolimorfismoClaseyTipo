#include<iostream>
#include<stdlib.h>

class Vivienda{
    private:
        String ubicacion;
        int metrosCuadrados;
        int pisos;
    
    public:
        Vivienda(String,int,int);
        virtual void verDatos();
};


class Casa : public Vivienda{
    private:
        String calle;
    
    public:
        Casa(String,int,int,String);
        void verDatos();
};

class Departamento : public Vivienda{
    private:
        int numeroPuerta;
	    int numeroPiso;
    
    public:
        Departamento(String,int,int,int,int);
        void verDatos();
};

class CasaCampo : public Vivienda{
    private:
        String calle;
        int metrosPatio;
    
    public:
        Casa(String,int,int,String,int);
        void verDatos();
};

Vivienda::Vivienda(String _ubicacion, int _metrosCuadrados, int _pisos){
    ubicacion = _ubicacion;
    metrosCuadrados = _metrosCuadrados;
    pisos = _pisos;
}

Casa::Casa(String _ubicacion, int _metrosCuadrados, int _pisos, String _calle) : Vivienda( _ubicacion, _metrosCuadrados, _pisos){
    calle = _calle;
}

Departamento::Departamento(String _ubicacion, int _metrosCuadrados, int _pisos, int _numeroPuerta, int _numeroPiso) : Vivienda( _ubicacion, _metrosCuadrados, _pisos){
    numeroPuerta = _numeroPuerta;
    numeroPiso = _numeroPiso;
}

CasaCampo::CasaCampo(String _ubicacion, int _metrosCuadrados, int _pisos, String _calle, int _metrosPatio) : Vivienda( _ubicacion, _metrosCuadrados, _pisos){
    calle = _calle;
    metrosPatio = _metrosPatio;
}

void Vivienda::verDatos(){
    std::cout << "Ubicacion: " << ubicacion << "\n";
    std::cout << "MetrosCuadrados: " << metrosCuadrados << "\n";
    std::cout << "Pisos: " << pisos << "\n";
}

void Casa::verDatos(){
    Vivienda::verDatos();
    std::cout << "Calle: " << calle << "\n";
}

void Departamento::verDatos(){
    Vivienda::verDatos();
    std::cout << "NumeroPuerta: " << numeroPuerta << "\n";
    std::cout << "NumeroPiso: " << numeroPiso << "\n";
}

void CasaCampo::verDatos(){
    Vivienda::verDatos();
    std::cout << "Calle: " << calle << "\n";
    std::cout << "MetrosPatio: " << metrosPatio << "\n";
    
}

int main(){
    Vivienda viviendas[3];
	viviendas[0] = new Departamento("LasCasonas", 20, 5, 3);
	viviendas[1] = new Casa("LasFlores", 40, 2, "CalleMagnolia");
	viviendas[2] = new CasaCampo("LasTorres", 40, 2, "CalleNueva", 50);

    viviendas[0].verDatos();
    viviendas[1].verDatos();
    viviendas[2].verDatos();

}