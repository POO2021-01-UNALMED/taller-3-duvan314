package taller3.televisores;

public class TV {

    public Marca marca;
    public int canal = 1;
    public int precio = 500;
    public boolean estado;
    public int volumen = 1;
    public Control control;
    static int numTV;


    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV ++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {

        if (canal>0 && canal <=120 & estado){
            this.canal = canal;
        }

    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if (volumen>=0 && volumen <= 7 && estado){
            this.volumen = volumen;
        }
    }

    public void setControl(Control control) {
        this.control = control;
    }


    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public boolean getEstado() {
        return estado;
    }



    public static  void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public void inicial() {
        this.canal = 1;
        this.volumen = 1;
    }

    public static int getNumTV() {
        return numTV;
    }


    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
        inicial();
    }

    public void canalUp() {
        if (canal < 120 && estado){
            canal += 1;
        }
    }
    public void canalDown() {
        if (canal > 1 && estado){
            canal -= 1;
        }
    }

    public void volumenUp() {
        if (volumen <7 && estado){
            volumen += 1;
        }
    }
    public void volumenDown() {
        if (volumen >0  && estado ){
            volumen -= 1;
        }
    }




}
